package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Runtime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.synthetics.Runtime,
) : CdkObject(cdkObject) {
  /**
   * The Lambda runtime family.
   */
  public open fun family(): RuntimeFamily = unwrap(this).getFamily().let(RuntimeFamily::wrap)

  /**
   * The name of the runtime version.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Runtime): Runtime =
        Runtime(cdkObject)

    internal fun unwrap(wrapped: Runtime): software.amazon.awscdk.services.synthetics.Runtime =
        wrapped.cdkObject
  }
}
