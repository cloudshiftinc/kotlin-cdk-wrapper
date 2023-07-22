@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme

/**
 * The `ThemeValues` property specifies key-value pair that defines a property of a theme.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ThemeValuesProperty themeValuesProperty_;
 * ThemeValuesProperty themeValuesProperty = ThemeValuesProperty.builder()
 * .key("key")
 * .value(ThemeValueProperty.builder()
 * .children(List.of(themeValuesProperty_))
 * .value("value")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalues.html)
 */
@CdkDslMarker
public class CfnThemeThemeValuesPropertyDsl {
  private val cdkBuilder: CfnTheme.ThemeValuesProperty.Builder =
      CfnTheme.ThemeValuesProperty.builder()

  /**
   * @param key The name of the property.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of the property.
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value of the property.
   */
  public fun `value`(`value`: CfnTheme.ThemeValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTheme.ThemeValuesProperty = cdkBuilder.build()
}
