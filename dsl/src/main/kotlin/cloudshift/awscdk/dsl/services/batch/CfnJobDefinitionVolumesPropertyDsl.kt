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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionVolumesPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.VolumesProperty.Builder =
        CfnJobDefinition.VolumesProperty.builder()

    public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
    }

    public fun efsVolumeConfiguration(efsVolumeConfiguration: CfnJobDefinition.EfsVolumeConfigurationProperty) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
    }

    public fun host(host: IResolvable) {
        cdkBuilder.host(host)
    }

    public fun host(host: CfnJobDefinition.VolumesHostProperty) {
        cdkBuilder.host(host)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnJobDefinition.VolumesProperty = cdkBuilder.build()
}
