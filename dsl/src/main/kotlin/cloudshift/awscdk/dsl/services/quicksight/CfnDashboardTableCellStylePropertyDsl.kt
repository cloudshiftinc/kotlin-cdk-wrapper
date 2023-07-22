@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableCellStylePropertyDsl {
  private val cdkBuilder: CfnDashboard.TableCellStyleProperty.Builder =
      CfnDashboard.TableCellStyleProperty.builder()

  /**
   * @param backgroundColor The background color for the table cells.
   */
  public fun backgroundColor(backgroundColor: String) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param border The borders for the table cells.
   */
  public fun border(border: IResolvable) {
    cdkBuilder.border(border)
  }

  /**
   * @param border The borders for the table cells.
   */
  public fun border(border: CfnDashboard.GlobalTableBorderOptionsProperty) {
    cdkBuilder.border(border)
  }

  /**
   * @param fontConfiguration The font configuration of the table cells.
   */
  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param fontConfiguration The font configuration of the table cells.
   */
  public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param height The height color for the table cells.
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * @param horizontalTextAlignment The horizontal text alignment (left, center, right, auto) for
   * the table cells.
   */
  public fun horizontalTextAlignment(horizontalTextAlignment: String) {
    cdkBuilder.horizontalTextAlignment(horizontalTextAlignment)
  }

  /**
   * @param textWrap The text wrap (none, wrap) for the table cells.
   */
  public fun textWrap(textWrap: String) {
    cdkBuilder.textWrap(textWrap)
  }

  /**
   * @param verticalTextAlignment The vertical text alignment (top, middle, bottom) for the table
   * cells.
   */
  public fun verticalTextAlignment(verticalTextAlignment: String) {
    cdkBuilder.verticalTextAlignment(verticalTextAlignment)
  }

  /**
   * @param visibility The visibility of the table cells.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.TableCellStyleProperty = cdkBuilder.build()
}
