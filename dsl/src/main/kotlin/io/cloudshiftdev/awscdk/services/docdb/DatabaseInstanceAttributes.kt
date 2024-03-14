package io.cloudshiftdev.awscdk.services.docdb

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface DatabaseInstanceAttributes {
  public fun instanceEndpointAddress(): String

  public fun instanceIdentifier(): String

  public fun port(): Number

  public interface Builder {
    public fun instanceEndpointAddress(instanceEndpointAddress: String)

    public fun instanceIdentifier(instanceIdentifier: String)

    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes.Builder
        = software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes.builder()

    override fun instanceEndpointAddress(instanceEndpointAddress: String) {
      cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
    }

    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes,
  ) : DatabaseInstanceAttributes {
    override fun instanceEndpointAddress(): String = unwrap(this).getInstanceEndpointAddress()

    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    override fun port(): Number = unwrap(this).getPort()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInstanceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes):
        DatabaseInstanceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceAttributes):
        software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
