@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.globalaccelerator.IEndpoint
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.ec2.CfnEIP as CloudshiftdevAwscdkServicesEc2CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIP as AmazonAwscdkServicesEc2CfnEIP

public open class CfnEipEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  public override fun region(): String? = unwrap(this).getRegion()

  public override fun renderEndpointConfiguration(): Any =
      unwrap(this).renderEndpointConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun weight(weight: Number)
  }

  private class BuilderImpl(
    eip: AmazonAwscdkServicesEc2CfnEIP,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint.Builder =
        software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint.Builder.create(eip)

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(eip: CloudshiftdevAwscdkServicesEc2CfnEIP, block: Builder.() -> Unit
        = {}): CfnEipEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEc2CfnEIP.unwrap(eip))
      return CfnEipEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint):
        CfnEipEndpoint = CfnEipEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEipEndpoint):
        software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint =
        wrapped.cdkObject
  }
}
