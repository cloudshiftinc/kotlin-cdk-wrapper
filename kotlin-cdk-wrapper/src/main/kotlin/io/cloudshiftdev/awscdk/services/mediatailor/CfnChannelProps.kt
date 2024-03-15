@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnChannelProps {
  public fun channelName(): String

  public fun fillerSlate(): Any? = unwrap(this).getFillerSlate()

  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  public fun outputs(): Any

  public fun playbackMode(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tier(): String? = unwrap(this).getTier()

  public fun timeShiftConfiguration(): Any? = unwrap(this).getTimeShiftConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun channelName(channelName: String)

    public fun fillerSlate(fillerSlate: IResolvable)

    public fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3630406ac8daf209f49224ced0626b8e477ab1f8cf49b506554fb513039556e7")
    public fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty.Builder.() -> Unit)

    public fun logConfiguration(logConfiguration: IResolvable)

    public fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("912c5e8c0457d2a9c16a430b335d4ffb91b9b345b269159c812350456fd30518")
    public
        fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty.Builder.() -> Unit)

    public fun outputs(outputs: IResolvable)

    public fun outputs(outputs: List<Any>)

    public fun outputs(vararg outputs: Any)

    public fun playbackMode(playbackMode: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tier(tier: String)

    public fun timeShiftConfiguration(timeShiftConfiguration: IResolvable)

    public
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f880b814fefcd9aff85728770f6112e76298f051e7c790acfefc3fdd99d296b")
    public
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnChannelProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnChannelProps.builder()

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun fillerSlate(fillerSlate: IResolvable) {
      cdkBuilder.fillerSlate(fillerSlate.let(IResolvable::unwrap))
    }

    override fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty) {
      cdkBuilder.fillerSlate(fillerSlate.let(CfnChannel.SlateSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3630406ac8daf209f49224ced0626b8e477ab1f8cf49b506554fb513039556e7")
    override fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty.Builder.() -> Unit): Unit =
        fillerSlate(CfnChannel.SlateSourceProperty(fillerSlate))

    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    override fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnChannel.LogConfigurationForChannelProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("912c5e8c0457d2a9c16a430b335d4ffb91b9b345b269159c812350456fd30518")
    override
        fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty.Builder.() -> Unit):
        Unit = logConfiguration(CfnChannel.LogConfigurationForChannelProperty(logConfiguration))

    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
    }

    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs)
    }

    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    override fun playbackMode(playbackMode: String) {
      cdkBuilder.playbackMode(playbackMode)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    override fun timeShiftConfiguration(timeShiftConfiguration: IResolvable) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(IResolvable::unwrap))
    }

    override
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(CfnChannel.TimeShiftConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f880b814fefcd9aff85728770f6112e76298f051e7c790acfefc3fdd99d296b")
    override
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty.Builder.() -> Unit):
        Unit =
        timeShiftConfiguration(CfnChannel.TimeShiftConfigurationProperty(timeShiftConfiguration))

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    override fun channelName(): String = unwrap(this).getChannelName()

    override fun fillerSlate(): Any? = unwrap(this).getFillerSlate()

    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    override fun outputs(): Any = unwrap(this).getOutputs()

    override fun playbackMode(): String = unwrap(this).getPlaybackMode()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tier(): String? = unwrap(this).getTier()

    override fun timeShiftConfiguration(): Any? = unwrap(this).getTimeShiftConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelProps):
        CfnChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.mediatailor.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnChannelProps
  }
}
