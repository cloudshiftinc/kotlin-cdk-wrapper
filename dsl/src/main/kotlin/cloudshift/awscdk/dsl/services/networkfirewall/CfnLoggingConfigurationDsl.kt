@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.constructs.Construct

/**
 * Use the `LoggingConfiguration` to define the destinations and logging options for an `Firewall` .
 *
 * You must change the logging configuration by changing one `LogDestinationConfig` setting at a
 * time in your `LogDestinationConfigs` .
 *
 * You can make only one of the following changes to your `LoggingConfiguration` resource:
 *
 * * Create a new log destination object by adding a single `LogDestinationConfig` array element to
 * `LogDestinationConfigs` .
 * * Delete a log destination object by removing a single `LogDestinationConfig` array element from
 * `LogDestinationConfigs` .
 * * Change the `LogDestination` setting in a single `LogDestinationConfig` array element.
 *
 * You can't change the `LogDestinationType` or `LogType` in a `LogDestinationConfig` . To change
 * these settings, delete the existing `LogDestinationConfig` object and create a new one, in two
 * separate modifications.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
 * "MyCfnLoggingConfiguration")
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
public class CfnLoggingConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoggingConfiguration.Builder =
      CfnLoggingConfiguration.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the `Firewall` that the logging configuration is associated
   * with.
   *
   * You can't change the firewall specification after you create the logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallarn)
   * @param firewallArn The Amazon Resource Name (ARN) of the `Firewall` that the logging
   * configuration is associated with. 
   */
  public fun firewallArn(firewallArn: String) {
    cdkBuilder.firewallArn(firewallArn)
  }

  /**
   * The name of the firewall that the logging configuration is associated with.
   *
   * You can't change the firewall specification after you create the logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallname)
   * @param firewallName The name of the firewall that the logging configuration is associated with.
   * 
   */
  public fun firewallName(firewallName: String) {
    cdkBuilder.firewallName(firewallName)
  }

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
   * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a `Firewall`
   * . 
   */
  public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
   * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a `Firewall`
   * . 
   */
  public
      fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public fun build(): CfnLoggingConfiguration = cdkBuilder.build()
}
