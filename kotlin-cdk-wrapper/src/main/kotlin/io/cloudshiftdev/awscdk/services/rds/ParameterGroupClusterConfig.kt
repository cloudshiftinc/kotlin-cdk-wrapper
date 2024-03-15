@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ParameterGroupClusterConfig {
  public fun parameterGroupName(): String

  @CdkDslMarker
  public interface Builder {
    public fun parameterGroupName(parameterGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ParameterGroupClusterConfig.Builder
        = software.amazon.awscdk.services.rds.ParameterGroupClusterConfig.builder()

    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupClusterConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterConfig,
  ) : CdkObject(cdkObject), ParameterGroupClusterConfig {
    override fun parameterGroupName(): String = unwrap(this).getParameterGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupClusterConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterConfig):
        ParameterGroupClusterConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParameterGroupClusterConfig):
        software.amazon.awscdk.services.rds.ParameterGroupClusterConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ParameterGroupClusterConfig
  }
}
