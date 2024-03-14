package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.Unit

public interface TransformResources {
  /**
   * Number of ML compute instances to use in the transform job.
   */
  public fun instanceCount(): Number

  /**
   * ML compute instance type for the transform job.
   */
  public fun instanceType(): InstanceType

  /**
   * AWS KMS key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML
   * compute instance(s).
   *
   * Default: - None
   */
  public fun volumeEncryptionKey(): IKey? = unwrap(this).getVolumeEncryptionKey()?.let(IKey::wrap)

  /**
   * A builder for [TransformResources]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceCount Number of ML compute instances to use in the transform job. 
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * @param instanceType ML compute instance type for the transform job. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param volumeEncryptionKey AWS KMS key that Amazon SageMaker uses to encrypt data on the
     * storage volume attached to the ML compute instance(s).
     */
    public fun volumeEncryptionKey(volumeEncryptionKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.builder()

    /**
     * @param instanceCount Number of ML compute instances to use in the transform job. 
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceType ML compute instance type for the transform job. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param volumeEncryptionKey AWS KMS key that Amazon SageMaker uses to encrypt data on the
     * storage volume attached to the ML compute instance(s).
     */
    override fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TransformResources =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TransformResources,
  ) : TransformResources {
    /**
     * Number of ML compute instances to use in the transform job.
     */
    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    /**
     * ML compute instance type for the transform job.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * AWS KMS key that Amazon SageMaker uses to encrypt data on the storage volume attached to the
     * ML compute instance(s).
     *
     * Default: - None
     */
    override fun volumeEncryptionKey(): IKey? =
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
