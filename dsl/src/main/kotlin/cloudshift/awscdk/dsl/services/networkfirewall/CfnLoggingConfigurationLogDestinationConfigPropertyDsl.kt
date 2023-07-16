@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationLogDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.LogDestinationConfigProperty.Builder =
      CfnLoggingConfiguration.LogDestinationConfigProperty.builder()

  public fun logDestination(logDestination: Map<String, String>) {
    cdkBuilder.logDestination(logDestination)
  }

  public fun logDestination(logDestination: IResolvable) {
    cdkBuilder.logDestination(logDestination)
  }

  public fun logDestinationType(logDestinationType: String) {
    cdkBuilder.logDestinationType(logDestinationType)
  }

  public fun logType(logType: String) {
    cdkBuilder.logType(logType)
  }

  public fun build(): CfnLoggingConfiguration.LogDestinationConfigProperty = cdkBuilder.build()
}
