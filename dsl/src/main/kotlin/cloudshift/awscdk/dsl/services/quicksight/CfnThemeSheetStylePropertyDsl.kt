@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeSheetStylePropertyDsl {
  private val cdkBuilder: CfnTheme.SheetStyleProperty.Builder =
      CfnTheme.SheetStyleProperty.builder()

  public fun tile(tile: IResolvable) {
    cdkBuilder.tile(tile)
  }

  public fun tile(tile: CfnTheme.TileStyleProperty) {
    cdkBuilder.tile(tile)
  }

  public fun tileLayout(tileLayout: IResolvable) {
    cdkBuilder.tileLayout(tileLayout)
  }

  public fun tileLayout(tileLayout: CfnTheme.TileLayoutStyleProperty) {
    cdkBuilder.tileLayout(tileLayout)
  }

  public fun build(): CfnTheme.SheetStyleProperty = cdkBuilder.build()
}
