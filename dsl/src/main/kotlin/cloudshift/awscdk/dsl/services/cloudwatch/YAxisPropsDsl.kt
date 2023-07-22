@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.YAxisProps

@CdkDslMarker
public class YAxisPropsDsl {
  private val cdkBuilder: YAxisProps.Builder = YAxisProps.builder()

  /**
   * @param label The label.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param max The max value.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The min value.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  /**
   * @param showUnits Whether to show units.
   */
  public fun showUnits(showUnits: Boolean) {
    cdkBuilder.showUnits(showUnits)
  }

  public fun build(): YAxisProps = cdkBuilder.build()
}
