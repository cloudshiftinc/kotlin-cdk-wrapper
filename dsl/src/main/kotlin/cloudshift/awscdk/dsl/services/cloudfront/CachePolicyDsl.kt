@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.CacheCookieBehavior
import software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior
import software.amazon.awscdk.services.cloudfront.CachePolicy
import software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CachePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CachePolicy.Builder = CachePolicy.Builder.create(scope, id)

    public fun cachePolicyName(cachePolicyName: String) {
        cdkBuilder.cachePolicyName(cachePolicyName)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun cookieBehavior(cookieBehavior: CacheCookieBehavior) {
        cdkBuilder.cookieBehavior(cookieBehavior)
    }

    public fun defaultTtl(defaultTtl: Duration) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
    }

    public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
    }

    public fun headerBehavior(headerBehavior: CacheHeaderBehavior) {
        cdkBuilder.headerBehavior(headerBehavior)
    }

    public fun maxTtl(maxTtl: Duration) {
        cdkBuilder.maxTtl(maxTtl)
    }

    public fun minTtl(minTtl: Duration) {
        cdkBuilder.minTtl(minTtl)
    }

    public fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
    }

    public fun build(): CachePolicy = cdkBuilder.build()
}
