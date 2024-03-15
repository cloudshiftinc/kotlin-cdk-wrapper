@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class TagManager internal constructor(
  internal override val cdkObject: software.amazon.awscdk.TagManager,
) : CdkObject(cdkObject) {
  public open fun applyTagAspectHere(): Boolean = unwrap(this).applyTagAspectHere()

  public open fun applyTagAspectHere(include: List<String>): Boolean =
      unwrap(this).applyTagAspectHere(include)

  public open fun applyTagAspectHere(vararg include: String): Boolean =
      applyTagAspectHere(include.toList())

  public open fun applyTagAspectHere(include: List<String>, exclude: List<String>): Boolean =
      unwrap(this).applyTagAspectHere(include, exclude)

  public open fun hasTags(): Boolean = unwrap(this).hasTags()

  public open fun removeTag(key: String, priority: Number) {
    unwrap(this).removeTag(key, priority)
  }

  public open fun renderTags(): Any = unwrap(this).renderTags()

  public open fun renderTags(combineWithTags: Any): Any = unwrap(this).renderTags(combineWithTags)

  public open fun renderedTags(): IResolvable =
      unwrap(this).getRenderedTags().let(IResolvable::wrap)

  public open fun tag(key: String, `value`: String) {
    unwrap(this).setTag(key, `value`)
  }

  public open fun tag(
    key: String,
    `value`: String,
    priority: Number,
  ) {
    unwrap(this).setTag(key, `value`, priority)
  }

  public open fun tag(
    key: String,
    `value`: String,
    priority: Number,
    applyToLaunchedInstances: Boolean,
  ) {
    unwrap(this).setTag(key, `value`, priority, applyToLaunchedInstances)
  }

  public open fun tagPropertyName(): String = unwrap(this).getTagPropertyName()

  public open fun tagValues(): Map<String, String> = unwrap(this).tagValues() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun tagPropertyName(tagPropertyName: String)
  }

  private class BuilderImpl(
    tagType: software.amazon.awscdk.TagType,
    resourceTypeName: String,
    initialTags: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.TagManager.Builder =
        software.amazon.awscdk.TagManager.Builder.create(tagType, resourceTypeName, initialTags)

    override fun tagPropertyName(tagPropertyName: String) {
      cdkBuilder.tagPropertyName(tagPropertyName)
    }

    public fun build(): software.amazon.awscdk.TagManager = cdkBuilder.build()
  }

  public companion object {
    public fun isTaggable(construct: Any): Boolean =
        software.amazon.awscdk.TagManager.isTaggable(construct)

    public fun isTaggableV2(construct: Any): Boolean =
        software.amazon.awscdk.TagManager.isTaggableV2(construct)

    public fun of(construct: Any): TagManager? =
        software.amazon.awscdk.TagManager.of(construct)?.let(TagManager::wrap)

    public operator fun invoke(
      tagType: TagType,
      resourceTypeName: String,
      initialTags: Any,
      block: Builder.() -> Unit = {},
    ): TagManager {
      val builderImpl = BuilderImpl(TagType.unwrap(tagType), resourceTypeName, initialTags)
      return TagManager(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TagManager): TagManager =
        TagManager(cdkObject)

    internal fun unwrap(wrapped: TagManager): software.amazon.awscdk.TagManager = wrapped.cdkObject
  }
}
