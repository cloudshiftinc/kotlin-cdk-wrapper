package io.cloudshiftdev.awscdk.services.logs

import kotlin.String

public open class DataIdentifier internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.DataIdentifier,
) {
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataIdentifier):
        DataIdentifier = DataIdentifier(cdkObject)

    internal fun unwrap(wrapped: DataIdentifier):
        software.amazon.awscdk.services.logs.DataIdentifier = wrapped.cdkObject
  }
}
