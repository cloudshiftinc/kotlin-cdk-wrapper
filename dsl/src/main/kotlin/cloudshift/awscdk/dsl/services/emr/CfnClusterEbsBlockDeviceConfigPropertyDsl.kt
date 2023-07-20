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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Number

@CdkDslMarker
public class CfnClusterEbsBlockDeviceConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.EbsBlockDeviceConfigProperty.Builder =
        CfnCluster.EbsBlockDeviceConfigProperty.builder()

    public fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    public fun volumeSpecification(volumeSpecification: CfnCluster.VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    public fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
    }

    public fun build(): CfnCluster.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
