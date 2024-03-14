package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPolicyProps {
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
   * For security group policies, Firewall Manager does the following for each security group in the
   * policy:
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
   */
  public fun deleteAllPolicyResources(): Any? = unwrap(this).getDeleteAllPolicyResources()

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude from
   * the policy.
   *
   * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child
   * OUs, including any child OUs and accounts that are added at a later time.
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
   */
  public fun excludeMap(): Any? = unwrap(this).getExcludeMap()

  /**
   * Used only when tags are specified in the `ResourceTags` property.
   *
   * If this property is `True` , resources with the specified tags are not in scope of the policy.
   * If it's `False` , only resources with the specified tags are in scope of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags)
   */
  public fun excludeResourceTags(): Any

  /**
   * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in
   * the policy.
   *
   * Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child
   * OUs, including any child OUs and accounts that are added at a later time.
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
   */
  public fun includeMap(): Any? = unwrap(this).getIncludeMap()

  /**
   * The definition of the AWS Network Firewall firewall policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policydescription)
   */
  public fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  /**
   * The name of the AWS Firewall Manager policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname)
   */
  public fun policyName(): String

  /**
   * Indicates if the policy should be automatically applied to new resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled)
   */
  public fun remediationEnabled(): Any

  /**
   * The unique identifiers of the resource sets used by the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcesetids)
   */
  public fun resourceSetIds(): List<String> = unwrap(this).getResourceSetIds() ?: emptyList()

  /**
   * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope or
   * explicitly exclude them.
   *
   * If this isn't set, then tags aren't used to modify policy scope. See also `ExcludeResourceTags`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
   */
  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

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
   * `AWS::ElasticLoadBalancing::LoadBalancer` , `AWS::EC2::EIP` , and `AWS::CloudFront::Distribution`
   * .
   * * Security group content audit - `AWS::EC2::SecurityGroup` , `AWS::EC2::NetworkInterface` , and
   * `AWS::EC2::Instance` .
   * * Security group usage audit - `AWS::EC2::SecurityGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetype)
   */
  public fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * An array of `ResourceType` objects.
   *
   * Use this only to specify multiple resource types. To specify a single resource type, use
   * `ResourceType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist)
   */
  public fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList() ?: emptyList()

  /**
   * Indicates whether AWS Firewall Manager should automatically remove protections from resources
   * that leave the policy scope and clean up resources that Firewall Manager is managing for accounts
   * when those accounts leave policy scope.
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
   */
  public fun resourcesCleanUp(): Any? = unwrap(this).getResourcesCleanUp()

  /**
   * Details about the security service that is being used to protect the resources.
   *
   * This contains the following settings:
   *
   * * Type - Indicates the service type that the policy uses to protect the resource. For security
   * group policies, Firewall Manager supports one security group for each common policy and for each
   * content audit policy. This is an adjustable limit that you can increase by contacting AWS Support
   * .
   *
   * Valid values: `DNS_FIREWALL` | `NETWORK_FIREWALL` | `SECURITY_GROUPS_COMMON` |
   * `SECURITY_GROUPS_CONTENT_AUDIT` | `SECURITY_GROUPS_USAGE_AUDIT` | `SHIELD_ADVANCED` |
   * `THIRD_PARTY_FIREWALL` | `WAFV2` | `WAF`
   *
   * * ManagedServiceData - Details about the service that are specific to the service type, in JSON
   * format.
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
   * create endpoints in by configuring `firewallCreationConfig` . To configure the Availability Zones
   * in `firewallCreationConfig` , specify either the `availabilityZoneName` or `availabilityZoneId`
   * parameter, not both parameters.
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
   * optionally provide up to 20 `redactedFields` , and the `RedactedFieldType` must be one of `URI` ,
   * `QUERY_STRING` , `HEADER` , or `METHOD` .
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
   * To use a specific version of a AWS WAF managed rule group in your Firewall Manager policy, you
   * must set `versionEnabled` to `true` , and set `version` to the version you'd like to use. If you
   * don't set `versionEnabled` to `true` , or if you omit `versionEnabled` , then Firewall Manager
   * uses the default version of the AWS WAF managed rule group.
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
   */
  public fun securityServicePolicyData(): Any

  /**
   * A collection of key:value pairs associated with an AWS resource.
   *
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags)
   */
  public fun tags(): List<CfnPolicy.PolicyTagProperty> =
      unwrap(this).getTags()?.map(CfnPolicy.PolicyTagProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type.
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
     */
    public fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean)

    /**
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type.
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
     */
    public fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable)

    /**
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy.
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
     */
    public fun excludeMap(excludeMap: IResolvable)

    /**
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy.
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
     */
    public fun excludeMap(excludeMap: CfnPolicy.IEMapProperty)

    /**
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy.
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dabac81d9d14de8582790778205aac9f55dc0bf0e374279a1aaba7bd345cc8df")
    public fun excludeMap(excludeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit)

    /**
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     */
    public fun excludeResourceTags(excludeResourceTags: Boolean)

    /**
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     */
    public fun excludeResourceTags(excludeResourceTags: IResolvable)

    /**
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy.
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
     */
    public fun includeMap(includeMap: IResolvable)

    /**
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy.
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
     */
    public fun includeMap(includeMap: CfnPolicy.IEMapProperty)

    /**
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy.
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0235a1bc8910622f1c668441f2471fc699a55b2eeb6f6aa7e06f9f74235904d")
    public fun includeMap(includeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit)

    /**
     * @param policyDescription The definition of the AWS Network Firewall firewall policy.
     */
    public fun policyDescription(policyDescription: String)

    /**
     * @param policyName The name of the AWS Firewall Manager policy. 
     */
    public fun policyName(policyName: String)

    /**
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    public fun remediationEnabled(remediationEnabled: Boolean)

    /**
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    public fun remediationEnabled(remediationEnabled: IResolvable)

    /**
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy.
     */
    public fun resourceSetIds(resourceSetIds: List<String>)

    /**
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy.
     */
    public fun resourceSetIds(vararg resourceSetIds: String)

    /**
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them.
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them.
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them.
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     */
    public fun resourceTags(vararg resourceTags: Any)

    /**
     * @param resourceType The type of resource protected by or in scope of the policy.
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
     */
    public fun resourceType(resourceType: String)

    /**
     * @param resourceTypeList An array of `ResourceType` objects.
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     */
    public fun resourceTypeList(resourceTypeList: List<String>)

    /**
     * @param resourceTypeList An array of `ResourceType` objects.
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     */
    public fun resourceTypeList(vararg resourceTypeList: String)

    /**
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope.
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     */
    public fun resourcesCleanUp(resourcesCleanUp: Boolean)

    /**
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope.
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     */
    public fun resourcesCleanUp(resourcesCleanUp: IResolvable)

    /**
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
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
     */
    public fun securityServicePolicyData(securityServicePolicyData: IResolvable)

    /**
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
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
     */
    public
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty)

    /**
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5cd94c5a2ee23d6307ea07058e670e3c79f73632f0d8f9d24a9f53081cd56")
    public
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty.Builder.() -> Unit)

    /**
     * @param tags A collection of key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: List<CfnPolicy.PolicyTagProperty>)

    /**
     * @param tags A collection of key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(vararg tags: CfnPolicy.PolicyTagProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.fms.CfnPolicyProps.builder()

    /**
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type.
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
     */
    override fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources)
    }

    /**
     * @param deleteAllPolicyResources Used when deleting a policy. If `true` , Firewall Manager
     * performs cleanup according to the policy type.
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
     */
    override fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources.let(IResolvable::unwrap))
    }

    /**
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy.
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
     */
    override fun excludeMap(excludeMap: IResolvable) {
      cdkBuilder.excludeMap(excludeMap.let(IResolvable::unwrap))
    }

    /**
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy.
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
     */
    override fun excludeMap(excludeMap: CfnPolicy.IEMapProperty) {
      cdkBuilder.excludeMap(excludeMap.let(CfnPolicy.IEMapProperty::unwrap))
    }

    /**
     * @param excludeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to exclude from the policy.
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dabac81d9d14de8582790778205aac9f55dc0bf0e374279a1aaba7bd345cc8df")
    override fun excludeMap(excludeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit): Unit =
        excludeMap(CfnPolicy.IEMapProperty(excludeMap))

    /**
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     */
    override fun excludeResourceTags(excludeResourceTags: Boolean) {
      cdkBuilder.excludeResourceTags(excludeResourceTags)
    }

    /**
     * @param excludeResourceTags Used only when tags are specified in the `ResourceTags` property. 
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     */
    override fun excludeResourceTags(excludeResourceTags: IResolvable) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.let(IResolvable::unwrap))
    }

    /**
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy.
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
     */
    override fun includeMap(includeMap: IResolvable) {
      cdkBuilder.includeMap(includeMap.let(IResolvable::unwrap))
    }

    /**
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy.
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
     */
    override fun includeMap(includeMap: CfnPolicy.IEMapProperty) {
      cdkBuilder.includeMap(includeMap.let(CfnPolicy.IEMapProperty::unwrap))
    }

    /**
     * @param includeMap Specifies the AWS account IDs and AWS Organizations organizational units
     * (OUs) to include in the policy.
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0235a1bc8910622f1c668441f2471fc699a55b2eeb6f6aa7e06f9f74235904d")
    override fun includeMap(includeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit): Unit =
        includeMap(CfnPolicy.IEMapProperty(includeMap))

    /**
     * @param policyDescription The definition of the AWS Network Firewall firewall policy.
     */
    override fun policyDescription(policyDescription: String) {
      cdkBuilder.policyDescription(policyDescription)
    }

    /**
     * @param policyName The name of the AWS Firewall Manager policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    override fun remediationEnabled(remediationEnabled: Boolean) {
      cdkBuilder.remediationEnabled(remediationEnabled)
    }

    /**
     * @param remediationEnabled Indicates if the policy should be automatically applied to new
     * resources. 
     */
    override fun remediationEnabled(remediationEnabled: IResolvable) {
      cdkBuilder.remediationEnabled(remediationEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy.
     */
    override fun resourceSetIds(resourceSetIds: List<String>) {
      cdkBuilder.resourceSetIds(resourceSetIds)
    }

    /**
     * @param resourceSetIds The unique identifiers of the resource sets used by the policy.
     */
    override fun resourceSetIds(vararg resourceSetIds: String): Unit =
        resourceSetIds(resourceSetIds.toList())

    /**
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them.
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them.
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * @param resourceTags An array of `ResourceTag` objects, used to explicitly include resources
     * in the policy scope or explicitly exclude them.
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    /**
     * @param resourceType The type of resource protected by or in scope of the policy.
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
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param resourceTypeList An array of `ResourceType` objects.
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     */
    override fun resourceTypeList(resourceTypeList: List<String>) {
      cdkBuilder.resourceTypeList(resourceTypeList)
    }

    /**
     * @param resourceTypeList An array of `ResourceType` objects.
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     */
    override fun resourceTypeList(vararg resourceTypeList: String): Unit =
        resourceTypeList(resourceTypeList.toList())

    /**
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope.
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     */
    override fun resourcesCleanUp(resourcesCleanUp: Boolean) {
      cdkBuilder.resourcesCleanUp(resourcesCleanUp)
    }

    /**
     * @param resourcesCleanUp Indicates whether AWS Firewall Manager should automatically remove
     * protections from resources that leave the policy scope and clean up resources that Firewall
     * Manager is managing for accounts when those accounts leave policy scope.
     * For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a
     * protected customer resource when the customer resource leaves policy scope.
     *
     * By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed
     * resources.
     *
     * This option is not available for Shield Advanced or AWS WAF Classic policies.
     */
    override fun resourcesCleanUp(resourcesCleanUp: IResolvable) {
      cdkBuilder.resourcesCleanUp(resourcesCleanUp.let(IResolvable::unwrap))
    }

    /**
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
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
     */
    override fun securityServicePolicyData(securityServicePolicyData: IResolvable) {
      cdkBuilder.securityServicePolicyData(securityServicePolicyData.let(IResolvable::unwrap))
    }

    /**
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
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
     */
    override
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty) {
      cdkBuilder.securityServicePolicyData(securityServicePolicyData.let(CfnPolicy.SecurityServicePolicyDataProperty::unwrap))
    }

    /**
     * @param securityServicePolicyData Details about the security service that is being used to
     * protect the resources. 
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5cd94c5a2ee23d6307ea07058e670e3c79f73632f0d8f9d24a9f53081cd56")
    override
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty.Builder.() -> Unit):
        Unit =
        securityServicePolicyData(CfnPolicy.SecurityServicePolicyDataProperty(securityServicePolicyData))

    /**
     * @param tags A collection of key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    override fun tags(tags: List<CfnPolicy.PolicyTagProperty>) {
      cdkBuilder.tags(tags.map(CfnPolicy.PolicyTagProperty::unwrap))
    }

    /**
     * @param tags A collection of key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    override fun tags(vararg tags: CfnPolicy.PolicyTagProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fms.CfnPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fms.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
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
     */
    override fun deleteAllPolicyResources(): Any? = unwrap(this).getDeleteAllPolicyResources()

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
     */
    override fun excludeMap(): Any? = unwrap(this).getExcludeMap()

    /**
     * Used only when tags are specified in the `ResourceTags` property.
     *
     * If this property is `True` , resources with the specified tags are not in scope of the
     * policy. If it's `False` , only resources with the specified tags are in scope of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-excluderesourcetags)
     */
    override fun excludeResourceTags(): Any = unwrap(this).getExcludeResourceTags()

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
     */
    override fun includeMap(): Any? = unwrap(this).getIncludeMap()

    /**
     * The definition of the AWS Network Firewall firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policydescription)
     */
    override fun policyDescription(): String? = unwrap(this).getPolicyDescription()

    /**
     * The name of the AWS Firewall Manager policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()

    /**
     * Indicates if the policy should be automatically applied to new resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-remediationenabled)
     */
    override fun remediationEnabled(): Any = unwrap(this).getRemediationEnabled()

    /**
     * The unique identifiers of the resource sets used by the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcesetids)
     */
    override fun resourceSetIds(): List<String> = unwrap(this).getResourceSetIds() ?: emptyList()

    /**
     * An array of `ResourceTag` objects, used to explicitly include resources in the policy scope
     * or explicitly exclude them.
     *
     * If this isn't set, then tags aren't used to modify policy scope. See also
     * `ExcludeResourceTags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetags)
     */
    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

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
     */
    override fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * An array of `ResourceType` objects.
     *
     * Use this only to specify multiple resource types. To specify a single resource type, use
     * `ResourceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-resourcetypelist)
     */
    override fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList() ?:
        emptyList()

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
     */
    override fun resourcesCleanUp(): Any? = unwrap(this).getResourcesCleanUp()

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
     */
    override fun securityServicePolicyData(): Any = unwrap(this).getSecurityServicePolicyData()

    /**
     * A collection of key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-policy.html#cfn-fms-policy-tags)
     */
    override fun tags(): List<CfnPolicy.PolicyTagProperty> =
        unwrap(this).getTags()?.map(CfnPolicy.PolicyTagProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicyProps): CfnPolicyProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps): software.amazon.awscdk.services.fms.CfnPolicyProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnPolicyProps
  }
}
