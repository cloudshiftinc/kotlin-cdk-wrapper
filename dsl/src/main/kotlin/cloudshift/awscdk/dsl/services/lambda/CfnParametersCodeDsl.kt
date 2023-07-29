@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnParameter
import software.amazon.awscdk.services.lambda.CfnParametersCode

/**
 * Lambda code defined using 2 CloudFormation parameters.
 *
 * Useful when you don't have access to the code of your Lambda from your CDK code, so you can't use
 * Assets, and you want to deploy the Lambda in a CodePipeline, using CloudFormation Actions - you
 * can fill the parameters using the `#assign` method.
 *
 * Example:
 * ```
 * Stack lambdaStack = new Stack(app, "LambdaStack");
 * CfnParametersCode lambdaCode = Code.fromCfnParameters();
 * Function.Builder.create(lambdaStack, "Lambda")
 * .code(lambdaCode)
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_14_X)
 * .build();
 * // other resources that your Lambda needs, added to the lambdaStack...
 * Stack pipelineStack = new Stack(app, "PipelineStack");
 * Pipeline pipeline = new Pipeline(pipelineStack, "Pipeline");
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
 * .buildImage(LinuxBuildImage.UBUNTU_14_04_NODEJS_10_1_0)
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
 * .buildImage(LinuxBuildImage.UBUNTU_14_04_NODEJS_10_1_0)
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
@CdkDslMarker
public class CfnParametersCodeDsl {
    private val cdkBuilder: CfnParametersCode.Builder = CfnParametersCode.Builder.create()

    /**
     * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
     * will be located in.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
     *   where the Lambda code will be located in.
     */
    public fun bucketNameParam(bucketNameParam: CfnParameter) {
        cdkBuilder.bucketNameParam(bucketNameParam)
    }

    /**
     * The CloudFormation parameter that represents the path inside the S3 Bucket where the Lambda
     * code will be located at.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
     *   Bucket where the Lambda code will be located at.
     */
    public fun objectKeyParam(objectKeyParam: CfnParameter) {
        cdkBuilder.objectKeyParam(objectKeyParam)
    }

    public fun build(): CfnParametersCode = cdkBuilder.build()
}
