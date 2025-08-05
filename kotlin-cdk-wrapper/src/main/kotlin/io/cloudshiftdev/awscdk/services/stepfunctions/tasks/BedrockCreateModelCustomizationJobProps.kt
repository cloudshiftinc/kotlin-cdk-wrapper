@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.bedrock.IModel
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for invoking a Bedrock Model.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * IBucket outputBucket;
 * IBucket trainingBucket;
 * IBucket validationBucket;
 * IKey kmsKey;
 * IVpc vpc;
 * FoundationModel model = FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1);
 * BedrockCreateModelCustomizationJob task = BedrockCreateModelCustomizationJob.Builder.create(this,
 * "CreateModelCustomizationJob")
 * .baseModel(model)
 * .clientRequestToken("MyToken")
 * .customizationType(CustomizationType.FINE_TUNING)
 * .customModelKmsKey(kmsKey)
 * .customModelName("MyCustomModel") // required
 * .customModelTags(List.of(CustomModelTag.builder().key("key1").value("value1").build()))
 * .hyperParameters(Map.of(
 * "batchSize", "10"))
 * .jobName("MyCustomizationJob") // required
 * .jobTags(List.of(CustomModelTag.builder().key("key2").value("value2").build()))
 * .outputData(OutputBucketConfiguration.builder()
 * .bucket(outputBucket) // required
 * .path("output-data/")
 * .build())
 * .trainingData(TrainingBucketConfiguration.builder()
 * .bucket(trainingBucket)
 * .path("training-data/data.json")
 * .build()) // required
 * // If you don't provide validation data, you have to specify `Evaluation percentage`
 * hyperparameter.
 * .validationData(List.of(ValidationBucketConfiguration.builder()
 * .bucket(validationBucket)
 * .path("validation-data/data.json")
 * .build()))
 * .vpcConfig(Map.of(
 * "securityGroups", List.of(SecurityGroup.Builder.create(this, "SecurityGroup").vpc(vpc).build()),
 * "subnets", vpc.getPrivateSubnets()))
 * .build();
 * ```
 */
public interface BedrockCreateModelCustomizationJobProps : TaskStateBaseProps {
  /**
   * The base model.
   */
  public fun baseModel(): IModel

  /**
   * A unique, case-sensitive identifier to ensure that the API request completes no more than one
   * time.
   *
   * If this token matches a previous request, Amazon Bedrock ignores the request, but does not
   * return an error.
   *
   * The maximum length is 256 characters.
   *
   * Default: - no client request token
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html)
   */
  public fun clientRequestToken(): String? = unwrap(this).getClientRequestToken()

  /**
   * The custom model is encrypted at rest using this key.
   *
   * Default: - encrypted with the AWS owned key
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/encryption-custom-job.html)
   */
  public fun customModelKmsKey(): IKey? = unwrap(this).getCustomModelKmsKey()?.let(IKey::wrap)

  /**
   * A name for the resulting custom model.
   *
   * The maximum length is 63 characters.
   */
  public fun customModelName(): String

  /**
   * Tags to attach to the resulting custom model.
   *
   * The maximum number of tags is 200.
   *
   * Default: - no tags
   */
  public fun customModelTags(): List<CustomModelTag> =
      unwrap(this).getCustomModelTags()?.map(CustomModelTag::wrap) ?: emptyList()

  /**
   * The customization type.
   *
   * Default: FINE_TUNING
   */
  public fun customizationType(): CustomizationType? =
      unwrap(this).getCustomizationType()?.let(CustomizationType::wrap)

  /**
   * Parameters related to tuning the model.
   *
   * Default: - use default hyperparameters
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html)
   */
  public fun hyperParameters(): Map<String, String> = unwrap(this).getHyperParameters() ?:
      emptyMap()

  /**
   * A name for the fine-tuning job.
   *
   * The maximum length is 63 characters.
   */
  public fun jobName(): String

  /**
   * Tags to attach to the job.
   *
   * The maximum number of tags is 200.
   *
   * Default: - no tags
   */
  public fun jobTags(): List<CustomModelTag> = unwrap(this).getJobTags()?.map(CustomModelTag::wrap)
      ?: emptyList()

  /**
   * The S3 bucket configuration where the output data is stored.
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_OutputDataConfig.html)
   */
  public fun outputData(): OutputBucketConfiguration

  /**
   * The IAM role that Amazon Bedrock can assume to perform tasks on your behalf.
   *
   * For example, during model training, Amazon Bedrock needs your permission to read input data
   * from an S3 bucket,
   * write model artifacts to an S3 bucket.
   * To pass this role to Amazon Bedrock, the caller of this API must have the iam:PassRole
   * permission.
   *
   * Default: - use auto generated role
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The S3 bucket configuration where the training data is stored.
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_TrainingDataConfig.html)
   */
  public fun trainingData(): TrainingBucketConfiguration

  /**
   * The S3 bucket configuration where the validation data is stored.
   *
   * If you don't provide a validation dataset, specify the evaluation percentage by the `Evaluation
   * percentage` hyperparameter.
   *
   * The maximum number is 10.
   *
   * Default: undefined - validate using a subset of the training data
   *
   * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_Validator.html)
   */
  public fun validationData(): List<ValidationBucketConfiguration> =
      unwrap(this).getValidationData()?.map(ValidationBucketConfiguration::wrap) ?: emptyList()

  /**
   * The VPC configuration.
   *
   * Default: - no VPC configuration
   */
  public fun vpcConfig(): IBedrockCreateModelCustomizationJobVpcConfig? =
      unwrap(this).getVpcConfig()?.let(IBedrockCreateModelCustomizationJobVpcConfig::wrap)

  /**
   * A builder for [BedrockCreateModelCustomizationJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param baseModel The base model. 
     */
    public fun baseModel(baseModel: IModel)

    /**
     * @param clientRequestToken A unique, case-sensitive identifier to ensure that the API request
     * completes no more than one time.
     * If this token matches a previous request, Amazon Bedrock ignores the request, but does not
     * return an error.
     *
     * The maximum length is 256 characters.
     */
    public fun clientRequestToken(clientRequestToken: String)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba662d0ff97a3e9f09e4ec71f9b800f7728d3a1492e81743a4392ddfcb09fb54")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param customModelKmsKey The custom model is encrypted at rest using this key.
     */
    public fun customModelKmsKey(customModelKmsKey: IKey)

    /**
     * @param customModelName A name for the resulting custom model. 
     * The maximum length is 63 characters.
     */
    public fun customModelName(customModelName: String)

    /**
     * @param customModelTags Tags to attach to the resulting custom model.
     * The maximum number of tags is 200.
     */
    public fun customModelTags(customModelTags: List<CustomModelTag>)

    /**
     * @param customModelTags Tags to attach to the resulting custom model.
     * The maximum number of tags is 200.
     */
    public fun customModelTags(vararg customModelTags: CustomModelTag)

    /**
     * @param customizationType The customization type.
     */
    public fun customizationType(customizationType: CustomizationType)

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * @param hyperParameters Parameters related to tuning the model.
     */
    public fun hyperParameters(hyperParameters: Map<String, String>)

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param jobName A name for the fine-tuning job. 
     * The maximum length is 63 characters.
     */
    public fun jobName(jobName: String)

    /**
     * @param jobTags Tags to attach to the job.
     * The maximum number of tags is 200.
     */
    public fun jobTags(jobTags: List<CustomModelTag>)

    /**
     * @param jobTags Tags to attach to the job.
     * The maximum number of tags is 200.
     */
    public fun jobTags(vararg jobTags: CustomModelTag)

    /**
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    public fun outputData(outputData: OutputBucketConfiguration)

    /**
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2104415173b67df8a2bc94e19d70c8b2fc1988fbdc0279ecfc6de43d62640314")
    public fun outputData(outputData: OutputBucketConfiguration.Builder.() -> Unit)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * @param role The IAM role that Amazon Bedrock can assume to perform tasks on your behalf.
     * For example, during model training, Amazon Bedrock needs your permission to read input data
     * from an S3 bucket,
     * write model artifacts to an S3 bucket.
     * To pass this role to Amazon Bedrock, the caller of this API must have the iam:PassRole
     * permission.
     */
    public fun role(role: IRole)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    public fun trainingData(trainingData: TrainingBucketConfiguration)

    /**
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d75af0a5c6774793d9ce26e1cd593d7c7e64fce685fccabdc09eb5810fda7a8")
    public fun trainingData(trainingData: TrainingBucketConfiguration.Builder.() -> Unit)

    /**
     * @param validationData The S3 bucket configuration where the validation data is stored.
     * If you don't provide a validation dataset, specify the evaluation percentage by the
     * `Evaluation percentage` hyperparameter.
     *
     * The maximum number is 10.
     */
    public fun validationData(validationData: List<ValidationBucketConfiguration>)

    /**
     * @param validationData The S3 bucket configuration where the validation data is stored.
     * If you don't provide a validation dataset, specify the evaluation percentage by the
     * `Evaluation percentage` hyperparameter.
     *
     * The maximum number is 10.
     */
    public fun validationData(vararg validationData: ValidationBucketConfiguration)

    /**
     * @param vpcConfig The VPC configuration.
     */
    public fun vpcConfig(vpcConfig: IBedrockCreateModelCustomizationJobVpcConfig)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param baseModel The base model. 
     */
    override fun baseModel(baseModel: IModel) {
      cdkBuilder.baseModel(baseModel.let(IModel.Companion::unwrap))
    }

    /**
     * @param clientRequestToken A unique, case-sensitive identifier to ensure that the API request
     * completes no more than one time.
     * If this token matches a previous request, Amazon Bedrock ignores the request, but does not
     * return an error.
     *
     * The maximum length is 256 characters.
     */
    override fun clientRequestToken(clientRequestToken: String) {
      cdkBuilder.clientRequestToken(clientRequestToken)
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba662d0ff97a3e9f09e4ec71f9b800f7728d3a1492e81743a4392ddfcb09fb54")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param customModelKmsKey The custom model is encrypted at rest using this key.
     */
    override fun customModelKmsKey(customModelKmsKey: IKey) {
      cdkBuilder.customModelKmsKey(customModelKmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param customModelName A name for the resulting custom model. 
     * The maximum length is 63 characters.
     */
    override fun customModelName(customModelName: String) {
      cdkBuilder.customModelName(customModelName)
    }

    /**
     * @param customModelTags Tags to attach to the resulting custom model.
     * The maximum number of tags is 200.
     */
    override fun customModelTags(customModelTags: List<CustomModelTag>) {
      cdkBuilder.customModelTags(customModelTags.map(CustomModelTag.Companion::unwrap))
    }

    /**
     * @param customModelTags Tags to attach to the resulting custom model.
     * The maximum number of tags is 200.
     */
    override fun customModelTags(vararg customModelTags: CustomModelTag): Unit =
        customModelTags(customModelTags.toList())

    /**
     * @param customizationType The customization type.
     */
    override fun customizationType(customizationType: CustomizationType) {
      cdkBuilder.customizationType(customizationType.let(CustomizationType.Companion::unwrap))
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param hyperParameters Parameters related to tuning the model.
     */
    override fun hyperParameters(hyperParameters: Map<String, String>) {
      cdkBuilder.hyperParameters(hyperParameters)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * @param jobName A name for the fine-tuning job. 
     * The maximum length is 63 characters.
     */
    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    /**
     * @param jobTags Tags to attach to the job.
     * The maximum number of tags is 200.
     */
    override fun jobTags(jobTags: List<CustomModelTag>) {
      cdkBuilder.jobTags(jobTags.map(CustomModelTag.Companion::unwrap))
    }

    /**
     * @param jobTags Tags to attach to the job.
     * The maximum number of tags is 200.
     */
    override fun jobTags(vararg jobTags: CustomModelTag): Unit = jobTags(jobTags.toList())

    /**
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    override fun outputData(outputData: OutputBucketConfiguration) {
      cdkBuilder.outputData(outputData.let(OutputBucketConfiguration.Companion::unwrap))
    }

    /**
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2104415173b67df8a2bc94e19d70c8b2fc1988fbdc0279ecfc6de43d62640314")
    override fun outputData(outputData: OutputBucketConfiguration.Builder.() -> Unit): Unit =
        outputData(OutputBucketConfiguration(outputData))

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param role The IAM role that Amazon Bedrock can assume to perform tasks on your behalf.
     * For example, during model training, Amazon Bedrock needs your permission to read input data
     * from an S3 bucket,
     * write model artifacts to an S3 bucket.
     * To pass this role to Amazon Bedrock, the caller of this API must have the iam:PassRole
     * permission.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    override fun trainingData(trainingData: TrainingBucketConfiguration) {
      cdkBuilder.trainingData(trainingData.let(TrainingBucketConfiguration.Companion::unwrap))
    }

    /**
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d75af0a5c6774793d9ce26e1cd593d7c7e64fce685fccabdc09eb5810fda7a8")
    override fun trainingData(trainingData: TrainingBucketConfiguration.Builder.() -> Unit): Unit =
        trainingData(TrainingBucketConfiguration(trainingData))

    /**
     * @param validationData The S3 bucket configuration where the validation data is stored.
     * If you don't provide a validation dataset, specify the evaluation percentage by the
     * `Evaluation percentage` hyperparameter.
     *
     * The maximum number is 10.
     */
    override fun validationData(validationData: List<ValidationBucketConfiguration>) {
      cdkBuilder.validationData(validationData.map(ValidationBucketConfiguration.Companion::unwrap))
    }

    /**
     * @param validationData The S3 bucket configuration where the validation data is stored.
     * If you don't provide a validation dataset, specify the evaluation percentage by the
     * `Evaluation percentage` hyperparameter.
     *
     * The maximum number is 10.
     */
    override fun validationData(vararg validationData: ValidationBucketConfiguration): Unit =
        validationData(validationData.toList())

    /**
     * @param vpcConfig The VPC configuration.
     */
    override fun vpcConfig(vpcConfig: IBedrockCreateModelCustomizationJobVpcConfig) {
      cdkBuilder.vpcConfig(vpcConfig.let(IBedrockCreateModelCustomizationJobVpcConfig.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps,
  ) : CdkObject(cdkObject),
      BedrockCreateModelCustomizationJobProps {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * The base model.
     */
    override fun baseModel(): IModel = unwrap(this).getBaseModel().let(IModel::wrap)

    /**
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one
     * time.
     *
     * If this token matches a previous request, Amazon Bedrock ignores the request, but does not
     * return an error.
     *
     * The maximum length is 256 characters.
     *
     * Default: - no client request token
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html)
     */
    override fun clientRequestToken(): String? = unwrap(this).getClientRequestToken()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     */
    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    /**
     * The custom model is encrypted at rest using this key.
     *
     * Default: - encrypted with the AWS owned key
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/encryption-custom-job.html)
     */
    override fun customModelKmsKey(): IKey? = unwrap(this).getCustomModelKmsKey()?.let(IKey::wrap)

    /**
     * A name for the resulting custom model.
     *
     * The maximum length is 63 characters.
     */
    override fun customModelName(): String = unwrap(this).getCustomModelName()

    /**
     * Tags to attach to the resulting custom model.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     */
    override fun customModelTags(): List<CustomModelTag> =
        unwrap(this).getCustomModelTags()?.map(CustomModelTag::wrap) ?: emptyList()

    /**
     * The customization type.
     *
     * Default: FINE_TUNING
     */
    override fun customizationType(): CustomizationType? =
        unwrap(this).getCustomizationType()?.let(CustomizationType::wrap)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    /**
     * Parameters related to tuning the model.
     *
     * Default: - use default hyperparameters
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html)
     */
    override fun hyperParameters(): Map<String, String> = unwrap(this).getHyperParameters() ?:
        emptyMap()

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     */
    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    /**
     * A name for the fine-tuning job.
     *
     * The maximum length is 63 characters.
     */
    override fun jobName(): String = unwrap(this).getJobName()

    /**
     * Tags to attach to the job.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     */
    override fun jobTags(): List<CustomModelTag> =
        unwrap(this).getJobTags()?.map(CustomModelTag::wrap) ?: emptyList()

    /**
     * The S3 bucket configuration where the output data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_OutputDataConfig.html)
     */
    override fun outputData(): OutputBucketConfiguration =
        unwrap(this).getOutputData().let(OutputBucketConfiguration::wrap)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     */
    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    /**
     * The IAM role that Amazon Bedrock can assume to perform tasks on your behalf.
     *
     * For example, during model training, Amazon Bedrock needs your permission to read input data
     * from an S3 bucket,
     * write model artifacts to an S3 bucket.
     * To pass this role to Amazon Bedrock, the caller of this API must have the iam:PassRole
     * permission.
     *
     * Default: - use auto generated role
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The S3 bucket configuration where the training data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_TrainingDataConfig.html)
     */
    override fun trainingData(): TrainingBucketConfiguration =
        unwrap(this).getTrainingData().let(TrainingBucketConfiguration::wrap)

    /**
     * The S3 bucket configuration where the validation data is stored.
     *
     * If you don't provide a validation dataset, specify the evaluation percentage by the
     * `Evaluation percentage` hyperparameter.
     *
     * The maximum number is 10.
     *
     * Default: undefined - validate using a subset of the training data
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_Validator.html)
     */
    override fun validationData(): List<ValidationBucketConfiguration> =
        unwrap(this).getValidationData()?.map(ValidationBucketConfiguration::wrap) ?: emptyList()

    /**
     * The VPC configuration.
     *
     * Default: - no VPC configuration
     */
    override fun vpcConfig(): IBedrockCreateModelCustomizationJobVpcConfig? =
        unwrap(this).getVpcConfig()?.let(IBedrockCreateModelCustomizationJobVpcConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        BedrockCreateModelCustomizationJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps):
        BedrockCreateModelCustomizationJobProps = CdkObjectWrappers.wrap(cdkObject) as?
        BedrockCreateModelCustomizationJobProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockCreateModelCustomizationJobProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps
  }
}
