package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ExternalServiceAttributes {
  /**
   * The cluster that hosts the service.
   */
  public fun cluster(): ICluster

  /**
   * The service ARN.
   *
   * Default: - either this, or `serviceName`, is required
   */
  public fun serviceArn(): String? = unwrap(this).getServiceArn()

  /**
   * The name of the service.
   *
   * Default: - either this, or `serviceArn`, is required
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * A builder for [ExternalServiceAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The cluster that hosts the service. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param serviceArn The service ARN.
     */
    public fun serviceArn(serviceArn: String)

    /**
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExternalServiceAttributes.Builder =
        software.amazon.awscdk.services.ecs.ExternalServiceAttributes.builder()

    /**
     * @param cluster The cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param serviceArn The service ARN.
     */
    override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    /**
     * @param serviceName The name of the service.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExternalServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ExternalServiceAttributes,
  ) : CdkObject(cdkObject), ExternalServiceAttributes {
    /**
     * The cluster that hosts the service.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * The service ARN.
     *
     * Default: - either this, or `serviceName`, is required
     */
    override fun serviceArn(): String? = unwrap(this).getServiceArn()

    /**
     * The name of the service.
     *
     * Default: - either this, or `serviceArn`, is required
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExternalServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExternalServiceAttributes):
        ExternalServiceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExternalServiceAttributes):
        software.amazon.awscdk.services.ecs.ExternalServiceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ExternalServiceAttributes
  }
}
