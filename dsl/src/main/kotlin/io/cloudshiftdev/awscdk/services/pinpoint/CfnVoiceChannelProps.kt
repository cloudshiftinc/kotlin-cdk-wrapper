package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnVoiceChannelProps {
  /**
   * The unique identifier for the Amazon Pinpoint application that the voice channel applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-applicationid)
   */
  public fun applicationId(): String

  /**
   * Specifies whether to enable the voice channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A builder for [CfnVoiceChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the voice
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param enabled Specifies whether to enable the voice channel for the application.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to enable the voice channel for the application.
     */
    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the voice
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param enabled Specifies whether to enable the voice channel for the application.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the voice channel for the application.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps,
  ) : CdkObject(cdkObject), CfnVoiceChannelProps {
    /**
     * The unique identifier for the Amazon Pinpoint application that the voice channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Specifies whether to enable the voice channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
     */
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
