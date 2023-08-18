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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

/**
 * An object that determines whether any HTTP headers (and if so, which headers) are included in
 * requests that CloudFront sends to the origin.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * HeadersConfigProperty headersConfigProperty = HeadersConfigProperty.builder()
 * .headerBehavior("headerBehavior")
 * // the properties below are optional
 * .headers(List.of("headers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-headersconfig.html)
 */
@CdkDslMarker
public class CfnOriginRequestPolicyHeadersConfigPropertyDsl {
    private val cdkBuilder: CfnOriginRequestPolicy.HeadersConfigProperty.Builder =
        CfnOriginRequestPolicy.HeadersConfigProperty.builder()

    private val _headers: MutableList<String> = mutableListOf()

    /**
     * @param headerBehavior Determines whether any HTTP headers are included in requests that
     *   CloudFront sends to the origin. Valid values are:.
     * * `none` – No HTTP headers in viewer requests are included in requests that CloudFront sends
     *   to the origin. Even when this field is set to `none` , any headers that are listed in a
     *   `CachePolicy` *are* included in origin requests.
     * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
     *   requests that CloudFront sends to the origin.
     * * `allViewer` – All HTTP headers in viewer requests are included in requests that CloudFront
     *   sends to the origin.
     * * `allViewerAndWhitelistCloudFront` – All HTTP headers in viewer requests and the additional
     *   CloudFront headers that are listed in the `Headers` type are included in requests that
     *   CloudFront sends to the origin. The additional headers are added by CloudFront.
     * * `allExcept` – All HTTP headers in viewer requests are included in requests that CloudFront
     *   sends to the origin, **except** for those listed in the `Headers` type, which are not
     *   included.
     */
    public fun headerBehavior(headerBehavior: String) {
        cdkBuilder.headerBehavior(headerBehavior)
    }

    /** @param headers Contains a list of HTTP header names. */
    public fun headers(vararg headers: String) {
        _headers.addAll(listOf(*headers))
    }

    /** @param headers Contains a list of HTTP header names. */
    public fun headers(headers: Collection<String>) {
        _headers.addAll(headers)
    }

    public fun build(): CfnOriginRequestPolicy.HeadersConfigProperty {
        if (_headers.isNotEmpty()) cdkBuilder.headers(_headers)
        return cdkBuilder.build()
    }
}
