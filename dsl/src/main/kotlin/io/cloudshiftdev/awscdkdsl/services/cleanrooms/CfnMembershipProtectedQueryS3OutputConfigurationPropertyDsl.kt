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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cleanrooms.CfnMembership

/**
 * Contains the configuration to write the query results to S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * ProtectedQueryS3OutputConfigurationProperty protectedQueryS3OutputConfigurationProperty =
 * ProtectedQueryS3OutputConfigurationProperty.builder()
 * .bucket("bucket")
 * .resultFormat("resultFormat")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html)
 */
@CdkDslMarker
public class CfnMembershipProtectedQueryS3OutputConfigurationPropertyDsl {
    private val cdkBuilder: CfnMembership.ProtectedQueryS3OutputConfigurationProperty.Builder =
        CfnMembership.ProtectedQueryS3OutputConfigurationProperty.builder()

    /** @param bucket The S3 bucket to unload the protected query results. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param keyPrefix The S3 prefix to unload the protected query results. */
    public fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
    }

    /** @param resultFormat Intended file format of the result. */
    public fun resultFormat(resultFormat: String) {
        cdkBuilder.resultFormat(resultFormat)
    }

    public fun build(): CfnMembership.ProtectedQueryS3OutputConfigurationProperty =
        cdkBuilder.build()
}
