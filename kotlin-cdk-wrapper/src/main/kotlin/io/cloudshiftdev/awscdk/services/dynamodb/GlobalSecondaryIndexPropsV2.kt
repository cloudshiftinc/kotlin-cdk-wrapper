@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties used to configure a global secondary index.
 *
 * Example:
 *
 * ```
 * TableV2 table = TableV2.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .globalSecondaryIndexes(List.of(GlobalSecondaryIndexPropsV2.builder()
 * .indexName("gsi1")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .build()))
 * .build();
 * table.addGlobalSecondaryIndex(GlobalSecondaryIndexPropsV2.builder()
 * .indexName("gsi2")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .build());
 * ```
 */
public interface GlobalSecondaryIndexPropsV2 : SecondaryIndexProps {
  /**
   * Partition key attribute definition.
   */
  public fun partitionKey(): Attribute

  /**
   * The read capacity.
   *
   * Note: This can only be configured if the primary table billing is provisioned.
   *
   * Default: - inherited from the primary table.
   */
  public fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

  /**
   * Sort key attribute definition.
   *
   * Default: - no sort key
   */
  public fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

  /**
   * The write capacity.
   *
   * Note: This can only be configured if the primary table billing is provisioned.
   *
   * Default: - inherited from the primary table.
   */
  public fun writeCapacity(): Capacity? = unwrap(this).getWriteCapacity()?.let(Capacity::wrap)

  /**
   * A builder for [GlobalSecondaryIndexPropsV2]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param indexName The name of the secondary index. 
     */
    public fun indexName(indexName: String)

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    public fun nonKeyAttributes(nonKeyAttributes: List<String>)

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    public fun nonKeyAttributes(vararg nonKeyAttributes: String)

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    public fun partitionKey(partitionKey: Attribute)

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123239baff6e2020df15e382c804e8ffc4aee89cef63bf919d82b9a3c4707ae9")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    /**
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    public fun projectionType(projectionType: ProjectionType)

    /**
     * @param readCapacity The read capacity.
     * Note: This can only be configured if the primary table billing is provisioned.
     */
    public fun readCapacity(readCapacity: Capacity)

    /**
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: Attribute)

    /**
     * @param sortKey Sort key attribute definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4418ea1de7991af0bfc3f647fbdfbb9e791e9c8c08304b824c9ba17159c69b16")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    /**
     * @param writeCapacity The write capacity.
     * Note: This can only be configured if the primary table billing is provisioned.
     */
    public fun writeCapacity(writeCapacity: Capacity)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2.Builder =
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2.builder()

    /**
     * @param indexName The name of the secondary index. 
     */
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
      cdkBuilder.nonKeyAttributes(nonKeyAttributes)
    }

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    override fun nonKeyAttributes(vararg nonKeyAttributes: String): Unit =
        nonKeyAttributes(nonKeyAttributes.toList())

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("123239baff6e2020df15e382c804e8ffc4aee89cef63bf919d82b9a3c4707ae9")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    /**
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    /**
     * @param readCapacity The read capacity.
     * Note: This can only be configured if the primary table billing is provisioned.
     */
    override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
    }

    /**
     * @param sortKey Sort key attribute definition.
     */
    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    /**
     * @param sortKey Sort key attribute definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4418ea1de7991af0bfc3f647fbdfbb9e791e9c8c08304b824c9ba17159c69b16")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    /**
     * @param writeCapacity The write capacity.
     * Note: This can only be configured if the primary table billing is provisioned.
     */
    override fun writeCapacity(writeCapacity: Capacity) {
      cdkBuilder.writeCapacity(writeCapacity.let(Capacity::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2 =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2,
  ) : CdkObject(cdkObject), GlobalSecondaryIndexPropsV2 {
    /**
     * The name of the secondary index.
     */
    override fun indexName(): String = unwrap(this).getIndexName()

    /**
     * The non-key attributes that are projected into the secondary index.
     *
     * Default: - No additional attributes
     */
    override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
        emptyList()

    /**
     * Partition key attribute definition.
     */
    override fun partitionKey(): Attribute = unwrap(this).getPartitionKey().let(Attribute::wrap)

    /**
     * The set of attributes that are projected into the secondary index.
     *
     * Default: ALL
     */
    override fun projectionType(): ProjectionType? =
        unwrap(this).getProjectionType()?.let(ProjectionType::wrap)

    /**
     * The read capacity.
     *
     * Note: This can only be configured if the primary table billing is provisioned.
     *
     * Default: - inherited from the primary table.
     */
    override fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

    /**
     * Sort key attribute definition.
     *
     * Default: - no sort key
     */
    override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

    /**
     * The write capacity.
     *
     * Note: This can only be configured if the primary table billing is provisioned.
     *
     * Default: - inherited from the primary table.
     */
    override fun writeCapacity(): Capacity? = unwrap(this).getWriteCapacity()?.let(Capacity::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexPropsV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2):
        GlobalSecondaryIndexPropsV2 = CdkObjectWrappers.wrap(cdkObject) as?
        GlobalSecondaryIndexPropsV2 ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GlobalSecondaryIndexPropsV2):
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2 = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2
  }
}
