@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AmazonLinux2022ImageSsmParameter internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter,
) : AmazonLinuxImageSsmParameterBase(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun cpuType(cpuType: AmazonLinuxCpuType)

    public fun edition(edition: AmazonLinuxEdition)

    public fun kernel(kernel: AmazonLinux2022Kernel)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter.Builder.create()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    override fun kernel(kernel: AmazonLinux2022Kernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinux2022Kernel::unwrap))
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter =
        cdkBuilder.build()
  }

  public companion object {
    public fun ssmParameterName(props: AmazonLinux2022ImageSsmParameterProps): String =
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter.ssmParameterName(props.let(AmazonLinux2022ImageSsmParameterProps::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79850475ae55dd29e05eb4cc855fc428956da78811c64ccf69535565eb81e4ad")
    public fun ssmParameterName(props: AmazonLinux2022ImageSsmParameterProps.Builder.() -> Unit):
        String = ssmParameterName(AmazonLinux2022ImageSsmParameterProps(props))

    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinux2022ImageSsmParameter {
      val builderImpl = BuilderImpl()
      return AmazonLinux2022ImageSsmParameter(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter):
        AmazonLinux2022ImageSsmParameter = AmazonLinux2022ImageSsmParameter(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2022ImageSsmParameter):
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter = wrapped.cdkObject
  }
}
