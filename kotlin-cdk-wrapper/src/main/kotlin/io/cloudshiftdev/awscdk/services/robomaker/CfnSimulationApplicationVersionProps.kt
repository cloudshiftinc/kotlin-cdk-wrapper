@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSimulationApplicationVersionProps {
  public fun application(): String

  public fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  @CdkDslMarker
  public interface Builder {
    public fun application(application: String)

    public fun currentRevisionId(currentRevisionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.builder()

    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build():
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps,
  ) : CdkObject(cdkObject), CfnSimulationApplicationVersionProps {
    override fun application(): String = unwrap(this).getApplication()

    override fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSimulationApplicationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps):
        CfnSimulationApplicationVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationApplicationVersionProps):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps
  }
}
