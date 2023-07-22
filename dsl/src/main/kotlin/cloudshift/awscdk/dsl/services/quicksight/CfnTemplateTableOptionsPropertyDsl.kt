@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableOptionsProperty.Builder =
      CfnTemplate.TableOptionsProperty.builder()

  /**
   * @param cellStyle The table cell style of table cells.
   */
  public fun cellStyle(cellStyle: IResolvable) {
    cdkBuilder.cellStyle(cellStyle)
  }

  /**
   * @param cellStyle The table cell style of table cells.
   */
  public fun cellStyle(cellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.cellStyle(cellStyle)
  }

  /**
   * @param headerStyle The table cell style of a table header.
   */
  public fun headerStyle(headerStyle: IResolvable) {
    cdkBuilder.headerStyle(headerStyle)
  }

  /**
   * @param headerStyle The table cell style of a table header.
   */
  public fun headerStyle(headerStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.headerStyle(headerStyle)
  }

  /**
   * @param orientation The orientation (vertical, horizontal) for a table.
   */
  public fun orientation(orientation: String) {
    cdkBuilder.orientation(orientation)
  }

  /**
   * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
   * colors) for a table.
   */
  public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  /**
   * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
   * colors) for a table.
   */
  public
      fun rowAlternateColorOptions(rowAlternateColorOptions: CfnTemplate.RowAlternateColorOptionsProperty) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public fun build(): CfnTemplate.TableOptionsProperty = cdkBuilder.build()
}
