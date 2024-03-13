package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface EndpointServiceAvailabilityZonesContextQuery {
  public fun account(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun region(): String

  public fun serviceName(): String

  public interface Builder {
    public fun account(account: String) {
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
    }

    public fun region(region: String) {
    }

    public fun serviceName(serviceName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery.Builder
        =
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build():
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery,
  ) : EndpointServiceAvailabilityZonesContextQuery {
    public override fun account(): String = unwrap(this).getAccount()

    public override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    public override fun region(): String = unwrap(this).getRegion()

    public override fun serviceName(): String = unwrap(this).getServiceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        EndpointServiceAvailabilityZonesContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery):
        EndpointServiceAvailabilityZonesContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointServiceAvailabilityZonesContextQuery):
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery =
        (wrapped as Wrapper).cdkObject
  }
}
