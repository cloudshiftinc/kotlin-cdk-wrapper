@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ServiceManagedVolumeProps {
  public fun managedEbsVolume(): ServiceManagedEBSVolumeConfiguration? =
      unwrap(this).getManagedEBSVolume()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e4773226d73f28b18775cd0d79046e9b59682361f2ff6a813298f5019d88c0")
    public
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps.Builder =
        software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps.builder()

    override fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration) {
      cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e4773226d73f28b18775cd0d79046e9b59682361f2ff6a813298f5019d88c0")
    override
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit):
        Unit = managedEbsVolume(ServiceManagedEBSVolumeConfiguration(managedEbsVolume))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps,
  ) : CdkObject(cdkObject), ServiceManagedVolumeProps {
    override fun managedEbsVolume(): ServiceManagedEBSVolumeConfiguration? =
        unwrap(this).getManagedEBSVolume()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceManagedVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps):
        ServiceManagedVolumeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceManagedVolumeProps):
        software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps
  }
}
