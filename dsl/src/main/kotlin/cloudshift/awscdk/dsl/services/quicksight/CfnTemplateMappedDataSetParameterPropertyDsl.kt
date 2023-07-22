@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateMappedDataSetParameterPropertyDsl {
  private val cdkBuilder: CfnTemplate.MappedDataSetParameterProperty.Builder =
      CfnTemplate.MappedDataSetParameterProperty.builder()

  /**
   * @param dataSetIdentifier A unique name that identifies a dataset within the analysis or
   * dashboard. 
   */
  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  /**
   * @param dataSetParameterName The name of the dataset parameter. 
   */
  public fun dataSetParameterName(dataSetParameterName: String) {
    cdkBuilder.dataSetParameterName(dataSetParameterName)
  }

  public fun build(): CfnTemplate.MappedDataSetParameterProperty = cdkBuilder.build()
}
