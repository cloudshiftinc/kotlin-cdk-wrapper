@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.guardduty

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Describes whether Malware Protection for EC2 instances with findings will be enabled as a data
 * source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CFNScanEc2InstanceWithFindingsConfigurationProperty
 * cFNScanEc2InstanceWithFindingsConfigurationProperty =
 * CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
 * .ebsVolumes(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnscanec2instancewithfindingsconfiguration.html)
 */
@CdkDslMarker
public class CfnDetectorCFNScanEc2InstanceWithFindingsConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder =
        CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()

    /** @param ebsVolumes Describes the configuration for scanning EBS volumes as data source. */
    public fun ebsVolumes(ebsVolumes: Boolean) {
        cdkBuilder.ebsVolumes(ebsVolumes)
    }

    /** @param ebsVolumes Describes the configuration for scanning EBS volumes as data source. */
    public fun ebsVolumes(ebsVolumes: IResolvable) {
        cdkBuilder.ebsVolumes(ebsVolumes)
    }

    public fun build(): CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty =
        cdkBuilder.build()
}
