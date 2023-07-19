@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver
import software.amazon.awscdk.services.stepfunctions.tasks.Monitoring
import software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel
import software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput
import software.constructs.Construct

@CdkDslMarker
public class EmrContainersStartJobRunDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EmrContainersStartJobRun.Builder =
      EmrContainersStartJobRun.Builder.create(scope, id)

  private val _applicationConfig: MutableList<ApplicationConfiguration> = mutableListOf()

  public fun applicationConfig(applicationConfig: ApplicationConfigurationDsl.() -> Unit) {
    _applicationConfig.add(ApplicationConfigurationDsl().apply(applicationConfig).build())
  }

  public fun applicationConfig(applicationConfig: Collection<ApplicationConfiguration>) {
    _applicationConfig.addAll(applicationConfig)
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

  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
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

  public fun jobDriver(block: JobDriverDsl.() -> Unit = {}) {
    val builder = JobDriverDsl()
    builder.apply(block)
    cdkBuilder.jobDriver(builder.build())
  }

  public fun jobDriver(jobDriver: JobDriver) {
    cdkBuilder.jobDriver(jobDriver)
  }

  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  public fun monitoring(block: MonitoringDsl.() -> Unit = {}) {
    val builder = MonitoringDsl()
    builder.apply(block)
    cdkBuilder.monitoring(builder.build())
  }

  public fun monitoring(monitoring: Monitoring) {
    cdkBuilder.monitoring(monitoring)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun releaseLabel(releaseLabel: ReleaseLabel) {
    cdkBuilder.releaseLabel(releaseLabel)
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

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun virtualCluster(virtualCluster: VirtualClusterInput) {
    cdkBuilder.virtualCluster(virtualCluster)
  }

  public fun build(): EmrContainersStartJobRun {
    if(_applicationConfig.isNotEmpty()) cdkBuilder.applicationConfig(_applicationConfig)
    return cdkBuilder.build()
  }
}
