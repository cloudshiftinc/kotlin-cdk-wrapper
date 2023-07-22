@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableKeySchemaPropertyDsl {
  private val cdkBuilder: CfnTable.KeySchemaProperty.Builder = CfnTable.KeySchemaProperty.builder()

  /**
   * @param attributeName The name of a key attribute. 
   */
  public fun attributeName(attributeName: String) {
    cdkBuilder.attributeName(attributeName)
  }

  /**
   * @param keyType The role that this key attribute will assume:. 
   * * `HASH` - partition key
   * * `RANGE` - sort key
   *
   *
   * The partition key of an item is also known as its *hash attribute* . The term "hash attribute"
   * derives from DynamoDB's usage of an internal hash function to evenly distribute data items across
   * partitions, based on their partition key values.
   *
   * The sort key of an item is also known as its *range attribute* . The term "range attribute"
   * derives from the way DynamoDB stores items with the same partition key physically close together,
   * in sorted order by the sort key value.
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  public fun build(): CfnTable.KeySchemaProperty = cdkBuilder.build()
}
