@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnViewProps {
  public fun filters(): Any? = unwrap(this).getFilters()

  public fun includedProperties(): Any? = unwrap(this).getIncludedProperties()

  public fun scope(): String? = unwrap(this).getScope()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun viewName(): String

  @CdkDslMarker
  public interface Builder {
    public fun filters(filters: IResolvable)

    public fun filters(filters: CfnView.FiltersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("751df53b03533d1981c5b61c14a1dc7b1a5567bfee844a82c82942bf6361a8c6")
    public fun filters(filters: CfnView.FiltersProperty.Builder.() -> Unit)

    public fun includedProperties(includedProperties: IResolvable)

    public fun includedProperties(includedProperties: List<Any>)

    public fun includedProperties(vararg includedProperties: Any)

    public fun scope(scope: String)

    public fun tags(tags: Map<String, String>)

    public fun viewName(viewName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnViewProps.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnViewProps.builder()

    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    override fun filters(filters: CfnView.FiltersProperty) {
      cdkBuilder.filters(filters.let(CfnView.FiltersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("751df53b03533d1981c5b61c14a1dc7b1a5567bfee844a82c82942bf6361a8c6")
    override fun filters(filters: CfnView.FiltersProperty.Builder.() -> Unit): Unit =
        filters(CfnView.FiltersProperty(filters))

    override fun includedProperties(includedProperties: IResolvable) {
      cdkBuilder.includedProperties(includedProperties.let(IResolvable::unwrap))
    }

    override fun includedProperties(includedProperties: List<Any>) {
      cdkBuilder.includedProperties(includedProperties)
    }

    override fun includedProperties(vararg includedProperties: Any): Unit =
        includedProperties(includedProperties.toList())

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun viewName(viewName: String) {
      cdkBuilder.viewName(viewName)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnViewProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnViewProps,
  ) : CdkObject(cdkObject), CfnViewProps {
    override fun filters(): Any? = unwrap(this).getFilters()

    override fun includedProperties(): Any? = unwrap(this).getIncludedProperties()

    override fun scope(): String? = unwrap(this).getScope()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun viewName(): String = unwrap(this).getViewName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnViewProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnViewProps):
        CfnViewProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnViewProps):
        software.amazon.awscdk.services.resourceexplorer2.CfnViewProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.resourceexplorer2.CfnViewProps
  }
}
