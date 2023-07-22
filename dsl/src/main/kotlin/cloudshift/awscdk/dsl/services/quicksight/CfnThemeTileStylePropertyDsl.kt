@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeTileStylePropertyDsl {
  private val cdkBuilder: CfnTheme.TileStyleProperty.Builder = CfnTheme.TileStyleProperty.builder()

  /**
   * @param border The border around a tile.
   */
  public fun border(border: IResolvable) {
    cdkBuilder.border(border)
  }

  /**
   * @param border The border around a tile.
   */
  public fun border(border: CfnTheme.BorderStyleProperty) {
    cdkBuilder.border(border)
  }

  public fun build(): CfnTheme.TileStyleProperty = cdkBuilder.build()
}
