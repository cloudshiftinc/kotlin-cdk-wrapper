package io.cloudshiftdev.awscdk.services.lambda

public interface IEventSourceDlq {
  public fun bind(arg0: IEventSourceMapping, arg1: IFunction): DlqDestinationConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.IEventSourceDlq,
  ) : IEventSourceDlq {
    override fun bind(arg0: IEventSourceMapping, arg1: IFunction): DlqDestinationConfig =
        unwrap(this).bind(arg0.let(IEventSourceMapping::unwrap),
        arg1.let(IFunction::unwrap)).let(DlqDestinationConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSourceDlq):
        IEventSourceDlq = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventSourceDlq):
        software.amazon.awscdk.services.lambda.IEventSourceDlq = (wrapped as Wrapper).cdkObject
  }
}
