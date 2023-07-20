@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableOptionsProperty.Builder =
      CfnDashboard.TableOptionsProperty.builder()

  public fun cellStyle(cellStyle: IResolvable) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun cellStyle(cellStyle: CfnDashboard.TableCellStyleProperty) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun headerStyle(headerStyle: IResolvable) {
    cdkBuilder.headerStyle(headerStyle)
  }

  public fun headerStyle(headerStyle: CfnDashboard.TableCellStyleProperty) {
    cdkBuilder.headerStyle(headerStyle)
  }

  public fun orientation(orientation: String) {
    cdkBuilder.orientation(orientation)
  }

  public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public
      fun rowAlternateColorOptions(rowAlternateColorOptions: CfnDashboard.RowAlternateColorOptionsProperty) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public fun build(): CfnDashboard.TableOptionsProperty = cdkBuilder.build()
}
