@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMultiplexprogramProps {
  public fun channelId(): String? = unwrap(this).getChannelId()

  public fun multiplexId(): String? = unwrap(this).getMultiplexId()

  public fun multiplexProgramSettings(): Any? = unwrap(this).getMultiplexProgramSettings()

  public fun packetIdentifiersMap(): Any? = unwrap(this).getPacketIdentifiersMap()

  public fun pipelineDetails(): Any? = unwrap(this).getPipelineDetails()

  public fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

  public fun programName(): String? = unwrap(this).getProgramName()

  @CdkDslMarker
  public interface Builder {
    public fun channelId(channelId: String)

    public fun multiplexId(multiplexId: String)

    public fun multiplexProgramSettings(multiplexProgramSettings: IResolvable)

    public
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f86e838824de0bc11c5110b5446a9979e87cf0041223062bc7ac6f30eb20167")
    public
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder.() -> Unit)

    public fun packetIdentifiersMap(packetIdentifiersMap: IResolvable)

    public
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46950dcf087d812755c96b310e4d26126f47af1f8f3ed21d991060bf2e424791")
    public
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit)

    public fun pipelineDetails(pipelineDetails: IResolvable)

    public fun pipelineDetails(pipelineDetails: List<Any>)

    public fun pipelineDetails(vararg pipelineDetails: Any)

    public fun preferredChannelPipeline(preferredChannelPipeline: String)

    public fun programName(programName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps.builder()

    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    override fun multiplexId(multiplexId: String) {
      cdkBuilder.multiplexId(multiplexId)
    }

    override fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(IResolvable::unwrap))
    }

    override
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(CfnMultiplexprogram.MultiplexProgramSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f86e838824de0bc11c5110b5446a9979e87cf0041223062bc7ac6f30eb20167")
    override
        fun multiplexProgramSettings(multiplexProgramSettings: CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder.() -> Unit):
        Unit =
        multiplexProgramSettings(CfnMultiplexprogram.MultiplexProgramSettingsProperty(multiplexProgramSettings))

    override fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(IResolvable::unwrap))
    }

    override
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46950dcf087d812755c96b310e4d26126f47af1f8f3ed21d991060bf2e424791")
    override
        fun packetIdentifiersMap(packetIdentifiersMap: CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit):
        Unit =
        packetIdentifiersMap(CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty(packetIdentifiersMap))

    override fun pipelineDetails(pipelineDetails: IResolvable) {
      cdkBuilder.pipelineDetails(pipelineDetails.let(IResolvable::unwrap))
    }

    override fun pipelineDetails(pipelineDetails: List<Any>) {
      cdkBuilder.pipelineDetails(pipelineDetails)
    }

    override fun pipelineDetails(vararg pipelineDetails: Any): Unit =
        pipelineDetails(pipelineDetails.toList())

    override fun preferredChannelPipeline(preferredChannelPipeline: String) {
      cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
    }

    override fun programName(programName: String) {
      cdkBuilder.programName(programName)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps,
  ) : CdkObject(cdkObject), CfnMultiplexprogramProps {
    override fun channelId(): String? = unwrap(this).getChannelId()

    override fun multiplexId(): String? = unwrap(this).getMultiplexId()

    override fun multiplexProgramSettings(): Any? = unwrap(this).getMultiplexProgramSettings()

    override fun packetIdentifiersMap(): Any? = unwrap(this).getPacketIdentifiersMap()

    override fun pipelineDetails(): Any? = unwrap(this).getPipelineDetails()

    override fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

    override fun programName(): String? = unwrap(this).getProgramName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMultiplexprogramProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps):
        CfnMultiplexprogramProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiplexprogramProps):
        software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps
  }
}
