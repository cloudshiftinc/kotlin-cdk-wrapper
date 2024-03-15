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

public interface CfnVirtualServiceProps {
  public fun meshName(): String

  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public fun spec(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun virtualServiceName(): String

  @CdkDslMarker
  public interface Builder {
    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5015982db1d5e31c2ac4864f9eb9786434c2f9208d05e48e5656aae8c140407e")
    public fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun virtualServiceName(virtualServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps.builder()

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty) {
      cdkBuilder.spec(spec.let(CfnVirtualService.VirtualServiceSpecProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5015982db1d5e31c2ac4864f9eb9786434c2f9208d05e48e5656aae8c140407e")
    override fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnVirtualService.VirtualServiceSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps,
  ) : CdkObject(cdkObject), CfnVirtualServiceProps {
    override fun meshName(): String = unwrap(this).getMeshName()

    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    override fun spec(): Any = unwrap(this).getSpec()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps):
        CfnVirtualServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualServiceProps):
        software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps
  }
}
