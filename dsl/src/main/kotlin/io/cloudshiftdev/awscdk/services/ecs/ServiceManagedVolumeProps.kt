package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ServiceManagedVolumeProps {
  /**
   * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
   *
   * Default: - undefined
   */
  public fun managedEbsVolume(): ServiceManagedEBSVolumeConfiguration? =
      unwrap(this).getManagedEBSVolume()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

  /**
   * The name of the volume.
   *
   * This corresponds to the name provided in the ECS TaskDefinition.
   */
  public fun name(): String

  /**
   * A builder for [ServiceManagedVolumeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    public fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration)

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e4773226d73f28b18775cd0d79046e9b59682361f2ff6a813298f5019d88c0")
    public
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit)

    /**
     * @param name The name of the volume. 
     * This corresponds to the name provided in the ECS TaskDefinition.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps.Builder =
        software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps.builder()

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    override fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration) {
      cdkBuilder.managedEbsVolume(managedEbsVolume.let(ServiceManagedEBSVolumeConfiguration::unwrap))
    }

    /**
     * @param managedEbsVolume Configuration for an Amazon Elastic Block Store (EBS) volume managed
     * by ECS.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1e4773226d73f28b18775cd0d79046e9b59682361f2ff6a813298f5019d88c0")
    override
        fun managedEbsVolume(managedEbsVolume: ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit):
        Unit = managedEbsVolume(ServiceManagedEBSVolumeConfiguration(managedEbsVolume))

    /**
     * @param name The name of the volume. 
     * This corresponds to the name provided in the ECS TaskDefinition.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps,
  ) : CdkObject(cdkObject), ServiceManagedVolumeProps {
    /**
     * Configuration for an Amazon Elastic Block Store (EBS) volume managed by ECS.
     *
     * Default: - undefined
     */
    override fun managedEbsVolume(): ServiceManagedEBSVolumeConfiguration? =
        unwrap(this).getManagedEBSVolume()?.let(ServiceManagedEBSVolumeConfiguration::wrap)

    /**
     * The name of the volume.
     *
     * This corresponds to the name provided in the ECS TaskDefinition.
     */
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
