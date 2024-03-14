package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Unit

public interface FunctionAssociation {
  public fun eventType(): FunctionEventType

  public fun function(): IFunction

  public interface Builder {
    public fun eventType(eventType: FunctionEventType)

    public fun function(function: IFunction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FunctionAssociation.Builder =
        software.amazon.awscdk.services.cloudfront.FunctionAssociation.builder()

    override fun eventType(eventType: FunctionEventType) {
      cdkBuilder.eventType(eventType.let(FunctionEventType::unwrap))
    }

    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FunctionAssociation =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAssociation,
  ) : FunctionAssociation {
    override fun eventType(): FunctionEventType =
        unwrap(this).getEventType().let(FunctionEventType::wrap)

    override fun function(): IFunction = unwrap(this).getFunction().let(IFunction::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAssociation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAssociation):
        FunctionAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionAssociation):
        software.amazon.awscdk.services.cloudfront.FunctionAssociation = (wrapped as
        Wrapper).cdkObject
  }
}
