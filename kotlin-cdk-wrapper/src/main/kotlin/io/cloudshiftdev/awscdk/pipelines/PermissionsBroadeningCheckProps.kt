@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public interface PermissionsBroadeningCheckProps {
  public fun notificationTopic(): ITopic? = unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  public fun stage(): Stage

  @CdkDslMarker
  public interface Builder {
    public fun notificationTopic(notificationTopic: ITopic)

    public fun stage(stage: Stage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps.Builder
        = software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps.builder()

    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps,
  ) : CdkObject(cdkObject), PermissionsBroadeningCheckProps {
    override fun notificationTopic(): ITopic? =
        unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

    override fun stage(): Stage = unwrap(this).getStage().let(Stage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PermissionsBroadeningCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps):
        PermissionsBroadeningCheckProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PermissionsBroadeningCheckProps):
        software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps
  }
}
