@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
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
 * Table table = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .contributorInsightsEnabled(true)
 * .build();
 * table.addGlobalSecondaryIndex(GlobalSecondaryIndexProps.builder()
 * .contributorInsightsEnabled(true) // for a specific global secondary index
 * .indexName("gsi")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .build());
 * ```
 */
public interface GlobalSecondaryIndexProps : SecondaryIndexProps, SchemaOptions {
  /**
   * Whether CloudWatch contributor insights is enabled for the specified global secondary index.
   *
   * Default: false
   */
  public fun contributorInsightsEnabled(): Boolean? = unwrap(this).getContributorInsightsEnabled()

  /**
   * The maximum read request units for the global secondary index.
   *
   * Can only be provided if table billingMode is PAY_PER_REQUEST.
   *
   * Default: - on-demand throughput is disabled
   */
  public fun maxReadRequestUnits(): Number? = unwrap(this).getMaxReadRequestUnits()

  /**
   * The maximum write request units for the global secondary index.
   *
   * Can only be provided if table billingMode is PAY_PER_REQUEST.
   *
   * Default: - on-demand throughput is disabled
   */
  public fun maxWriteRequestUnits(): Number? = unwrap(this).getMaxWriteRequestUnits()

  /**
   * The read capacity for the global secondary index.
   *
   * Can only be provided if table billingMode is Provisioned or undefined.
   *
   * Default: 5
   */
  public fun readCapacity(): Number? = unwrap(this).getReadCapacity()

  /**
   * The warm throughput configuration for the global secondary index.
   *
   * Default: - no warm throughput is configured
   */
  public fun warmThroughput(): WarmThroughput? =
      unwrap(this).getWarmThroughput()?.let(WarmThroughput::wrap)

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
     * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled for the
     * specified global secondary index.
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    /**
     * @param indexName The name of the secondary index. 
     */
    public fun indexName(indexName: String)

    /**
     * @param maxReadRequestUnits The maximum read request units for the global secondary index.
     * Can only be provided if table billingMode is PAY_PER_REQUEST.
     */
    public fun maxReadRequestUnits(maxReadRequestUnits: Number)

    /**
     * @param maxWriteRequestUnits The maximum write request units for the global secondary index.
     * Can only be provided if table billingMode is PAY_PER_REQUEST.
     */
    public fun maxWriteRequestUnits(maxWriteRequestUnits: Number)

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
     * @param warmThroughput The warm throughput configuration for the global secondary index.
     */
    public fun warmThroughput(warmThroughput: WarmThroughput)

    /**
     * @param warmThroughput The warm throughput configuration for the global secondary index.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92b82b674fa2cf7a6212df136473b095c46139b1cd265fa2e067f459e2405eb9")
    public fun warmThroughput(warmThroughput: WarmThroughput.Builder.() -> Unit)

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
     * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled for the
     * specified global secondary index.
     */
    override fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    /**
     * @param indexName The name of the secondary index. 
     */
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * @param maxReadRequestUnits The maximum read request units for the global secondary index.
     * Can only be provided if table billingMode is PAY_PER_REQUEST.
     */
    override fun maxReadRequestUnits(maxReadRequestUnits: Number) {
      cdkBuilder.maxReadRequestUnits(maxReadRequestUnits)
    }

    /**
     * @param maxWriteRequestUnits The maximum write request units for the global secondary index.
     * Can only be provided if table billingMode is PAY_PER_REQUEST.
     */
    override fun maxWriteRequestUnits(maxWriteRequestUnits: Number) {
      cdkBuilder.maxWriteRequestUnits(maxWriteRequestUnits)
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
      cdkBuilder.partitionKey(partitionKey.let(Attribute.Companion::unwrap))
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
      cdkBuilder.projectionType(projectionType.let(ProjectionType.Companion::unwrap))
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
      cdkBuilder.sortKey(sortKey.let(Attribute.Companion::unwrap))
    }

    /**
     * @param sortKey Sort key attribute definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94370fb83cb81f326d5fee82bf5585ed3d0488cb069344f426d5b3a598b68de6")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    /**
     * @param warmThroughput The warm throughput configuration for the global secondary index.
     */
    override fun warmThroughput(warmThroughput: WarmThroughput) {
      cdkBuilder.warmThroughput(warmThroughput.let(WarmThroughput.Companion::unwrap))
    }

    /**
     * @param warmThroughput The warm throughput configuration for the global secondary index.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92b82b674fa2cf7a6212df136473b095c46139b1cd265fa2e067f459e2405eb9")
    override fun warmThroughput(warmThroughput: WarmThroughput.Builder.() -> Unit): Unit =
        warmThroughput(WarmThroughput(warmThroughput))

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
    cdkObject: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps,
  ) : CdkObject(cdkObject),
      GlobalSecondaryIndexProps {
    /**
     * Whether CloudWatch contributor insights is enabled for the specified global secondary index.
     *
     * Default: false
     */
    override fun contributorInsightsEnabled(): Boolean? =
        unwrap(this).getContributorInsightsEnabled()

    /**
     * The name of the secondary index.
     */
    override fun indexName(): String = unwrap(this).getIndexName()

    /**
     * The maximum read request units for the global secondary index.
     *
     * Can only be provided if table billingMode is PAY_PER_REQUEST.
     *
     * Default: - on-demand throughput is disabled
     */
    override fun maxReadRequestUnits(): Number? = unwrap(this).getMaxReadRequestUnits()

    /**
     * The maximum write request units for the global secondary index.
     *
     * Can only be provided if table billingMode is PAY_PER_REQUEST.
     *
     * Default: - on-demand throughput is disabled
     */
    override fun maxWriteRequestUnits(): Number? = unwrap(this).getMaxWriteRequestUnits()

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
     * The warm throughput configuration for the global secondary index.
     *
     * Default: - no warm throughput is configured
     */
    override fun warmThroughput(): WarmThroughput? =
        unwrap(this).getWarmThroughput()?.let(WarmThroughput::wrap)

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
