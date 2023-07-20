@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression

@CdkDslMarker
public class DynamoGetItemPropsDsl {
  private val cdkBuilder: DynamoGetItemProps.Builder = DynamoGetItemProps.builder()

  private val _projectionExpression: MutableList<DynamoProjectionExpression> = mutableListOf()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun consistentRead(consistentRead: Boolean) {
    cdkBuilder.consistentRead(consistentRead)
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

  public fun projectionExpression(vararg projectionExpression: DynamoProjectionExpression) {
    _projectionExpression.addAll(listOf(*projectionExpression))
  }

  public fun projectionExpression(projectionExpression: Collection<DynamoProjectionExpression>) {
    _projectionExpression.addAll(projectionExpression)
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

  public fun build(): DynamoGetItemProps {
    if(_projectionExpression.isNotEmpty()) cdkBuilder.projectionExpression(_projectionExpression)
    return cdkBuilder.build()
  }
}
