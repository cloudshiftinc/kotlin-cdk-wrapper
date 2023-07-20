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

  public fun firewallArn(firewallArn: String) {
    cdkBuilder.firewallArn(firewallArn)
  }

  public fun firewallName(firewallName: String) {
    cdkBuilder.firewallName(firewallName)
  }

  public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public
      fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public fun build(): CfnLoggingConfigurationProps = cdkBuilder.build()
}
