@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.ProjectionType
import software.amazon.awscdk.services.dynamodb.SecondaryIndexProps

@CdkDslMarker
public class SecondaryIndexPropsDsl {
  private val cdkBuilder: SecondaryIndexProps.Builder = SecondaryIndexProps.builder()

  private val _nonKeyAttributes: MutableList<String> = mutableListOf()

  /**
   * @param indexName The name of the secondary index. 
   */
  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  /**
   * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
   */
  public fun nonKeyAttributes(vararg nonKeyAttributes: String) {
    _nonKeyAttributes.addAll(listOf(*nonKeyAttributes))
  }

  /**
   * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
   */
  public fun nonKeyAttributes(nonKeyAttributes: Collection<String>) {
    _nonKeyAttributes.addAll(nonKeyAttributes)
  }

  /**
   * @param projectionType The set of attributes that are projected into the secondary index.
   */
  public fun projectionType(projectionType: ProjectionType) {
    cdkBuilder.projectionType(projectionType)
  }

  public fun build(): SecondaryIndexProps {
    if(_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
    return cdkBuilder.build()
  }
}
