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
      unwrap(this).getGlobalSecondaryIndexOptions()?.mapValues{ReplicaGlobalSecondaryIndexOptions.wrap(it.value)}
      ?: emptyMap()

  public fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

  public fun region(): String

  public interface Builder {
    public fun contributorInsights(contributorInsights: Boolean)

    public fun deletionProtection(deletionProtection: Boolean)

    public
        fun globalSecondaryIndexOptions(globalSecondaryIndexOptions: Map<String, ReplicaGlobalSecondaryIndexOptions>)

    public fun kinesisStream(kinesisStream: IStream)

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    public fun readCapacity(readCapacity: Capacity)

    public fun region(region: String)

    public fun tableClass(tableClass: TableClass)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.ReplicaTableProps.Builder =
        software.amazon.awscdk.services.dynamodb.ReplicaTableProps.builder()

    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override
        fun globalSecondaryIndexOptions(globalSecondaryIndexOptions: Map<String, ReplicaGlobalSecondaryIndexOptions>) {
      cdkBuilder.globalSecondaryIndexOptions(globalSecondaryIndexOptions.mapValues{ReplicaGlobalSecondaryIndexOptions.unwrap(it.value)})
    }

    override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream::unwrap))
    }

    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.ReplicaTableProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.ReplicaTableProps,
  ) : ReplicaTableProps {
    override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun globalSecondaryIndexOptions(): Map<String, ReplicaGlobalSecondaryIndexOptions> =
        unwrap(this).getGlobalSecondaryIndexOptions()?.mapValues{ReplicaGlobalSecondaryIndexOptions.wrap(it.value)}
        ?: emptyMap()

    override fun kinesisStream(): IStream? = unwrap(this).getKinesisStream()?.let(IStream::wrap)

    override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

    override fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

    override fun region(): String = unwrap(this).getRegion()

    override fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
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
