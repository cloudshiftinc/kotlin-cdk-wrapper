@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required when using Snowflake.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SnowflakeConnectorProfileCredentialsProperty snowflakeConnectorProfileCredentialsProperty =
 * SnowflakeConnectorProfileCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileSnowflakeConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.builder()

  /**
   * @param password The password that corresponds to the user name. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username The name of the user. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
