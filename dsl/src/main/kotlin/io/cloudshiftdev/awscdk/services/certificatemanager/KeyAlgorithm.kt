package io.cloudshiftdev.awscdk.services.certificatemanager

import kotlin.String

public open class KeyAlgorithm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.certificatemanager.KeyAlgorithm,
) {
  /**
   * The name of the algorithm.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.KeyAlgorithm):
        KeyAlgorithm = KeyAlgorithm(cdkObject)

    internal fun unwrap(wrapped: KeyAlgorithm):
        software.amazon.awscdk.services.certificatemanager.KeyAlgorithm = wrapped.cdkObject
  }
}
