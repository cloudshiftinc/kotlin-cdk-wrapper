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
import kotlin.Number
import software.amazon.awscdk.services.elasticache.CfnServerlessCache

/**
 * The configuration for the number of ElastiCache Processing Units (ECPU) the cache can consume per
 * second.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * ECPUPerSecondProperty eCPUPerSecondProperty = ECPUPerSecondProperty.builder()
 * .maximum(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-ecpupersecond.html)
 */
@CdkDslMarker
public class CfnServerlessCacheECPUPerSecondPropertyDsl {
    private val cdkBuilder: CfnServerlessCache.ECPUPerSecondProperty.Builder =
        CfnServerlessCache.ECPUPerSecondProperty.builder()

    /**
     * @param maximum The configuration for the maximum number of ECPUs the cache can consume per
     *   second.
     */
    public fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
    }

    public fun build(): CfnServerlessCache.ECPUPerSecondProperty = cdkBuilder.build()
}
