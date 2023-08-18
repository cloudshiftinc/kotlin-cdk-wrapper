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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * LegacyS3OriginProperty legacyS3OriginProperty = LegacyS3OriginProperty.builder()
 * .dnsName("dnsName")
 * // the properties below are optional
 * .originAccessIdentity("originAccessIdentity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacys3origin.html)
 */
@CdkDslMarker
public class CfnDistributionLegacyS3OriginPropertyDsl {
    private val cdkBuilder: CfnDistribution.LegacyS3OriginProperty.Builder =
        CfnDistribution.LegacyS3OriginProperty.builder()

    /** @param dnsName the value to be set. */
    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    /** @param originAccessIdentity the value to be set. */
    public fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
    }

    public fun build(): CfnDistribution.LegacyS3OriginProperty = cdkBuilder.build()
}
