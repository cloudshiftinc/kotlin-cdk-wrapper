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
import software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior
import software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps
import software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior

/**
 * Properties for creating a Origin Request Policy.
 *
 * Example:
 * ```
 * // Creating a custom origin request policy for a Distribution -- all parameters optional
 * S3Origin bucketOrigin;
 * OriginRequestPolicy myOriginRequestPolicy = OriginRequestPolicy.Builder.create(this,
 * "OriginRequestPolicy")
 * .originRequestPolicyName("MyPolicy")
 * .comment("A default policy")
 * .cookieBehavior(OriginRequestCookieBehavior.none())
 * .headerBehavior(OriginRequestHeaderBehavior.all("CloudFront-Is-Android-Viewer"))
 * .queryStringBehavior(OriginRequestQueryStringBehavior.allowList("username"))
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .originRequestPolicy(myOriginRequestPolicy)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginRequestPolicyPropsDsl {
    private val cdkBuilder: OriginRequestPolicyProps.Builder = OriginRequestPolicyProps.builder()

    /** @param comment A comment to describe the origin request policy. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param cookieBehavior The cookies from viewer requests to include in origin requests. */
    public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
        cdkBuilder.cookieBehavior(cookieBehavior)
    }

    /**
     * @param headerBehavior The HTTP headers to include in origin requests. These can include
     *   headers from viewer requests and additional headers added by CloudFront.
     */
    public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
        cdkBuilder.headerBehavior(headerBehavior)
    }

    /**
     * @param originRequestPolicyName A unique name to identify the origin request policy. The name
     *   must only include '-', '_', or alphanumeric characters.
     */
    public fun originRequestPolicyName(originRequestPolicyName: String) {
        cdkBuilder.originRequestPolicyName(originRequestPolicyName)
    }

    /**
     * @param queryStringBehavior The URL query strings from viewer requests to include in origin
     *   requests.
     */
    public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
    }

    public fun build(): OriginRequestPolicyProps = cdkBuilder.build()
}
