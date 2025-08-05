@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonataBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for DynamoDeleteItem Task using JSONata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * DynamoAttributeValue dynamoAttributeValue;
 * Object outputs;
 * Table table;
 * TaskRole taskRole;
 * Timeout timeout;
 * DynamoDeleteItemJsonataProps dynamoDeleteItemJsonataProps =
 * DynamoDeleteItemJsonataProps.builder()
 * .key(Map.of(
 * "keyKey", dynamoAttributeValue))
 * .table(table)
 * // the properties below are optional
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .conditionExpression("conditionExpression")
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .expressionAttributeNames(Map.of(
 * "expressionAttributeNamesKey", "expressionAttributeNames"))
 * .expressionAttributeValues(Map.of(
 * "expressionAttributeValuesKey", dynamoAttributeValue))
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .outputs(outputs)
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .returnConsumedCapacity(DynamoConsumedCapacity.INDEXES)
 * .returnItemCollectionMetrics(DynamoItemCollectionMetrics.SIZE)
 * .returnValues(DynamoReturnValues.NONE)
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface DynamoDeleteItemJsonataProps : TaskStateJsonataBaseProps {
  /**
   * A condition that must be satisfied in order for a conditional DeleteItem to succeed.
   *
   * Default: - No condition expression
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ConditionExpression)
   */
  public fun conditionExpression(): String? = unwrap(this).getConditionExpression()

  /**
   * One or more substitution tokens for attribute names in an expression.
   *
   * Default: - No expression attribute names
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ExpressionAttributeNames)
   */
  public fun expressionAttributeNames(): Map<String, String> =
      unwrap(this).getExpressionAttributeNames() ?: emptyMap()

  /**
   * One or more values that can be substituted in an expression.
   *
   * Default: - No expression attribute values
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ExpressionAttributeValues)
   */
  public fun expressionAttributeValues(): Map<String, DynamoAttributeValue> =
      unwrap(this).getExpressionAttributeValues()?.mapValues{DynamoAttributeValue.wrap(it.value)} ?:
      emptyMap()

  /**
   * Primary key of the item to retrieve.
   *
   * For the primary key, you must provide all of the attributes.
   * For example, with a simple primary key, you only need to provide a value for the partition key.
   * For a composite primary key, you must provide values for both the partition key and the sort
   * key.
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-Key)
   */
  public fun key(): Map<String, DynamoAttributeValue>

  /**
   * Determines the level of detail about provisioned throughput consumption that is returned in the
   * response.
   *
   * Default: DynamoConsumedCapacity.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ReturnConsumedCapacity)
   */
  public fun returnConsumedCapacity(): DynamoConsumedCapacity? =
      unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

  /**
   * Determines whether item collection metrics are returned.
   *
   * If set to SIZE, the response includes statistics about item collections, if any,
   * that were modified during the operation are returned in the response.
   * If set to NONE (the default), no statistics are returned.
   *
   * Default: DynamoItemCollectionMetrics.NONE
   */
  public fun returnItemCollectionMetrics(): DynamoItemCollectionMetrics? =
      unwrap(this).getReturnItemCollectionMetrics()?.let(DynamoItemCollectionMetrics::wrap)

  /**
   * Use ReturnValues if you want to get the item attributes as they appeared before they were
   * deleted.
   *
   * Default: DynamoReturnValues.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ReturnValues)
   */
  public fun returnValues(): DynamoReturnValues? =
      unwrap(this).getReturnValues()?.let(DynamoReturnValues::wrap)

  /**
   * The name of the table containing the requested item.
   */
  public fun table(): ITable

  /**
   * A builder for [DynamoDeleteItemJsonataProps]
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
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param conditionExpression A condition that must be satisfied in order for a conditional
     * DeleteItem to succeed.
     */
    public fun conditionExpression(conditionExpression: String)

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
    @JvmName("e77d3c8e38fdf8cbbfef3e07e78a2b6625eb92e4af7dbacbf8ca3840a1c2c8ba")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     * expression.
     */
    public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>)

    /**
     * @param expressionAttributeValues One or more values that can be substituted in an expression.
     */
    public
        fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>)

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
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param key Primary key of the item to retrieve. 
     * For the primary key, you must provide all of the attributes.
     * For example, with a simple primary key, you only need to provide a value for the partition
     * key.
     * For a composite primary key, you must provide values for both the partition key and the sort
     * key.
     */
    public fun key(key: Map<String, DynamoAttributeValue>)

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
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response.
     */
    public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity)

    /**
     * @param returnItemCollectionMetrics Determines whether item collection metrics are returned.
     * If set to SIZE, the response includes statistics about item collections, if any,
     * that were modified during the operation are returned in the response.
     * If set to NONE (the default), no statistics are returned.
     */
    public fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics)

    /**
     * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
     * before they were deleted.
     */
    public fun returnValues(returnValues: DynamoReturnValues)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param table The name of the table containing the requested item. 
     */
    public fun table(table: ITable)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemJsonataProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param conditionExpression A condition that must be satisfied in order for a conditional
     * DeleteItem to succeed.
     */
    override fun conditionExpression(conditionExpression: String) {
      cdkBuilder.conditionExpression(conditionExpression)
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
    @JvmName("e77d3c8e38fdf8cbbfef3e07e78a2b6625eb92e4af7dbacbf8ca3840a1c2c8ba")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     * expression.
     */
    override fun expressionAttributeNames(expressionAttributeNames: Map<String, String>) {
      cdkBuilder.expressionAttributeNames(expressionAttributeNames)
    }

    /**
     * @param expressionAttributeValues One or more values that can be substituted in an expression.
     */
    override
        fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>) {
      cdkBuilder.expressionAttributeValues(expressionAttributeValues.mapValues{DynamoAttributeValue.unwrap(it.value)})
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
     * @param key Primary key of the item to retrieve. 
     * For the primary key, you must provide all of the attributes.
     * For example, with a simple primary key, you only need to provide a value for the partition
     * key.
     * For a composite primary key, you must provide values for both the partition key and the sort
     * key.
     */
    override fun key(key: Map<String, DynamoAttributeValue>) {
      cdkBuilder.key(key.mapValues{DynamoAttributeValue.unwrap(it.value)})
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
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response.
     */
    override fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
      cdkBuilder.returnConsumedCapacity(returnConsumedCapacity.let(DynamoConsumedCapacity.Companion::unwrap))
    }

    /**
     * @param returnItemCollectionMetrics Determines whether item collection metrics are returned.
     * If set to SIZE, the response includes statistics about item collections, if any,
     * that were modified during the operation are returned in the response.
     * If set to NONE (the default), no statistics are returned.
     */
    override
        fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics) {
      cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics.let(DynamoItemCollectionMetrics.Companion::unwrap))
    }

    /**
     * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
     * before they were deleted.
     */
    override fun returnValues(returnValues: DynamoReturnValues) {
      cdkBuilder.returnValues(returnValues.let(DynamoReturnValues.Companion::unwrap))
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param table The name of the table containing the requested item. 
     */
    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable.Companion::unwrap))
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

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemJsonataProps,
  ) : CdkObject(cdkObject),
      DynamoDeleteItemJsonataProps {
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
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * A condition that must be satisfied in order for a conditional DeleteItem to succeed.
     *
     * Default: - No condition expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ConditionExpression)
     */
    override fun conditionExpression(): String? = unwrap(this).getConditionExpression()

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
     * One or more substitution tokens for attribute names in an expression.
     *
     * Default: - No expression attribute names
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ExpressionAttributeNames)
     */
    override fun expressionAttributeNames(): Map<String, String> =
        unwrap(this).getExpressionAttributeNames() ?: emptyMap()

    /**
     * One or more values that can be substituted in an expression.
     *
     * Default: - No expression attribute values
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ExpressionAttributeValues)
     */
    override fun expressionAttributeValues(): Map<String, DynamoAttributeValue> =
        unwrap(this).getExpressionAttributeValues()?.mapValues{DynamoAttributeValue.wrap(it.value)}
        ?: emptyMap()

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
     * Primary key of the item to retrieve.
     *
     * For the primary key, you must provide all of the attributes.
     * For example, with a simple primary key, you only need to provide a value for the partition
     * key.
     * For a composite primary key, you must provide values for both the partition key and the sort
     * key.
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-Key)
     */
    override fun key(): Map<String, DynamoAttributeValue> =
        unwrap(this).getKey().mapValues{DynamoAttributeValue.wrap(it.value)}

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
     * Determines the level of detail about provisioned throughput consumption that is returned in
     * the response.
     *
     * Default: DynamoConsumedCapacity.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ReturnConsumedCapacity)
     */
    override fun returnConsumedCapacity(): DynamoConsumedCapacity? =
        unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

    /**
     * Determines whether item collection metrics are returned.
     *
     * If set to SIZE, the response includes statistics about item collections, if any,
     * that were modified during the operation are returned in the response.
     * If set to NONE (the default), no statistics are returned.
     *
     * Default: DynamoItemCollectionMetrics.NONE
     */
    override fun returnItemCollectionMetrics(): DynamoItemCollectionMetrics? =
        unwrap(this).getReturnItemCollectionMetrics()?.let(DynamoItemCollectionMetrics::wrap)

    /**
     * Use ReturnValues if you want to get the item attributes as they appeared before they were
     * deleted.
     *
     * Default: DynamoReturnValues.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ReturnValues)
     */
    override fun returnValues(): DynamoReturnValues? =
        unwrap(this).getReturnValues()?.let(DynamoReturnValues::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * The name of the table containing the requested item.
     */
    override fun table(): ITable = unwrap(this).getTable().let(ITable::wrap)

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDeleteItemJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemJsonataProps):
        DynamoDeleteItemJsonataProps = CdkObjectWrappers.wrap(cdkObject) as?
        DynamoDeleteItemJsonataProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoDeleteItemJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemJsonataProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemJsonataProps
  }
}
