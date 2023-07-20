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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVolumeNfsExportsPropertyDsl {
    private val cdkBuilder: CfnVolume.NfsExportsProperty.Builder =
        CfnVolume.NfsExportsProperty.builder()

    private val _clientConfigurations: MutableList<Any> = mutableListOf()

    public fun clientConfigurations(vararg clientConfigurations: Any) {
        _clientConfigurations.addAll(listOf(*clientConfigurations))
    }

    public fun clientConfigurations(clientConfigurations: Collection<Any>) {
        _clientConfigurations.addAll(clientConfigurations)
    }

    public fun clientConfigurations(clientConfigurations: IResolvable) {
        cdkBuilder.clientConfigurations(clientConfigurations)
    }

    public fun build(): CfnVolume.NfsExportsProperty {
        if (_clientConfigurations.isNotEmpty()) cdkBuilder.clientConfigurations(_clientConfigurations)
        return cdkBuilder.build()
    }
}
