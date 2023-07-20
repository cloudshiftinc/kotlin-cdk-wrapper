@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps

@CdkDslMarker
public class CfnMaintenanceWindowPropsDsl {
  private val cdkBuilder: CfnMaintenanceWindowProps.Builder = CfnMaintenanceWindowProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean) {
    cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
  }

  public fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable) {
    cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
  }

  public fun cutoff(cutoff: Number) {
    cdkBuilder.cutoff(cutoff)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun duration(duration: Number) {
    cdkBuilder.duration(duration)
  }

  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  public fun scheduleOffset(scheduleOffset: Number) {
    cdkBuilder.scheduleOffset(scheduleOffset)
  }

  public fun scheduleTimezone(scheduleTimezone: String) {
    cdkBuilder.scheduleTimezone(scheduleTimezone)
  }

  public fun startDate(startDate: String) {
    cdkBuilder.startDate(startDate)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMaintenanceWindowProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
