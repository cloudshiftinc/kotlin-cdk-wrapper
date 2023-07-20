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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnDatastoreDatastoreStoragePropertyDsl {
    private val cdkBuilder: CfnDatastore.DatastoreStorageProperty.Builder =
        CfnDatastore.DatastoreStorageProperty.builder()

    public fun customerManagedS3(customerManagedS3: IResolvable) {
        cdkBuilder.customerManagedS3(customerManagedS3)
    }

    public fun customerManagedS3(customerManagedS3: CfnDatastore.CustomerManagedS3Property) {
        cdkBuilder.customerManagedS3(customerManagedS3)
    }

    public fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IResolvable) {
        cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage)
    }

    public fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: CfnDatastore.IotSiteWiseMultiLayerStorageProperty) {
        cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage)
    }

    public fun serviceManagedS3(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.serviceManagedS3(builder.map)
    }

    public fun serviceManagedS3(serviceManagedS3: Any) {
        cdkBuilder.serviceManagedS3(serviceManagedS3)
    }

    public fun build(): CfnDatastore.DatastoreStorageProperty = cdkBuilder.build()
}
