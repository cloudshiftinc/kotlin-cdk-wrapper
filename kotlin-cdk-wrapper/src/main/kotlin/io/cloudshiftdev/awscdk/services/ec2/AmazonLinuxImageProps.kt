@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AmazonLinuxImageProps {
  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  public fun cpuType(): AmazonLinuxCpuType? =
      unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

  public fun edition(): AmazonLinuxEdition? =
      unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

  public fun generation(): AmazonLinuxGeneration? =
      unwrap(this).getGeneration()?.let(AmazonLinuxGeneration::wrap)

  public fun kernel(): AmazonLinuxKernel? = unwrap(this).getKernel()?.let(AmazonLinuxKernel::wrap)

  public fun storage(): AmazonLinuxStorage? =
      unwrap(this).getStorage()?.let(AmazonLinuxStorage::wrap)

  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  public fun virtualization(): AmazonLinuxVirt? =
      unwrap(this).getVirtualization()?.let(AmazonLinuxVirt::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun cpuType(cpuType: AmazonLinuxCpuType)

    public fun edition(edition: AmazonLinuxEdition)

    public fun generation(generation: AmazonLinuxGeneration)

    public fun kernel(kernel: AmazonLinuxKernel)

    public fun storage(storage: AmazonLinuxStorage)

    public fun userData(userData: UserData)

    public fun virtualization(virtualization: AmazonLinuxVirt)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AmazonLinuxImageProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImageProps.builder()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    override fun generation(generation: AmazonLinuxGeneration) {
      cdkBuilder.generation(generation.let(AmazonLinuxGeneration::unwrap))
    }

    override fun kernel(kernel: AmazonLinuxKernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinuxKernel::unwrap))
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

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinuxImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageProps,
  ) : CdkObject(cdkObject), AmazonLinuxImageProps {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun cpuType(): AmazonLinuxCpuType? =
        unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

    override fun edition(): AmazonLinuxEdition? =
        unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

    override fun generation(): AmazonLinuxGeneration? =
        unwrap(this).getGeneration()?.let(AmazonLinuxGeneration::wrap)

    override fun kernel(): AmazonLinuxKernel? =
        unwrap(this).getKernel()?.let(AmazonLinuxKernel::wrap)

    override fun storage(): AmazonLinuxStorage? =
        unwrap(this).getStorage()?.let(AmazonLinuxStorage::wrap)

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    override fun virtualization(): AmazonLinuxVirt? =
        unwrap(this).getVirtualization()?.let(AmazonLinuxVirt::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinuxImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageProps):
        AmazonLinuxImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageProps):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.AmazonLinuxImageProps
  }
}
