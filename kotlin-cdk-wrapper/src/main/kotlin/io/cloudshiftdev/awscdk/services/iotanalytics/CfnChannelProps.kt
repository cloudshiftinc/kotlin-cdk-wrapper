@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

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
  public fun channelName(): String? = unwrap(this).getChannelName()

  public fun channelStorage(): Any? = unwrap(this).getChannelStorage()

  public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun channelName(channelName: String)

    public fun channelStorage(channelStorage: IResolvable)

    public fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bef286a5a68501cc4ba5cef2c5618cffc4851de1468746adb51f2f54c588de")
    public fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty.Builder.() -> Unit)

    public fun retentionPeriod(retentionPeriod: IResolvable)

    public fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e2409666fd5d8c3f185c3ba82e16684880c9649b2f9096b07cf5f5eb1948f4")
    public
        fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnChannelProps.builder()

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun channelStorage(channelStorage: IResolvable) {
      cdkBuilder.channelStorage(channelStorage.let(IResolvable::unwrap))
    }

    override fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty) {
      cdkBuilder.channelStorage(channelStorage.let(CfnChannel.ChannelStorageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bef286a5a68501cc4ba5cef2c5618cffc4851de1468746adb51f2f54c588de")
    override
        fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty.Builder.() -> Unit):
        Unit = channelStorage(CfnChannel.ChannelStorageProperty(channelStorage))

    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(CfnChannel.RetentionPeriodProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36e2409666fd5d8c3f185c3ba82e16684880c9649b2f9096b07cf5f5eb1948f4")
    override
        fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty.Builder.() -> Unit):
        Unit = retentionPeriod(CfnChannel.RetentionPeriodProperty(retentionPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    override fun channelName(): String? = unwrap(this).getChannelName()

    override fun channelStorage(): Any? = unwrap(this).getChannelStorage()

    override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnChannelProps):
        CfnChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.iotanalytics.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotanalytics.CfnChannelProps
  }
}
