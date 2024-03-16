@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Options for `IParameterGroup.bindToInstance`. Empty for now, but can be extended later.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * ParameterGroupInstanceBindOptions parameterGroupInstanceBindOptions =
 * ParameterGroupInstanceBindOptions.builder().build();
 * ```
 */
public interface ParameterGroupInstanceBindOptions {
  /**
   * A builder for [ParameterGroupInstanceBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions.Builder =
        software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions.builder()

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions,
  ) : CdkObject(cdkObject), ParameterGroupInstanceBindOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupInstanceBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions):
        ParameterGroupInstanceBindOptions = CdkObjectWrappers.wrap(cdkObject) as
        ParameterGroupInstanceBindOptions

    internal fun unwrap(wrapped: ParameterGroupInstanceBindOptions):
        software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions
  }
}
