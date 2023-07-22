@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnPermissionSet
import software.amazon.awscdk.services.sso.CfnPermissionSetProps

@CdkDslMarker
public class CfnPermissionSetPropsDsl {
  private val cdkBuilder: CfnPermissionSetProps.Builder = CfnPermissionSetProps.builder()

  private val _customerManagedPolicyReferences: MutableList<Any> = mutableListOf()

  private val _managedPolicies: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
   * policies that you have attached to your permission set.
   */
  public fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any) {
    _customerManagedPolicyReferences.addAll(listOf(*customerManagedPolicyReferences))
  }

  /**
   * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
   * policies that you have attached to your permission set.
   */
  public fun customerManagedPolicyReferences(customerManagedPolicyReferences: Collection<Any>) {
    _customerManagedPolicyReferences.addAll(customerManagedPolicyReferences)
  }

  /**
   * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
   * policies that you have attached to your permission set.
   */
  public fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
    cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences)
  }

  /**
   * @param description The description of the `PermissionSet` .
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param inlinePolicy The inline policy that is attached to the permission set.
   *
   * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible for
   * an empty inline policy to be returned.
   */
  public fun inlinePolicy(inlinePolicy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(inlinePolicy)
    cdkBuilder.inlinePolicy(builder.map)
  }

  /**
   * @param inlinePolicy The inline policy that is attached to the permission set.
   *
   * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible for
   * an empty inline policy to be returned.
   */
  public fun inlinePolicy(inlinePolicy: Any) {
    cdkBuilder.inlinePolicy(inlinePolicy)
  }

  /**
   * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
   * be executed. 
   * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
   * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
   * *AWS General Reference* .
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param managedPolicies A structure that stores the details of the AWS managed policy.
   */
  public fun managedPolicies(vararg managedPolicies: String) {
    _managedPolicies.addAll(listOf(*managedPolicies))
  }

  /**
   * @param managedPolicies A structure that stores the details of the AWS managed policy.
   */
  public fun managedPolicies(managedPolicies: Collection<String>) {
    _managedPolicies.addAll(managedPolicies)
  }

  /**
   * @param name The name of the permission set. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
   * policy that you want to set as a permissions boundary.
   * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer managed
   * policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions boundary
   * represents the maximum permissions that any policy can grant your role. For more information, see
   * [Permissions boundaries for IAM
   * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in the
   * *IAM User Guide* .
   *
   *
   * Policies used as permissions boundaries don't provide permissions. You must also attach an IAM
   * policy to the role. To learn how the effective permissions for a role are evaluated, see [IAM JSON
   * policy evaluation
   * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
   * in the *IAM User Guide* .
   */
  public fun permissionsBoundary(permissionsBoundary: IResolvable) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  /**
   * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
   * policy that you want to set as a permissions boundary.
   * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer managed
   * policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions boundary
   * represents the maximum permissions that any policy can grant your role. For more information, see
   * [Permissions boundaries for IAM
   * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in the
   * *IAM User Guide* .
   *
   *
   * Policies used as permissions boundaries don't provide permissions. You must also attach an IAM
   * policy to the role. To learn how the effective permissions for a role are evaluated, see [IAM JSON
   * policy evaluation
   * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
   * in the *IAM User Guide* .
   */
  public
      fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  /**
   * @param relayStateType Used to redirect users within the application during the federation
   * authentication process.
   */
  public fun relayStateType(relayStateType: String) {
    cdkBuilder.relayStateType(relayStateType)
  }

  /**
   * @param sessionDuration The length of time that the application user sessions are valid for in
   * the ISO-8601 standard.
   */
  public fun sessionDuration(sessionDuration: String) {
    cdkBuilder.sessionDuration(sessionDuration)
  }

  /**
   * @param tags The tags to attach to the new `PermissionSet` .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to attach to the new `PermissionSet` .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPermissionSetProps {
    if(_customerManagedPolicyReferences.isNotEmpty())
        cdkBuilder.customerManagedPolicyReferences(_customerManagedPolicyReferences)
    if(_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
