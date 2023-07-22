@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Contains information about storage volumes attached to Amazon MSK broker nodes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * StorageInfoProperty storageInfoProperty = StorageInfoProperty.builder()
 * .ebsStorageInfo(EBSStorageInfoProperty.builder()
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .enabled(false)
 * .volumeThroughput(123)
 * .build())
 * .volumeSize(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html)
 */
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
