@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ActivityProps {
  public fun activityName(): String? = unwrap(this).getActivityName()

  @CdkDslMarker
  public interface Builder {
    public fun activityName(activityName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ActivityProps.builder()

    override fun activityName(activityName: String) {
      cdkBuilder.activityName(activityName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ActivityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ActivityProps,
  ) : CdkObject(cdkObject), ActivityProps {
    override fun activityName(): String? = unwrap(this).getActivityName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActivityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ActivityProps):
        ActivityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActivityProps):
        software.amazon.awscdk.services.stepfunctions.ActivityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ActivityProps
  }
}
