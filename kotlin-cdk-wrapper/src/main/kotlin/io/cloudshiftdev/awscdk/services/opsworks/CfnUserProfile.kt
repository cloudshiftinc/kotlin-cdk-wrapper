@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
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
public open class CfnUserProfile(
  cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfile,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProfileProps,
  ) :
      this(software.amazon.awscdk.services.opsworks.CfnUserProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserProfileProps(props)
  )

  /**
   * Whether users can specify their own SSH public key through the My Settings page.
   */
  public open fun allowSelfManagement(): Any? = unwrap(this).getAllowSelfManagement()

  /**
   * Whether users can specify their own SSH public key through the My Settings page.
   */
  public open fun allowSelfManagement(`value`: Boolean) {
    unwrap(this).setAllowSelfManagement(`value`)
  }

  /**
   * Whether users can specify their own SSH public key through the My Settings page.
   */
  public open fun allowSelfManagement(`value`: IResolvable) {
    unwrap(this).setAllowSelfManagement(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The user's SSH user name, as a string.
   */
  public open fun attrSshUsername(): String = unwrap(this).getAttrSshUsername()

  /**
   * The user's IAM ARN.
   */
  public open fun iamUserArn(): String = unwrap(this).getIamUserArn()

  /**
   * The user's IAM ARN.
   */
  public open fun iamUserArn(`value`: String) {
    unwrap(this).setIamUserArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The user's SSH public key.
   */
  public open fun sshPublicKey(): String? = unwrap(this).getSshPublicKey()

  /**
   * The user's SSH public key.
   */
  public open fun sshPublicKey(`value`: String) {
    unwrap(this).setSshPublicKey(`value`)
  }

  /**
   * The user's SSH user name.
   */
  public open fun sshUsername(): String? = unwrap(this).getSshUsername()

  /**
   * The user's SSH user name.
   */
  public open fun sshUsername(`value`: String) {
    unwrap(this).setSshUsername(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opsworks.CfnUserProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether users can specify their own SSH public key through the My Settings page.
     *
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page. 
     */
    public fun allowSelfManagement(allowSelfManagement: Boolean)

    /**
     * Whether users can specify their own SSH public key through the My Settings page.
     *
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page. 
     */
    public fun allowSelfManagement(allowSelfManagement: IResolvable)

    /**
     * The user's IAM ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
     * @param iamUserArn The user's IAM ARN. 
     */
    public fun iamUserArn(iamUserArn: String)

    /**
     * The user's SSH public key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
     * @param sshPublicKey The user's SSH public key. 
     */
    public fun sshPublicKey(sshPublicKey: String)

    /**
     * The user's SSH user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
     * @param sshUsername The user's SSH user name. 
     */
    public fun sshUsername(sshUsername: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnUserProfile.Builder =
        software.amazon.awscdk.services.opsworks.CfnUserProfile.Builder.create(scope, id)

    /**
     * Whether users can specify their own SSH public key through the My Settings page.
     *
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page. 
     */
    override fun allowSelfManagement(allowSelfManagement: Boolean) {
      cdkBuilder.allowSelfManagement(allowSelfManagement)
    }

    /**
     * Whether users can specify their own SSH public key through the My Settings page.
     *
     * For more information, see [Managing User
     * Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
     * @param allowSelfManagement Whether users can specify their own SSH public key through the My
     * Settings page. 
     */
    override fun allowSelfManagement(allowSelfManagement: IResolvable) {
      cdkBuilder.allowSelfManagement(allowSelfManagement.let(IResolvable.Companion::unwrap))
    }

    /**
     * The user's IAM ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
     * @param iamUserArn The user's IAM ARN. 
     */
    override fun iamUserArn(iamUserArn: String) {
      cdkBuilder.iamUserArn(iamUserArn)
    }

    /**
     * The user's SSH public key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
     * @param sshPublicKey The user's SSH public key. 
     */
    override fun sshPublicKey(sshPublicKey: String) {
      cdkBuilder.sshPublicKey(sshPublicKey)
    }

    /**
     * The user's SSH user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
     * @param sshUsername The user's SSH user name. 
     */
    override fun sshUsername(sshUsername: String) {
      cdkBuilder.sshUsername(sshUsername)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnUserProfile = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opsworks.CfnUserProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfile):
        CfnUserProfile = CfnUserProfile(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfile):
        software.amazon.awscdk.services.opsworks.CfnUserProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.opsworks.CfnUserProfile
  }
}
