@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A StepFunctions task to call DynamoPutItem.
 *
 * Example:
 *
 * ```
 * Table myTable;
 * DynamoPutItem.Builder.create(this, "PutItem")
 * .item(Map.of(
 * "MessageId", DynamoAttributeValue.fromString("message-007"),
 * "Text", DynamoAttributeValue.fromString(JsonPath.stringAt("$.bar")),
 * "TotalCount", DynamoAttributeValue.fromNumber(10)))
 * .table(myTable)
 * .build();
 * ```
 */
public open class DynamoPutItem(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DynamoPutItemProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DynamoPutItemProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DynamoPutItemProps.Builder.() -> Unit,
  ) : this(scope, id, DynamoPutItemProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.DynamoPutItem].
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
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.returnConsumedCapacity(returnConsumedCapacity.let(DynamoConsumedCapacity.Companion::unwrap))
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
      cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics.let(DynamoItemCollectionMetrics.Companion::unwrap))
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
      cdkBuilder.returnValues(returnValues.let(DynamoReturnValues.Companion::unwrap))
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
      cdkBuilder.table(table.let(ITable.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoPutItemJsonPathProps,
    ): DynamoPutItem =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(DynamoPutItemJsonPathProps.Companion::unwrap)).let(DynamoPutItem::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c61fd691d791ee008cc5ef963233124e6fbdc57ce03255044cf15dacac1ce0be")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoPutItemJsonPathProps.Builder.() -> Unit,
    ): DynamoPutItem = jsonPath(scope, id, DynamoPutItemJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoPutItemJsonataProps,
    ): DynamoPutItem =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(DynamoPutItemJsonataProps.Companion::unwrap)).let(DynamoPutItem::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c1e2b26272862bd3e20223769515a6f12b577b037f961848157b338aa170884")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoPutItemJsonataProps.Builder.() -> Unit,
    ): DynamoPutItem = jsonata(scope, id, DynamoPutItemJsonataProps(props))

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
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem
  }
}
