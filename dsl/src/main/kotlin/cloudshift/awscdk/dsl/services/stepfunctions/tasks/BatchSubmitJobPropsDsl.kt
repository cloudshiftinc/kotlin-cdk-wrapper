@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides
import software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps

@CdkDslMarker
public class BatchSubmitJobPropsDsl {
  private val cdkBuilder: BatchSubmitJobProps.Builder = BatchSubmitJobProps.builder()

  private val _dependsOn: MutableList<BatchJobDependency> = mutableListOf()

  public fun arraySize(arraySize: Number) {
    cdkBuilder.arraySize(arraySize)
  }

  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun containerOverrides(block: BatchContainerOverridesDsl.() -> Unit = {}) {
    val builder = BatchContainerOverridesDsl()
    builder.apply(block)
    cdkBuilder.containerOverrides(builder.build())
  }

  public fun containerOverrides(containerOverrides: BatchContainerOverrides) {
    cdkBuilder.containerOverrides(containerOverrides)
  }

  public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(block)
    cdkBuilder.credentials(builder.build())
  }

  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  public fun dependsOn(dependsOn: BatchJobDependencyDsl.() -> Unit) {
    _dependsOn.add(BatchJobDependencyDsl().apply(dependsOn).build())
  }

  public fun dependsOn(dependsOn: Collection<BatchJobDependency>) {
    _dependsOn.addAll(dependsOn)
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

  public fun jobDefinitionArn(jobDefinitionArn: String) {
    cdkBuilder.jobDefinitionArn(jobDefinitionArn)
  }

  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  public fun jobQueueArn(jobQueueArn: String) {
    cdkBuilder.jobQueueArn(jobQueueArn)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun payload(payload: TaskInput) {
    cdkBuilder.payload(payload)
  }

  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  public fun resultSelector(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.resultSelector(builder.map)
  }

  public fun resultSelector(resultSelector: Map<String, *>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): BatchSubmitJobProps {
    if(_dependsOn.isNotEmpty()) cdkBuilder.dependsOn(_dependsOn)
    return cdkBuilder.build()
  }
}
