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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * The policy directives and their values that CloudFront includes as values for the
 * `Content-Security-Policy` HTTP response header.
 *
 * For more information about the `Content-Security-Policy` HTTP response header, see
 * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
 * in the MDN Web Docs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ContentSecurityPolicyProperty contentSecurityPolicyProperty =
 * ContentSecurityPolicyProperty.builder()
 * .contentSecurityPolicy("contentSecurityPolicy")
 * .override(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contentsecuritypolicy.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyContentSecurityPolicyPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder =
        CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.builder()

    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes
     *   as values for the `Content-Security-Policy` HTTP response header.
     */
    public fun contentSecurityPolicy(contentSecurityPolicy: String) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     *   `Content-Security-Policy` HTTP response header received from the origin with the one
     *   specified in this response headers policy.
     */
    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     *   `Content-Security-Policy` HTTP response header received from the origin with the one
     *   specified in this response headers policy.
     */
    public fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`)
    }

    public fun build(): CfnResponseHeadersPolicy.ContentSecurityPolicyProperty = cdkBuilder.build()
}
