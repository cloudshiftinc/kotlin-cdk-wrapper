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

package io.cloudshiftdev.awscdkdsl.services.b2bi

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.b2bi.CfnCapability

/**
 * Specifies the details for the Amazon S3 file location that is being used with AWS B2BI Data
 * Interchange.
 *
 * File locations in Amazon S3 are identified using a combination of the bucket and key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-s3location.html)
 */
@CdkDslMarker
public class CfnCapabilityS3LocationPropertyDsl {
    private val cdkBuilder: CfnCapability.S3LocationProperty.Builder =
        CfnCapability.S3LocationProperty.builder()

    /** @param bucketName Specifies the name of the Amazon S3 bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param key Specifies the Amazon S3 key for the file location. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnCapability.S3LocationProperty = cdkBuilder.build()
}
