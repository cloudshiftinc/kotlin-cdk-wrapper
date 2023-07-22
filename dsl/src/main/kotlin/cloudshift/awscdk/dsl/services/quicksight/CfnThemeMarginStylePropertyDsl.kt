@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * The display options for margins around the outside edge of sheets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * MarginStyleProperty marginStyleProperty = MarginStyleProperty.builder()
 * .show(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-marginstyle.html)
 */
@CdkDslMarker
public class CfnThemeMarginStylePropertyDsl {
  private val cdkBuilder: CfnTheme.MarginStyleProperty.Builder =
      CfnTheme.MarginStyleProperty.builder()

  /**
   * @param show This Boolean value controls whether to display sheet margins.
   */
  public fun show(show: Boolean) {
    cdkBuilder.show(show)
  }

  /**
   * @param show This Boolean value controls whether to display sheet margins.
   */
  public fun show(show: IResolvable) {
    cdkBuilder.show(show)
  }

  public fun build(): CfnTheme.MarginStyleProperty = cdkBuilder.build()
}
