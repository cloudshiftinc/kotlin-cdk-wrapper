@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTrackerConsumerProps {
  public fun consumerArn(): String

  public fun trackerName(): String

  @CdkDslMarker
  public interface Builder {
    public fun consumerArn(consumerArn: String)

    public fun trackerName(trackerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTrackerConsumerProps.Builder
        = software.amazon.awscdk.services.location.CfnTrackerConsumerProps.builder()

    override fun consumerArn(consumerArn: String) {
      cdkBuilder.consumerArn(consumerArn)
    }

    override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTrackerConsumerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumerProps,
  ) : CdkObject(cdkObject), CfnTrackerConsumerProps {
    override fun consumerArn(): String = unwrap(this).getConsumerArn()

    override fun trackerName(): String = unwrap(this).getTrackerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrackerConsumerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumerProps):
        CfnTrackerConsumerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrackerConsumerProps):
        software.amazon.awscdk.services.location.CfnTrackerConsumerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnTrackerConsumerProps
  }
}
