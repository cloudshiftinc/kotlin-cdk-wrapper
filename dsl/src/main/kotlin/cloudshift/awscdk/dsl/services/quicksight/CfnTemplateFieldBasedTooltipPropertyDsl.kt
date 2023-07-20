@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFieldBasedTooltipPropertyDsl {
  private val cdkBuilder: CfnTemplate.FieldBasedTooltipProperty.Builder =
      CfnTemplate.FieldBasedTooltipProperty.builder()

  private val _tooltipFields: MutableList<Any> = mutableListOf()

  public fun aggregationVisibility(aggregationVisibility: String) {
    cdkBuilder.aggregationVisibility(aggregationVisibility)
  }

  public fun tooltipFields(vararg tooltipFields: Any) {
    _tooltipFields.addAll(listOf(*tooltipFields))
  }

  public fun tooltipFields(tooltipFields: Collection<Any>) {
    _tooltipFields.addAll(tooltipFields)
  }

  public fun tooltipFields(tooltipFields: IResolvable) {
    cdkBuilder.tooltipFields(tooltipFields)
  }

  public fun tooltipTitleType(tooltipTitleType: String) {
    cdkBuilder.tooltipTitleType(tooltipTitleType)
  }

  public fun build(): CfnTemplate.FieldBasedTooltipProperty {
    if(_tooltipFields.isNotEmpty()) cdkBuilder.tooltipFields(_tooltipFields)
    return cdkBuilder.build()
  }
}
