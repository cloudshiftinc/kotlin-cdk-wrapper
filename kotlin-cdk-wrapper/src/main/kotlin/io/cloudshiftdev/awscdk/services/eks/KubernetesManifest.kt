@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KubernetesManifest internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.KubernetesManifest,
) : CloudshiftdevConstructsConstruct(cdkObject) {
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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesManifest.Builder =
        software.amazon.awscdk.services.eks.KubernetesManifest.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.eks.KubernetesManifest = cdkBuilder.build()
  }

  public companion object {
    public val RESOURCE_TYPE: String =
        software.amazon.awscdk.services.eks.KubernetesManifest.RESOURCE_TYPE

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KubernetesManifest {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KubernetesManifest(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesManifest):
        KubernetesManifest = KubernetesManifest(cdkObject)

    internal fun unwrap(wrapped: KubernetesManifest):
        software.amazon.awscdk.services.eks.KubernetesManifest = wrapped.cdkObject
  }
}
