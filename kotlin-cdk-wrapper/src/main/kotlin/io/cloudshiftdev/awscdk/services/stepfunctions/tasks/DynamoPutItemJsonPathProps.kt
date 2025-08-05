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
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonPathBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for DynamoPutItem Task using JSONPath.
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
 * Object resultSelector;
 * Table table;
 * TaskRole taskRole;
 * Timeout timeout;
 * DynamoPutItemJsonPathProps dynamoPutItemJsonPathProps = DynamoPutItemJsonPathProps.builder()
 * .item(Map.of(
 * "itemKey", dynamoAttributeValue))
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
 * .inputPath("inputPath")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .outputPath("outputPath")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .returnConsumedCapacity(DynamoConsumedCapacity.INDEXES)
 * .returnItemCollectionMetrics(DynamoItemCollectionMetrics.SIZE)
 * .returnValues(DynamoReturnValues.NONE)
 * .stateName("stateName")
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface DynamoPutItemJsonPathProps : TaskStateJsonPathBaseProps {
  /**
   * A condition that must be satisfied in order for a conditional PutItem operation to succeed.
   *
   * Default: - No condition expression
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ConditionExpression)
   */
  public fun conditionExpression(): String? = unwrap(this).getConditionExpression()

  /**
   * One or more substitution tokens for attribute names in an expression.
   *
   * Default: - No expression attribute names
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeNames)
   */
  public fun expressionAttributeNames(): Map<String, String> =
      unwrap(this).getExpressionAttributeNames() ?: emptyMap()

  /**
   * One or more values that can be substituted in an expression.
   *
   * Default: - No expression attribute values
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeValues)
   */
  public fun expressionAttributeValues(): Map<String, DynamoAttributeValue> =
      unwrap(this).getExpressionAttributeValues()?.mapValues{DynamoAttributeValue.wrap(it.value)} ?:
      emptyMap()

  /**
   * A map of attribute name/value pairs, one for each attribute.
   *
   * Only the primary key attributes are required;
   * you can optionally provide other attribute name-value pairs for the item.
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-Item)
   */
  public fun item(): Map<String, DynamoAttributeValue>

  /**
   * Determines the level of detail about provisioned throughput consumption that is returned in the
   * response.
   *
   * Default: DynamoConsumedCapacity.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnConsumedCapacity)
   */
  public fun returnConsumedCapacity(): DynamoConsumedCapacity? =
      unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

  /**
   * The item collection metrics to returned in the response.
   *
   * Default: DynamoItemCollectionMetrics.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LSI.html#LSI.ItemCollections)
   */
  public fun returnItemCollectionMetrics(): DynamoItemCollectionMetrics? =
      unwrap(this).getReturnItemCollectionMetrics()?.let(DynamoItemCollectionMetrics::wrap)

  /**
   * Use ReturnValues if you want to get the item attributes as they appeared before they were
   * updated with the PutItem request.
   *
   * Default: DynamoReturnValues.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnValues)
   */
  public fun returnValues(): DynamoReturnValues? =
      unwrap(this).getReturnValues()?.let(DynamoReturnValues::wrap)

  /**
   * The name of the table where the item should be written .
   */
  public fun table(): ITable

  /**
   * A builder for [DynamoPutItemJsonPathProps]
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
     * PutItem operation to succeed.
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
    @JvmName("a2b806afc78be91d9fbb3fd85270ad2eb087493153149916b51c097e48885797")
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
     * @param item A map of attribute name/value pairs, one for each attribute. 
     * Only the primary key attributes are required;
     * you can optionally provide other attribute name-value pairs for the item.
     */
    public fun item(item: Map<String, DynamoAttributeValue>)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

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
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response.
     */
    public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity)

    /**
     * @param returnItemCollectionMetrics The item collection metrics to returned in the response.
     */
    public fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics)

    /**
     * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
     * before they were updated with the PutItem request.
     */
    public fun returnValues(returnValues: DynamoReturnValues)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param table The name of the table where the item should be written . 
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
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemJsonPathProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemJsonPathProps.builder()

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
     * PutItem operation to succeed.
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
    @JvmName("a2b806afc78be91d9fbb3fd85270ad2eb087493153149916b51c097e48885797")
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
     * @param item A map of attribute name/value pairs, one for each attribute. 
     * Only the primary key attributes are required;
     * you can optionally provide other attribute name-value pairs for the item.
     */
    override fun item(item: Map<String, DynamoAttributeValue>) {
      cdkBuilder.item(item.mapValues{DynamoAttributeValue.unwrap(it.value)})
    }

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
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     * consumption that is returned in the response.
     */
    override fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
      cdkBuilder.returnConsumedCapacity(returnConsumedCapacity.let(DynamoConsumedCapacity.Companion::unwrap))
    }

    /**
     * @param returnItemCollectionMetrics The item collection metrics to returned in the response.
     */
    override
        fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics) {
      cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics.let(DynamoItemCollectionMetrics.Companion::unwrap))
    }

    /**
     * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
     * before they were updated with the PutItem request.
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
     * @param table The name of the table where the item should be written . 
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
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemJsonPathProps,
  ) : CdkObject(cdkObject),
      DynamoPutItemJsonPathProps {
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
     * A condition that must be satisfied in order for a conditional PutItem operation to succeed.
     *
     * Default: - No condition expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ConditionExpression)
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
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeNames)
     */
    override fun expressionAttributeNames(): Map<String, String> =
        unwrap(this).getExpressionAttributeNames() ?: emptyMap()

    /**
     * One or more values that can be substituted in an expression.
     *
     * Default: - No expression attribute values
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeValues)
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
     * A map of attribute name/value pairs, one for each attribute.
     *
     * Only the primary key attributes are required;
     * you can optionally provide other attribute name-value pairs for the item.
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-Item)
     */
    override fun item(): Map<String, DynamoAttributeValue> =
        unwrap(this).getItem().mapValues{DynamoAttributeValue.wrap(it.value)}

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
     * Determines the level of detail about provisioned throughput consumption that is returned in
     * the response.
     *
     * Default: DynamoConsumedCapacity.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnConsumedCapacity)
     */
    override fun returnConsumedCapacity(): DynamoConsumedCapacity? =
        unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

    /**
     * The item collection metrics to returned in the response.
     *
     * Default: DynamoItemCollectionMetrics.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LSI.html#LSI.ItemCollections)
     */
    override fun returnItemCollectionMetrics(): DynamoItemCollectionMetrics? =
        unwrap(this).getReturnItemCollectionMetrics()?.let(DynamoItemCollectionMetrics::wrap)

    /**
     * Use ReturnValues if you want to get the item attributes as they appeared before they were
     * updated with the PutItem request.
     *
     * Default: DynamoReturnValues.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnValues)
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
     * The name of the table where the item should be written .
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
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoPutItemJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemJsonPathProps):
        DynamoPutItemJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as?
        DynamoPutItemJsonPathProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoPutItemJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemJsonPathProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemJsonPathProps
  }
}
