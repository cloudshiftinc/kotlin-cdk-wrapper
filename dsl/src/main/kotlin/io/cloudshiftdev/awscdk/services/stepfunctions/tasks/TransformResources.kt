package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.Unit

public interface TransformResources {
  public fun instanceCount(): Number

  public fun instanceType(): InstanceType

  public fun volumeEncryptionKey(): IKey? = unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)

  public interface Builder {
    public fun instanceCount(instanceCount: Number) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    public fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.builder()

    public override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    public override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    public override fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformResources =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformResources,
  ) : TransformResources {
    public override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    public override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    public override fun volumeEncryptionKey(): IKey? =
        unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TransformResources {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformResources):
        TransformResources = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TransformResources):
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources = (wrapped as
        Wrapper).cdkObject
  }
}
