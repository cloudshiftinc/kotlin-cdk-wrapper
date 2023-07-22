@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnManagedPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnManagedPolicy.Builder = CfnManagedPolicy.Builder.create(scope, id)

  private val _groups: MutableList<String> = mutableListOf()

  private val _roles: MutableList<String> = mutableListOf()

  private val _users: MutableList<String> = mutableListOf()

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
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name (friendly name, not ARN) of the group to attach the policy to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
   * @param groups The name (friendly name, not ARN) of the group to attach the policy to. 
   */
  public fun groups(vararg groups: String) {
    _groups.addAll(listOf(*groups))
  }

  /**
   * The name (friendly name, not ARN) of the group to attach the policy to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
   * @param groups The name (friendly name, not ARN) of the group to attach the policy to. 
   */
  public fun groups(groups: Collection<String>) {
    _groups.addAll(groups)
  }

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
  public fun managedPolicyName(managedPolicyName: String) {
    cdkBuilder.managedPolicyName(managedPolicyName)
  }

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
   * @param path The path for the policy. 
   */
  public fun path(path: String) {
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
   * @param policyDocument The JSON policy document that you want to use as the content for the new
   * policy. 
   */
  public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.map)
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
   * @param policyDocument The JSON policy document that you want to use as the content for the new
   * policy. 
   */
  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

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
   * @param roles The name (friendly name, not ARN) of the role to attach the policy to. 
   */
  public fun roles(vararg roles: String) {
    _roles.addAll(listOf(*roles))
  }

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
   * @param roles The name (friendly name, not ARN) of the role to attach the policy to. 
   */
  public fun roles(roles: Collection<String>) {
    _roles.addAll(roles)
  }

  /**
   * The name (friendly name, not ARN) of the IAM user to attach the policy to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
   * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to. 
   */
  public fun users(vararg users: String) {
    _users.addAll(listOf(*users))
  }

  /**
   * The name (friendly name, not ARN) of the IAM user to attach the policy to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
   * @param users The name (friendly name, not ARN) of the IAM user to attach the policy to. 
   */
  public fun users(users: Collection<String>) {
    _users.addAll(users)
  }

  public fun build(): CfnManagedPolicy {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_roles.isNotEmpty()) cdkBuilder.roles(_roles)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
