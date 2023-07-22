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

  /**
   * @param columnToMatch The column identifier that determines which column to look up for the
   * source sheet control.
   */
  public fun columnToMatch(columnToMatch: IResolvable) {
    cdkBuilder.columnToMatch(columnToMatch)
  }

  /**
   * @param columnToMatch The column identifier that determines which column to look up for the
   * source sheet control.
   */
  public fun columnToMatch(columnToMatch: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.columnToMatch(columnToMatch)
  }

  /**
   * @param sourceSheetControlId The source sheet control ID of a `CascadingControlSource` .
   */
  public fun sourceSheetControlId(sourceSheetControlId: String) {
    cdkBuilder.sourceSheetControlId(sourceSheetControlId)
  }

  public fun build(): CfnAnalysis.CascadingControlSourceProperty = cdkBuilder.build()
}
