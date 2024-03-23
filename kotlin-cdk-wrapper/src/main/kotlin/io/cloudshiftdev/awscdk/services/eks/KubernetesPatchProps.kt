@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for KubernetesPatch.
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
 */
public interface KubernetesPatchProps {
  /**
   * The JSON object to pass to `kubectl patch` when the resource is created/updated.
   */
  public fun applyPatch(): Map<String, Any>

  /**
   * The cluster to apply the patch to.
   *
   * [disable-awslint:ref-via-interface]
   */
  public fun cluster(): ICluster

  /**
   * The patch type to pass to `kubectl patch`.
   *
   * The default type used by `kubectl patch` is "strategic".
   *
   * Default: PatchType.STRATEGIC
   */
  public fun patchType(): PatchType? = unwrap(this).getPatchType()?.let(PatchType::wrap)

  /**
   * The full name of the resource to patch (e.g. `deployment/coredns`).
   */
  public fun resourceName(): String

  /**
   * The kubernetes API namespace.
   *
   * Default: "default"
   */
  public fun resourceNamespace(): String? = unwrap(this).getResourceNamespace()

  /**
   * The JSON object to pass to `kubectl patch` when the resource is removed.
   */
  public fun restorePatch(): Map<String, Any>

  /**
   * A builder for [KubernetesPatchProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
     * created/updated. 
     */
    public fun applyPatch(applyPatch: Map<String, Any>)

    /**
     * @param cluster The cluster to apply the patch to. 
     * [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param patchType The patch type to pass to `kubectl patch`.
     * The default type used by `kubectl patch` is "strategic".
     */
    public fun patchType(patchType: PatchType)

    /**
     * @param resourceName The full name of the resource to patch (e.g. `deployment/coredns`). 
     */
    public fun resourceName(resourceName: String)

    /**
     * @param resourceNamespace The kubernetes API namespace.
     */
    public fun resourceNamespace(resourceNamespace: String)

    /**
     * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed. 
     */
    public fun restorePatch(restorePatch: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesPatchProps.Builder =
        software.amazon.awscdk.services.eks.KubernetesPatchProps.builder()

    /**
     * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
     * created/updated. 
     */
    override fun applyPatch(applyPatch: Map<String, Any>) {
      cdkBuilder.applyPatch(applyPatch)
    }

    /**
     * @param cluster The cluster to apply the patch to. 
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param patchType The patch type to pass to `kubectl patch`.
     * The default type used by `kubectl patch` is "strategic".
     */
    override fun patchType(patchType: PatchType) {
      cdkBuilder.patchType(patchType.let(PatchType::unwrap))
    }

    /**
     * @param resourceName The full name of the resource to patch (e.g. `deployment/coredns`). 
     */
    override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    /**
     * @param resourceNamespace The kubernetes API namespace.
     */
    override fun resourceNamespace(resourceNamespace: String) {
      cdkBuilder.resourceNamespace(resourceNamespace)
    }

    /**
     * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed. 
     */
    override fun restorePatch(restorePatch: Map<String, Any>) {
      cdkBuilder.restorePatch(restorePatch)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesPatchProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.KubernetesPatchProps,
  ) : CdkObject(cdkObject), KubernetesPatchProps {
    /**
     * The JSON object to pass to `kubectl patch` when the resource is created/updated.
     */
    override fun applyPatch(): Map<String, Any> = unwrap(this).getApplyPatch() ?: emptyMap()

    /**
     * The cluster to apply the patch to.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * The patch type to pass to `kubectl patch`.
     *
     * The default type used by `kubectl patch` is "strategic".
     *
     * Default: PatchType.STRATEGIC
     */
    override fun patchType(): PatchType? = unwrap(this).getPatchType()?.let(PatchType::wrap)

    /**
     * The full name of the resource to patch (e.g. `deployment/coredns`).
     */
    override fun resourceName(): String = unwrap(this).getResourceName()

    /**
     * The kubernetes API namespace.
     *
     * Default: "default"
     */
    override fun resourceNamespace(): String? = unwrap(this).getResourceNamespace()

    /**
     * The JSON object to pass to `kubectl patch` when the resource is removed.
     */
    override fun restorePatch(): Map<String, Any> = unwrap(this).getRestorePatch() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesPatchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesPatchProps):
        KubernetesPatchProps = CdkObjectWrappers.wrap(cdkObject) as? KubernetesPatchProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubernetesPatchProps):
        software.amazon.awscdk.services.eks.KubernetesPatchProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.KubernetesPatchProps
  }
}
