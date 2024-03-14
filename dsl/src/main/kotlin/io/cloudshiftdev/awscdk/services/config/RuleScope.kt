package io.cloudshiftdev.awscdk.services.config

import kotlin.String
import kotlin.collections.List

public open class RuleScope internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.RuleScope,
) {
  public open fun key(): String? = unwrap(this).getKey()

  public open fun resourceId(): String? = unwrap(this).getResourceId()

  public open fun resourceTypes(): List<ResourceType> =
      unwrap(this).getResourceTypes()?.map(ResourceType::wrap) ?: emptyList()

  public open fun `value`(): String? = unwrap(this).getValue()

  public companion object {
    public open fun fromResource(resourceType: ResourceType): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromResource(resourceType.let(ResourceType::unwrap)).let(RuleScope::wrap)

    public open fun fromResource(resourceType: ResourceType, resourceId: String): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromResource(resourceType.let(ResourceType::unwrap),
        resourceId).let(RuleScope::wrap)

    public open fun fromResources(resourceTypes: List<ResourceType>): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromResources(resourceTypes.map(ResourceType::unwrap)).let(RuleScope::wrap)

    public open fun fromResources(vararg resourceTypes: ResourceType): RuleScope =
        fromResources(resourceTypes.toList())

    public open fun fromTag(key: String): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromTag(key).let(RuleScope::wrap)

    public open fun fromTag(key: String, `value`: String): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromTag(key, `value`).let(RuleScope::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.RuleScope): RuleScope =
        RuleScope(cdkObject)

    internal fun unwrap(wrapped: RuleScope): software.amazon.awscdk.services.config.RuleScope =
        wrapped.cdkObject
  }
}
