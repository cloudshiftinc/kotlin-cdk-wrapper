@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnChannelPolicyProps {
  public fun channelGroupName(): String

  public fun channelName(): String

  public fun policy(): Any

  @CdkDslMarker
  public interface Builder {
    public fun channelGroupName(channelGroupName: String)

    public fun channelName(channelName: String)

    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps.builder()

    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps,
  ) : CdkObject(cdkObject), CfnChannelPolicyProps {
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    override fun channelName(): String = unwrap(this).getChannelName()

    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps):
        CfnChannelPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelPolicyProps):
        software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps
  }
}