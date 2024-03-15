@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS Firewall Manager policy.
 *
 * Firewall Manager provides the following types of policies:
 *
 * * An AWS Shield Advanced policy, which applies Shield Advanced protection to specified accounts
 * and resources.
 * * An AWS WAF policy (type WAFV2), which defines rule groups to run first in the corresponding AWS
 * WAF web ACL and rule groups to run last in the web ACL.
 * * An AWS WAF Classic policy, which defines a rule group. AWS WAF Classic doesn't support rule
 * groups in Amazon CloudFront , so, to create AWS WAF Classic policies through CloudFront , you first
 * need to create your rule groups outside of CloudFront .
 * * A security group policy, which manages VPC security groups across your AWS organization.
 * * An AWS Network Firewall policy, which provides firewall rules to filter network traffic in
 * specified Amazon VPCs.
 * * A DNS Firewall policy, which provides Amazon Route 53 Resolver DNS Firewall rules to filter DNS
 * queries for specified Amazon VPCs.
 * * A third-party firewall policy, which manages a third-party firewall service.
 *
 * Each policy is specific to one of the types. If you want to enforce more than one policy type
 * across accounts, create multiple policies. You can create multiple policies for each type.
 *
 * These policies require some setup to use. For more information, see the sections on prerequisites
 * and getting started under [AWS Firewall
 * Manager](https://docs.aws.amazon.com/waf/latest/developerguide/fms-prereq.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fms.*;
 * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
 * .excludeResourceTags(false)
 * .policyName("policyName")
 * .remediationEnabled(false)
 * .securityServicePolicyData(SecurityServicePolicyDataProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .managedServiceData("managedServiceData")
 * .policyOption(PolicyOptionProperty.builder()
 * .networkFirewallPolicy(NetworkFirewallPolicyProperty.builder()
 * .firewallDeploymentModel("firewallDeploymentModel")
 * .build())
 * .thirdPartyFirewallPolicy(ThirdPartyFirewallPolicyProperty.builder()
 * .firewallDeploymentModel("firewallDeploymentModel")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .deleteAllPolicyResources(false)
 * .excludeMap(Map.of(
 * "account", List.of("account"),
 * "orgunit", List.of("orgunit")))
 * .includeMap(Map.of(
 * "account", List.of("account"),
 * "orgunit", List.of("orgunit")))
 * .policyDescription("policyDescription")
 * .resourcesCleanUp(false)
 * .resourceSetIds(List.of("resourceSetIds"))
 * .resourceTags(List.of(ResourceTagProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .resourceType("resourceType")
 * .resourceTypeList(List.of("resourceTypeList"))
 * .tags(List.of(PolicyTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html)
 */
public open class CfnPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the policy.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the policy.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Used when deleting a policy.
   *
   * If `true` , Firewall Manager performs cleanup according to the policy type.
   */
  public open fun deleteAllPolicyResources(): Any? = unwrap(this).getDeleteAllPolicyResources()

  /**
   * Used when deleting a policy.
   *
   * If `true` , Firewall Manager performs cleanup according to the policy type.
   */
  public open fun deleteAllPolicyResources(`value`: Boolean) {
    unwrap(this).setDeleteAllPolicyResources(`value`)
  }

  /**
   * Used when deleting a policy.
   *
   * If `true` , Firewall Manager performs cleanup according to the policy type.
   */
  public open fun deleteAllPolicyResources(`value`: IResolvable) {
    unwrap(this).setDeleteAllPolicyResources(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude from
   * the policy.
   */
  public open fun excludeMap(): Any? = unwrap(this).getExcludeMap()

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude from
   * the policy.
   */
  public open fun excludeMap(`value`: IResolvable) {
    unwrap(this).setExcludeMap(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude from
   * the policy.
   */
  public open fun excludeMap(`value`: IEMapProperty) {
    unwrap(this).setExcludeMap(`value`.let(IEMapProperty::unwrap))
  }

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude from
   * the policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90dbafc25c20538b49a99a833f29adda3ceeb6177d4c33e0fe39c0b87784184a")
  public open fun excludeMap(`value`: IEMapProperty.Builder.() -> Unit): Unit =
      excludeMap(IEMapProperty(`value`))

  /**
   * Used only when tags are specified in the `ResourceTags` property.
   */
  public open fun excludeResourceTags(): Any = unwrap(this).getExcludeResourceTags()

  /**
   * Used only when tags are specified in the `ResourceTags` property.
   */
  public open fun excludeResourceTags(`value`: Boolean) {
    unwrap(this).setExcludeResourceTags(`value`)
  }

  /**
   * Used only when tags are specified in the `ResourceTags` property.
   */
  public open fun excludeResourceTags(`value`: IResolvable) {
    unwrap(this).setExcludeResourceTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
   * the policy.
   */
  public open fun includeMap(): Any? = unwrap(this).getIncludeMap()

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
   * the policy.
   */
  public open fun includeMap(`value`: IResolvable) {
    unwrap(this).setIncludeMap(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
   * the policy.
   */
  public open fun includeMap(`value`: IEMapProperty) {
    unwrap(this).setIncludeMap(`value`.let(IEMapProperty::unwrap))
  }

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
   * the policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c68e54f81e190605e1afc5ac2797654a27e81d755507dd5890fae0427d239d41")
  public open fun includeMap(`value`: IEMapProperty.Builder.() -> Unit): Unit =
      includeMap(IEMapProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The definition of the AWS Network Firewall firewall policy.
   */
  public open fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  /**
   * The definition of the AWS Network Firewall firewall policy.
   */
  public open fun policyDescription(`value`: String) {
    unwrap(this).setPolicyDescription(`value`)
  }

  /**
   * The name of the AWS Firewall Manager policy.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the AWS Firewall Manager policy.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * Indicates if the policy should be automatically applied to new resources.
   */
  public open fun remediationEnabled(): Any = unwrap(this).getRemediationEnabled()

  /**
   * Indicates if the policy should be automatically applied to new resources.
   */
  public open fun remediationEnabled(`value`: Boolean) {
    unwrap(this).setRemediationEnabled(`value`)
  }

  /**
   * Indicates if the policy should be automatically applied to new resources.
   */
  public open fun remediationEnabled(`value`: IResolvable) {
    unwrap(this).setRemediationEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The unique identifiers of the resource sets used by the policy.
   */
  public open fun resourceSetIds(): List<String> = unwrap(this).getResourceSetIds() ?: emptyList()

  /**
   * The unique identifiers of the resource sets used by the policy.
   */
  public open fun resourceSetIds(`value`: List<String>) {
    unwrap(this).setResourceSetIds(`value`)
  }

  /**
   * The unique identifiers of the resource sets used by the policy.
   */
  public open fun resourceSetIds(vararg `value`: String): Unit = resourceSetIds(`value`.toList())

  /**
   * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope or
   * explicitly exclude them.
   */
  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope or
   * explicitly exclude them.
   */
  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope or
   * explicitly exclude them.
   */
  public open fun resourceTags(_idx_ac66f0: List<Any>) {
    unwrap(this).setResourceTags(_idx_ac66f0)
  }

  /**
   * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope or
   * explicitly exclude them.
   */
  public open fun resourceTags(vararg _idx_ac66f0: Any): Unit = resourceTags(_idx_ac66f0.toList())

  /**
   * The type of resource protected by or in scope of the policy.
   */
  public open fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * The type of resource protected by or in scope of the policy.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * An array of `ResourceType` objects.
   */
  public open fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList() ?:
      emptyList()

  /**
   * An array of `ResourceType` objects.
   */
  public open fun resourceTypeList(`value`: List<String>) {
    unwrap(this).setResourceTypeList(`value`)
  }

  /**
   * An array of `ResourceType` objects.
   */
  public open fun resourceTypeList(vararg `value`: String): Unit =
      resourceTypeList(`value`.toList())

  /**
   * Indicates whether AWS Firewall Manager should automatically remove protections from resources
   * that leave the policy scope and clean up resources that Firewall Manager is managing for accounts
   * when those accounts leave policy scope.
   */
  public open fun resourcesCleanUp(): Any? = unwrap(this).getResourcesCleanUp()

  /**
   * Indicates whether AWS Firewall Manager should automatically remove protections from resources
   * that leave the policy scope and clean up resources that Firewall Manager is managing for accounts
   * when those accounts leave policy scope.
   */
  public open fun resourcesCleanUp(`value`: Boolean) {
    unwrap(this).setResourcesCleanUp(`value`)
  }

  /**
   * Indicates whether AWS Firewall Manager should automatically remove protections from resources
   * that leave the policy scope and clean up resources that Firewall Manager is managing for accounts
   * when those accounts leave policy scope.
   */
  public open fun resourcesCleanUp(`value`: IResolvable) {
    unwrap(this).setResourcesCleanUp(`value`.let(IResolvable::unwrap))
  }

  /**
   * Details about the security service that is being used to protect the resources.
   */
  public open fun securityServicePolicyData(): Any = unwrap(this).getSecurityServicePolicyData()

  /**
   * Details about the security service that is being used to protect the resources.
   */
  public open fun securityServicePolicyData(`value`: IResolvable) {
    unwrap(this).setSecurityServicePolicyData(`value`.let(IResolvable::unwrap))
  }

  /**
   * Details about the security service that is being used to protect the resources.
   */
  public open fun securityServicePolicyData(`value`: SecurityServicePolicyDataProperty) {
    unwrap(this).setSecurityServicePolicyData(`value`.let(SecurityServicePolicyDataProperty::unwrap))
  }

  /**
   * Details about the security service that is being used to protect the resources.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ba9b3b101a2f14f2a035ec72d41466b590f563c22e74c228b813fe7f551a4f0")
  public open
      fun securityServicePolicyData(`value`: SecurityServicePolicyDataProperty.Builder.() -> Unit):
      Unit = securityServicePolicyData(SecurityServicePolicyDataProperty(`value`))

  /**
   * A collection of key:value pairs associated with an AWS resource.
   */
  public open fun tags(): List<PolicyTagProperty> =
      unwrap(this).getTags()?.map(PolicyTagProperty::wrap) ?: emptyList()

  /**
   * A collection of key:value pairs associated with an AWS resource.
   */
  public open fun tags(`value`: List<PolicyTagProperty>) {
    unwrap(this).setTags(`value`.map(PolicyTagProperty::unwrap))
  }

  /**
   * A collection of key:value pairs associated with an AWS resource.
   */
  public open fun tags(vararg `value`: PolicyTagProperty): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fms.CfnPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Used when deleting a policy. If `true` , Firewall Manager performs cleanup according to the
     * policy type.
     *
     * For AWS WAF and Shield Advanced policies, Firewall Manager does the following:
     *
     * * Deletes rule groups created by Firewall Manager
     * * Removes web ACLs from in-scope resources
     * * Deletes web ACLs that contain no rules or rule groups
     *
     * For security group policies, Firewall Manager does the following for each security group in
     * the policy:
     *
     * * Disassociates the security group from in-scope resources
     * * Deletes the security group if it was created through Firewall Manager and if it's no longer
     * associated with any resources through another policy
     *
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy.
     * Protection of out-of-scope resources remains unchanged. Scope is determined by tags that you
     * create and accounts that you associate with the policy. When creating the policy, if you specify
     * that only resources in specific accounts or with specific tags are in scope of the policy, those
     * accounts and resources are handled by the policy. All others are out of scope. If you don't
     * specify tags or accounts, all resources are in scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources)
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type. 
     */
    public fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean)

    /**
     * Used when deleting a policy. If `true` , Firewall Manager performs cleanup according to the
     * policy type.
     *
     * For AWS WAF and Shield Advanced policies, Firewall Manager does the following:
     *
     * * Deletes rule groups created by Firewall Manager
     * * Removes web ACLs from in-scope resources
     * * Deletes web ACLs that contain no rules or rule groups
     *
     * For security group policies, Firewall Manager does the following for each security group in
     * the policy:
     *
     * * Disassociates the security group from in-scope resources
     * * Deletes the security group if it was created through Firewall Manager and if it's no longer
     * associated with any resources through another policy
     *
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy.
     * Protection of out-of-scope resources remains unchanged. Scope is determined by tags that you
     * create and accounts that you associate with the policy. When creating the policy, if you specify
     * that only resources in specific accounts or with specific tags are in scope of the policy, those
     * accounts and resources are handled by the policy. All others are out of scope. If you don't
     * specify tags or accounts, all resources are in scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources)
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type. 
     */
    public fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable)

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude
     * from the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excludemap)
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. 
     */
    public fun excludeMap(excludeMap: IResolvable)

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude
     * from the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excludemap)
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. 
     */
    public fun excludeMap(excludeMap: IEMapProperty)

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude
     * from the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excludemap)
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9201ba49b229379b9cdb087e646f6e6b0a3ee882c187741304b10358610837e3")
    public fun excludeMap(excludeMap: IEMapProperty.Builder.() -> Unit)

    /**
     * Used only when tags are specified in the `ResourceTags` property.
     *
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags)
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     */
    public fun excludeResourceTags(excludeResourceTags: Boolean)

    /**
     * Used only when tags are specified in the `ResourceTags` property.
     *
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags)
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     */
    public fun excludeResourceTags(excludeResourceTags: IResolvable)

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
     * the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-includemap)
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. 
     */
    public fun includeMap(includeMap: IResolvable)

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
     * the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-includemap)
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. 
     */
    public fun includeMap(includeMap: IEMapProperty)

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
     * the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-includemap)
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be0f3fca68c982884aadf66d90ba2c15d32110488071e4668446e1d23d98c8a")
    public fun includeMap(includeMap: IEMapProperty.Builder.() -> Unit)

    /**
     * The definition of the AWS Network Firewall firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policydescription)
     * @param policyDescription The definition of the AWS Network Firewall firewall policy. 
     */
    public fun policyDescription(policyDescription: String)

    /**
     * The name of the AWS Firewall Manager policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname)
     * @param policyName The name of the AWS Firewall Manager policy. 
     */
    public fun policyName(policyName: String)

    /**
     * Indicates if the policy should be automatically applied to new resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled)
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    public fun remediationEnabled(remediationEnabled: Boolean)

    /**
     * Indicates if the policy should be automatically applied to new resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled)
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    public fun remediationEnabled(remediationEnabled: IResolvable)

    /**
     * The unique identifiers of the resource sets used by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcesetids)
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy. 
     */
    public fun resourceSetIds(resourceSetIds: List<String>)

    /**
     * The unique identifiers of the resource sets used by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcesetids)
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy. 
     */
    public fun resourceSetIds(vararg resourceSetIds: String)

    /**
     * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope
     * or explicitly exclude them.
     *
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them. 
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope
     * or explicitly exclude them.
     *
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them. 
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope
     * or explicitly exclude them.
     *
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them. 
     */
    public fun resourceTags(vararg resourceTags: Any)

    /**
     * The type of resource protected by or in scope of the policy.
     *
     * This is in the format shown in the [AWS Resource Types
     * Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * . To apply this policy to multiple resource types, specify a resource type of `ResourceTypeList`
     * and then specify the resource types in a `ResourceTypeList` .
     *
     * The following are valid resource types for each Firewall Manager policy type:
     *
     * * AWS WAF Classic - `AWS::ApiGateway::Stage` , `AWS::CloudFront::Distribution` , and
     * `AWS::ElasticLoadBalancingV2::LoadBalancer` .
     * * AWS WAF - `AWS::ApiGateway::Stage` , `AWS::ElasticLoadBalancingV2::LoadBalancer` , and
     * `AWS::CloudFront::Distribution` .
     * * DNS Firewall, AWS Network Firewall , and third-party firewall - `AWS::EC2::VPC` .
     * * AWS Shield Advanced - `AWS::ElasticLoadBalancingV2::LoadBalancer` ,
     * `AWS::ElasticLoadBalancing::LoadBalancer` , `AWS::EC2::EIP` , and
     * `AWS::CloudFront::Distribution` .
     * * Security group content audit - `AWS::EC2::SecurityGroup` , `AWS::EC2::NetworkInterface` ,
     * and `AWS::EC2::Instance` .
     * * Security group usage audit - `AWS::EC2::SecurityGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetype)
     * @param resourceType The type of resource protected by or in scope of the policy. 
     */
    public fun resourceType(resourceType: String)

    /**
     * An array of `ResourceType` objects.
     *
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist)
     * @param resourceTypeList An array of `ResourceType` objects. 
     */
    public fun resourceTypeList(resourceTypeList: List<String>)

    /**
     * An array of `ResourceType` objects.
     *
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist)
     * @param resourceTypeList An array of `ResourceType` objects. 
     */
    public fun resourceTypeList(vararg resourceTypeList: String)

    /**
     * Indicates whether AWS Firewall Manager should automatically remove protections from resources
     * that leave the policy scope and clean up resources that Firewall Manager is managing for
     * accounts when those accounts leave policy scope.
     *
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcescleanup)
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope. 
     */
    public fun resourcesCleanUp(resourcesCleanUp: Boolean)

    /**
     * Indicates whether AWS Firewall Manager should automatically remove protections from resources
     * that leave the policy scope and clean up resources that Firewall Manager is managing for
     * accounts when those accounts leave policy scope.
     *
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcescleanup)
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope. 
     */
    public fun resourcesCleanUp(resourcesCleanUp: IResolvable)

    /**
     * Details about the security service that is being used to protect the resources.
     *
     * This contains the following settings:
     *
     * * Type - Indicates the service type that the policy uses to protect the resource. For
     * security group policies, Firewall Manager supports one security group for each common policy and
     * for each content audit policy. This is an adjustable limit that you can increase by contacting
     * AWS Support .
     *
     * Valid values: `DNS_FIREWALL` | `NETWORK_FIREWALL` | `SECURITY_GROUPS_COMMON` |
     * `SECURITY_GROUPS_CONTENT_AUDIT` | `SECURITY_GROUPS_USAGE_AUDIT` | `SHIELD_ADVANCED` |
     * `THIRD_PARTY_FIREWALL` | `WAFV2` | `WAF`
     *
     * * ManagedServiceData - Details about the service that are specific to the service type, in
     * JSON format.
     * * Example: `DNS_FIREWALL`
     *
     * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
     *
     *
     * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
     * `postProcessRuleGroups` are between 9901 and 10000.
     *
     *
     * * Example: `NETWORK_FIREWALL` - Centralized deployment model
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
     * Zones to create the endpoints in. To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
     * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
     * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
     * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
     * \"10.0.0.0/28\"]}]}
     * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * With custom Availability Zone configuration, you define which specific Availability Zones to
     * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
     * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
     * `availabilityZoneId` parameter, not both parameters.
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{ \"type\":\"THIRD_PARTY_FIREWALL\", \"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",
     * \"thirdPartyFirewallConfig\":{ \"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `CENTRALIZED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
     * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
     * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
     * \"allowedIPV4CidrList\":[ ] } } } }"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
     *
     * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
     * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"`
     *
     * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
     *
     * The default value for `automaticResponseStatus` is `IGNORED` . The value for
     * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED` .
     * The default value for `overrideCustomerWebaclClassic` is `false` .
     *
     * For other resource types that you can protect with a Shield Advanced policy, this
     * `ManagedServiceData` configuration is an empty string.
     *
     * * Example: `WAFV2`
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
     * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI`
     * , `QUERY_STRING` , `HEADER` , or `METHOD` .
     *
     * * Example: `AWS WAF Classic`
     *
     * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
     * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
     *
     * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
     * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If
     * you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
     * Manager uses the default version of the AWS WAF managed rule group.
     *
     * * Example: `SECURITY_GROUPS_COMMON`
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to
     * those in VPCs that the account owns
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
     * sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
     *
     * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
     * in-scope security group rules must be within the allowed range of the policy's security group
     * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     *
     * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata)
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
     */
    public fun securityServicePolicyData(securityServicePolicyData: IResolvable)

    /**
     * Details about the security service that is being used to protect the resources.
     *
     * This contains the following settings:
     *
     * * Type - Indicates the service type that the policy uses to protect the resource. For
     * security group policies, Firewall Manager supports one security group for each common policy and
     * for each content audit policy. This is an adjustable limit that you can increase by contacting
     * AWS Support .
     *
     * Valid values: `DNS_FIREWALL` | `NETWORK_FIREWALL` | `SECURITY_GROUPS_COMMON` |
     * `SECURITY_GROUPS_CONTENT_AUDIT` | `SECURITY_GROUPS_USAGE_AUDIT` | `SHIELD_ADVANCED` |
     * `THIRD_PARTY_FIREWALL` | `WAFV2` | `WAF`
     *
     * * ManagedServiceData - Details about the service that are specific to the service type, in
     * JSON format.
     * * Example: `DNS_FIREWALL`
     *
     * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
     *
     *
     * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
     * `postProcessRuleGroups` are between 9901 and 10000.
     *
     *
     * * Example: `NETWORK_FIREWALL` - Centralized deployment model
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
     * Zones to create the endpoints in. To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
     * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
     * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
     * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
     * \"10.0.0.0/28\"]}]}
     * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * With custom Availability Zone configuration, you define which specific Availability Zones to
     * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
     * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
     * `availabilityZoneId` parameter, not both parameters.
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{ \"type\":\"THIRD_PARTY_FIREWALL\", \"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",
     * \"thirdPartyFirewallConfig\":{ \"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `CENTRALIZED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
     * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
     * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
     * \"allowedIPV4CidrList\":[ ] } } } }"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
     *
     * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
     * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"`
     *
     * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
     *
     * The default value for `automaticResponseStatus` is `IGNORED` . The value for
     * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED` .
     * The default value for `overrideCustomerWebaclClassic` is `false` .
     *
     * For other resource types that you can protect with a Shield Advanced policy, this
     * `ManagedServiceData` configuration is an empty string.
     *
     * * Example: `WAFV2`
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
     * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI`
     * , `QUERY_STRING` , `HEADER` , or `METHOD` .
     *
     * * Example: `AWS WAF Classic`
     *
     * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
     * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
     *
     * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
     * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If
     * you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
     * Manager uses the default version of the AWS WAF managed rule group.
     *
     * * Example: `SECURITY_GROUPS_COMMON`
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to
     * those in VPCs that the account owns
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
     * sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
     *
     * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
     * in-scope security group rules must be within the allowed range of the policy's security group
     * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     *
     * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata)
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
     */
    public
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty)

    /**
     * Details about the security service that is being used to protect the resources.
     *
     * This contains the following settings:
     *
     * * Type - Indicates the service type that the policy uses to protect the resource. For
     * security group policies, Firewall Manager supports one security group for each common policy and
     * for each content audit policy. This is an adjustable limit that you can increase by contacting
     * AWS Support .
     *
     * Valid values: `DNS_FIREWALL` | `NETWORK_FIREWALL` | `SECURITY_GROUPS_COMMON` |
     * `SECURITY_GROUPS_CONTENT_AUDIT` | `SECURITY_GROUPS_USAGE_AUDIT` | `SHIELD_ADVANCED` |
     * `THIRD_PARTY_FIREWALL` | `WAFV2` | `WAF`
     *
     * * ManagedServiceData - Details about the service that are specific to the service type, in
     * JSON format.
     * * Example: `DNS_FIREWALL`
     *
     * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
     *
     *
     * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
     * `postProcessRuleGroups` are between 9901 and 10000.
     *
     *
     * * Example: `NETWORK_FIREWALL` - Centralized deployment model
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
     * Zones to create the endpoints in. To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
     * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
     * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
     * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
     * \"10.0.0.0/28\"]}]}
     * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * With custom Availability Zone configuration, you define which specific Availability Zones to
     * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
     * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
     * `availabilityZoneId` parameter, not both parameters.
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{ \"type\":\"THIRD_PARTY_FIREWALL\", \"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",
     * \"thirdPartyFirewallConfig\":{ \"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `CENTRALIZED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
     * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
     * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
     * \"allowedIPV4CidrList\":[ ] } } } }"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
     *
     * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
     * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"`
     *
     * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
     *
     * The default value for `automaticResponseStatus` is `IGNORED` . The value for
     * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED` .
     * The default value for `overrideCustomerWebaclClassic` is `false` .
     *
     * For other resource types that you can protect with a Shield Advanced policy, this
     * `ManagedServiceData` configuration is an empty string.
     *
     * * Example: `WAFV2`
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
     * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI`
     * , `QUERY_STRING` , `HEADER` , or `METHOD` .
     *
     * * Example: `AWS WAF Classic`
     *
     * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
     * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
     *
     * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
     * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If
     * you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
     * Manager uses the default version of the AWS WAF managed rule group.
     *
     * * Example: `SECURITY_GROUPS_COMMON`
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to
     * those in VPCs that the account owns
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
     * sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
     *
     * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
     * in-scope security group rules must be within the allowed range of the policy's security group
     * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     *
     * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata)
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b0a8c4bc2180cc27511bfa544fbcc568c2089639558a518fac066f29b437aa5")
    public
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty.Builder.() -> Unit)

    /**
     * A collection of key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags)
     * @param tags A collection of key:value pairs associated with an AWS resource. 
     */
    public fun tags(tags: List<PolicyTagProperty>)

    /**
     * A collection of key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags)
     * @param tags A collection of key:value pairs associated with an AWS resource. 
     */
    public fun tags(vararg tags: PolicyTagProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnPolicy.Builder =
        software.amazon.awscdk.services.fms.CfnPolicy.Builder.create(scope, id)

    /**
     * Used when deleting a policy. If `true` , Firewall Manager performs cleanup according to the
     * policy type.
     *
     * For AWS WAF and Shield Advanced policies, Firewall Manager does the following:
     *
     * * Deletes rule groups created by Firewall Manager
     * * Removes web ACLs from in-scope resources
     * * Deletes web ACLs that contain no rules or rule groups
     *
     * For security group policies, Firewall Manager does the following for each security group in
     * the policy:
     *
     * * Disassociates the security group from in-scope resources
     * * Deletes the security group if it was created through Firewall Manager and if it's no longer
     * associated with any resources through another policy
     *
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy.
     * Protection of out-of-scope resources remains unchanged. Scope is determined by tags that you
     * create and accounts that you associate with the policy. When creating the policy, if you specify
     * that only resources in specific accounts or with specific tags are in scope of the policy, those
     * accounts and resources are handled by the policy. All others are out of scope. If you don't
     * specify tags or accounts, all resources are in scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources)
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type. 
     */
    override fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources)
    }

    /**
     * Used when deleting a policy. If `true` , Firewall Manager performs cleanup according to the
     * policy type.
     *
     * For AWS WAF and Shield Advanced policies, Firewall Manager does the following:
     *
     * * Deletes rule groups created by Firewall Manager
     * * Removes web ACLs from in-scope resources
     * * Deletes web ACLs that contain no rules or rule groups
     *
     * For security group policies, Firewall Manager does the following for each security group in
     * the policy:
     *
     * * Disassociates the security group from in-scope resources
     * * Deletes the security group if it was created through Firewall Manager and if it's no longer
     * associated with any resources through another policy
     *
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy.
     * Protection of out-of-scope resources remains unchanged. Scope is determined by tags that you
     * create and accounts that you associate with the policy. When creating the policy, if you specify
     * that only resources in specific accounts or with specific tags are in scope of the policy, those
     * accounts and resources are handled by the policy. All others are out of scope. If you don't
     * specify tags or accounts, all resources are in scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-deleteallpolicyresources)
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type. 
     */
    override fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources.let(IResolvable::unwrap))
    }

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude
     * from the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excludemap)
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. 
     */
    override fun excludeMap(excludeMap: IResolvable) {
      cdkBuilder.excludeMap(excludeMap.let(IResolvable::unwrap))
    }

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude
     * from the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excludemap)
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. 
     */
    override fun excludeMap(excludeMap: IEMapProperty) {
      cdkBuilder.excludeMap(excludeMap.let(IEMapProperty::unwrap))
    }

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude
     * from the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excludemap)
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9201ba49b229379b9cdb087e646f6e6b0a3ee882c187741304b10358610837e3")
    override fun excludeMap(excludeMap: IEMapProperty.Builder.() -> Unit): Unit =
        excludeMap(IEMapProperty(excludeMap))

    /**
     * Used only when tags are specified in the `ResourceTags` property.
     *
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags)
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     */
    override fun excludeResourceTags(excludeResourceTags: Boolean) {
      cdkBuilder.excludeResourceTags(excludeResourceTags)
    }

    /**
     * Used only when tags are specified in the `ResourceTags` property.
     *
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags)
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     */
    override fun excludeResourceTags(excludeResourceTags: IResolvable) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.let(IResolvable::unwrap))
    }

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
     * the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-includemap)
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. 
     */
    override fun includeMap(includeMap: IResolvable) {
      cdkBuilder.includeMap(includeMap.let(IResolvable::unwrap))
    }

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
     * the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-includemap)
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. 
     */
    override fun includeMap(includeMap: IEMapProperty) {
      cdkBuilder.includeMap(includeMap.let(IEMapProperty::unwrap))
    }

    /**
     * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
     * the policy.
     *
     * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its
     * child OUs, including any child OUs and accounts that are added at a later time.
     *
     * You can specify inclusions or exclusions, but not both. If you specify an `IncludeMap` , AWS
     * Firewall Manager applies the policy to all accounts specified by the `IncludeMap` , and does not
     * evaluate any `ExcludeMap` specifications. If you do not specify an `IncludeMap` , then Firewall
     * Manager applies the policy to all accounts except for those specified by the `ExcludeMap` .
     *
     * You can specify account IDs, OUs, or a combination:
     *
     * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
     * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
     * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
     * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
     * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
     * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
     * “ouid112”]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-includemap)
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be0f3fca68c982884aadf66d90ba2c15d32110488071e4668446e1d23d98c8a")
    override fun includeMap(includeMap: IEMapProperty.Builder.() -> Unit): Unit =
        includeMap(IEMapProperty(includeMap))

    /**
     * The definition of the AWS Network Firewall firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policydescription)
     * @param policyDescription The definition of the AWS Network Firewall firewall policy. 
     */
    override fun policyDescription(policyDescription: String) {
      cdkBuilder.policyDescription(policyDescription)
    }

    /**
     * The name of the AWS Firewall Manager policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname)
     * @param policyName The name of the AWS Firewall Manager policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * Indicates if the policy should be automatically applied to new resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled)
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    override fun remediationEnabled(remediationEnabled: Boolean) {
      cdkBuilder.remediationEnabled(remediationEnabled)
    }

    /**
     * Indicates if the policy should be automatically applied to new resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled)
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    override fun remediationEnabled(remediationEnabled: IResolvable) {
      cdkBuilder.remediationEnabled(remediationEnabled.let(IResolvable::unwrap))
    }

    /**
     * The unique identifiers of the resource sets used by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcesetids)
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy. 
     */
    override fun resourceSetIds(resourceSetIds: List<String>) {
      cdkBuilder.resourceSetIds(resourceSetIds)
    }

    /**
     * The unique identifiers of the resource sets used by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcesetids)
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy. 
     */
    override fun resourceSetIds(vararg resourceSetIds: String): Unit =
        resourceSetIds(resourceSetIds.toList())

    /**
     * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope
     * or explicitly exclude them.
     *
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them. 
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope
     * or explicitly exclude them.
     *
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them. 
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope
     * or explicitly exclude them.
     *
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them. 
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    /**
     * The type of resource protected by or in scope of the policy.
     *
     * This is in the format shown in the [AWS Resource Types
     * Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * . To apply this policy to multiple resource types, specify a resource type of `ResourceTypeList`
     * and then specify the resource types in a `ResourceTypeList` .
     *
     * The following are valid resource types for each Firewall Manager policy type:
     *
     * * AWS WAF Classic - `AWS::ApiGateway::Stage` , `AWS::CloudFront::Distribution` , and
     * `AWS::ElasticLoadBalancingV2::LoadBalancer` .
     * * AWS WAF - `AWS::ApiGateway::Stage` , `AWS::ElasticLoadBalancingV2::LoadBalancer` , and
     * `AWS::CloudFront::Distribution` .
     * * DNS Firewall, AWS Network Firewall , and third-party firewall - `AWS::EC2::VPC` .
     * * AWS Shield Advanced - `AWS::ElasticLoadBalancingV2::LoadBalancer` ,
     * `AWS::ElasticLoadBalancing::LoadBalancer` , `AWS::EC2::EIP` , and
     * `AWS::CloudFront::Distribution` .
     * * Security group content audit - `AWS::EC2::SecurityGroup` , `AWS::EC2::NetworkInterface` ,
     * and `AWS::EC2::Instance` .
     * * Security group usage audit - `AWS::EC2::SecurityGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetype)
     * @param resourceType The type of resource protected by or in scope of the policy. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * An array of `ResourceType` objects.
     *
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist)
     * @param resourceTypeList An array of `ResourceType` objects. 
     */
    override fun resourceTypeList(resourceTypeList: List<String>) {
      cdkBuilder.resourceTypeList(resourceTypeList)
    }

    /**
     * An array of `ResourceType` objects.
     *
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist)
     * @param resourceTypeList An array of `ResourceType` objects. 
     */
    override fun resourceTypeList(vararg resourceTypeList: String): Unit =
        resourceTypeList(resourceTypeList.toList())

    /**
     * Indicates whether AWS Firewall Manager should automatically remove protections from resources
     * that leave the policy scope and clean up resources that Firewall Manager is managing for
     * accounts when those accounts leave policy scope.
     *
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcescleanup)
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope. 
     */
    override fun resourcesCleanUp(resourcesCleanUp: Boolean) {
      cdkBuilder.resourcesCleanUp(resourcesCleanUp)
    }

    /**
     * Indicates whether AWS Firewall Manager should automatically remove protections from resources
     * that leave the policy scope and clean up resources that Firewall Manager is managing for
     * accounts when those accounts leave policy scope.
     *
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcescleanup)
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope. 
     */
    override fun resourcesCleanUp(resourcesCleanUp: IResolvable) {
      cdkBuilder.resourcesCleanUp(resourcesCleanUp.let(IResolvable::unwrap))
    }

    /**
     * Details about the security service that is being used to protect the resources.
     *
     * This contains the following settings:
     *
     * * Type - Indicates the service type that the policy uses to protect the resource. For
     * security group policies, Firewall Manager supports one security group for each common policy and
     * for each content audit policy. This is an adjustable limit that you can increase by contacting
     * AWS Support .
     *
     * Valid values: `DNS_FIREWALL` | `NETWORK_FIREWALL` | `SECURITY_GROUPS_COMMON` |
     * `SECURITY_GROUPS_CONTENT_AUDIT` | `SECURITY_GROUPS_USAGE_AUDIT` | `SHIELD_ADVANCED` |
     * `THIRD_PARTY_FIREWALL` | `WAFV2` | `WAF`
     *
     * * ManagedServiceData - Details about the service that are specific to the service type, in
     * JSON format.
     * * Example: `DNS_FIREWALL`
     *
     * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
     *
     *
     * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
     * `postProcessRuleGroups` are between 9901 and 10000.
     *
     *
     * * Example: `NETWORK_FIREWALL` - Centralized deployment model
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
     * Zones to create the endpoints in. To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
     * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
     * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
     * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
     * \"10.0.0.0/28\"]}]}
     * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * With custom Availability Zone configuration, you define which specific Availability Zones to
     * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
     * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
     * `availabilityZoneId` parameter, not both parameters.
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{ \"type\":\"THIRD_PARTY_FIREWALL\", \"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",
     * \"thirdPartyFirewallConfig\":{ \"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `CENTRALIZED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
     * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
     * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
     * \"allowedIPV4CidrList\":[ ] } } } }"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
     *
     * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
     * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"`
     *
     * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
     *
     * The default value for `automaticResponseStatus` is `IGNORED` . The value for
     * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED` .
     * The default value for `overrideCustomerWebaclClassic` is `false` .
     *
     * For other resource types that you can protect with a Shield Advanced policy, this
     * `ManagedServiceData` configuration is an empty string.
     *
     * * Example: `WAFV2`
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
     * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI`
     * , `QUERY_STRING` , `HEADER` , or `METHOD` .
     *
     * * Example: `AWS WAF Classic`
     *
     * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
     * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
     *
     * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
     * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If
     * you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
     * Manager uses the default version of the AWS WAF managed rule group.
     *
     * * Example: `SECURITY_GROUPS_COMMON`
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to
     * those in VPCs that the account owns
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
     * sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
     *
     * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
     * in-scope security group rules must be within the allowed range of the policy's security group
     * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     *
     * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata)
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
     */
    override fun securityServicePolicyData(securityServicePolicyData: IResolvable) {
      cdkBuilder.securityServicePolicyData(securityServicePolicyData.let(IResolvable::unwrap))
    }

    /**
     * Details about the security service that is being used to protect the resources.
     *
     * This contains the following settings:
     *
     * * Type - Indicates the service type that the policy uses to protect the resource. For
     * security group policies, Firewall Manager supports one security group for each common policy and
     * for each content audit policy. This is an adjustable limit that you can increase by contacting
     * AWS Support .
     *
     * Valid values: `DNS_FIREWALL` | `NETWORK_FIREWALL` | `SECURITY_GROUPS_COMMON` |
     * `SECURITY_GROUPS_CONTENT_AUDIT` | `SECURITY_GROUPS_USAGE_AUDIT` | `SHIELD_ADVANCED` |
     * `THIRD_PARTY_FIREWALL` | `WAFV2` | `WAF`
     *
     * * ManagedServiceData - Details about the service that are specific to the service type, in
     * JSON format.
     * * Example: `DNS_FIREWALL`
     *
     * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
     *
     *
     * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
     * `postProcessRuleGroups` are between 9901 and 10000.
     *
     *
     * * Example: `NETWORK_FIREWALL` - Centralized deployment model
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
     * Zones to create the endpoints in. To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
     * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
     * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
     * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
     * \"10.0.0.0/28\"]}]}
     * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * With custom Availability Zone configuration, you define which specific Availability Zones to
     * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
     * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
     * `availabilityZoneId` parameter, not both parameters.
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{ \"type\":\"THIRD_PARTY_FIREWALL\", \"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",
     * \"thirdPartyFirewallConfig\":{ \"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `CENTRALIZED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
     * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
     * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
     * \"allowedIPV4CidrList\":[ ] } } } }"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
     *
     * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
     * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"`
     *
     * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
     *
     * The default value for `automaticResponseStatus` is `IGNORED` . The value for
     * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED` .
     * The default value for `overrideCustomerWebaclClassic` is `false` .
     *
     * For other resource types that you can protect with a Shield Advanced policy, this
     * `ManagedServiceData` configuration is an empty string.
     *
     * * Example: `WAFV2`
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
     * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI`
     * , `QUERY_STRING` , `HEADER` , or `METHOD` .
     *
     * * Example: `AWS WAF Classic`
     *
     * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
     * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
     *
     * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
     * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If
     * you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
     * Manager uses the default version of the AWS WAF managed rule group.
     *
     * * Example: `SECURITY_GROUPS_COMMON`
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to
     * those in VPCs that the account owns
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
     * sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
     *
     * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
     * in-scope security group rules must be within the allowed range of the policy's security group
     * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     *
     * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata)
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
     */
    override
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty) {
      cdkBuilder.securityServicePolicyData(securityServicePolicyData.let(SecurityServicePolicyDataProperty::unwrap))
    }

    /**
     * Details about the security service that is being used to protect the resources.
     *
     * This contains the following settings:
     *
     * * Type - Indicates the service type that the policy uses to protect the resource. For
     * security group policies, Firewall Manager supports one security group for each common policy and
     * for each content audit policy. This is an adjustable limit that you can increase by contacting
     * AWS Support .
     *
     * Valid values: `DNS_FIREWALL` | `NETWORK_FIREWALL` | `SECURITY_GROUPS_COMMON` |
     * `SECURITY_GROUPS_CONTENT_AUDIT` | `SECURITY_GROUPS_USAGE_AUDIT` | `SHIELD_ADVANCED` |
     * `THIRD_PARTY_FIREWALL` | `WAFV2` | `WAF`
     *
     * * ManagedServiceData - Details about the service that are specific to the service type, in
     * JSON format.
     * * Example: `DNS_FIREWALL`
     *
     * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
     *
     *
     * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
     * `postProcessRuleGroups` are between 9901 and 10000.
     *
     *
     * * Example: `NETWORK_FIREWALL` - Centralized deployment model
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
     * Zones to create the endpoints in. To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
     * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
     * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
     * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
     * \"10.0.0.0/28\"]}]}
     * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * With custom Availability Zone configuration, you define which specific Availability Zones to
     * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
     * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
     * `availabilityZoneId` parameter, not both parameters.
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{ \"type\":\"THIRD_PARTY_FIREWALL\", \"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",
     * \"thirdPartyFirewallConfig\":{ \"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `CENTRALIZED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the third-party firewall name.
     *
     * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
     * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
     * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
     * \"allowedIPV4CidrList\":[ ] } } } }"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
     *
     * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
     * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"`
     *
     * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
     *
     * The default value for `automaticResponseStatus` is `IGNORED` . The value for
     * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED` .
     * The default value for `overrideCustomerWebaclClassic` is `false` .
     *
     * For other resource types that you can protect with a Shield Advanced policy, this
     * `ManagedServiceData` configuration is an empty string.
     *
     * * Example: `WAFV2`
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
     * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI`
     * , `QUERY_STRING` , `HEADER` , or `METHOD` .
     *
     * * Example: `AWS WAF Classic`
     *
     * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
     * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
     *
     * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
     * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If
     * you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
     * Manager uses the default version of the AWS WAF managed rule group.
     *
     * * Example: `SECURITY_GROUPS_COMMON`
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to
     * those in VPCs that the account owns
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
     * sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
     *
     * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
     * in-scope security group rules must be within the allowed range of the policy's security group
     * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     *
     * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-securityservicepolicydata)
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b0a8c4bc2180cc27511bfa544fbcc568c2089639558a518fac066f29b437aa5")
    override
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty.Builder.() -> Unit):
        Unit =
        securityServicePolicyData(SecurityServicePolicyDataProperty(securityServicePolicyData))

    /**
     * A collection of key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags)
     * @param tags A collection of key:value pairs associated with an AWS resource. 
     */
    override fun tags(tags: List<PolicyTagProperty>) {
      cdkBuilder.tags(tags.map(PolicyTagProperty::unwrap))
    }

    /**
     * A collection of key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags)
     * @param tags A collection of key:value pairs associated with an AWS resource. 
     */
    override fun tags(vararg tags: PolicyTagProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fms.CfnPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fms.CfnPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy): CfnPolicy =
        CfnPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPolicy): software.amazon.awscdk.services.fms.CfnPolicy =
        wrapped.cdkObject
  }

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in or
   * exclude from the policy.
   *
   * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child
   * OUs, including any child OUs and accounts that are added at a later time.
   *
   * This is used for the policy's `IncludeMap` and `ExcludeMap` .
   *
   * You can specify account IDs, OUs, or a combination:
   *
   * * Specify account IDs by setting the key to `ACCOUNT` . For example, the following is a valid
   * map: `{“ACCOUNT” : [“accountID1”, “accountID2”]}` .
   * * Specify OUs by setting the key to `ORGUNIT` . For example, the following is a valid map:
   * `{“ORGUNIT” : [“ouid111”, “ouid112”]}` .
   * * Specify accounts and OUs together in a single map, separated with a comma. For example, the
   * following is a valid map: `{“ACCOUNT” : [“accountID1”, “accountID2”], “ORGUNIT” : [“ouid111”,
   * “ouid112”]}` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fms.*;
   * IEMapProperty iEMapProperty = Map.of(
   * "account", List.of("account"),
   * "orgunit", List.of("orgunit"));
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html)
   */
  public interface IEMapProperty {
    /**
     * The account list for the map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-account)
     */
    public fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

    /**
     * The organizational unit list for the map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-orgunit)
     */
    public fun orgunit(): List<String> = unwrap(this).getOrgunit() ?: emptyList()

    /**
     * A builder for [IEMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param account The account list for the map.
       */
      public fun account(account: List<String>)

      /**
       * @param account The account list for the map.
       */
      public fun account(vararg account: String)

      /**
       * @param orgunit The organizational unit list for the map.
       */
      public fun orgunit(orgunit: List<String>)

      /**
       * @param orgunit The organizational unit list for the map.
       */
      public fun orgunit(vararg orgunit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty.builder()

      /**
       * @param account The account list for the map.
       */
      override fun account(account: List<String>) {
        cdkBuilder.account(account)
      }

      /**
       * @param account The account list for the map.
       */
      override fun account(vararg account: String): Unit = account(account.toList())

      /**
       * @param orgunit The organizational unit list for the map.
       */
      override fun orgunit(orgunit: List<String>) {
        cdkBuilder.orgunit(orgunit)
      }

      /**
       * @param orgunit The organizational unit list for the map.
       */
      override fun orgunit(vararg orgunit: String): Unit = orgunit(orgunit.toList())

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty,
    ) : CdkObject(cdkObject), IEMapProperty {
      /**
       * The account list for the map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-account)
       */
      override fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

      /**
       * The organizational unit list for the map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html#cfn-fms-policy-iemap-orgunit)
       */
      override fun orgunit(): List<String> = unwrap(this).getOrgunit() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IEMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty):
          IEMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IEMapProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty
    }
  }

  /**
   * The resource tags that AWS Firewall Manager uses to determine if a particular resource should
   * be included or excluded from the AWS Firewall Manager policy.
   *
   * Tags enable you to categorize your AWS resources in different ways, for example, by purpose,
   * owner, or environment. Each tag consists of a key and an optional value. Firewall Manager combines
   * the tags with "AND" so that, if you add more than one tag to a policy scope, a resource must have
   * all the specified tags to be included or excluded. For more information, see [Working with Tag
   * Editor](https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fms.*;
   * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
   * .key("key")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-resourcetag.html)
   */
  public interface ResourceTagProperty {
    /**
     * The resource tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-resourcetag.html#cfn-fms-policy-resourcetag-key)
     */
    public fun key(): String

    /**
     * The resource tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-resourcetag.html#cfn-fms-policy-resourcetag-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ResourceTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The resource tag key. 
       */
      public fun key(key: String)

      /**
       * @param value The resource tag value.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty.builder()

      /**
       * @param key The resource tag key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The resource tag value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty,
    ) : CdkObject(cdkObject), ResourceTagProperty {
      /**
       * The resource tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-resourcetag.html#cfn-fms-policy-resourcetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The resource tag value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-resourcetag.html#cfn-fms-policy-resourcetag-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty):
          ResourceTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty
    }
  }

  /**
   * A collection of key:value pairs associated with an AWS resource.
   *
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fms.*;
   * PolicyTagProperty policyTagProperty = PolicyTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policytag.html)
   */
  public interface PolicyTagProperty {
    /**
     * Part of the key:value pair that defines a tag.
     *
     * You can use a tag key to describe a category of information, such as "customer." Tag keys are
     * case-sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policytag.html#cfn-fms-policy-policytag-key)
     */
    public fun key(): String

    /**
     * Part of the key:value pair that defines a tag.
     *
     * You can use a tag value to describe a specific value within a category, such as "companyA" or
     * "companyB." Tag values are case-sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policytag.html#cfn-fms-policy-policytag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [PolicyTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key Part of the key:value pair that defines a tag. 
       * You can use a tag key to describe a category of information, such as "customer." Tag keys
       * are case-sensitive.
       */
      public fun key(key: String)

      /**
       * @param value Part of the key:value pair that defines a tag. 
       * You can use a tag value to describe a specific value within a category, such as "companyA"
       * or "companyB." Tag values are case-sensitive.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty.builder()

      /**
       * @param key Part of the key:value pair that defines a tag. 
       * You can use a tag key to describe a category of information, such as "customer." Tag keys
       * are case-sensitive.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value Part of the key:value pair that defines a tag. 
       * You can use a tag value to describe a specific value within a category, such as "companyA"
       * or "companyB." Tag values are case-sensitive.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty,
    ) : CdkObject(cdkObject), PolicyTagProperty {
      /**
       * Part of the key:value pair that defines a tag.
       *
       * You can use a tag key to describe a category of information, such as "customer." Tag keys
       * are case-sensitive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policytag.html#cfn-fms-policy-policytag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * Part of the key:value pair that defines a tag.
       *
       * You can use a tag value to describe a specific value within a category, such as "companyA"
       * or "companyB." Tag values are case-sensitive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policytag.html#cfn-fms-policy-policytag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty):
          PolicyTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyTagProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty
    }
  }

  /**
   * Configures the deployment model for the third-party firewall.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fms.*;
   * ThirdPartyFirewallPolicyProperty thirdPartyFirewallPolicyProperty =
   * ThirdPartyFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
   */
  public interface ThirdPartyFirewallPolicyProperty {
    /**
     * Defines the deployment model to use for the third-party firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html#cfn-fms-policy-thirdpartyfirewallpolicy-firewalldeploymentmodel)
     */
    public fun firewallDeploymentModel(): String

    /**
     * A builder for [ThirdPartyFirewallPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param firewallDeploymentModel Defines the deployment model to use for the third-party
       * firewall policy. 
       */
      public fun firewallDeploymentModel(firewallDeploymentModel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty.builder()

      /**
       * @param firewallDeploymentModel Defines the deployment model to use for the third-party
       * firewall policy. 
       */
      override fun firewallDeploymentModel(firewallDeploymentModel: String) {
        cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
      }

      public fun build():
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty,
    ) : CdkObject(cdkObject), ThirdPartyFirewallPolicyProperty {
      /**
       * Defines the deployment model to use for the third-party firewall policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html#cfn-fms-policy-thirdpartyfirewallpolicy-firewalldeploymentmodel)
       */
      override fun firewallDeploymentModel(): String = unwrap(this).getFirewallDeploymentModel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThirdPartyFirewallPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty):
          ThirdPartyFirewallPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThirdPartyFirewallPolicyProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty
    }
  }

  /**
   * Contains the AWS Network Firewall firewall policy options to configure the policy's deployment
   * model and third-party firewall policy settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fms.*;
   * PolicyOptionProperty policyOptionProperty = PolicyOptionProperty.builder()
   * .networkFirewallPolicy(NetworkFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build())
   * .thirdPartyFirewallPolicy(ThirdPartyFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policyoption.html)
   */
  public interface PolicyOptionProperty {
    /**
     * Defines the deployment model to use for the firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policyoption.html#cfn-fms-policy-policyoption-networkfirewallpolicy)
     */
    public fun networkFirewallPolicy(): Any? = unwrap(this).getNetworkFirewallPolicy()

    /**
     * Defines the policy options for a third-party firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policyoption.html#cfn-fms-policy-policyoption-thirdpartyfirewallpolicy)
     */
    public fun thirdPartyFirewallPolicy(): Any? = unwrap(this).getThirdPartyFirewallPolicy()

    /**
     * A builder for [PolicyOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
       */
      public fun networkFirewallPolicy(networkFirewallPolicy: IResolvable)

      /**
       * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
       */
      public fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty)

      /**
       * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bcfef3a9236edfe1e7fca0e402ed9c668da4af60317973bf9145ed2b8744616b")
      public
          fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty.Builder.() -> Unit)

      /**
       * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall
       * policy.
       */
      public fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: IResolvable)

      /**
       * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall
       * policy.
       */
      public
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty)

      /**
       * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ebfdb764ce864461cebec237cda266d743def4733edcc56b56b4ee2b8cd9fb")
      public
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty.builder()

      /**
       * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
       */
      override fun networkFirewallPolicy(networkFirewallPolicy: IResolvable) {
        cdkBuilder.networkFirewallPolicy(networkFirewallPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
       */
      override fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty) {
        cdkBuilder.networkFirewallPolicy(networkFirewallPolicy.let(NetworkFirewallPolicyProperty::unwrap))
      }

      /**
       * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bcfef3a9236edfe1e7fca0e402ed9c668da4af60317973bf9145ed2b8744616b")
      override
          fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty.Builder.() -> Unit):
          Unit = networkFirewallPolicy(NetworkFirewallPolicyProperty(networkFirewallPolicy))

      /**
       * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall
       * policy.
       */
      override fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: IResolvable) {
        cdkBuilder.thirdPartyFirewallPolicy(thirdPartyFirewallPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall
       * policy.
       */
      override
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty) {
        cdkBuilder.thirdPartyFirewallPolicy(thirdPartyFirewallPolicy.let(ThirdPartyFirewallPolicyProperty::unwrap))
      }

      /**
       * @param thirdPartyFirewallPolicy Defines the policy options for a third-party firewall
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ebfdb764ce864461cebec237cda266d743def4733edcc56b56b4ee2b8cd9fb")
      override
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty.Builder.() -> Unit):
          Unit =
          thirdPartyFirewallPolicy(ThirdPartyFirewallPolicyProperty(thirdPartyFirewallPolicy))

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty,
    ) : CdkObject(cdkObject), PolicyOptionProperty {
      /**
       * Defines the deployment model to use for the firewall policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policyoption.html#cfn-fms-policy-policyoption-networkfirewallpolicy)
       */
      override fun networkFirewallPolicy(): Any? = unwrap(this).getNetworkFirewallPolicy()

      /**
       * Defines the policy options for a third-party firewall policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policyoption.html#cfn-fms-policy-policyoption-thirdpartyfirewallpolicy)
       */
      override fun thirdPartyFirewallPolicy(): Any? = unwrap(this).getThirdPartyFirewallPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty):
          PolicyOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyOptionProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty
    }
  }

  /**
   * Details about the security service that is being used to protect the resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fms.*;
   * SecurityServicePolicyDataProperty securityServicePolicyDataProperty =
   * SecurityServicePolicyDataProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .managedServiceData("managedServiceData")
   * .policyOption(PolicyOptionProperty.builder()
   * .networkFirewallPolicy(NetworkFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build())
   * .thirdPartyFirewallPolicy(ThirdPartyFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-securityservicepolicydata.html)
   */
  public interface SecurityServicePolicyDataProperty {
    /**
     * Details about the service that are specific to the service type, in JSON format.
     *
     * * Example: `DNS_FIREWALL`
     *
     * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
     *
     *
     * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
     * `postProcessRuleGroups` are between 9901 and 10000.
     *
     *
     * * Example: `NETWORK_FIREWALL` - Centralized deployment model
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
     * Zones to create the endpoints in. To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
     * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
     * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
     * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
     * \"10.0.0.0/28\"]}]}
     * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * With custom Availability Zone configuration, you define which specific Availability Zones to
     * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
     * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
     * `availabilityZoneId` parameter, not both parameters.
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
     * configuration and route management
     *
     * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
     *
     * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
     * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false,
     * \"optimizeUnassociatedWebACL\":true|false}"`
     *
     * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
     * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
     *
     * The default value for `automaticResponseStatus` is `IGNORED` . The value for
     * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED` .
     * The default value for `overrideCustomerWebaclClassic` is `false` .
     *
     * For other resource types that you can protect with a Shield Advanced policy, this
     * `ManagedServiceData` configuration is an empty string.
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
     *
     * `"{ \"type\":\"THIRD_PARTY_FIREWALL\", \"thirdPartyFirewall\":\"\THIRD_PARTY_FIREWALL_NAME\",
     * \"thirdPartyFirewallConfig\":{ \"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `CENTRALIZED` .
     *
     * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
     *
     * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
     *
     * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
     * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
     * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
     * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
     * \"allowedIPV4CidrList\":[ ] } } } }"`
     *
     * To use the distributed deployment model, you must set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * * Example: `WAFV2`
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]},\"optimizeUnassociatedWebACL\":true}"`
     *
     * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
     * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI`
     * , `QUERY_STRING` , `HEADER` , or `METHOD` .
     *
     * * Example: `AWS WAF Classic`
     *
     * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
     * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
     *
     * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
     *
     * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
     *
     * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
     * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If
     * you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
     * Manager uses the default version of the AWS WAF managed rule group.
     *
     * * Example: `SECURITY_GROUPS_COMMON`
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to
     * those in VPCs that the account owns
     *
     * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
     * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
     * sg-000e55995d61a06bd\"}]}"`
     *
     * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
     *
     * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
     * in-scope security group rules must be within the allowed range of the policy's security group
     * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     *
     * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
     *
     * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-securityservicepolicydata.html#cfn-fms-policy-securityservicepolicydata-managedservicedata)
     */
    public fun managedServiceData(): String? = unwrap(this).getManagedServiceData()

    /**
     * Contains the Network Firewall firewall policy options to configure a centralized deployment
     * model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-securityservicepolicydata.html#cfn-fms-policy-securityservicepolicydata-policyoption)
     */
    public fun policyOption(): Any? = unwrap(this).getPolicyOption()

    /**
     * The service that the policy is using to protect the resources.
     *
     * This specifies the type of policy that is created, either an AWS WAF policy, a Shield
     * Advanced policy, or a security group policy. For security group policies, Firewall Manager
     * supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting AWS Support .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-securityservicepolicydata.html#cfn-fms-policy-securityservicepolicydata-type)
     */
    public fun type(): String

    /**
     * A builder for [SecurityServicePolicyDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param managedServiceData Details about the service that are specific to the service type,
       * in JSON format.
       * * Example: `DNS_FIREWALL`
       *
       * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
       *
       *
       * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
       * `postProcessRuleGroups` are between 9901 and 10000.
       *
       *
       * * Example: `NETWORK_FIREWALL` - Centralized deployment model
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability
       * Zone configuration
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
       *
       * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
       * Zones to create the endpoints in. To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability
       * Zone configuration and route management
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
       * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
       * configuration
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
       * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
       * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
       * \"10.0.0.0/28\"]}]}
       * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
       *
       * With custom Availability Zone configuration, you define which specific Availability Zones
       * to create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
       * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
       * `availabilityZoneId` parameter, not both parameters.
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
       * configuration and route management
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
       *
       * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
       * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
       * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false,
       * \"optimizeUnassociatedWebACL\":true|false}"`
       *
       * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
       * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
       *
       * The default value for `automaticResponseStatus` is `IGNORED` . The value for
       * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED`
       * . The default value for `overrideCustomerWebaclClassic` is `false` .
       *
       * For other resource types that you can protect with a Shield Advanced policy, this
       * `ManagedServiceData` configuration is an empty string.
       *
       * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
       *
       * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
       *
       * `"{ \"type\":\"THIRD_PARTY_FIREWALL\",
       * \"thirdPartyFirewall\":\"\THIRD_PARTY_FIREWALL_NAME\", \"thirdPartyFirewallConfig\":{
       * \"thirdPartyFirewallPolicyList\":[\"global-1\"]
       * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `CENTRALIZED` .
       *
       * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
       *
       * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
       *
       * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
       * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
       * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
       * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
       * \"allowedIPV4CidrList\":[ ] } } } }"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `WAFV2`
       *
       * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]},\"optimizeUnassociatedWebACL\":true}"`
       *
       * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
       * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of
       * `URI` , `QUERY_STRING` , `HEADER` , or `METHOD` .
       *
       * * Example: `AWS WAF Classic`
       *
       * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
       * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
       *
       * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
       *
       * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
       *
       * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
       * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use.
       * If you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
       * Manager uses the default version of the AWS WAF managed rule group.
       *
       * * Example: `SECURITY_GROUPS_COMMON`
       *
       * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
       * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
       *
       * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as
       * to those in VPCs that the account owns
       *
       * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
       * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
       * sg-000e55995d61a06bd\"}]}"`
       *
       * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
       *
       * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
       *
       * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
       * in-scope security group rules must be within the allowed range of the policy's security group
       * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
       * matches a rule value or range in the policy security group.
       *
       * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
       *
       * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
       */
      public fun managedServiceData(managedServiceData: String)

      /**
       * @param policyOption Contains the Network Firewall firewall policy options to configure a
       * centralized deployment model.
       */
      public fun policyOption(policyOption: IResolvable)

      /**
       * @param policyOption Contains the Network Firewall firewall policy options to configure a
       * centralized deployment model.
       */
      public fun policyOption(policyOption: PolicyOptionProperty)

      /**
       * @param policyOption Contains the Network Firewall firewall policy options to configure a
       * centralized deployment model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f802adb0072e9aff9070aaec6a8b5cccadf0cb1794bb55ea6dcb6d68e66c7c85")
      public fun policyOption(policyOption: PolicyOptionProperty.Builder.() -> Unit)

      /**
       * @param type The service that the policy is using to protect the resources. 
       * This specifies the type of policy that is created, either an AWS WAF policy, a Shield
       * Advanced policy, or a security group policy. For security group policies, Firewall Manager
       * supports one security group for each common policy and for each content audit policy. This is
       * an adjustable limit that you can increase by contacting AWS Support .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty.builder()

      /**
       * @param managedServiceData Details about the service that are specific to the service type,
       * in JSON format.
       * * Example: `DNS_FIREWALL`
       *
       * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
       *
       *
       * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
       * `postProcessRuleGroups` are between 9901 and 10000.
       *
       *
       * * Example: `NETWORK_FIREWALL` - Centralized deployment model
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability
       * Zone configuration
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
       *
       * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
       * Zones to create the endpoints in. To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability
       * Zone configuration and route management
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
       * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
       * configuration
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
       * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
       * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
       * \"10.0.0.0/28\"]}]}
       * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
       *
       * With custom Availability Zone configuration, you define which specific Availability Zones
       * to create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
       * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
       * `availabilityZoneId` parameter, not both parameters.
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
       * configuration and route management
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
       *
       * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
       * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
       * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false,
       * \"optimizeUnassociatedWebACL\":true|false}"`
       *
       * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
       * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
       *
       * The default value for `automaticResponseStatus` is `IGNORED` . The value for
       * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED`
       * . The default value for `overrideCustomerWebaclClassic` is `false` .
       *
       * For other resource types that you can protect with a Shield Advanced policy, this
       * `ManagedServiceData` configuration is an empty string.
       *
       * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
       *
       * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
       *
       * `"{ \"type\":\"THIRD_PARTY_FIREWALL\",
       * \"thirdPartyFirewall\":\"\THIRD_PARTY_FIREWALL_NAME\", \"thirdPartyFirewallConfig\":{
       * \"thirdPartyFirewallPolicyList\":[\"global-1\"]
       * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `CENTRALIZED` .
       *
       * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
       *
       * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
       *
       * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
       * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
       * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
       * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
       * \"allowedIPV4CidrList\":[ ] } } } }"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `WAFV2`
       *
       * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]},\"optimizeUnassociatedWebACL\":true}"`
       *
       * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
       * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of
       * `URI` , `QUERY_STRING` , `HEADER` , or `METHOD` .
       *
       * * Example: `AWS WAF Classic`
       *
       * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
       * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
       *
       * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
       *
       * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
       *
       * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
       * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use.
       * If you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
       * Manager uses the default version of the AWS WAF managed rule group.
       *
       * * Example: `SECURITY_GROUPS_COMMON`
       *
       * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
       * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
       *
       * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as
       * to those in VPCs that the account owns
       *
       * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
       * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
       * sg-000e55995d61a06bd\"}]}"`
       *
       * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
       *
       * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
       *
       * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
       * in-scope security group rules must be within the allowed range of the policy's security group
       * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
       * matches a rule value or range in the policy security group.
       *
       * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
       *
       * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
       */
      override fun managedServiceData(managedServiceData: String) {
        cdkBuilder.managedServiceData(managedServiceData)
      }

      /**
       * @param policyOption Contains the Network Firewall firewall policy options to configure a
       * centralized deployment model.
       */
      override fun policyOption(policyOption: IResolvable) {
        cdkBuilder.policyOption(policyOption.let(IResolvable::unwrap))
      }

      /**
       * @param policyOption Contains the Network Firewall firewall policy options to configure a
       * centralized deployment model.
       */
      override fun policyOption(policyOption: PolicyOptionProperty) {
        cdkBuilder.policyOption(policyOption.let(PolicyOptionProperty::unwrap))
      }

      /**
       * @param policyOption Contains the Network Firewall firewall policy options to configure a
       * centralized deployment model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f802adb0072e9aff9070aaec6a8b5cccadf0cb1794bb55ea6dcb6d68e66c7c85")
      override fun policyOption(policyOption: PolicyOptionProperty.Builder.() -> Unit): Unit =
          policyOption(PolicyOptionProperty(policyOption))

      /**
       * @param type The service that the policy is using to protect the resources. 
       * This specifies the type of policy that is created, either an AWS WAF policy, a Shield
       * Advanced policy, or a security group policy. For security group policies, Firewall Manager
       * supports one security group for each common policy and for each content audit policy. This is
       * an adjustable limit that you can increase by contacting AWS Support .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty,
    ) : CdkObject(cdkObject), SecurityServicePolicyDataProperty {
      /**
       * Details about the service that are specific to the service type, in JSON format.
       *
       * * Example: `DNS_FIREWALL`
       *
       * `"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"`
       *
       *
       * Valid values for `preProcessRuleGroups` are between 1 and 99. Valid values for
       * `postProcessRuleGroups` are between 9901 and 10000.
       *
       *
       * * Example: `NETWORK_FIREWALL` - Centralized deployment model
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability
       * Zone configuration
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
       *
       * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability
       * Zones to create the endpoints in. To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with automatic Availability
       * Zone configuration and route management
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":
       * \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
       * configuration
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",
       * \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{
       * \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[
       * \"10.0.0.0/28\"]}]}
       * },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
       *
       * With custom Availability Zone configuration, you define which specific Availability Zones
       * to create endpoints in by configuring `firewallCreationConfig` . To configure the Availability
       * Zones in `firewallCreationConfig` , specify either the `availabilityZoneName` or
       * `availabilityZoneId` parameter, not both parameters.
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `NETWORK_FIREWALL` - Distributed deployment model with custom Availability Zone
       * configuration and route management
       *
       * `"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Specification for `SHIELD_ADVANCED` for Amazon CloudFront distributions
       *
       * `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
       * {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\",
       * \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false,
       * \"optimizeUnassociatedWebACL\":true|false}"`
       *
       * For example: `"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\":
       * {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"`
       *
       * The default value for `automaticResponseStatus` is `IGNORED` . The value for
       * `automaticResponseAction` is only required when `automaticResponseStatus` is set to `ENABLED`
       * . The default value for `overrideCustomerWebaclClassic` is `false` .
       *
       * For other resource types that you can protect with a Shield Advanced policy, this
       * `ManagedServiceData` configuration is an empty string.
       *
       * * Example: `THIRD_PARTY_FIREWALL` - Centralized deployment model
       *
       * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
       *
       * `"{ \"type\":\"THIRD_PARTY_FIREWALL\",
       * \"thirdPartyFirewall\":\"\THIRD_PARTY_FIREWALL_NAME\", \"thirdPartyFirewallConfig\":{
       * \"thirdPartyFirewallPolicyList\":[\"global-1\"]
       * },\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `CENTRALIZED` .
       *
       * * Example: `THIRD_PARTY_FIREWALL` - Distributed deployment model
       *
       * Replace `THIRD_PARTY_FIREWALL_NAME` with the name of the third-party firewall.
       *
       * `"{\"type\":\"THIRD_PARTY_FIREWALL\",\"thirdPartyFirewall\":\"THIRD_PARTY_FIREWALL_NAME\",\"thirdPartyFirewallConfig\":{\"thirdPartyFirewallPolicyList\":[\"global-1\"]
       * },\"firewallDeploymentModel\":{ \"distributedFirewallDeploymentModel\":{
       * \"distributedFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{
       * \"availabilityZoneConfigList\":[ {\"availabilityZoneName\":\"${AvailabilityZone}\" } ] } },
       * \"allowedIPV4CidrList\":[ ] } } } }"`
       *
       * To use the distributed deployment model, you must set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * * Example: `WAFV2`
       *
       * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]},\"optimizeUnassociatedWebACL\":true}"`
       *
       * In the `loggingConfiguration` , you can specify one `logDestinationConfigs` , you can
       * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of
       * `URI` , `QUERY_STRING` , `HEADER` , or `METHOD` .
       *
       * * Example: `AWS WAF Classic`
       *
       * `"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\",
       * \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"`
       *
       * * Example: `WAFV2` - AWS Firewall Manager support for AWS WAF managed rule group versioning
       *
       * `"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"`
       *
       * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy,
       * you must set `versionEnabled` to `true` , and set `version` to the version you'd like to use.
       * If you don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall
       * Manager uses the default version of the AWS WAF managed rule group.
       *
       * * Example: `SECURITY_GROUPS_COMMON`
       *
       * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
       * \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"`
       *
       * * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as
       * to those in VPCs that the account owns
       *
       * `"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,
       * \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\"
       * sg-000e55995d61a06bd\"}]}"`
       *
       * * Example: `SECURITY_GROUPS_CONTENT_AUDIT`
       *
       * `"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"`
       *
       * The security group action for content audit can be `ALLOW` or `DENY` . For `ALLOW` , all
       * in-scope security group rules must be within the allowed range of the policy's security group
       * rules. For `DENY` , all in-scope security group rules must not contain a value or a range that
       * matches a rule value or range in the policy security group.
       *
       * * Example: `SECURITY_GROUPS_USAGE_AUDIT`
       *
       * `"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-securityservicepolicydata.html#cfn-fms-policy-securityservicepolicydata-managedservicedata)
       */
      override fun managedServiceData(): String? = unwrap(this).getManagedServiceData()

      /**
       * Contains the Network Firewall firewall policy options to configure a centralized deployment
       * model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-securityservicepolicydata.html#cfn-fms-policy-securityservicepolicydata-policyoption)
       */
      override fun policyOption(): Any? = unwrap(this).getPolicyOption()

      /**
       * The service that the policy is using to protect the resources.
       *
       * This specifies the type of policy that is created, either an AWS WAF policy, a Shield
       * Advanced policy, or a security group policy. For security group policies, Firewall Manager
       * supports one security group for each common policy and for each content audit policy. This is
       * an adjustable limit that you can increase by contacting AWS Support .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-securityservicepolicydata.html#cfn-fms-policy-securityservicepolicydata-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecurityServicePolicyDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty):
          SecurityServicePolicyDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityServicePolicyDataProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty
    }
  }

  /**
   * Configures the firewall policy deployment model of AWS Network Firewall .
   *
   * For information about Network Firewall deployment models, see [AWS Network Firewall example
   * architectures with
   * routing](https://docs.aws.amazon.com/network-firewall/latest/developerguide/architectures.html) in
   * the *Network Firewall Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fms.*;
   * NetworkFirewallPolicyProperty networkFirewallPolicyProperty =
   * NetworkFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
   */
  public interface NetworkFirewallPolicyProperty {
    /**
     * Defines the deployment model to use for the firewall policy.
     *
     * To use a distributed model, set
     * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
     * to `DISTRIBUTED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html#cfn-fms-policy-networkfirewallpolicy-firewalldeploymentmodel)
     */
    public fun firewallDeploymentModel(): String

    /**
     * A builder for [NetworkFirewallPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param firewallDeploymentModel Defines the deployment model to use for the firewall policy.
       * 
       * To use a distributed model, set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `DISTRIBUTED` .
       */
      public fun firewallDeploymentModel(firewallDeploymentModel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty.builder()

      /**
       * @param firewallDeploymentModel Defines the deployment model to use for the firewall policy.
       * 
       * To use a distributed model, set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `DISTRIBUTED` .
       */
      override fun firewallDeploymentModel(firewallDeploymentModel: String) {
        cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
      }

      public fun build():
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty,
    ) : CdkObject(cdkObject), NetworkFirewallPolicyProperty {
      /**
       * Defines the deployment model to use for the firewall policy.
       *
       * To use a distributed model, set
       * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
       * to `DISTRIBUTED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html#cfn-fms-policy-networkfirewallpolicy-firewalldeploymentmodel)
       */
      override fun firewallDeploymentModel(): String = unwrap(this).getFirewallDeploymentModel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkFirewallPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty):
          NetworkFirewallPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkFirewallPolicyProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty
    }
  }
}
