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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Details on S3 location for error reports that result from running a query.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .encryptionOption("encryptionOption")
 * .objectKeyPrefix("objectKeyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-s3configuration.html)
 */
@CdkDslMarker
public class CfnScheduledQueryS3ConfigurationPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.S3ConfigurationProperty.Builder =
        CfnScheduledQuery.S3ConfigurationProperty.builder()

    /** @param bucketName Name of the S3 bucket under which error reports will be created. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param encryptionOption Encryption at rest options for the error reports. If no encryption
     *   option is specified, Timestream will choose SSE_S3 as default.
     */
    public fun encryptionOption(encryptionOption: String) {
        cdkBuilder.encryptionOption(encryptionOption)
    }

    /**
     * @param objectKeyPrefix Prefix for the error report key. Timestream by default adds the
     *   following prefix to the error report path.
     */
    public fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    public fun build(): CfnScheduledQuery.S3ConfigurationProperty = cdkBuilder.build()
}
