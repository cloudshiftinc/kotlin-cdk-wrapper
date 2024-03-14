package io.cloudshiftdev.awscdk.services.config

import kotlin.String

public open class ResourceType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.ResourceType,
) {
  public open fun complianceResourceType(): String = unwrap(this).getComplianceResourceType()

  public companion object {
    public open fun of(type: String): ResourceType =
        software.amazon.awscdk.services.config.ResourceType.of(type).let(ResourceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.ResourceType): ResourceType
        = ResourceType(cdkObject)

    internal fun unwrap(wrapped: ResourceType): software.amazon.awscdk.services.config.ResourceType
        = wrapped.cdkObject
  }
}
