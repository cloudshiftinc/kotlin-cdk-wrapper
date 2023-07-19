@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.EksCall
import software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods
import software.constructs.Construct

@CdkDslMarker
public class EksCallDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EksCall.Builder = EksCall.Builder.create(scope, id)

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
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

  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
  }

  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  public fun httpMethod(httpMethod: HttpMethods) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun httpPath(httpPath: String) {
    cdkBuilder.httpPath(httpPath)
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

  public fun queryParameters(queryParameters: Map<String, List<String>>) {
    cdkBuilder.queryParameters(queryParameters)
  }

  public fun requestBody(requestBody: TaskInput) {
    cdkBuilder.requestBody(requestBody)
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

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): EksCall = cdkBuilder.build()
}
