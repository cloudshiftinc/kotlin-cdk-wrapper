@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreSchemaDefinitionPropertyDsl {
  private val cdkBuilder: CfnDatastore.SchemaDefinitionProperty.Builder =
      CfnDatastore.SchemaDefinitionProperty.builder()

  private val _columns: MutableList<Any> = mutableListOf()

  public fun columns(vararg columns: Any) {
    _columns.addAll(listOf(*columns))
  }

  public fun columns(columns: Collection<Any>) {
    _columns.addAll(columns)
  }

  public fun columns(columns: IResolvable) {
    cdkBuilder.columns(columns)
  }

  public fun build(): CfnDatastore.SchemaDefinitionProperty {
    if(_columns.isNotEmpty()) cdkBuilder.columns(_columns)
    return cdkBuilder.build()
  }
}
