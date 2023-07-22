@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.inspectorv2.CfnFilter

/**
 * An object that describes the details of a port range filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * PortRangeFilterProperty portRangeFilterProperty = PortRangeFilterProperty.builder()
 * .beginInclusive(123)
 * .endInclusive(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-filter-portrangefilter.html)
 */
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
