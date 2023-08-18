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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnTable

/**
 * The location to write error reports for records rejected, asynchronously, during magnetic store
 * writes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * MagneticStoreRejectedDataLocationProperty magneticStoreRejectedDataLocationProperty =
 * MagneticStoreRejectedDataLocationProperty.builder()
 * .s3Configuration(S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .objectKeyPrefix("objectKeyPrefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorerejecteddatalocation.html)
 */
@CdkDslMarker
public class CfnTableMagneticStoreRejectedDataLocationPropertyDsl {
    private val cdkBuilder: CfnTable.MagneticStoreRejectedDataLocationProperty.Builder =
        CfnTable.MagneticStoreRejectedDataLocationProperty.builder()

    /**
     * @param s3Configuration Configuration of an S3 location to write error reports for records
     *   rejected, asynchronously, during magnetic store writes.
     */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /**
     * @param s3Configuration Configuration of an S3 location to write error reports for records
     *   rejected, asynchronously, during magnetic store writes.
     */
    public fun s3Configuration(s3Configuration: CfnTable.S3ConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun build(): CfnTable.MagneticStoreRejectedDataLocationProperty = cdkBuilder.build()
}
