package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class DataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.DataIdentifier,
) : CdkObject(cdkObject) {
  /**
   * * name of the identifier.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataIdentifier):
        DataIdentifier = DataIdentifier(cdkObject)

    internal fun unwrap(wrapped: DataIdentifier):
        software.amazon.awscdk.services.logs.DataIdentifier = wrapped.cdkObject
  }
}
