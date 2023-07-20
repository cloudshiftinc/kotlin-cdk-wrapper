@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.SchemaOptions

@CdkDslMarker
public class SchemaOptionsDsl {
  private val cdkBuilder: SchemaOptions.Builder = SchemaOptions.builder()

  public fun partitionKey(block: AttributeDsl.() -> Unit = {}) {
    val builder = AttributeDsl()
    builder.apply(block)
    cdkBuilder.partitionKey(builder.build())
  }

  public fun partitionKey(partitionKey: Attribute) {
    cdkBuilder.partitionKey(partitionKey)
  }

  public fun sortKey(block: AttributeDsl.() -> Unit = {}) {
    val builder = AttributeDsl()
    builder.apply(block)
    cdkBuilder.sortKey(builder.build())
  }

  public fun sortKey(sortKey: Attribute) {
    cdkBuilder.sortKey(sortKey)
  }

  public fun build(): SchemaOptions = cdkBuilder.build()
}
