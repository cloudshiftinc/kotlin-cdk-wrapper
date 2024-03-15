@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnSignalCatalogProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun nodeCounts(): Any? = unwrap(this).getNodeCounts()

  public fun nodes(): Any? = unwrap(this).getNodes()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun nodeCounts(nodeCounts: IResolvable)

    public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02f0808b2e70cce5f50eeeea5f16cf5de52ab90b5e6c4d843514fa5207446fbd")
    public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty.Builder.() -> Unit)

    public fun nodes(nodes: IResolvable)

    public fun nodes(nodes: List<Any>)

    public fun nodes(vararg nodes: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun nodeCounts(nodeCounts: IResolvable) {
      cdkBuilder.nodeCounts(nodeCounts.let(IResolvable::unwrap))
    }

    override fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty) {
      cdkBuilder.nodeCounts(nodeCounts.let(CfnSignalCatalog.NodeCountsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02f0808b2e70cce5f50eeeea5f16cf5de52ab90b5e6c4d843514fa5207446fbd")
    override fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty.Builder.() -> Unit):
        Unit = nodeCounts(CfnSignalCatalog.NodeCountsProperty(nodeCounts))

    override fun nodes(nodes: IResolvable) {
      cdkBuilder.nodes(nodes.let(IResolvable::unwrap))
    }

    override fun nodes(nodes: List<Any>) {
      cdkBuilder.nodes(nodes)
    }

    override fun nodes(vararg nodes: Any): Unit = nodes(nodes.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps,
  ) : CdkObject(cdkObject), CfnSignalCatalogProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun nodeCounts(): Any? = unwrap(this).getNodeCounts()

    override fun nodes(): Any? = unwrap(this).getNodes()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSignalCatalogProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps):
        CfnSignalCatalogProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSignalCatalogProps):
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps
  }
}
