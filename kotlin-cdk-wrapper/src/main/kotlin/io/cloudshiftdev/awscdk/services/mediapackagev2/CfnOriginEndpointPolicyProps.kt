@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnOriginEndpointPolicyProps {
  public fun channelGroupName(): String

  public fun channelName(): String

  public fun originEndpointName(): String

  public fun policy(): Any

  @CdkDslMarker
  public interface Builder {
    public fun channelGroupName(channelGroupName: String)

    public fun channelName(channelName: String)

    public fun originEndpointName(originEndpointName: String)

    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps.builder()

    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun originEndpointName(originEndpointName: String) {
      cdkBuilder.originEndpointName(originEndpointName)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps,
  ) : CdkObject(cdkObject), CfnOriginEndpointPolicyProps {
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    override fun channelName(): String = unwrap(this).getChannelName()

    override fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginEndpointPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps):
        CfnOriginEndpointPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpointPolicyProps):
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps
  }
}
