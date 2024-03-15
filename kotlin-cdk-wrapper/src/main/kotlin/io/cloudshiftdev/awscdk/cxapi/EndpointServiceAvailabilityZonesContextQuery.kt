@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EndpointServiceAvailabilityZonesContextQuery {
  public fun account(): String? = unwrap(this).getAccount()

  public fun region(): String? = unwrap(this).getRegion()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun region(region: String)

    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery.Builder =
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery,
  ) : CdkObject(cdkObject), EndpointServiceAvailabilityZonesContextQuery {
    override fun account(): String? = unwrap(this).getAccount()

    override fun region(): String? = unwrap(this).getRegion()

    override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        EndpointServiceAvailabilityZonesContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery):
        EndpointServiceAvailabilityZonesContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointServiceAvailabilityZonesContextQuery):
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery
  }
}
