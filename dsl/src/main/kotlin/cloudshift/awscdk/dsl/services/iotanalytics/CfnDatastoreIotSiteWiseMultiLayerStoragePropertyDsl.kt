@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreIotSiteWiseMultiLayerStoragePropertyDsl {
    private val cdkBuilder: CfnDatastore.IotSiteWiseMultiLayerStorageProperty.Builder =
        CfnDatastore.IotSiteWiseMultiLayerStorageProperty.builder()

    public fun customerManagedS3Storage(customerManagedS3Storage: IResolvable) {
        cdkBuilder.customerManagedS3Storage(customerManagedS3Storage)
    }

    public fun customerManagedS3Storage(customerManagedS3Storage: CfnDatastore.CustomerManagedS3StorageProperty) {
        cdkBuilder.customerManagedS3Storage(customerManagedS3Storage)
    }

    public fun build(): CfnDatastore.IotSiteWiseMultiLayerStorageProperty = cdkBuilder.build()
}
