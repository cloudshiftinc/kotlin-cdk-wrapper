package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class CredentialSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec,
) : CdkObject(cdkObject) {
  /**
   * Called when the container is initialized to allow this object to bind to the stack.
   */
  public open fun bind(): CredentialSpecConfig = unwrap(this).bind().let(CredentialSpecConfig::wrap)

  /**
   * Location or ARN from where to retrieve the CredSpec file.
   */
  public open fun fileLocation(): String = unwrap(this).getFileLocation()

  /**
   * Prefix string based on the type of CredSpec.
   */
  public open fun prefixId(): String = unwrap(this).getPrefixId()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec): CredentialSpec
        = CredentialSpec(cdkObject)

    internal fun unwrap(wrapped: CredentialSpec): software.amazon.awscdk.services.ecs.CredentialSpec
        = wrapped.cdkObject
  }
}
