@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnConnection

/**
 * Contains the Basic authorization parameters for the connection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * BasicAuthParametersProperty basicAuthParametersProperty = BasicAuthParametersProperty.builder()
 * .password("password")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-basicauthparameters.html)
 */
@CdkDslMarker
public class CfnConnectionBasicAuthParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.BasicAuthParametersProperty.Builder =
      CfnConnection.BasicAuthParametersProperty.builder()

  /**
   * @param password The password associated with the user name to use for Basic authorization. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username The user name to use for Basic authorization. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnConnection.BasicAuthParametersProperty = cdkBuilder.build()
}
