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
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for DynamoGetItem Task using JSONata.
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
 * DynamoProjectionExpression dynamoProjectionExpression;
 * Object outputs;
 * Table table;
 * TaskRole taskRole;
 * Timeout timeout;
 * DynamoGetItemJsonataProps dynamoGetItemJsonataProps = DynamoGetItemJsonataProps.builder()
 * .key(Map.of(
 * "keyKey", dynamoAttributeValue))
 * .table(table)
 * // the properties below are optional
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .consistentRead(false)
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .expressionAttributeNames(Map.of(
 * "expressionAttributeNamesKey", "expressionAttributeNames"))
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .outputs(outputs)
 * .projectionExpression(List.of(dynamoProjectionExpression))
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .returnConsumedCapacity(DynamoConsumedCapacity.INDEXES)
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface DynamoGetItemJsonataProps : TaskStateJsonataBaseProps {
  /**
   * Determines the read consistency model: If set to true, then the operation uses strongly
   * consistent reads;
   *
   * otherwise, the operation uses eventually consistent reads.
   *
   * Default: false
   */
  public fun consistentRead(): Boolean? = unwrap(this).getConsistentRead()

  /**
   * One or more substitution tokens for attribute names in an expression.
   *
   * Default: - No expression attributes
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ExpressionAttributeNames)
   */
  public fun expressionAttributeNames(): Map<String, String> =
      unwrap(this).getExpressionAttributeNames() ?: emptyMap()

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
   * An array of DynamoProjectionExpression that identifies one or more attributes to retrieve from
   * the table.
   *
   * These attributes can include scalars, sets, or elements of a JSON document.
   *
   * Default: - No projection expression
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ProjectionExpression)
   */
  public fun projectionExpression(): List<DynamoProjectionExpression> =
      unwrap(this).getProjectionExpression()?.map(DynamoProjectionExpression::wrap) ?: emptyList()

  /**
   * Determines the level of detail about provisioned throughput consumption that is returned in the
   * response.
   *
   * Default: DynamoConsumedCapacity.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ReturnConsumedCapacity)
   */
  public fun returnConsumedCapacity(): DynamoConsumedCapacity? =
      unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

  /**
   * The name of the table containing the requested item.
   */
  public fun table(): ITable

  /**
   * A builder for [DynamoGetItemJsonataProps]
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
     * @param consistentRead Determines the read consistency model: If set to true, then the
     * operation uses strongly consistent reads;.
     * otherwise, the operation uses eventually consistent reads.
     */
    public fun consistentRead(consistentRead: Boolean)

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
    @JvmName("33fe7baf144d0985014ecdff5639bffb5a345326687a89dbee10b3b8faca3fee")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     * expression.
     */
    public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>)

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
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document.
     */
    public fun projectionExpression(projectionExpression: List<DynamoProjectionExpression>)

    /**
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document.
     */
    public fun projectionExpression(vararg projectionExpression: DynamoProjectionExpression)

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
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemJsonataProps.builder()

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
     * @param consistentRead Determines the read consistency model: If set to true, then the
     * operation uses strongly consistent reads;.
     * otherwise, the operation uses eventually consistent reads.
     */
    override fun consistentRead(consistentRead: Boolean) {
      cdkBuilder.consistentRead(consistentRead)
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
    @JvmName("33fe7baf144d0985014ecdff5639bffb5a345326687a89dbee10b3b8faca3fee")
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
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document.
     */
    override fun projectionExpression(projectionExpression: List<DynamoProjectionExpression>) {
      cdkBuilder.projectionExpression(projectionExpression.map(DynamoProjectionExpression.Companion::unwrap))
    }

    /**
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document.
     */
    override fun projectionExpression(vararg projectionExpression: DynamoProjectionExpression): Unit
        = projectionExpression(projectionExpression.toList())

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
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemJsonataProps,
  ) : CdkObject(cdkObject),
      DynamoGetItemJsonataProps {
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
     * Determines the read consistency model: If set to true, then the operation uses strongly
     * consistent reads;
     *
     * otherwise, the operation uses eventually consistent reads.
     *
     * Default: false
     */
    override fun consistentRead(): Boolean? = unwrap(this).getConsistentRead()

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
     * Default: - No expression attributes
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ExpressionAttributeNames)
     */
    override fun expressionAttributeNames(): Map<String, String> =
        unwrap(this).getExpressionAttributeNames() ?: emptyMap()

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
     * An array of DynamoProjectionExpression that identifies one or more attributes to retrieve
     * from the table.
     *
     * These attributes can include scalars, sets, or elements of a JSON document.
     *
     * Default: - No projection expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ProjectionExpression)
     */
    override fun projectionExpression(): List<DynamoProjectionExpression> =
        unwrap(this).getProjectionExpression()?.map(DynamoProjectionExpression::wrap) ?: emptyList()

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
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-ReturnConsumedCapacity)
     */
    override fun returnConsumedCapacity(): DynamoConsumedCapacity? =
        unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoGetItemJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemJsonataProps):
        DynamoGetItemJsonataProps = CdkObjectWrappers.wrap(cdkObject) as? DynamoGetItemJsonataProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoGetItemJsonataProps):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemJsonataProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemJsonataProps
  }
}
