@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnParameter
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.Location
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Lambda code defined using 2 CloudFormation parameters.
 *
 * Useful when you don't have access to the code of your Lambda from your CDK code, so you can't use
 * Assets,
 * and you want to deploy the Lambda in a CodePipeline, using CloudFormation Actions -
 * you can fill the parameters using the `#assign` method.
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
public open class CfnParametersCode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCode,
) : Code(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.lambda.CfnParametersCode()
  )

  public constructor(props: CfnParametersCodeProps) :
      this(software.amazon.awscdk.services.lambda.CfnParametersCode(props.let(CfnParametersCodeProps::unwrap))
  )

  public constructor(props: CfnParametersCodeProps.Builder.() -> Unit) :
      this(CfnParametersCodeProps(props)
  )

  /**
   * Create a parameters map from this instance's CloudFormation parameters.
   *
   * It returns a map with 2 keys that correspond to the names of the parameters defined in this
   * Lambda code,
   * and as values it contains the appropriate expressions pointing at the provided S3 location
   * (most likely, obtained from a CodePipeline Artifact by calling the `artifact.s3Location`
   * method).
   * The result should be provided to the CloudFormation Action
   * that is deploying the Stack that the Lambda with this code is part of,
   * in the `parameterOverrides` property.
   *
   * @param location the location of the object in S3 that represents the Lambda code. 
   */
  public open fun assign(location: Location): Map<String, Any> =
      unwrap(this).assign(location.let(Location::unwrap)) ?: emptyMap()

  /**
   * Create a parameters map from this instance's CloudFormation parameters.
   *
   * It returns a map with 2 keys that correspond to the names of the parameters defined in this
   * Lambda code,
   * and as values it contains the appropriate expressions pointing at the provided S3 location
   * (most likely, obtained from a CodePipeline Artifact by calling the `artifact.s3Location`
   * method).
   * The result should be provided to the CloudFormation Action
   * that is deploying the Stack that the Lambda with this code is part of,
   * in the `parameterOverrides` property.
   *
   * @param location the location of the object in S3 that represents the Lambda code. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("763bde8316faa202313b1726887e0e19b556f1a821ee54d3e2ebf1d920950e12")
  public open fun assign(location: Location.Builder.() -> Unit): Map<String, Any> =
      assign(Location(location))

  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param scope 
   */
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  /**
   *
   */
  public open fun bucketNameParam(): String = unwrap(this).getBucketNameParam()

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  /**
   *
   */
  public open fun objectKeyParam(): String = unwrap(this).getObjectKeyParam()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnParametersCode].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
     * will be located in.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
     * where the Lambda code will be located in. 
     */
    public fun bucketNameParam(bucketNameParam: CfnParameter)

    /**
     * The CloudFormation parameter that represents the path inside the S3 Bucket where the Lambda
     * code will be located at.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
     * Bucket where the Lambda code will be located at. 
     */
    public fun objectKeyParam(objectKeyParam: CfnParameter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnParametersCode.Builder =
        software.amazon.awscdk.services.lambda.CfnParametersCode.Builder.create()

    /**
     * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
     * will be located in.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
     * where the Lambda code will be located in. 
     */
    override fun bucketNameParam(bucketNameParam: CfnParameter) {
      cdkBuilder.bucketNameParam(bucketNameParam.let(CfnParameter::unwrap))
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
     * Bucket where the Lambda code will be located at. 
     */
    override fun objectKeyParam(objectKeyParam: CfnParameter) {
      cdkBuilder.objectKeyParam(objectKeyParam.let(CfnParameter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnParametersCode =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParametersCode {
      val builderImpl = BuilderImpl()
      return CfnParametersCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCode):
        CfnParametersCode = CfnParametersCode(cdkObject)

    internal fun unwrap(wrapped: CfnParametersCode):
        software.amazon.awscdk.services.lambda.CfnParametersCode = wrapped.cdkObject
  }
}
