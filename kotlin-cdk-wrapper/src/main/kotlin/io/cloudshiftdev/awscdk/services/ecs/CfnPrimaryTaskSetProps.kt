@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPrimaryTaskSetProps {
  public fun cluster(): String

  public fun service(): String

  public fun taskSetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: String)

    public fun service(service: String)

    public fun taskSetId(taskSetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps.Builder =
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps.builder()

    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    override fun taskSetId(taskSetId: String) {
      cdkBuilder.taskSetId(taskSetId)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps,
  ) : CdkObject(cdkObject), CfnPrimaryTaskSetProps {
    override fun cluster(): String = unwrap(this).getCluster()

    override fun service(): String = unwrap(this).getService()

    override fun taskSetId(): String = unwrap(this).getTaskSetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrimaryTaskSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps):
        CfnPrimaryTaskSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrimaryTaskSetProps):
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps
  }
}
