@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetPathParameterPropertyDsl {
  private val cdkBuilder: CfnDataset.PathParameterProperty.Builder =
      CfnDataset.PathParameterProperty.builder()

  /**
   * @param datasetParameter The path parameter definition. 
   */
  public fun datasetParameter(datasetParameter: IResolvable) {
    cdkBuilder.datasetParameter(datasetParameter)
  }

  /**
   * @param datasetParameter The path parameter definition. 
   */
  public fun datasetParameter(datasetParameter: CfnDataset.DatasetParameterProperty) {
    cdkBuilder.datasetParameter(datasetParameter)
  }

  /**
   * @param pathParameterName The name of the path parameter. 
   */
  public fun pathParameterName(pathParameterName: String) {
    cdkBuilder.pathParameterName(pathParameterName)
  }

  public fun build(): CfnDataset.PathParameterProperty = cdkBuilder.build()
}
