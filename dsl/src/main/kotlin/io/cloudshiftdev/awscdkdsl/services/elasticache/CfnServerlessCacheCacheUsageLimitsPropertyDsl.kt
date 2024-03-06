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

package io.cloudshiftdev.awscdkdsl.services.elasticache

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnServerlessCache

/**
 * The usage limits for storage and ElastiCache Processing Units for the cache.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CacheUsageLimitsProperty cacheUsageLimitsProperty = CacheUsageLimitsProperty.builder()
 * .dataStorage(DataStorageProperty.builder()
 * .maximum(123)
 * .unit("unit")
 * .build())
 * .ecpuPerSecond(ECPUPerSecondProperty.builder()
 * .maximum(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-cacheusagelimits.html)
 */
@CdkDslMarker
public class CfnServerlessCacheCacheUsageLimitsPropertyDsl {
    private val cdkBuilder: CfnServerlessCache.CacheUsageLimitsProperty.Builder =
        CfnServerlessCache.CacheUsageLimitsProperty.builder()

    /** @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes. */
    public fun dataStorage(dataStorage: IResolvable) {
        cdkBuilder.dataStorage(dataStorage)
    }

    /** @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes. */
    public fun dataStorage(dataStorage: CfnServerlessCache.DataStorageProperty) {
        cdkBuilder.dataStorage(dataStorage)
    }

    /**
     * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can consume
     *   per second.
     */
    public fun ecpuPerSecond(ecpuPerSecond: IResolvable) {
        cdkBuilder.ecpuPerSecond(ecpuPerSecond)
    }

    /**
     * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can consume
     *   per second.
     */
    public fun ecpuPerSecond(ecpuPerSecond: CfnServerlessCache.ECPUPerSecondProperty) {
        cdkBuilder.ecpuPerSecond(ecpuPerSecond)
    }

    public fun build(): CfnServerlessCache.CacheUsageLimitsProperty = cdkBuilder.build()
}
