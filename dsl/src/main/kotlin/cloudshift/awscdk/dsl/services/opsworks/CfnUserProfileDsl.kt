@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnUserProfile
import software.constructs.Construct

/**
 * Describes a user's SSH information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * CfnUserProfile cfnUserProfile = CfnUserProfile.Builder.create(this, "MyCfnUserProfile")
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
public class CfnUserProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserProfile.Builder = CfnUserProfile.Builder.create(scope, id)

  /**
   * Whether users can specify their own SSH public key through the My Settings page.
   *
   * For more information, see [Managing User
   * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
   * @param allowSelfManagement Whether users can specify their own SSH public key through the My
   * Settings page. 
   */
  public fun allowSelfManagement(allowSelfManagement: Boolean) {
    cdkBuilder.allowSelfManagement(allowSelfManagement)
  }

  /**
   * Whether users can specify their own SSH public key through the My Settings page.
   *
   * For more information, see [Managing User
   * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
   * @param allowSelfManagement Whether users can specify their own SSH public key through the My
   * Settings page. 
   */
  public fun allowSelfManagement(allowSelfManagement: IResolvable) {
    cdkBuilder.allowSelfManagement(allowSelfManagement)
  }

  /**
   * The user's IAM ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
   * @param iamUserArn The user's IAM ARN. 
   */
  public fun iamUserArn(iamUserArn: String) {
    cdkBuilder.iamUserArn(iamUserArn)
  }

  /**
   * The user's SSH public key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
   * @param sshPublicKey The user's SSH public key. 
   */
  public fun sshPublicKey(sshPublicKey: String) {
    cdkBuilder.sshPublicKey(sshPublicKey)
  }

  /**
   * The user's SSH user name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
   * @param sshUsername The user's SSH user name. 
   */
  public fun sshUsername(sshUsername: String) {
    cdkBuilder.sshUsername(sshUsername)
  }

  public fun build(): CfnUserProfile = cdkBuilder.build()
}
