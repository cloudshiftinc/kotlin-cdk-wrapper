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

public open class Tag internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Tag,
) : CdkObject(cdkObject), IAspect {
  public open fun key(): String = unwrap(this).getKey()

  public open fun `value`(): String = unwrap(this).getValue()

  public override fun visit(construct: IConstruct) {
    unwrap(this).visit(construct.let(IConstruct::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean)

    public fun excludeResourceTypes(excludeResourceTypes: List<String>)

    public fun excludeResourceTypes(vararg excludeResourceTypes: String)

    public fun includeResourceTypes(includeResourceTypes: List<String>)

    public fun includeResourceTypes(vararg includeResourceTypes: String)

    public fun priority(priority: Number)
  }

  private class BuilderImpl(
    key: String,
    `value`: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Tag.Builder =
        software.amazon.awscdk.Tag.Builder.create(key, `value`)

    override fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean) {
      cdkBuilder.applyToLaunchedInstances(applyToLaunchedInstances)
    }

    override fun excludeResourceTypes(excludeResourceTypes: List<String>) {
      cdkBuilder.excludeResourceTypes(excludeResourceTypes)
    }

    override fun excludeResourceTypes(vararg excludeResourceTypes: String): Unit =
        excludeResourceTypes(excludeResourceTypes.toList())

    override fun includeResourceTypes(includeResourceTypes: List<String>) {
      cdkBuilder.includeResourceTypes(includeResourceTypes)
    }

    override fun includeResourceTypes(vararg includeResourceTypes: String): Unit =
        includeResourceTypes(includeResourceTypes.toList())

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.Tag = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      key: String,
      `value`: String,
      block: Builder.() -> Unit = {},
    ): Tag {
      val builderImpl = BuilderImpl(key, `value`)
      return Tag(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Tag): Tag = Tag(cdkObject)

    internal fun unwrap(wrapped: Tag): software.amazon.awscdk.Tag = wrapped.cdkObject
  }
}
