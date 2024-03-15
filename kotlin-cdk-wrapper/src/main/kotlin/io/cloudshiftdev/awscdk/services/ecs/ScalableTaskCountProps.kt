@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseScalableAttributeProps
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ServiceNamespace
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ScalableTaskCountProps : BaseScalableAttributeProps {
  @CdkDslMarker
  public interface Builder {
    public fun dimension(dimension: String)

    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun resourceId(resourceId: String)

    public fun role(role: IRole)

    public fun serviceNamespace(serviceNamespace: ServiceNamespace)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ScalableTaskCountProps.Builder =
        software.amazon.awscdk.services.ecs.ScalableTaskCountProps.builder()

    override fun dimension(dimension: String) {
      cdkBuilder.dimension(dimension)
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun serviceNamespace(serviceNamespace: ServiceNamespace) {
      cdkBuilder.serviceNamespace(serviceNamespace.let(ServiceNamespace::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ScalableTaskCountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ScalableTaskCountProps,
  ) : CdkObject(cdkObject), ScalableTaskCountProps {
    override fun dimension(): String = unwrap(this).getDimension()

    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    override fun resourceId(): String = unwrap(this).getResourceId()

    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    override fun serviceNamespace(): ServiceNamespace =
        unwrap(this).getServiceNamespace().let(ServiceNamespace::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScalableTaskCountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ScalableTaskCountProps):
        ScalableTaskCountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalableTaskCountProps):
        software.amazon.awscdk.services.ecs.ScalableTaskCountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ScalableTaskCountProps
  }
}
