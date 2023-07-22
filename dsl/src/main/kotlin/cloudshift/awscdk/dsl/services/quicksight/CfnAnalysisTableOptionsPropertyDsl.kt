@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableOptionsProperty.Builder =
      CfnAnalysis.TableOptionsProperty.builder()

  /**
   * @param cellStyle The table cell style of table cells.
   */
  public fun cellStyle(cellStyle: IResolvable) {
    cdkBuilder.cellStyle(cellStyle)
  }

  /**
   * @param cellStyle The table cell style of table cells.
   */
  public fun cellStyle(cellStyle: CfnAnalysis.TableCellStyleProperty) {
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
  public fun headerStyle(headerStyle: CfnAnalysis.TableCellStyleProperty) {
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
      fun rowAlternateColorOptions(rowAlternateColorOptions: CfnAnalysis.RowAlternateColorOptionsProperty) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public fun build(): CfnAnalysis.TableOptionsProperty = cdkBuilder.build()
}
