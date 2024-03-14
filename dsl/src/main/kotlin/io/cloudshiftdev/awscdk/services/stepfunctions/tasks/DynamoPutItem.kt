package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DynamoPutItem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem,
) : TaskStateBase(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.DynamoPutItem].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    public fun comment(comment: String)

    /**
     * A condition that must be satisfied in order for a conditional PutItem operation to succeed.
     *
     * Default: - No condition expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ConditionExpression)
     * @param conditionExpression A condition that must be satisfied in order for a conditional
     * PutItem operation to succeed. 
     */
    public fun conditionExpression(conditionExpression: String)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d39d57dae9452e488378c727f55b801e0516b187f48478321ce96258d6e22d83")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * One or more substitution tokens for attribute names in an expression.
     *
     * Default: - No expression attribute names
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeNames)
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     * expression. 
     */
    public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>)

    /**
     * One or more values that can be substituted in an expression.
     *
     * Default: - No expression attribute values
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeValues)
     * @param expressionAttributeValues One or more values that can be substituted in an expression.
     * 
     */
    public
        fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>)

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
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
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
     * A map of attribute name/value pairs, one for each attribute.
     *
     * Only the primary key attributes are required;
     * you can optionally provide other attribute name-value pairs for the item.
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-Item)
     * @param item A map of attribute name/value pairs, one for each attribute. 
     */
    public fun item(item: Map<String, DynamoAttributeValue>)

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
     * Determines the level of detail about provisioned throughput consumption that is returned in
     * the response.
     *
     * Default: DynamoConsumedCapacity.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnConsumedCapacity)
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response. 
     */
    public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity)

    /**
     * The item collection metrics to returned in the response.
     *
     * Default: DynamoItemCollectionMetrics.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LSI.html#LSI.ItemCollections)
     * @param returnItemCollectionMetrics The item collection metrics to returned in the response. 
     */
    public fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics)

    /**
     * Use ReturnValues if you want to get the item attributes as they appeared before they were
     * updated with the PutItem request.
     *
     * Default: DynamoReturnValues.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnValues)
     * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
     * before they were updated with the PutItem request. 
     */
    public fun returnValues(returnValues: DynamoReturnValues)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * The name of the table where the item should be written .
     *
     * @param table The name of the table where the item should be written . 
     */
    public fun table(table: ITable)

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
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem.Builder.create(scope, id)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * A condition that must be satisfied in order for a conditional PutItem operation to succeed.
     *
     * Default: - No condition expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ConditionExpression)
     * @param conditionExpression A condition that must be satisfied in order for a conditional
     * PutItem operation to succeed. 
     */
    override fun conditionExpression(conditionExpression: String) {
      cdkBuilder.conditionExpression(conditionExpression)
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
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d39d57dae9452e488378c727f55b801e0516b187f48478321ce96258d6e22d83")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * One or more substitution tokens for attribute names in an expression.
     *
     * Default: - No expression attribute names
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeNames)
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     * expression. 
     */
    override fun expressionAttributeNames(expressionAttributeNames: Map<String, String>) {
      cdkBuilder.expressionAttributeNames(expressionAttributeNames)
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * Default: - No expression attribute values
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeValues)
     * @param expressionAttributeValues One or more values that can be substituted in an expression.
     * 
     */
    override
        fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>) {
      cdkBuilder.expressionAttributeValues(expressionAttributeValues.mapValues{DynamoAttributeValue.unwrap(it.value)})
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
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
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
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * A map of attribute name/value pairs, one for each attribute.
     *
     * Only the primary key attributes are required;
     * you can optionally provide other attribute name-value pairs for the item.
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-Item)
     * @param item A map of attribute name/value pairs, one for each attribute. 
     */
    override fun item(item: Map<String, DynamoAttributeValue>) {
      cdkBuilder.item(item.mapValues{DynamoAttributeValue.unwrap(it.value)})
    }

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
      cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * Determines the level of detail about provisioned throughput consumption that is returned in
     * the response.
     *
     * Default: DynamoConsumedCapacity.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnConsumedCapacity)
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response. 
     */
    override fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
      cdkBuilder.returnConsumedCapacity(returnConsumedCapacity.let(DynamoConsumedCapacity::unwrap))
    }

    /**
     * The item collection metrics to returned in the response.
     *
     * Default: DynamoItemCollectionMetrics.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LSI.html#LSI.ItemCollections)
     * @param returnItemCollectionMetrics The item collection metrics to returned in the response. 
     */
    override
        fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics) {
      cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics.let(DynamoItemCollectionMetrics::unwrap))
    }

    /**
     * Use ReturnValues if you want to get the item attributes as they appeared before they were
     * updated with the PutItem request.
     *
     * Default: DynamoReturnValues.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnValues)
     * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
     * before they were updated with the PutItem request. 
     */
    override fun returnValues(returnValues: DynamoReturnValues) {
      cdkBuilder.returnValues(returnValues.let(DynamoReturnValues::unwrap))
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
     * The name of the table where the item should be written .
     *
     * @param table The name of the table where the item should be written . 
     */
    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable::unwrap))
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
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DynamoPutItem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DynamoPutItem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem):
        DynamoPutItem = DynamoPutItem(cdkObject)

    internal fun unwrap(wrapped: DynamoPutItem):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem = wrapped.cdkObject
  }
}
