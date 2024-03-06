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
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnServerlessCache

/**
 * The data storage limit.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * DataStorageProperty dataStorageProperty = DataStorageProperty.builder()
 * .maximum(123)
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-datastorage.html)
 */
@CdkDslMarker
public class CfnServerlessCacheDataStoragePropertyDsl {
    private val cdkBuilder: CfnServerlessCache.DataStorageProperty.Builder =
        CfnServerlessCache.DataStorageProperty.builder()

    /** @param maximum The upper limit for data storage the cache is set to use. */
    public fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
    }

    /** @param unit The unit that the storage is measured in, in GB. */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnServerlessCache.DataStorageProperty = cdkBuilder.build()
}
