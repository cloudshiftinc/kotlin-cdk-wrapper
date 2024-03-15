@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface KubernetesPatchProps {
  public fun applyPatch(): Map<String, Any>

  public fun cluster(): ICluster

  public fun patchType(): PatchType? = unwrap(this).getPatchType()?.let(PatchType::wrap)

  public fun resourceName(): String

  public fun resourceNamespace(): String? = unwrap(this).getResourceNamespace()

  public fun restorePatch(): Map<String, Any>

  @CdkDslMarker
  public interface Builder {
    public fun applyPatch(applyPatch: Map<String, Any>)

    public fun cluster(cluster: ICluster)

    public fun patchType(patchType: PatchType)

    public fun resourceName(resourceName: String)

    public fun resourceNamespace(resourceNamespace: String)

    public fun restorePatch(restorePatch: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesPatchProps.Builder =
        software.amazon.awscdk.services.eks.KubernetesPatchProps.builder()

    override fun applyPatch(applyPatch: Map<String, Any>) {
      cdkBuilder.applyPatch(applyPatch)
    }

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun patchType(patchType: PatchType) {
      cdkBuilder.patchType(patchType.let(PatchType::unwrap))
    }

    override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    override fun resourceNamespace(resourceNamespace: String) {
      cdkBuilder.resourceNamespace(resourceNamespace)
    }

    override fun restorePatch(restorePatch: Map<String, Any>) {
      cdkBuilder.restorePatch(restorePatch)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesPatchProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.KubernetesPatchProps,
  ) : CdkObject(cdkObject), KubernetesPatchProps {
    override fun applyPatch(): Map<String, Any> = unwrap(this).getApplyPatch() ?: emptyMap()

    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun patchType(): PatchType? = unwrap(this).getPatchType()?.let(PatchType::wrap)

    override fun resourceName(): String = unwrap(this).getResourceName()

    override fun resourceNamespace(): String? = unwrap(this).getResourceNamespace()

    override fun restorePatch(): Map<String, Any> = unwrap(this).getRestorePatch() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesPatchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesPatchProps):
        KubernetesPatchProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubernetesPatchProps):
        software.amazon.awscdk.services.eks.KubernetesPatchProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.KubernetesPatchProps
  }
}
