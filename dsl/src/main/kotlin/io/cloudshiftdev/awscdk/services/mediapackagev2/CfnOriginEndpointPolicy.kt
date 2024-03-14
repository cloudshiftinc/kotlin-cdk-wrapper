package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOriginEndpointPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

  public open fun channelGroupName(`value`: String) {
    unwrap(this).setChannelGroupName(`value`)
  }

  public open fun channelName(): String = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

  public open fun originEndpointName(`value`: String) {
    unwrap(this).setOriginEndpointName(`value`)
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public interface Builder {
    public fun channelGroupName(channelGroupName: String) {
    }

    public fun channelName(channelName: String) {
    }

    public fun originEndpointName(originEndpointName: String) {
    }

    public fun policy(policy: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy.Builder.create(scope,
        id)

    public override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    public override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    public override fun originEndpointName(originEndpointName: String) {
      cdkBuilder.originEndpointName(originEndpointName)
    }

    public override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginEndpointPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginEndpointPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy):
        CfnOriginEndpointPolicy = CfnOriginEndpointPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpointPolicy):
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy = wrapped.cdkObject
  }
}
