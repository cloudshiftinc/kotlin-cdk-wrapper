@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * Amazon S3 -customer-managed;
 *
 * When you choose customer-managed storage, the `retentionPeriod` parameter is ignored. You can't
 * change the choice of Amazon S3 storage after your data store is created.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * CustomerManagedS3StorageProperty customerManagedS3StorageProperty =
 * CustomerManagedS3StorageProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3storage.html)
 */
@CdkDslMarker
public class CfnDatastoreCustomerManagedS3StoragePropertyDsl {
    private val cdkBuilder: CfnDatastore.CustomerManagedS3StorageProperty.Builder =
        CfnDatastore.CustomerManagedS3StorageProperty.builder()

    /** @param bucket The name of the Amazon S3 bucket where your data is stored. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param keyPrefix (Optional) The prefix used to create the keys of the data store data
     *   objects. Each object in an Amazon S3 bucket has a key that is its unique identifier in the
     *   bucket. Each object in a bucket has exactly one key. The prefix must end with a forward
     *   slash (/).
     */
    public fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
    }

    public fun build(): CfnDatastore.CustomerManagedS3StorageProperty = cdkBuilder.build()
}
