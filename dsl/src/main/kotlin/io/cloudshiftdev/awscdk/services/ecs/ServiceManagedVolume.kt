package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ServiceManagedVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolume,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun config(): ServiceManagedEBSVolumeConfiguration? =
      unwrap(this).getConfig()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

  public open fun configuredAtLaunch(): Boolean = unwrap(this).getConfiguredAtLaunch()

  public open fun mountIn(container: ContainerDefinition, mountPoint: ContainerMountPoint) {
    unwrap(this).mountIn(container.let(ContainerDefinition::unwrap),
        mountPoint.let(ContainerMountPoint::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("175978aadadb0894a4693b8e720c8433215c7213ddac8cc76457c00a3db962ab")
  public open fun mountIn(container: ContainerDefinition,
      mountPoint: ContainerMountPoint.Builder.() -> Unit): Unit = mountIn(container,
      ContainerMountPoint(mountPoint))

  public open fun name(): String = unwrap(this).getName()

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public interface Builder {
    public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea3547ee438cda0cc5e4fe5ef7e42e212364219a5e436646e0668cd317a40bba")
    public
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceManagedVolume.Builder =
        software.amazon.awscdk.services.ecs.ServiceManagedVolume.Builder.create(scope, id)

    override fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration) {
      cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea3547ee438cda0cc5e4fe5ef7e42e212364219a5e436646e0668cd317a40bba")
    override
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit):
        Unit = managedEbsVolume(ServiceManagedEBSVolumeConfiguration(managedEbsVolume))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceManagedVolume =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServiceManagedVolume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServiceManagedVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolume):
        ServiceManagedVolume = ServiceManagedVolume(cdkObject)

    internal fun unwrap(wrapped: ServiceManagedVolume):
        software.amazon.awscdk.services.ecs.ServiceManagedVolume = wrapped.cdkObject
  }
}
