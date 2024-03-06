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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnMembership

/**
 * Contains configurations for protected query results.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * MembershipProtectedQueryOutputConfigurationProperty
 * membershipProtectedQueryOutputConfigurationProperty =
 * MembershipProtectedQueryOutputConfigurationProperty.builder()
 * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
 * .bucket("bucket")
 * .resultFormat("resultFormat")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryoutputconfiguration.html)
 */
@CdkDslMarker
public class CfnMembershipMembershipProtectedQueryOutputConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.Builder =
        CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.builder()

    /** @param s3 Required configuration for a protected query with an `S3` output type. */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /** @param s3 Required configuration for a protected query with an `S3` output type. */
    public fun s3(s3: CfnMembership.ProtectedQueryS3OutputConfigurationProperty) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnMembership.MembershipProtectedQueryOutputConfigurationProperty =
        cdkBuilder.build()
}
