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
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A StepFunctions task to call DynamoGetItem.
 *
 * Example:
 *
 * ```
 * Table myTable;
 * DynamoGetItem.Builder.create(this, "Get Item")
 * .key(Map.of("messageId", DynamoAttributeValue.fromString("message-007")))
 * .table(myTable)
 * .build();
 * ```
 */
public open class DynamoGetItem(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DynamoGetItemProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DynamoGetItemProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DynamoGetItemProps.Builder.() -> Unit,
  ) : this(scope, id, DynamoGetItemProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.DynamoGetItem].
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
     * Determines the read consistency model: If set to true, then the operation uses strongly
     * consistent reads;
     *
     * otherwise, the operation uses eventually consistent reads.
     *
     * Default: false
     *
     * @param consistentRead Determines the read consistency model: If set to true, then the
     * operation uses strongly consistent reads;. 
     */
    public fun consistentRead(consistentRead: Boolean)

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
    @JvmName("86a207fb96689afb0554f9ee7990a981637b2ec1fd0643f0a45a55a50226e074")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * One or more substitution tokens for attribute names in an expression.
     *
     * Default: - No expression attributes
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ExpressionAttributeNames)
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     * expression. 
     */
    public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>)

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
     * Primary key of the item to retrieve.
     *
     * For the primary key, you must provide all of the attributes.
     * For example, with a simple primary key, you only need to provide a value for the partition
     * key.
     * For a composite primary key, you must provide values for both the partition key and the sort
     * key.
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-Key)
     * @param key Primary key of the item to retrieve. 
     */
    public fun key(key: Map<String, DynamoAttributeValue>)

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
     * An array of DynamoProjectionExpression that identifies one or more attributes to retrieve
     * from the table.
     *
     * These attributes can include scalars, sets, or elements of a JSON document.
     *
     * Default: - No projection expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ProjectionExpression)
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table. 
     */
    public fun projectionExpression(projectionExpression: List<DynamoProjectionExpression>)

    /**
     * An array of DynamoProjectionExpression that identifies one or more attributes to retrieve
     * from the table.
     *
     * These attributes can include scalars, sets, or elements of a JSON document.
     *
     * Default: - No projection expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ProjectionExpression)
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table. 
     */
    public fun projectionExpression(vararg projectionExpression: DynamoProjectionExpression)

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
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ReturnConsumedCapacity)
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response. 
     */
    public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * The name of the table containing the requested item.
     *
     * @param table The name of the table containing the requested item. 
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
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem.Builder.create(scope, id)

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
     * Determines the read consistency model: If set to true, then the operation uses strongly
     * consistent reads;
     *
     * otherwise, the operation uses eventually consistent reads.
     *
     * Default: false
     *
     * @param consistentRead Determines the read consistency model: If set to true, then the
     * operation uses strongly consistent reads;. 
     */
    override fun consistentRead(consistentRead: Boolean) {
      cdkBuilder.consistentRead(consistentRead)
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
    @JvmName("86a207fb96689afb0554f9ee7990a981637b2ec1fd0643f0a45a55a50226e074")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * One or more substitution tokens for attribute names in an expression.
     *
     * Default: - No expression attributes
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ExpressionAttributeNames)
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     * expression. 
     */
    override fun expressionAttributeNames(expressionAttributeNames: Map<String, String>) {
      cdkBuilder.expressionAttributeNames(expressionAttributeNames)
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
     * Primary key of the item to retrieve.
     *
     * For the primary key, you must provide all of the attributes.
     * For example, with a simple primary key, you only need to provide a value for the partition
     * key.
     * For a composite primary key, you must provide values for both the partition key and the sort
     * key.
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-Key)
     * @param key Primary key of the item to retrieve. 
     */
    override fun key(key: Map<String, DynamoAttributeValue>) {
      cdkBuilder.key(key.mapValues{DynamoAttributeValue.unwrap(it.value)})
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
     * An array of DynamoProjectionExpression that identifies one or more attributes to retrieve
     * from the table.
     *
     * These attributes can include scalars, sets, or elements of a JSON document.
     *
     * Default: - No projection expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ProjectionExpression)
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table. 
     */
    override fun projectionExpression(projectionExpression: List<DynamoProjectionExpression>) {
      cdkBuilder.projectionExpression(projectionExpression.map(DynamoProjectionExpression.Companion::unwrap))
    }

    /**
     * An array of DynamoProjectionExpression that identifies one or more attributes to retrieve
     * from the table.
     *
     * These attributes can include scalars, sets, or elements of a JSON document.
     *
     * Default: - No projection expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ProjectionExpression)
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table. 
     */
    override fun projectionExpression(vararg projectionExpression: DynamoProjectionExpression): Unit
        = projectionExpression(projectionExpression.toList())

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
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ReturnConsumedCapacity)
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response. 
     */
    override fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
      cdkBuilder.returnConsumedCapacity(returnConsumedCapacity.let(DynamoConsumedCapacity.Companion::unwrap))
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
     * The name of the table containing the requested item.
     *
     * @param table The name of the table containing the requested item. 
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem =
        cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoGetItemJsonPathProps,
    ): DynamoGetItem =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(DynamoGetItemJsonPathProps.Companion::unwrap)).let(DynamoGetItem::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e55bfc377bf8e88cbfca57d8b69d3a458fba0bc75d391fbd029424f60a1c482")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoGetItemJsonPathProps.Builder.() -> Unit,
    ): DynamoGetItem = jsonPath(scope, id, DynamoGetItemJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoGetItemJsonataProps,
    ): DynamoGetItem =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(DynamoGetItemJsonataProps.Companion::unwrap)).let(DynamoGetItem::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fc58dc944ba92393ad71dd7a15c45a0eb32826bc1012227edce08708ee250e7")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: DynamoGetItemJsonataProps.Builder.() -> Unit,
    ): DynamoGetItem = jsonata(scope, id, DynamoGetItemJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DynamoGetItem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DynamoGetItem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem):
        DynamoGetItem = DynamoGetItem(cdkObject)

    internal fun unwrap(wrapped: DynamoGetItem):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem
  }
}
