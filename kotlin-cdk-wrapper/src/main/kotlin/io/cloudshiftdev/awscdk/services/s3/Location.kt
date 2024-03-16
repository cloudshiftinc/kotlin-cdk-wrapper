@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * An interface that represents the location of a specific object in an S3 Bucket.
 *
 * Example:
 *
 * ```
 * Stack lambdaStack = new Stack(app, "LambdaStack");
 * CfnParametersCode lambdaCode = Code.fromCfnParameters();
 * Function.Builder.create(lambdaStack, "Lambda")
 * .code(lambdaCode)
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_LATEST)
 * .build();
 * // other resources that your Lambda needs, added to the lambdaStack...
 * Stack pipelineStack = new Stack(app, "PipelineStack");
 * Pipeline pipeline = Pipeline.Builder.create(pipelineStack, "Pipeline")
 * .crossAccountKeys(true)
 * .build();
 * // add the source code repository containing this code to your Pipeline,
 * // and the source code of the Lambda Function, if they're separate
 * Artifact cdkSourceOutput = new Artifact();
 * CodeCommitSourceAction cdkSourceAction = CodeCommitSourceAction.Builder.create()
 * .repository(Repository.Builder.create(pipelineStack, "CdkCodeRepo")
 * .repositoryName("CdkCodeRepo")
 * .build())
 * .actionName("CdkCode_Source")
 * .output(cdkSourceOutput)
 * .build();
 * Artifact lambdaSourceOutput = new Artifact();
 * CodeCommitSourceAction lambdaSourceAction = CodeCommitSourceAction.Builder.create()
 * .repository(Repository.Builder.create(pipelineStack, "LambdaCodeRepo")
 * .repositoryName("LambdaCodeRepo")
 * .build())
 * .actionName("LambdaCode_Source")
 * .output(lambdaSourceOutput)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Source")
 * .actions(List.of(cdkSourceAction, lambdaSourceAction))
 * .build());
 * // synthesize the Lambda CDK template, using CodeBuild
 * // the below values are just examples, assuming your CDK code is in TypeScript/JavaScript -
 * // adjust the build environment and/or commands accordingly
 * Project cdkBuildProject = Project.Builder.create(pipelineStack, "CdkBuildProject")
 * .environment(BuildEnvironment.builder()
 * .buildImage(LinuxBuildImage.STANDARD_7_0)
 * .build())
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "install", Map.of(
 * "commands", "npm install"),
 * "build", Map.of(
 * "commands", List.of("npm run build", "npm run cdk synth LambdaStack -- -o ."))),
 * "artifacts", Map.of(
 * "files", "LambdaStack.template.yaml"))))
 * .build();
 * Artifact cdkBuildOutput = new Artifact();
 * CodeBuildAction cdkBuildAction = CodeBuildAction.Builder.create()
 * .actionName("CDK_Build")
 * .project(cdkBuildProject)
 * .input(cdkSourceOutput)
 * .outputs(List.of(cdkBuildOutput))
 * .build();
 * // build your Lambda code, using CodeBuild
 * // again, this example assumes your Lambda is written in TypeScript/JavaScript -
 * // make sure to adjust the build environment and/or commands if they don't match your specific
 * situation
 * Project lambdaBuildProject = Project.Builder.create(pipelineStack, "LambdaBuildProject")
 * .environment(BuildEnvironment.builder()
 * .buildImage(LinuxBuildImage.STANDARD_7_0)
 * .build())
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "install", Map.of(
 * "commands", "npm install"),
 * "build", Map.of(
 * "commands", "npm run build")),
 * "artifacts", Map.of(
 * "files", List.of("index.js", "node_modules/ **&#47;*")))))
 * .build();
 * Artifact lambdaBuildOutput = new Artifact();
 * CodeBuildAction lambdaBuildAction = CodeBuildAction.Builder.create()
 * .actionName("Lambda_Build")
 * .project(lambdaBuildProject)
 * .input(lambdaSourceOutput)
 * .outputs(List.of(lambdaBuildOutput))
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Build")
 * .actions(List.of(cdkBuildAction, lambdaBuildAction))
 * .build());
 * // finally, deploy your Lambda Stack
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * CloudFormationCreateUpdateStackAction.Builder.create()
 * .actionName("Lambda_CFN_Deploy")
 * .templatePath(cdkBuildOutput.atPath("LambdaStack.template.yaml"))
 * .stackName("LambdaStackDeployedName")
 * .adminPermissions(true)
 * .parameterOverrides(lambdaCode.assign(lambdaBuildOutput.getS3Location()))
 * .extraInputs(List.of(lambdaBuildOutput))
 * .build()))
 * .build());
 * ```
 */
public interface Location {
  /**
   * The name of the S3 Bucket the object is in.
   */
  public fun bucketName(): String

  /**
   * The path inside the Bucket where the object is located at.
   */
  public fun objectKey(): String

  /**
   * The S3 object version.
   */
  public fun objectVersion(): String? = unwrap(this).getObjectVersion()

  /**
   * A builder for [Location]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName The name of the S3 Bucket the object is in. 
     */
    public fun bucketName(bucketName: String)

    /**
     * @param objectKey The path inside the Bucket where the object is located at. 
     */
    public fun objectKey(objectKey: String)

    /**
     * @param objectVersion The S3 object version.
     */
    public fun objectVersion(objectVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Location.Builder =
        software.amazon.awscdk.services.s3.Location.builder()

    /**
     * @param bucketName The name of the S3 Bucket the object is in. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param objectKey The path inside the Bucket where the object is located at. 
     */
    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    /**
     * @param objectVersion The S3 object version.
     */
    override fun objectVersion(objectVersion: String) {
      cdkBuilder.objectVersion(objectVersion)
    }

    public fun build(): software.amazon.awscdk.services.s3.Location = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.Location,
  ) : CdkObject(cdkObject), Location {
    /**
     * The name of the S3 Bucket the object is in.
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * The path inside the Bucket where the object is located at.
     */
    override fun objectKey(): String = unwrap(this).getObjectKey()

    /**
     * The S3 object version.
     */
    override fun objectVersion(): String? = unwrap(this).getObjectVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Location {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Location): Location =
        CdkObjectWrappers.wrap(cdkObject) as Location

    internal fun unwrap(wrapped: Location): software.amazon.awscdk.services.s3.Location = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.s3.Location
  }
}
