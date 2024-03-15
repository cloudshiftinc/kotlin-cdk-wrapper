@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVirtualNodeProps {
  public fun meshName(): String

  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public fun spec(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()

  @CdkDslMarker
  public interface Builder {
    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("501c52cfcaebe3dbaea190f62334124725f535e05c621bfa3286df9e364a4cc1")
    public fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps.builder()

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty) {
      cdkBuilder.spec(spec.let(CfnVirtualNode.VirtualNodeSpecProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("501c52cfcaebe3dbaea190f62334124725f535e05c621bfa3286df9e364a4cc1")
    override fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnVirtualNode.VirtualNodeSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps,
  ) : CdkObject(cdkObject), CfnVirtualNodeProps {
    override fun meshName(): String = unwrap(this).getMeshName()

    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    override fun spec(): Any = unwrap(this).getSpec()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualNodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps):
        CfnVirtualNodeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualNodeProps):
        software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps
  }
}
