@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCascadingControlSourcePropertyDsl {
  private val cdkBuilder: CfnAnalysis.CascadingControlSourceProperty.Builder =
      CfnAnalysis.CascadingControlSourceProperty.builder()

  public fun columnToMatch(columnToMatch: IResolvable) {
    cdkBuilder.columnToMatch(columnToMatch)
  }

  public fun columnToMatch(columnToMatch: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.columnToMatch(columnToMatch)
  }

  public fun sourceSheetControlId(sourceSheetControlId: String) {
    cdkBuilder.sourceSheetControlId(sourceSheetControlId)
  }

  public fun build(): CfnAnalysis.CascadingControlSourceProperty = cdkBuilder.build()
}
