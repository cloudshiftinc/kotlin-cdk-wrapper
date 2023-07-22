@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnUserProfileProps

/**
 * Properties for defining a `CfnUserProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * CfnUserProfileProps cfnUserProfileProps = CfnUserProfileProps.builder()
 * .iamUserArn("iamUserArn")
 * // the properties below are optional
 * .allowSelfManagement(false)
 * .sshPublicKey("sshPublicKey")
 * .sshUsername("sshUsername")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html)
 */
@CdkDslMarker
public class CfnUserProfilePropsDsl {
  private val cdkBuilder: CfnUserProfileProps.Builder = CfnUserProfileProps.builder()

  /**
   * @param allowSelfManagement Whether users can specify their own SSH public key through the My
   * Settings page.
   * For more information, see [Managing User
   * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html) .
   */
  public fun allowSelfManagement(allowSelfManagement: Boolean) {
    cdkBuilder.allowSelfManagement(allowSelfManagement)
  }

  /**
   * @param allowSelfManagement Whether users can specify their own SSH public key through the My
   * Settings page.
   * For more information, see [Managing User
   * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html) .
   */
  public fun allowSelfManagement(allowSelfManagement: IResolvable) {
    cdkBuilder.allowSelfManagement(allowSelfManagement)
  }

  /**
   * @param iamUserArn The user's IAM ARN. 
   */
  public fun iamUserArn(iamUserArn: String) {
    cdkBuilder.iamUserArn(iamUserArn)
  }

  /**
   * @param sshPublicKey The user's SSH public key.
   */
  public fun sshPublicKey(sshPublicKey: String) {
    cdkBuilder.sshPublicKey(sshPublicKey)
  }

  /**
   * @param sshUsername The user's SSH user name.
   */
  public fun sshUsername(sshUsername: String) {
    cdkBuilder.sshUsername(sshUsername)
  }

  public fun build(): CfnUserProfileProps = cdkBuilder.build()
}
