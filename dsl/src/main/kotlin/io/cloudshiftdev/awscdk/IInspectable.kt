package io.cloudshiftdev.awscdk

public interface IInspectable {
  public fun inspect(arg0: TreeInspector)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IInspectable,
  ) : IInspectable {
    public override fun inspect(arg0: TreeInspector) {
      unwrap(this).inspect(arg0.let(TreeInspector::unwrap))
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IInspectable): IInspectable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInspectable): software.amazon.awscdk.IInspectable = (wrapped as
        Wrapper).cdkObject
  }
}
