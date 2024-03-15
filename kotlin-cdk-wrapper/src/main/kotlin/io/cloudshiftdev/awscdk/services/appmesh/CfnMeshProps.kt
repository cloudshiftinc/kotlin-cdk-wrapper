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

public interface CfnMeshProps {
  public fun meshName(): String? = unwrap(this).getMeshName()

  public fun spec(): Any? = unwrap(this).getSpec()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun meshName(meshName: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: CfnMesh.MeshSpecProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308904f39ab1f4cb6ab9a49a788ef680324e47f1b2d2d1efd3bb81673670d9ab")
    public fun spec(spec: CfnMesh.MeshSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnMeshProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnMeshProps.builder()

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: CfnMesh.MeshSpecProperty) {
      cdkBuilder.spec(spec.let(CfnMesh.MeshSpecProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308904f39ab1f4cb6ab9a49a788ef680324e47f1b2d2d1efd3bb81673670d9ab")
    override fun spec(spec: CfnMesh.MeshSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnMesh.MeshSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.CfnMeshProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnMeshProps,
  ) : CdkObject(cdkObject), CfnMeshProps {
    override fun meshName(): String? = unwrap(this).getMeshName()

    override fun spec(): Any? = unwrap(this).getSpec()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMeshProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMeshProps): CfnMeshProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMeshProps): software.amazon.awscdk.services.appmesh.CfnMeshProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnMeshProps
  }
}
