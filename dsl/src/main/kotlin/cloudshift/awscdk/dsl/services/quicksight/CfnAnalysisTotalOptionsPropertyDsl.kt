@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TotalOptionsProperty.Builder =
      CfnAnalysis.TotalOptionsProperty.builder()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
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

  public fun build(): CfnAnalysis.TotalOptionsProperty = cdkBuilder.build()
}
