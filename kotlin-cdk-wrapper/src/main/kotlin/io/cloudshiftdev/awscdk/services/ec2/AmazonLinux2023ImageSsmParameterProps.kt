@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AmazonLinux2023ImageSsmParameterProps : AmazonLinuxImageSsmParameterCommonOptions {
  public fun kernel(): AmazonLinux2023Kernel? =
      unwrap(this).getKernel()?.let(AmazonLinux2023Kernel::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun cpuType(cpuType: AmazonLinuxCpuType)

    public fun edition(edition: AmazonLinuxEdition)

    public fun kernel(kernel: AmazonLinux2023Kernel)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps.builder()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    override fun kernel(kernel: AmazonLinux2023Kernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinux2023Kernel::unwrap))
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps,
  ) : CdkObject(cdkObject), AmazonLinux2023ImageSsmParameterProps {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun cpuType(): AmazonLinuxCpuType? =
        unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

    override fun edition(): AmazonLinuxEdition? =
        unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

    override fun kernel(): AmazonLinux2023Kernel? =
        unwrap(this).getKernel()?.let(AmazonLinux2023Kernel::wrap)

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AmazonLinux2023ImageSsmParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps):
        AmazonLinux2023ImageSsmParameterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2023ImageSsmParameterProps):
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps
  }
}
