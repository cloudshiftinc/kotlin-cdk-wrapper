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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * Determines whether CloudFront includes the `X-XSS-Protection` HTTP response header and the
 * header's value.
 *
 * For more information about the `X-XSS-Protection` HTTP response header, see
 * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
 * in the MDN Web Docs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * XSSProtectionProperty xSSProtectionProperty = XSSProtectionProperty.builder()
 * .override(false)
 * .protection(false)
 * // the properties below are optional
 * .modeBlock(false)
 * .reportUri("reportUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyXSSProtectionPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.XSSProtectionProperty.Builder =
        CfnResponseHeadersPolicy.XSSProtectionProperty.builder()

    /**
     * @param modeBlock A Boolean that determines whether CloudFront includes the `mode=block`
     *   directive in the `X-XSS-Protection` header. For more information about this directive, see
     *   [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     *   in the MDN Web Docs.
     */
    public fun modeBlock(modeBlock: Boolean) {
        cdkBuilder.modeBlock(modeBlock)
    }

    /**
     * @param modeBlock A Boolean that determines whether CloudFront includes the `mode=block`
     *   directive in the `X-XSS-Protection` header. For more information about this directive, see
     *   [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     *   in the MDN Web Docs.
     */
    public fun modeBlock(modeBlock: IResolvable) {
        cdkBuilder.modeBlock(modeBlock)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the `X-XSS-Protection`
     *   HTTP response header received from the origin with the one specified in this response
     *   headers policy.
     */
    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the `X-XSS-Protection`
     *   HTTP response header received from the origin with the one specified in this response
     *   headers policy.
     */
    public fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`)
    }

    /**
     * @param protection A Boolean that determines the value of the `X-XSS-Protection` HTTP response
     *   header. When this setting is `true` , the value of the `X-XSS-Protection` header is `1` .
     *   When this setting is `false` , the value of the `X-XSS-Protection` header is `0` .
     *
     * For more information about these settings, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     */
    public fun protection(protection: Boolean) {
        cdkBuilder.protection(protection)
    }

    /**
     * @param protection A Boolean that determines the value of the `X-XSS-Protection` HTTP response
     *   header. When this setting is `true` , the value of the `X-XSS-Protection` header is `1` .
     *   When this setting is `false` , the value of the `X-XSS-Protection` header is `0` .
     *
     * For more information about these settings, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     */
    public fun protection(protection: IResolvable) {
        cdkBuilder.protection(protection)
    }

    /**
     * @param reportUri A reporting URI, which CloudFront uses as the value of the `report`
     *   directive in the `X-XSS-Protection` header. You cannot specify a `ReportUri` when
     *   `ModeBlock` is `true` .
     *
     * For more information about using a reporting URL, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     */
    public fun reportUri(reportUri: String) {
        cdkBuilder.reportUri(reportUri)
    }

    public fun build(): CfnResponseHeadersPolicy.XSSProtectionProperty = cdkBuilder.build()
}
