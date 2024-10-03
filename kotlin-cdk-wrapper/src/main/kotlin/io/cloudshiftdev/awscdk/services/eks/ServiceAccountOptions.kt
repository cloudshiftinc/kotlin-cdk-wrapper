@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options for `ServiceAccount`.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * // add service account with annotations and labels
 * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount",
 * ServiceAccountOptions.builder()
 * .annotations(Map.of(
 * "eks.amazonaws.com/sts-regional-endpoints", "false"))
 * .labels(Map.of(
 * "some-label", "with-some-value"))
 * .build());
 * ```
 */
public interface ServiceAccountOptions {
  /**
   * Additional annotations of the service account.
   *
   * Default: - no additional annotations
   */
  public fun annotations(): Map<String, String> = unwrap(this).getAnnotations() ?: emptyMap()

  /**
   * The identity type to use for the service account.
   *
   * Default: IdentityType.IRSA
   */
  public fun identityType(): IdentityType? = unwrap(this).getIdentityType()?.let(IdentityType::wrap)

  /**
   * Additional labels of the service account.
   *
   * Default: - no additional labels
   */
  public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

  /**
   * The name of the service account.
   *
   * The name of a ServiceAccount object must be a valid DNS subdomain name.
   * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   *
   * Default: - If no name is given, it will use the id of the resource.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The namespace of the service account.
   *
   * All namespace names must be valid RFC 1123 DNS labels.
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
   *
   * Default: "default"
   */
  public fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * A builder for [ServiceAccountOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param annotations Additional annotations of the service account.
     */
    public fun annotations(annotations: Map<String, String>)

    /**
     * @param identityType The identity type to use for the service account.
     */
    public fun identityType(identityType: IdentityType)

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
    private val cdkBuilder: software.amazon.awscdk.services.eks.ServiceAccountOptions.Builder =
        software.amazon.awscdk.services.eks.ServiceAccountOptions.builder()

    /**
     * @param annotations Additional annotations of the service account.
     */
    override fun annotations(annotations: Map<String, String>) {
      cdkBuilder.annotations(annotations)
    }

    /**
     * @param identityType The identity type to use for the service account.
     */
    override fun identityType(identityType: IdentityType) {
      cdkBuilder.identityType(identityType.let(IdentityType.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.eks.ServiceAccountOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.ServiceAccountOptions,
  ) : CdkObject(cdkObject),
      ServiceAccountOptions {
    /**
     * Additional annotations of the service account.
     *
     * Default: - no additional annotations
     */
    override fun annotations(): Map<String, String> = unwrap(this).getAnnotations() ?: emptyMap()

    /**
     * The identity type to use for the service account.
     *
     * Default: IdentityType.IRSA
     */
    override fun identityType(): IdentityType? =
        unwrap(this).getIdentityType()?.let(IdentityType::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceAccountOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ServiceAccountOptions):
        ServiceAccountOptions = CdkObjectWrappers.wrap(cdkObject) as? ServiceAccountOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceAccountOptions):
        software.amazon.awscdk.services.eks.ServiceAccountOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.ServiceAccountOptions
  }
}
