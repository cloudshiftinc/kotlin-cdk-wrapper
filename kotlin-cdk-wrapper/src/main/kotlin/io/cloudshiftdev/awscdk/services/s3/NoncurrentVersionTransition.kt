@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Describes when noncurrent versions transition to a specified storage class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * StorageClass storageClass;
 * NoncurrentVersionTransition noncurrentVersionTransition = NoncurrentVersionTransition.builder()
 * .storageClass(storageClass)
 * .transitionAfter(Duration.minutes(30))
 * // the properties below are optional
 * .noncurrentVersionsToRetain(123)
 * .build();
 * ```
 */
public interface NoncurrentVersionTransition {
  /**
   * Indicates the number of noncurrent version objects to be retained.
   *
   * Can be up to 100 noncurrent versions retained.
   *
   * Default: - No noncurrent version retained.
   */
  public fun noncurrentVersionsToRetain(): Number? = unwrap(this).getNoncurrentVersionsToRetain()

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
  public fun transitionAfter(): Duration

  /**
   * A builder for [NoncurrentVersionTransition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param noncurrentVersionsToRetain Indicates the number of noncurrent version objects to be
     * retained.
     * Can be up to 100 noncurrent versions retained.
     */
    public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number)

    /**
     * @param storageClass The storage class to which you want the object to transition. 
     */
    public fun storageClass(storageClass: StorageClass)

    /**
     * @param transitionAfter Indicates the number of days after creation when objects are
     * transitioned to the specified storage class. 
     */
    public fun transitionAfter(transitionAfter: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder =
        software.amazon.awscdk.services.s3.NoncurrentVersionTransition.builder()

    /**
     * @param noncurrentVersionsToRetain Indicates the number of noncurrent version objects to be
     * retained.
     * Can be up to 100 noncurrent versions retained.
     */
    override fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
      cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
    }

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

    public fun build(): software.amazon.awscdk.services.s3.NoncurrentVersionTransition =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.NoncurrentVersionTransition,
  ) : CdkObject(cdkObject), NoncurrentVersionTransition {
    /**
     * Indicates the number of noncurrent version objects to be retained.
     *
     * Can be up to 100 noncurrent versions retained.
     *
     * Default: - No noncurrent version retained.
     */
    override fun noncurrentVersionsToRetain(): Number? =
        unwrap(this).getNoncurrentVersionsToRetain()

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
    override fun transitionAfter(): Duration = unwrap(this).getTransitionAfter().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NoncurrentVersionTransition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.NoncurrentVersionTransition):
        NoncurrentVersionTransition = CdkObjectWrappers.wrap(cdkObject) as
        NoncurrentVersionTransition

    internal fun unwrap(wrapped: NoncurrentVersionTransition):
        software.amazon.awscdk.services.s3.NoncurrentVersionTransition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.NoncurrentVersionTransition
  }
}
