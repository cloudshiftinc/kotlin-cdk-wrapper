@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableLocalSecondaryIndexPropertyDsl {
  private val cdkBuilder: CfnTable.LocalSecondaryIndexProperty.Builder =
      CfnTable.LocalSecondaryIndexProperty.builder()

  private val _keySchema: MutableList<Any> = mutableListOf()

  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  public fun keySchema(vararg keySchema: Any) {
    _keySchema.addAll(listOf(*keySchema))
  }

  public fun keySchema(keySchema: Collection<Any>) {
    _keySchema.addAll(keySchema)
  }

  public fun keySchema(keySchema: IResolvable) {
    cdkBuilder.keySchema(keySchema)
  }

  public fun projection(projection: IResolvable) {
    cdkBuilder.projection(projection)
  }

  public fun projection(projection: CfnTable.ProjectionProperty) {
    cdkBuilder.projection(projection)
  }

  public fun build(): CfnTable.LocalSecondaryIndexProperty {
    if(_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
    return cdkBuilder.build()
  }
}
