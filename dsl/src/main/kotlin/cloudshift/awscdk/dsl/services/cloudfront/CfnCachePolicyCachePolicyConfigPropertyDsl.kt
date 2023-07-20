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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnCachePolicyCachePolicyConfigPropertyDsl {
    private val cdkBuilder: CfnCachePolicy.CachePolicyConfigProperty.Builder =
        CfnCachePolicy.CachePolicyConfigProperty.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    public fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
    }

    public fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: IResolvable) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin)
    }

    public fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin)
    }

    public fun build(): CfnCachePolicy.CachePolicyConfigProperty = cdkBuilder.build()
}
