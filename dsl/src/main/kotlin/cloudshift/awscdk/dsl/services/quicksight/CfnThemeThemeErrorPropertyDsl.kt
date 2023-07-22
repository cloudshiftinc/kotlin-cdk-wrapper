@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeThemeErrorPropertyDsl {
  private val cdkBuilder: CfnTheme.ThemeErrorProperty.Builder =
      CfnTheme.ThemeErrorProperty.builder()

  /**
   * @param message The error message.
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  /**
   * @param type The type of error.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTheme.ThemeErrorProperty = cdkBuilder.build()
}
