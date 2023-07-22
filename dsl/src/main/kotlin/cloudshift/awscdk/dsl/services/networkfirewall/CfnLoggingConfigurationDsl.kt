@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.constructs.Construct

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
