@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.Unit

public interface ResourceConfig {
  public fun instanceCount(): Number

  public fun instanceType(): InstanceType

  public fun volumeEncryptionKey(): IKey? = unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)

  public fun volumeSize(): Size

  @CdkDslMarker
  public interface Builder {
    public fun instanceCount(instanceCount: Number)

    public fun instanceType(instanceType: InstanceType)

    public fun volumeEncryptionKey(volumeEncryptionKey: IKey)

    public fun volumeSize(volumeSize: Size)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig.builder()

    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey.let(IKey::unwrap))
    }

    override fun volumeSize(volumeSize: Size) {
      cdkBuilder.volumeSize(volumeSize.let(Size::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig,
  ) : CdkObject(cdkObject), ResourceConfig {
    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    override fun volumeEncryptionKey(): IKey? =
        unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)

    override fun volumeSize(): Size = unwrap(this).getVolumeSize().let(Size::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig):
        ResourceConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig
  }
}
