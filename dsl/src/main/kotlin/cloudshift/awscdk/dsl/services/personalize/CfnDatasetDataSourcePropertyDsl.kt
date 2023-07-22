@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnDataset

@CdkDslMarker
public class CfnDatasetDataSourcePropertyDsl {
  private val cdkBuilder: CfnDataset.DataSourceProperty.Builder =
      CfnDataset.DataSourceProperty.builder()

  /**
   * @param dataLocation The path to the Amazon S3 bucket where the data that you want to upload to
   * your dataset is stored.
   */
  public fun dataLocation(dataLocation: String) {
    cdkBuilder.dataLocation(dataLocation)
  }

  public fun build(): CfnDataset.DataSourceProperty = cdkBuilder.build()
}
