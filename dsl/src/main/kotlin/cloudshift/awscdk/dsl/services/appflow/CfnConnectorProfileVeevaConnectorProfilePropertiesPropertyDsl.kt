@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required when using Veeva.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * VeevaConnectorProfilePropertiesProperty veevaConnectorProfilePropertiesProperty =
 * VeevaConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileVeevaConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.builder()

  /**
   * @param instanceUrl The location of the Veeva resource. 
   */
  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  public fun build(): CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
