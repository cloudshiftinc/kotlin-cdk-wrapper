@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps

@CdkDslMarker
public class SnsPublishPropsDsl {
  private val cdkBuilder: SnsPublishProps.Builder = SnsPublishProps.builder()

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

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  public fun message(message: TaskInput) {
    cdkBuilder.message(message)
  }

  public fun messageAttributes(messageAttributes: Map<String, MessageAttribute>) {
    cdkBuilder.messageAttributes(messageAttributes)
  }

  public fun messagePerSubscriptionType(messagePerSubscriptionType: Boolean) {
    cdkBuilder.messagePerSubscriptionType(messagePerSubscriptionType)
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

  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): SnsPublishProps = cdkBuilder.build()
}
