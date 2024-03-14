package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DynamoGetItemProps : TaskStateBaseProps {
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
   * A builder for [DynamoGetItemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment An optional description for this state.
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e14ebac63aa0ed7080eb6f0c9fd489cea54bc66478d28b5643bc06c6e05931")
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
     * @param key Primary key of the item to retrieve. 
     * For the primary key, you must provide all of the attributes.
     * For example, with a simple primary key, you only need to provide a value for the partition
     * key.
     * For a composite primary key, you must provide values for both the partition key and the sort
     * key.
     */
    public fun key(key: Map<String, DynamoAttributeValue>)

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

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
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps.builder()

    /**
     * @param comment An optional description for this state.
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
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e14ebac63aa0ed7080eb6f0c9fd489cea54bc66478d28b5643bc06c6e05931")
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
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
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
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
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
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document.
     */
    override fun projectionExpression(projectionExpression: List<DynamoProjectionExpression>) {
      cdkBuilder.projectionExpression(projectionExpression.map(DynamoProjectionExpression::unwrap))
    }

    /**
     * @param projectionExpression An array of DynamoProjectionExpression that identifies one or
     * more attributes to retrieve from the table.
     * These attributes can include scalars, sets, or elements of a JSON document.
     */
    override fun projectionExpression(vararg projectionExpression: DynamoProjectionExpression): Unit
        = projectionExpression(projectionExpression.toList())

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
      cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response.
     */
    override fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
      cdkBuilder.returnConsumedCapacity(returnConsumedCapacity.let(DynamoConsumedCapacity::unwrap))
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
      cdkBuilder.table(table.let(ITable::unwrap))
    }

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps,
  ) : CdkObject(cdkObject), DynamoGetItemProps {
    /**
     * An optional description for this state.
     *
     * Default: - No comment
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
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
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
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

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
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
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
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoGetItemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps):
        DynamoGetItemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoGetItemProps):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps
  }
}
