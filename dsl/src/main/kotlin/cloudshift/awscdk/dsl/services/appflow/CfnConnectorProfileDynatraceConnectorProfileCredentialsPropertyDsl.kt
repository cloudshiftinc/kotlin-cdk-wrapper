@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required by Dynatrace.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DynatraceConnectorProfileCredentialsProperty dynatraceConnectorProfileCredentialsProperty =
 * DynatraceConnectorProfileCredentialsProperty.builder()
 * .apiToken("apiToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileDynatraceConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.builder()

  /**
   * @param apiToken The API tokens used by Dynatrace API to authenticate various API calls. 
   */
  public fun apiToken(apiToken: String) {
    cdkBuilder.apiToken(apiToken)
  }

  public fun build(): CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
