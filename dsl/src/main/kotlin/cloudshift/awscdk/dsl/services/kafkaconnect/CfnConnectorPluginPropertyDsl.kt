@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorPluginPropertyDsl {
  private val cdkBuilder: CfnConnector.PluginProperty.Builder =
      CfnConnector.PluginProperty.builder()

  /**
   * @param customPlugin Details about a custom plugin. 
   */
  public fun customPlugin(customPlugin: IResolvable) {
    cdkBuilder.customPlugin(customPlugin)
  }

  /**
   * @param customPlugin Details about a custom plugin. 
   */
  public fun customPlugin(customPlugin: CfnConnector.CustomPluginProperty) {
    cdkBuilder.customPlugin(customPlugin)
  }

  public fun build(): CfnConnector.PluginProperty = cdkBuilder.build()
}
