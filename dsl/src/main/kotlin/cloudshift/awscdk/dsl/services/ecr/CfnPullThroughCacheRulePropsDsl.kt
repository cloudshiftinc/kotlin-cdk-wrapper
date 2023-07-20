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
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps
import kotlin.String

@CdkDslMarker
public class CfnPullThroughCacheRulePropsDsl {
    private val cdkBuilder: CfnPullThroughCacheRuleProps.Builder =
        CfnPullThroughCacheRuleProps.builder()

    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
        cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
    }

    public fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
        cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
    }

    public fun build(): CfnPullThroughCacheRuleProps = cdkBuilder.build()
}
