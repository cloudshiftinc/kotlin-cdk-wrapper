package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KubernetesObjectValue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValue,
) : CloudshiftdevConstructsConstruct(cdkObject) {
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