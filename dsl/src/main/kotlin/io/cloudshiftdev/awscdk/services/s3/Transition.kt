package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import java.time.Instant
import kotlin.Unit

public interface Transition {
  public fun storageClass(): StorageClass

  public fun transitionAfter(): Duration? = unwrap(this).getTransitionAfter()?.let(Duration::wrap)

  public fun transitionDate(): Instant? = unwrap(this).getTransitionDate()

  public interface Builder {
    public fun storageClass(storageClass: StorageClass) {
    }

    public fun transitionAfter(transitionAfter: Duration) {
    }

    public fun transitionDate(transitionDate: Instant) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Transition.Builder =
        software.amazon.awscdk.services.s3.Transition.builder()

    public override fun storageClass(storageClass: StorageClass) {
      cdkBuilder.storageClass(storageClass.let(StorageClass::unwrap))
    }

    public override fun transitionAfter(transitionAfter: Duration) {
      cdkBuilder.transitionAfter(transitionAfter.let(Duration::unwrap))
    }

    public override fun transitionDate(transitionDate: Instant) {
      cdkBuilder.transitionDate(transitionDate)
    }

    public fun build(): software.amazon.awscdk.services.s3.Transition = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.Transition,
  ) : Transition {
    public override fun storageClass(): StorageClass =
        unwrap(this).getStorageClass().let(StorageClass::wrap)

    public override fun transitionAfter(): Duration? =
        unwrap(this).getTransitionAfter()?.let(Duration::wrap)

    public override fun transitionDate(): Instant? = unwrap(this).getTransitionDate()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Transition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Transition): Transition =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Transition): software.amazon.awscdk.services.s3.Transition =
        (wrapped as Wrapper).cdkObject
  }
}
