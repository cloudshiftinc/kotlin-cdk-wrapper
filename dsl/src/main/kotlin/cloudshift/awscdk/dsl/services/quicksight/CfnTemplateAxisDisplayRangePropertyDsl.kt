@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisDisplayRangePropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisDisplayRangeProperty.Builder =
      CfnTemplate.AxisDisplayRangeProperty.builder()

  /**
   * @param dataDriven The data-driven setup of an axis display range.
   */
  public fun dataDriven(dataDriven: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(dataDriven)
    cdkBuilder.dataDriven(builder.map)
  }

  /**
   * @param dataDriven The data-driven setup of an axis display range.
   */
  public fun dataDriven(dataDriven: Any) {
    cdkBuilder.dataDriven(dataDriven)
  }

  /**
   * @param minMax The minimum and maximum setup of an axis display range.
   */
  public fun minMax(minMax: IResolvable) {
    cdkBuilder.minMax(minMax)
  }

  /**
   * @param minMax The minimum and maximum setup of an axis display range.
   */
  public fun minMax(minMax: CfnTemplate.AxisDisplayMinMaxRangeProperty) {
    cdkBuilder.minMax(minMax)
  }

  public fun build(): CfnTemplate.AxisDisplayRangeProperty = cdkBuilder.build()
}
