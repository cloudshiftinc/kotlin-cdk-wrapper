package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.Unit

public interface OriginBindOptions {
  public fun originId(): String

  public interface Builder {
    public fun originId(originId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginBindOptions.Builder =
        software.amazon.awscdk.services.cloudfront.OriginBindOptions.builder()

    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindOptions,
  ) : OriginBindOptions {
    override fun originId(): String = unwrap(this).getOriginId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OriginBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindOptions):
        OriginBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginBindOptions):
        software.amazon.awscdk.services.cloudfront.OriginBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
