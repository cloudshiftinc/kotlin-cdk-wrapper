@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps

@CdkDslMarker
public class CfnProfilingGroupPropsDsl {
  private val cdkBuilder: CfnProfilingGroupProps.Builder = CfnProfilingGroupProps.builder()

  private val _anomalyDetectionNotificationConfiguration: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun agentPermissions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.agentPermissions(builder.map)
  }

  public fun agentPermissions(agentPermissions: Any) {
    cdkBuilder.agentPermissions(agentPermissions)
  }

  public fun anomalyDetectionNotificationConfiguration(vararg
      anomalyDetectionNotificationConfiguration: Any) {
    _anomalyDetectionNotificationConfiguration.addAll(listOf(*anomalyDetectionNotificationConfiguration))
  }

  public
      fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: Collection<Any>) {
    _anomalyDetectionNotificationConfiguration.addAll(anomalyDetectionNotificationConfiguration)
  }

  public
      fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable) {
    cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration)
  }

  public fun computePlatform(computePlatform: String) {
    cdkBuilder.computePlatform(computePlatform)
  }

  public fun profilingGroupName(profilingGroupName: String) {
    cdkBuilder.profilingGroupName(profilingGroupName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProfilingGroupProps {
    if(_anomalyDetectionNotificationConfiguration.isNotEmpty())
        cdkBuilder.anomalyDetectionNotificationConfiguration(_anomalyDetectionNotificationConfiguration)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
