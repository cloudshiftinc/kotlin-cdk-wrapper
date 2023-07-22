@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnPolicyProps

/**
 * Properties for defining a `CfnPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
 * .policyDocument(policyDocument)
 * .policyName("policyName")
 * // the properties below are optional
 * .groups(List.of("groups"))
 * .roles(List.of("roles"))
 * .users(List.of("users"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html)
 */
@CdkDslMarker
public class CfnPolicyPropsDsl {
  private val cdkBuilder: CfnPolicyProps.Builder = CfnPolicyProps.builder()

  private val _groups: MutableList<String> = mutableListOf()

  private val _roles: MutableList<String> = mutableListOf()

  private val _users: MutableList<String> = mutableListOf()

  /**
   * @param groups The name of the group to associate the policy with.
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-.
   */
  public fun groups(vararg groups: String) {
    _groups.addAll(listOf(*groups))
  }

  /**
   * @param groups The name of the group to associate the policy with.
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-.
   */
  public fun groups(groups: Collection<String>) {
    _groups.addAll(groups)
  }

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
  public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.map)
  }

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
  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * @param policyName The name of the policy document. 
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * @param roles The name of the role to associate the policy with.
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
   */
  public fun roles(vararg roles: String) {
    _roles.addAll(listOf(*roles))
  }

  /**
   * @param roles The name of the role to associate the policy with.
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
   */
  public fun roles(roles: Collection<String>) {
    _roles.addAll(roles)
  }

  /**
   * @param users The name of the user to associate the policy with.
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   */
  public fun users(vararg users: String) {
    _users.addAll(listOf(*users))
  }

  /**
   * @param users The name of the user to associate the policy with.
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   */
  public fun users(users: Collection<String>) {
    _users.addAll(users)
  }

  public fun build(): CfnPolicyProps {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_roles.isNotEmpty()) cdkBuilder.roles(_roles)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
