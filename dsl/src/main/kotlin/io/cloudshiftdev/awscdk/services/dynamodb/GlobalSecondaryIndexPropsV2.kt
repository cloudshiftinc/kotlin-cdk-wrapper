package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface GlobalSecondaryIndexPropsV2 : SecondaryIndexProps {
  public fun partitionKey(): Attribute

  public fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

  public fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

  public fun writeCapacity(): Capacity? = unwrap(this).getWriteCapacity()?.let(Capacity::wrap)

  public interface Builder {
    public fun indexName(indexName: String)

    public fun nonKeyAttributes(nonKeyAttributes: List<String>)

    public fun partitionKey(partitionKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123239baff6e2020df15e382c804e8ffc4aee89cef63bf919d82b9a3c4707ae9")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    public fun projectionType(projectionType: ProjectionType)

    public fun readCapacity(readCapacity: Capacity)

    public fun sortKey(sortKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4418ea1de7991af0bfc3f647fbdfbb9e791e9c8c08304b824c9ba17159c69b16")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    public fun writeCapacity(writeCapacity: Capacity)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2.Builder =
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2.builder()

    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
      cdkBuilder.nonKeyAttributes(nonKeyAttributes)
    }

    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123239baff6e2020df15e382c804e8ffc4aee89cef63bf919d82b9a3c4707ae9")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
    }

    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4418ea1de7991af0bfc3f647fbdfbb9e791e9c8c08304b824c9ba17159c69b16")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    override fun writeCapacity(writeCapacity: Capacity) {
      cdkBuilder.writeCapacity(writeCapacity.let(Capacity::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2 =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2,
  ) : GlobalSecondaryIndexPropsV2 {
    override fun indexName(): String = unwrap(this).getIndexName()

    override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
        emptyList()

    override fun partitionKey(): Attribute = unwrap(this).getPartitionKey().let(Attribute::wrap)

    override fun projectionType(): ProjectionType? =
        unwrap(this).getProjectionType()?.let(ProjectionType::wrap)

    override fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

    override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

    override fun writeCapacity(): Capacity? = unwrap(this).getWriteCapacity()?.let(Capacity::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexPropsV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2):
        GlobalSecondaryIndexPropsV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GlobalSecondaryIndexPropsV2):
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2 = (wrapped as
        Wrapper).cdkObject
  }
}
