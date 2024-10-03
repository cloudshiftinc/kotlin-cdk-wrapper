@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Resources types that are supported by AWS Config.
 *
 * Example:
 *
 * ```
 * // Lambda function containing logic that evaluates compliance with the rule.
 * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
 * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_18_X)
 * .build();
 * // A custom rule that runs on configuration changes of EC2 instances
 * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
 * .configurationChanges(true)
 * .lambdaFunction(evalComplianceFn)
 * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html)
 */
public open class ResourceType(
  cdkObject: software.amazon.awscdk.services.config.ResourceType,
) : CdkObject(cdkObject) {
  /**
   * Valid value of resource type.
   */
  public open fun complianceResourceType(): String = unwrap(this).getComplianceResourceType()

  public companion object {
    public val ACM_CERTIFICATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ACM_CERTIFICATE)

    public val ACMPCA_CERTIFICATE_AUTHORITY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ACMPCA_CERTIFICATE_AUTHORITY)

    public val ACMPCA_CERTIFICATE_AUTHORITY_ACTIVATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ACMPCA_CERTIFICATE_AUTHORITY_ACTIVATION)

    public val AMAZON_MQ_BROKER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AMAZON_MQ_BROKER)

    public val AMPLIFY_APP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AMPLIFY_APP)

    public val AMPLIFY_BRANCH: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AMPLIFY_BRANCH)

    public val APIGATEWAY_REST_API: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APIGATEWAY_REST_API)

    public val APIGATEWAY_STAGE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APIGATEWAY_STAGE)

    public val APIGATEWAYV2_API: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APIGATEWAYV2_API)

    public val APIGATEWAYV2_STAGE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APIGATEWAYV2_STAGE)

    public val APP_CONFIG_DEPLOYMENT_STRATEGY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_CONFIG_DEPLOYMENT_STRATEGY)

    public val APP_CONFIG_HOSTED_CONFIGURATION_VERSION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_CONFIG_HOSTED_CONFIGURATION_VERSION)

    public val APP_FLOW_FLOW: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_FLOW_FLOW)

    public val APP_INTEGRATIONS_EVENT_INTEGRATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_INTEGRATIONS_EVENT_INTEGRATION)

    public val APP_MESH_GATEWAY_ROUTE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_MESH_GATEWAY_ROUTE)

    public val APP_MESH_MESH: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_MESH_MESH)

    public val APP_MESH_ROUTE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_MESH_ROUTE)

    public val APP_MESH_VIRTUAL_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_MESH_VIRTUAL_GATEWAY)

    public val APP_MESH_VIRTUAL_NODE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_MESH_VIRTUAL_NODE)

    public val APP_MESH_VIRTUAL_ROUTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_MESH_VIRTUAL_ROUTER)

    public val APP_MESH_VIRTUAL_SERVICE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_MESH_VIRTUAL_SERVICE)

    public val APP_RUNNER_SERVICE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_RUNNER_SERVICE)

    public val APP_RUNNER_VPC_CONNECTOR: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_RUNNER_VPC_CONNECTOR)

    public val APP_STREAM_APPLICATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_STREAM_APPLICATION)

    public val APP_STREAM_DIRECTORY_CONFIG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_STREAM_DIRECTORY_CONFIG)

    public val APP_STREAM_FLEET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_STREAM_FLEET)

    public val APP_STREAM_STACK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APP_STREAM_STACK)

    public val APPCONFIG_APPLICATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APPCONFIG_APPLICATION)

    public val APPCONFIG_CONFIGURATION_PROFILE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APPCONFIG_CONFIGURATION_PROFILE)

    public val APPCONFIG_ENVIRONMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APPCONFIG_ENVIRONMENT)

    public val APPSYNC_GRAPHQL_API: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APPSYNC_GRAPHQL_API)

    public val APS_RULE_GROUPS_NAMESPACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.APS_RULE_GROUPS_NAMESPACE)

    public val ATHENA_PREPARED_STATEMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ATHENA_PREPARED_STATEMENT)

    public val AUDIT_MANAGER_ASSESSMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AUDIT_MANAGER_ASSESSMENT)

    public val AUTO_SCALING_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AUTO_SCALING_GROUP)

    public val AUTO_SCALING_LAUNCH_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AUTO_SCALING_LAUNCH_CONFIGURATION)

    public val AUTO_SCALING_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AUTO_SCALING_POLICY)

    public val AUTO_SCALING_SCHEDULED_ACTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AUTO_SCALING_SCHEDULED_ACTION)

    public val AUTO_SCALING_WARM_POOL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.AUTO_SCALING_WARM_POOL)

    public val BACKUP_BACKUP_PLAN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BACKUP_BACKUP_PLAN)

    public val BACKUP_BACKUP_SELECTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BACKUP_BACKUP_SELECTION)

    public val BACKUP_BACKUP_VAULT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BACKUP_BACKUP_VAULT)

    public val BACKUP_RECOVERY_POINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BACKUP_RECOVERY_POINT)

    public val BACKUP_REPORT_PLAN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BACKUP_REPORT_PLAN)

    public val BATCH_COMPUTE_ENVIRONMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BATCH_COMPUTE_ENVIRONMENT)

    public val BATCH_JOB_QUEUE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BATCH_JOB_QUEUE)

    public val BATCH_SCHEDULING_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BATCH_SCHEDULING_POLICY)

    public val BUDGETS_BUDGETS_ACTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.BUDGETS_BUDGETS_ACTION)

    public val CASSANDRA_KEYSPACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CASSANDRA_KEYSPACE)

    public val CLOUD_WATCH_METRIC_STREAM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUD_WATCH_METRIC_STREAM)

    public val CLOUD9_ENVIRONMENT_EC2: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUD9_ENVIRONMENT_EC2)

    public val CLOUDFORMATION_STACK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUDFORMATION_STACK)

    public val CLOUDFRONT_DISTRIBUTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUDFRONT_DISTRIBUTION)

    public val CLOUDFRONT_STREAMING_DISTRIBUTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUDFRONT_STREAMING_DISTRIBUTION)

    public val CLOUDTRAIL_TRAIL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUDTRAIL_TRAIL)

    public val CLOUDWATCH_ALARM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUDWATCH_ALARM)

    public val CLOUDWATCH_RUM_APP_MONITOR: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CLOUDWATCH_RUM_APP_MONITOR)

    public val CODE_ARTIFACT_REPOSITORY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODE_ARTIFACT_REPOSITORY)

    public val CODE_BUILD_REPORT_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODE_BUILD_REPORT_GROUP)

    public val CODE_GURU_PROFILER_PROFILING_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODE_GURU_PROFILER_PROFILING_GROUP)

    public val CODE_GURU_REVIEWER_REPOSITORY_ASSOCIATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODE_GURU_REVIEWER_REPOSITORY_ASSOCIATION)

    public val CODEBUILD_PROJECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODEBUILD_PROJECT)

    public val CODEDEPLOY_APPLICATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODEDEPLOY_APPLICATION)

    public val CODEDEPLOY_DEPLOYMENT_CONFIG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODEDEPLOY_DEPLOYMENT_CONFIG)

    public val CODEDEPLOY_DEPLOYMENT_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODEDEPLOY_DEPLOYMENT_GROUP)

    public val CODEPIPELINE_PIPELINE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CODEPIPELINE_PIPELINE)

    public val CONFIG_CONFORMANCE_PACK_COMPLIANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CONFIG_CONFORMANCE_PACK_COMPLIANCE)

    public val CONFIG_RESOURCE_COMPLIANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CONFIG_RESOURCE_COMPLIANCE)

    public val CONNECT_INSTANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CONNECT_INSTANCE)

    public val CONNECT_PHONE_NUMBER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CONNECT_PHONE_NUMBER)

    public val CONNECT_QUICK_CONNECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CONNECT_QUICK_CONNECT)

    public val CUSTOMER_PROFILES_DOMAIN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CUSTOMER_PROFILES_DOMAIN)

    public val CUSTOMER_PROFILES_OBJECT_TYPE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.CUSTOMER_PROFILES_OBJECT_TYPE)

    public val DATASYNC_LOCATION_EFS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_EFS)

    public val DATASYNC_LOCATION_FSX_LUSTRE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_FSX_LUSTRE)

    public val DATASYNC_LOCATION_FSX_WINDOWS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_FSX_WINDOWS)

    public val DATASYNC_LOCATION_HDFS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_HDFS)

    public val DATASYNC_LOCATION_NFS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_NFS)

    public val DATASYNC_LOCATION_OBJECT_STORAGE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_OBJECT_STORAGE)

    public val DATASYNC_LOCATION_S3: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_S3)

    public val DATASYNC_LOCATION_SMB: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_LOCATION_SMB)

    public val DATASYNC_TASK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DATASYNC_TASK)

    public val DEVICE_FARM_INSTANCE_PROFILE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DEVICE_FARM_INSTANCE_PROFILE)

    public val DEVICE_FARM_PROJECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DEVICE_FARM_PROJECT)

    public val DEVICE_FARM_TEST_GRID_PROJECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DEVICE_FARM_TEST_GRID_PROJECT)

    public val DMS_ENDPOINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DMS_ENDPOINT)

    public val DMS_EVENT_SUBSCRIPTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DMS_EVENT_SUBSCRIPTION)

    public val DMS_REPLICATION_SUBNET_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DMS_REPLICATION_SUBNET_GROUP)

    public val DYNAMODB_TABLE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.DYNAMODB_TABLE)

    public val EBS_VOLUME: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EBS_VOLUME)

    public val EC2_CAPACITY_RESERVATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_CAPACITY_RESERVATION)

    public val EC2_CARRIER_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_CARRIER_GATEWAY)

    public val EC2_CLIENT_VPN_ENDPOINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_CLIENT_VPN_ENDPOINT)

    public val EC2_CUSTOMER_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_CUSTOMER_GATEWAY)

    public val EC2_DHCP_OPTIONS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_DHCP_OPTIONS)

    public val EC2_EC2_FLEET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_EC2_FLEET)

    public val EC2_EGRESS_ONLY_INTERNET_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_EGRESS_ONLY_INTERNET_GATEWAY)

    public val EC2_EIP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_EIP)

    public val EC2_FLOW_LOG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_FLOW_LOG)

    public val EC2_HOST: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_HOST)

    public val EC2_INSTANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_INSTANCE)

    public val EC2_INTERNET_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_INTERNET_GATEWAY)

    public val EC2_IPAM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_IPAM)

    public val EC2_IPAM_POOL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_IPAM_POOL)

    public val EC2_IPAM_SCOPE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_IPAM_SCOPE)

    public val EC2_LAUNCH_TEMPLATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_LAUNCH_TEMPLATE)

    public val EC2_NAT_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_NAT_GATEWAY)

    public val EC2_NETWORK_ACL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_NETWORK_ACL)

    public val EC2_NETWORK_INSIGHTS_ACCESS_SCOPE_ANALYSIS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_NETWORK_INSIGHTS_ACCESS_SCOPE_ANALYSIS)

    public val EC2_NETWORK_INSIGHTS_PATH: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_NETWORK_INSIGHTS_PATH)

    public val EC2_NETWORK_INTERFACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_NETWORK_INTERFACE)

    public val EC2_PREFIX_LIST: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_PREFIX_LIST)

    public val EC2_REGISTERED_HA_INSTANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_REGISTERED_HA_INSTANCE)

    public val EC2_ROUTE_TABLE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_ROUTE_TABLE)

    public val EC2_SECURITY_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_SECURITY_GROUP)

    public val EC2_SPOT_FLEET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_SPOT_FLEET)

    public val EC2_SUBNET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_SUBNET)

    public val EC2_SUBNET_ROUTE_TABLE_ASSOCIATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_SUBNET_ROUTE_TABLE_ASSOCIATION)

    public val EC2_TRAFFIC_MIRROR_FILTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRAFFIC_MIRROR_FILTER)

    public val EC2_TRAFFIC_MIRROR_SESSION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRAFFIC_MIRROR_SESSION)

    public val EC2_TRAFFIC_MIRROR_TARGET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRAFFIC_MIRROR_TARGET)

    public val EC2_TRANSIT_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRANSIT_GATEWAY)

    public val EC2_TRANSIT_GATEWAY_ATTACHMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRANSIT_GATEWAY_ATTACHMENT)

    public val EC2_TRANSIT_GATEWAY_CONNECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRANSIT_GATEWAY_CONNECT)

    public val EC2_TRANSIT_GATEWAY_MULTICAST_DOMAIN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRANSIT_GATEWAY_MULTICAST_DOMAIN)

    public val EC2_TRANSIT_GATEWAY_ROUTE_TABLE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_TRANSIT_GATEWAY_ROUTE_TABLE)

    public val EC2_VPC: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_VPC)

    public val EC2_VPC_ENDPOINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_VPC_ENDPOINT)

    public val EC2_VPC_ENDPOINT_SERVICE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_VPC_ENDPOINT_SERVICE)

    public val EC2_VPC_PEERING_CONNECTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_VPC_PEERING_CONNECTION)

    public val EC2_VPN_CONNECTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_VPN_CONNECTION)

    public val EC2_VPN_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EC2_VPN_GATEWAY)

    public val ECR_PUBLIC_REPOSITORY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECR_PUBLIC_REPOSITORY)

    public val ECR_PULL_THROUGH_CACHE_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECR_PULL_THROUGH_CACHE_RULE)

    public val ECR_REGISTRY_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECR_REGISTRY_POLICY)

    public val ECR_REPOSITORY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECR_REPOSITORY)

    public val ECS_CAPACITY_PROVIDER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECS_CAPACITY_PROVIDER)

    public val ECS_CLUSTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECS_CLUSTER)

    public val ECS_SERVICE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECS_SERVICE)

    public val ECS_TASK_DEFINITION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECS_TASK_DEFINITION)

    public val ECS_TASK_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ECS_TASK_SET)

    public val EFS_ACCESS_POINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EFS_ACCESS_POINT)

    public val EFS_FILE_SYSTEM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EFS_FILE_SYSTEM)

    public val EKS_ADDON: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EKS_ADDON)

    public val EKS_CLUSTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EKS_CLUSTER)

    public val EKS_IDENTITY_PROVIDER_CONFIG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EKS_IDENTITY_PROVIDER_CONFIG)

    public val ELASTIC_BEANSTALK_APPLICATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ELASTIC_BEANSTALK_APPLICATION)

    public val ELASTIC_BEANSTALK_APPLICATION_VERSION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ELASTIC_BEANSTALK_APPLICATION_VERSION)

    public val ELASTIC_BEANSTALK_ENVIRONMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ELASTIC_BEANSTALK_ENVIRONMENT)

    public val ELASTICSEARCH_DOMAIN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ELASTICSEARCH_DOMAIN)

    public val ELB_LOAD_BALANCER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ELB_LOAD_BALANCER)

    public val ELBV2_LISTENER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ELBV2_LISTENER)

    public val ELBV2_LOAD_BALANCER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ELBV2_LOAD_BALANCER)

    public val EMR_SECURITY_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EMR_SECURITY_CONFIGURATION)

    public val EVENT_SCHEMAS_SCHEMA: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENT_SCHEMAS_SCHEMA)

    public val EVENTBRIDGE_API_DESTINATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTBRIDGE_API_DESTINATION)

    public val EVENTBRIDGE_ARCHIVE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTBRIDGE_ARCHIVE)

    public val EVENTBRIDGE_ENDPOINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTBRIDGE_ENDPOINT)

    public val EVENTBRIDGE_EVENTBUS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTBRIDGE_EVENTBUS)

    public val EVENTS_CONNECTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTS_CONNECTION)

    public val EVENTS_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTS_RULE)

    public val EVENTSCHEMAS_DISCOVERER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTSCHEMAS_DISCOVERER)

    public val EVENTSCHEMAS_REGISTRY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTSCHEMAS_REGISTRY)

    public val EVENTSCHEMAS_REGISTRY_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVENTSCHEMAS_REGISTRY_POLICY)

    public val EVIDENTLY_LAUNCH: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVIDENTLY_LAUNCH)

    public val EVIDENTLY_PROJECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.EVIDENTLY_PROJECT)

    public val FIS_EXPERIMENT_TEMPLATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.FIS_EXPERIMENT_TEMPLATE)

    public val FORECAST_DATASET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.FORECAST_DATASET)

    public val FORECAST_DATASET_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.FORECAST_DATASET_GROUP)

    public val FRAUDDETECTOR_ENTITY_TYPE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.FRAUDDETECTOR_ENTITY_TYPE)

    public val FRAUDDETECTOR_LABEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.FRAUDDETECTOR_LABEL)

    public val FRAUDDETECTOR_OUTCOME: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.FRAUDDETECTOR_OUTCOME)

    public val FRAUDDETECTOR_VARIABLE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.FRAUDDETECTOR_VARIABLE)

    public val GLOBALACCELERATOR_ACCELERATOR: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GLOBALACCELERATOR_ACCELERATOR)

    public val GLOBALACCELERATOR_ENDPOINT_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GLOBALACCELERATOR_ENDPOINT_GROUP)

    public val GLOBALACCELERATOR_LISTENER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GLOBALACCELERATOR_LISTENER)

    public val GLUE_CLASSIFIER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GLUE_CLASSIFIER)

    public val GLUE_JOB: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GLUE_JOB)

    public val GLUE_ML_TRANSFORM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GLUE_ML_TRANSFORM)

    public val GRAFANA_WORKSPACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GRAFANA_WORKSPACE)

    public val GREENGRASSV2_COMPONENT_VERSION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GREENGRASSV2_COMPONENT_VERSION)

    public val GROUND_STATION_CONFIG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GROUND_STATION_CONFIG)

    public val GROUNDSTATION_MISSION_PROFILE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GROUNDSTATION_MISSION_PROFILE)

    public val GUARDDUTY_DETECTOR: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GUARDDUTY_DETECTOR)

    public val GUARDDUTY_FILTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GUARDDUTY_FILTER)

    public val GUARDDUTY_IP_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GUARDDUTY_IP_SET)

    public val GUARDDUTY_THREAT_INTEL_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.GUARDDUTY_THREAT_INTEL_SET)

    public val HEALTH_LAKE_FHIR_DATASTORE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.HEALTH_LAKE_FHIR_DATASTORE)

    public val IAM_ACCESSANALYZER_ANALYZER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_ACCESSANALYZER_ANALYZER)

    public val IAM_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_GROUP)

    public val IAM_INSTANCE_PROFILE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_INSTANCE_PROFILE)

    public val IAM_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_POLICY)

    public val IAM_ROLE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_ROLE)

    public val IAM_SAML_PROVIDER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_SAML_PROVIDER)

    public val IAM_SERVER_CERTIFICATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_SERVER_CERTIFICATE)

    public val IAM_USER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IAM_USER)

    public val IMAGE_BUILDER_IMAGE_PIPELINE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IMAGE_BUILDER_IMAGE_PIPELINE)

    public val IMAGEBUILDER_CONTAINER_RECIPE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IMAGEBUILDER_CONTAINER_RECIPE)

    public val IMAGEBUILDER_DISTRIBUTION_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IMAGEBUILDER_DISTRIBUTION_CONFIGURATION)

    public val IMAGEBUILDER_INFRASTRUCTURE_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IMAGEBUILDER_INFRASTRUCTURE_CONFIGURATION)

    public val INSPECTORV2_FILTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.INSPECTORV2_FILTER)

    public val IOT_ACCOUNT_AUDIT_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_ACCOUNT_AUDIT_CONFIGURATION)

    public val IOT_ANALYTICS_CHANNEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_ANALYTICS_CHANNEL)

    public val IOT_ANALYTICS_DATASET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_ANALYTICS_DATASET)

    public val IOT_ANALYTICS_DATASTORE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_ANALYTICS_DATASTORE)

    public val IOT_ANALYTICS_PIPELINE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_ANALYTICS_PIPELINE)

    public val IOT_AUTHORIZER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_AUTHORIZER)

    public val IOT_CA_CERTIFICATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_CA_CERTIFICATE)

    public val IOT_CUSTOM_METRIC: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_CUSTOM_METRIC)

    public val IOT_DIMENSION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_DIMENSION)

    public val IOT_EVENTS_ALARM_MODEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_EVENTS_ALARM_MODEL)

    public val IOT_EVENTS_DETECTOR_MODEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_EVENTS_DETECTOR_MODEL)

    public val IOT_EVENTS_INPUT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_EVENTS_INPUT)

    public val IOT_FLEET_METRIC: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_FLEET_METRIC)

    public val IOT_JOB_TEMPLATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_JOB_TEMPLATE)

    public val IOT_MITIGATION_ACTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_MITIGATION_ACTION)

    public val IOT_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_POLICY)

    public val IOT_PROVISIONING_TEMPLATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_PROVISIONING_TEMPLATE)

    public val IOT_ROLE_ALIAS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_ROLE_ALIAS)

    public val IOT_SCHEDULED_AUDIT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_SCHEDULED_AUDIT)

    public val IOT_SECURITY_PROFILE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_SECURITY_PROFILE)

    public val IOT_SITEWISE_ASSETMODEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_SITEWISE_ASSETMODEL)

    public val IOT_SITEWISE_DASHBOARD: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_SITEWISE_DASHBOARD)

    public val IOT_SITEWISE_GATEWAY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_SITEWISE_GATEWAY)

    public val IOT_SITEWISE_PORTAL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_SITEWISE_PORTAL)

    public val IOT_SITEWISE_PROJECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_SITEWISE_PROJECT)

    public val IOT_TWIN_MAKER_COMPONENT_TYPE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_TWIN_MAKER_COMPONENT_TYPE)

    public val IOT_TWIN_MAKER_SCENE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_TWIN_MAKER_SCENE)

    public val IOT_TWIN_MAKER_SYNC_JOB: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_TWIN_MAKER_SYNC_JOB)

    public val IOT_TWINMAKER_ENTITY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_TWINMAKER_ENTITY)

    public val IOT_TWINMAKER_WORKSPACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_TWINMAKER_WORKSPACE)

    public val IOT_WIRELESS_FUOTA_TASK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_WIRELESS_FUOTA_TASK)

    public val IOT_WIRELESS_MULTICAST_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_WIRELESS_MULTICAST_GROUP)

    public val IOT_WIRELESS_SERVICE_PROFILE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IOT_WIRELESS_SERVICE_PROFILE)

    public val IVS_CHANNEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IVS_CHANNEL)

    public val IVS_PLAYBACK_KEYPAIR: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IVS_PLAYBACK_KEYPAIR)

    public val IVS_RECORDING_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.IVS_RECORDING_CONFIGURATION)

    public val KAFKA_CONNECT_CONNECTOR: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KAFKA_CONNECT_CONNECTOR)

    public val KENDRA_INDEX: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KENDRA_INDEX)

    public val KINESIS_ANALYTICS_V2_APPLICATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KINESIS_ANALYTICS_V2_APPLICATION)

    public val KINESIS_FIREHOSE_DELIVERY_STREAM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KINESIS_FIREHOSE_DELIVERY_STREAM)

    public val KINESIS_STREAM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KINESIS_STREAM)

    public val KINESIS_STREAM_CONSUMER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KINESIS_STREAM_CONSUMER)

    public val KINESIS_VIDEO_SIGNALING_CHANNEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KINESIS_VIDEO_SIGNALING_CHANNEL)

    public val KINESIS_VIDEO_STREAM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KINESIS_VIDEO_STREAM)

    public val KMS_ALIAS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KMS_ALIAS)

    public val KMS_KEY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.KMS_KEY)

    public val LAMBDA_CODE_SIGNING_CONFIG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LAMBDA_CODE_SIGNING_CONFIG)

    public val LAMBDA_FUNCTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LAMBDA_FUNCTION)

    public val LEX_BOT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LEX_BOT)

    public val LEX_BOT_ALIAS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LEX_BOT_ALIAS)

    public val LIGHTSAIL_BUCKET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LIGHTSAIL_BUCKET)

    public val LIGHTSAIL_CERTIFICATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LIGHTSAIL_CERTIFICATE)

    public val LIGHTSAIL_DISK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LIGHTSAIL_DISK)

    public val LIGHTSAIL_STATIC_IP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LIGHTSAIL_STATIC_IP)

    public val LOGS_DESTINATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LOGS_DESTINATION)

    public val LOOKOUT_METRICS_ALERT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LOOKOUT_METRICS_ALERT)

    public val LOOKOUT_VISION_PROJECT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.LOOKOUT_VISION_PROJECT)

    public val MEDIA_CONNECT_FLOW_SOURCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MEDIA_CONNECT_FLOW_SOURCE)

    public val MEDIA_PACKAGE_PACKAGING_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MEDIA_PACKAGE_PACKAGING_CONFIGURATION)

    public val MEDIACONNECT_FLOW_ENTITLEMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MEDIACONNECT_FLOW_ENTITLEMENT)

    public val MEDIACONNECT_FLOW_VPC_INTERFACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MEDIACONNECT_FLOW_VPC_INTERFACE)

    public val MEDIAPACKAGE_PACKAGING_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MEDIAPACKAGE_PACKAGING_GROUP)

    public val MEDIATAILOR_PLAYBACK_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MEDIATAILOR_PLAYBACK_CONFIGURATION)

    public val MSK_BATCH_SCRAM_SECRET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MSK_BATCH_SCRAM_SECRET)

    public val MSK_CLUSTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MSK_CLUSTER)

    public val MSK_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.MSK_CONFIGURATION)

    public val NETWORK_FIREWALL_FIREWALL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_FIREWALL_FIREWALL)

    public val NETWORK_FIREWALL_FIREWALL_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_FIREWALL_FIREWALL_POLICY)

    public val NETWORK_FIREWALL_RULE_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_FIREWALL_RULE_GROUP)

    public val NETWORK_FIREWALL_TLS_INSPECTION_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_FIREWALL_TLS_INSPECTION_CONFIGURATION)

    public val NETWORK_MANAGER_CONNECT_PEER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_CONNECT_PEER)

    public val NETWORK_MANAGER_CUSTOMER_GATEWAY_ASSOCIATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_CUSTOMER_GATEWAY_ASSOCIATION)

    public val NETWORK_MANAGER_DEVICE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_DEVICE)

    public val NETWORK_MANAGER_GLOBAL_NETWORK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_GLOBAL_NETWORK)

    public val NETWORK_MANAGER_LINK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_LINK)

    public val NETWORK_MANAGER_LINK_ASSOCIATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_LINK_ASSOCIATION)

    public val NETWORK_MANAGER_SITE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_SITE)

    public val NETWORK_MANAGER_TRANSIT_GATEWAY_REGISTRATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.NETWORK_MANAGER_TRANSIT_GATEWAY_REGISTRATION)

    public val OPENSEARCH_DOMAIN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.OPENSEARCH_DOMAIN)

    public val PANORAMA_PACKAGE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PANORAMA_PACKAGE)

    public val PERSONALIZE_DATASET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PERSONALIZE_DATASET)

    public val PERSONALIZE_DATASET_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PERSONALIZE_DATASET_GROUP)

    public val PERSONALIZE_SCHEMA: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PERSONALIZE_SCHEMA)

    public val PERSONALIZE_SOLUTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PERSONALIZE_SOLUTION)

    public val PINPOINT_APP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_APP)

    public val PINPOINT_APPLICATION_SETTINGS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_APPLICATION_SETTINGS)

    public val PINPOINT_CAMPAIGN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_CAMPAIGN)

    public val PINPOINT_EMAIL_CHANNEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_EMAIL_CHANNEL)

    public val PINPOINT_EMAIL_TEMPLATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_EMAIL_TEMPLATE)

    public val PINPOINT_EVENT_STREAM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_EVENT_STREAM)

    public val PINPOINT_IN_APP_TEMPLATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_IN_APP_TEMPLATE)

    public val PINPOINT_SEGMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.PINPOINT_SEGMENT)

    public val QLDB_LEDGER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.QLDB_LEDGER)

    public val RDS_DB_CLUSTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_DB_CLUSTER)

    public val RDS_DB_CLUSTER_SNAPSHOT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_DB_CLUSTER_SNAPSHOT)

    public val RDS_DB_INSTANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_DB_INSTANCE)

    public val RDS_DB_SECURITY_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_DB_SECURITY_GROUP)

    public val RDS_DB_SNAPSHOT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_DB_SNAPSHOT)

    public val RDS_DB_SUBNET_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_DB_SUBNET_GROUP)

    public val RDS_EVENT_SUBSCRIPTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_EVENT_SUBSCRIPTION)

    public val RDS_GLOBAL_CLUSTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_GLOBAL_CLUSTER)

    public val RDS_OPTION_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RDS_OPTION_GROUP)

    public val REDSHIFT_CLUSTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.REDSHIFT_CLUSTER)

    public val REDSHIFT_CLUSTER_PARAMETER_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.REDSHIFT_CLUSTER_PARAMETER_GROUP)

    public val REDSHIFT_CLUSTER_SECURITY_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.REDSHIFT_CLUSTER_SECURITY_GROUP)

    public val REDSHIFT_CLUSTER_SNAPSHOT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.REDSHIFT_CLUSTER_SNAPSHOT)

    public val REDSHIFT_CLUSTER_SUBNET_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.REDSHIFT_CLUSTER_SUBNET_GROUP)

    public val REDSHIFT_EVENT_SUBSCRIPTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.REDSHIFT_EVENT_SUBSCRIPTION)

    public val REDSHIFT_SCHEDULED_ACTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.REDSHIFT_SCHEDULED_ACTION)

    public val RESILIENCEHUB_APP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RESILIENCEHUB_APP)

    public val RESILIENCEHUB_RESILIENCY_POLICY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RESILIENCEHUB_RESILIENCY_POLICY)

    public val RESOURCE_EXPLORER2_INDEX: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.RESOURCE_EXPLORER2_INDEX)

    public val ROBO_MAKER_ROBOT_APPLICATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROBO_MAKER_ROBOT_APPLICATION)

    public val ROBO_MAKER_ROBOT_APPLICATION_VERSION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROBO_MAKER_ROBOT_APPLICATION_VERSION)

    public val ROBO_MAKER_SIMULATION_APPLICATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROBO_MAKER_SIMULATION_APPLICATION)

    public val ROUTE53_HEALTH_CHECK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_HEALTH_CHECK)

    public val ROUTE53_HOSTED_ZONE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_HOSTED_ZONE)

    public val ROUTE53_RECOVERY_CONTROL_CLUSTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_CONTROL_CLUSTER)

    public val ROUTE53_RECOVERY_CONTROL_CONTROL_PANEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_CONTROL_CONTROL_PANEL)

    public val ROUTE53_RECOVERY_CONTROL_ROUTING_CONTROL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_CONTROL_ROUTING_CONTROL)

    public val ROUTE53_RECOVERY_CONTROL_SAFETY_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_CONTROL_SAFETY_RULE)

    public val ROUTE53_RECOVERY_READINESS_CELL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_READINESS_CELL)

    public val ROUTE53_RECOVERY_READINESS_READINESS_CHECK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_READINESS_READINESS_CHECK)

    public val ROUTE53_RECOVERY_READINESS_RECOVERY_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_READINESS_RECOVERY_GROUP)

    public val ROUTE53_RECOVERY_READINESS_RESOURCE_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RECOVERY_READINESS_RESOURCE_SET)

    public val ROUTE53_RESOLVER_FIREWALL_DOMAIN_LIST: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_FIREWALL_DOMAIN_LIST)

    public val ROUTE53_RESOLVER_FIREWALL_RULE_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_FIREWALL_RULE_GROUP)

    public val ROUTE53_RESOLVER_FIREWALL_RULE_GROUP_ASSOCIATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_FIREWALL_RULE_GROUP_ASSOCIATION)

    public val ROUTE53_RESOLVER_QUERY_LOGGING_CONFIG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_QUERY_LOGGING_CONFIG)

    public val ROUTE53_RESOLVER_QUERY_LOGGING_CONFIG_ASSOCIATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_QUERY_LOGGING_CONFIG_ASSOCIATION)

    public val ROUTE53_RESOLVER_RESOLVER_ENDPOINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_RESOLVER_ENDPOINT)

    public val ROUTE53_RESOLVER_RESOLVER_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_RESOLVER_RULE)

    public val ROUTE53_RESOLVER_RESOLVER_RULE_ASSOCIATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.ROUTE53_RESOLVER_RESOLVER_RULE_ASSOCIATION)

    public val S3_ACCESS_POINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.S3_ACCESS_POINT)

    public val S3_ACCOUNT_PUBLIC_ACCESS_BLOCK: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.S3_ACCOUNT_PUBLIC_ACCESS_BLOCK)

    public val S3_BUCKET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.S3_BUCKET)

    public val S3_MULTIREGION_ACCESS_POINT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.S3_MULTIREGION_ACCESS_POINT)

    public val S3_STORAGE_LENS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.S3_STORAGE_LENS)

    public val SAGE_MAKER_APP_IMAGE_CONFIG: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGE_MAKER_APP_IMAGE_CONFIG)

    public val SAGE_MAKER_IMAGE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGE_MAKER_IMAGE)

    public val SAGEMAKER_CODE_REPOSITORY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGEMAKER_CODE_REPOSITORY)

    public val SAGEMAKER_DOMAIN: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGEMAKER_DOMAIN)

    public val SAGEMAKER_FEATURE_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGEMAKER_FEATURE_GROUP)

    public val SAGEMAKER_MODEL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGEMAKER_MODEL)

    public val SAGEMAKER_NOTEBOOK_INSTANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGEMAKER_NOTEBOOK_INSTANCE)

    public val SAGEMAKER_WORKTEAM: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SAGEMAKER_WORKTEAM)

    public val SECRETS_MANAGER_SECRET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SECRETS_MANAGER_SECRET)

    public val SERVICE_CATALOG_CLOUDFORMATION_PRODUCT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SERVICE_CATALOG_CLOUDFORMATION_PRODUCT)

    public val SERVICE_CATALOG_CLOUDFORMATION_PROVISIONED_PRODUCT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SERVICE_CATALOG_CLOUDFORMATION_PROVISIONED_PRODUCT)

    public val SERVICE_CATALOG_PORTFOLIO: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SERVICE_CATALOG_PORTFOLIO)

    public val SERVICE_DISCOVERY_INSTANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SERVICE_DISCOVERY_INSTANCE)

    public val SERVICEDISCOVERY_HTTP_NAMESPACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SERVICEDISCOVERY_HTTP_NAMESPACE)

    public val SERVICEDISCOVERY_PUBLIC_DNS_NAMESPACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SERVICEDISCOVERY_PUBLIC_DNS_NAMESPACE)

    public val SERVICEDISCOVERY_SERVICE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SERVICEDISCOVERY_SERVICE)

    public val SES_CONFIGURATION_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SES_CONFIGURATION_SET)

    public val SES_CONTACT_LIST: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SES_CONTACT_LIST)

    public val SES_RECEIPT_FILTER: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SES_RECEIPT_FILTER)

    public val SES_RECEIPT_RECEIPT_RULE_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SES_RECEIPT_RECEIPT_RULE_SET)

    public val SES_TEMPLATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SES_TEMPLATE)

    public val SHIELD_PROTECTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SHIELD_PROTECTION)

    public val SHIELD_REGIONAL_PROTECTION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SHIELD_REGIONAL_PROTECTION)

    public val SIGNER_SIGNING_PROFILE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SIGNER_SIGNING_PROFILE)

    public val SNS_TOPIC: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SNS_TOPIC)

    public val SQS_QUEUE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SQS_QUEUE)

    public val STEPFUNCTIONS_ACTIVITY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.STEPFUNCTIONS_ACTIVITY)

    public val STEPFUNCTIONS_STATE_MACHINE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.STEPFUNCTIONS_STATE_MACHINE)

    public val SYSTEMS_MANAGER_ASSOCIATION_COMPLIANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SYSTEMS_MANAGER_ASSOCIATION_COMPLIANCE)

    public val SYSTEMS_MANAGER_FILE_DATA: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SYSTEMS_MANAGER_FILE_DATA)

    public val SYSTEMS_MANAGER_MANAGED_INSTANCE_INVENTORY: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SYSTEMS_MANAGER_MANAGED_INSTANCE_INVENTORY)

    public val SYSTEMS_MANAGER_PATCH_COMPLIANCE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.SYSTEMS_MANAGER_PATCH_COMPLIANCE)

    public val TRANSFER_AGREEMENT: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.TRANSFER_AGREEMENT)

    public val TRANSFER_CERTIFICATE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.TRANSFER_CERTIFICATE)

    public val TRANSFER_CONNECTOR: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.TRANSFER_CONNECTOR)

    public val TRANSFER_WORKFLOW: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.TRANSFER_WORKFLOW)

    public val WAF_RATE_BASED_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_RATE_BASED_RULE)

    public val WAF_REGIONAL_RATE_BASED_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_REGIONAL_RATE_BASED_RULE)

    public val WAF_REGIONAL_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_REGIONAL_RULE)

    public val WAF_REGIONAL_RULE_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_REGIONAL_RULE_GROUP)

    public val WAF_REGIONAL_WEB_ACL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_REGIONAL_WEB_ACL)

    public val WAF_RULE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_RULE)

    public val WAF_RULE_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_RULE_GROUP)

    public val WAF_WEB_ACL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAF_WEB_ACL)

    public val WAFV2_IP_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAFV2_IP_SET)

    public val WAFV2_MANAGED_RULE_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAFV2_MANAGED_RULE_SET)

    public val WAFV2_REGEX_PATTERN_SET: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAFV2_REGEX_PATTERN_SET)

    public val WAFV2_RULE_GROUP: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAFV2_RULE_GROUP)

    public val WAFV2_WEB_ACL: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WAFV2_WEB_ACL)

    public val WORKSPACES_CONNECTION_ALIAS: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WORKSPACES_CONNECTION_ALIAS)

    public val WORKSPACES_WORKSPACE: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.WORKSPACES_WORKSPACE)

    public val XRAY_ENCRYPTION_CONFIGURATION: ResourceType =
        ResourceType.wrap(software.amazon.awscdk.services.config.ResourceType.XRAY_ENCRYPTION_CONFIGURATION)

    public fun of(type: String): ResourceType =
        software.amazon.awscdk.services.config.ResourceType.of(type).let(ResourceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.ResourceType): ResourceType
        = ResourceType(cdkObject)

    internal fun unwrap(wrapped: ResourceType): software.amazon.awscdk.services.config.ResourceType
        = wrapped.cdkObject as software.amazon.awscdk.services.config.ResourceType
  }
}
