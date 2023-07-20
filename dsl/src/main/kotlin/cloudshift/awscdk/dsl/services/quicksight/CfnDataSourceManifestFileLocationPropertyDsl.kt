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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceManifestFileLocationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ManifestFileLocationProperty.Builder =
        CfnDataSource.ManifestFileLocationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnDataSource.ManifestFileLocationProperty = cdkBuilder.build()
}
