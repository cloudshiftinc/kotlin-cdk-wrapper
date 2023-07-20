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
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import kotlin.Number

@CdkDslMarker
public class CfnInstanceGroupConfigEbsBlockDeviceConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder =
        CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.builder()

    public fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    public fun volumeSpecification(volumeSpecification: CfnInstanceGroupConfig.VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    public fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
    }

    public fun build(): CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
