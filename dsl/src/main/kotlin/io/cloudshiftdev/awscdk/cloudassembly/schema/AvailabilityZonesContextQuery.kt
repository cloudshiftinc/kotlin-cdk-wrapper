package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface AvailabilityZonesContextQuery {
  public fun account(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun region(): String

  public interface Builder {
    public fun account(account: String)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery,
  ) : AvailabilityZonesContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AvailabilityZonesContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery):
        AvailabilityZonesContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AvailabilityZonesContextQuery):
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery = (wrapped as
        Wrapper).cdkObject
  }
}
