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

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataIntegrationFileConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataIntegration.FileConfigurationProperty.Builder =
        CfnDataIntegration.FileConfigurationProperty.builder()

    private val _folders: MutableList<String> = mutableListOf()

    public fun filters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.filters(builder.map)
    }

    public fun filters(filters: Any) {
        cdkBuilder.filters(filters)
    }

    public fun folders(vararg folders: String) {
        _folders.addAll(listOf(*folders))
    }

    public fun folders(folders: Collection<String>) {
        _folders.addAll(folders)
    }

    public fun build(): CfnDataIntegration.FileConfigurationProperty {
        if (_folders.isNotEmpty()) cdkBuilder.folders(_folders)
        return cdkBuilder.build()
    }
}
