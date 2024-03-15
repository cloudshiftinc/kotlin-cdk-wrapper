@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.globalaccelerator.IEndpoint
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.ec2.IInstance as CloudshiftdevAwscdkServicesEc2IInstance
import software.amazon.awscdk.services.ec2.IInstance as AmazonAwscdkServicesEc2IInstance

public open class InstanceEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  public override fun region(): String? = unwrap(this).getRegion()

  public override fun renderEndpointConfiguration(): Any =
      unwrap(this).renderEndpointConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun weight(weight: Number)
  }

  private class BuilderImpl(
    instance: AmazonAwscdkServicesEc2IInstance,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint.Builder =
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint.Builder.create(instance)

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(instance: CloudshiftdevAwscdkServicesEc2IInstance,
        block: Builder.() -> Unit = {}): InstanceEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEc2IInstance.unwrap(instance))
      return InstanceEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint):
        InstanceEndpoint = InstanceEndpoint(cdkObject)

    internal fun unwrap(wrapped: InstanceEndpoint):
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint =
        wrapped.cdkObject
  }
}
