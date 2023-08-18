@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sso

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnPermissionSet
import software.constructs.Construct

/**
 * Specifies a permission set within a specified IAM Identity Center instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * Object inlinePolicy;
 * CfnPermissionSet cfnPermissionSet = CfnPermissionSet.Builder.create(this, "MyCfnPermissionSet")
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
@CdkDslMarker
public class CfnPermissionSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPermissionSet.Builder = CfnPermissionSet.Builder.create(scope, id)

    private val _customerManagedPolicyReferences: MutableList<Any> = mutableListOf()

    private val _managedPolicies: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     *
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     *   policies that you have attached to your permission set.
     */
    public fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any) {
        _customerManagedPolicyReferences.addAll(listOf(*customerManagedPolicyReferences))
    }

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     *
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     *   policies that you have attached to your permission set.
     */
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: Collection<Any>) {
        _customerManagedPolicyReferences.addAll(customerManagedPolicyReferences)
    }

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     *
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     *   policies that you have attached to your permission set.
     */
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
        cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences)
    }

    /**
     * The description of the `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-description)
     *
     * @param description The description of the `PermissionSet` .
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The inline policy that is attached to the permission set.
     *
     * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible
     * for an empty inline policy to be returned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-inlinepolicy)
     *
     * @param inlinePolicy The inline policy that is attached to the permission set.
     */
    public fun inlinePolicy(inlinePolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(inlinePolicy)
        cdkBuilder.inlinePolicy(builder.map)
    }

    /**
     * The inline policy that is attached to the permission set.
     *
     * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible
     * for an empty inline policy to be returned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-inlinepolicy)
     *
     * @param inlinePolicy The inline policy that is attached to the permission set.
     */
    public fun inlinePolicy(inlinePolicy: Any) {
        cdkBuilder.inlinePolicy(inlinePolicy)
    }

    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * For more information about ARNs, see
     * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     * in the *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-instancearn)
     *
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     *   be executed.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * A structure that stores the details of the AWS managed policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
     *
     * @param managedPolicies A structure that stores the details of the AWS managed policy.
     */
    public fun managedPolicies(vararg managedPolicies: String) {
        _managedPolicies.addAll(listOf(*managedPolicies))
    }

    /**
     * A structure that stores the details of the AWS managed policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
     *
     * @param managedPolicies A structure that stores the details of the AWS managed policy.
     */
    public fun managedPolicies(managedPolicies: Collection<String>) {
        _managedPolicies.addAll(managedPolicies)
    }

    /**
     * The name of the permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-name)
     *
     * @param name The name of the permission set.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Specifies the configuration of the AWS managed or customer managed policy that you want to
     * set as a permissions boundary.
     *
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see
     * [Permissions boundaries for IAM entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
     * in the *IAM User Guide* .
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-permissionsboundary)
     *
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     *   policy that you want to set as a permissions boundary.
     */
    public fun permissionsBoundary(permissionsBoundary: IResolvable) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * Specifies the configuration of the AWS managed or customer managed policy that you want to
     * set as a permissions boundary.
     *
     * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer
     * managed policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions
     * boundary represents the maximum permissions that any policy can grant your role. For more
     * information, see
     * [Permissions boundaries for IAM entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
     * in the *IAM User Guide* .
     *
     * Policies used as permissions boundaries don't provide permissions. You must also attach an
     * IAM policy to the role. To learn how the effective permissions for a role are evaluated, see
     * [IAM JSON policy evaluation logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-permissionsboundary)
     *
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     *   policy that you want to set as a permissions boundary.
     */
    public fun permissionsBoundary(
        permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty
    ) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * Used to redirect users within the application during the federation authentication process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-relaystatetype)
     *
     * @param relayStateType Used to redirect users within the application during the federation
     *   authentication process.
     */
    public fun relayStateType(relayStateType: String) {
        cdkBuilder.relayStateType(relayStateType)
    }

    /**
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-sessionduration)
     *
     * @param sessionDuration The length of time that the application user sessions are valid for in
     *   the ISO-8601 standard.
     */
    public fun sessionDuration(sessionDuration: String) {
        cdkBuilder.sessionDuration(sessionDuration)
    }

    /**
     * The tags to attach to the new `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
     *
     * @param tags The tags to attach to the new `PermissionSet` .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to attach to the new `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
     *
     * @param tags The tags to attach to the new `PermissionSet` .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPermissionSet {
        if (_customerManagedPolicyReferences.isNotEmpty())
            cdkBuilder.customerManagedPolicyReferences(_customerManagedPolicyReferences)
        if (_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
