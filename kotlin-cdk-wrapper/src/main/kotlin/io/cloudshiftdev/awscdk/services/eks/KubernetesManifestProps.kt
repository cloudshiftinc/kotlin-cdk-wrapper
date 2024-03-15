@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface KubernetesManifestProps : KubernetesManifestOptions {
  public fun cluster(): ICluster

  public fun manifest(): List<Map<String, Any>>

  public fun overwrite(): Boolean? = unwrap(this).getOverwrite()

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun ingressAlb(ingressAlb: Boolean)

    public fun ingressAlbScheme(ingressAlbScheme: AlbScheme)

    public fun manifest(manifest: List<Map<String, Any>>)

    public fun manifest(vararg manifest: Map<String, Any>)

    public fun overwrite(overwrite: Boolean)

    public fun prune(prune: Boolean)

    public fun skipValidation(skipValidation: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesManifestProps.Builder =
        software.amazon.awscdk.services.eks.KubernetesManifestProps.builder()

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun ingressAlb(ingressAlb: Boolean) {
      cdkBuilder.ingressAlb(ingressAlb)
    }

    override fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
      cdkBuilder.ingressAlbScheme(ingressAlbScheme.let(AlbScheme::unwrap))
    }

    override fun manifest(manifest: List<Map<String, Any>>) {
      cdkBuilder.manifest(manifest)
    }

    override fun manifest(vararg manifest: Map<String, Any>): Unit = manifest(manifest.toList())

    override fun overwrite(overwrite: Boolean) {
      cdkBuilder.overwrite(overwrite)
    }

    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    override fun skipValidation(skipValidation: Boolean) {
      cdkBuilder.skipValidation(skipValidation)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesManifestProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.KubernetesManifestProps,
  ) : CdkObject(cdkObject), KubernetesManifestProps {
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun ingressAlb(): Boolean? = unwrap(this).getIngressAlb()

    override fun ingressAlbScheme(): AlbScheme? =
        unwrap(this).getIngressAlbScheme()?.let(AlbScheme::wrap)

    override fun manifest(): List<Map<String, Any>> = unwrap(this).getManifest()

    override fun overwrite(): Boolean? = unwrap(this).getOverwrite()

    override fun prune(): Boolean? = unwrap(this).getPrune()

    override fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesManifestProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesManifestProps):
        KubernetesManifestProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubernetesManifestProps):
        software.amazon.awscdk.services.eks.KubernetesManifestProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.KubernetesManifestProps
  }
}
