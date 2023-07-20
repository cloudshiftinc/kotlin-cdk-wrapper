@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnLaunch
import software.constructs.Construct

@CdkDslMarker
public class CfnLaunchDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLaunch.Builder = CfnLaunch.Builder.create(scope, id)

  private val _groups: MutableList<Any> = mutableListOf()

  private val _metricMonitors: MutableList<Any> = mutableListOf()

  private val _scheduledSplitsConfig: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun executionStatus(executionStatus: IResolvable) {
    cdkBuilder.executionStatus(executionStatus)
  }

  public fun executionStatus(executionStatus: CfnLaunch.ExecutionStatusObjectProperty) {
    cdkBuilder.executionStatus(executionStatus)
  }

  public fun groups(vararg groups: Any) {
    _groups.addAll(listOf(*groups))
  }

  public fun groups(groups: Collection<Any>) {
    _groups.addAll(groups)
  }

  public fun groups(groups: IResolvable) {
    cdkBuilder.groups(groups)
  }

  public fun metricMonitors(vararg metricMonitors: Any) {
    _metricMonitors.addAll(listOf(*metricMonitors))
  }

  public fun metricMonitors(metricMonitors: Collection<Any>) {
    _metricMonitors.addAll(metricMonitors)
  }

  public fun metricMonitors(metricMonitors: IResolvable) {
    cdkBuilder.metricMonitors(metricMonitors)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun project(project: String) {
    cdkBuilder.project(project)
  }

  public fun randomizationSalt(randomizationSalt: String) {
    cdkBuilder.randomizationSalt(randomizationSalt)
  }

  public fun scheduledSplitsConfig(vararg scheduledSplitsConfig: Any) {
    _scheduledSplitsConfig.addAll(listOf(*scheduledSplitsConfig))
  }

  public fun scheduledSplitsConfig(scheduledSplitsConfig: Collection<Any>) {
    _scheduledSplitsConfig.addAll(scheduledSplitsConfig)
  }

  public fun scheduledSplitsConfig(scheduledSplitsConfig: IResolvable) {
    cdkBuilder.scheduledSplitsConfig(scheduledSplitsConfig)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLaunch {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_metricMonitors.isNotEmpty()) cdkBuilder.metricMonitors(_metricMonitors)
    if(_scheduledSplitsConfig.isNotEmpty()) cdkBuilder.scheduledSplitsConfig(_scheduledSplitsConfig)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
