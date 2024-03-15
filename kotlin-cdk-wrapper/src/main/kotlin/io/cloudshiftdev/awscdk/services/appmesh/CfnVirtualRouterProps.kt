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

public interface CfnVirtualRouterProps {
  public fun meshName(): String

  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public fun spec(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()

  @CdkDslMarker
  public interface Builder {
    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: CfnVirtualRouter.VirtualRouterSpecProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38688338386ed44de1571840a3ff881e54800adcdcd1ef0dd036e8834cee97f6")
    public fun spec(spec: CfnVirtualRouter.VirtualRouterSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps.builder()

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: CfnVirtualRouter.VirtualRouterSpecProperty) {
      cdkBuilder.spec(spec.let(CfnVirtualRouter.VirtualRouterSpecProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38688338386ed44de1571840a3ff881e54800adcdcd1ef0dd036e8834cee97f6")
    override fun spec(spec: CfnVirtualRouter.VirtualRouterSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnVirtualRouter.VirtualRouterSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps,
  ) : CdkObject(cdkObject), CfnVirtualRouterProps {
    override fun meshName(): String = unwrap(this).getMeshName()

    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    override fun spec(): Any = unwrap(this).getSpec()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualRouterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps):
        CfnVirtualRouterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualRouterProps):
        software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps
  }
}
