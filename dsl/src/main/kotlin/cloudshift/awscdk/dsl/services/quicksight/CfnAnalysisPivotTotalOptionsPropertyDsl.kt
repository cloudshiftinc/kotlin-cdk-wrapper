@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTotalOptionsProperty.Builder =
      CfnAnalysis.PivotTotalOptionsProperty.builder()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun metricHeaderCellStyle(metricHeaderCellStyle: IResolvable) {
    cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
  }

  public fun metricHeaderCellStyle(metricHeaderCellStyle: CfnAnalysis.TableCellStyleProperty) {
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

  public fun totalCellStyle(totalCellStyle: CfnAnalysis.TableCellStyleProperty) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  public fun totalsVisibility(totalsVisibility: String) {
    cdkBuilder.totalsVisibility(totalsVisibility)
  }

  public fun valueCellStyle(valueCellStyle: IResolvable) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  public fun valueCellStyle(valueCellStyle: CfnAnalysis.TableCellStyleProperty) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  public fun build(): CfnAnalysis.PivotTotalOptionsProperty = cdkBuilder.build()
}
