@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDataSetReferencePropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataSetReferenceProperty.Builder =
      CfnAnalysis.DataSetReferenceProperty.builder()

  /**
   * @param dataSetArn Dataset Amazon Resource Name (ARN). 
   */
  public fun dataSetArn(dataSetArn: String) {
    cdkBuilder.dataSetArn(dataSetArn)
  }

  /**
   * @param dataSetPlaceholder Dataset placeholder. 
   */
  public fun dataSetPlaceholder(dataSetPlaceholder: String) {
    cdkBuilder.dataSetPlaceholder(dataSetPlaceholder)
  }

  public fun build(): CfnAnalysis.DataSetReferenceProperty = cdkBuilder.build()
}
