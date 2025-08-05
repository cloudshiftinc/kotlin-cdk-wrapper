@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.bedrock.IModel
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Step Functions Task to create model customization in Bedrock.
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
public open class BedrockCreateModelCustomizationJob(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BedrockCreateModelCustomizationJobProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(BedrockCreateModelCustomizationJobProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BedrockCreateModelCustomizationJobProps.Builder.() -> Unit,
  ) : this(scope, id, BedrockCreateModelCustomizationJobProps(props)
  )

  /**
   * The IAM role for the bedrock create model customization job.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * The base model.
     *
     * @param baseModel The base model. 
     */
    public fun baseModel(baseModel: IModel)

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
     * @param clientRequestToken A unique, case-sensitive identifier to ensure that the API request
     * completes no more than one time. 
     */
    public fun clientRequestToken(clientRequestToken: String)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    public fun credentials(credentials: Credentials)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("806a8ac44948d6c33f925b6e09f1b077bfc3c7191365625dfaab098c91f47957")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * The custom model is encrypted at rest using this key.
     *
     * Default: - encrypted with the AWS owned key
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/encryption-custom-job.html)
     * @param customModelKmsKey The custom model is encrypted at rest using this key. 
     */
    public fun customModelKmsKey(customModelKmsKey: IKey)

    /**
     * A name for the resulting custom model.
     *
     * The maximum length is 63 characters.
     *
     * @param customModelName A name for the resulting custom model. 
     */
    public fun customModelName(customModelName: String)

    /**
     * Tags to attach to the resulting custom model.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param customModelTags Tags to attach to the resulting custom model. 
     */
    public fun customModelTags(customModelTags: List<CustomModelTag>)

    /**
     * Tags to attach to the resulting custom model.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param customModelTags Tags to attach to the resulting custom model. 
     */
    public fun customModelTags(vararg customModelTags: CustomModelTag)

    /**
     * The customization type.
     *
     * Default: FINE_TUNING
     *
     * @param customizationType The customization type. 
     */
    public fun customizationType(customizationType: CustomizationType)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * Parameters related to tuning the model.
     *
     * Default: - use default hyperparameters
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html)
     * @param hyperParameters Parameters related to tuning the model. 
     */
    public fun hyperParameters(hyperParameters: Map<String, String>)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * A name for the fine-tuning job.
     *
     * The maximum length is 63 characters.
     *
     * @param jobName A name for the fine-tuning job. 
     */
    public fun jobName(jobName: String)

    /**
     * Tags to attach to the job.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param jobTags Tags to attach to the job. 
     */
    public fun jobTags(jobTags: List<CustomModelTag>)

    /**
     * Tags to attach to the job.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param jobTags Tags to attach to the job. 
     */
    public fun jobTags(vararg jobTags: CustomModelTag)

    /**
     * The S3 bucket configuration where the output data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_OutputDataConfig.html)
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    public fun outputData(outputData: OutputBucketConfiguration)

    /**
     * The S3 bucket configuration where the output data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_OutputDataConfig.html)
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("122aac703d93b97923958a70499b3b54b42a65290820289dc9ebcbecf3155a0e")
    public fun outputData(outputData: OutputBucketConfiguration.Builder.() -> Unit)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

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
     * @param outputs Used to specify and transform output from the state. 
     */
    public fun outputs(outputs: Any)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

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
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

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
     *
     * @param role The IAM role that Amazon Bedrock can assume to perform tasks on your behalf. 
     */
    public fun role(role: IRole)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * The S3 bucket configuration where the training data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_TrainingDataConfig.html)
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    public fun trainingData(trainingData: TrainingBucketConfiguration)

    /**
     * The S3 bucket configuration where the training data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_TrainingDataConfig.html)
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63b79d38ca54178ac4341d5332a0596bd67061e8e599729e1cabe4c34df2ab7")
    public fun trainingData(trainingData: TrainingBucketConfiguration.Builder.() -> Unit)

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
     * @param validationData The S3 bucket configuration where the validation data is stored. 
     */
    public fun validationData(validationData: List<ValidationBucketConfiguration>)

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
     * @param validationData The S3 bucket configuration where the validation data is stored. 
     */
    public fun validationData(vararg validationData: ValidationBucketConfiguration)

    /**
     * The VPC configuration.
     *
     * Default: - no VPC configuration
     *
     * @param vpcConfig The VPC configuration. 
     */
    public fun vpcConfig(vpcConfig: IBedrockCreateModelCustomizationJobVpcConfig)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob.Builder.create(scope,
        id)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The base model.
     *
     * @param baseModel The base model. 
     */
    override fun baseModel(baseModel: IModel) {
      cdkBuilder.baseModel(baseModel.let(IModel.Companion::unwrap))
    }

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
     * @param clientRequestToken A unique, case-sensitive identifier to ensure that the API request
     * completes no more than one time. 
     */
    override fun clientRequestToken(clientRequestToken: String) {
      cdkBuilder.clientRequestToken(clientRequestToken)
    }

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("806a8ac44948d6c33f925b6e09f1b077bfc3c7191365625dfaab098c91f47957")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * The custom model is encrypted at rest using this key.
     *
     * Default: - encrypted with the AWS owned key
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/encryption-custom-job.html)
     * @param customModelKmsKey The custom model is encrypted at rest using this key. 
     */
    override fun customModelKmsKey(customModelKmsKey: IKey) {
      cdkBuilder.customModelKmsKey(customModelKmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * A name for the resulting custom model.
     *
     * The maximum length is 63 characters.
     *
     * @param customModelName A name for the resulting custom model. 
     */
    override fun customModelName(customModelName: String) {
      cdkBuilder.customModelName(customModelName)
    }

    /**
     * Tags to attach to the resulting custom model.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param customModelTags Tags to attach to the resulting custom model. 
     */
    override fun customModelTags(customModelTags: List<CustomModelTag>) {
      cdkBuilder.customModelTags(customModelTags.map(CustomModelTag.Companion::unwrap))
    }

    /**
     * Tags to attach to the resulting custom model.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param customModelTags Tags to attach to the resulting custom model. 
     */
    override fun customModelTags(vararg customModelTags: CustomModelTag): Unit =
        customModelTags(customModelTags.toList())

    /**
     * The customization type.
     *
     * Default: FINE_TUNING
     *
     * @param customizationType The customization type. 
     */
    override fun customizationType(customizationType: CustomizationType) {
      cdkBuilder.customizationType(customizationType.let(CustomizationType.Companion::unwrap))
    }

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * Parameters related to tuning the model.
     *
     * Default: - use default hyperparameters
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html)
     * @param hyperParameters Parameters related to tuning the model. 
     */
    override fun hyperParameters(hyperParameters: Map<String, String>) {
      cdkBuilder.hyperParameters(hyperParameters)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * A name for the fine-tuning job.
     *
     * The maximum length is 63 characters.
     *
     * @param jobName A name for the fine-tuning job. 
     */
    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    /**
     * Tags to attach to the job.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param jobTags Tags to attach to the job. 
     */
    override fun jobTags(jobTags: List<CustomModelTag>) {
      cdkBuilder.jobTags(jobTags.map(CustomModelTag.Companion::unwrap))
    }

    /**
     * Tags to attach to the job.
     *
     * The maximum number of tags is 200.
     *
     * Default: - no tags
     *
     * @param jobTags Tags to attach to the job. 
     */
    override fun jobTags(vararg jobTags: CustomModelTag): Unit = jobTags(jobTags.toList())

    /**
     * The S3 bucket configuration where the output data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_OutputDataConfig.html)
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    override fun outputData(outputData: OutputBucketConfiguration) {
      cdkBuilder.outputData(outputData.let(OutputBucketConfiguration.Companion::unwrap))
    }

    /**
     * The S3 bucket configuration where the output data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_OutputDataConfig.html)
     * @param outputData The S3 bucket configuration where the output data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("122aac703d93b97923958a70499b3b54b42a65290820289dc9ebcbecf3155a0e")
    override fun outputData(outputData: OutputBucketConfiguration.Builder.() -> Unit): Unit =
        outputData(OutputBucketConfiguration(outputData))

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

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
     * @param outputs Used to specify and transform output from the state. 
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

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
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

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
     *
     * @param role The IAM role that Amazon Bedrock can assume to perform tasks on your behalf. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * The S3 bucket configuration where the training data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_TrainingDataConfig.html)
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    override fun trainingData(trainingData: TrainingBucketConfiguration) {
      cdkBuilder.trainingData(trainingData.let(TrainingBucketConfiguration.Companion::unwrap))
    }

    /**
     * The S3 bucket configuration where the training data is stored.
     *
     * [Documentation](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_TrainingDataConfig.html)
     * @param trainingData The S3 bucket configuration where the training data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63b79d38ca54178ac4341d5332a0596bd67061e8e599729e1cabe4c34df2ab7")
    override fun trainingData(trainingData: TrainingBucketConfiguration.Builder.() -> Unit): Unit =
        trainingData(TrainingBucketConfiguration(trainingData))

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
     * @param validationData The S3 bucket configuration where the validation data is stored. 
     */
    override fun validationData(validationData: List<ValidationBucketConfiguration>) {
      cdkBuilder.validationData(validationData.map(ValidationBucketConfiguration.Companion::unwrap))
    }

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
     * @param validationData The S3 bucket configuration where the validation data is stored. 
     */
    override fun validationData(vararg validationData: ValidationBucketConfiguration): Unit =
        validationData(validationData.toList())

    /**
     * The VPC configuration.
     *
     * Default: - no VPC configuration
     *
     * @param vpcConfig The VPC configuration. 
     */
    override fun vpcConfig(vpcConfig: IBedrockCreateModelCustomizationJobVpcConfig) {
      cdkBuilder.vpcConfig(vpcConfig.let(IBedrockCreateModelCustomizationJobVpcConfig.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BedrockCreateModelCustomizationJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BedrockCreateModelCustomizationJob(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob):
        BedrockCreateModelCustomizationJob = BedrockCreateModelCustomizationJob(cdkObject)

    internal fun unwrap(wrapped: BedrockCreateModelCustomizationJob):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob
  }
}
