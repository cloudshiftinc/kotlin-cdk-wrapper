@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new instance profile. For information about instance profiles, see [Using instance
 * profiles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2_instance-profiles.html)
 * .
 *
 * For information about the number of instance profiles you can create, see [IAM object
 * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html) in the *IAM User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnInstanceProfile cfnInstanceProfile = CfnInstanceProfile.Builder.create(this,
 * "MyCfnInstanceProfile")
 * .roles(List.of("roles"))
 * // the properties below are optional
 * .instanceProfileName("instanceProfileName")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
 */
public open class CfnInstanceProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfile,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Returns the Amazon Resource Name (ARN) for the instance profile. For example:.
   *
   * `{"Fn::GetAtt" : ["MyProfile", "Arn"] }`
   *
   * This returns a value such as `arn:aws:iam::1234567890:instance-profile/MyProfile-ASDNSDLKJ` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the instance profile to create.
   */
  public open fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  /**
   * The name of the instance profile to create.
   */
  public open fun instanceProfileName(`value`: String) {
    unwrap(this).setInstanceProfileName(`value`)
  }

  /**
   * The path to the instance profile.
   */
  public open fun path(): String? = unwrap(this).getPath()

  /**
   * The path to the instance profile.
   */
  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  /**
   * The name of the role to associate with the instance profile.
   */
  public open fun roles(): List<String> = unwrap(this).getRoles()

  /**
   * The name of the role to associate with the instance profile.
   */
  public open fun roles(`value`: List<String>) {
    unwrap(this).setRoles(`value`)
  }

  /**
   * The name of the role to associate with the instance profile.
   */
  public open fun roles(vararg `value`: String): Unit = roles(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnInstanceProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the instance profile to create.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
     * @param instanceProfileName The name of the instance profile to create. 
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * The path to the instance profile.
     *
     * For more information about paths, see [IAM
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path)
     * @param path The path to the instance profile. 
     */
    public fun path(path: String)

    /**
     * The name of the role to associate with the instance profile.
     *
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
     * @param roles The name of the role to associate with the instance profile. 
     */
    public fun roles(roles: List<String>)

    /**
     * The name of the role to associate with the instance profile.
     *
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
     * @param roles The name of the role to associate with the instance profile. 
     */
    public fun roles(vararg roles: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnInstanceProfile.Builder =
        software.amazon.awscdk.services.iam.CfnInstanceProfile.Builder.create(scope, id)

    /**
     * The name of the instance profile to create.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
     * @param instanceProfileName The name of the instance profile to create. 
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * The path to the instance profile.
     *
     * For more information about paths, see [IAM
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path)
     * @param path The path to the instance profile. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * The name of the role to associate with the instance profile.
     *
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
     * @param roles The name of the role to associate with the instance profile. 
     */
    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    /**
     * The name of the role to associate with the instance profile.
     *
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
     * @param roles The name of the role to associate with the instance profile. 
     */
    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnInstanceProfile = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnInstanceProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfile):
        CfnInstanceProfile = CfnInstanceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfile):
        software.amazon.awscdk.services.iam.CfnInstanceProfile = wrapped.cdkObject
  }
}
