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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appsync.CfnResolver

/**
 * The caching configuration for a resolver that has caching activated.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CachingConfigProperty cachingConfigProperty = CachingConfigProperty.builder()
 * .ttl(123)
 * // the properties below are optional
 * .cachingKeys(List.of("cachingKeys"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html)
 */
@CdkDslMarker
public class CfnResolverCachingConfigPropertyDsl {
    private val cdkBuilder: CfnResolver.CachingConfigProperty.Builder =
        CfnResolver.CachingConfigProperty.builder()

    private val _cachingKeys: MutableList<String> = mutableListOf()

    /**
     * @param cachingKeys The caching keys for a resolver that has caching activated. Valid values
     *   are entries from the `$context.arguments` , `$context.source` , and `$context.identity`
     *   maps.
     */
    public fun cachingKeys(vararg cachingKeys: String) {
        _cachingKeys.addAll(listOf(*cachingKeys))
    }

    /**
     * @param cachingKeys The caching keys for a resolver that has caching activated. Valid values
     *   are entries from the `$context.arguments` , `$context.source` , and `$context.identity`
     *   maps.
     */
    public fun cachingKeys(cachingKeys: Collection<String>) {
        _cachingKeys.addAll(cachingKeys)
    }

    /**
     * @param ttl The TTL in seconds for a resolver that has caching activated. Valid values are
     *   1–3,600 seconds.
     */
    public fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CfnResolver.CachingConfigProperty {
        if (_cachingKeys.isNotEmpty()) cdkBuilder.cachingKeys(_cachingKeys)
        return cdkBuilder.build()
    }
}
