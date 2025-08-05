@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Base properties for all processor types.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * BaseProcessorProps baseProcessorProps = BaseProcessorProps.builder().build();
 * ```
 */
public interface BaseProcessorProps {
  /**
   * A builder for [BaseProcessorProps]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.BaseProcessorProps.Builder =
        software.amazon.awscdk.services.logs.BaseProcessorProps.builder()

    public fun build(): software.amazon.awscdk.services.logs.BaseProcessorProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.BaseProcessorProps,
  ) : CdkObject(cdkObject),
      BaseProcessorProps

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseProcessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.BaseProcessorProps):
        BaseProcessorProps = CdkObjectWrappers.wrap(cdkObject) as? BaseProcessorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseProcessorProps):
        software.amazon.awscdk.services.logs.BaseProcessorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.BaseProcessorProps
  }
}
