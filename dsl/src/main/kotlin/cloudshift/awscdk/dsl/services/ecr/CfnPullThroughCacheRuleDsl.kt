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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnPullThroughCacheRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPullThroughCacheRule.Builder =
        CfnPullThroughCacheRule.Builder.create(scope, id)

    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
        cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
    }

    public fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
        cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
    }

    public fun build(): CfnPullThroughCacheRule = cdkBuilder.build()
}
