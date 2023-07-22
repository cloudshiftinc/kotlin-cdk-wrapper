@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required by Dynatrace.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DynatraceConnectorProfilePropertiesProperty dynatraceConnectorProfilePropertiesProperty =
 * DynatraceConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileDynatraceConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty.builder()

  /**
   * @param instanceUrl The location of the Dynatrace resource. 
   */
  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  public fun build(): CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
