@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnVoiceChannelProps {
  public fun applicationId(): String

  public fun enabled(): Any? = unwrap(this).getEnabled()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps,
  ) : CdkObject(cdkObject), CfnVoiceChannelProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun enabled(): Any? = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVoiceChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps):
        CfnVoiceChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVoiceChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps
  }
}
