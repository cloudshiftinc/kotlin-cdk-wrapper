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

  /**
   * @param aggregationVisibility The visibility of `Show aggregations` .
   */
  public fun aggregationVisibility(aggregationVisibility: String) {
    cdkBuilder.aggregationVisibility(aggregationVisibility)
  }

  /**
   * @param tooltipFields The fields configuration in the tooltip.
   */
  public fun tooltipFields(vararg tooltipFields: Any) {
    _tooltipFields.addAll(listOf(*tooltipFields))
  }

  /**
   * @param tooltipFields The fields configuration in the tooltip.
   */
  public fun tooltipFields(tooltipFields: Collection<Any>) {
    _tooltipFields.addAll(tooltipFields)
  }

  /**
   * @param tooltipFields The fields configuration in the tooltip.
   */
  public fun tooltipFields(tooltipFields: IResolvable) {
    cdkBuilder.tooltipFields(tooltipFields)
  }

  /**
   * @param tooltipTitleType The type for the &gt;tooltip title. Choose one of the following
   * options:.
   * * `NONE` : Doesn't use the primary value as the title.
   * * `PRIMARY_VALUE` : Uses primary value as the title.
   */
  public fun tooltipTitleType(tooltipTitleType: String) {
    cdkBuilder.tooltipTitleType(tooltipTitleType)
  }

  public fun build(): CfnTemplate.FieldBasedTooltipProperty {
    if(_tooltipFields.isNotEmpty()) cdkBuilder.tooltipFields(_tooltipFields)
    return cdkBuilder.build()
  }
}
