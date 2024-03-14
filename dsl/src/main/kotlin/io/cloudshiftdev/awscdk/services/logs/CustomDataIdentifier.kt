package io.cloudshiftdev.awscdk.services.logs

import kotlin.String

public open class CustomDataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CustomDataIdentifier,
) : DataIdentifier(cdkObject) {
  /**
   * * the name of the custom data identifier.
   *
   * This cannot share the same name as a managed data identifier.
   */
  public override fun name(): String = unwrap(this).getName()

  /**
   * * the regular expresssion to detect and mask log events for.
   */
  public open fun regex(): String = unwrap(this).getRegex()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CustomDataIdentifier):
        CustomDataIdentifier = CustomDataIdentifier(cdkObject)

    internal fun unwrap(wrapped: CustomDataIdentifier):
        software.amazon.awscdk.services.logs.CustomDataIdentifier = wrapped.cdkObject
  }
}
