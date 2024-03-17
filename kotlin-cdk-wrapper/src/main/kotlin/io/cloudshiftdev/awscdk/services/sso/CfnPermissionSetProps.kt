@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPermissionSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * Object inlinePolicy;
 * CfnPermissionSetProps cfnPermissionSetProps = CfnPermissionSetProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .customerManagedPolicyReferences(List.of(CustomerManagedPolicyReferenceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .path("path")
 * .build()))
 * .description("description")
 * .inlinePolicy(inlinePolicy)
 * .managedPolicies(List.of("managedPolicies"))
 * .permissionsBoundary(PermissionsBoundaryProperty.builder()
 * .customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .path("path")
 * .build())
 * .managedPolicyArn("managedPolicyArn")
 * .build())
 * .relayStateType("relayStateType")
 * .sessionDuration("sessionDuration")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html)
 */
public interface CfnPermissionSetProps {
  /**
   * Specifies the names and paths of the customer managed policies that you have attached to your
   * permission set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
   */
  public fun customerManagedPolicyReferences(): Any? =
      unwrap(this).getCustomerManagedPolicyReferences()

  /**
   * The description of the `PermissionSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The inline policy that is attached to the permission set.
   *
   *
   * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible for
   * an empty inline policy to be returned.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-inlinepolicy)
   */
  public fun inlinePolicy(): Any? = unwrap(this).getInlinePolicy()

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   *
   * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
   * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
   * *AWS General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-instancearn)
   */
  public fun instanceArn(): String

  /**
   * A structure that stores the details of the AWS managed policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
   */
  public fun managedPolicies(): List<String> = unwrap(this).getManagedPolicies() ?: emptyList()

  /**
   * The name of the permission set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-name)
   */
  public fun name(): String

  /**
   * Specifies the configuration of the AWS managed or customer managed policy that you want to set
   * as a permissions boundary.
   *
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
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-permissionsboundary)
   */
  public fun permissionsBoundary(): Any? = unwrap(this).getPermissionsBoundary()

  /**
   * Used to redirect users within the application during the federation authentication process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-relaystatetype)
   */
  public fun relayStateType(): String? = unwrap(this).getRelayStateType()

  /**
   * The length of time that the application user sessions are valid for in the ISO-8601 standard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-sessionduration)
   */
  public fun sessionDuration(): String? = unwrap(this).getSessionDuration()

  /**
   * The tags to attach to the new `PermissionSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPermissionSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set.
     */
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable)

    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set.
     */
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>)

    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set.
     */
    public fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any)

    /**
     * @param description The description of the `PermissionSet` .
     */
    public fun description(description: String)

    /**
     * @param inlinePolicy The inline policy that is attached to the permission set.
     *
     * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible
     * for an empty inline policy to be returned.
     */
    public fun inlinePolicy(inlinePolicy: Any)

    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param managedPolicies A structure that stores the details of the AWS managed policy.
     */
    public fun managedPolicies(managedPolicies: List<String>)

    /**
     * @param managedPolicies A structure that stores the details of the AWS managed policy.
     */
    public fun managedPolicies(vararg managedPolicies: String)

    /**
     * @param name The name of the permission set. 
     */
    public fun name(name: String)

    /**
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary.
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation
     * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     */
    public fun permissionsBoundary(permissionsBoundary: IResolvable)

    /**
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary.
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation
     * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     */
    public
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty)

    /**
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary.
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation
     * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c14e6a4914bb3fafcbed2113b07967e85f359ce102bc4d4a1e87c2c63c3afa")
    public
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty.Builder.() -> Unit)

    /**
     * @param relayStateType Used to redirect users within the application during the federation
     * authentication process.
     */
    public fun relayStateType(relayStateType: String)

    /**
     * @param sessionDuration The length of time that the application user sessions are valid for in
     * the ISO-8601 standard.
     */
    public fun sessionDuration(sessionDuration: String)

    /**
     * @param tags The tags to attach to the new `PermissionSet` .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to attach to the new `PermissionSet` .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnPermissionSetProps.Builder =
        software.amazon.awscdk.services.sso.CfnPermissionSetProps.builder()

    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set.
     */
    override fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences.let(IResolvable::unwrap))
    }

    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set.
     */
    override fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences)
    }

    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set.
     */
    override fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any): Unit
        = customerManagedPolicyReferences(customerManagedPolicyReferences.toList())

    /**
     * @param description The description of the `PermissionSet` .
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inlinePolicy The inline policy that is attached to the permission set.
     *
     * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible
     * for an empty inline policy to be returned.
     */
    override fun inlinePolicy(inlinePolicy: Any) {
      cdkBuilder.inlinePolicy(inlinePolicy)
    }

    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param managedPolicies A structure that stores the details of the AWS managed policy.
     */
    override fun managedPolicies(managedPolicies: List<String>) {
      cdkBuilder.managedPolicies(managedPolicies)
    }

    /**
     * @param managedPolicies A structure that stores the details of the AWS managed policy.
     */
    override fun managedPolicies(vararg managedPolicies: String): Unit =
        managedPolicies(managedPolicies.toList())

    /**
     * @param name The name of the permission set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary.
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation
     * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     */
    override fun permissionsBoundary(permissionsBoundary: IResolvable) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IResolvable::unwrap))
    }

    /**
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary.
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation
     * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     */
    override
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(CfnPermissionSet.PermissionsBoundaryProperty::unwrap))
    }

    /**
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary.
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation
     * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c14e6a4914bb3fafcbed2113b07967e85f359ce102bc4d4a1e87c2c63c3afa")
    override
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty.Builder.() -> Unit):
        Unit =
        permissionsBoundary(CfnPermissionSet.PermissionsBoundaryProperty(permissionsBoundary))

    /**
     * @param relayStateType Used to redirect users within the application during the federation
     * authentication process.
     */
    override fun relayStateType(relayStateType: String) {
      cdkBuilder.relayStateType(relayStateType)
    }

    /**
     * @param sessionDuration The length of time that the application user sessions are valid for in
     * the ISO-8601 standard.
     */
    override fun sessionDuration(sessionDuration: String) {
      cdkBuilder.sessionDuration(sessionDuration)
    }

    /**
     * @param tags The tags to attach to the new `PermissionSet` .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to attach to the new `PermissionSet` .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sso.CfnPermissionSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSetProps,
  ) : CdkObject(cdkObject), CfnPermissionSetProps {
    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     */
    override fun customerManagedPolicyReferences(): Any? =
        unwrap(this).getCustomerManagedPolicyReferences()

    /**
     * The description of the `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The inline policy that is attached to the permission set.
     *
     *
     * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible
     * for an empty inline policy to be returned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-inlinepolicy)
     */
    override fun inlinePolicy(): Any? = unwrap(this).getInlinePolicy()

    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * A structure that stores the details of the AWS managed policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
     */
    override fun managedPolicies(): List<String> = unwrap(this).getManagedPolicies() ?: emptyList()

    /**
     * The name of the permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies the configuration of the AWS managed or customer managed policy that you want to
     * set as a permissions boundary.
     *
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see [Permissions boundaries for IAM
     * entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation
     * logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-permissionsboundary)
     */
    override fun permissionsBoundary(): Any? = unwrap(this).getPermissionsBoundary()

    /**
     * Used to redirect users within the application during the federation authentication process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-relaystatetype)
     */
    override fun relayStateType(): String? = unwrap(this).getRelayStateType()

    /**
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-sessionduration)
     */
    override fun sessionDuration(): String? = unwrap(this).getSessionDuration()

    /**
     * The tags to attach to the new `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSetProps):
        CfnPermissionSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPermissionSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionSetProps):
        software.amazon.awscdk.services.sso.CfnPermissionSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sso.CfnPermissionSetProps
  }
}
