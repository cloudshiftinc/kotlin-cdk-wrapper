@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a value of a specific object deployed in the cluster.
 *
 * Use this to fetch any information available by the `kubectl get` command.
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
public open class KubernetesObjectValue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValue,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KubernetesObjectValueProps,
  ) :
      this(software.amazon.awscdk.services.eks.KubernetesObjectValue(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(KubernetesObjectValueProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KubernetesObjectValueProps.Builder.() -> Unit,
  ) : this(scope, id, KubernetesObjectValueProps(props)
  )

  /**
   * The value as a string token.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.KubernetesObjectValue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The EKS cluster to fetch attributes from.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to fetch attributes from. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * JSONPath to the specific value.
     *
     * [Documentation](https://kubernetes.io/docs/reference/kubectl/jsonpath/)
     * @param jsonPath JSONPath to the specific value. 
     */
    public fun jsonPath(jsonPath: String)

    /**
     * The name of the object to query.
     *
     * @param objectName The name of the object to query. 
     */
    public fun objectName(objectName: String)

    /**
     * The namespace the object belongs to.
     *
     * Default: 'default'
     *
     * @param objectNamespace The namespace the object belongs to. 
     */
    public fun objectNamespace(objectNamespace: String)

    /**
     * The object type to query.
     *
     * (e.g 'service', 'pod'...)
     *
     * @param objectType The object type to query. 
     */
    public fun objectType(objectType: String)

    /**
     * Timeout for waiting on a value.
     *
     * Default: Duration.minutes(5)
     *
     * @param timeout Timeout for waiting on a value. 
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesObjectValue.Builder =
        software.amazon.awscdk.services.eks.KubernetesObjectValue.Builder.create(scope, id)

    /**
     * The EKS cluster to fetch attributes from.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to fetch attributes from. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * JSONPath to the specific value.
     *
     * [Documentation](https://kubernetes.io/docs/reference/kubectl/jsonpath/)
     * @param jsonPath JSONPath to the specific value. 
     */
    override fun jsonPath(jsonPath: String) {
      cdkBuilder.jsonPath(jsonPath)
    }

    /**
     * The name of the object to query.
     *
     * @param objectName The name of the object to query. 
     */
    override fun objectName(objectName: String) {
      cdkBuilder.objectName(objectName)
    }

    /**
     * The namespace the object belongs to.
     *
     * Default: 'default'
     *
     * @param objectNamespace The namespace the object belongs to. 
     */
    override fun objectNamespace(objectNamespace: String) {
      cdkBuilder.objectNamespace(objectNamespace)
    }

    /**
     * The object type to query.
     *
     * (e.g 'service', 'pod'...)
     *
     * @param objectType The object type to query. 
     */
    override fun objectType(objectType: String) {
      cdkBuilder.objectType(objectType)
    }

    /**
     * Timeout for waiting on a value.
     *
     * Default: Duration.minutes(5)
     *
     * @param timeout Timeout for waiting on a value. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesObjectValue =
        cdkBuilder.build()
  }

  public companion object {
    public val RESOURCE_TYPE: String =
        software.amazon.awscdk.services.eks.KubernetesObjectValue.RESOURCE_TYPE

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KubernetesObjectValue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KubernetesObjectValue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValue):
        KubernetesObjectValue = KubernetesObjectValue(cdkObject)

    internal fun unwrap(wrapped: KubernetesObjectValue):
        software.amazon.awscdk.services.eks.KubernetesObjectValue = wrapped.cdkObject
  }
}
