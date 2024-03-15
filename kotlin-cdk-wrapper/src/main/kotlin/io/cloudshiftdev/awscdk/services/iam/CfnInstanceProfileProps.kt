@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnInstanceProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnInstanceProfileProps cfnInstanceProfileProps = CfnInstanceProfileProps.builder()
 * .roles(List.of("roles"))
 * // the properties below are optional
 * .instanceProfileName("instanceProfileName")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
 */
public interface CfnInstanceProfileProps {
  /**
   * The name of the instance profile to create.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
   */
  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  /**
   * The path to the instance profile.
   *
   * For more information about paths, see [IAM
   * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
   * User Guide* .
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
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * The name of the role to associate with the instance profile.
   *
   * Only one role can be assigned to an EC2 instance at a time, and all applications on the
   * instance share the same role and permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
   */
  public fun roles(): List<String>

  /**
   * A builder for [CfnInstanceProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceProfileName The name of the instance profile to create.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * @param path The path to the instance profile.
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
     */
    public fun path(path: String)

    /**
     * @param roles The name of the role to associate with the instance profile. 
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     */
    public fun roles(roles: List<String>)

    /**
     * @param roles The name of the role to associate with the instance profile. 
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     */
    public fun roles(vararg roles: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnInstanceProfileProps.Builder =
        software.amazon.awscdk.services.iam.CfnInstanceProfileProps.builder()

    /**
     * @param instanceProfileName The name of the instance profile to create.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param path The path to the instance profile.
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
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param roles The name of the role to associate with the instance profile. 
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     */
    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    /**
     * @param roles The name of the role to associate with the instance profile. 
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     */
    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnInstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfileProps,
  ) : CdkObject(cdkObject), CfnInstanceProfileProps {
    /**
     * The name of the instance profile to create.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
     */
    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

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
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The name of the role to associate with the instance profile.
     *
     * Only one role can be assigned to an EC2 instance at a time, and all applications on the
     * instance share the same role and permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
     */
    override fun roles(): List<String> = unwrap(this).getRoles()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfileProps):
        CfnInstanceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfileProps):
        software.amazon.awscdk.services.iam.CfnInstanceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnInstanceProfileProps
  }
}
