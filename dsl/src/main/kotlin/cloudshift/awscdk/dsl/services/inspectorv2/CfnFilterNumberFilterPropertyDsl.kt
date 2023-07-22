@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterNumberFilterPropertyDsl {
  private val cdkBuilder: CfnFilter.NumberFilterProperty.Builder =
      CfnFilter.NumberFilterProperty.builder()

  /**
   * @param lowerInclusive The lowest number to be included in the filter.
   */
  public fun lowerInclusive(lowerInclusive: Number) {
    cdkBuilder.lowerInclusive(lowerInclusive)
  }

  /**
   * @param upperInclusive The highest number to be included in the filter.
   */
  public fun upperInclusive(upperInclusive: Number) {
    cdkBuilder.upperInclusive(upperInclusive)
  }

  public fun build(): CfnFilter.NumberFilterProperty = cdkBuilder.build()
}
