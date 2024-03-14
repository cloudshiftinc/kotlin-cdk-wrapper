package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class KeyAlgorithm internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.certificatemanager.KeyAlgorithm,
) : CdkObject(cdkObject) {
  /**
   * The name of the algorithm.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.KeyAlgorithm):
        KeyAlgorithm = KeyAlgorithm(cdkObject)

    internal fun unwrap(wrapped: KeyAlgorithm):
        software.amazon.awscdk.services.certificatemanager.KeyAlgorithm = wrapped.cdkObject
  }
}
