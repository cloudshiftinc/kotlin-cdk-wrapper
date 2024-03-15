@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AmazonLinux2023ImageSsmParameter internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter,
) : AmazonLinuxImageSsmParameterBase(cdkObject) {
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
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter =
        cdkBuilder.build()
  }

  public companion object {
    public fun ssmParameterName(props: AmazonLinux2023ImageSsmParameterProps): String =
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter.ssmParameterName(props.let(AmazonLinux2023ImageSsmParameterProps::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b3719397a1188916c6b60658e0e9c8f4e61fe053f967f62c8639c65cc7e125")
    public fun ssmParameterName(props: AmazonLinux2023ImageSsmParameterProps.Builder.() -> Unit):
        String = ssmParameterName(AmazonLinux2023ImageSsmParameterProps(props))

    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinux2023ImageSsmParameter {
      val builderImpl = BuilderImpl()
      return AmazonLinux2023ImageSsmParameter(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter):
        AmazonLinux2023ImageSsmParameter = AmazonLinux2023ImageSsmParameter(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2023ImageSsmParameter):
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter = wrapped.cdkObject
  }
}
