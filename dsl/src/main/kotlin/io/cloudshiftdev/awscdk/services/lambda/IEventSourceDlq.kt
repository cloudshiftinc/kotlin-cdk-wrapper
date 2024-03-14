package io.cloudshiftdev.awscdk.services.lambda

public interface IEventSourceDlq {
  /**
   * Returns the DLQ destination config of the DLQ.
   *
   * @param target 
   * @param targetHandler 
   */
  public fun bind(target: IEventSourceMapping, targetHandler: IFunction): DlqDestinationConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.IEventSourceDlq,
  ) : IEventSourceDlq {
    /**
     * Returns the DLQ destination config of the DLQ.
     *
     * @param target 
     * @param targetHandler 
     */
    override fun bind(target: IEventSourceMapping, targetHandler: IFunction): DlqDestinationConfig =
        unwrap(this).bind(target.let(IEventSourceMapping::unwrap),
        targetHandler.let(IFunction::unwrap)).let(DlqDestinationConfig::wrap)
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
