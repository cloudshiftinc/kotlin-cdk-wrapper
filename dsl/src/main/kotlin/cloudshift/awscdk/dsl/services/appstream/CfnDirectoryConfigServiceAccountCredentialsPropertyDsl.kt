@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig

/**
 * The credentials for the service account used by the streaming instance to connect to the
 * directory.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * ServiceAccountCredentialsProperty serviceAccountCredentialsProperty =
 * ServiceAccountCredentialsProperty.builder()
 * .accountName("accountName")
 * .accountPassword("accountPassword")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html)
 */
@CdkDslMarker
public class CfnDirectoryConfigServiceAccountCredentialsPropertyDsl {
  private val cdkBuilder: CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder =
      CfnDirectoryConfig.ServiceAccountCredentialsProperty.builder()

  /**
   * @param accountName The user name of the account. 
   * This account must have the following privileges: create computer objects, join computers to the
   * domain, and change/reset the password on descendant computer objects for the organizational units
   * specified.
   */
  public fun accountName(accountName: String) {
    cdkBuilder.accountName(accountName)
  }

  /**
   * @param accountPassword The password for the account. 
   */
  public fun accountPassword(accountPassword: String) {
    cdkBuilder.accountPassword(accountPassword)
  }

  public fun build(): CfnDirectoryConfig.ServiceAccountCredentialsProperty = cdkBuilder.build()
}
