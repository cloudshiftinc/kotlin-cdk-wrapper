package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.String

public interface IValidator {
  public fun content(): String

  public fun type(): ValidatorType

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IValidator,
  ) : IValidator {
    public override fun content(): String = unwrap(this).getContent()

    public override fun type(): ValidatorType = unwrap(this).getType().let(ValidatorType::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IValidator): IValidator =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IValidator): software.amazon.awscdk.services.appconfig.IValidator =
        (wrapped as Wrapper).cdkObject
  }
}
