@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme

@CdkDslMarker
public class CfnThemeThemeValuesPropertyDsl {
  private val cdkBuilder: CfnTheme.ThemeValuesProperty.Builder =
      CfnTheme.ThemeValuesProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnTheme.ThemeValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTheme.ThemeValuesProperty = cdkBuilder.build()
}
