@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Override ephemeral storage for the task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * EphemeralStorageOverride ephemeralStorageOverride = EphemeralStorageOverride.builder()
 * .sizeInGiB(123)
 * .build();
 * ```
 */
public interface EphemeralStorageOverride {
  /**
   * The total amount, in GiB, of ephemeral storage to set for the task.
   *
   * The minimum supported value is 20 GiB and the maximum supported value is 200 GiB.
   */
  public fun sizeInGiB(): Number

  /**
   * A builder for [EphemeralStorageOverride]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
     * The minimum supported value is 20 GiB and the maximum supported value is 200 GiB.
     */
    public fun sizeInGiB(sizeInGiB: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.EphemeralStorageOverride.Builder =
        software.amazon.awscdk.services.events.targets.EphemeralStorageOverride.builder()

    /**
     * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
     * The minimum supported value is 20 GiB and the maximum supported value is 200 GiB.
     */
    override fun sizeInGiB(sizeInGiB: Number) {
      cdkBuilder.sizeInGiB(sizeInGiB)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.EphemeralStorageOverride =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.EphemeralStorageOverride,
  ) : CdkObject(cdkObject),
      EphemeralStorageOverride {
    /**
     * The total amount, in GiB, of ephemeral storage to set for the task.
     *
     * The minimum supported value is 20 GiB and the maximum supported value is 200 GiB.
     */
    override fun sizeInGiB(): Number = unwrap(this).getSizeInGiB()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.EphemeralStorageOverride):
        EphemeralStorageOverride = CdkObjectWrappers.wrap(cdkObject) as? EphemeralStorageOverride ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EphemeralStorageOverride):
        software.amazon.awscdk.services.events.targets.EphemeralStorageOverride = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.EphemeralStorageOverride
  }
}
