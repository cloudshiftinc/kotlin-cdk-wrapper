package io.cloudshiftdev.awscdk.services.cognito

public interface ICustomAttribute {
  public fun bind(): CustomAttributeConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.ICustomAttribute,
  ) : ICustomAttribute {
    public override fun bind(): CustomAttributeConfig =
        unwrap(this).bind().let(CustomAttributeConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ICustomAttribute):
        ICustomAttribute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICustomAttribute):
        software.amazon.awscdk.services.cognito.ICustomAttribute = (wrapped as Wrapper).cdkObject
  }
}
