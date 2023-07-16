@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import software.constructs.Construct

@CdkDslMarker
public class EmrModifyInstanceGroupByNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EmrModifyInstanceGroupByName.Builder =
      EmrModifyInstanceGroupByName.Builder.create(scope, id)

  public fun clusterId(clusterId: String) {
    cdkBuilder.clusterId(clusterId)
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

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public
      fun instanceGroup(block: EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrModifyInstanceGroupByNameInstanceGroupModifyConfigPropertyDsl()
    builder.apply(block)
    cdkBuilder.instanceGroup(builder.build())
  }

  public
      fun instanceGroup(instanceGroup: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty) {
    cdkBuilder.instanceGroup(instanceGroup)
  }

  public fun instanceGroupName(instanceGroupName: String) {
    cdkBuilder.instanceGroupName(instanceGroupName)
  }

  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
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

  public fun resultSelector(resultSelector: Map<String, *>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): EmrModifyInstanceGroupByName = cdkBuilder.build()
}
