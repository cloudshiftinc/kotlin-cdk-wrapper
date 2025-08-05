@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * An AWS service for an interface VPC endpoint.
 *
 * Example:
 *
 * ```
 * vpc.addInterfaceEndpoint("ExampleEndpoint", InterfaceVpcEndpointOptions.builder()
 * .service(InterfaceVpcEndpointAwsService.ECR)
 * .ipAddressType(VpcEndpointIpAddressType.IPV6)
 * .dnsRecordIpType(VpcEndpointDnsRecordIpType.IPV6)
 * .build());
 * ```
 */
public open class InterfaceVpcEndpointAwsService(
  cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService,
) : CdkObject(cdkObject),
    IInterfaceVpcEndpointService {
  public constructor(name: String) :
      this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService(name)
  )

  public constructor(name: String, prefix: String) :
      this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService(name, prefix)
  )

  public constructor(
    name: String,
    prefix: String,
    port: Number,
  ) : this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService(name, prefix, port)
  )

  public constructor(
    name: String,
    prefix: String,
    port: Number,
    props: InterfaceVpcEndpointAwsServiceProps,
  ) : this(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService(name, prefix, port,
      props.let(InterfaceVpcEndpointAwsServiceProps.Companion::unwrap))
  )

  public constructor(
    name: String,
    prefix: String,
    port: Number,
    props: InterfaceVpcEndpointAwsServiceProps.Builder.() -> Unit,
  ) : this(name, prefix, port, InterfaceVpcEndpointAwsServiceProps(props)
  )

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

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.InterfaceVpcEndpointAwsService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If true, the service is a global endpoint and its name will not be prefixed with the stack's
     * region.
     *
     * Default: false
     *
     * @param global If true, the service is a global endpoint and its name will not be prefixed
     * with the stack's region. 
     */
    public fun global(global: Boolean)
  }

  private class BuilderImpl(
    name: String,
    prefix: String,
    port: Number,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.Builder =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.Builder.create(name,
        prefix, port)

    /**
     * If true, the service is a global endpoint and its name will not be prefixed with the stack's
     * region.
     *
     * Default: false
     *
     * @param global If true, the service is a global endpoint and its name will not be prefixed
     * with the stack's region. 
     */
    override fun global(global: Boolean) {
      cdkBuilder.global(global)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService =
        cdkBuilder.build()
  }

  public companion object {
    public val ACCESS_ANALYZER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ACCESS_ANALYZER)

    public val ACCOUNT_MANAGEMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ACCOUNT_MANAGEMENT)

    public val AIRFLOW_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_API)

    public val AIRFLOW_API_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_API_FIPS)

    public val AIRFLOW_ENV: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_ENV)

    public val AIRFLOW_ENV_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_ENV_FIPS)

    public val AIRFLOW_OPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.AIRFLOW_OPS)

    public val APIGATEWAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APIGATEWAY)

    public val APP_MESH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_MESH)

    public val APP_MESH_ENVOY_MANAGEMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_MESH_ENVOY_MANAGEMENT)

    public val APP_MESH_OPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_MESH_OPS)

    public val APP_RUNNER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_RUNNER)

    public val APP_RUNNER_REQUESTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_RUNNER_REQUESTS)

    public val APP_SYNC: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APP_SYNC)

    public val APPCONFIG: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPCONFIG)

    public val APPCONFIGDATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPCONFIGDATA)

    public val APPLICATION_AUTOSCALING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPLICATION_AUTOSCALING)

    public val APPLICATION_DISCOVERY_ARSENAL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPLICATION_DISCOVERY_ARSENAL)

    public val APPLICATION_DISCOVERY_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.APPLICATION_DISCOVERY_SERVICE)

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

    public val B2_B_DATA_INTERCHANGE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.B2_B_DATA_INTERCHANGE)

    public val BACKUP: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BACKUP)

    public val BACKUP_GATEWAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BACKUP_GATEWAY)

    public val BATCH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BATCH)

    public val BEDROCK: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK)

    public val BEDROCK_AGENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK_AGENT)

    public val BEDROCK_AGENT_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK_AGENT_RUNTIME)

    public val BEDROCK_DATA_AUTOMATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK_DATA_AUTOMATION)

    public val BEDROCK_DATA_AUTOMATION_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK_DATA_AUTOMATION_FIPS)

    public val BEDROCK_DATA_AUTOMATION_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK_DATA_AUTOMATION_RUNTIME)

    public val BEDROCK_DATA_AUTOMATION_RUNTIME_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK_DATA_AUTOMATION_RUNTIME_FIPS)

    public val BEDROCK_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BEDROCK_RUNTIME)

    public val BILLING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BILLING)

    public val BILLING_AND_COST_MANAGEMENT_FREETIER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BILLING_AND_COST_MANAGEMENT_FREETIER)

    public val BILLING_AND_COST_MANAGEMENT_TAX: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BILLING_AND_COST_MANAGEMENT_TAX)

    public val BILLING_CONDUCTOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BILLING_CONDUCTOR)

    public val BRAKET: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.BRAKET)

    public val CLEAN_ROOMS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLEAN_ROOMS)

    public val CLEAN_ROOMS_ML: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLEAN_ROOMS_ML)

    public val CLOUD_CONTROL_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_CONTROL_API)

    public val CLOUD_CONTROL_API_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_CONTROL_API_FIPS)

    public val CLOUD_DIRECTORY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_DIRECTORY)

    public val CLOUD_MAP_DATA_SERVICE_DISCOVERY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_MAP_DATA_SERVICE_DISCOVERY)

    public val CLOUD_MAP_DATA_SERVICE_DISCOVERY_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_MAP_DATA_SERVICE_DISCOVERY_FIPS)

    public val CLOUD_MAP_SERVICE_DISCOVERY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_MAP_SERVICE_DISCOVERY)

    public val CLOUD_MAP_SERVICE_DISCOVERY_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUD_MAP_SERVICE_DISCOVERY_FIPS)

    public val CLOUDFORMATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDFORMATION)

    public val CLOUDHSM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDHSM)

    public val CLOUDTRAIL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDTRAIL)

    public val CLOUDWATCH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH)

    public val CLOUDWATCH_APPLICATION_INSIGHTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_APPLICATION_INSIGHTS)

    public val CLOUDWATCH_APPLICATION_SIGNALS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_APPLICATION_SIGNALS)

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

    public val CLOUDWATCH_NETWORK_MONITOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_NETWORK_MONITOR)

    public val CLOUDWATCH_RUM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_RUM)

    public val CLOUDWATCH_RUM_DATAPLANE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_RUM_DATAPLANE)

    public val CLOUDWATCH_SYNTHETICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_SYNTHETICS)

    public val CLOUDWATCH_SYNTHETICS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CLOUDWATCH_SYNTHETICS_FIPS)

    public val CODE_CONNECTIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODE_CONNECTIONS)

    public val CODEARTIFACT_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEARTIFACT_API)

    public val CODEARTIFACT_REPOSITORIES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEARTIFACT_REPOSITORIES)

    public val CODEBUILD: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEBUILD)

    public val CODEBUILD_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEBUILD_FIPS)

    public val CODECATALYST: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODECATALYST)

    public val CODECATALYST_GIT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODECATALYST_GIT)

    public val CODECATALYST_PACKAGES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODECATALYST_PACKAGES)

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

    public val CODEWHISPERER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CODEWHISPERER)

    public val COMPREHEND: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.COMPREHEND)

    public val COMPREHEND_MEDICAL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.COMPREHEND_MEDICAL)

    public val COMPUTE_OPTIMIZER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.COMPUTE_OPTIMIZER)

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

    public val CONTROL_CATALOG: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.CONTROL_CATALOG)

    public val COST_EXPLORER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.COST_EXPLORER)

    public val COST_OPTIMIZATION_HUB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.COST_OPTIMIZATION_HUB)

    public val DATA_EXCHANGE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATA_EXCHANGE)

    public val DATA_EXPORTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATA_EXPORTS)

    public val DATABASE_MIGRATION_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATABASE_MIGRATION_SERVICE)

    public val DATABASE_MIGRATION_SERVICE_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATABASE_MIGRATION_SERVICE_FIPS)

    public val DATASYNC: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATASYNC)

    public val DATAZONE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DATAZONE)

    public val DEADLINE_CLOUD_MANAGEMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DEADLINE_CLOUD_MANAGEMENT)

    public val DEADLINE_CLOUD_SCHEDULING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DEADLINE_CLOUD_SCHEDULING)

    public val DEVOPS_GURU: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DEVOPS_GURU)

    public val DIRECTORY_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DIRECTORY_SERVICE)

    public val DIRECTORY_SERVICE_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DIRECTORY_SERVICE_DATA)

    public val DSQL_MANAGEMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DSQL_MANAGEMENT)

    public val DYNAMODB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DYNAMODB)

    public val DYNAMODB_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DYNAMODB_FIPS)

    public val DYNAMODB_STREAMS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.DYNAMODB_STREAMS)

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

    public val EKS_AUTH: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EKS_AUTH)

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

    public val ELEMENTAL_MEDIACONNECT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ELEMENTAL_MEDIACONNECT)

    public val EMAIL_SMTP: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMAIL_SMTP)

    public val EMR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR)

    public val EMR_EKS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR_EKS)

    public val EMR_SERVERLESS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR_SERVERLESS)

    public val EMR_SERVERLESS_DASHBOARD: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR_SERVERLESS_DASHBOARD)

    public val EMR_SERVERLESS_LIVY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR_SERVERLESS_LIVY)

    public val EMR_WAL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EMR_WAL)

    public val END_USER_MESSAGING_SOCIAL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.END_USER_MESSAGING_SOCIAL)

    public val ENTITY_RESOLUTION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ENTITY_RESOLUTION)

    public val EVENTBRIDGE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EVENTBRIDGE)

    public val EVENTBRIDGE_SCHEMA_REGISTRY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.EVENTBRIDGE_SCHEMA_REGISTRY)

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

    public val GLUE_DASHBOARD: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GLUE_DASHBOARD)

    public val GLUE_DATABREW: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GLUE_DATABREW)

    public val GRAFANA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GRAFANA)

    public val GRAFANA_WORKSPACE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GRAFANA_WORKSPACE)

    public val GROUNDSTATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GROUNDSTATION)

    public val GUARDDUTY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GUARDDUTY)

    public val GUARDDUTY_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GUARDDUTY_DATA)

    public val GUARDDUTY_DATA_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GUARDDUTY_DATA_FIPS)

    public val GUARDDUTY_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.GUARDDUTY_FIPS)

    public val HEALTH_IMAGING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.HEALTH_IMAGING)

    public val HEALTH_IMAGING_DICOM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.HEALTH_IMAGING_DICOM)

    public val HEALTH_IMAGING_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.HEALTH_IMAGING_RUNTIME)

    public val HEALTHLAKE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.HEALTHLAKE)

    public val IAM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IAM)

    public val IAM_IDENTITY_CENTER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IAM_IDENTITY_CENTER)

    public val IAM_ROLES_ANYWHERE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IAM_ROLES_ANYWHERE)

    public val IMAGE_BUILDER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IMAGE_BUILDER)

    public val INSPECTOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.INSPECTOR)

    public val INSPECTOR_SCAN: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.INSPECTOR_SCAN)

    public val INTERNET_MONITOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.INTERNET_MONITOR)

    public val INTERNET_MONITOR_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.INTERNET_MONITOR_FIPS)

    public val INVOICING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.INVOICING)

    public val IOT_CORE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE)

    public val IOT_CORE_CREDENTIALS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE_CREDENTIALS)

    public val IOT_CORE_DEVICE_ADVISOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE_DEVICE_ADVISOR)

    public val IOT_CORE_FLEETHUB_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE_FLEETHUB_API)

    public val IOT_CORE_FOR_LORAWAN: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_CORE_FOR_LORAWAN)

    public val IOT_FLEETWISE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.IOT_FLEETWISE)

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

    public val KAFKA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KAFKA)

    public val KAFKA_CONNECT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KAFKA_CONNECT)

    public val KAFKA_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KAFKA_FIPS)

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

    public val KINESIS_STREAMS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KINESIS_STREAMS_FIPS)

    public val KMS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KMS)

    public val KMS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.KMS_FIPS)

    public val LAKE_FORMATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LAKE_FORMATION)

    public val LAMBDA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LAMBDA)

    public val LAUNCH_WIZARD: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LAUNCH_WIZARD)

    public val LEX_MODELS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LEX_MODELS)

    public val LEX_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LEX_RUNTIME)

    public val LICENSE_MANAGER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LICENSE_MANAGER)

    public val LICENSE_MANAGER_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LICENSE_MANAGER_FIPS)

    public val LICENSE_MANAGER_LINUX_SUBSCRIPTIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LICENSE_MANAGER_LINUX_SUBSCRIPTIONS)

    public val LICENSE_MANAGER_LINUX_SUBSCRIPTIONS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LICENSE_MANAGER_LINUX_SUBSCRIPTIONS_FIPS)

    public val LICENSE_MANAGER_USER_SUBSCRIPTIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LICENSE_MANAGER_USER_SUBSCRIPTIONS)

    public val LOCATION_SERVICE_GEOFENCING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOCATION_SERVICE_GEOFENCING)

    public val LOCATION_SERVICE_MAPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOCATION_SERVICE_MAPS)

    public val LOCATION_SERVICE_METADATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOCATION_SERVICE_METADATA)

    public val LOCATION_SERVICE_PLACES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOCATION_SERVICE_PLACES)

    public val LOCATION_SERVICE_ROUTE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOCATION_SERVICE_ROUTE)

    public val LOCATION_SERVICE_TRACKING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOCATION_SERVICE_TRACKING)

    public val LOOKOUT_EQUIPMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOOKOUT_EQUIPMENT)

    public val LOOKOUT_METRICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOOKOUT_METRICS)

    public val LOOKOUT_VISION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.LOOKOUT_VISION)

    public val MACIE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MACIE)

    public val MAILMANAGER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MAILMANAGER)

    public val MAILMANAGER_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MAILMANAGER_FIPS)

    public val MAINFRAME_MODERNIZATION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MAINFRAME_MODERNIZATION)

    public val MAINFRAME_MODERNIZATION_APP_TEST: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MAINFRAME_MODERNIZATION_APP_TEST)

    public val MANAGED_BLOCKCHAIN_BITCOIN_MAINNET: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MANAGED_BLOCKCHAIN_BITCOIN_MAINNET)

    public val MANAGED_BLOCKCHAIN_BITCOIN_TESTNET: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MANAGED_BLOCKCHAIN_BITCOIN_TESTNET)

    public val MANAGED_BLOCKCHAIN_QUERY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MANAGED_BLOCKCHAIN_QUERY)

    public val MANAGEMENT_CONSOLE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MANAGEMENT_CONSOLE)

    public val MANAGEMENT_CONSOLE_SIGNIN: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MANAGEMENT_CONSOLE_SIGNIN)

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

    public val MQ: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.MQ)

    public val NEPTUNE_ANALYTICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NEPTUNE_ANALYTICS)

    public val NEPTUNE_ANALYTICS_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NEPTUNE_ANALYTICS_DATA)

    public val NEPTUNE_ANALYTICS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NEPTUNE_ANALYTICS_FIPS)

    public val NETWORK_FIREWALL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NETWORK_FIREWALL)

    public val NETWORK_FIREWALL_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NETWORK_FIREWALL_FIPS)

    public val NETWORK_FLOW_MONITOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NETWORK_FLOW_MONITOR)

    public val NETWORK_FLOW_MONITOR_REPORTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NETWORK_FLOW_MONITOR_REPORTS)

    public val NIMBLE_STUDIO: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.NIMBLE_STUDIO)

    public val OBSERVABILITY_ADMIN: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.OBSERVABILITY_ADMIN)

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

    public val ORGANIZATIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ORGANIZATIONS)

    public val ORGANIZATIONS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ORGANIZATIONS_FIPS)

    public val OUTPOSTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.OUTPOSTS)

    public val PANORAMA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PANORAMA)

    public val PARALLEL_COMPUTING_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PARALLEL_COMPUTING_SERVICE)

    public val PARALLEL_COMPUTING_SERVICE_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PARALLEL_COMPUTING_SERVICE_FIPS)

    public val PAYMENT_CRYPTOGRAPHY_CONTROLPLANE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PAYMENT_CRYPTOGRAPHY_CONTROLPLANE)

    public val PAYMENT_CRYPTOGRAPHY_DATAPLANE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PAYMENT_CRYPTOGRAPHY_DATAPLANE)

    public val PAYMENT_CRYTOGRAPHY_DATAPLANE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PAYMENT_CRYTOGRAPHY_DATAPLANE)

    public val PERSONALIZE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PERSONALIZE)

    public val PERSONALIZE_EVENTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PERSONALIZE_EVENTS)

    public val PERSONALIZE_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PERSONALIZE_RUNTIME)

    public val PINPOINT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PINPOINT)

    public val PINPOINT_SMS_VOICE_V2: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PINPOINT_SMS_VOICE_V2)

    public val PINPOINT_V1: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PINPOINT_V1)

    public val PIPES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PIPES)

    public val PIPES_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PIPES_DATA)

    public val PIPES_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PIPES_FIPS)

    public val POLLY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.POLLY)

    public val PRICE_LIST: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRICE_LIST)

    public val PRICING_CALCULATOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRICING_CALCULATOR)

    public val PRIVATE_5_G: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRIVATE_5_G)

    public val PRIVATE_CERTIFICATE_AUTHORITY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRIVATE_CERTIFICATE_AUTHORITY)

    public val PRIVATE_CERTIFICATE_AUTHORITY_CONNECTOR_AD: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRIVATE_CERTIFICATE_AUTHORITY_CONNECTOR_AD)

    public val PRIVATE_CERTIFICATE_AUTHORITY_CONNECTOR_SCEP: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PRIVATE_CERTIFICATE_AUTHORITY_CONNECTOR_SCEP)

    public val PROMETHEUS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PROMETHEUS)

    public val PROMETHEUS_WORKSPACES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PROMETHEUS_WORKSPACES)

    public val PROTON: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.PROTON)

    public val Q_BUSSINESS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.Q_BUSSINESS)

    public val Q_DEVELOPER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.Q_DEVELOPER)

    public val Q_DEVELOPER_CODE_WHISPERER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.Q_DEVELOPER_CODE_WHISPERER)

    public val Q_DEVELOPER_QAPPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.Q_DEVELOPER_QAPPS)

    public val Q_USER_SUBSCRIPTIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.Q_USER_SUBSCRIPTIONS)

    public val QLDB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.QLDB)

    public val QUICKSIGHT_WEBSITE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.QUICKSIGHT_WEBSITE)

    public val RDS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RDS)

    public val RDS_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RDS_DATA)

    public val RDS_PERFORMANCE_INSIGHTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RDS_PERFORMANCE_INSIGHTS)

    public val RDS_PERFORMANCE_INSIGHTS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RDS_PERFORMANCE_INSIGHTS_FIPS)

    public val RECYCLE_BIN: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RECYCLE_BIN)

    public val REDSHIFT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT)

    public val REDSHIFT_DATA: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT_DATA)

    public val REDSHIFT_DATA_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT_DATA_FIPS)

    public val REDSHIFT_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT_FIPS)

    public val REDSHIFT_SERVERLESS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT_SERVERLESS)

    public val REDSHIFT_SERVERLESS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REDSHIFT_SERVERLESS_FIPS)

    public val REKOGNITION: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REKOGNITION)

    public val REKOGNITION_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REKOGNITION_FIPS)

    public val REKOGNITION_STREAMING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REKOGNITION_STREAMING)

    public val REKOGNITION_STREAMING_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REKOGNITION_STREAMING_FIPS)

    public val REPOST_SPACE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.REPOST_SPACE)

    public val RESOURCE_ACCESS_MANAGER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RESOURCE_ACCESS_MANAGER)

    public val RESOURCE_GROUPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RESOURCE_GROUPS)

    public val RESOURCE_GROUPS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.RESOURCE_GROUPS_FIPS)

    public val ROBOMAKER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.ROBOMAKER)

    public val S3: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.S3)

    public val S3_MULTI_REGION_ACCESS_POINTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.S3_MULTI_REGION_ACCESS_POINTS)

    public val S3_OUTPOSTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.S3_OUTPOSTS)

    public val S3_TABLES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.S3_TABLES)

    public val SAGEMAKER_API: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_API)

    public val SAGEMAKER_API_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_API_FIPS)

    public val SAGEMAKER_DATA_SCIENCE_ASSISTANT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_DATA_SCIENCE_ASSISTANT)

    public val SAGEMAKER_EXPERIMENTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_EXPERIMENTS)

    public val SAGEMAKER_FEATURESTORE_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_FEATURESTORE_RUNTIME)

    public val SAGEMAKER_GEOSPATIAL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_GEOSPATIAL)

    public val SAGEMAKER_METRICS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_METRICS)

    public val SAGEMAKER_NOTEBOOK: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_NOTEBOOK)

    public val SAGEMAKER_PARTNER_APP: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_PARTNER_APP)

    public val SAGEMAKER_RUNTIME: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_RUNTIME)

    public val SAGEMAKER_RUNTIME_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_RUNTIME_FIPS)

    public val SAGEMAKER_STUDIO: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAGEMAKER_STUDIO)

    public val SAVINGS_PLANS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SAVINGS_PLANS)

    public val SECRETS_MANAGER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SECRETS_MANAGER)

    public val SECURITYHUB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SECURITYHUB)

    public val SECURITYLAKE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SECURITYLAKE)

    public val SECURITYLAKE_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SECURITYLAKE_FIPS)

    public val SERVER_MIGRATION_SERVICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVER_MIGRATION_SERVICE)

    public val SERVER_MIGRATION_SERVICE_AWSCONNECTOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVER_MIGRATION_SERVICE_AWSCONNECTOR)

    public val SERVER_MIGRATION_SERVICE_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVER_MIGRATION_SERVICE_FIPS)

    public val SERVERLESS_APPLICATION_REPOSITORY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVERLESS_APPLICATION_REPOSITORY)

    public val SERVICE_CATALOG: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVICE_CATALOG)

    public val SERVICE_CATALOG_APPREGISTRY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SERVICE_CATALOG_APPREGISTRY)

    public val SES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SES)

    public val SHIELD: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SHIELD)

    public val SHIELD_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SHIELD_FIPS)

    public val SIMSPACE_WEAVER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SIMSPACE_WEAVER)

    public val SNOW_DEVICE_MANAGEMENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SNOW_DEVICE_MANAGEMENT)

    public val SNS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SNS)

    public val SQS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SQS)

    public val SQS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SQS_FIPS)

    public val SSM: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM)

    public val SSM_CONTACTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_CONTACTS)

    public val SSM_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_FIPS)

    public val SSM_INCIDENTS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_INCIDENTS)

    public val SSM_MESSAGES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_MESSAGES)

    public val SSM_QUICK_SETUP: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SSM_QUICK_SETUP)

    public val STEP_FUNCTIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STEP_FUNCTIONS)

    public val STEP_FUNCTIONS_SYNC: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STEP_FUNCTIONS_SYNC)

    public val STORAGE_GATEWAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STORAGE_GATEWAY)

    public val STS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STS)

    public val STS_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.STS_FIPS)

    public val SUPPLY_CHAIN: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SUPPLY_CHAIN)

    public val SWF: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SWF)

    public val SWF_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.SWF_FIPS)

    public val TAGGING: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TAGGING)

    public val TELCO_NETWORK_BUILDER: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TELCO_NETWORK_BUILDER)

    public val TEXTRACT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TEXTRACT)

    public val TEXTRACT_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TEXTRACT_FIPS)

    public val TIMESTREAM_INFLUXDB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TIMESTREAM_INFLUXDB)

    public val TIMESTREAM_INFLUXDB_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TIMESTREAM_INFLUXDB_FIPS)

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

    public val TRUSTED_ADVISOR: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.TRUSTED_ADVISOR)

    public val VERIFIED_PERMISSIONS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.VERIFIED_PERMISSIONS)

    public val VPC_LATTICE: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.VPC_LATTICE)

    public val WAFV2: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WAFV2)

    public val WAFV2_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WAFV2_FIPS)

    public val WELL_ARCHITECTED_TOOL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WELL_ARCHITECTED_TOOL)

    public val WORKMAIL: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WORKMAIL)

    public val WORKSPACES: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WORKSPACES)

    public val WORKSPACES_THIN_CLIENT: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WORKSPACES_THIN_CLIENT)

    public val WORKSPACES_WEB: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WORKSPACES_WEB)

    public val WORKSPACES_WEB_FIPS: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.WORKSPACES_WEB_FIPS)

    public val XRAY: InterfaceVpcEndpointAwsService =
        InterfaceVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService.XRAY)

    public operator fun invoke(
      name: String,
      prefix: String,
      port: Number,
      block: Builder.() -> Unit = {},
    ): InterfaceVpcEndpointAwsService {
      val builderImpl = BuilderImpl(name, prefix, port)
      return InterfaceVpcEndpointAwsService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService):
        InterfaceVpcEndpointAwsService = InterfaceVpcEndpointAwsService(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointAwsService):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsService
  }
}
