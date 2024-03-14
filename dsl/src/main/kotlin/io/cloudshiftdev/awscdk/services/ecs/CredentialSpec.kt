package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String

public open class CredentialSpec internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec,
) {
  public open fun bind(): CredentialSpecConfig = unwrap(this).bind().let(CredentialSpecConfig::wrap)

  public open fun fileLocation(): String = unwrap(this).getFileLocation()

  public open fun prefixId(): String = unwrap(this).getPrefixId()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec): CredentialSpec
        = CredentialSpec(cdkObject)

    internal fun unwrap(wrapped: CredentialSpec): software.amazon.awscdk.services.ecs.CredentialSpec
        = wrapped.cdkObject
  }
}
