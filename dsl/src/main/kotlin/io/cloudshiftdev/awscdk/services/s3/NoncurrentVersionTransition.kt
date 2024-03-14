package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface NoncurrentVersionTransition {
  public fun noncurrentVersionsToRetain(): Number? = unwrap(this).getNoncurrentVersionsToRetain()

  public fun storageClass(): StorageClass

  public fun transitionAfter(): Duration

  public interface Builder {
    public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number)

    public fun storageClass(storageClass: StorageClass)

    public fun transitionAfter(transitionAfter: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder =
        software.amazon.awscdk.services.s3.NoncurrentVersionTransition.builder()

    override fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
      cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
    }

    override fun storageClass(storageClass: StorageClass) {
      cdkBuilder.storageClass(storageClass.let(StorageClass::unwrap))
    }

    override fun transitionAfter(transitionAfter: Duration) {
      cdkBuilder.transitionAfter(transitionAfter.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.NoncurrentVersionTransition =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.NoncurrentVersionTransition,
  ) : NoncurrentVersionTransition {
    override fun noncurrentVersionsToRetain(): Number? =
        unwrap(this).getNoncurrentVersionsToRetain()

    override fun storageClass(): StorageClass =
        unwrap(this).getStorageClass().let(StorageClass::wrap)

    override fun transitionAfter(): Duration = unwrap(this).getTransitionAfter().let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NoncurrentVersionTransition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.NoncurrentVersionTransition):
        NoncurrentVersionTransition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NoncurrentVersionTransition):
        software.amazon.awscdk.services.s3.NoncurrentVersionTransition = (wrapped as
        Wrapper).cdkObject
  }
}
