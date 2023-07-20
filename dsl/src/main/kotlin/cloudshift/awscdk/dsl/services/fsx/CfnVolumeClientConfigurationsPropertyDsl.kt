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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fsx.CfnVolume
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVolumeClientConfigurationsPropertyDsl {
    private val cdkBuilder: CfnVolume.ClientConfigurationsProperty.Builder =
        CfnVolume.ClientConfigurationsProperty.builder()

    private val _options: MutableList<String> = mutableListOf()

    public fun clients(clients: String) {
        cdkBuilder.clients(clients)
    }

    public fun options(vararg options: String) {
        _options.addAll(listOf(*options))
    }

    public fun options(options: Collection<String>) {
        _options.addAll(options)
    }

    public fun build(): CfnVolume.ClientConfigurationsProperty {
        if (_options.isNotEmpty()) cdkBuilder.options(_options)
        return cdkBuilder.build()
    }
}
