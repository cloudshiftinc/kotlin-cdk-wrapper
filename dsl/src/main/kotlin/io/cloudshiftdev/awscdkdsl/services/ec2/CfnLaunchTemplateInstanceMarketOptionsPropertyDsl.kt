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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies the market (purchasing) option for an instance.
 *
 * `InstanceMarketOptions` is a property of the
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InstanceMarketOptionsProperty instanceMarketOptionsProperty =
 * InstanceMarketOptionsProperty.builder()
 * .marketType("marketType")
 * .spotOptions(SpotOptionsProperty.builder()
 * .blockDurationMinutes(123)
 * .instanceInterruptionBehavior("instanceInterruptionBehavior")
 * .maxPrice("maxPrice")
 * .spotInstanceType("spotInstanceType")
 * .validUntil("validUntil")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancemarketoptions.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateInstanceMarketOptionsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.InstanceMarketOptionsProperty.Builder =
        CfnLaunchTemplate.InstanceMarketOptionsProperty.builder()

    /** @param marketType The market type. */
    public fun marketType(marketType: String) {
        cdkBuilder.marketType(marketType)
    }

    /** @param spotOptions The options for Spot Instances. */
    public fun spotOptions(spotOptions: IResolvable) {
        cdkBuilder.spotOptions(spotOptions)
    }

    /** @param spotOptions The options for Spot Instances. */
    public fun spotOptions(spotOptions: CfnLaunchTemplate.SpotOptionsProperty) {
        cdkBuilder.spotOptions(spotOptions)
    }

    public fun build(): CfnLaunchTemplate.InstanceMarketOptionsProperty = cdkBuilder.build()
}
