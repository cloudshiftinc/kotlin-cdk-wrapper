@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues
import software.constructs.Construct

/**
 * A StepFunctions task to call DynamoPutItem.
 *
 * Example:
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
@CdkDslMarker
public class DynamoPutItemDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DynamoPutItem.Builder = DynamoPutItem.Builder.create(scope, id)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * A condition that must be satisfied in order for a conditional PutItem operation to succeed.
     *
     * Default: - No condition expression
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ConditionExpression)
     *
     * @param conditionExpression A condition that must be satisfied in order for a conditional
     *   PutItem operation to succeed.
     */
    public fun conditionExpression(conditionExpression: String) {
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
     *
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     *
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * One or more substitution tokens for attribute names in an expression.
     *
     * Default: - No expression attribute names
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeNames)
     *
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an
     *   expression.
     */
    public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>) {
        cdkBuilder.expressionAttributeNames(expressionAttributeNames)
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * Default: - No expression attribute values
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ExpressionAttributeValues)
     *
     * @param expressionAttributeValues One or more values that can be substituted in an expression.
     */
    public fun expressionAttributeValues(
        expressionAttributeValues: Map<String, DynamoAttributeValue>
    ) {
        cdkBuilder.expressionAttributeValues(expressionAttributeValues)
    }

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
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
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective input to be
     * the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks. `IntegrationPattern.RUN_JOB`
     * for the following exceptions: `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`,
     * `EmrTerminationCluster`, and `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token)
     *
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * A map of attribute name/value pairs, one for each attribute.
     *
     * Only the primary key attributes are required; you can optionally provide other attribute
     * name-value pairs for the item.
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-Item)
     *
     * @param item A map of attribute name/value pairs, one for each attribute.
     */
    public fun item(item: Map<String, DynamoAttributeValue>) {
        cdkBuilder.item(item)
    }

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective output to be
     * the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result, and
     * resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's input to become
     * its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * Determines the level of detail about provisioned throughput consumption that is returned in
     * the response.
     *
     * Default: DynamoConsumedCapacity.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnConsumedCapacity)
     *
     * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
     *   consumption that is returned in the response.
     */
    public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
        cdkBuilder.returnConsumedCapacity(returnConsumedCapacity)
    }

    /**
     * The item collection metrics to returned in the response.
     *
     * Default: DynamoItemCollectionMetrics.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LSI.html#LSI.ItemCollections)
     *
     * @param returnItemCollectionMetrics The item collection metrics to returned in the response.
     */
    public fun returnItemCollectionMetrics(
        returnItemCollectionMetrics: DynamoItemCollectionMetrics
    ) {
        cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics)
    }

    /**
     * Use ReturnValues if you want to get the item attributes as they appeared before they were
     * updated with the PutItem request.
     *
     * Default: DynamoReturnValues.NONE
     *
     * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html#DDB-PutItem-request-ReturnValues)
     *
     * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
     *   before they were updated with the PutItem request.
     */
    public fun returnValues(returnValues: DynamoReturnValues) {
        cdkBuilder.returnValues(returnValues)
    }

    /**
     * The name of the table where the item should be written .
     *
     * @param table The name of the table where the item should be written .
     */
    public fun table(table: ITable) {
        cdkBuilder.table(table)
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
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): DynamoPutItem = cdkBuilder.build()
}
