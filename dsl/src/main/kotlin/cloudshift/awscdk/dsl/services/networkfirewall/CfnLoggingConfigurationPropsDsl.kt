@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps

@CdkDslMarker
public class CfnLoggingConfigurationPropsDsl {
  private val cdkBuilder: CfnLoggingConfigurationProps.Builder =
      CfnLoggingConfigurationProps.builder()

  /**
   * @param firewallArn The Amazon Resource Name (ARN) of the `Firewall` that the logging
   * configuration is associated with. 
   * You can't change the firewall specification after you create the logging configuration.
   */
  public fun firewallArn(firewallArn: String) {
    cdkBuilder.firewallArn(firewallArn)
  }

  /**
   * @param firewallName The name of the firewall that the logging configuration is associated with.
   * You can't change the firewall specification after you create the logging configuration.
   */
  public fun firewallName(firewallName: String) {
    cdkBuilder.firewallName(firewallName)
  }

  /**
   * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a `Firewall`
   * . 
   */
  public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  /**
   * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a `Firewall`
   * . 
   */
  public
      fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public fun build(): CfnLoggingConfigurationProps = cdkBuilder.build()
}
