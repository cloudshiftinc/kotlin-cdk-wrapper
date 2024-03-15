@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStreamProps {
  public fun name(): String? = unwrap(this).getName()

  public fun retentionPeriodHours(): Number? = unwrap(this).getRetentionPeriodHours()

  public fun shardCount(): Number? = unwrap(this).getShardCount()

  public fun streamEncryption(): Any? = unwrap(this).getStreamEncryption()

  public fun streamModeDetails(): Any? = unwrap(this).getStreamModeDetails()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun retentionPeriodHours(retentionPeriodHours: Number)

    public fun shardCount(shardCount: Number)

    public fun streamEncryption(streamEncryption: IResolvable)

    public fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdf51d1415dc44e499dbae10cfe631ffec347afa7ada4864fc25cffc9e8ed3f5")
    public
        fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty.Builder.() -> Unit)

    public fun streamModeDetails(streamModeDetails: IResolvable)

    public fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e439b8711b2ef7f9de0737140b05bc0b62bb5c9b30ddd28fb06858f30d580d1a")
    public
        fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder =
        software.amazon.awscdk.services.kinesis.CfnStreamProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun retentionPeriodHours(retentionPeriodHours: Number) {
      cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    override fun streamEncryption(streamEncryption: IResolvable) {
      cdkBuilder.streamEncryption(streamEncryption.let(IResolvable::unwrap))
    }

    override fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty) {
      cdkBuilder.streamEncryption(streamEncryption.let(CfnStream.StreamEncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdf51d1415dc44e499dbae10cfe631ffec347afa7ada4864fc25cffc9e8ed3f5")
    override
        fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty.Builder.() -> Unit):
        Unit = streamEncryption(CfnStream.StreamEncryptionProperty(streamEncryption))

    override fun streamModeDetails(streamModeDetails: IResolvable) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(IResolvable::unwrap))
    }

    override fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(CfnStream.StreamModeDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e439b8711b2ef7f9de0737140b05bc0b62bb5c9b30ddd28fb06858f30d580d1a")
    override
        fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty.Builder.() -> Unit):
        Unit = streamModeDetails(CfnStream.StreamModeDetailsProperty(streamModeDetails))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamProps,
  ) : CdkObject(cdkObject), CfnStreamProps {
    override fun name(): String? = unwrap(this).getName()

    override fun retentionPeriodHours(): Number? = unwrap(this).getRetentionPeriodHours()

    override fun shardCount(): Number? = unwrap(this).getShardCount()

    override fun streamEncryption(): Any? = unwrap(this).getStreamEncryption()

    override fun streamModeDetails(): Any? = unwrap(this).getStreamModeDetails()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamProps):
        CfnStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamProps):
        software.amazon.awscdk.services.kinesis.CfnStreamProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesis.CfnStreamProps
  }
}
