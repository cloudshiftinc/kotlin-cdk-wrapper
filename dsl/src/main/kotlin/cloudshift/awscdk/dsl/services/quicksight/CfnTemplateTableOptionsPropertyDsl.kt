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

  public fun cellStyle(cellStyle: IResolvable) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun cellStyle(cellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun headerStyle(headerStyle: IResolvable) {
    cdkBuilder.headerStyle(headerStyle)
  }

  public fun headerStyle(headerStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.headerStyle(headerStyle)
  }

  public fun orientation(orientation: String) {
    cdkBuilder.orientation(orientation)
  }

  public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public
      fun rowAlternateColorOptions(rowAlternateColorOptions: CfnTemplate.RowAlternateColorOptionsProperty) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public fun build(): CfnTemplate.TableOptionsProperty = cdkBuilder.build()
}
