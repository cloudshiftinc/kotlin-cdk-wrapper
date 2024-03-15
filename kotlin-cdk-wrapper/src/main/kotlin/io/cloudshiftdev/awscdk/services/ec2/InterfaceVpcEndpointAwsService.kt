@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * An AWS service for an interface VPC endpoint.
 *
 * Example:
 *
 * ```
 * // Add gateway endpoints when creating the VPC
 * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
 * .gatewayEndpoints(Map.of(
 * "S3", GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.S3)
 * .build()))
 * .build();
 * // Alternatively gateway endpoints can be added on the VPC
 * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
 * GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.DYNAMODB)
 * .build());
 * // This allows to customize the endpoint policy
 * dynamoDbEndpoint.addToPolicy(
 * PolicyStatement.Builder.create() // Restrict to listing and describing tables
 * .principals(List.of(new AnyPrincipal()))
 * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
 * .resources(List.of("*")).build());
 * // Add an interface endpoint
 * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
 * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
 * .build());
 * ```
 */
public open class InterfaceVpcEndpointAwsService internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService,
) : CdkObject(cdkObject), IInterfaceVpcEndpointService {
  public constructor(
    name: String,
    prefix: String,
    port: Number,
  ) : this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService(name, prefix, port))

  public constructor(name: String, prefix: String) :
      this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService(name, prefix))

  public constructor(name: String) :
      this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService(name))

  /**
   * The name of the service.
   *
   * e.g. com.amazonaws.us-east-1.ecs
   */
  public override fun name(): String = unwrap(this).getName()

  /**
   * The port of the service.
   */
  public override fun port(): Number = unwrap(this).getPort()

  /**
   * Whether Private DNS is supported by default.
   */
  public override fun privateDnsDefault(): Boolean? = unwrap(this).getPrivateDnsDefault()

  /**
   * The short name of the service.
   *
   * e.g. ecs
   */
  public open fun shortName(): String = unwrap(this).getShortName()

  public companion object {
    public val ACCESS_ANALYZER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ACCESS_ANALYZER)

    public val ACCOUNT_MANAGEMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ACCOUNT_MANAGEMENT)

    public val AIRFLOW_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_API)

    public val AIRFLOW_ENV: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_ENV)

    public val AIRFLOW_OPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_OPS)

    public val APIGATEWAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APIGATEWAY)

    public val APP_MESH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_MESH)

    public val APP_RUNNER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_RUNNER)

    public val APP_RUNNER_REQUESTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_RUNNER_REQUESTS)

    public val APP_SYNC: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_SYNC)

    public val APPLICATION_AUTOSCALING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPLICATION_AUTOSCALING)

    public val APPLICATION_MIGRATION_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPLICATION_MIGRATION_SERVICE)

    public val APPSTREAM_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPSTREAM_API)

    public val APPSTREAM_STREAMING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPSTREAM_STREAMING)

    public val ATHENA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ATHENA)

    public val AUDIT_MANAGER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AUDIT_MANAGER)

    public val AUTOSCALING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AUTOSCALING)

    public val AUTOSCALING_PLANS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AUTOSCALING_PLANS)

    public val BACKUP: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BACKUP)

    public val BACKUP_GATEWAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BACKUP_GATEWAY)

    public val BATCH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BATCH)

    public val BILLING_CONDUCTOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BILLING_CONDUCTOR)

    public val BRAKET: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BRAKET)

    public val CLOUD_CONTROL_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_CONTROL_API)

    public val CLOUD_CONTROL_API_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_CONTROL_API_FIPS)

    public val CLOUD_DIRECTORY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_DIRECTORY)

    public val CLOUDFORMATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDFORMATION)

    public val CLOUDHSM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDHSM)

    public val CLOUDTRAIL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDTRAIL)

    public val CLOUDWATCH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH)

    public val CLOUDWATCH_EVENTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_EVENTS)

    public val CLOUDWATCH_EVIDENTLY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_EVIDENTLY)

    public val CLOUDWATCH_EVIDENTLY_DATAPLANE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_EVIDENTLY_DATAPLANE)

    public val CLOUDWATCH_LOGS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_LOGS)

    public val CLOUDWATCH_MONITORING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_MONITORING)

    public val CLOUDWATCH_RUM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_RUM)

    public val CLOUDWATCH_RUM_DATAPLANE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_RUM_DATAPLANE)

    public val CLOUDWATCH_SYNTHETICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_SYNTHETICS)

    public val CODEARTIFACT_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEARTIFACT_API)

    public val CODEARTIFACT_REPOSITORIES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEARTIFACT_REPOSITORIES)

    public val CODEBUILD: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEBUILD)

    public val CODEBUILD_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEBUILD_FIPS)

    public val CODECOMMIT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODECOMMIT)

    public val CODECOMMIT_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODECOMMIT_FIPS)

    public val CODECOMMIT_GIT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODECOMMIT_GIT)

    public val CODECOMMIT_GIT_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODECOMMIT_GIT_FIPS)

    public val CODEDEPLOY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEDEPLOY)

    public val CODEDEPLOY_COMMANDS_SECURE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEDEPLOY_COMMANDS_SECURE)

    public val CODEGURU_PROFILER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEGURU_PROFILER)

    public val CODEGURU_REVIEWER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEGURU_REVIEWER)

    public val CODEPIPELINE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEPIPELINE)

    public val CODESTAR_CONNECTIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODESTAR_CONNECTIONS)

    public val COMPREHEND: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.COMPREHEND)

    public val COMPREHEND_MEDICAL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.COMPREHEND_MEDICAL)

    public val CONFIG: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONFIG)

    public val CONNECT_APP_INTEGRATIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONNECT_APP_INTEGRATIONS)

    public val CONNECT_CASES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONNECT_CASES)

    public val CONNECT_CONNECT_CAMPAIGNS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONNECT_CONNECT_CAMPAIGNS)

    public val CONNECT_PROFILE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONNECT_PROFILE)

    public val CONNECT_VOICEID: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONNECT_VOICEID)

    public val CONNECT_WISDOM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONNECT_WISDOM)

    public val DATA_EXCHANGE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATA_EXCHANGE)

    public val DATABASE_MIGRATION_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATABASE_MIGRATION_SERVICE)

    public val DATABASE_MIGRATION_SERVICE_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATABASE_MIGRATION_SERVICE_FIPS)

    public val DATASYNC: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATASYNC)

    public val DEVOPS_GURU: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DEVOPS_GURU)

    public val EBS_DIRECT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EBS_DIRECT)

    public val EC2: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EC2)

    public val EC2_MESSAGES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EC2_MESSAGES)

    public val ECR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ECR)

    public val ECR_DOCKER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ECR_DOCKER)

    public val ECS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ECS)

    public val ECS_AGENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ECS_AGENT)

    public val ECS_TELEMETRY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ECS_TELEMETRY)

    public val EKS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EKS)

    public val ELASTIC_BEANSTALK: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTIC_BEANSTALK)

    public val ELASTIC_BEANSTALK_HEALTH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTIC_BEANSTALK_HEALTH)

    public val ELASTIC_DISASTER_RECOVERY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTIC_DISASTER_RECOVERY)

    public val ELASTIC_FILESYSTEM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTIC_FILESYSTEM)

    public val ELASTIC_FILESYSTEM_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTIC_FILESYSTEM_FIPS)

    public val ELASTIC_INFERENCE_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTIC_INFERENCE_RUNTIME)

    public val ELASTIC_LOAD_BALANCING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTIC_LOAD_BALANCING)

    public val ELASTICACHE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTICACHE)

    public val ELASTICACHE_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELASTICACHE_FIPS)

    public val EMAIL_SMTP: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMAIL_SMTP)

    public val EMR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR)

    public val EMR_EKS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR_EKS)

    public val EMR_SERVERLESS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR_SERVERLESS)

    public val EVENTBRIDGE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EVENTBRIDGE)

    public val FAULT_INJECTION_SIMULATOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FAULT_INJECTION_SIMULATOR)

    public val FINSPACE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FINSPACE)

    public val FINSPACE_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FINSPACE_API)

    public val FORECAST: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FORECAST)

    public val FORECAST_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FORECAST_FIPS)

    public val FORECAST_QUERY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FORECAST_QUERY)

    public val FORECAST_QUERY_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FORECAST_QUERY_FIPS)

    public val FRAUD_DETECTOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FRAUD_DETECTOR)

    public val FSX: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FSX)

    public val FSX_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.FSX_FIPS)

    public val GLUE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GLUE)

    public val GLUE_DATABREW: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GLUE_DATABREW)

    public val GRAFANA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GRAFANA)

    public val GRAFANA_WORKSPACE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GRAFANA_WORKSPACE)

    public val GROUNDSTATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GROUNDSTATION)

    public val HEALTHLAKE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.HEALTHLAKE)

    public val IAM_IDENTITY_CENTER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IAM_IDENTITY_CENTER)

    public val IAM_ROLES_ANYWHERE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IAM_ROLES_ANYWHERE)

    public val IMAGE_BUILDER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IMAGE_BUILDER)

    public val INSPECTOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.INSPECTOR)

    public val IOT_CORE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE)

    public val IOT_CORE_DEVICE_ADVISOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE_DEVICE_ADVISOR)

    public val IOT_CORE_FOR_LORAWAN: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE_FOR_LORAWAN)

    public val IOT_GREENGRASS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_GREENGRASS)

    public val IOT_LORAWAN_CUPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_LORAWAN_CUPS)

    public val IOT_LORAWAN_LNS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_LORAWAN_LNS)

    public val IOT_ROBORUNNER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_ROBORUNNER)

    public val IOT_SITEWISE_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_SITEWISE_API)

    public val IOT_SITEWISE_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_SITEWISE_DATA)

    public val IOT_TWINMAKER_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_TWINMAKER_API)

    public val IOT_TWINMAKER_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_TWINMAKER_DATA)

    public val KENDRA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KENDRA)

    public val KENDRA_RANKING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KENDRA_RANKING)

    public val KEYSPACES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KEYSPACES)

    public val KEYSPACES_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KEYSPACES_FIPS)

    public val KINESIS_FIREHOSE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KINESIS_FIREHOSE)

    public val KINESIS_STREAMS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KINESIS_STREAMS)

    public val KMS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KMS)

    public val KMS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KMS_FIPS)

    public val LAKE_FORMATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LAKE_FORMATION)

    public val LAMBDA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LAMBDA)

    public val LEX_MODELS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LEX_MODELS)

    public val LEX_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LEX_RUNTIME)

    public val LICENSE_MANAGER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LICENSE_MANAGER)

    public val LICENSE_MANAGER_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LICENSE_MANAGER_FIPS)

    public val LOOKOUT_EQUIPMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOOKOUT_EQUIPMENT)

    public val LOOKOUT_METRICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOOKOUT_METRICS)

    public val LOOKOUT_VISION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOOKOUT_VISION)

    public val MACIE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MACIE)

    public val MAINFRAME_MODERNIZATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MAINFRAME_MODERNIZATION)

    public val MEMORY_DB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MEMORY_DB)

    public val MEMORY_DB_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MEMORY_DB_FIPS)

    public val MIGRATIONHUB_ORCHESTRATOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MIGRATIONHUB_ORCHESTRATOR)

    public val MIGRATIONHUB_REFACTOR_SPACES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MIGRATIONHUB_REFACTOR_SPACES)

    public val MIGRATIONHUB_STRATEGY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MIGRATIONHUB_STRATEGY)

    public val NIMBLE_STUDIO: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NIMBLE_STUDIO)

    public val OMICS_ANALYTICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.OMICS_ANALYTICS)

    public val OMICS_CONTROL_STORAGE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.OMICS_CONTROL_STORAGE)

    public val OMICS_STORAGE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.OMICS_STORAGE)

    public val OMICS_TAGS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.OMICS_TAGS)

    public val OMICS_WORKFLOWS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.OMICS_WORKFLOWS)

    public val PANORAMA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PANORAMA)

    public val PINPOINT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PINPOINT)

    public val POLLY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.POLLY)

    public val PRIVATE_5_G: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRIVATE_5_G)

    public val PRIVATE_CERTIFICATE_AUTHORITY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRIVATE_CERTIFICATE_AUTHORITY)

    public val PROMETHEUS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PROMETHEUS)

    public val PROMETHEUS_WORKSPACES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PROMETHEUS_WORKSPACES)

    public val PROTON: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PROTON)

    public val QLDB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.QLDB)

    public val RDS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RDS)

    public val RDS_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RDS_DATA)

    public val REDSHIFT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT)

    public val REDSHIFT_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT_DATA)

    public val REDSHIFT_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT_FIPS)

    public val REKOGNITION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REKOGNITION)

    public val REKOGNITION_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REKOGNITION_FIPS)

    public val ROBOMAKER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ROBOMAKER)

    public val S3: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.S3)

    public val S3_MULTI_REGION_ACCESS_POINTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.S3_MULTI_REGION_ACCESS_POINTS)

    public val S3_OUTPOSTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.S3_OUTPOSTS)

    public val SAGEMAKER_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_API)

    public val SAGEMAKER_FEATURESTORE_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_FEATURESTORE_RUNTIME)

    public val SAGEMAKER_METRICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_METRICS)

    public val SAGEMAKER_NOTEBOOK: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_NOTEBOOK)

    public val SAGEMAKER_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_RUNTIME)

    public val SAGEMAKER_RUNTIME_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_RUNTIME_FIPS)

    public val SAGEMAKER_STUDIO: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_STUDIO)

    public val SECRETS_MANAGER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SECRETS_MANAGER)

    public val SECURITYHUB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SECURITYHUB)

    public val SERVER_MIGRATION_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVER_MIGRATION_SERVICE)

    public val SERVER_MIGRATION_SERVICE_AWSCONNECTOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVER_MIGRATION_SERVICE_AWSCONNECTOR)

    public val SERVER_MIGRATION_SERVICE_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVER_MIGRATION_SERVICE_FIPS)

    public val SERVICE_CATALOG: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVICE_CATALOG)

    public val SERVICE_CATALOG_APPREGISTRY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVICE_CATALOG_APPREGISTRY)

    public val SES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SES)

    public val SNOW_DEVICE_MANAGEMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SNOW_DEVICE_MANAGEMENT)

    public val SNS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SNS)

    public val SQS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SQS)

    public val SSM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM)

    public val SSM_CONTACTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_CONTACTS)

    public val SSM_INCIDENTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_INCIDENTS)

    public val SSM_MESSAGES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_MESSAGES)

    public val STEP_FUNCTIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STEP_FUNCTIONS)

    public val STEP_FUNCTIONS_SYNC: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STEP_FUNCTIONS_SYNC)

    public val STORAGE_GATEWAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STORAGE_GATEWAY)

    public val STS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STS)

    public val TEXTRACT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TEXTRACT)

    public val TEXTRACT_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TEXTRACT_FIPS)

    public val TRANSCRIBE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TRANSCRIBE)

    public val TRANSCRIBE_STREAMING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TRANSCRIBE_STREAMING)

    public val TRANSFER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TRANSFER)

    public val TRANSFER_SERVER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TRANSFER_SERVER)

    public val TRANSLATE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TRANSLATE)

    public val VERIFIED_PERMISSIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.VERIFIED_PERMISSIONS)

    public val WORKSPACES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WORKSPACES)

    public val XRAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.XRAY)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService):
        InterfaceVpcEndpointAwsService = InterfaceVpcEndpointAwsService(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointAwsService):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService = wrapped.cdkObject
  }
}
