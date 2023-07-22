@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreDatastoreStoragePropertyDsl {
  private val cdkBuilder: CfnDatastore.DatastoreStorageProperty.Builder =
      CfnDatastore.DatastoreStorageProperty.builder()

  /**
   * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
   * The choice of service-managed or customer-managed S3 storage cannot be changed after creation
   * of the data store.
   */
  public fun customerManagedS3(customerManagedS3: IResolvable) {
    cdkBuilder.customerManagedS3(customerManagedS3)
  }

  /**
   * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
   * The choice of service-managed or customer-managed S3 storage cannot be changed after creation
   * of the data store.
   */
  public fun customerManagedS3(customerManagedS3: CfnDatastore.CustomerManagedS3Property) {
    cdkBuilder.customerManagedS3(customerManagedS3)
  }

  /**
   * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
   * Amazon S3 bucket that you manage.
   * You can't change the choice of Amazon S3 storage after your data store is created.
   */
  public fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IResolvable) {
    cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage)
  }

  /**
   * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
   * Amazon S3 bucket that you manage.
   * You can't change the choice of Amazon S3 storage after your data store is created.
   */
  public
      fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: CfnDatastore.IotSiteWiseMultiLayerStorageProperty) {
    cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage)
  }

  /**
   * @param serviceManagedS3 Use this to store data store data in an S3 bucket managed by the AWS
   * IoT Analytics service.
   * The choice of service-managed or customer-managed S3 storage cannot be changed after creation
   * of the data store.
   */
  public fun serviceManagedS3(serviceManagedS3: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(serviceManagedS3)
    cdkBuilder.serviceManagedS3(builder.map)
  }

  /**
   * @param serviceManagedS3 Use this to store data store data in an S3 bucket managed by the AWS
   * IoT Analytics service.
   * The choice of service-managed or customer-managed S3 storage cannot be changed after creation
   * of the data store.
   */
  public fun serviceManagedS3(serviceManagedS3: Any) {
    cdkBuilder.serviceManagedS3(serviceManagedS3)
  }

  public fun build(): CfnDatastore.DatastoreStorageProperty = cdkBuilder.build()
}
