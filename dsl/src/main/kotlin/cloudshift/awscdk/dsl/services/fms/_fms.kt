@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnNotificationChannel
import software.amazon.awscdk.services.fms.CfnNotificationChannelProps
import software.amazon.awscdk.services.fms.CfnPolicy
import software.amazon.awscdk.services.fms.CfnPolicyProps
import software.amazon.awscdk.services.fms.CfnResourceSet
import software.amazon.awscdk.services.fms.CfnResourceSetProps
import software.constructs.Construct

public object fms {
  /**
   * Designates the IAM role and Amazon Simple Notification Service (SNS) topic to use to record SNS
   * logs.
   *
   * To perform this action outside of the console, you must configure the SNS topic to allow the
   * role `AWSServiceRoleForFMS` to publish SNS logs. For more information, see [Firewall Manager
   * required permissions for API
   * actions](https://docs.aws.amazon.com/waf/latest/developerguide/fms-api-permissions-ref.html) in
   * the *AWS Firewall Manager Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
   * CfnNotificationChannel cfnNotificationChannel = CfnNotificationChannel.Builder.create(this,
   * "MyCfnNotificationChannel")
   * .snsRoleName("snsRoleName")
   * .snsTopicArn("snsTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html)
   */
  public inline fun cfnNotificationChannel(
    scope: Construct,
    id: String,
    block: CfnNotificationChannelDsl.() -> Unit = {},
  ): CfnNotificationChannel {
    val builder = CfnNotificationChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnNotificationChannel`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
   * CfnNotificationChannelProps cfnNotificationChannelProps = CfnNotificationChannelProps.builder()
   * .snsRoleName("snsRoleName")
   * .snsTopicArn("snsTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html)
   */
  public inline fun cfnNotificationChannelProps(block: CfnNotificationChannelPropsDsl.() -> Unit =
      {}): CfnNotificationChannelProps {
    val builder = CfnNotificationChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An AWS Firewall Manager policy.
   *
   * Firewall Manager provides the following types of policies:
   *
   * * An AWS Shield Advanced policy, which applies Shield Advanced protection to specified accounts
   * and resources.
   * * An AWS WAF policy (type WAFV2), which defines rule groups to run first in the corresponding
   * AWS WAF web ACL and rule groups to run last in the web ACL.
   * * An AWS WAF Classic policy, which defines a rule group. AWS WAF Classic doesn't support rule
   * groups in Amazon CloudFront , so, to create AWS WAF Classic policies through CloudFront , you
   * first need to create your rule groups outside of CloudFront .
   * * A security group policy, which manages VPC security groups across your AWS organization.
   * * An AWS Network Firewall policy, which provides firewall rules to filter network traffic in
   * specified Amazon VPCs.
   * * A DNS Firewall policy, which provides Amazon Route 53 Resolver DNS Firewall rules to filter
   * DNS queries for specified Amazon VPCs.
   * * A third-party firewall policy, which manages a third-party firewall service such as the Palo
   * Alto Networks Cloud Next-Generation Firewall.
   *
   * Each policy is specific to one of the types. If you want to enforce more than one policy type
   * across accounts, create multiple policies. You can create multiple policies for each type.
   *
   * These policies require some setup to use. For more information, see the sections on
   * prerequisites and getting started under [AWS Firewall
   * Manager](https://docs.aws.amazon.com/waf/latest/developerguide/fms-prereq.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
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
  public inline fun cfnPolicy(
    scope: Construct,
    id: String,
    block: CfnPolicyDsl.() -> Unit = {},
  ): CfnPolicy {
    val builder = CfnPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.fms.*;
   * IEMapProperty iEMapProperty = Map.of(
   * "account", List.of("account"),
   * "orgunit", List.of("orgunit"));
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-iemap.html)
   */
  public inline fun cfnPolicyIEMapProperty(block: CfnPolicyIEMapPropertyDsl.() -> Unit = {}):
      CfnPolicy.IEMapProperty {
    val builder = CfnPolicyIEMapPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.fms.*;
   * NetworkFirewallPolicyProperty networkFirewallPolicyProperty =
   * NetworkFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
   */
  public inline
      fun cfnPolicyNetworkFirewallPolicyProperty(block: CfnPolicyNetworkFirewallPolicyPropertyDsl.() -> Unit
      = {}): CfnPolicy.NetworkFirewallPolicyProperty {
    val builder = CfnPolicyNetworkFirewallPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.fms.*;
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
  public inline fun cfnPolicyPolicyOptionProperty(block: CfnPolicyPolicyOptionPropertyDsl.() -> Unit
      = {}): CfnPolicy.PolicyOptionProperty {
    val builder = CfnPolicyPolicyOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.fms.*;
   * PolicyTagProperty policyTagProperty = PolicyTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-policytag.html)
   */
  public inline fun cfnPolicyPolicyTagProperty(block: CfnPolicyPolicyTagPropertyDsl.() -> Unit =
      {}): CfnPolicy.PolicyTagProperty {
    val builder = CfnPolicyPolicyTagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPolicy`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
   * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
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
  public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
    val builder = CfnPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.fms.*;
   * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
   * .key("key")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-resourcetag.html)
   */
  public inline fun cfnPolicyResourceTagProperty(block: CfnPolicyResourceTagPropertyDsl.() -> Unit =
      {}): CfnPolicy.ResourceTagProperty {
    val builder = CfnPolicyResourceTagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Details about the security service that is being used to protect the resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
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
  public inline
      fun cfnPolicySecurityServicePolicyDataProperty(block: CfnPolicySecurityServicePolicyDataPropertyDsl.() -> Unit
      = {}): CfnPolicy.SecurityServicePolicyDataProperty {
    val builder = CfnPolicySecurityServicePolicyDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configures the deployment model for the third-party firewall.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
   * ThirdPartyFirewallPolicyProperty thirdPartyFirewallPolicyProperty =
   * ThirdPartyFirewallPolicyProperty.builder()
   * .firewallDeploymentModel("firewallDeploymentModel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
   */
  public inline
      fun cfnPolicyThirdPartyFirewallPolicyProperty(block: CfnPolicyThirdPartyFirewallPolicyPropertyDsl.() -> Unit
      = {}): CfnPolicy.ThirdPartyFirewallPolicyProperty {
    val builder = CfnPolicyThirdPartyFirewallPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A set of resources to include in a policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
   * CfnResourceSet cfnResourceSet = CfnResourceSet.Builder.create(this, "MyCfnResourceSet")
   * .name("name")
   * .resourceTypeList(List.of("resourceTypeList"))
   * // the properties below are optional
   * .description("description")
   * .resources(List.of("resources"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html)
   */
  public inline fun cfnResourceSet(
    scope: Construct,
    id: String,
    block: CfnResourceSetDsl.() -> Unit = {},
  ): CfnResourceSet {
    val builder = CfnResourceSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnResourceSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.fms.*;
   * CfnResourceSetProps cfnResourceSetProps = CfnResourceSetProps.builder()
   * .name("name")
   * .resourceTypeList(List.of("resourceTypeList"))
   * // the properties below are optional
   * .description("description")
   * .resources(List.of("resources"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html)
   */
  public inline fun cfnResourceSetProps(block: CfnResourceSetPropsDsl.() -> Unit = {}):
      CfnResourceSetProps {
    val builder = CfnResourceSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
