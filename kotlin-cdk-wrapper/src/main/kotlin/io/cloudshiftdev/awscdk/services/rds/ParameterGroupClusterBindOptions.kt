@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Options for `IParameterGroup.bindToCluster`. Empty for now, but can be extended later.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * ParameterGroupClusterBindOptions parameterGroupClusterBindOptions =
 * ParameterGroupClusterBindOptions.builder().build();
 * ```
 */
public interface ParameterGroupClusterBindOptions {
  /**
   * A builder for [ParameterGroupClusterBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions.Builder =
        software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions.builder()

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions,
  ) : CdkObject(cdkObject), ParameterGroupClusterBindOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupClusterBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions):
        ParameterGroupClusterBindOptions = CdkObjectWrappers.wrap(cdkObject) as
        ParameterGroupClusterBindOptions

    internal fun unwrap(wrapped: ParameterGroupClusterBindOptions):
        software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions
  }
}
