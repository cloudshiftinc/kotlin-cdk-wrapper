@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps
import software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext
import software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration

@CdkDslMarker
public class AthenaStartQueryExecutionPropsDsl {
  private val cdkBuilder: AthenaStartQueryExecutionProps.Builder =
      AthenaStartQueryExecutionProps.builder()

  public fun clientRequestToken(clientRequestToken: String) {
    cdkBuilder.clientRequestToken(clientRequestToken)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(block)
    cdkBuilder.credentials(builder.build())
  }

  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
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

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun queryExecutionContext(block: QueryExecutionContextDsl.() -> Unit = {}) {
    val builder = QueryExecutionContextDsl()
    builder.apply(block)
    cdkBuilder.queryExecutionContext(builder.build())
  }

  public fun queryExecutionContext(queryExecutionContext: QueryExecutionContext) {
    cdkBuilder.queryExecutionContext(queryExecutionContext)
  }

  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  public fun resultConfiguration(block: ResultConfigurationDsl.() -> Unit = {}) {
    val builder = ResultConfigurationDsl()
    builder.apply(block)
    cdkBuilder.resultConfiguration(builder.build())
  }

  public fun resultConfiguration(resultConfiguration: ResultConfiguration) {
    cdkBuilder.resultConfiguration(resultConfiguration)
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

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun workGroup(workGroup: String) {
    cdkBuilder.workGroup(workGroup)
  }

  public fun build(): AthenaStartQueryExecutionProps = cdkBuilder.build()
}
