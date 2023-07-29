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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies whether detailed monitoring is enabled for an instance.
 *
 * For more information about detailed monitoring, see
 * [Enable or turn off detailed monitoring for your instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
 * in the *Amazon EC2 User Guide* .
 *
 * `Monitoring` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * MonitoringProperty monitoringProperty = MonitoringProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-monitoring.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateMonitoringPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.MonitoringProperty.Builder =
        CfnLaunchTemplate.MonitoringProperty.builder()

    /**
     * @param enabled Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is
     *   enabled.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is
     *   enabled.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnLaunchTemplate.MonitoringProperty = cdkBuilder.build()
}
