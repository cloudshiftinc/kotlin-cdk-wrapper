@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The API key credentials required for API key authentication.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ApiKeyCredentialsProperty apiKeyCredentialsProperty = ApiKeyCredentialsProperty.builder()
 * .apiKey("apiKey")
 * // the properties below are optional
 * .apiSecretKey("apiSecretKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-apikeycredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileApiKeyCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.ApiKeyCredentialsProperty.Builder =
      CfnConnectorProfile.ApiKeyCredentialsProperty.builder()

  /**
   * @param apiKey The API key required for API key authentication. 
   */
  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  /**
   * @param apiSecretKey The API secret key required for API key authentication.
   */
  public fun apiSecretKey(apiSecretKey: String) {
    cdkBuilder.apiSecretKey(apiSecretKey)
  }

  public fun build(): CfnConnectorProfile.ApiKeyCredentialsProperty = cdkBuilder.build()
}
