@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a ScalableTableAttribute.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * BaseScalableAttributeProps baseScalableAttributeProps = BaseScalableAttributeProps.builder()
 * .dimension("dimension")
 * .maxCapacity(123)
 * .resourceId("resourceId")
 * .role(role)
 * .serviceNamespace(ServiceNamespace.ECS)
 * // the properties below are optional
 * .minCapacity(123)
 * .build();
 * ```
 */
public interface BaseScalableAttributeProps : EnableScalingProps {
  /**
   * Scalable dimension of the attribute.
   */
  public fun dimension(): String

  /**
   * Resource ID of the attribute.
   */
  public fun resourceId(): String

  /**
   * Role to use for scaling.
   */
  public fun role(): IRole

  /**
   * Service namespace of the scalable attribute.
   */
  public fun serviceNamespace(): ServiceNamespace

  /**
   * A builder for [BaseScalableAttributeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dimension Scalable dimension of the attribute. 
     */
    public fun dimension(dimension: String)

    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity Minimum capacity to scale to.
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * @param resourceId Resource ID of the attribute. 
     */
    public fun resourceId(resourceId: String)

    /**
     * @param role Role to use for scaling. 
     */
    public fun role(role: IRole)

    /**
     * @param serviceNamespace Service namespace of the scalable attribute. 
     */
    public fun serviceNamespace(serviceNamespace: ServiceNamespace)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.builder()

    /**
     * @param dimension Scalable dimension of the attribute. 
     */
    override fun dimension(dimension: String) {
      cdkBuilder.dimension(dimension)
    }

    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity Minimum capacity to scale to.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param resourceId Resource ID of the attribute. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param role Role to use for scaling. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param serviceNamespace Service namespace of the scalable attribute. 
     */
    override fun serviceNamespace(serviceNamespace: ServiceNamespace) {
      cdkBuilder.serviceNamespace(serviceNamespace.let(ServiceNamespace::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps,
  ) : CdkObject(cdkObject), BaseScalableAttributeProps {
    /**
     * Scalable dimension of the attribute.
     */
    override fun dimension(): String = unwrap(this).getDimension()

    /**
     * Maximum capacity to scale to.
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     */
    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * Resource ID of the attribute.
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

    /**
     * Role to use for scaling.
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /**
     * Service namespace of the scalable attribute.
     */
    override fun serviceNamespace(): ServiceNamespace =
        unwrap(this).getServiceNamespace().let(ServiceNamespace::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseScalableAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps):
        BaseScalableAttributeProps = CdkObjectWrappers.wrap(cdkObject) as BaseScalableAttributeProps

    internal fun unwrap(wrapped: BaseScalableAttributeProps):
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps
  }
}
