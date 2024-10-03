@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Managed rules that are supported by AWS Config.
 *
 * Example:
 *
 * ```
 * Function fn;
 * String samplePolicyText;
 * ManagedRule.Builder.create(this, "ManagedRule")
 * .identifier(ManagedRuleIdentifiers.API_GW_XRAY_ENABLED)
 * .evaluationModes(EvaluationMode.DETECTIVE_AND_PROACTIVE)
 * .build();
 * CustomRule.Builder.create(this, "CustomRule")
 * .lambdaFunction(fn)
 * .evaluationModes(EvaluationMode.PROACTIVE)
 * .build();
 * CustomPolicy.Builder.create(this, "CustomPolicy")
 * .policyText(samplePolicyText)
 * .evaluationModes(EvaluationMode.DETECTIVE)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
 */
public open class ManagedRuleIdentifiers(
  cdkObject: software.amazon.awscdk.services.config.ManagedRuleIdentifiers,
) : CdkObject(cdkObject) {
  public companion object {
    public val ACCESS_KEYS_ROTATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ACCESS_KEYS_ROTATED

    public val ACCOUNT_PART_OF_ORGANIZATIONS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ACCOUNT_PART_OF_ORGANIZATIONS

    public val ACM_CERTIFICATE_EXPIRATION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ACM_CERTIFICATE_EXPIRATION_CHECK

    public val ALB_DESYNC_MODE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ALB_DESYNC_MODE_CHECK

    public val ALB_HTTP_DROP_INVALID_HEADER_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ALB_HTTP_DROP_INVALID_HEADER_ENABLED

    public val ALB_HTTP_TO_HTTPS_REDIRECTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ALB_HTTP_TO_HTTPS_REDIRECTION_CHECK

    public val ALB_WAF_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ALB_WAF_ENABLED

    public val API_GW_ASSOCIATED_WITH_WAF: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GW_ASSOCIATED_WITH_WAF

    public val API_GW_CACHE_ENABLED_AND_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GW_CACHE_ENABLED_AND_ENCRYPTED

    public val API_GW_ENDPOINT_TYPE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GW_ENDPOINT_TYPE_CHECK

    public val API_GW_EXECUTION_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GW_EXECUTION_LOGGING_ENABLED

    public val API_GW_SSL_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GW_SSL_ENABLED

    public val API_GW_XRAY_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GW_XRAY_ENABLED

    public val API_GWV2_ACCESS_LOGS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GWV2_ACCESS_LOGS_ENABLED

    public val API_GWV2_AUTHORIZATION_TYPE_CONFIGURED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.API_GWV2_AUTHORIZATION_TYPE_CONFIGURED

    public val APPROVED_AMIS_BY_ID: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.APPROVED_AMIS_BY_ID

    public val APPROVED_AMIS_BY_TAG: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.APPROVED_AMIS_BY_TAG

    public val AURORA_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AURORA_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val AURORA_MYSQL_BACKTRACKING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AURORA_MYSQL_BACKTRACKING_ENABLED

    public val AURORA_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AURORA_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val AUTOSCALING_CAPACITY_REBALANCING: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_CAPACITY_REBALANCING

    public val AUTOSCALING_GROUP_ELB_HEALTHCHECK_REQUIRED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_GROUP_ELB_HEALTHCHECK_REQUIRED

    public val AUTOSCALING_LAUNCH_CONFIG_HOP_LIMIT: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_LAUNCH_CONFIG_HOP_LIMIT

    public val AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED

    public val AUTOSCALING_LAUNCH_TEMPLATE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_LAUNCH_TEMPLATE

    public val AUTOSCALING_LAUNCHCONFIG_REQUIRES_IMDSV2: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_LAUNCHCONFIG_REQUIRES_IMDSV2

    public val AUTOSCALING_MULTIPLE_AZ: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_MULTIPLE_AZ

    public val AUTOSCALING_MULTIPLE_INSTANCE_TYPES: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.AUTOSCALING_MULTIPLE_INSTANCE_TYPES

    public val BACKUP_PLAN_MIN_FREQUENCY_AND_MIN_RETENTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.BACKUP_PLAN_MIN_FREQUENCY_AND_MIN_RETENTION_CHECK

    public val BACKUP_RECOVERY_POINT_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.BACKUP_RECOVERY_POINT_ENCRYPTED

    public val BACKUP_RECOVERY_POINT_MANUAL_DELETION_DISABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.BACKUP_RECOVERY_POINT_MANUAL_DELETION_DISABLED

    public val BACKUP_RECOVERY_POINT_MINIMUM_RETENTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.BACKUP_RECOVERY_POINT_MINIMUM_RETENTION_CHECK

    public val BEANSTALK_ENHANCED_HEALTH_REPORTING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.BEANSTALK_ENHANCED_HEALTH_REPORTING_ENABLED

    public val CLB_DESYNC_MODE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLB_DESYNC_MODE_CHECK

    public val CLB_MULTIPLE_AZ: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLB_MULTIPLE_AZ

    public val CLOUD_TRAIL_CLOUD_WATCH_LOGS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUD_TRAIL_CLOUD_WATCH_LOGS_ENABLED

    public val CLOUD_TRAIL_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUD_TRAIL_ENABLED

    public val CLOUD_TRAIL_ENCRYPTION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUD_TRAIL_ENCRYPTION_ENABLED

    public val CLOUD_TRAIL_LOG_FILE_VALIDATION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUD_TRAIL_LOG_FILE_VALIDATION_ENABLED

    public val CLOUDFORMATION_STACK_DRIFT_DETECTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFORMATION_STACK_DRIFT_DETECTION_CHECK

    public val CLOUDFORMATION_STACK_NOTIFICATION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFORMATION_STACK_NOTIFICATION_CHECK

    public val CLOUDFRONT_ACCESSLOGS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_ACCESSLOGS_ENABLED

    public val CLOUDFRONT_ASSOCIATED_WITH_WAF: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_ASSOCIATED_WITH_WAF

    public val CLOUDFRONT_CUSTOM_SSL_CERTIFICATE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_CUSTOM_SSL_CERTIFICATE

    public val CLOUDFRONT_DEFAULT_ROOT_OBJECT_CONFIGURED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_DEFAULT_ROOT_OBJECT_CONFIGURED

    public val CLOUDFRONT_NO_DEPRECATED_SSL_PROTOCOLS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_NO_DEPRECATED_SSL_PROTOCOLS

    public val CLOUDFRONT_ORIGIN_ACCESS_IDENTITY_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_ORIGIN_ACCESS_IDENTITY_ENABLED

    public val CLOUDFRONT_ORIGIN_FAILOVER_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_ORIGIN_FAILOVER_ENABLED

    public val CLOUDFRONT_SECURITY_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_SECURITY_POLICY_CHECK

    public val CLOUDFRONT_SNI_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_SNI_ENABLED

    public val CLOUDFRONT_TRAFFIC_TO_ORIGIN_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_TRAFFIC_TO_ORIGIN_ENCRYPTED

    public val CLOUDFRONT_VIEWER_POLICY_HTTPS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDFRONT_VIEWER_POLICY_HTTPS

    public val CLOUDTRAIL_MULTI_REGION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDTRAIL_MULTI_REGION_ENABLED

    public val CLOUDTRAIL_S3_DATAEVENTS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDTRAIL_S3_DATAEVENTS_ENABLED

    public val CLOUDTRAIL_SECURITY_TRAIL_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDTRAIL_SECURITY_TRAIL_ENABLED

    public val CLOUDWATCH_ALARM_ACTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDWATCH_ALARM_ACTION_CHECK

    public val CLOUDWATCH_ALARM_ACTION_ENABLED_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDWATCH_ALARM_ACTION_ENABLED_CHECK

    public val CLOUDWATCH_ALARM_RESOURCE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDWATCH_ALARM_RESOURCE_CHECK

    public val CLOUDWATCH_ALARM_SETTINGS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDWATCH_ALARM_SETTINGS_CHECK

    public val CLOUDWATCH_LOG_GROUP_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CLOUDWATCH_LOG_GROUP_ENCRYPTED

    public val CMK_BACKING_KEY_ROTATION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CMK_BACKING_KEY_ROTATION_ENABLED

    public val CODEBUILD_PROJECT_ARTIFACT_ENCRYPTION: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEBUILD_PROJECT_ARTIFACT_ENCRYPTION

    public val CODEBUILD_PROJECT_ENVIRONMENT_PRIVILEGED_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEBUILD_PROJECT_ENVIRONMENT_PRIVILEGED_CHECK

    public val CODEBUILD_PROJECT_ENVVAR_AWSCRED_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEBUILD_PROJECT_ENVVAR_AWSCRED_CHECK

    public val CODEBUILD_PROJECT_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEBUILD_PROJECT_LOGGING_ENABLED

    public val CODEBUILD_PROJECT_S3_LOGS_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEBUILD_PROJECT_S3_LOGS_ENCRYPTED

    public val CODEBUILD_PROJECT_SOURCE_REPO_URL_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEBUILD_PROJECT_SOURCE_REPO_URL_CHECK

    public val CODEDEPLOY_AUTO_ROLLBACK_MONITOR_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEDEPLOY_AUTO_ROLLBACK_MONITOR_ENABLED

    public val CODEDEPLOY_EC2_MINIMUM_HEALTHY_HOSTS_CONFIGURED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEDEPLOY_EC2_MINIMUM_HEALTHY_HOSTS_CONFIGURED

    public val CODEDEPLOY_LAMBDA_ALLATONCE_TRAFFIC_SHIFT_DISABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEDEPLOY_LAMBDA_ALLATONCE_TRAFFIC_SHIFT_DISABLED

    public val CODEPIPELINE_DEPLOYMENT_COUNT_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEPIPELINE_DEPLOYMENT_COUNT_CHECK

    public val CODEPIPELINE_REGION_FANOUT_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CODEPIPELINE_REGION_FANOUT_CHECK

    public val CW_LOGGROUP_RETENTION_PERIOD_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.CW_LOGGROUP_RETENTION_PERIOD_CHECK

    public val DAX_ENCRYPTION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DAX_ENCRYPTION_ENABLED

    public val DMS_REPLICATION_NOT_PUBLIC: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DMS_REPLICATION_NOT_PUBLIC

    public val DYNAMODB_AUTOSCALING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_AUTOSCALING_ENABLED

    public val DYNAMODB_IN_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_IN_BACKUP_PLAN

    public val DYNAMODB_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val DYNAMODB_PITR_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_PITR_ENABLED

    public val DYNAMODB_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val DYNAMODB_TABLE_ENCRYPTED_KMS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_TABLE_ENCRYPTED_KMS

    public val DYNAMODB_TABLE_ENCRYPTION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_TABLE_ENCRYPTION_ENABLED

    public val DYNAMODB_THROUGHPUT_LIMIT_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.DYNAMODB_THROUGHPUT_LIMIT_CHECK

    public val EBS_ENCRYPTED_VOLUMES: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EBS_ENCRYPTED_VOLUMES

    public val EBS_IN_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EBS_IN_BACKUP_PLAN

    public val EBS_OPTIMIZED_INSTANCE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EBS_OPTIMIZED_INSTANCE

    public val EBS_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EBS_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val EBS_SNAPSHOT_PUBLIC_RESTORABLE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EBS_SNAPSHOT_PUBLIC_RESTORABLE_CHECK

    public val EC2_DESIRED_INSTANCE_TENANCY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_DESIRED_INSTANCE_TENANCY

    public val EC2_DESIRED_INSTANCE_TYPE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_DESIRED_INSTANCE_TYPE

    public val EC2_EBS_ENCRYPTION_BY_DEFAULT: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_EBS_ENCRYPTION_BY_DEFAULT

    public val EC2_IMDSV2_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_IMDSV2_CHECK

    public val EC2_INSTANCE_DETAILED_MONITORING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_INSTANCE_DETAILED_MONITORING_ENABLED

    public val EC2_INSTANCE_MANAGED_BY_SSM: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_INSTANCE_MANAGED_BY_SSM

    public val EC2_INSTANCE_MULTIPLE_ENI_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_INSTANCE_MULTIPLE_ENI_CHECK

    public val EC2_INSTANCE_NO_PUBLIC_IP: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_INSTANCE_NO_PUBLIC_IP

    public val EC2_INSTANCE_PROFILE_ATTACHED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_INSTANCE_PROFILE_ATTACHED

    public val EC2_INSTANCES_IN_VPC: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_INSTANCES_IN_VPC

    public val EC2_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val EC2_MANAGED_INSTANCE_APPLICATIONS_BLOCKED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_MANAGED_INSTANCE_APPLICATIONS_BLOCKED

    public val EC2_MANAGED_INSTANCE_APPLICATIONS_REQUIRED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_MANAGED_INSTANCE_APPLICATIONS_REQUIRED

    public val EC2_MANAGED_INSTANCE_ASSOCIATION_COMPLIANCE_STATUS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_MANAGED_INSTANCE_ASSOCIATION_COMPLIANCE_STATUS_CHECK

    public val EC2_MANAGED_INSTANCE_INVENTORY_BLOCKED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_MANAGED_INSTANCE_INVENTORY_BLOCKED

    public val EC2_MANAGED_INSTANCE_PATCH_COMPLIANCE_STATUS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_MANAGED_INSTANCE_PATCH_COMPLIANCE_STATUS_CHECK

    public val EC2_MANAGED_INSTANCE_PLATFORM_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_MANAGED_INSTANCE_PLATFORM_CHECK

    public val EC2_NO_AMAZON_KEY_PAIR: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_NO_AMAZON_KEY_PAIR

    public val EC2_PARAVIRTUAL_INSTANCE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_PARAVIRTUAL_INSTANCE_CHECK

    public val EC2_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val EC2_SECURITY_GROUP_ATTACHED_TO_ENI: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_SECURITY_GROUP_ATTACHED_TO_ENI

    public val EC2_SECURITY_GROUP_ATTACHED_TO_ENI_PERIODIC: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_SECURITY_GROUP_ATTACHED_TO_ENI_PERIODIC

    public val EC2_SECURITY_GROUPS_INCOMING_SSH_DISABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_SECURITY_GROUPS_INCOMING_SSH_DISABLED

    public val EC2_SECURITY_GROUPS_RESTRICTED_INCOMING_TRAFFIC: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_SECURITY_GROUPS_RESTRICTED_INCOMING_TRAFFIC

    public val EC2_STOPPED_INSTANCE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_STOPPED_INSTANCE

    public val EC2_TOKEN_HOP_LIMIT_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_TOKEN_HOP_LIMIT_CHECK

    public val EC2_TRANSIT_GATEWAY_AUTO_VPC_ATTACH_DISABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_TRANSIT_GATEWAY_AUTO_VPC_ATTACH_DISABLED

    public val EC2_VOLUME_IECS_TASK_DEFINITION_USER_FOR_HOST_MODE_CHECKNUSE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_VOLUME_IECS_TASK_DEFINITION_USER_FOR_HOST_MODE_CHECKNUSE_CHECK

    public val EC2_VOLUME_INUSE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EC2_VOLUME_INUSE_CHECK

    public val ECR_PRIVATE_IMAGE_SCANNING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECR_PRIVATE_IMAGE_SCANNING_ENABLED

    public val ECR_PRIVATE_LIFECYCLE_POLICY_CONFIGURED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECR_PRIVATE_LIFECYCLE_POLICY_CONFIGURED

    public val ECR_PRIVATE_TAG_IMMUTABILITY_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECR_PRIVATE_TAG_IMMUTABILITY_ENABLED

    public val ECS_AWSVPC_NETWORKING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_AWSVPC_NETWORKING_ENABLED

    public val ECS_CONTAINER_INSIGHTS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_CONTAINER_INSIGHTS_ENABLED

    public val ECS_CONTAINERS_NONPRIVILEGED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_CONTAINERS_NONPRIVILEGED

    public val ECS_CONTAINERS_READONLY_ACCESS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_CONTAINERS_READONLY_ACCESS

    public val ECS_FARGATE_LATEST_PLATFORM_VERSION: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_FARGATE_LATEST_PLATFORM_VERSION

    public val ECS_NO_ENVIRONMENT_SECRETS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_NO_ENVIRONMENT_SECRETS

    public val ECS_TASK_DEFINITION_LOG_CONFIGURATION: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_TASK_DEFINITION_LOG_CONFIGURATION

    public val ECS_TASK_DEFINITION_MEMORY_HARD_LIMIT: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_TASK_DEFINITION_MEMORY_HARD_LIMIT

    public val ECS_TASK_DEFINITION_NONROOT_USER: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_TASK_DEFINITION_NONROOT_USER

    public val ECS_TASK_DEFINITION_PID_MODE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ECS_TASK_DEFINITION_PID_MODE_CHECK

    public val EFS_ACCESS_POINT_ENFORCE_ROOT_DIRECTORY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EFS_ACCESS_POINT_ENFORCE_ROOT_DIRECTORY

    public val EFS_ACCESS_POINT_ENFORCE_USER_IDENTITY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EFS_ACCESS_POINT_ENFORCE_USER_IDENTITY

    public val EFS_ENCRYPTED_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EFS_ENCRYPTED_CHECK

    public val EFS_IN_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EFS_IN_BACKUP_PLAN

    public val EFS_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EFS_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val EFS_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EFS_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val EIP_ATTACHED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EIP_ATTACHED

    public val EKS_CLUSTER_OLDEST_SUPPORTED_VERSION: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EKS_CLUSTER_OLDEST_SUPPORTED_VERSION

    public val EKS_CLUSTER_SUPPORTED_VERSION: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EKS_CLUSTER_SUPPORTED_VERSION

    public val EKS_ENDPOINT_NO_PUBLIC_ACCESS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EKS_ENDPOINT_NO_PUBLIC_ACCESS

    public val EKS_SECRETS_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EKS_SECRETS_ENCRYPTED

    public val ELASTIC_BEANSTALK_MANAGED_UPDATES_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELASTIC_BEANSTALK_MANAGED_UPDATES_ENABLED

    public val ELASTICACHE_REDIS_CLUSTER_AUTOMATIC_BACKUP_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELASTICACHE_REDIS_CLUSTER_AUTOMATIC_BACKUP_CHECK

    public val ELASTICSEARCH_ENCRYPTED_AT_REST: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELASTICSEARCH_ENCRYPTED_AT_REST

    public val ELASTICSEARCH_IN_VPC_ONLY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELASTICSEARCH_IN_VPC_ONLY

    public val ELASTICSEARCH_NODE_TO_NODE_ENCRYPTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELASTICSEARCH_NODE_TO_NODE_ENCRYPTION_CHECK

    public val ELB_ACM_CERTIFICATE_REQUIRED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELB_ACM_CERTIFICATE_REQUIRED

    public val ELB_CROSS_ZONE_LOAD_BALANCING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELB_CROSS_ZONE_LOAD_BALANCING_ENABLED

    public val ELB_CUSTOM_SECURITY_POLICY_SSL_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELB_CUSTOM_SECURITY_POLICY_SSL_CHECK

    public val ELB_DELETION_PROTECTION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELB_DELETION_PROTECTION_ENABLED

    public val ELB_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELB_LOGGING_ENABLED

    public val ELB_PREDEFINED_SECURITY_POLICY_SSL_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELB_PREDEFINED_SECURITY_POLICY_SSL_CHECK

    public val ELB_TLS_HTTPS_LISTENERS_ONLY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELB_TLS_HTTPS_LISTENERS_ONLY

    public val ELBV2_ACM_CERTIFICATE_REQUIRED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELBV2_ACM_CERTIFICATE_REQUIRED

    public val ELBV2_MULTIPLE_AZ: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ELBV2_MULTIPLE_AZ

    public val EMR_KERBEROS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EMR_KERBEROS_ENABLED

    public val EMR_MASTER_NO_PUBLIC_IP: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.EMR_MASTER_NO_PUBLIC_IP

    public val FMS_SECURITY_GROUP_AUDIT_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FMS_SECURITY_GROUP_AUDIT_POLICY_CHECK

    public val FMS_SECURITY_GROUP_CONTENT_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FMS_SECURITY_GROUP_CONTENT_CHECK

    public val FMS_SECURITY_GROUP_RESOURCE_ASSOCIATION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FMS_SECURITY_GROUP_RESOURCE_ASSOCIATION_CHECK

    public val FMS_SHIELD_RESOURCE_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FMS_SHIELD_RESOURCE_POLICY_CHECK

    public val FMS_WEBACL_RESOURCE_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FMS_WEBACL_RESOURCE_POLICY_CHECK

    public val FMS_WEBACL_RULEGROUP_ASSOCIATION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FMS_WEBACL_RULEGROUP_ASSOCIATION_CHECK

    public val FSX_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FSX_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val FSX_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.FSX_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val GUARDDUTY_ENABLED_CENTRALIZED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.GUARDDUTY_ENABLED_CENTRALIZED

    public val GUARDDUTY_NON_ARCHIVED_FINDINGS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.GUARDDUTY_NON_ARCHIVED_FINDINGS

    public val IAM_CUSTOMER_POLICY_BLOCKED_KMS_ACTIONS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_CUSTOMER_POLICY_BLOCKED_KMS_ACTIONS

    public val IAM_GROUP_HAS_USERS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_GROUP_HAS_USERS_CHECK

    public val IAM_INLINE_POLICY_BLOCKED_KMS_ACTIONS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_INLINE_POLICY_BLOCKED_KMS_ACTIONS

    public val IAM_NO_INLINE_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_NO_INLINE_POLICY_CHECK

    public val IAM_PASSWORD_POLICY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_PASSWORD_POLICY

    public val IAM_POLICY_BLOCKED_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_POLICY_BLOCKED_CHECK

    public val IAM_POLICY_IN_USE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_POLICY_IN_USE

    public val IAM_POLICY_NO_STATEMENTS_WITH_ADMIN_ACCESS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_POLICY_NO_STATEMENTS_WITH_ADMIN_ACCESS

    public val IAM_POLICY_NO_STATEMENTS_WITH_FULL_ACCESS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_POLICY_NO_STATEMENTS_WITH_FULL_ACCESS

    public val IAM_ROLE_MANAGED_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_ROLE_MANAGED_POLICY_CHECK

    public val IAM_ROOT_ACCESS_KEY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_ROOT_ACCESS_KEY_CHECK

    public val IAM_USER_GROUP_MEMBERSHIP_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_USER_GROUP_MEMBERSHIP_CHECK

    public val IAM_USER_MFA_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_USER_MFA_ENABLED

    public val IAM_USER_NO_POLICIES_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_USER_NO_POLICIES_CHECK

    public val IAM_USER_UNUSED_CREDENTIALS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.IAM_USER_UNUSED_CREDENTIALS_CHECK

    public val INTERNET_GATEWAY_AUTHORIZED_VPC_ONLY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.INTERNET_GATEWAY_AUTHORIZED_VPC_ONLY

    public val KINESIS_STREAM_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.KINESIS_STREAM_ENCRYPTED

    public val KMS_CMK_NOT_SCHEDULED_FOR_DELETION: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.KMS_CMK_NOT_SCHEDULED_FOR_DELETION

    public val LAMBDA_CONCURRENCY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.LAMBDA_CONCURRENCY_CHECK

    public val LAMBDA_DLQ_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.LAMBDA_DLQ_CHECK

    public val LAMBDA_FUNCTION_PUBLIC_ACCESS_PROHIBITED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.LAMBDA_FUNCTION_PUBLIC_ACCESS_PROHIBITED

    public val LAMBDA_FUNCTION_SETTINGS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.LAMBDA_FUNCTION_SETTINGS_CHECK

    public val LAMBDA_INSIDE_VPC: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.LAMBDA_INSIDE_VPC

    public val LAMBDA_VPC_MULTI_AZ_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.LAMBDA_VPC_MULTI_AZ_CHECK

    public val MFA_ENABLED_FOR_IAM_CONSOLE_ACCESS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.MFA_ENABLED_FOR_IAM_CONSOLE_ACCESS

    public val NACL_NO_UNRESTRICTED_SSH_RDP: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.NACL_NO_UNRESTRICTED_SSH_RDP

    public val NETFW_POLICY_DEFAULT_ACTION_FRAGMENT_PACKETS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.NETFW_POLICY_DEFAULT_ACTION_FRAGMENT_PACKETS

    public val NETFW_POLICY_DEFAULT_ACTION_FULL_PACKETS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.NETFW_POLICY_DEFAULT_ACTION_FULL_PACKETS

    public val NETFW_POLICY_RULE_GROUP_ASSOCIATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.NETFW_POLICY_RULE_GROUP_ASSOCIATED

    public val NETFW_STATELESS_RULE_GROUP_NOT_EMPTY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.NETFW_STATELESS_RULE_GROUP_NOT_EMPTY

    public val NLB_CROSS_ZONE_LOAD_BALANCING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.NLB_CROSS_ZONE_LOAD_BALANCING_ENABLED

    public val OPENSEARCH_ACCESS_CONTROL_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_ACCESS_CONTROL_ENABLED

    public val OPENSEARCH_AUDIT_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_AUDIT_LOGGING_ENABLED

    public val OPENSEARCH_DATA_NODE_FAULT_TOLERANCE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_DATA_NODE_FAULT_TOLERANCE

    public val OPENSEARCH_ENCRYPTED_AT_REST: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_ENCRYPTED_AT_REST

    public val OPENSEARCH_HTTPS_REQUIRED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_HTTPS_REQUIRED

    public val OPENSEARCH_IN_VPC_ONLY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_IN_VPC_ONLY

    public val OPENSEARCH_LOGS_TO_CLOUDWATCH: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_LOGS_TO_CLOUDWATCH

    public val OPENSEARCH_NODE_TO_NODE_ENCRYPTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.OPENSEARCH_NODE_TO_NODE_ENCRYPTION_CHECK

    public val RDS_AUTOMATIC_MINOR_VERSION_UPGRADE_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_AUTOMATIC_MINOR_VERSION_UPGRADE_ENABLED

    public val RDS_CLUSTER_DEFAULT_ADMIN_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_CLUSTER_DEFAULT_ADMIN_CHECK

    public val RDS_CLUSTER_DELETION_PROTECTION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_CLUSTER_DELETION_PROTECTION_ENABLED

    public val RDS_CLUSTER_IAM_AUTHENTICATION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_CLUSTER_IAM_AUTHENTICATION_ENABLED

    public val RDS_CLUSTER_MULTI_AZ_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_CLUSTER_MULTI_AZ_ENABLED

    public val RDS_DB_INSTANCE_BACKUP_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_DB_INSTANCE_BACKUP_ENABLED

    public val RDS_DB_SECURITY_GROUP_NOT_ALLOWED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_DB_SECURITY_GROUP_NOT_ALLOWED

    public val RDS_ENHANCED_MONITORING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_ENHANCED_MONITORING_ENABLED

    public val RDS_IN_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_IN_BACKUP_PLAN

    public val RDS_INSTANCE_DEFAULT_ADMIN_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_INSTANCE_DEFAULT_ADMIN_CHECK

    public val RDS_INSTANCE_DELETION_PROTECTION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_INSTANCE_DELETION_PROTECTION_ENABLED

    public val RDS_INSTANCE_IAM_AUTHENTICATION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_INSTANCE_IAM_AUTHENTICATION_ENABLED

    public val RDS_INSTANCE_PUBLIC_ACCESS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_INSTANCE_PUBLIC_ACCESS_CHECK

    public val RDS_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val RDS_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_LOGGING_ENABLED

    public val RDS_MULTI_AZ_SUPPORT: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_MULTI_AZ_SUPPORT

    public val RDS_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val RDS_SNAPSHOT_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_SNAPSHOT_ENCRYPTED

    public val RDS_SNAPSHOTS_PUBLIC_PROHIBITED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_SNAPSHOTS_PUBLIC_PROHIBITED

    public val RDS_STORAGE_ENCRYPTED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.RDS_STORAGE_ENCRYPTED

    public val REDSHIFT_AUDIT_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_AUDIT_LOGGING_ENABLED

    public val REDSHIFT_BACKUP_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_BACKUP_ENABLED

    public val REDSHIFT_CLUSTER_CONFIGURATION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_CLUSTER_CONFIGURATION_CHECK

    public val REDSHIFT_CLUSTER_KMS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_CLUSTER_KMS_ENABLED

    public val REDSHIFT_CLUSTER_MAINTENANCE_SETTINGS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_CLUSTER_MAINTENANCE_SETTINGS_CHECK

    public val REDSHIFT_CLUSTER_PUBLIC_ACCESS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_CLUSTER_PUBLIC_ACCESS_CHECK

    public val REDSHIFT_DEFAULT_ADMIN_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_DEFAULT_ADMIN_CHECK

    public val REDSHIFT_DEFAULT_DB_NAME_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_DEFAULT_DB_NAME_CHECK

    public val REDSHIFT_ENHANCED_VPC_ROUTING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_ENHANCED_VPC_ROUTING_ENABLED

    public val REDSHIFT_REQUIRE_TLS_SSL: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REDSHIFT_REQUIRE_TLS_SSL

    public val REQUIRED_TAGS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.REQUIRED_TAGS

    public val ROOT_ACCOUNT_HARDWARE_MFA_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ROOT_ACCOUNT_HARDWARE_MFA_ENABLED

    public val ROOT_ACCOUNT_MFA_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.ROOT_ACCOUNT_MFA_ENABLED

    public val S3_ACCOUNT_LEVEL_PUBLIC_ACCESS_BLOCKS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_ACCOUNT_LEVEL_PUBLIC_ACCESS_BLOCKS

    public val S3_ACCOUNT_LEVEL_PUBLIC_ACCESS_BLOCKS_PERIODIC: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_ACCOUNT_LEVEL_PUBLIC_ACCESS_BLOCKS_PERIODIC

    public val S3_BUCKET_ACL_PROHIBITED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_ACL_PROHIBITED

    public val S3_BUCKET_BLOCKED_ACTIONS_PROHIBITED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_BLOCKED_ACTIONS_PROHIBITED

    public val S3_BUCKET_DEFAULT_LOCK_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_DEFAULT_LOCK_ENABLED

    public val S3_BUCKET_LEVEL_PUBLIC_ACCESS_PROHIBITED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_LEVEL_PUBLIC_ACCESS_PROHIBITED

    public val S3_BUCKET_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_LOGGING_ENABLED

    public val S3_BUCKET_POLICY_GRANTEE_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_POLICY_GRANTEE_CHECK

    public val S3_BUCKET_POLICY_NOT_MORE_PERMISSIVE: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_POLICY_NOT_MORE_PERMISSIVE

    public val S3_BUCKET_PUBLIC_READ_PROHIBITED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_PUBLIC_READ_PROHIBITED

    public val S3_BUCKET_PUBLIC_WRITE_PROHIBITED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_PUBLIC_WRITE_PROHIBITED

    public val S3_BUCKET_REPLICATION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_REPLICATION_ENABLED

    public val S3_BUCKET_SERVER_SIDE_ENCRYPTION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_SERVER_SIDE_ENCRYPTION_ENABLED

    public val S3_BUCKET_SSL_REQUESTS_ONLY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_SSL_REQUESTS_ONLY

    public val S3_BUCKET_VERSIONING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_BUCKET_VERSIONING_ENABLED

    public val S3_DEFAULT_ENCRYPTION_KMS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_DEFAULT_ENCRYPTION_KMS

    public val S3_EVENT_NOTIFICATIONS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_EVENT_NOTIFICATIONS_ENABLED

    public val S3_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val S3_LIFECYCLE_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_LIFECYCLE_POLICY_CHECK

    public val S3_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val S3_VERSION_LIFECYCLE_POLICY_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.S3_VERSION_LIFECYCLE_POLICY_CHECK

    public val SAGEMAKER_ENDPOINT_CONFIGURATION_KMS_KEY_CONFIGURED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SAGEMAKER_ENDPOINT_CONFIGURATION_KMS_KEY_CONFIGURED

    public val SAGEMAKER_NOTEBOOK_INSTANCE_KMS_KEY_CONFIGURED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SAGEMAKER_NOTEBOOK_INSTANCE_KMS_KEY_CONFIGURED

    public val SAGEMAKER_NOTEBOOK_NO_DIRECT_INTERNET_ACCESS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SAGEMAKER_NOTEBOOK_NO_DIRECT_INTERNET_ACCESS

    public val SECRETSMANAGER_ROTATION_ENABLED_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SECRETSMANAGER_ROTATION_ENABLED_CHECK

    public val SECRETSMANAGER_SCHEDULED_ROTATION_SUCCESS_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SECRETSMANAGER_SCHEDULED_ROTATION_SUCCESS_CHECK

    public val SECRETSMANAGER_SECRET_PERIODIC_ROTATION: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SECRETSMANAGER_SECRET_PERIODIC_ROTATION

    public val SECRETSMANAGER_SECRET_UNUSED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SECRETSMANAGER_SECRET_UNUSED

    public val SECRETSMANAGER_USING_CMK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SECRETSMANAGER_USING_CMK

    public val SECURITYHUB_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SECURITYHUB_ENABLED

    public val SERVICE_VPC_ENDPOINT_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SERVICE_VPC_ENDPOINT_ENABLED

    public val SHIELD_ADVANCED_ENABLED_AUTO_RENEW: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SHIELD_ADVANCED_ENABLED_AUTO_RENEW

    public val SHIELD_DRT_ACCESS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SHIELD_DRT_ACCESS

    public val SNS_ENCRYPTED_KMS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SNS_ENCRYPTED_KMS

    public val SNS_TOPIC_MESSAGE_DELIVERY_NOTIFICATION_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SNS_TOPIC_MESSAGE_DELIVERY_NOTIFICATION_ENABLED

    public val SSM_DOCUMENT_NOT_PUBLIC: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SSM_DOCUMENT_NOT_PUBLIC

    public val STORAGEGATEWAY_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.STORAGEGATEWAY_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val SUBNET_AUTO_ASSIGN_PUBLIC_IP_DISABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.SUBNET_AUTO_ASSIGN_PUBLIC_IP_DISABLED

    public val VIRTUALMACHINE_LAST_BACKUP_RECOVERY_POINT_CREATED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VIRTUALMACHINE_LAST_BACKUP_RECOVERY_POINT_CREATED

    public val VIRTUALMACHINE_RESOURCES_PROTECTED_BY_BACKUP_PLAN: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VIRTUALMACHINE_RESOURCES_PROTECTED_BY_BACKUP_PLAN

    public val VPC_DEFAULT_SECURITY_GROUP_CLOSED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VPC_DEFAULT_SECURITY_GROUP_CLOSED

    public val VPC_FLOW_LOGS_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VPC_FLOW_LOGS_ENABLED

    public val VPC_NETWORK_ACL_UNUSED_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VPC_NETWORK_ACL_UNUSED_CHECK

    public val VPC_PEERING_DNS_RESOLUTION_CHECK: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VPC_PEERING_DNS_RESOLUTION_CHECK

    public val VPC_SG_OPEN_ONLY_TO_AUTHORIZED_PORTS: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VPC_SG_OPEN_ONLY_TO_AUTHORIZED_PORTS

    public val VPC_VPN_2_TUNNELS_UP: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.VPC_VPN_2_TUNNELS_UP

    public val WAF_CLASSIC_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAF_CLASSIC_LOGGING_ENABLED

    public val WAF_GLOBAL_RULE_NOT_EMPTY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAF_GLOBAL_RULE_NOT_EMPTY

    public val WAF_GLOBAL_RULEGROUP_NOT_EMPTY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAF_GLOBAL_RULEGROUP_NOT_EMPTY

    public val WAF_GLOBAL_WEBACL_NOT_EMPTY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAF_GLOBAL_WEBACL_NOT_EMPTY

    public val WAF_REGIONAL_RULE_NOT_EMPTY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAF_REGIONAL_RULE_NOT_EMPTY

    public val WAF_REGIONAL_RULEGROUP_NOT_EMPTY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAF_REGIONAL_RULEGROUP_NOT_EMPTY

    public val WAF_REGIONAL_WEBACL_NOT_EMPTY: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAF_REGIONAL_WEBACL_NOT_EMPTY

    public val WAFV2_LOGGING_ENABLED: String =
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers.WAFV2_LOGGING_ENABLED

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.ManagedRuleIdentifiers):
        ManagedRuleIdentifiers = ManagedRuleIdentifiers(cdkObject)

    internal fun unwrap(wrapped: ManagedRuleIdentifiers):
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers = wrapped.cdkObject as
        software.amazon.awscdk.services.config.ManagedRuleIdentifiers
  }
}
