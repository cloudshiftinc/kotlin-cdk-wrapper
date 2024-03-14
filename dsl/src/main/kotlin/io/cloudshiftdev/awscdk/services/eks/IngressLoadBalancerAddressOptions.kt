package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Unit

public interface IngressLoadBalancerAddressOptions : ServiceLoadBalancerAddressOptions {
  public interface Builder {
    public fun namespace(namespace: String)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions.Builder =
        software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions.builder()

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions,
  ) : IngressLoadBalancerAddressOptions {
    override fun namespace(): String? = unwrap(this).getNamespace()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): IngressLoadBalancerAddressOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions):
        IngressLoadBalancerAddressOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IngressLoadBalancerAddressOptions):
        software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions = (wrapped as
        Wrapper).cdkObject
  }
}
