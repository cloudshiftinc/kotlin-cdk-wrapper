package io.cloudshiftdev.awscdk.services.ecs.patterns

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface NetworkListenerProps {
  public fun name(): String

  public fun port(): Number? = unwrap(this).getPort()

  public interface Builder {
    public fun name(name: String)

    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps,
  ) : NetworkListenerProps {
    override fun name(): String = unwrap(this).getName()

    override fun port(): Number? = unwrap(this).getPort()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps):
        NetworkListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps = (wrapped as
        Wrapper).cdkObject
  }
}
