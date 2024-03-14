package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface RedirectOptions {
  public fun host(): String? = unwrap(this).getHost()

  public fun path(): String? = unwrap(this).getPath()

  public fun permanent(): Boolean? = unwrap(this).getPermanent()

  public fun port(): String? = unwrap(this).getPort()

  public fun protocol(): String? = unwrap(this).getProtocol()

  public fun query(): String? = unwrap(this).getQuery()

  public interface Builder {
    public fun host(host: String)

    public fun path(path: String)

    public fun permanent(permanent: Boolean)

    public fun port(port: String)

    public fun protocol(protocol: String)

    public fun query(query: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions.builder()

    override fun host(host: String) {
      cdkBuilder.host(host)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun permanent(permanent: Boolean) {
      cdkBuilder.permanent(permanent)
    }

    override fun port(port: String) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun query(query: String) {
      cdkBuilder.query(query)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions,
  ) : RedirectOptions {
    override fun host(): String? = unwrap(this).getHost()

    override fun path(): String? = unwrap(this).getPath()

    override fun permanent(): Boolean? = unwrap(this).getPermanent()

    override fun port(): String? = unwrap(this).getPort()

    override fun protocol(): String? = unwrap(this).getProtocol()

    override fun query(): String? = unwrap(this).getQuery()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RedirectOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions):
        RedirectOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RedirectOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions = (wrapped as
        Wrapper).cdkObject
  }
}
