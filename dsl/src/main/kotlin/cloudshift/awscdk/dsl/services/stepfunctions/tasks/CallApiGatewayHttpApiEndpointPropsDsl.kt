@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Stack
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.AuthType
import software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointProps
import software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod

@CdkDslMarker
public class CallApiGatewayHttpApiEndpointPropsDsl {
  private val cdkBuilder: CallApiGatewayHttpApiEndpointProps.Builder =
      CallApiGatewayHttpApiEndpointProps.builder()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun apiPath(apiPath: String) {
    cdkBuilder.apiPath(apiPath)
  }

  public fun apiStack(apiStack: Stack) {
    cdkBuilder.apiStack(apiStack)
  }

  public fun authType(authType: AuthType) {
    cdkBuilder.authType(authType)
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

  public fun headers(headers: TaskInput) {
    cdkBuilder.headers(headers)
  }

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

  public fun method(method: HttpMethod) {
    cdkBuilder.method(method)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun queryParameters(queryParameters: TaskInput) {
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

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CallApiGatewayHttpApiEndpointProps = cdkBuilder.build()
}
