package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface TableOptionsV2 {
  public fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  public fun kinesisStream(): IStream? = unwrap(this).getKinesisStream()?.let(IStream::wrap)

  public fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

  public fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public interface Builder {
    public fun contributorInsights(contributorInsights: Boolean) {
    }

    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public fun kinesisStream(kinesisStream: IStream) {
    }

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
    }

    public fun tableClass(tableClass: TableClass) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableOptionsV2.Builder =
        software.amazon.awscdk.services.dynamodb.TableOptionsV2.builder()

    public override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream::unwrap))
    }

    public override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    public override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TableOptionsV2 = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.TableOptionsV2,
  ) : TableOptionsV2 {
    public override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    public override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    public override fun kinesisStream(): IStream? =
        unwrap(this).getKinesisStream()?.let(IStream::wrap)

    public override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

    public override fun tableClass(): TableClass? =
        unwrap(this).getTableClass()?.let(TableClass::wrap)

    public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TableOptionsV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableOptionsV2):
        TableOptionsV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableOptionsV2):
        software.amazon.awscdk.services.dynamodb.TableOptionsV2 = (wrapped as Wrapper).cdkObject
  }
}
