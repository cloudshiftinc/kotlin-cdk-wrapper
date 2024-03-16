@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for KubernetesObjectValue.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * // query the load balancer address
 * KubernetesObjectValue myServiceAddress = KubernetesObjectValue.Builder.create(this,
 * "LoadBalancerAttribute")
 * .cluster(cluster)
 * .objectType("service")
 * .objectName("my-service")
 * .jsonPath(".status.loadBalancer.ingress[0].hostname")
 * .build();
 * // pass the address to a lambda function
 * Function proxyFunction = Function.Builder.create(this, "ProxyFunction")
 * .handler("index.handler")
 * .code(Code.fromInline("my-code"))
 * .runtime(Runtime.NODEJS_LATEST)
 * .environment(Map.of(
 * "myServiceAddress", myServiceAddress.getValue()))
 * .build();
 * ```
 */
public interface KubernetesObjectValueProps {
  /**
   * The EKS cluster to fetch attributes from.
   *
   * [disable-awslint:ref-via-interface]
   */
  public fun cluster(): ICluster

  /**
   * JSONPath to the specific value.
   *
   * [Documentation](https://kubernetes.io/docs/reference/kubectl/jsonpath/)
   */
  public fun jsonPath(): String

  /**
   * The name of the object to query.
   */
  public fun objectName(): String

  /**
   * The namespace the object belongs to.
   *
   * Default: 'default'
   */
  public fun objectNamespace(): String? = unwrap(this).getObjectNamespace()

  /**
   * The object type to query.
   *
   * (e.g 'service', 'pod'...)
   */
  public fun objectType(): String

  /**
   * Timeout for waiting on a value.
   *
   * Default: Duration.minutes(5)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [KubernetesObjectValueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The EKS cluster to fetch attributes from. 
     * [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param jsonPath JSONPath to the specific value. 
     */
    public fun jsonPath(jsonPath: String)

    /**
     * @param objectName The name of the object to query. 
     */
    public fun objectName(objectName: String)

    /**
     * @param objectNamespace The namespace the object belongs to.
     */
    public fun objectNamespace(objectNamespace: String)

    /**
     * @param objectType The object type to query. 
     * (e.g 'service', 'pod'...)
     */
    public fun objectType(objectType: String)

    /**
     * @param timeout Timeout for waiting on a value.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesObjectValueProps.Builder =
        software.amazon.awscdk.services.eks.KubernetesObjectValueProps.builder()

    /**
     * @param cluster The EKS cluster to fetch attributes from. 
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param jsonPath JSONPath to the specific value. 
     */
    override fun jsonPath(jsonPath: String) {
      cdkBuilder.jsonPath(jsonPath)
    }

    /**
     * @param objectName The name of the object to query. 
     */
    override fun objectName(objectName: String) {
      cdkBuilder.objectName(objectName)
    }

    /**
     * @param objectNamespace The namespace the object belongs to.
     */
    override fun objectNamespace(objectNamespace: String) {
      cdkBuilder.objectNamespace(objectNamespace)
    }

    /**
     * @param objectType The object type to query. 
     * (e.g 'service', 'pod'...)
     */
    override fun objectType(objectType: String) {
      cdkBuilder.objectType(objectType)
    }

    /**
     * @param timeout Timeout for waiting on a value.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesObjectValueProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValueProps,
  ) : CdkObject(cdkObject), KubernetesObjectValueProps {
    /**
     * The EKS cluster to fetch attributes from.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * JSONPath to the specific value.
     *
     * [Documentation](https://kubernetes.io/docs/reference/kubectl/jsonpath/)
     */
    override fun jsonPath(): String = unwrap(this).getJsonPath()

    /**
     * The name of the object to query.
     */
    override fun objectName(): String = unwrap(this).getObjectName()

    /**
     * The namespace the object belongs to.
     *
     * Default: 'default'
     */
    override fun objectNamespace(): String? = unwrap(this).getObjectNamespace()

    /**
     * The object type to query.
     *
     * (e.g 'service', 'pod'...)
     */
    override fun objectType(): String = unwrap(this).getObjectType()

    /**
     * Timeout for waiting on a value.
     *
     * Default: Duration.minutes(5)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesObjectValueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValueProps):
        KubernetesObjectValueProps = CdkObjectWrappers.wrap(cdkObject) as KubernetesObjectValueProps

    internal fun unwrap(wrapped: KubernetesObjectValueProps):
        software.amazon.awscdk.services.eks.KubernetesObjectValueProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.KubernetesObjectValueProps
  }
}
