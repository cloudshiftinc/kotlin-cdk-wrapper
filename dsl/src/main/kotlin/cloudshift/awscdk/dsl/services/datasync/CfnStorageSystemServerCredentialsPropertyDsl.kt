@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnStorageSystem

/**
 * The credentials that provide DataSync Discovery read access to your on-premises storage system's
 * management interface.
 *
 * DataSync Discovery stores these credentials in [AWS Secrets
 * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) . For more
 * information, see [Accessing your on-premises storage
 * system](https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * ServerCredentialsProperty serverCredentialsProperty = ServerCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-servercredentials.html)
 */
@CdkDslMarker
public class CfnStorageSystemServerCredentialsPropertyDsl {
  private val cdkBuilder: CfnStorageSystem.ServerCredentialsProperty.Builder =
      CfnStorageSystem.ServerCredentialsProperty.builder()

  /**
   * @param password Specifies the password for your storage system's management interface. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username Specifies the user name for your storage system's management interface. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnStorageSystem.ServerCredentialsProperty = cdkBuilder.build()
}
