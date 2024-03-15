@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * A special type of `ContainerImage` that uses an ECR repository for the image, but a
 * CloudFormation Parameter for the tag of the image in that repository.
 *
 * This allows providing this tag through the Parameter at deploy time,
 * for example in a CodePipeline that pushes a new tag of the image to the repository during a build
 * step,
 * and then provides that new tag through the CloudFormation Parameter in the deploy step.
 *
 * Example:
 *
 * ```
 * / **
 * * These are the construction properties for `EcsAppStack`.
 * * They extend the standard Stack properties,
 * * but also require providing the ContainerImage that the service will use.
 * * That Image will be provided from the Stack containing the CodePipeline.
 * *&#47;
 * public class EcsAppStackProps extends StackProps {
 * private ContainerImage image;
 * public ContainerImage getImage() {
 * return this.image;
 * }
 * public EcsAppStackProps image(ContainerImage image) {
 * this.image = image;
 * return this;
 * }
 * }
 * / **
 * * This is the Stack containing a simple ECS Service that uses the provided ContainerImage.
 * *&#47;
 * public class EcsAppStack extends Stack {
 * public EcsAppStack(Construct scope, String id, EcsAppStackProps props) {
 * super(scope, id, props);
 * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TaskDefinition")
 * .compatibility(Compatibility.FARGATE)
 * .cpu("1024")
 * .memoryMiB("2048")
 * .build();
 * taskDefinition.addContainer("AppContainer", ContainerDefinitionOptions.builder()
 * .image(props.getImage())
 * .build());
 * FargateService.Builder.create(this, "EcsService")
 * .taskDefinition(taskDefinition)
 * .cluster(Cluster.Builder.create(this, "Cluster")
 * .vpc(Vpc.Builder.create(this, "Vpc")
 * .maxAzs(1)
 * .build())
 * .build())
 * .build();
 * }
 * }
 * / **
 * * This is the Stack containing the CodePipeline definition that deploys an ECS Service.
 * *&#47;
 * public class PipelineStack extends Stack {
 * public final TagParameterContainerImage tagParameterContainerImage;
 * public PipelineStack(Construct scope, String id) {
 * this(scope, id, null);
 * }
 * public PipelineStack(Construct scope, String id, StackProps props) {
 * super(scope, id, props);
 * / * ********** ECS part **************** *&#47;
 * // this is the ECR repository where the built Docker image will be pushed
 * Repository appEcrRepo = new Repository(this, "EcsDeployRepository");
 * // the build that creates the Docker image, and pushes it to the ECR repo
 * PipelineProject appCodeDockerBuild = PipelineProject.Builder.create(this,
 * "AppCodeDockerImageBuildAndPushProject")
 * .environment(BuildEnvironment.builder()
 * // we need to run Docker
 * .privileged(true)
 * .build())
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "build", Map.of(
 * "commands", List.of("$(aws ecr get-login --region $AWS_DEFAULT_REGION --no-include-email)",
 * "docker build -t $REPOSITORY_URI:$CODEBUILD_RESOLVED_SOURCE_VERSION .")),
 * "post_build", Map.of(
 * "commands", List.of("docker push $REPOSITORY_URI:$CODEBUILD_RESOLVED_SOURCE_VERSION", "export
 * imageTag=$CODEBUILD_RESOLVED_SOURCE_VERSION"))),
 * "env", Map.of(
 * // save the imageTag environment variable as a CodePipeline Variable
 * "exported-variables", List.of("imageTag")))))
 * .environmentVariables(Map.of(
 * "REPOSITORY_URI", BuildEnvironmentVariable.builder()
 * .value(appEcrRepo.getRepositoryUri())
 * .build()))
 * .build();
 * // needed for `docker push`
 * appEcrRepo.grantPullPush(appCodeDockerBuild);
 * // create the ContainerImage used for the ECS application Stack
 * this.tagParameterContainerImage = new TagParameterContainerImage(appEcrRepo);
 * PipelineProject cdkCodeBuild = PipelineProject.Builder.create(this, "CdkCodeBuildProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "install", Map.of(
 * "commands", List.of("npm install")),
 * "build", Map.of(
 * "commands", List.of("npx cdk synth --verbose"))),
 * "artifacts", Map.of(
 * // store the entire Cloud Assembly as the output artifact
 * "base-directory", "cdk.out",
 * "files", "**&#47;*"))))
 * .build();
 * / * ********** Pipeline part **************** *&#47;
 * Artifact appCodeSourceOutput = new Artifact();
 * Artifact cdkCodeSourceOutput = new Artifact();
 * Artifact cdkCodeBuildOutput = new Artifact();
 * CodeBuildAction appCodeBuildAction = CodeBuildAction.Builder.create()
 * .actionName("AppCodeDockerImageBuildAndPush")
 * .project(appCodeDockerBuild)
 * .input(appCodeSourceOutput)
 * .build();
 * Pipeline.Builder.create(this, "CodePipelineDeployingEcsApplication")
 * .artifactBucket(Bucket.Builder.create(this, "ArtifactBucket")
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build())
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(
 * // this is the Action that takes the source of your application code
 * CodeCommitSourceAction.Builder.create()
 * .actionName("AppCodeSource")
 * .repository(Repository.Builder.create(this,
 * "AppCodeSourceRepository").repositoryName("AppCodeSourceRepository").build())
 * .output(appCodeSourceOutput)
 * .build(),
 * // this is the Action that takes the source of your CDK code
 * // (which would probably include this Pipeline code as well)
 * CodeCommitSourceAction.Builder.create()
 * .actionName("CdkCodeSource")
 * .repository(Repository.Builder.create(this,
 * "CdkCodeSourceRepository").repositoryName("CdkCodeSourceRepository").build())
 * .output(cdkCodeSourceOutput)
 * .build()))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(appCodeBuildAction,
 * CodeBuildAction.Builder.create()
 * .actionName("CdkCodeBuildAndSynth")
 * .project(cdkCodeBuild)
 * .input(cdkCodeSourceOutput)
 * .outputs(List.of(cdkCodeBuildOutput))
 * .build()))
 * .build(), StageProps.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * CloudFormationCreateUpdateStackAction.Builder.create()
 * .actionName("CFN_Deploy")
 * .stackName("SampleEcsStackDeployedFromCodePipeline")
 * // this name has to be the same name as used below in the CDK code for the application Stack
 * .templatePath(cdkCodeBuildOutput.atPath("EcsStackDeployedInPipeline.template.json"))
 * .adminPermissions(true)
 * .parameterOverrides(Map.of(
 * // read the tag pushed to the ECR repository from the CodePipeline Variable saved by the
 * application build step,
 * // and pass it as the CloudFormation Parameter for the tag
 * this.tagParameterContainerImage.getTagParameterName(), appCodeBuildAction.variable("imageTag")))
 * .build()))
 * .build()))
 * .build();
 * }
 * }
 * App app = new App();
 * // the CodePipeline Stack needs to be created first
 * PipelineStack pipelineStack = new PipelineStack(app, "aws-cdk-pipeline-ecs-separate-sources");
 * // we supply the image to the ECS application Stack from the CodePipeline Stack
 * // we supply the image to the ECS application Stack from the CodePipeline Stack
 * new EcsAppStack(app, "EcsStackDeployedInPipeline", new EcsAppStackProps()
 * .image(pipelineStack.getTagParameterContainerImage())
 * );
 * ```
 *
 * [Documentation]( #tagParameterName)
 */
public open class TagParameterContainerImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.TagParameterContainerImage,
) : ContainerImage(cdkObject) {
  public constructor(repository: IRepository) :
      this(software.amazon.awscdk.services.ecs.TagParameterContainerImage(IRepository.unwrap(repository)))

  /**
   * Called when the image is used by a ContainerDefinition.
   *
   * @param scope 
   * @param containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      ContainerImageConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(ContainerImageConfig::wrap)

  /**
   * Returns the name of the CloudFormation Parameter that represents the tag of the image in the
   * ECR repository.
   */
  public open fun tagParameterName(): String = unwrap(this).getTagParameterName()

  /**
   * Returns the value of the CloudFormation Parameter that represents the tag of the image in the
   * ECR repository.
   */
  public open fun tagParameterValue(): String = unwrap(this).getTagParameterValue()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TagParameterContainerImage):
        TagParameterContainerImage = TagParameterContainerImage(cdkObject)

    internal fun unwrap(wrapped: TagParameterContainerImage):
        software.amazon.awscdk.services.ecs.TagParameterContainerImage = wrapped.cdkObject
  }
}
