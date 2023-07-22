@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorCustomPluginPropertyDsl {
  private val cdkBuilder: CfnConnector.CustomPluginProperty.Builder =
      CfnConnector.CustomPluginProperty.builder()

  /**
   * @param customPluginArn The Amazon Resource Name (ARN) of the custom plugin. 
   */
  public fun customPluginArn(customPluginArn: String) {
    cdkBuilder.customPluginArn(customPluginArn)
  }

  /**
   * @param revision The revision of the custom plugin. 
   */
  public fun revision(revision: Number) {
    cdkBuilder.revision(revision)
  }

  public fun build(): CfnConnector.CustomPluginProperty = cdkBuilder.build()
}
