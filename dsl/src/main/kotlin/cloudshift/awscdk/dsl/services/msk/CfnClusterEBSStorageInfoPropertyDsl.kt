@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterEBSStorageInfoPropertyDsl {
  private val cdkBuilder: CfnCluster.EBSStorageInfoProperty.Builder =
      CfnCluster.EBSStorageInfoProperty.builder()

  /**
   * @param provisionedThroughput EBS volume provisioned throughput information.
   */
  public fun provisionedThroughput(provisionedThroughput: IResolvable) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  /**
   * @param provisionedThroughput EBS volume provisioned throughput information.
   */
  public
      fun provisionedThroughput(provisionedThroughput: CfnCluster.ProvisionedThroughputProperty) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  /**
   * @param volumeSize The size in GiB of the EBS volume for the data drive on each broker node.
   */
  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun build(): CfnCluster.EBSStorageInfoProperty = cdkBuilder.build()
}
