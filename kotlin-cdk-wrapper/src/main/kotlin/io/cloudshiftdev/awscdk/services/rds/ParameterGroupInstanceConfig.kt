@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The type returned from `IParameterGroup.bindToInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * ParameterGroupInstanceConfig parameterGroupInstanceConfig =
 * ParameterGroupInstanceConfig.builder()
 * .parameterGroupName("parameterGroupName")
 * .build();
 * ```
 */
public interface ParameterGroupInstanceConfig {
  /**
   * The name of this parameter group.
   */
  public fun parameterGroupName(): String

  /**
   * A builder for [ParameterGroupInstanceConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameterGroupName The name of this parameter group. 
     */
    public fun parameterGroupName(parameterGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig.Builder
        = software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig.builder()

    /**
     * @param parameterGroupName The name of this parameter group. 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig,
  ) : CdkObject(cdkObject), ParameterGroupInstanceConfig {
    /**
     * The name of this parameter group.
     */
    override fun parameterGroupName(): String = unwrap(this).getParameterGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupInstanceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig):
        ParameterGroupInstanceConfig = CdkObjectWrappers.wrap(cdkObject) as
        ParameterGroupInstanceConfig

    internal fun unwrap(wrapped: ParameterGroupInstanceConfig):
        software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig
  }
}
