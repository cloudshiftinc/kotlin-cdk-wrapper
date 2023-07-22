@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterStorageInfoPropertyDsl {
  private val cdkBuilder: CfnCluster.StorageInfoProperty.Builder =
      CfnCluster.StorageInfoProperty.builder()

  /**
   * @param ebsStorageInfo EBS volume information.
   */
  public fun ebsStorageInfo(ebsStorageInfo: IResolvable) {
    cdkBuilder.ebsStorageInfo(ebsStorageInfo)
  }

  /**
   * @param ebsStorageInfo EBS volume information.
   */
  public fun ebsStorageInfo(ebsStorageInfo: CfnCluster.EBSStorageInfoProperty) {
    cdkBuilder.ebsStorageInfo(ebsStorageInfo)
  }

  public fun build(): CfnCluster.StorageInfoProperty = cdkBuilder.build()
}
