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

/**
 * TagManager facilitates a common implementation of tagging for Constructs.
 *
 * Normally, you do not need to use this class, as the CloudFormation specification
 * will indicate which resources are taggable. However, sometimes you will need this
 * to make custom resources taggable. Used `tagManager.renderedTags` to obtain a
 * value that will resolve to the tags at synthesis time.
 *
 * Example:
 *
 * ```
 * public class MyConstruct extends Resource implements ITaggable {
 * public final Object tags;
 * public MyConstruct(Construct scope, String id) {
 * super(scope, id);
 * CfnResource.Builder.create(this, "Resource")
 * .type("Whatever::The::Type")
 * .properties(Map.of(
 * // ...
 * "Tags", this.tags.getRenderedTags()))
 * .build();
 * }
 * }
 * ```
 */
public open class TagManager(
  cdkObject: software.amazon.awscdk.TagManager,
) : CdkObject(cdkObject) {
  public constructor(tagType: TagType, resourceTypeName: String) :
      this(software.amazon.awscdk.TagManager(tagType.let(TagType.Companion::unwrap),
      resourceTypeName)
  )

  public constructor(
    tagType: TagType,
    resourceTypeName: String,
    initialTags: Any,
  ) : this(software.amazon.awscdk.TagManager(tagType.let(TagType.Companion::unwrap),
      resourceTypeName, initialTags)
  )

  public constructor(
    tagType: TagType,
    resourceTypeName: String,
    initialTags: Any,
    options: TagManagerOptions,
  ) : this(software.amazon.awscdk.TagManager(tagType.let(TagType.Companion::unwrap),
      resourceTypeName, initialTags, options.let(TagManagerOptions.Companion::unwrap))
  )

  public constructor(
    tagType: TagType,
    resourceTypeName: String,
    initialTags: Any,
    options: TagManagerOptions.Builder.() -> Unit,
  ) : this(tagType, resourceTypeName, initialTags, TagManagerOptions(options)
  )

  /**
   * Determine if the aspect applies here.
   *
   * Looks at the include and exclude resourceTypeName arrays to determine if
   * the aspect applies here
   *
   * @param include
   * @param exclude
   */
  public open fun applyTagAspectHere(): Boolean = unwrap(this).applyTagAspectHere()

  /**
   * Determine if the aspect applies here.
   *
   * Looks at the include and exclude resourceTypeName arrays to determine if
   * the aspect applies here
   *
   * @param include
   * @param exclude
   */
  public open fun applyTagAspectHere(include: List<String>): Boolean =
      unwrap(this).applyTagAspectHere(include)

  /**
   * Determine if the aspect applies here.
   *
   * Looks at the include and exclude resourceTypeName arrays to determine if
   * the aspect applies here
   *
   * @param include
   * @param exclude
   */
  public open fun applyTagAspectHere(vararg include: String): Boolean =
      applyTagAspectHere(include.toList())

  /**
   * Determine if the aspect applies here.
   *
   * Looks at the include and exclude resourceTypeName arrays to determine if
   * the aspect applies here
   *
   * @param include
   * @param exclude
   */
  public open fun applyTagAspectHere(include: List<String>, exclude: List<String>): Boolean =
      unwrap(this).applyTagAspectHere(include, exclude)

  /**
   * Returns true if there are any tags defined.
   */
  public open fun hasTags(): Boolean = unwrap(this).hasTags()

  /**
   * Removes the specified tag from the array if it exists.
   *
   * @param key The tag to remove. 
   * @param priority The priority of the remove operation. 
   */
  public open fun removeTag(key: String, priority: Number) {
    unwrap(this).removeTag(key, priority)
  }

  /**
   * Renders tags into the proper format based on TagType.
   *
   * This method will eagerly render the tags currently applied. In
   * most cases, you should be using `tagManager.renderedTags` instead,
   * which will return a `Lazy` value that will resolve to the correct
   * tags at synthesis time.
   *
   * @param combineWithTags
   */
  public open fun renderTags(): Any = unwrap(this).renderTags()

  /**
   * Renders tags into the proper format based on TagType.
   *
   * This method will eagerly render the tags currently applied. In
   * most cases, you should be using `tagManager.renderedTags` instead,
   * which will return a `Lazy` value that will resolve to the correct
   * tags at synthesis time.
   *
   * @param combineWithTags
   */
  public open fun renderTags(combineWithTags: Any): Any = unwrap(this).renderTags(combineWithTags)

  /**
   * A lazy value that represents the rendered tags at synthesis time.
   *
   * If you need to make a custom construct taggable, use the value of this
   * property to pass to the `tags` property of the underlying construct.
   */
  public open fun renderedTags(): IResolvable =
      unwrap(this).getRenderedTags().let(IResolvable::wrap)

  /**
   * Adds the specified tag to the array of tags.
   *
   * @param key 
   * @param value 
   * @param priority
   * @param applyToLaunchedInstances
   */
  public open fun tag(key: String, `value`: String) {
    unwrap(this).setTag(key, `value`)
  }

  /**
   * Adds the specified tag to the array of tags.
   *
   * @param key 
   * @param value 
   * @param priority
   * @param applyToLaunchedInstances
   */
  public open fun tag(
    key: String,
    `value`: String,
    priority: Number,
  ) {
    unwrap(this).setTag(key, `value`, priority)
  }

  /**
   * Adds the specified tag to the array of tags.
   *
   * @param key 
   * @param value 
   * @param priority
   * @param applyToLaunchedInstances
   */
  public open fun tag(
    key: String,
    `value`: String,
    priority: Number,
    applyToLaunchedInstances: Boolean,
  ) {
    unwrap(this).setTag(key, `value`, priority, applyToLaunchedInstances)
  }

  /**
   * The property name for tag values.
   *
   * Normally this is `tags` but some resources choose a different name. Cognito
   * UserPool uses UserPoolTags
   */
  public open fun tagPropertyName(): String = unwrap(this).getTagPropertyName()

  /**
   * Render the tags in a readable format.
   */
  public open fun tagValues(): Map<String, String> = unwrap(this).tagValues() ?: emptyMap()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.TagManager].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the property in CloudFormation for these tags.
     *
     * Normally this is `tags`, but Cognito UserPool uses UserPoolTags
     *
     * Default: "tags"
     *
     * @param tagPropertyName The name of the property in CloudFormation for these tags. 
     */
    public fun tagPropertyName(tagPropertyName: String)
  }

  private class BuilderImpl(
    tagType: software.amazon.awscdk.TagType,
    resourceTypeName: String,
    initialTags: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.TagManager.Builder =
        software.amazon.awscdk.TagManager.Builder.create(tagType, resourceTypeName, initialTags)

    /**
     * The name of the property in CloudFormation for these tags.
     *
     * Normally this is `tags`, but Cognito UserPool uses UserPoolTags
     *
     * Default: "tags"
     *
     * @param tagPropertyName The name of the property in CloudFormation for these tags. 
     */
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
        as software.amazon.awscdk.TagManager
  }
}
