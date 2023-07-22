@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * Stores data used by AWS IoT SiteWise in an Amazon S3 bucket that you manage.
 *
 * You can't change the choice of Amazon S3 storage after your data store is created.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * IotSiteWiseMultiLayerStorageProperty iotSiteWiseMultiLayerStorageProperty =
 * IotSiteWiseMultiLayerStorageProperty.builder()
 * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-iotsitewisemultilayerstorage.html)
 */
@CdkDslMarker
public class CfnDatastoreIotSiteWiseMultiLayerStoragePropertyDsl {
  private val cdkBuilder: CfnDatastore.IotSiteWiseMultiLayerStorageProperty.Builder =
      CfnDatastore.IotSiteWiseMultiLayerStorageProperty.builder()

  /**
   * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
   * that you manage.
   */
  public fun customerManagedS3Storage(customerManagedS3Storage: IResolvable) {
    cdkBuilder.customerManagedS3Storage(customerManagedS3Storage)
  }

  /**
   * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
   * that you manage.
   */
  public
      fun customerManagedS3Storage(customerManagedS3Storage: CfnDatastore.CustomerManagedS3StorageProperty) {
    cdkBuilder.customerManagedS3Storage(customerManagedS3Storage)
  }

  public fun build(): CfnDatastore.IotSiteWiseMultiLayerStorageProperty = cdkBuilder.build()
}
