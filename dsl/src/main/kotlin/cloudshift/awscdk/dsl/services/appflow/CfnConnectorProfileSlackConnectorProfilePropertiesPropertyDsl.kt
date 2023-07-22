@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileSlackConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.builder()

  /**
   * @param instanceUrl The location of the Slack resource. 
   */
  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  public fun build(): CfnConnectorProfile.SlackConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
