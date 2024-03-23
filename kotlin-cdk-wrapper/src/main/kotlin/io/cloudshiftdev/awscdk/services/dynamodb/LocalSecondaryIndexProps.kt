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
 * Properties for a local secondary index.
 *
 * Example:
 *
 * ```
 * TableV2 table = TableV2.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .sortKey(Attribute.builder().name("sk").type(AttributeType.NUMBER).build())
 * .localSecondaryIndexes(List.of(LocalSecondaryIndexProps.builder()
 * .indexName("lsi1")
 * .sortKey(Attribute.builder().name("sk").type(AttributeType.NUMBER).build())
 * .build()))
 * .build();
 * table.addLocalSecondaryIndex(LocalSecondaryIndexProps.builder()
 * .indexName("lsi2")
 * .sortKey(Attribute.builder().name("sk").type(AttributeType.NUMBER).build())
 * .build());
 * ```
 */
public interface LocalSecondaryIndexProps : SecondaryIndexProps {
  /**
   * The attribute of a sort key for the local secondary index.
   */
  public fun sortKey(): Attribute

  /**
   * A builder for [LocalSecondaryIndexProps]
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
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    public fun projectionType(projectionType: ProjectionType)

    /**
     * @param sortKey The attribute of a sort key for the local secondary index. 
     */
    public fun sortKey(sortKey: Attribute)

    /**
     * @param sortKey The attribute of a sort key for the local secondary index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c886d09806679b298f25bbf7fdda5a00deacee4c6bfe47a743ab2e6aaa13058c")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder =
        software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.builder()

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
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    /**
     * @param sortKey The attribute of a sort key for the local secondary index. 
     */
    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    /**
     * @param sortKey The attribute of a sort key for the local secondary index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c886d09806679b298f25bbf7fdda5a00deacee4c6bfe47a743ab2e6aaa13058c")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    public fun build(): software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps,
  ) : CdkObject(cdkObject), LocalSecondaryIndexProps {
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
     * The set of attributes that are projected into the secondary index.
     *
     * Default: ALL
     */
    override fun projectionType(): ProjectionType? =
        unwrap(this).getProjectionType()?.let(ProjectionType::wrap)

    /**
     * The attribute of a sort key for the local secondary index.
     */
    override fun sortKey(): Attribute = unwrap(this).getSortKey().let(Attribute::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LocalSecondaryIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps):
        LocalSecondaryIndexProps = CdkObjectWrappers.wrap(cdkObject) as? LocalSecondaryIndexProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LocalSecondaryIndexProps):
        software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps
  }
}
