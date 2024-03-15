@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface CfnLogAnomalyDetectionIntegrationProps {
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps.Builder =
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps.builder()

    public fun build():
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps,
  ) : CdkObject(cdkObject), CfnLogAnomalyDetectionIntegrationProps

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnLogAnomalyDetectionIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps):
        CfnLogAnomalyDetectionIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogAnomalyDetectionIntegrationProps):
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps
  }
}
