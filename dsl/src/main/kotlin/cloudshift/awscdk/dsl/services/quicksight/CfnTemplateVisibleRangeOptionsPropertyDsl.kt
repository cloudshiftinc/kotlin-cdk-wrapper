@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateVisibleRangeOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.VisibleRangeOptionsProperty.Builder =
      CfnTemplate.VisibleRangeOptionsProperty.builder()

  /**
   * @param percentRange The percent range in the visible range.
   */
  public fun percentRange(percentRange: IResolvable) {
    cdkBuilder.percentRange(percentRange)
  }

  /**
   * @param percentRange The percent range in the visible range.
   */
  public fun percentRange(percentRange: CfnTemplate.PercentVisibleRangeProperty) {
    cdkBuilder.percentRange(percentRange)
  }

  public fun build(): CfnTemplate.VisibleRangeOptionsProperty = cdkBuilder.build()
}
