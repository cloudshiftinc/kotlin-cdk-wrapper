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

  public fun cellStyle(cellStyle: IResolvable) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun cellStyle(cellStyle: CfnAnalysis.TableCellStyleProperty) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun headerStyle(headerStyle: IResolvable) {
    cdkBuilder.headerStyle(headerStyle)
  }

  public fun headerStyle(headerStyle: CfnAnalysis.TableCellStyleProperty) {
    cdkBuilder.headerStyle(headerStyle)
  }

  public fun orientation(orientation: String) {
    cdkBuilder.orientation(orientation)
  }

  public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public
      fun rowAlternateColorOptions(rowAlternateColorOptions: CfnAnalysis.RowAlternateColorOptionsProperty) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public fun build(): CfnAnalysis.TableOptionsProperty = cdkBuilder.build()
}
