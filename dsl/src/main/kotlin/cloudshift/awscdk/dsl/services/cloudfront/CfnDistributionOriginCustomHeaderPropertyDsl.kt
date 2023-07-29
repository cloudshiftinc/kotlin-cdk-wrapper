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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex type that contains `HeaderName` and `HeaderValue` elements, if any, for this
 * distribution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginCustomHeaderProperty originCustomHeaderProperty = OriginCustomHeaderProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html)
 */
@CdkDslMarker
public class CfnDistributionOriginCustomHeaderPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginCustomHeaderProperty.Builder =
        CfnDistribution.OriginCustomHeaderProperty.builder()

    /**
     * @param headerName The name of a header that you want CloudFront to send to your origin. For
     *   more information, see
     *   [Adding Custom Headers to Origin Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    /** @param headerValue The value for the header that you specified in the `HeaderName` field. */
    public fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
    }

    public fun build(): CfnDistribution.OriginCustomHeaderProperty = cdkBuilder.build()
}
