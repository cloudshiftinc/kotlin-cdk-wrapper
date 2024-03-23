@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The properties to import from the service using the EC2 launch type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * Cluster cluster;
 * Ec2ServiceAttributes ec2ServiceAttributes = Ec2ServiceAttributes.builder()
 * .cluster(cluster)
 * // the properties below are optional
 * .serviceArn("serviceArn")
 * .serviceName("serviceName")
 * .build();
 * ```
 */
public interface Ec2ServiceAttributes {
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
   * A builder for [Ec2ServiceAttributes]
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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2ServiceAttributes.Builder =
        software.amazon.awscdk.services.ecs.Ec2ServiceAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.Ec2ServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.Ec2ServiceAttributes,
  ) : CdkObject(cdkObject), Ec2ServiceAttributes {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2ServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2ServiceAttributes):
        Ec2ServiceAttributes = CdkObjectWrappers.wrap(cdkObject) as? Ec2ServiceAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2ServiceAttributes):
        software.amazon.awscdk.services.ecs.Ec2ServiceAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.Ec2ServiceAttributes
  }
}
