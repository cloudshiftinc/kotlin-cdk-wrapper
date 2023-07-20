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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLayerVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnLayer.VolumeConfigurationProperty.Builder =
        CfnLayer.VolumeConfigurationProperty.builder()

    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
    }

    public fun numberOfDisks(numberOfDisks: Number) {
        cdkBuilder.numberOfDisks(numberOfDisks)
    }

    public fun raidLevel(raidLevel: Number) {
        cdkBuilder.raidLevel(raidLevel)
    }

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnLayer.VolumeConfigurationProperty = cdkBuilder.build()
}
