@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTotalOptionsProperty.Builder =
      CfnTemplate.PivotTotalOptionsProperty.builder()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun metricHeaderCellStyle(metricHeaderCellStyle: IResolvable) {
    cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
  }

  public fun metricHeaderCellStyle(metricHeaderCellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
  }

  public fun placement(placement: String) {
    cdkBuilder.placement(placement)
  }

  public fun scrollStatus(scrollStatus: String) {
    cdkBuilder.scrollStatus(scrollStatus)
  }

  public fun totalCellStyle(totalCellStyle: IResolvable) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  public fun totalCellStyle(totalCellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  public fun totalsVisibility(totalsVisibility: String) {
    cdkBuilder.totalsVisibility(totalsVisibility)
  }

  public fun valueCellStyle(valueCellStyle: IResolvable) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  public fun valueCellStyle(valueCellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  public fun build(): CfnTemplate.PivotTotalOptionsProperty = cdkBuilder.build()
}
