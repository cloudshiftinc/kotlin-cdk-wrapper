@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetResourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataset.ResourceConfigurationProperty.Builder =
      CfnDataset.ResourceConfigurationProperty.builder()

  public fun computeType(computeType: String) {
    cdkBuilder.computeType(computeType)
  }

  public fun volumeSizeInGb(volumeSizeInGb: Number) {
    cdkBuilder.volumeSizeInGb(volumeSizeInGb)
  }

  public fun build(): CfnDataset.ResourceConfigurationProperty = cdkBuilder.build()
}
