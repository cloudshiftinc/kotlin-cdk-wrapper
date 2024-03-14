package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class ResourceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.ResourceType,
) : CdkObject(cdkObject) {
  /**
   * Valid value of resource type.
   */
  public open fun complianceResourceType(): String = unwrap(this).getComplianceResourceType()

  public companion object {
    public fun of(type: String): ResourceType =
        software.amazon.awscdk.services.config.ResourceType.of(type).let(ResourceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.ResourceType): ResourceType
        = ResourceType(cdkObject)

    internal fun unwrap(wrapped: ResourceType): software.amazon.awscdk.services.config.ResourceType
        = wrapped.cdkObject
  }
}
