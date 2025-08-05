@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Options when binding a destination to a delivery stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * DestinationBindOptions destinationBindOptions = DestinationBindOptions.builder().build();
 * ```
 */
public interface DestinationBindOptions {
  /**
   * A builder for [DestinationBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DestinationBindOptions.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DestinationBindOptions.builder()

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DestinationBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DestinationBindOptions,
  ) : CdkObject(cdkObject),
      DestinationBindOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DestinationBindOptions):
        DestinationBindOptions = CdkObjectWrappers.wrap(cdkObject) as? DestinationBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationBindOptions):
        software.amazon.awscdk.services.kinesisfirehose.DestinationBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.DestinationBindOptions
  }
}
