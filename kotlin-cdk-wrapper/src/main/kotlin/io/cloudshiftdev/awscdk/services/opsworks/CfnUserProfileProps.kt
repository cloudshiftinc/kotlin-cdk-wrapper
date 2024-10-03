@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnUserProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
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
public interface CfnUserProfileProps {
  /**
   * Whether users can specify their own SSH public key through the My Settings page.
   *
   * For more information, see [Managing User
   * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
   */
  public fun allowSelfManagement(): Any? = unwrap(this).getAllowSelfManagement()

  /**
   * The user's IAM ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
   */
  public fun iamUserArn(): String

  /**
   * The user's SSH public key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
   */
  public fun sshPublicKey(): String? = unwrap(this).getSshPublicKey()

  /**
   * The user's SSH user name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
   */
  public fun sshUsername(): String? = unwrap(this).getSshUsername()

  /**
   * A builder for [CfnUserProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page.
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     */
    public fun allowSelfManagement(allowSelfManagement: Boolean)

    /**
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page.
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     */
    public fun allowSelfManagement(allowSelfManagement: IResolvable)

    /**
     * @param iamUserArn The user's IAM ARN. 
     */
    public fun iamUserArn(iamUserArn: String)

    /**
     * @param sshPublicKey The user's SSH public key.
     */
    public fun sshPublicKey(sshPublicKey: String)

    /**
     * @param sshUsername The user's SSH user name.
     */
    public fun sshUsername(sshUsername: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnUserProfileProps.builder()

    /**
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page.
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     */
    override fun allowSelfManagement(allowSelfManagement: Boolean) {
      cdkBuilder.allowSelfManagement(allowSelfManagement)
    }

    /**
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page.
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     */
    override fun allowSelfManagement(allowSelfManagement: IResolvable) {
      cdkBuilder.allowSelfManagement(allowSelfManagement.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param iamUserArn The user's IAM ARN. 
     */
    override fun iamUserArn(iamUserArn: String) {
      cdkBuilder.iamUserArn(iamUserArn)
    }

    /**
     * @param sshPublicKey The user's SSH public key.
     */
    override fun sshPublicKey(sshPublicKey: String) {
      cdkBuilder.sshPublicKey(sshPublicKey)
    }

    /**
     * @param sshUsername The user's SSH user name.
     */
    override fun sshUsername(sshUsername: String) {
      cdkBuilder.sshUsername(sshUsername)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnUserProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfileProps,
  ) : CdkObject(cdkObject),
      CfnUserProfileProps {
    /**
     * Whether users can specify their own SSH public key through the My Settings page.
     *
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
     */
    override fun allowSelfManagement(): Any? = unwrap(this).getAllowSelfManagement()

    /**
     * The user's IAM ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
     */
    override fun iamUserArn(): String = unwrap(this).getIamUserArn()

    /**
     * The user's SSH public key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
     */
    override fun sshPublicKey(): String? = unwrap(this).getSshPublicKey()

    /**
     * The user's SSH user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
     */
    override fun sshUsername(): String? = unwrap(this).getSshUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfileProps):
        CfnUserProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfileProps):
        software.amazon.awscdk.services.opsworks.CfnUserProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnUserProfileProps
  }
}
