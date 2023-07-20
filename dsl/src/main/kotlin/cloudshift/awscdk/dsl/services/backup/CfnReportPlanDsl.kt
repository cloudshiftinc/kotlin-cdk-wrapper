@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnReportPlan
import software.constructs.Construct

@CdkDslMarker
public class CfnReportPlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReportPlan.Builder = CfnReportPlan.Builder.create(scope, id)

  private val _reportPlanTags: MutableList<Any> = mutableListOf()

  public fun reportDeliveryChannel(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.reportDeliveryChannel(builder.map)
  }

  public fun reportDeliveryChannel(reportDeliveryChannel: Any) {
    cdkBuilder.reportDeliveryChannel(reportDeliveryChannel)
  }

  public fun reportPlanDescription(reportPlanDescription: String) {
    cdkBuilder.reportPlanDescription(reportPlanDescription)
  }

  public fun reportPlanName(reportPlanName: String) {
    cdkBuilder.reportPlanName(reportPlanName)
  }

  public fun reportPlanTags(vararg reportPlanTags: Any) {
    _reportPlanTags.addAll(listOf(*reportPlanTags))
  }

  public fun reportPlanTags(reportPlanTags: Collection<Any>) {
    _reportPlanTags.addAll(reportPlanTags)
  }

  public fun reportPlanTags(reportPlanTags: IResolvable) {
    cdkBuilder.reportPlanTags(reportPlanTags)
  }

  public fun reportSetting(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.reportSetting(builder.map)
  }

  public fun reportSetting(reportSetting: Any) {
    cdkBuilder.reportSetting(reportSetting)
  }

  public fun build(): CfnReportPlan {
    if(_reportPlanTags.isNotEmpty()) cdkBuilder.reportPlanTags(_reportPlanTags)
    return cdkBuilder.build()
  }
}
