@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CloudFormation resource which applies/restores a JSON patch into a Kubernetes resource.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * KubernetesPatch.Builder.create(this, "hello-kub-deployment-label")
 * .cluster(cluster)
 * .resourceName("deployment/hello-kubernetes")
 * .applyPatch(Map.of("spec", Map.of("replicas", 5)))
 * .restorePatch(Map.of("spec", Map.of("replicas", 3)))
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/tasks/run-application/update-api-object-kubectl-patch/)
 */
public open class KubernetesPatch(
  cdkObject: software.amazon.awscdk.services.eks.KubernetesPatch,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KubernetesPatchProps,
  ) :
      this(software.amazon.awscdk.services.eks.KubernetesPatch(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(KubernetesPatchProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KubernetesPatchProps.Builder.() -> Unit,
  ) : this(scope, id, KubernetesPatchProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.KubernetesPatch].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The JSON object to pass to `kubectl patch` when the resource is created/updated.
     *
     * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
     * created/updated. 
     */
    public fun applyPatch(applyPatch: Map<String, Any>)

    /**
     * The cluster to apply the patch to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The cluster to apply the patch to. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The patch type to pass to `kubectl patch`.
     *
     * The default type used by `kubectl patch` is "strategic".
     *
     * Default: PatchType.STRATEGIC
     *
     * @param patchType The patch type to pass to `kubectl patch`. 
     */
    public fun patchType(patchType: PatchType)

    /**
     * The full name of the resource to patch (e.g. `deployment/coredns`).
     *
     * @param resourceName The full name of the resource to patch (e.g. `deployment/coredns`). 
     */
    public fun resourceName(resourceName: String)

    /**
     * The kubernetes API namespace.
     *
     * Default: "default"
     *
     * @param resourceNamespace The kubernetes API namespace. 
     */
    public fun resourceNamespace(resourceNamespace: String)

    /**
     * The JSON object to pass to `kubectl patch` when the resource is removed.
     *
     * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed. 
     */
    public fun restorePatch(restorePatch: Map<String, Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesPatch.Builder =
        software.amazon.awscdk.services.eks.KubernetesPatch.Builder.create(scope, id)

    /**
     * The JSON object to pass to `kubectl patch` when the resource is created/updated.
     *
     * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
     * created/updated. 
     */
    override fun applyPatch(applyPatch: Map<String, Any>) {
      cdkBuilder.applyPatch(applyPatch.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The cluster to apply the patch to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The cluster to apply the patch to. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * The patch type to pass to `kubectl patch`.
     *
     * The default type used by `kubectl patch` is "strategic".
     *
     * Default: PatchType.STRATEGIC
     *
     * @param patchType The patch type to pass to `kubectl patch`. 
     */
    override fun patchType(patchType: PatchType) {
      cdkBuilder.patchType(patchType.let(PatchType::unwrap))
    }

    /**
     * The full name of the resource to patch (e.g. `deployment/coredns`).
     *
     * @param resourceName The full name of the resource to patch (e.g. `deployment/coredns`). 
     */
    override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    /**
     * The kubernetes API namespace.
     *
     * Default: "default"
     *
     * @param resourceNamespace The kubernetes API namespace. 
     */
    override fun resourceNamespace(resourceNamespace: String) {
      cdkBuilder.resourceNamespace(resourceNamespace)
    }

    /**
     * The JSON object to pass to `kubectl patch` when the resource is removed.
     *
     * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed. 
     */
    override fun restorePatch(restorePatch: Map<String, Any>) {
      cdkBuilder.restorePatch(restorePatch.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesPatch = cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.eks.KubernetesPatch = wrapped.cdkObject as
        software.amazon.awscdk.services.eks.KubernetesPatch
  }
}
