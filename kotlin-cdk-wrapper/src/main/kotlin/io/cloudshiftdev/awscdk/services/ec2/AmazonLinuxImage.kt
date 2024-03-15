@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AmazonLinuxImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImage,
) : GenericSSMParameterImage(cdkObject) {
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

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
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AmazonLinuxImage.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImage.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinuxImage = cdkBuilder.build()
  }

  public companion object {
    public fun ssmParameterName(): String =
        software.amazon.awscdk.services.ec2.AmazonLinuxImage.ssmParameterName()

    public fun ssmParameterName(props: AmazonLinuxImageProps): String =
        software.amazon.awscdk.services.ec2.AmazonLinuxImage.ssmParameterName(props.let(AmazonLinuxImageProps::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a404935d97c75dc9dc41179b9d410bc64c050dd220fa58e9d9cf3299786d4f3b")
    public fun ssmParameterName(props: AmazonLinuxImageProps.Builder.() -> Unit): String =
        ssmParameterName(AmazonLinuxImageProps(props))

    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinuxImage {
      val builderImpl = BuilderImpl()
      return AmazonLinuxImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImage):
        AmazonLinuxImage = AmazonLinuxImage(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImage):
        software.amazon.awscdk.services.ec2.AmazonLinuxImage = wrapped.cdkObject
  }
}
