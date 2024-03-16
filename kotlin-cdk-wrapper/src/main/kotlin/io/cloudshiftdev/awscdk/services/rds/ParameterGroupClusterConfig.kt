@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The type returned from `IParameterGroup.bindToCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * ParameterGroupClusterConfig parameterGroupClusterConfig = ParameterGroupClusterConfig.builder()
 * .parameterGroupName("parameterGroupName")
 * .build();
 * ```
 */
public interface ParameterGroupClusterConfig {
  /**
   * The name of this parameter group.
   */
  public fun parameterGroupName(): String

  /**
   * A builder for [ParameterGroupClusterConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameterGroupName The name of this parameter group. 
     */
    public fun parameterGroupName(parameterGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ParameterGroupClusterConfig.Builder
        = software.amazon.awscdk.services.rds.ParameterGroupClusterConfig.builder()

    /**
     * @param parameterGroupName The name of this parameter group. 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupClusterConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterConfig,
  ) : CdkObject(cdkObject), ParameterGroupClusterConfig {
    /**
     * The name of this parameter group.
     */
    override fun parameterGroupName(): String = unwrap(this).getParameterGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupClusterConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterConfig):
        ParameterGroupClusterConfig = CdkObjectWrappers.wrap(cdkObject) as
        ParameterGroupClusterConfig

    internal fun unwrap(wrapped: ParameterGroupClusterConfig):
        software.amazon.awscdk.services.rds.ParameterGroupClusterConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ParameterGroupClusterConfig
  }
}
