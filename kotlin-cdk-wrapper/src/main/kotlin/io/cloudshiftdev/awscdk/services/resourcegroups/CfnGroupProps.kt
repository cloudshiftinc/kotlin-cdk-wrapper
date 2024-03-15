@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourcegroups

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGroupProps {
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun resourceQuery(): Any? = unwrap(this).getResourceQuery()

  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: List<Any>)

    public fun configuration(vararg configuration: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun resourceQuery(resourceQuery: IResolvable)

    public fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04f0cd737f2749c89b1160d907b3af835166900af06845e37fc00a0e7fc24b56")
    public fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty.Builder.() -> Unit)

    public fun resources(resources: List<String>)

    public fun resources(vararg resources: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourcegroups.CfnGroupProps.Builder =
        software.amazon.awscdk.services.resourcegroups.CfnGroupProps.builder()

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: List<Any>) {
      cdkBuilder.configuration(configuration)
    }

    override fun configuration(vararg configuration: Any): Unit =
        configuration(configuration.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resourceQuery(resourceQuery: IResolvable) {
      cdkBuilder.resourceQuery(resourceQuery.let(IResolvable::unwrap))
    }

    override fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty) {
      cdkBuilder.resourceQuery(resourceQuery.let(CfnGroup.ResourceQueryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04f0cd737f2749c89b1160d907b3af835166900af06845e37fc00a0e7fc24b56")
    override fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty.Builder.() -> Unit):
        Unit = resourceQuery(CfnGroup.ResourceQueryProperty(resourceQuery))

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun resourceQuery(): Any? = unwrap(this).getResourceQuery()

    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroupProps):
        CfnGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps):
        software.amazon.awscdk.services.resourcegroups.CfnGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.resourcegroups.CfnGroupProps
  }
}
