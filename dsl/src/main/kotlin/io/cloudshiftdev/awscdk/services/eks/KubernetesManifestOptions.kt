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
    public fun ingressAlb(ingressAlb: Boolean)

    public fun ingressAlbScheme(ingressAlbScheme: AlbScheme)

    public fun prune(prune: Boolean)

    public fun skipValidation(skipValidation: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesManifestOptions.Builder =
        software.amazon.awscdk.services.eks.KubernetesManifestOptions.builder()

    override fun ingressAlb(ingressAlb: Boolean) {
      cdkBuilder.ingressAlb(ingressAlb)
    }

    override fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
      cdkBuilder.ingressAlbScheme(ingressAlbScheme.let(AlbScheme::unwrap))
    }

    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    override fun skipValidation(skipValidation: Boolean) {
      cdkBuilder.skipValidation(skipValidation)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesManifestOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.KubernetesManifestOptions,
  ) : KubernetesManifestOptions {
    override fun ingressAlb(): Boolean? = unwrap(this).getIngressAlb()

    override fun ingressAlbScheme(): AlbScheme? =
        unwrap(this).getIngressAlbScheme()?.let(AlbScheme::wrap)

    override fun prune(): Boolean? = unwrap(this).getPrune()

    override fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()
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
