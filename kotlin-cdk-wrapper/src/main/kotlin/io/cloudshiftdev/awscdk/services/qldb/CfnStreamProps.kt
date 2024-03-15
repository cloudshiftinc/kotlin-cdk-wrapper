@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qldb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStreamProps {
  public fun exclusiveEndTime(): String? = unwrap(this).getExclusiveEndTime()

  public fun inclusiveStartTime(): String

  public fun kinesisConfiguration(): Any

  public fun ledgerName(): String

  public fun roleArn(): String

  public fun streamName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun exclusiveEndTime(exclusiveEndTime: String)

    public fun inclusiveStartTime(inclusiveStartTime: String)

    public fun kinesisConfiguration(kinesisConfiguration: IResolvable)

    public fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d4894f839dfa44249faaca40814fa1b334b6d61869dde6c19f666bb4db9aeb")
    public
        fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty.Builder.() -> Unit)

    public fun ledgerName(ledgerName: String)

    public fun roleArn(roleArn: String)

    public fun streamName(streamName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qldb.CfnStreamProps.Builder =
        software.amazon.awscdk.services.qldb.CfnStreamProps.builder()

    override fun exclusiveEndTime(exclusiveEndTime: String) {
      cdkBuilder.exclusiveEndTime(exclusiveEndTime)
    }

    override fun inclusiveStartTime(inclusiveStartTime: String) {
      cdkBuilder.inclusiveStartTime(inclusiveStartTime)
    }

    override fun kinesisConfiguration(kinesisConfiguration: IResolvable) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(IResolvable::unwrap))
    }

    override
        fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(CfnStream.KinesisConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d4894f839dfa44249faaca40814fa1b334b6d61869dde6c19f666bb4db9aeb")
    override
        fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty.Builder.() -> Unit):
        Unit = kinesisConfiguration(CfnStream.KinesisConfigurationProperty(kinesisConfiguration))

    override fun ledgerName(ledgerName: String) {
      cdkBuilder.ledgerName(ledgerName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun streamName(streamName: String) {
      cdkBuilder.streamName(streamName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qldb.CfnStreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.qldb.CfnStreamProps,
  ) : CdkObject(cdkObject), CfnStreamProps {
    override fun exclusiveEndTime(): String? = unwrap(this).getExclusiveEndTime()

    override fun inclusiveStartTime(): String = unwrap(this).getInclusiveStartTime()

    override fun kinesisConfiguration(): Any = unwrap(this).getKinesisConfiguration()

    override fun ledgerName(): String = unwrap(this).getLedgerName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun streamName(): String = unwrap(this).getStreamName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnStreamProps):
        CfnStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamProps):
        software.amazon.awscdk.services.qldb.CfnStreamProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.qldb.CfnStreamProps
  }
}
