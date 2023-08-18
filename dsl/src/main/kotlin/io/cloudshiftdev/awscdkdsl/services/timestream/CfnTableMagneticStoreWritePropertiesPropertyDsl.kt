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

package io.cloudshiftdev.awscdkdsl.services.timestream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnTable

/**
 * The set of properties on a table for configuring magnetic store writes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * MagneticStoreWritePropertiesProperty magneticStoreWritePropertiesProperty =
 * MagneticStoreWritePropertiesProperty.builder()
 * .enableMagneticStoreWrites(false)
 * // the properties below are optional
 * .magneticStoreRejectedDataLocation(MagneticStoreRejectedDataLocationProperty.builder()
 * .s3Configuration(S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .objectKeyPrefix("objectKeyPrefix")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorewriteproperties.html)
 */
@CdkDslMarker
public class CfnTableMagneticStoreWritePropertiesPropertyDsl {
    private val cdkBuilder: CfnTable.MagneticStoreWritePropertiesProperty.Builder =
        CfnTable.MagneticStoreWritePropertiesProperty.builder()

    /** @param enableMagneticStoreWrites A flag to enable magnetic store writes. */
    public fun enableMagneticStoreWrites(enableMagneticStoreWrites: Boolean) {
        cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
    }

    /** @param enableMagneticStoreWrites A flag to enable magnetic store writes. */
    public fun enableMagneticStoreWrites(enableMagneticStoreWrites: IResolvable) {
        cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
    }

    /**
     * @param magneticStoreRejectedDataLocation The location to write error reports for records
     *   rejected asynchronously during magnetic store writes.
     */
    public fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: IResolvable) {
        cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation)
    }

    /**
     * @param magneticStoreRejectedDataLocation The location to write error reports for records
     *   rejected asynchronously during magnetic store writes.
     */
    public fun magneticStoreRejectedDataLocation(
        magneticStoreRejectedDataLocation: CfnTable.MagneticStoreRejectedDataLocationProperty
    ) {
        cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation)
    }

    public fun build(): CfnTable.MagneticStoreWritePropertiesProperty = cdkBuilder.build()
}
