@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnRolePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnRolePolicyProps cfnRolePolicyProps = CfnRolePolicyProps.builder()
 * .policyName("policyName")
 * .roleName("roleName")
 * // the properties below are optional
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html)
 */
public interface CfnRolePolicyProps {
  /**
   * The policy document.
   *
   * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
   * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
   * converts a YAML policy to JSON format before submitting it to IAM.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
   * validate this parameter is a string of characters consisting of the following:
   *
   * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
   * of the ASCII character range
   * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
   * `\u00FF` )
   * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
   * `\u000D` )
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html#cfn-iam-rolepolicy-policydocument)
   */
  public fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  /**
   * The name of the policy document.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html#cfn-iam-rolepolicy-policyname)
   */
  public fun policyName(): String

  /**
   * The name of the role to associate the policy with.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html#cfn-iam-rolepolicy-rolename)
   */
  public fun roleName(): String

  /**
   * A builder for [CfnRolePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument The policy document.
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * @param policyName The name of the policy document. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun policyName(policyName: String)

    /**
     * @param roleName The name of the role to associate the policy with. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun roleName(roleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnRolePolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnRolePolicyProps.builder()

    /**
     * @param policyDocument The policy document.
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyName The name of the policy document. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param roleName The name of the role to associate the policy with. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnRolePolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnRolePolicyProps,
  ) : CdkObject(cdkObject), CfnRolePolicyProps {
    /**
     * The policy document.
     *
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html#cfn-iam-rolepolicy-policydocument)
     */
    override fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

    /**
     * The name of the policy document.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html#cfn-iam-rolepolicy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()

    /**
     * The name of the role to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html#cfn-iam-rolepolicy-rolename)
     */
    override fun roleName(): String = unwrap(this).getRoleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRolePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnRolePolicyProps):
        CfnRolePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRolePolicyProps):
        software.amazon.awscdk.services.iam.CfnRolePolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.CfnRolePolicyProps
  }
}
