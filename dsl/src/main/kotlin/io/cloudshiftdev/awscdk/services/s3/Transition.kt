package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Unit

public interface Transition {
  /**
   * The storage class to which you want the object to transition.
   */
  public fun storageClass(): StorageClass

  /**
   * Indicates the number of days after creation when objects are transitioned to the specified
   * storage class.
   *
   * Default: - No transition count.
   */
  public fun transitionAfter(): Duration? = unwrap(this).getTransitionAfter()?.let(Duration::wrap)

  /**
   * Indicates when objects are transitioned to the specified storage class.
   *
   * The date value must be in ISO 8601 format. The time is always midnight UTC.
   *
   * Default: - No transition date.
   */
  public fun transitionDate(): Instant? = unwrap(this).getTransitionDate()

  /**
   * A builder for [Transition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param storageClass The storage class to which you want the object to transition. 
     */
    public fun storageClass(storageClass: StorageClass)

    /**
     * @param transitionAfter Indicates the number of days after creation when objects are
     * transitioned to the specified storage class.
     */
    public fun transitionAfter(transitionAfter: Duration)

    /**
     * @param transitionDate Indicates when objects are transitioned to the specified storage class.
     * The date value must be in ISO 8601 format. The time is always midnight UTC.
     */
    public fun transitionDate(transitionDate: Instant)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Transition.Builder =
        software.amazon.awscdk.services.s3.Transition.builder()

    /**
     * @param storageClass The storage class to which you want the object to transition. 
     */
    override fun storageClass(storageClass: StorageClass) {
      cdkBuilder.storageClass(storageClass.let(StorageClass::unwrap))
    }

    /**
     * @param transitionAfter Indicates the number of days after creation when objects are
     * transitioned to the specified storage class.
     */
    override fun transitionAfter(transitionAfter: Duration) {
      cdkBuilder.transitionAfter(transitionAfter.let(Duration::unwrap))
    }

    /**
     * @param transitionDate Indicates when objects are transitioned to the specified storage class.
     * The date value must be in ISO 8601 format. The time is always midnight UTC.
     */
    override fun transitionDate(transitionDate: Instant) {
      cdkBuilder.transitionDate(transitionDate)
    }

    public fun build(): software.amazon.awscdk.services.s3.Transition = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.Transition,
  ) : Transition {
    /**
     * The storage class to which you want the object to transition.
     */
    override fun storageClass(): StorageClass =
        unwrap(this).getStorageClass().let(StorageClass::wrap)

    /**
     * Indicates the number of days after creation when objects are transitioned to the specified
     * storage class.
     *
     * Default: - No transition count.
     */
    override fun transitionAfter(): Duration? =
        unwrap(this).getTransitionAfter()?.let(Duration::wrap)

    /**
     * Indicates when objects are transitioned to the specified storage class.
     *
     * The date value must be in ISO 8601 format. The time is always midnight UTC.
     *
     * Default: - No transition date.
     */
    override fun transitionDate(): Instant? = unwrap(this).getTransitionDate()
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
