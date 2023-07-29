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
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior
import software.constructs.Construct

/**
 * A Origin Request Policy configuration.
 *
 * Example:
 * ```
 * // Using an existing origin request policy for a Distribution
 * S3Origin bucketOrigin;
 * Distribution.Builder.create(this, "myDistManagedPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .originRequestPolicy(OriginRequestPolicy.CORS_S3_ORIGIN)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginRequestPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: OriginRequestPolicy.Builder =
        OriginRequestPolicy.Builder.create(scope, id)

    /**
     * A comment to describe the origin request policy.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the origin request policy.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * The cookies from viewer requests to include in origin requests.
     *
     * Default: OriginRequestCookieBehavior.none()
     *
     * @param cookieBehavior The cookies from viewer requests to include in origin requests.
     */
    public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
        cdkBuilder.cookieBehavior(cookieBehavior)
    }

    /**
     * The HTTP headers to include in origin requests.
     *
     * These can include headers from viewer requests and additional headers added by CloudFront.
     *
     * Default: OriginRequestHeaderBehavior.none()
     *
     * @param headerBehavior The HTTP headers to include in origin requests.
     */
    public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
        cdkBuilder.headerBehavior(headerBehavior)
    }

    /**
     * A unique name to identify the origin request policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     *
     * @param originRequestPolicyName A unique name to identify the origin request policy.
     */
    public fun originRequestPolicyName(originRequestPolicyName: String) {
        cdkBuilder.originRequestPolicyName(originRequestPolicyName)
    }

    /**
     * The URL query strings from viewer requests to include in origin requests.
     *
     * Default: OriginRequestQueryStringBehavior.none()
     *
     * @param queryStringBehavior The URL query strings from viewer requests to include in origin
     *   requests.
     */
    public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
    }

    public fun build(): OriginRequestPolicy = cdkBuilder.build()
}
