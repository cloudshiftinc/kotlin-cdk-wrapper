package io.cloudshiftdev.awscdk.services.lambda

public interface IEventSource {
  public fun bind(arg0: IFunction)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.IEventSource,
  ) : IEventSource {
    override fun bind(arg0: IFunction) {
      unwrap(this).bind(arg0.let(IFunction::unwrap))
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSource): IEventSource
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventSource): software.amazon.awscdk.services.lambda.IEventSource
        = (wrapped as Wrapper).cdkObject
  }
}
