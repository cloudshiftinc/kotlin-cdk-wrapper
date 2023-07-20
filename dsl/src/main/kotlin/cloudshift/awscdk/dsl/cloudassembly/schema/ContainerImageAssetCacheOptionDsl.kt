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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class ContainerImageAssetCacheOptionDsl {
    private val cdkBuilder: ContainerImageAssetCacheOption.Builder =
        ContainerImageAssetCacheOption.builder()

    public fun params(params: Map<String, String>) {
        cdkBuilder.params(params)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): ContainerImageAssetCacheOption = cdkBuilder.build()
}
