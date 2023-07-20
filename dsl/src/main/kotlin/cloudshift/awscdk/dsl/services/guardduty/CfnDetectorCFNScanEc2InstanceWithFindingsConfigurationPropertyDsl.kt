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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector
import kotlin.Boolean

@CdkDslMarker
public class CfnDetectorCFNScanEc2InstanceWithFindingsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder =
        CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()

    public fun ebsVolumes(ebsVolumes: Boolean) {
        cdkBuilder.ebsVolumes(ebsVolumes)
    }

    public fun ebsVolumes(ebsVolumes: IResolvable) {
        cdkBuilder.ebsVolumes(ebsVolumes)
    }

    public fun build(): CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty =
        cdkBuilder.build()
}
