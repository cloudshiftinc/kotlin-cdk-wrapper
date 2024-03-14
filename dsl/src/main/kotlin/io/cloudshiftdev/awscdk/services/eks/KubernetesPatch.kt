package io.cloudshiftdev.awscdk.services.eks

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KubernetesPatch internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.KubernetesPatch,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public interface Builder {
    public fun applyPatch(applyPatch: Map<String, Any>)

    public fun cluster(cluster: ICluster)

    public fun patchType(patchType: PatchType)

    public fun resourceName(resourceName: String)

    public fun resourceNamespace(resourceNamespace: String)

    public fun restorePatch(restorePatch: Map<String, Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesPatch.Builder =
        software.amazon.awscdk.services.eks.KubernetesPatch.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.eks.KubernetesPatch = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KubernetesPatch {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KubernetesPatch(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesPatch):
        KubernetesPatch = KubernetesPatch(cdkObject)

    internal fun unwrap(wrapped: KubernetesPatch):
        software.amazon.awscdk.services.eks.KubernetesPatch = wrapped.cdkObject
  }
}
