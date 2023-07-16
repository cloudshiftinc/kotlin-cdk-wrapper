@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisMappedDataSetParameterPropertyDsl {
  private val cdkBuilder: CfnAnalysis.MappedDataSetParameterProperty.Builder =
      CfnAnalysis.MappedDataSetParameterProperty.builder()

  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun dataSetParameterName(dataSetParameterName: String) {
    cdkBuilder.dataSetParameterName(dataSetParameterName)
  }

  public fun build(): CfnAnalysis.MappedDataSetParameterProperty = cdkBuilder.build()
}
