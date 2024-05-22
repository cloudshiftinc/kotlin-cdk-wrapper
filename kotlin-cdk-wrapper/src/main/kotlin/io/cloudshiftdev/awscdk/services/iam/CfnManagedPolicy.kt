@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new managed policy for your AWS account .
 *
 * This operation creates a policy version with a version identifier of `v1` and sets v1 as the
 * policy's default version. For more information about policy versions, see [Versioning for managed
 * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html) in the
 * *IAM User Guide* .
 *
 * As a best practice, you can validate your IAM policies. To learn more, see [Validating IAM
 * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_policy-validator.html) in
 * the *IAM User Guide* .
 *
 * For more information about managed policies in general, see [Managed policies and inline
 * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in the
 * *IAM User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnManagedPolicy cfnManagedPolicy = CfnManagedPolicy.Builder.create(this, "MyCfnManagedPolicy")
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
public open class CfnManagedPolicy(
  cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedPolicyProps,
  ) :
      this(software.amazon.awscdk.services.iam.CfnManagedPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnManagedPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnManagedPolicyProps(props)
  )

  /**
   * The number of principal entities (users, groups, and roles) that the policy is attached to.
   */
  public open fun attrAttachmentCount(): Number = unwrap(this).getAttrAttachmentCount()

  /**
   * The date and time, in [ISO 8601 date-time
   * format](https://docs.aws.amazon.com/http://www.iso.org/iso/iso8601) , when the policy was created.
   */
  public open fun attrCreateDate(): String = unwrap(this).getAttrCreateDate()

  /**
   * The identifier for the version of the policy that is set as the default (operative) version.
   *
   * For more information about policy versions, see [Versioning for managed
   * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html) in the
   * *IAM User Guide* .
   */
  public open fun attrDefaultVersionId(): String = unwrap(this).getAttrDefaultVersionId()

  /**
   * Specifies whether the policy can be attached to an IAM user, group, or role.
   */
  public open fun attrIsAttachable(): IResolvable =
      unwrap(this).getAttrIsAttachable().let(IResolvable::wrap)

  /**
   * The number of entities (users and roles) for which the policy is used as the permissions
   * boundary.
   *
   * For more information about permissions boundaries, see [Permissions boundaries for IAM
   * identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
   * the *IAM User Guide* .
   */
  public open fun attrPermissionsBoundaryUsageCount(): Number =
      unwrap(this).getAttrPermissionsBoundaryUsageCount()

  /**
   *
   */
  public open fun attrPolicyArn(): String = unwrap(this).getAttrPolicyArn()

  /**
   * The stable and unique string identifying the policy.
   *
   * For more information about IDs, see [IAM
   * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
   * User Guide* .
   */
  public open fun attrPolicyId(): String = unwrap(this).getAttrPolicyId()

  /**
   * The date and time, in [ISO 8601 date-time
   * format](https://docs.aws.amazon.com/http://www.iso.org/iso/iso8601) , when the policy was last
   * updated.
   *
   * When a policy has only one version, this field contains the date and time when the policy was
   * created. When a policy has more than one version, this field contains the date and time when the
   * most recent policy version was created.
   */
  public open fun attrUpdateDate(): String = unwrap(this).getAttrUpdateDate()

  /**
   * A friendly description of the policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A friendly description of the policy.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name (friendly name, not ARN) of the group to attach the policy to.
   */
  public open fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  /**
   * The name (friendly name, not ARN) of the group to attach the policy to.
   */
  public open fun groups(`value`: List<String>) {
    unwrap(this).setGroups(`value`)
  }

  /**
   * The name (friendly name, not ARN) of the group to attach the policy to.
   */
  public open fun groups(vararg `value`: String): Unit = groups(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The friendly name of the policy.
   */
  public open fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  /**
   * The friendly name of the policy.
   */
  public open fun managedPolicyName(`value`: String) {
    unwrap(this).setManagedPolicyName(`value`)
  }

  /**
   * The path for the policy.
   */
  public open fun path(): String? = unwrap(this).getPath()

  /**
   * The path for the policy.
   */
  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  /**
   * The JSON policy document that you want to use as the content for the new policy.
   */
  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  /**
   * The JSON policy document that you want to use as the content for the new policy.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The name (friendly name, not ARN) of the role to attach the policy to.
   */
  public open fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  /**
   * The name (friendly name, not ARN) of the role to attach the policy to.
   */
  public open fun roles(`value`: List<String>) {
    unwrap(this).setRoles(`value`)
  }

  /**
   * The name (friendly name, not ARN) of the role to attach the policy to.
   */
  public open fun roles(vararg `value`: String): Unit = roles(`value`.toList())

  /**
   * The name (friendly name, not ARN) of the IAM user to attach the policy to.
   */
  public open fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  /**
   * The name (friendly name, not ARN) of the IAM user to attach the policy to.
   */
  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  /**
   * The name (friendly name, not ARN) of the IAM user to attach the policy to.
   */
  public open fun users(vararg `value`: String): Unit = users(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnManagedPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A friendly description of the policy.
     *
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     *
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description)
     * @param description A friendly description of the policy. 
     */
    public fun description(description: String)

    /**
     * The name (friendly name, not ARN) of the group to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to. 
     */
    public fun groups(groups: List<String>)

    /**
     * The name (friendly name, not ARN) of the group to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to. 
     */
    public fun groups(vararg groups: String)

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
     * @param managedPolicyName The friendly name of the policy. 
     */
    public fun managedPolicyName(managedPolicyName: String)

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
     * Default: - "/"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-path)
     * @param path The path for the policy. 
     */
    public fun path(path: String)

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
     * @param policyDocument The JSON policy document that you want to use as the content for the
     * new policy. 
     */
    public fun policyDocument(policyDocument: Any)

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
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to. 
     */
    public fun roles(roles: List<String>)

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
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to. 
     */
    public fun roles(vararg roles: String)

    /**
     * The name (friendly name, not ARN) of the IAM user to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to. 
     */
    public fun users(users: List<String>)

    /**
     * The name (friendly name, not ARN) of the IAM user to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to. 
     */
    public fun users(vararg users: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnManagedPolicy.Builder =
        software.amazon.awscdk.services.iam.CfnManagedPolicy.Builder.create(scope, id)

    /**
     * A friendly description of the policy.
     *
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     *
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description)
     * @param description A friendly description of the policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name (friendly name, not ARN) of the group to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to. 
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * The name (friendly name, not ARN) of the group to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
     * @param groups The name (friendly name, not ARN) of the group to attach the policy to. 
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

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
     * @param managedPolicyName The friendly name of the policy. 
     */
    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

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
     * Default: - "/"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-path)
     * @param path The path for the policy. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

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
     * @param policyDocument The JSON policy document that you want to use as the content for the
     * new policy. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

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
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to. 
     */
    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

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
     * @param roles The name (friendly name, not ARN) of the role to attach the policy to. 
     */
    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    /**
     * The name (friendly name, not ARN) of the IAM user to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to. 
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * The name (friendly name, not ARN) of the IAM user to attach the policy to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
     * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to. 
     */
    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnManagedPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnManagedPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnManagedPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnManagedPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicy):
        CfnManagedPolicy = CfnManagedPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnManagedPolicy):
        software.amazon.awscdk.services.iam.CfnManagedPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.CfnManagedPolicy
  }
}
