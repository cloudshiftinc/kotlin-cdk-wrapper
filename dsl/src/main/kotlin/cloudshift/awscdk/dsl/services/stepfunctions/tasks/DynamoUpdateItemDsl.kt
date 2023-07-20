@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItem
import software.constructs.Construct
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class DynamoUpdateItemDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DynamoUpdateItem.Builder = DynamoUpdateItem.Builder.create(scope, id)

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun conditionExpression(conditionExpression: String) {
        cdkBuilder.conditionExpression(conditionExpression)
    }

    public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(block)
        cdkBuilder.credentials(builder.build())
    }

    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>) {
        cdkBuilder.expressionAttributeNames(expressionAttributeNames)
    }

    public fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>) {
        cdkBuilder.expressionAttributeValues(expressionAttributeValues)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    public fun key(key: Map<String, DynamoAttributeValue>) {
        cdkBuilder.key(key)
    }

    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    public fun resultSelector(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.resultSelector(builder.map)
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
        cdkBuilder.returnConsumedCapacity(returnConsumedCapacity)
    }

    public fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics) {
        cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics)
    }

    public fun returnValues(returnValues: DynamoReturnValues) {
        cdkBuilder.returnValues(returnValues)
    }

    public fun table(table: ITable) {
        cdkBuilder.table(table)
    }

    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun updateExpression(updateExpression: String) {
        cdkBuilder.updateExpression(updateExpression)
    }

    public fun build(): DynamoUpdateItem = cdkBuilder.build()
}
