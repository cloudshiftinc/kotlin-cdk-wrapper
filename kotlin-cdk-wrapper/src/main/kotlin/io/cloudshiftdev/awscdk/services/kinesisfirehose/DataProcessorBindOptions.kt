@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

/**
 * Options when binding a DataProcessor to a delivery stream destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * Role role;
 * DataProcessorBindOptions dataProcessorBindOptions = DataProcessorBindOptions.builder()
 * .role(role)
 * .build();
 * ```
 */
public interface DataProcessorBindOptions {
  /**
   * The IAM role assumed by Amazon Data Firehose to write to the destination that this
   * DataProcessor will bind to.
   */
  public fun role(): IRole

  /**
   * A builder for [DataProcessorBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param role The IAM role assumed by Amazon Data Firehose to write to the destination that
     * this DataProcessor will bind to. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorBindOptions.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorBindOptions.builder()

    /**
     * @param role The IAM role assumed by Amazon Data Firehose to write to the destination that
     * this DataProcessor will bind to. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DataProcessorBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorBindOptions,
  ) : CdkObject(cdkObject),
      DataProcessorBindOptions {
    /**
     * The IAM role assumed by Amazon Data Firehose to write to the destination that this
     * DataProcessor will bind to.
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProcessorBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorBindOptions):
        DataProcessorBindOptions = CdkObjectWrappers.wrap(cdkObject) as? DataProcessorBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataProcessorBindOptions):
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorBindOptions
  }
}
