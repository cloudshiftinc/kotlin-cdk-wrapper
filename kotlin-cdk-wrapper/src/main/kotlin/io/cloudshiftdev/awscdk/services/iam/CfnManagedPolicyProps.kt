@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnManagedPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnManagedPolicyProps cfnManagedPolicyProps = CfnManagedPolicyProps.builder()
 * .policyDocument(policyDocument)
 * // the properties below are optional
 * .description("description")
 * .groups(List.of("groups"))
 * .managedPolicyName("managedPolicyName")
 * .path("path")
 * .roles(List.of("roles"))
 * .users(List.of("users"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
 */
public interface CfnManagedPolicyProps {
  /**
   * A friendly description of the policy.
   *
   * Typically used to store information about the permissions defined in the policy. For example,
   * "Grants access to production DynamoDB tables."
   *
   * The policy description is immutable. After a value is assigned, it cannot be changed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name (friendly name, not ARN) of the group to attach the policy to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
   */
  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  /**
   * The friendly name of the policy.
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
   * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
   * CloudFormation
   * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
   * .
   *
   *
   * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
   * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
   * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
   * {"Ref": "MyResourceName"}]]}` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname)
   */
  public fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  /**
   * The path for the policy.
   *
   * For more information about paths, see [IAM
   * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
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
   *
   * You cannot use an asterisk (*) in the path name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-path)
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * The JSON policy document that you want to use as the content for the new policy.
   *
   * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
   * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
   * converts a YAML policy to JSON format before submitting it to IAM.
   *
   * The maximum length of the policy document that you can pass in this operation, including
   * whitespace, is listed below. To view the maximum character counts of a managed policy with no
   * whitespaces, see [IAM and AWS STS character
   * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length)
   * .
   *
   * To learn more about JSON policy grammar, see [Grammar of the IAM JSON policy
   * language](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_grammar.html) in the
   * *IAM User Guide* .
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument)
   */
  public fun policyDocument(): Any

  /**
   * The name (friendly name, not ARN) of the role to attach the policy to.
   *
   * This parameter allows (per its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   *
   * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref` to
   * a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role, add a
   * `DependsOn` attribute to the resource to make the resource depend on the external policy. This
   * dependency ensures that the role's policy is available throughout the resource's lifecycle. For
   * example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn` attribute
   * ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before deleting its
   * role's policy.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles)
   */
  public fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  /**
   * The name (friendly name, not ARN) of the IAM user to attach the policy to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
   */
  public fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  /**
   * A builder for [CfnManagedPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A friendly description of the policy.
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     *
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     */
    public fun description(description: String)

    /**
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun groups(groups: List<String>)

    /**
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun groups(vararg groups: String)

    /**
     * @param managedPolicyName The friendly name of the policy.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     */
    public fun managedPolicyName(managedPolicyName: String)

    /**
     * @param path The path for the policy.
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
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
     *
     * You cannot use an asterisk (*) in the path name.
     */
    public fun path(path: String)

    /**
     * @param policyDocument The JSON policy document that you want to use as the content for the
     * new policy. 
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The maximum length of the policy document that you can pass in this operation, including
     * whitespace, is listed below. To view the maximum character counts of a managed policy with no
     * whitespaces, see [IAM and AWS STS character
     * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length)
     * .
     *
     * To learn more about JSON policy grammar, see [Grammar of the IAM JSON policy
     * language](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_grammar.html) in
     * the *IAM User Guide* .
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
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    public fun roles(roles: List<String>)

    /**
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    public fun roles(vararg roles: String)

    /**
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun users(users: List<String>)

    /**
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun users(vararg users: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnManagedPolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnManagedPolicyProps.builder()

    /**
     * @param description A friendly description of the policy.
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     *
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    /**
     * @param managedPolicyName The friendly name of the policy.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     */
    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    /**
     * @param path The path for the policy.
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
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
     *
     * You cannot use an asterisk (*) in the path name.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param policyDocument The JSON policy document that you want to use as the content for the
     * new policy. 
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The maximum length of the policy document that you can pass in this operation, including
     * whitespace, is listed below. To view the maximum character counts of a managed policy with no
     * whitespaces, see [IAM and AWS STS character
     * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length)
     * .
     *
     * To learn more about JSON policy grammar, see [Grammar of the IAM JSON policy
     * language](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_grammar.html) in
     * the *IAM User Guide* .
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
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    /**
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    /**
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnManagedPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicyProps,
  ) : CdkObject(cdkObject), CfnManagedPolicyProps {
    /**
     * A friendly description of the policy.
     *
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     *
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name (friendly name, not ARN) of the group to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
     */
    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * The friendly name of the policy.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname)
     */
    override fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

    /**
     * The path for the policy.
     *
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
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
     *
     * You cannot use an asterisk (*) in the path name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-path)
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The JSON policy document that you want to use as the content for the new policy.
     *
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The maximum length of the policy document that you can pass in this operation, including
     * whitespace, is listed below. To view the maximum character counts of a managed policy with no
     * whitespaces, see [IAM and AWS STS character
     * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entity-length)
     * .
     *
     * To learn more about JSON policy grammar, see [Grammar of the IAM JSON policy
     * language](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_grammar.html) in
     * the *IAM User Guide* .
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    /**
     * The name (friendly name, not ARN) of the role to attach the policy to.
     *
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles)
     */
    override fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

    /**
     * The name (friendly name, not ARN) of the IAM user to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
     */
    override fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnManagedPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicyProps):
        CfnManagedPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnManagedPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnManagedPolicyProps):
        software.amazon.awscdk.services.iam.CfnManagedPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CfnManagedPolicyProps
  }
}
