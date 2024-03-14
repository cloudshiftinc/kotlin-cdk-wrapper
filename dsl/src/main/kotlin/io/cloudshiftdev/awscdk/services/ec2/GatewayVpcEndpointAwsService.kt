package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class GatewayVpcEndpointAwsService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService,
) : CdkObject(cdkObject), IGatewayVpcEndpointService {
  /**
   * The name of the service.
   */
  public override fun name(): String = unwrap(this).getName()

  public companion object {
    public val DYNAMODB: GatewayVpcEndpointAwsService =
        GatewayVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService.DYNAMODB)

    public val S3: GatewayVpcEndpointAwsService =
        GatewayVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService.S3)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService):
        GatewayVpcEndpointAwsService = GatewayVpcEndpointAwsService(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpointAwsService):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService = wrapped.cdkObject
  }
}
