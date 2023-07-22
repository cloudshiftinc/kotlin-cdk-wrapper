@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterPortRangeFilterPropertyDsl {
  private val cdkBuilder: CfnFilter.PortRangeFilterProperty.Builder =
      CfnFilter.PortRangeFilterProperty.builder()

  /**
   * @param beginInclusive The port number the port range begins at.
   */
  public fun beginInclusive(beginInclusive: Number) {
    cdkBuilder.beginInclusive(beginInclusive)
  }

  /**
   * @param endInclusive The port number the port range ends at.
   */
  public fun endInclusive(endInclusive: Number) {
    cdkBuilder.endInclusive(endInclusive)
  }

  public fun build(): CfnFilter.PortRangeFilterProperty = cdkBuilder.build()
}
