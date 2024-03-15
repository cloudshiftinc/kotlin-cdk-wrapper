@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TagProps {
  public fun applyToLaunchedInstances(): Boolean? = unwrap(this).getApplyToLaunchedInstances()

  public fun excludeResourceTypes(): List<String> = unwrap(this).getExcludeResourceTypes() ?:
      emptyList()

  public fun includeResourceTypes(): List<String> = unwrap(this).getIncludeResourceTypes() ?:
      emptyList()

  public fun priority(): Number? = unwrap(this).getPriority()

  @CdkDslMarker
  public interface Builder {
    public fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean)

    public fun excludeResourceTypes(excludeResourceTypes: List<String>)

    public fun excludeResourceTypes(vararg excludeResourceTypes: String)

    public fun includeResourceTypes(includeResourceTypes: List<String>)

    public fun includeResourceTypes(vararg includeResourceTypes: String)

    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.TagProps.Builder =
        software.amazon.awscdk.TagProps.builder()

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

    public fun build(): software.amazon.awscdk.TagProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.TagProps,
  ) : CdkObject(cdkObject), TagProps {
    override fun applyToLaunchedInstances(): Boolean? = unwrap(this).getApplyToLaunchedInstances()

    override fun excludeResourceTypes(): List<String> = unwrap(this).getExcludeResourceTypes() ?:
        emptyList()

    override fun includeResourceTypes(): List<String> = unwrap(this).getIncludeResourceTypes() ?:
        emptyList()

    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TagProps): TagProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagProps): software.amazon.awscdk.TagProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.TagProps
  }
}
