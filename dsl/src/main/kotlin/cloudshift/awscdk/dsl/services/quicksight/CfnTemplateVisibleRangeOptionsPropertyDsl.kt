@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The range options for the data zoom scroll bar.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisibleRangeOptionsProperty visibleRangeOptionsProperty = VisibleRangeOptionsProperty.builder()
 * .percentRange(PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-visiblerangeoptions.html)
 */
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
