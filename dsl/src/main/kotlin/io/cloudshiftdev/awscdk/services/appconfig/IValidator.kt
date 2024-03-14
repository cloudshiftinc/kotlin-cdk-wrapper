package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.String

public interface IValidator {
  /**
   * The content of the validator.
   */
  public fun content(): String

  /**
   * The type of validator.
   */
  public fun type(): ValidatorType

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IValidator,
  ) : IValidator {
    /**
     * The content of the validator.
     */
    override fun content(): String = unwrap(this).getContent()

    /**
     * The type of validator.
     */
    override fun type(): ValidatorType = unwrap(this).getType().let(ValidatorType::wrap)
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
