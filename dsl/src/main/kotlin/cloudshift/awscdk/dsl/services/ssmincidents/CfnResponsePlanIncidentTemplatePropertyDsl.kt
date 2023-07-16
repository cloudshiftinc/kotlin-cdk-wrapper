@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanIncidentTemplatePropertyDsl {
  private val cdkBuilder: CfnResponsePlan.IncidentTemplateProperty.Builder =
      CfnResponsePlan.IncidentTemplateProperty.builder()

  private val _incidentTags: MutableList<Any> = mutableListOf()

  private val _notificationTargets: MutableList<Any> = mutableListOf()

  public fun dedupeString(dedupeString: String) {
    cdkBuilder.dedupeString(dedupeString)
  }

  public fun impact(impact: Number) {
    cdkBuilder.impact(impact)
  }

  public fun incidentTags(vararg incidentTags: Any) {
    _incidentTags.addAll(listOf(*incidentTags))
  }

  public fun incidentTags(incidentTags: Collection<Any>) {
    _incidentTags.addAll(incidentTags)
  }

  public fun incidentTags(incidentTags: IResolvable) {
    cdkBuilder.incidentTags(incidentTags)
  }

  public fun notificationTargets(vararg notificationTargets: Any) {
    _notificationTargets.addAll(listOf(*notificationTargets))
  }

  public fun notificationTargets(notificationTargets: Collection<Any>) {
    _notificationTargets.addAll(notificationTargets)
  }

  public fun notificationTargets(notificationTargets: IResolvable) {
    cdkBuilder.notificationTargets(notificationTargets)
  }

  public fun summary(summary: String) {
    cdkBuilder.summary(summary)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnResponsePlan.IncidentTemplateProperty {
    if(_incidentTags.isNotEmpty()) cdkBuilder.incidentTags(_incidentTags)
    if(_notificationTargets.isNotEmpty()) cdkBuilder.notificationTargets(_notificationTargets)
    return cdkBuilder.build()
  }
}
