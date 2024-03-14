package io.cloudshiftdev.awscdk.services.s3

import kotlin.Boolean
import kotlin.Unit

public interface VirtualHostedStyleUrlOptions {
  public fun regional(): Boolean? = unwrap(this).getRegional()

  public interface Builder {
    public fun regional(regional: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions.Builder
        = software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions.builder()

    override fun regional(regional: Boolean) {
      cdkBuilder.regional(regional)
    }

    public fun build(): software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions,
  ) : VirtualHostedStyleUrlOptions {
    override fun regional(): Boolean? = unwrap(this).getRegional()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualHostedStyleUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions):
        VirtualHostedStyleUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualHostedStyleUrlOptions):
        software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions = (wrapped as
        Wrapper).cdkObject
  }
}
