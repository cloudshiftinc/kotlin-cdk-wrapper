@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The RemoveTag Aspect will handle removing tags from this node and children.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * RemoveTag removeTag = RemoveTag.Builder.create("key")
 * .applyToLaunchedInstances(false)
 * .excludeResourceTypes(List.of("excludeResourceTypes"))
 * .includeResourceTypes(List.of("includeResourceTypes"))
 * .priority(123)
 * .build();
 * ```
 */
public open class RemoveTag(
  cdkObject: software.amazon.awscdk.RemoveTag,
) : CdkObject(cdkObject), IAspect {
  public constructor(key: String) : this(software.amazon.awscdk.RemoveTag(key)
  )

  public constructor(key: String, props: TagProps) : this(software.amazon.awscdk.RemoveTag(key,
      props.let(TagProps.Companion::unwrap))
  )

  public constructor(key: String, props: TagProps.Builder.() -> Unit) : this(key, TagProps(props)
  )

  /**
   * The string key for the tag.
   */
  public open fun key(): String = unwrap(this).getKey()

  /**
   * All aspects can visit an IConstruct.
   *
   * @param construct 
   */
  public override fun visit(construct: IConstruct) {
    unwrap(this).visit(construct.let(IConstruct.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.RemoveTag].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the tag should be applied to instances in an AutoScalingGroup.
     *
     * Default: true
     *
     * @param applyToLaunchedInstances Whether the tag should be applied to instances in an
     * AutoScalingGroup. 
     */
    public fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean)

    /**
     * An array of Resource Types that will not receive this tag.
     *
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     *
     * Default: []
     *
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag. 
     */
    public fun excludeResourceTypes(excludeResourceTypes: List<String>)

    /**
     * An array of Resource Types that will not receive this tag.
     *
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     *
     * Default: []
     *
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag. 
     */
    public fun excludeResourceTypes(vararg excludeResourceTypes: String)

    /**
     * An array of Resource Types that will receive this tag.
     *
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     *
     * Default: []
     *
     * @param includeResourceTypes An array of Resource Types that will receive this tag. 
     */
    public fun includeResourceTypes(includeResourceTypes: List<String>)

    /**
     * An array of Resource Types that will receive this tag.
     *
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     *
     * Default: []
     *
     * @param includeResourceTypes An array of Resource Types that will receive this tag. 
     */
    public fun includeResourceTypes(vararg includeResourceTypes: String)

    /**
     * Priority of the tag operation.
     *
     * Higher or equal priority tags will take precedence.
     *
     * Setting priority will enable the user to control tags when they need to not
     * follow the default precedence pattern of last applied and closest to the
     * construct in the tree.
     *
     * Default: Default priorities:
     * - 100 for `SetTag`
     * - 200 for `RemoveTag`
     * - 50 for tags added directly to CloudFormation resources
     *
     * @param priority Priority of the tag operation. 
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl(
    key: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.RemoveTag.Builder =
        software.amazon.awscdk.RemoveTag.Builder.create(key)

    /**
     * Whether the tag should be applied to instances in an AutoScalingGroup.
     *
     * Default: true
     *
     * @param applyToLaunchedInstances Whether the tag should be applied to instances in an
     * AutoScalingGroup. 
     */
    override fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean) {
      cdkBuilder.applyToLaunchedInstances(applyToLaunchedInstances)
    }

    /**
     * An array of Resource Types that will not receive this tag.
     *
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     *
     * Default: []
     *
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag. 
     */
    override fun excludeResourceTypes(excludeResourceTypes: List<String>) {
      cdkBuilder.excludeResourceTypes(excludeResourceTypes)
    }

    /**
     * An array of Resource Types that will not receive this tag.
     *
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     *
     * Default: []
     *
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag. 
     */
    override fun excludeResourceTypes(vararg excludeResourceTypes: String): Unit =
        excludeResourceTypes(excludeResourceTypes.toList())

    /**
     * An array of Resource Types that will receive this tag.
     *
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     *
     * Default: []
     *
     * @param includeResourceTypes An array of Resource Types that will receive this tag. 
     */
    override fun includeResourceTypes(includeResourceTypes: List<String>) {
      cdkBuilder.includeResourceTypes(includeResourceTypes)
    }

    /**
     * An array of Resource Types that will receive this tag.
     *
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     *
     * Default: []
     *
     * @param includeResourceTypes An array of Resource Types that will receive this tag. 
     */
    override fun includeResourceTypes(vararg includeResourceTypes: String): Unit =
        includeResourceTypes(includeResourceTypes.toList())

    /**
     * Priority of the tag operation.
     *
     * Higher or equal priority tags will take precedence.
     *
     * Setting priority will enable the user to control tags when they need to not
     * follow the default precedence pattern of last applied and closest to the
     * construct in the tree.
     *
     * Default: Default priorities:
     * - 100 for `SetTag`
     * - 200 for `RemoveTag`
     * - 50 for tags added directly to CloudFormation resources
     *
     * @param priority Priority of the tag operation. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.RemoveTag = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(key: String, block: Builder.() -> Unit = {}): RemoveTag {
      val builderImpl = BuilderImpl(key)
      return RemoveTag(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.RemoveTag): RemoveTag = RemoveTag(cdkObject)

    internal fun unwrap(wrapped: RemoveTag): software.amazon.awscdk.RemoveTag = wrapped.cdkObject as
        software.amazon.awscdk.RemoveTag
  }
}
