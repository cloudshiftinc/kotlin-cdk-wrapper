package io.cloudshiftdev.awscdk.services.synthetics

import kotlin.String
import kotlin.Unit

public interface CustomTestOptions {
  public fun code(): Code

  public fun handler(): String

  public interface Builder {
    public fun code(code: Code) {
    }

    public fun handler(handler: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CustomTestOptions.Builder =
        software.amazon.awscdk.services.synthetics.CustomTestOptions.builder()

    public override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    public override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    public fun build(): software.amazon.awscdk.services.synthetics.CustomTestOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions,
  ) : CustomTestOptions {
    public override fun code(): Code = unwrap(this).getCode().let(Code::wrap)

    public override fun handler(): String = unwrap(this).getHandler()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomTestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions):
        CustomTestOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomTestOptions):
        software.amazon.awscdk.services.synthetics.CustomTestOptions = (wrapped as
        Wrapper).cdkObject
  }
}
