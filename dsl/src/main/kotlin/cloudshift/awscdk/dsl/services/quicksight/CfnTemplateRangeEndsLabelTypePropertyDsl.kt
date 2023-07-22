@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The range ends label type of a data path label.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RangeEndsLabelTypeProperty rangeEndsLabelTypeProperty = RangeEndsLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-rangeendslabeltype.html)
 */
@CdkDslMarker
public class CfnTemplateRangeEndsLabelTypePropertyDsl {
  private val cdkBuilder: CfnTemplate.RangeEndsLabelTypeProperty.Builder =
      CfnTemplate.RangeEndsLabelTypeProperty.builder()

  /**
   * @param visibility The visibility of the range ends label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.RangeEndsLabelTypeProperty = cdkBuilder.build()
}
