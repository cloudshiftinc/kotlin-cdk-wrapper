@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnFilter

@CdkDslMarker
public class CfnFilterFindingCriteriaPropertyDsl {
  private val cdkBuilder: CfnFilter.FindingCriteriaProperty.Builder =
      CfnFilter.FindingCriteriaProperty.builder()

  public fun criterion(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.criterion(builder.map)
  }

  public fun criterion(criterion: Any) {
    cdkBuilder.criterion(criterion)
  }

  public fun itemType(itemType: IResolvable) {
    cdkBuilder.itemType(itemType)
  }

  public fun itemType(itemType: CfnFilter.ConditionProperty) {
    cdkBuilder.itemType(itemType)
  }

  public fun build(): CfnFilter.FindingCriteriaProperty = cdkBuilder.build()
}
