@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AmazonLinux2ImageSsmParameter internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter,
) : AmazonLinuxImageSsmParameterBase(cdkObject) {
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
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter =
        cdkBuilder.build()
  }

  public companion object {
    public fun ssmParameterName(props: AmazonLinux2ImageSsmParameterProps): String =
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter.ssmParameterName(props.let(AmazonLinux2ImageSsmParameterProps::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be96e33b0132f0c5a67c00f40fc28b8c800535e60c6bb6bf16f748418c650955")
    public fun ssmParameterName(props: AmazonLinux2ImageSsmParameterProps.Builder.() -> Unit):
        String = ssmParameterName(AmazonLinux2ImageSsmParameterProps(props))

    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinux2ImageSsmParameter {
      val builderImpl = BuilderImpl()
      return AmazonLinux2ImageSsmParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter):
        AmazonLinux2ImageSsmParameter = AmazonLinux2ImageSsmParameter(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2ImageSsmParameter):
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter = wrapped.cdkObject
  }
}
