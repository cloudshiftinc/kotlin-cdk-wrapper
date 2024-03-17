@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a global secondary index.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * GlobalSecondaryIndexProps globalSecondaryIndexProps = GlobalSecondaryIndexProps.builder()
 * .indexName("indexName")
 * .partitionKey(Attribute.builder()
 * .name("name")
 * .type(AttributeType.BINARY)
 * .build())
 * // the properties below are optional
 * .nonKeyAttributes(List.of("nonKeyAttributes"))
 * .projectionType(ProjectionType.KEYS_ONLY)
 * .readCapacity(123)
 * .sortKey(Attribute.builder()
 * .name("name")
 * .type(AttributeType.BINARY)
 * .build())
 * .writeCapacity(123)
 * .build();
 * ```
 */
public interface GlobalSecondaryIndexProps : SecondaryIndexProps, SchemaOptions {
  /**
   * The read capacity for the global secondary index.
   *
   * Can only be provided if table billingMode is Provisioned or undefined.
   *
   * Default: 5
   */
  public fun readCapacity(): Number? = unwrap(this).getReadCapacity()

  /**
   * The write capacity for the global secondary index.
   *
   * Can only be provided if table billingMode is Provisioned or undefined.
   *
   * Default: 5
   */
  public fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()

  /**
   * A builder for [GlobalSecondaryIndexProps]
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
    @JvmName("f6156dc0b1cd9bc171f4bc5b535a41fa52fe198934af58253be961b48ab7178c")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    /**
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    public fun projectionType(projectionType: ProjectionType)

    /**
     * @param readCapacity The read capacity for the global secondary index.
     * Can only be provided if table billingMode is Provisioned or undefined.
     */
    public fun readCapacity(readCapacity: Number)

    /**
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: Attribute)

    /**
     * @param sortKey Sort key attribute definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94370fb83cb81f326d5fee82bf5585ed3d0488cb069344f426d5b3a598b68de6")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    /**
     * @param writeCapacity The write capacity for the global secondary index.
     * Can only be provided if table billingMode is Provisioned or undefined.
     */
    public fun writeCapacity(writeCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder =
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.builder()

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
    @JvmName("f6156dc0b1cd9bc171f4bc5b535a41fa52fe198934af58253be961b48ab7178c")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    /**
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    /**
     * @param readCapacity The read capacity for the global secondary index.
     * Can only be provided if table billingMode is Provisioned or undefined.
     */
    override fun readCapacity(readCapacity: Number) {
      cdkBuilder.readCapacity(readCapacity)
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
    @JvmName("94370fb83cb81f326d5fee82bf5585ed3d0488cb069344f426d5b3a598b68de6")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    /**
     * @param writeCapacity The write capacity for the global secondary index.
     * Can only be provided if table billingMode is Provisioned or undefined.
     */
    override fun writeCapacity(writeCapacity: Number) {
      cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps,
  ) : CdkObject(cdkObject), GlobalSecondaryIndexProps {
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
     * The read capacity for the global secondary index.
     *
     * Can only be provided if table billingMode is Provisioned or undefined.
     *
     * Default: 5
     */
    override fun readCapacity(): Number? = unwrap(this).getReadCapacity()

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     */
    override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

    /**
     * The write capacity for the global secondary index.
     *
     * Can only be provided if table billingMode is Provisioned or undefined.
     *
     * Default: 5
     */
    override fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps):
        GlobalSecondaryIndexProps = CdkObjectWrappers.wrap(cdkObject) as? GlobalSecondaryIndexProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GlobalSecondaryIndexProps):
        software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps
  }
}
