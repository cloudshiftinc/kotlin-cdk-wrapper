@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AmazonLinux2ImageSsmParameterProps : AmazonLinuxImageSsmParameterCommonOptions {
  public fun kernel(): AmazonLinux2Kernel? = unwrap(this).getKernel()?.let(AmazonLinux2Kernel::wrap)

  public fun storage(): AmazonLinuxStorage? =
      unwrap(this).getStorage()?.let(AmazonLinuxStorage::wrap)

  public fun virtualization(): AmazonLinuxVirt? =
      unwrap(this).getVirtualization()?.let(AmazonLinuxVirt::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun cpuType(cpuType: AmazonLinuxCpuType)

    public fun edition(edition: AmazonLinuxEdition)

    public fun kernel(kernel: AmazonLinux2Kernel)

    public fun storage(storage: AmazonLinuxStorage)

    public fun userData(userData: UserData)

    public fun virtualization(virtualization: AmazonLinuxVirt)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps.builder()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    override fun kernel(kernel: AmazonLinux2Kernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinux2Kernel::unwrap))
    }

    override fun storage(storage: AmazonLinuxStorage) {
      cdkBuilder.storage(storage.let(AmazonLinuxStorage::unwrap))
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    override fun virtualization(virtualization: AmazonLinuxVirt) {
      cdkBuilder.virtualization(virtualization.let(AmazonLinuxVirt::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps,
  ) : CdkObject(cdkObject), AmazonLinux2ImageSsmParameterProps {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun cpuType(): AmazonLinuxCpuType? =
        unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

    override fun edition(): AmazonLinuxEdition? =
        unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

    override fun kernel(): AmazonLinux2Kernel? =
        unwrap(this).getKernel()?.let(AmazonLinux2Kernel::wrap)

    override fun storage(): AmazonLinuxStorage? =
        unwrap(this).getStorage()?.let(AmazonLinuxStorage::wrap)

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    override fun virtualization(): AmazonLinuxVirt? =
        unwrap(this).getVirtualization()?.let(AmazonLinuxVirt::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinux2ImageSsmParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps):
        AmazonLinux2ImageSsmParameterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2ImageSsmParameterProps):
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps
  }
}
