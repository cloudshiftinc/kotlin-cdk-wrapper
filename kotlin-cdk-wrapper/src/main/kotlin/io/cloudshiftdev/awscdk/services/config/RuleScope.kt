@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class RuleScope internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.RuleScope,
) : CdkObject(cdkObject) {
  public open fun key(): String? = unwrap(this).getKey()

  public open fun resourceId(): String? = unwrap(this).getResourceId()

  public open fun resourceTypes(): List<ResourceType> =
      unwrap(this).getResourceTypes()?.map(ResourceType::wrap) ?: emptyList()

  public open fun `value`(): String? = unwrap(this).getValue()

  public companion object {
    public fun fromResource(resourceType: ResourceType): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromResource(resourceType.let(ResourceType::unwrap)).let(RuleScope::wrap)

    public fun fromResource(resourceType: ResourceType, resourceId: String): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromResource(resourceType.let(ResourceType::unwrap),
        resourceId).let(RuleScope::wrap)

    public fun fromResources(resourceTypes: List<ResourceType>): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromResources(resourceTypes.map(ResourceType::unwrap)).let(RuleScope::wrap)

    public fun fromResources(vararg resourceTypes: ResourceType): RuleScope =
        fromResources(resourceTypes.toList())

    public fun fromTag(key: String): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromTag(key).let(RuleScope::wrap)

    public fun fromTag(key: String, `value`: String): RuleScope =
        software.amazon.awscdk.services.config.RuleScope.fromTag(key, `value`).let(RuleScope::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.RuleScope): RuleScope =
        RuleScope(cdkObject)

    internal fun unwrap(wrapped: RuleScope): software.amazon.awscdk.services.config.RuleScope =
        wrapped.cdkObject
  }
}
