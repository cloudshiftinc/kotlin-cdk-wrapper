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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensPrefixLevelPropertyDsl {
    private val cdkBuilder: CfnStorageLens.PrefixLevelProperty.Builder =
        CfnStorageLens.PrefixLevelProperty.builder()

    public fun storageMetrics(storageMetrics: IResolvable) {
        cdkBuilder.storageMetrics(storageMetrics)
    }

    public fun storageMetrics(storageMetrics: CfnStorageLens.PrefixLevelStorageMetricsProperty) {
        cdkBuilder.storageMetrics(storageMetrics)
    }

    public fun build(): CfnStorageLens.PrefixLevelProperty = cdkBuilder.build()
}
