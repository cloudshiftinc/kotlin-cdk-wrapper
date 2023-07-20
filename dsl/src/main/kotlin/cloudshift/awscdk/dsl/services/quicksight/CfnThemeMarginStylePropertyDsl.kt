@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeMarginStylePropertyDsl {
  private val cdkBuilder: CfnTheme.MarginStyleProperty.Builder =
      CfnTheme.MarginStyleProperty.builder()

  public fun show(show: Boolean) {
    cdkBuilder.show(show)
  }

  public fun show(show: IResolvable) {
    cdkBuilder.show(show)
  }

  public fun build(): CfnTheme.MarginStyleProperty = cdkBuilder.build()
}
