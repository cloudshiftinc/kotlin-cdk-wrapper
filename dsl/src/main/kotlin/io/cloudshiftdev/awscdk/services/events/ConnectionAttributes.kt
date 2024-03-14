package io.cloudshiftdev.awscdk.services.events

import kotlin.String
import kotlin.Unit

public interface ConnectionAttributes {
  public fun connectionArn(): String

  public fun connectionName(): String

  public fun connectionSecretArn(): String

  public interface Builder {
    public fun connectionArn(connectionArn: String)

    public fun connectionName(connectionName: String)

    public fun connectionSecretArn(connectionSecretArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ConnectionAttributes.Builder =
        software.amazon.awscdk.services.events.ConnectionAttributes.builder()

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    override fun connectionSecretArn(connectionSecretArn: String) {
      cdkBuilder.connectionSecretArn(connectionSecretArn)
    }

    public fun build(): software.amazon.awscdk.services.events.ConnectionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.ConnectionAttributes,
  ) : ConnectionAttributes {
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    override fun connectionName(): String = unwrap(this).getConnectionName()

    override fun connectionSecretArn(): String = unwrap(this).getConnectionSecretArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ConnectionAttributes):
        ConnectionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionAttributes):
        software.amazon.awscdk.services.events.ConnectionAttributes = (wrapped as Wrapper).cdkObject
  }
}
