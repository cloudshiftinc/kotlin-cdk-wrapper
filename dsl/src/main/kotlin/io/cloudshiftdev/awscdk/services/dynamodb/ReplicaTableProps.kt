package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ReplicaTableProps : TableOptionsV2 {
  public fun globalSecondaryIndexOptions(): Map<String, ReplicaGlobalSecondaryIndexOptions> =
      unwrap(this).getGlobalSecondaryIndexOptions()?.mapValues {
      ReplicaGlobalSecondaryIndexOptions.wrap(it.value)} ?: emptyMap()

  public fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

  public fun region(): String

  public interface Builder {
    public fun contributorInsights(contributorInsights: Boolean) {
    }

    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public
        fun globalSecondaryIndexOptions(globalSecondaryIndexOptions: Map<String, ReplicaGlobalSecondaryIndexOptions>) {
    }

    public fun kinesisStream(kinesisStream: IStream) {
    }

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
    }

    public fun readCapacity(readCapacity: Capacity) {
    }

    public fun region(region: String) {
    }

    public fun tableClass(tableClass: TableClass) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.ReplicaTableProps.Builder =
        software.amazon.awscdk.services.dynamodb.ReplicaTableProps.builder()

    public override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override
        fun globalSecondaryIndexOptions(globalSecondaryIndexOptions: Map<String, ReplicaGlobalSecondaryIndexOptions>) {
      cdkBuilder.globalSecondaryIndexOptions(globalSecondaryIndexOptions.mapValues {
          ReplicaGlobalSecondaryIndexOptions.unwrap(it.value)})
    }

    public override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream::unwrap))
    }

    public override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    public override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.ReplicaTableProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.ReplicaTableProps,
  ) : ReplicaTableProps {
    public override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    public override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    public override fun globalSecondaryIndexOptions():
        Map<String, ReplicaGlobalSecondaryIndexOptions> =
        unwrap(this).getGlobalSecondaryIndexOptions()?.mapValues {
        ReplicaGlobalSecondaryIndexOptions.wrap(it.value)} ?: emptyMap()

    public override fun kinesisStream(): IStream? =
        unwrap(this).getKinesisStream()?.let(IStream::wrap)

    public override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

    public override fun readCapacity(): Capacity? =
        unwrap(this).getReadCapacity()?.let(Capacity::wrap)

    public override fun region(): String = unwrap(this).getRegion()

    public override fun tableClass(): TableClass? =
        unwrap(this).getTableClass()?.let(TableClass::wrap)

    public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ReplicaTableProps):
        ReplicaTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicaTableProps):
        software.amazon.awscdk.services.dynamodb.ReplicaTableProps = (wrapped as Wrapper).cdkObject
  }
}
