package io.cloudshiftdev.awscdk.services.eks

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KubernetesManifest internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.KubernetesManifest,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public interface Builder {
    public fun cluster(cluster: ICluster) {
    }

    public fun ingressAlb(ingressAlb: Boolean) {
    }

    public fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
    }

    public fun manifest(manifest: List<Map<String, Any>>) {
    }

    public fun overwrite(overwrite: Boolean) {
    }

    public fun prune(prune: Boolean) {
    }

    public fun skipValidation(skipValidation: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesManifest.Builder =
        software.amazon.awscdk.services.eks.KubernetesManifest.Builder.create(scope, id)

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun ingressAlb(ingressAlb: Boolean) {
      cdkBuilder.ingressAlb(ingressAlb)
    }

    public override fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
      cdkBuilder.ingressAlbScheme(ingressAlbScheme.let(AlbScheme::unwrap))
    }

    public override fun manifest(manifest: List<Map<String, Any>>) {
      cdkBuilder.manifest(manifest)
    }

    public override fun overwrite(overwrite: Boolean) {
      cdkBuilder.overwrite(overwrite)
    }

    public override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    public override fun skipValidation(skipValidation: Boolean) {
      cdkBuilder.skipValidation(skipValidation)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesManifest = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
