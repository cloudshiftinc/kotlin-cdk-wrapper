@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a default formatting definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultFormattingProperty defaultFormattingProperty = DefaultFormattingProperty.builder()
 * .displayFormat("displayFormat")
 * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
 * .blankCellFormat("blankCellFormat")
 * .currencySymbol("currencySymbol")
 * .dateFormat("dateFormat")
 * .decimalSeparator("decimalSeparator")
 * .fractionDigits(123)
 * .groupingSeparator("groupingSeparator")
 * .negativeFormat(NegativeFormatProperty.builder()
 * .prefix("prefix")
 * .suffix("suffix")
 * .build())
 * .prefix("prefix")
 * .suffix("suffix")
 * .unitScaler("unitScaler")
 * .useBlankCellFormat(false)
 * .useGrouping(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-defaultformatting.html)
 */
@CdkDslMarker
public class CfnTopicDefaultFormattingPropertyDsl {
  private val cdkBuilder: CfnTopic.DefaultFormattingProperty.Builder =
      CfnTopic.DefaultFormattingProperty.builder()

  /**
   * @param displayFormat The display format.
   * Valid values for this structure are `AUTO` , `PERCENT` , `CURRENCY` , `NUMBER` , `DATE` , and
   * `STRING` .
   */
  public fun displayFormat(displayFormat: String) {
    cdkBuilder.displayFormat(displayFormat)
  }

  /**
   * @param displayFormatOptions The additional options for display formatting.
   */
  public fun displayFormatOptions(displayFormatOptions: IResolvable) {
    cdkBuilder.displayFormatOptions(displayFormatOptions)
  }

  /**
   * @param displayFormatOptions The additional options for display formatting.
   */
  public fun displayFormatOptions(displayFormatOptions: CfnTopic.DisplayFormatOptionsProperty) {
    cdkBuilder.displayFormatOptions(displayFormatOptions)
  }

  public fun build(): CfnTopic.DefaultFormattingProperty = cdkBuilder.build()
}
