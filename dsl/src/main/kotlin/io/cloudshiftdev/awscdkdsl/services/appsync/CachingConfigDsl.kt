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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appsync.CachingConfig

/**
 * CachingConfig for AppSync resolvers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.appsync.*;
 * CachingConfig cachingConfig = CachingConfig.builder()
 * .ttl(Duration.minutes(30))
 * // the properties below are optional
 * .cachingKeys(List.of("cachingKeys"))
 * .build();
 * ```
 */
@CdkDslMarker
public class CachingConfigDsl {
    private val cdkBuilder: CachingConfig.Builder = CachingConfig.builder()

    private val _cachingKeys: MutableList<String> = mutableListOf()

    /**
     * @param cachingKeys The caching keys for a resolver that has caching enabled. Valid values are
     *   entries from the $context.arguments, $context.source, and $context.identity maps.
     */
    public fun cachingKeys(vararg cachingKeys: String) {
        _cachingKeys.addAll(listOf(*cachingKeys))
    }

    /**
     * @param cachingKeys The caching keys for a resolver that has caching enabled. Valid values are
     *   entries from the $context.arguments, $context.source, and $context.identity maps.
     */
    public fun cachingKeys(cachingKeys: Collection<String>) {
        _cachingKeys.addAll(cachingKeys)
    }

    /**
     * @param ttl The TTL in seconds for a resolver that has caching enabled. Valid values are
     *   between 1 and 3600 seconds.
     */
    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CachingConfig {
        if (_cachingKeys.isNotEmpty()) cdkBuilder.cachingKeys(_cachingKeys)
        return cdkBuilder.build()
    }
}
