package io.cloudshiftdev.awscdk.services.eks

import kotlin.Boolean
import kotlin.Unit

public interface KubernetesManifestOptions {
  public fun ingressAlb(): Boolean? = unwrap(this).getIngressAlb()

  public fun ingressAlbScheme(): AlbScheme? =
      unwrap(this).getIngressAlbScheme()?.let(AlbScheme::wrap)

  public fun prune(): Boolean? = unwrap(this).getPrune()

  public fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

  public interface Builder {
    public fun ingressAlb(ingressAlb: Boolean) {
    }

    public fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
    }

    public fun prune(prune: Boolean) {
    }

    public fun skipValidation(skipValidation: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesManifestOptions.Builder =
        software.amazon.awscdk.services.eks.KubernetesManifestOptions.builder()

    public override fun ingressAlb(ingressAlb: Boolean) {
      cdkBuilder.ingressAlb(ingressAlb)
    }

    public override fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
      cdkBuilder.ingressAlbScheme(ingressAlbScheme.let(AlbScheme::unwrap))
    }

    public override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    public override fun skipValidation(skipValidation: Boolean) {
      cdkBuilder.skipValidation(skipValidation)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesManifestOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.KubernetesManifestOptions,
  ) : KubernetesManifestOptions {
    public override fun ingressAlb(): Boolean? = unwrap(this).getIngressAlb()

    public override fun ingressAlbScheme(): AlbScheme? =
        unwrap(this).getIngressAlbScheme()?.let(AlbScheme::wrap)

    public override fun prune(): Boolean? = unwrap(this).getPrune()

    public override fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesManifestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesManifestOptions):
        KubernetesManifestOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubernetesManifestOptions):
        software.amazon.awscdk.services.eks.KubernetesManifestOptions = (wrapped as
        Wrapper).cdkObject
  }
}
