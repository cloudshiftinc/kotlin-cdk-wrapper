@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A gateway VPC endpoint.
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
public open class GatewayVpcEndpoint(
  cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint,
) : VpcEndpoint(cdkObject), IGatewayVpcEndpoint {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GatewayVpcEndpointProps,
  ) :
      this(software.amazon.awscdk.services.ec2.GatewayVpcEndpoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(GatewayVpcEndpointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GatewayVpcEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, GatewayVpcEndpointProps(props)
  )

  /**
   * The date and time the gateway VPC endpoint was created.
   */
  public open fun vpcEndpointCreationTimestamp(): String =
      unwrap(this).getVpcEndpointCreationTimestamp()

  /**
   *
   */
  public open fun vpcEndpointDnsEntries(): List<String> = unwrap(this).getVpcEndpointDnsEntries()

  /**
   * The gateway VPC endpoint identifier.
   */
  public override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

  /**
   *
   */
  public open fun vpcEndpointNetworkInterfaceIds(): List<String> =
      unwrap(this).getVpcEndpointNetworkInterfaceIds()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.GatewayVpcEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The service to use for this gateway VPC endpoint.
     *
     * @param service The service to use for this gateway VPC endpoint. 
     */
    public fun service(service: IGatewayVpcEndpointService)

    /**
     * Where to add endpoint routing.
     *
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     *
     * Default: - All subnets in the VPC
     *
     * Example:
     *
     * ```
     * Vpc vpc;
     * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * // Add only to ISOLATED subnets
     * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
     * .build());
     * ```
     *
     * @param subnets Where to add endpoint routing. 
     */
    public fun subnets(subnets: List<SubnetSelection>)

    /**
     * Where to add endpoint routing.
     *
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     *
     * Default: - All subnets in the VPC
     *
     * Example:
     *
     * ```
     * Vpc vpc;
     * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * // Add only to ISOLATED subnets
     * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
     * .build());
     * ```
     *
     * @param subnets Where to add endpoint routing. 
     */
    public fun subnets(vararg subnets: SubnetSelection)

    /**
     * The VPC network in which the gateway endpoint will be used.
     *
     * @param vpc The VPC network in which the gateway endpoint will be used. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder.create(scope, id)

    /**
     * The service to use for this gateway VPC endpoint.
     *
     * @param service The service to use for this gateway VPC endpoint. 
     */
    override fun service(service: IGatewayVpcEndpointService) {
      cdkBuilder.service(service.let(IGatewayVpcEndpointService.Companion::unwrap))
    }

    /**
     * Where to add endpoint routing.
     *
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     *
     * Default: - All subnets in the VPC
     *
     * Example:
     *
     * ```
     * Vpc vpc;
     * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * // Add only to ISOLATED subnets
     * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
     * .build());
     * ```
     *
     * @param subnets Where to add endpoint routing. 
     */
    override fun subnets(subnets: List<SubnetSelection>) {
      cdkBuilder.subnets(subnets.map(SubnetSelection.Companion::unwrap))
    }

    /**
     * Where to add endpoint routing.
     *
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     *
     * Default: - All subnets in the VPC
     *
     * Example:
     *
     * ```
     * Vpc vpc;
     * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * // Add only to ISOLATED subnets
     * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
     * .build());
     * ```
     *
     * @param subnets Where to add endpoint routing. 
     */
    override fun subnets(vararg subnets: SubnetSelection): Unit = subnets(subnets.toList())

    /**
     * The VPC network in which the gateway endpoint will be used.
     *
     * @param vpc The VPC network in which the gateway endpoint will be used. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GatewayVpcEndpoint = cdkBuilder.build()
  }

  public companion object {
    public fun fromGatewayVpcEndpointId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      gatewayVpcEndpointId: String,
    ): IGatewayVpcEndpoint =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.fromGatewayVpcEndpointId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, gatewayVpcEndpointId).let(IGatewayVpcEndpoint::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GatewayVpcEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GatewayVpcEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint):
        GatewayVpcEndpoint = GatewayVpcEndpoint(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpoint):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpoint = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
  }
}
