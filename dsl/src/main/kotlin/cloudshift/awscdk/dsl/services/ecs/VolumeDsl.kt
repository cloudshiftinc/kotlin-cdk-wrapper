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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
import software.amazon.awscdk.services.ecs.EfsVolumeConfiguration
import software.amazon.awscdk.services.ecs.Host
import software.amazon.awscdk.services.ecs.Volume
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class VolumeDsl {
    private val cdkBuilder: Volume.Builder = Volume.builder()

    public fun dockerVolumeConfiguration(block: DockerVolumeConfigurationDsl.() -> Unit = {}) {
        val builder = DockerVolumeConfigurationDsl()
        builder.apply(block)
        cdkBuilder.dockerVolumeConfiguration(builder.build())
    }

    public fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
    }

    public fun efsVolumeConfiguration(block: EfsVolumeConfigurationDsl.() -> Unit = {}) {
        val builder = EfsVolumeConfigurationDsl()
        builder.apply(block)
        cdkBuilder.efsVolumeConfiguration(builder.build())
    }

    public fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
    }

    public fun host(block: HostDsl.() -> Unit = {}) {
        val builder = HostDsl()
        builder.apply(block)
        cdkBuilder.host(builder.build())
    }

    public fun host(host: Host) {
        cdkBuilder.host(host)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): Volume = cdkBuilder.build()
}
