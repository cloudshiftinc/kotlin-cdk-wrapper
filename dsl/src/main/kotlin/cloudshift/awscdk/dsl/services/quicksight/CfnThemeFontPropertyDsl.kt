@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FontProperty fontProperty = FontProperty.builder()
 * .fontFamily("fontFamily")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-font.html)
 */
@CdkDslMarker
public class CfnThemeFontPropertyDsl {
  private val cdkBuilder: CfnTheme.FontProperty.Builder = CfnTheme.FontProperty.builder()

  /**
   * @param fontFamily the value to be set.
   */
  public fun fontFamily(fontFamily: String) {
    cdkBuilder.fontFamily(fontFamily)
  }

  public fun build(): CfnTheme.FontProperty = cdkBuilder.build()
}
