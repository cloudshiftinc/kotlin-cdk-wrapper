package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface GlobalSecondaryIndexProps : SecondaryIndexProps, SchemaOptions {
  public fun readCapacity(): Number? = unwrap(this).getReadCapacity()

  public fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()

  public interface Builder {
    public fun indexName(indexName: String) {
    }

    public fun nonKeyAttributes(nonKeyAttributes: List<String>) {
    }

    public fun partitionKey(partitionKey: Attribute) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6156dc0b1cd9bc171f4bc5b535a41fa52fe198934af58253be961b48ab7178c")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit) {
    }

    public fun projectionType(projectionType: ProjectionType) {
    }

    public fun readCapacity(readCapacity: Number) {
    }

    public fun sortKey(sortKey: Attribute) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94370fb83cb81f326d5fee82bf5585ed3d0488cb069344f426d5b3a598b68de6")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit) {
    }

    public fun writeCapacity(writeCapacity: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder =
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.builder()

    public override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    public override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
      cdkBuilder.nonKeyAttributes(nonKeyAttributes)
    }

    public override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6156dc0b1cd9bc171f4bc5b535a41fa52fe198934af58253be961b48ab7178c")
    public override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    public override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    public override fun readCapacity(readCapacity: Number) {
      cdkBuilder.readCapacity(readCapacity)
    }

    public override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94370fb83cb81f326d5fee82bf5585ed3d0488cb069344f426d5b3a598b68de6")
    public override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit =
        sortKey(Attribute(sortKey))

    public override fun writeCapacity(writeCapacity: Number) {
      cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps,
  ) : GlobalSecondaryIndexProps {
    public override fun indexName(): String = unwrap(this).getIndexName()

    public override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
        emptyList()

    public override fun partitionKey(): Attribute =
        unwrap(this).getPartitionKey().let(Attribute::wrap)

    public override fun projectionType(): ProjectionType? =
        unwrap(this).getProjectionType()?.let(ProjectionType::wrap)

    public override fun readCapacity(): Number? = unwrap(this).getReadCapacity()

    public override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

    public override fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps):
        GlobalSecondaryIndexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GlobalSecondaryIndexProps):
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps = (wrapped as
        Wrapper).cdkObject
  }
}
