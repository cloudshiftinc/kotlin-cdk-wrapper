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

  /**
   * @param computeType The type of the compute resource used to execute the `containerAction` . 
   * Possible values are: `ACU_1` (vCPU=4, memory=16 GiB) or `ACU_2` (vCPU=8, memory=32 GiB).
   */
  public fun computeType(computeType: String) {
    cdkBuilder.computeType(computeType)
  }

  /**
   * @param volumeSizeInGb The size, in GB, of the persistent storage available to the resource
   * instance used to execute the `containerAction` (min: 1, max: 50). 
   */
  public fun volumeSizeInGb(volumeSizeInGb: Number) {
    cdkBuilder.volumeSizeInGb(volumeSizeInGb)
  }

  public fun build(): CfnDataset.ResourceConfigurationProperty = cdkBuilder.build()
}
