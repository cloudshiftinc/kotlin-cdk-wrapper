@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import java.time.Instant
import kotlin.Unit

/**
 * Describes when an object transitions to a specified storage class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * StorageClass storageClass;
 * Transition transition = Transition.builder()
 * .storageClass(storageClass)
 * // the properties below are optional
 * .transitionAfter(Duration.minutes(30))
 * .transitionDate(new Date())
 * .build();
 * ```
 */
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
      cdkBuilder.storageClass(storageClass.let(StorageClass.Companion::unwrap))
    }

    /**
     * @param transitionAfter Indicates the number of days after creation when objects are
     * transitioned to the specified storage class.
     */
    override fun transitionAfter(transitionAfter: Duration) {
      cdkBuilder.transitionAfter(transitionAfter.let(Duration.Companion::unwrap))
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.Transition,
  ) : CdkObject(cdkObject),
      Transition {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): Transition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Transition): Transition =
        CdkObjectWrappers.wrap(cdkObject) as? Transition ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Transition): software.amazon.awscdk.services.s3.Transition =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.Transition
  }
}
