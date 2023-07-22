@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeGutterStylePropertyDsl {
  private val cdkBuilder: CfnTheme.GutterStyleProperty.Builder =
      CfnTheme.GutterStyleProperty.builder()

  /**
   * @param show This Boolean value controls whether to display a gutter space between sheet tiles.
   */
  public fun show(show: Boolean) {
    cdkBuilder.show(show)
  }

  /**
   * @param show This Boolean value controls whether to display a gutter space between sheet tiles.
   */
  public fun show(show: IResolvable) {
    cdkBuilder.show(show)
  }

  public fun build(): CfnTheme.GutterStyleProperty = cdkBuilder.build()
}
