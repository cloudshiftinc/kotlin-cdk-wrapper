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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CfnResolver
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResolverCachingConfigPropertyDsl {
    private val cdkBuilder: CfnResolver.CachingConfigProperty.Builder =
        CfnResolver.CachingConfigProperty.builder()

    private val _cachingKeys: MutableList<String> = mutableListOf()

    public fun cachingKeys(vararg cachingKeys: String) {
        _cachingKeys.addAll(listOf(*cachingKeys))
    }

    public fun cachingKeys(cachingKeys: Collection<String>) {
        _cachingKeys.addAll(cachingKeys)
    }

    public fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CfnResolver.CachingConfigProperty {
        if (_cachingKeys.isNotEmpty()) cdkBuilder.cachingKeys(_cachingKeys)
        return cdkBuilder.build()
    }
}
