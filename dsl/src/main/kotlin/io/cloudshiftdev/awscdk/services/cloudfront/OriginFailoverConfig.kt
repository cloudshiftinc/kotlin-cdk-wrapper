package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface OriginFailoverConfig {
  public fun failoverOrigin(): IOrigin

  public fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()

  public interface Builder {
    public fun failoverOrigin(failoverOrigin: IOrigin)

    public fun statusCodes(statusCodes: List<Number>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.Builder
        = software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.builder()

    override fun failoverOrigin(failoverOrigin: IOrigin) {
      cdkBuilder.failoverOrigin(failoverOrigin.let(IOrigin::unwrap))
    }

    override fun statusCodes(statusCodes: List<Number>) {
      cdkBuilder.statusCodes(statusCodes)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginFailoverConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig,
  ) : OriginFailoverConfig {
    override fun failoverOrigin(): IOrigin = unwrap(this).getFailoverOrigin().let(IOrigin::wrap)

    override fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OriginFailoverConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig):
        OriginFailoverConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginFailoverConfig):
        software.amazon.awscdk.services.cloudfront.OriginFailoverConfig = (wrapped as
        Wrapper).cdkObject
  }
}
