@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterDateFilterPropertyDsl {
  private val cdkBuilder: CfnFilter.DateFilterProperty.Builder =
      CfnFilter.DateFilterProperty.builder()

  /**
   * @param endInclusive A timestamp representing the end of the time period filtered on.
   */
  public fun endInclusive(endInclusive: Number) {
    cdkBuilder.endInclusive(endInclusive)
  }

  /**
   * @param startInclusive A timestamp representing the start of the time period filtered on.
   */
  public fun startInclusive(startInclusive: Number) {
    cdkBuilder.startInclusive(startInclusive)
  }

  public fun build(): CfnFilter.DateFilterProperty = cdkBuilder.build()
}
