@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Represents the properties of a local secondary index.
 *
 * A local secondary index can only be created when its parent table is created.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * LocalSecondaryIndexProperty localSecondaryIndexProperty = LocalSecondaryIndexProperty.builder()
 * .indexName("indexName")
 * .keySchema(List.of(KeySchemaProperty.builder()
 * .attributeName("attributeName")
 * .keyType("keyType")
 * .build()))
 * .projection(ProjectionProperty.builder()
 * .nonKeyAttributes(List.of("nonKeyAttributes"))
 * .projectionType("projectionType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html)
 */
@CdkDslMarker
public class CfnGlobalTableLocalSecondaryIndexPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.LocalSecondaryIndexProperty.Builder =
      CfnGlobalTable.LocalSecondaryIndexProperty.builder()

  private val _keySchema: MutableList<Any> = mutableListOf()

  /**
   * @param indexName The name of the local secondary index. 
   * The name must be unique among all other indexes on this table.
   */
  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  /**
   * @param keySchema The complete key schema for the local secondary index, consisting of one or
   * more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt;
   * The partition key of an item is also known as its *hash attribute* . 
   * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly
   * distribute data items across partitions, based on their partition key values.
   *
   *
   * The sort key of an item is also known as its *range attribute* . The term "range attribute"
   * derives from the way DynamoDB stores items with the same partition key physically close together,
   * in sorted order by the sort key value.
   */
  public fun keySchema(vararg keySchema: Any) {
    _keySchema.addAll(listOf(*keySchema))
  }

  /**
   * @param keySchema The complete key schema for the local secondary index, consisting of one or
   * more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt;
   * The partition key of an item is also known as its *hash attribute* . 
   * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly
   * distribute data items across partitions, based on their partition key values.
   *
   *
   * The sort key of an item is also known as its *range attribute* . The term "range attribute"
   * derives from the way DynamoDB stores items with the same partition key physically close together,
   * in sorted order by the sort key value.
   */
  public fun keySchema(keySchema: Collection<Any>) {
    _keySchema.addAll(keySchema)
  }

  /**
   * @param keySchema The complete key schema for the local secondary index, consisting of one or
   * more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt;
   * The partition key of an item is also known as its *hash attribute* . 
   * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly
   * distribute data items across partitions, based on their partition key values.
   *
   *
   * The sort key of an item is also known as its *range attribute* . The term "range attribute"
   * derives from the way DynamoDB stores items with the same partition key physically close together,
   * in sorted order by the sort key value.
   */
  public fun keySchema(keySchema: IResolvable) {
    cdkBuilder.keySchema(keySchema)
  }

  /**
   * @param projection Represents attributes that are copied (projected) from the table into the
   * local secondary index. 
   * These are in addition to the primary key attributes and index key attributes, which are
   * automatically projected.
   */
  public fun projection(projection: IResolvable) {
    cdkBuilder.projection(projection)
  }

  /**
   * @param projection Represents attributes that are copied (projected) from the table into the
   * local secondary index. 
   * These are in addition to the primary key attributes and index key attributes, which are
   * automatically projected.
   */
  public fun projection(projection: CfnGlobalTable.ProjectionProperty) {
    cdkBuilder.projection(projection)
  }

  public fun build(): CfnGlobalTable.LocalSecondaryIndexProperty {
    if(_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
    return cdkBuilder.build()
  }
}
