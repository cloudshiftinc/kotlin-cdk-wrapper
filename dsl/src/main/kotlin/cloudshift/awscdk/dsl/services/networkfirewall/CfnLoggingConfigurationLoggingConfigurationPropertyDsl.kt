@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.LoggingConfigurationProperty.Builder =
      CfnLoggingConfiguration.LoggingConfigurationProperty.builder()

  private val _logDestinationConfigs: MutableList<Any> = mutableListOf()

  /**
   * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
   * Network Firewall generates logs for stateful rule groups.
   */
  public fun logDestinationConfigs(vararg logDestinationConfigs: Any) {
    _logDestinationConfigs.addAll(listOf(*logDestinationConfigs))
  }

  /**
   * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
   * Network Firewall generates logs for stateful rule groups.
   */
  public fun logDestinationConfigs(logDestinationConfigs: Collection<Any>) {
    _logDestinationConfigs.addAll(logDestinationConfigs)
  }

  /**
   * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
   * Network Firewall generates logs for stateful rule groups.
   */
  public fun logDestinationConfigs(logDestinationConfigs: IResolvable) {
    cdkBuilder.logDestinationConfigs(logDestinationConfigs)
  }

  public fun build(): CfnLoggingConfiguration.LoggingConfigurationProperty {
    if(_logDestinationConfigs.isNotEmpty()) cdkBuilder.logDestinationConfigs(_logDestinationConfigs)
    return cdkBuilder.build()
  }
}
