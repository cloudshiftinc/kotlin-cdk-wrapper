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

  public fun provisionedThroughput(provisionedThroughput: IResolvable) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  public
      fun provisionedThroughput(provisionedThroughput: CfnCluster.ProvisionedThroughputProperty) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun build(): CfnCluster.EBSStorageInfoProperty = cdkBuilder.build()
}
