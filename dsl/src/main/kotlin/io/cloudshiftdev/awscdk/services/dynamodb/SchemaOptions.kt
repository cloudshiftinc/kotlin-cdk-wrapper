package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SchemaOptions {
  public fun partitionKey(): Attribute

  public fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

  public interface Builder {
    public fun partitionKey(partitionKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4c35138eae0dcd4575d9c3db2f0433fc5be81aa0d4958afdc44db8653bda5dc")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    public fun sortKey(sortKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5449151fb1479c80881adff8c2b13729f36d00bbc0474ac2a3482509b93c268e")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.SchemaOptions.Builder =
        software.amazon.awscdk.services.dynamodb.SchemaOptions.builder()

    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4c35138eae0dcd4575d9c3db2f0433fc5be81aa0d4958afdc44db8653bda5dc")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5449151fb1479c80881adff8c2b13729f36d00bbc0474ac2a3482509b93c268e")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    public fun build(): software.amazon.awscdk.services.dynamodb.SchemaOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.SchemaOptions,
  ) : SchemaOptions {
    override fun partitionKey(): Attribute = unwrap(this).getPartitionKey().let(Attribute::wrap)

    override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SchemaOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.SchemaOptions):
        SchemaOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SchemaOptions):
        software.amazon.awscdk.services.dynamodb.SchemaOptions = (wrapped as Wrapper).cdkObject
  }
}
