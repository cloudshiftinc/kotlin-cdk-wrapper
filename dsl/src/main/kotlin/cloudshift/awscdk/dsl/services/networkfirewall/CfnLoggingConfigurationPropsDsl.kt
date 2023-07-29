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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps

/**
 * Properties for defining a `CfnLoggingConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnLoggingConfigurationProps cfnLoggingConfigurationProps =
 * CfnLoggingConfigurationProps.builder()
 * .firewallArn("firewallArn")
 * .loggingConfiguration(LoggingConfigurationProperty.builder()
 * .logDestinationConfigs(List.of(LogDestinationConfigProperty.builder()
 * .logDestination(Map.of(
 * "logDestinationKey", "logDestination"))
 * .logDestinationType("logDestinationType")
 * .logType("logType")
 * .build()))
 * .build())
 * // the properties below are optional
 * .firewallName("firewallName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationPropsDsl {
    private val cdkBuilder: CfnLoggingConfigurationProps.Builder =
        CfnLoggingConfigurationProps.builder()

    /**
     * @param firewallArn The Amazon Resource Name (ARN) of the `Firewall` that the logging
     *   configuration is associated with. You can't change the firewall specification after you
     *   create the logging configuration.
     */
    public fun firewallArn(firewallArn: String) {
        cdkBuilder.firewallArn(firewallArn)
    }

    /**
     * @param firewallName The name of the firewall that the logging configuration is associated
     *   with. You can't change the firewall specification after you create the logging
     *   configuration.
     */
    public fun firewallName(firewallName: String) {
        cdkBuilder.firewallName(firewallName)
    }

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     *   `Firewall` .
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     *   `Firewall` .
     */
    public fun loggingConfiguration(
        loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty
    ) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    public fun build(): CfnLoggingConfigurationProps = cdkBuilder.build()
}
