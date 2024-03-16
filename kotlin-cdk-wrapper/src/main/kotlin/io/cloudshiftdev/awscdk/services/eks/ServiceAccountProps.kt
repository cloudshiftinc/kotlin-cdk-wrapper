@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining service accounts.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * Cluster cluster;
 * ServiceAccountProps serviceAccountProps = ServiceAccountProps.builder()
 * .cluster(cluster)
 * // the properties below are optional
 * .annotations(Map.of(
 * "annotationsKey", "annotations"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .name("name")
 * .namespace("namespace")
 * .build();
 * ```
 */
public interface ServiceAccountProps : ServiceAccountOptions {
  /**
   * The cluster to apply the patch to.
   */
  public fun cluster(): ICluster

  /**
   * A builder for [ServiceAccountProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param annotations Additional annotations of the service account.
     */
    public fun annotations(annotations: Map<String, String>)

    /**
     * @param cluster The cluster to apply the patch to. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param labels Additional labels of the service account.
     */
    public fun labels(labels: Map<String, String>)

    /**
     * @param name The name of the service account.
     * The name of a ServiceAccount object must be a valid DNS subdomain name.
     * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     */
    public fun name(name: String)

    /**
     * @param namespace The namespace of the service account.
     * All namespace names must be valid RFC 1123 DNS labels.
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
     */
    public fun namespace(namespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ServiceAccountProps.Builder =
        software.amazon.awscdk.services.eks.ServiceAccountProps.builder()

    /**
     * @param annotations Additional annotations of the service account.
     */
    override fun annotations(annotations: Map<String, String>) {
      cdkBuilder.annotations(annotations)
    }

    /**
     * @param cluster The cluster to apply the patch to. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param labels Additional labels of the service account.
     */
    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * @param name The name of the service account.
     * The name of a ServiceAccount object must be a valid DNS subdomain name.
     * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param namespace The namespace of the service account.
     * All namespace names must be valid RFC 1123 DNS labels.
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public fun build(): software.amazon.awscdk.services.eks.ServiceAccountProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.ServiceAccountProps,
  ) : CdkObject(cdkObject), ServiceAccountProps {
    /**
     * Additional annotations of the service account.
     *
     * Default: - no additional annotations
     */
    override fun annotations(): Map<String, String> = unwrap(this).getAnnotations() ?: emptyMap()

    /**
     * The cluster to apply the patch to.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * Additional labels of the service account.
     *
     * Default: - no additional labels
     */
    override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    /**
     * The name of the service account.
     *
     * The name of a ServiceAccount object must be a valid DNS subdomain name.
     * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     *
     * Default: - If no name is given, it will use the id of the resource.
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The namespace of the service account.
     *
     * All namespace names must be valid RFC 1123 DNS labels.
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
     *
     * Default: "default"
     */
    override fun namespace(): String? = unwrap(this).getNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ServiceAccountProps):
        ServiceAccountProps = CdkObjectWrappers.wrap(cdkObject) as ServiceAccountProps

    internal fun unwrap(wrapped: ServiceAccountProps):
        software.amazon.awscdk.services.eks.ServiceAccountProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.ServiceAccountProps
  }
}
