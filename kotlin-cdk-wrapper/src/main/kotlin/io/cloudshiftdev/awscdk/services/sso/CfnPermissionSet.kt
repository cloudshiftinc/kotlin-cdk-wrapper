@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a permission set within a specified IAM Identity Center instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
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
public open class CfnPermissionSet(
  cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPermissionSetProps,
  ) :
      this(software.amazon.awscdk.services.sso.CfnPermissionSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPermissionSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPermissionSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPermissionSetProps(props)
  )

  /**
   * The permission set ARN of the permission set, such as
   * `arn:aws:sso:::permissionSet/ins-instanceid/ps-permissionsetid` .
   */
  public open fun attrPermissionSetArn(): String = unwrap(this).getAttrPermissionSetArn()

  /**
   * Specifies the names and paths of the customer managed policies that you have attached to your
   * permission set.
   */
  public open fun customerManagedPolicyReferences(): Any? =
      unwrap(this).getCustomerManagedPolicyReferences()

  /**
   * Specifies the names and paths of the customer managed policies that you have attached to your
   * permission set.
   */
  public open fun customerManagedPolicyReferences(`value`: IResolvable) {
    unwrap(this).setCustomerManagedPolicyReferences(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the names and paths of the customer managed policies that you have attached to your
   * permission set.
   */
  public open fun customerManagedPolicyReferences(`value`: List<Any>) {
    unwrap(this).setCustomerManagedPolicyReferences(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies the names and paths of the customer managed policies that you have attached to your
   * permission set.
   */
  public open fun customerManagedPolicyReferences(vararg `value`: Any): Unit =
      customerManagedPolicyReferences(`value`.toList())

  /**
   * The description of the `PermissionSet` .
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the `PermissionSet` .
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The inline policy that is attached to the permission set.
   */
  public open fun inlinePolicy(): Any? = unwrap(this).getInlinePolicy()

  /**
   * The inline policy that is attached to the permission set.
   */
  public open fun inlinePolicy(`value`: Any) {
    unwrap(this).setInlinePolicy(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * A structure that stores the details of the AWS managed policy.
   */
  public open fun managedPolicies(): List<String> = unwrap(this).getManagedPolicies() ?: emptyList()

  /**
   * A structure that stores the details of the AWS managed policy.
   */
  public open fun managedPolicies(`value`: List<String>) {
    unwrap(this).setManagedPolicies(`value`)
  }

  /**
   * A structure that stores the details of the AWS managed policy.
   */
  public open fun managedPolicies(vararg `value`: String): Unit = managedPolicies(`value`.toList())

  /**
   * The name of the permission set.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the permission set.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the configuration of the AWS managed or customer managed policy that you want to set
   * as a permissions boundary.
   */
  public open fun permissionsBoundary(): Any? = unwrap(this).getPermissionsBoundary()

  /**
   * Specifies the configuration of the AWS managed or customer managed policy that you want to set
   * as a permissions boundary.
   */
  public open fun permissionsBoundary(`value`: IResolvable) {
    unwrap(this).setPermissionsBoundary(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the configuration of the AWS managed or customer managed policy that you want to set
   * as a permissions boundary.
   */
  public open fun permissionsBoundary(`value`: PermissionsBoundaryProperty) {
    unwrap(this).setPermissionsBoundary(`value`.let(PermissionsBoundaryProperty.Companion::unwrap))
  }

  /**
   * Specifies the configuration of the AWS managed or customer managed policy that you want to set
   * as a permissions boundary.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccc4618b8ea8743ee19aa0f130b8c4d8128d5a8f581515c866d1c24d5c369f81")
  public open fun permissionsBoundary(`value`: PermissionsBoundaryProperty.Builder.() -> Unit): Unit
      = permissionsBoundary(PermissionsBoundaryProperty(`value`))

  /**
   * Used to redirect users within the application during the federation authentication process.
   */
  public open fun relayStateType(): String? = unwrap(this).getRelayStateType()

  /**
   * Used to redirect users within the application during the federation authentication process.
   */
  public open fun relayStateType(`value`: String) {
    unwrap(this).setRelayStateType(`value`)
  }

  /**
   * The length of time that the application user sessions are valid for in the ISO-8601 standard.
   */
  public open fun sessionDuration(): String? = unwrap(this).getSessionDuration()

  /**
   * The length of time that the application user sessions are valid for in the ISO-8601 standard.
   */
  public open fun sessionDuration(`value`: String) {
    unwrap(this).setSessionDuration(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to attach to the new `PermissionSet` .
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to attach to the new `PermissionSet` .
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to attach to the new `PermissionSet` .
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sso.CfnPermissionSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set. 
     */
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable)

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set. 
     */
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>)

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set. 
     */
    public fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any)

    /**
     * The description of the `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-description)
     * @param description The description of the `PermissionSet` . 
     */
    public fun description(description: String)

    /**
     * The inline policy that is attached to the permission set.
     *
     *
     * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible
     * for an empty inline policy to be returned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-inlinepolicy)
     * @param inlinePolicy The inline policy that is attached to the permission set. 
     */
    public fun inlinePolicy(inlinePolicy: Any)

    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-instancearn)
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * A structure that stores the details of the AWS managed policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
     * @param managedPolicies A structure that stores the details of the AWS managed policy. 
     */
    public fun managedPolicies(managedPolicies: List<String>)

    /**
     * A structure that stores the details of the AWS managed policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
     * @param managedPolicies A structure that stores the details of the AWS managed policy. 
     */
    public fun managedPolicies(vararg managedPolicies: String)

    /**
     * The name of the permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-name)
     * @param name The name of the permission set. 
     */
    public fun name(name: String)

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
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary. 
     */
    public fun permissionsBoundary(permissionsBoundary: IResolvable)

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
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary. 
     */
    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty)

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
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2b281fcd686446b3f09daa41b872dc6e753e0375a9adcd7db672c7edd7a792")
    public
        fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty.Builder.() -> Unit)

    /**
     * Used to redirect users within the application during the federation authentication process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-relaystatetype)
     * @param relayStateType Used to redirect users within the application during the federation
     * authentication process. 
     */
    public fun relayStateType(relayStateType: String)

    /**
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-sessionduration)
     * @param sessionDuration The length of time that the application user sessions are valid for in
     * the ISO-8601 standard. 
     */
    public fun sessionDuration(sessionDuration: String)

    /**
     * The tags to attach to the new `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
     * @param tags The tags to attach to the new `PermissionSet` . 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to attach to the new `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
     * @param tags The tags to attach to the new `PermissionSet` . 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnPermissionSet.Builder =
        software.amazon.awscdk.services.sso.CfnPermissionSet.Builder.create(scope, id)

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set. 
     */
    override fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set. 
     */
    override fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies the names and paths of the customer managed policies that you have attached to your
     * permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-customermanagedpolicyreferences)
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed
     * policies that you have attached to your permission set. 
     */
    override fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any): Unit
        = customerManagedPolicyReferences(customerManagedPolicyReferences.toList())

    /**
     * The description of the `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-description)
     * @param description The description of the `PermissionSet` . 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The inline policy that is attached to the permission set.
     *
     *
     * For `Length Constraints` , if a valid ARN is provided for a permission set, it is possible
     * for an empty inline policy to be returned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-inlinepolicy)
     * @param inlinePolicy The inline policy that is attached to the permission set. 
     */
    override fun inlinePolicy(inlinePolicy: Any) {
      cdkBuilder.inlinePolicy(inlinePolicy)
    }

    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-instancearn)
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * A structure that stores the details of the AWS managed policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
     * @param managedPolicies A structure that stores the details of the AWS managed policy. 
     */
    override fun managedPolicies(managedPolicies: List<String>) {
      cdkBuilder.managedPolicies(managedPolicies)
    }

    /**
     * A structure that stores the details of the AWS managed policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-managedpolicies)
     * @param managedPolicies A structure that stores the details of the AWS managed policy. 
     */
    override fun managedPolicies(vararg managedPolicies: String): Unit =
        managedPolicies(managedPolicies.toList())

    /**
     * The name of the permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-name)
     * @param name The name of the permission set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary. 
     */
    override fun permissionsBoundary(permissionsBoundary: IResolvable) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IResolvable.Companion::unwrap))
    }

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
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary. 
     */
    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundaryProperty.Companion::unwrap))
    }

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
     * @param permissionsBoundary Specifies the configuration of the AWS managed or customer managed
     * policy that you want to set as a permissions boundary. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2b281fcd686446b3f09daa41b872dc6e753e0375a9adcd7db672c7edd7a792")
    override
        fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty.Builder.() -> Unit):
        Unit = permissionsBoundary(PermissionsBoundaryProperty(permissionsBoundary))

    /**
     * Used to redirect users within the application during the federation authentication process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-relaystatetype)
     * @param relayStateType Used to redirect users within the application during the federation
     * authentication process. 
     */
    override fun relayStateType(relayStateType: String) {
      cdkBuilder.relayStateType(relayStateType)
    }

    /**
     * The length of time that the application user sessions are valid for in the ISO-8601 standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-sessionduration)
     * @param sessionDuration The length of time that the application user sessions are valid for in
     * the ISO-8601 standard. 
     */
    override fun sessionDuration(sessionDuration: String) {
      cdkBuilder.sessionDuration(sessionDuration)
    }

    /**
     * The tags to attach to the new `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
     * @param tags The tags to attach to the new `PermissionSet` . 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to attach to the new `PermissionSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-permissionset.html#cfn-sso-permissionset-tags)
     * @param tags The tags to attach to the new `PermissionSet` . 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sso.CfnPermissionSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sso.CfnPermissionSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermissionSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermissionSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet):
        CfnPermissionSet = CfnPermissionSet(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionSet):
        software.amazon.awscdk.services.sso.CfnPermissionSet = wrapped.cdkObject as
        software.amazon.awscdk.services.sso.CfnPermissionSet
  }

  /**
   * Specifies the name and path of a customer managed policy.
   *
   * You must have an IAM policy that matches the name and path in each AWS account where you want
   * to deploy your permission set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sso.*;
   * CustomerManagedPolicyReferenceProperty customerManagedPolicyReferenceProperty =
   * CustomerManagedPolicyReferenceProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-customermanagedpolicyreference.html)
   */
  public interface CustomerManagedPolicyReferenceProperty {
    /**
     * The name of the IAM policy that you have configured in each account where you want to deploy
     * your permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-customermanagedpolicyreference.html#cfn-sso-permissionset-customermanagedpolicyreference-name)
     */
    public fun name(): String

    /**
     * The path to the IAM policy that you have configured in each account where you want to deploy
     * your permission set.
     *
     * The default is `/` . For more information, see [Friendly names and
     * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-customermanagedpolicyreference.html#cfn-sso-permissionset-customermanagedpolicyreference-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [CustomerManagedPolicyReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the IAM policy that you have configured in each account where you
       * want to deploy your permission set. 
       */
      public fun name(name: String)

      /**
       * @param path The path to the IAM policy that you have configured in each account where you
       * want to deploy your permission set.
       * The default is `/` . For more information, see [Friendly names and
       * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
       * in the *IAM User Guide* .
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty.builder()

      /**
       * @param name The name of the IAM policy that you have configured in each account where you
       * want to deploy your permission set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param path The path to the IAM policy that you have configured in each account where you
       * want to deploy your permission set.
       * The default is `/` . For more information, see [Friendly names and
       * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
       * in the *IAM User Guide* .
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty,
    ) : CdkObject(cdkObject),
        CustomerManagedPolicyReferenceProperty {
      /**
       * The name of the IAM policy that you have configured in each account where you want to
       * deploy your permission set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-customermanagedpolicyreference.html#cfn-sso-permissionset-customermanagedpolicyreference-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The path to the IAM policy that you have configured in each account where you want to
       * deploy your permission set.
       *
       * The default is `/` . For more information, see [Friendly names and
       * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
       * in the *IAM User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-customermanagedpolicyreference.html#cfn-sso-permissionset-customermanagedpolicyreference-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomerManagedPolicyReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty):
          CustomerManagedPolicyReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerManagedPolicyReferenceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedPolicyReferenceProperty):
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty
    }
  }

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
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sso.*;
   * PermissionsBoundaryProperty permissionsBoundaryProperty = PermissionsBoundaryProperty.builder()
   * .customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .path("path")
   * .build())
   * .managedPolicyArn("managedPolicyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-permissionsboundary.html)
   */
  public interface PermissionsBoundaryProperty {
    /**
     * Specifies the name and path of a customer managed policy.
     *
     * You must have an IAM policy that matches the name and path in each AWS account where you want
     * to deploy your permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-permissionsboundary.html#cfn-sso-permissionset-permissionsboundary-customermanagedpolicyreference)
     */
    public fun customerManagedPolicyReference(): Any? =
        unwrap(this).getCustomerManagedPolicyReference()

    /**
     * The AWS managed policy ARN that you want to attach to a permission set as a permissions
     * boundary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-permissionsboundary.html#cfn-sso-permissionset-permissionsboundary-managedpolicyarn)
     */
    public fun managedPolicyArn(): String? = unwrap(this).getManagedPolicyArn()

    /**
     * A builder for [PermissionsBoundaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManagedPolicyReference Specifies the name and path of a customer managed
       * policy.
       * You must have an IAM policy that matches the name and path in each AWS account where you
       * want to deploy your permission set.
       */
      public fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable)

      /**
       * @param customerManagedPolicyReference Specifies the name and path of a customer managed
       * policy.
       * You must have an IAM policy that matches the name and path in each AWS account where you
       * want to deploy your permission set.
       */
      public
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty)

      /**
       * @param customerManagedPolicyReference Specifies the name and path of a customer managed
       * policy.
       * You must have an IAM policy that matches the name and path in each AWS account where you
       * want to deploy your permission set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1966918747bd1a2b8f3efd6711b8ee888d72bbb3a1b39999a072ea1761c9702e")
      public
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty.Builder.() -> Unit)

      /**
       * @param managedPolicyArn The AWS managed policy ARN that you want to attach to a permission
       * set as a permissions boundary.
       */
      public fun managedPolicyArn(managedPolicyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty.Builder =
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty.builder()

      /**
       * @param customerManagedPolicyReference Specifies the name and path of a customer managed
       * policy.
       * You must have an IAM policy that matches the name and path in each AWS account where you
       * want to deploy your permission set.
       */
      override fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerManagedPolicyReference Specifies the name and path of a customer managed
       * policy.
       * You must have an IAM policy that matches the name and path in each AWS account where you
       * want to deploy your permission set.
       */
      override
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference.let(CustomerManagedPolicyReferenceProperty.Companion::unwrap))
      }

      /**
       * @param customerManagedPolicyReference Specifies the name and path of a customer managed
       * policy.
       * You must have an IAM policy that matches the name and path in each AWS account where you
       * want to deploy your permission set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1966918747bd1a2b8f3efd6711b8ee888d72bbb3a1b39999a072ea1761c9702e")
      override
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty.Builder.() -> Unit):
          Unit =
          customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty(customerManagedPolicyReference))

      /**
       * @param managedPolicyArn The AWS managed policy ARN that you want to attach to a permission
       * set as a permissions boundary.
       */
      override fun managedPolicyArn(managedPolicyArn: String) {
        cdkBuilder.managedPolicyArn(managedPolicyArn)
      }

      public fun build():
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty,
    ) : CdkObject(cdkObject),
        PermissionsBoundaryProperty {
      /**
       * Specifies the name and path of a customer managed policy.
       *
       * You must have an IAM policy that matches the name and path in each AWS account where you
       * want to deploy your permission set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-permissionsboundary.html#cfn-sso-permissionset-permissionsboundary-customermanagedpolicyreference)
       */
      override fun customerManagedPolicyReference(): Any? =
          unwrap(this).getCustomerManagedPolicyReference()

      /**
       * The AWS managed policy ARN that you want to attach to a permission set as a permissions
       * boundary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-permissionsboundary.html#cfn-sso-permissionset-permissionsboundary-managedpolicyarn)
       */
      override fun managedPolicyArn(): String? = unwrap(this).getManagedPolicyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PermissionsBoundaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty):
          PermissionsBoundaryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PermissionsBoundaryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PermissionsBoundaryProperty):
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty
    }
  }
}
