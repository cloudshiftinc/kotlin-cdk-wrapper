package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SchemaOptions {
  /**
   * Partition key attribute definition.
   */
  public fun partitionKey(): Attribute

  /**
   * Sort key attribute definition.
   *
   * Default: no sort key
   */
  public fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

  /**
   * A builder for [SchemaOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param partitionKey Partition key attribute definition. 
     */
    public fun partitionKey(partitionKey: Attribute)

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4c35138eae0dcd4575d9c3db2f0433fc5be81aa0d4958afdc44db8653bda5dc")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    /**
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: Attribute)

    /**
     * @param sortKey Sort key attribute definition.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5449151fb1479c80881adff8c2b13729f36d00bbc0474ac2a3482509b93c268e")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.SchemaOptions.Builder =
        software.amazon.awscdk.services.dynamodb.SchemaOptions.builder()

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4c35138eae0dcd4575d9c3db2f0433fc5be81aa0d4958afdc44db8653bda5dc")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    /**
     * @param sortKey Sort key attribute definition.
     */
    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    /**
     * @param sortKey Sort key attribute definition.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5449151fb1479c80881adff8c2b13729f36d00bbc0474ac2a3482509b93c268e")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    public fun build(): software.amazon.awscdk.services.dynamodb.SchemaOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.SchemaOptions,
  ) : SchemaOptions {
    /**
     * Partition key attribute definition.
     */
    override fun partitionKey(): Attribute = unwrap(this).getPartitionKey().let(Attribute::wrap)

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     */
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
