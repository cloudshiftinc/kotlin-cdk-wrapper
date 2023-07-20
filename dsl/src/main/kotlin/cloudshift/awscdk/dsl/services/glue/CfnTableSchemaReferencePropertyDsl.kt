@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable

@CdkDslMarker
public class CfnTableSchemaReferencePropertyDsl {
  private val cdkBuilder: CfnTable.SchemaReferenceProperty.Builder =
      CfnTable.SchemaReferenceProperty.builder()

  public fun schemaId(schemaId: IResolvable) {
    cdkBuilder.schemaId(schemaId)
  }

  public fun schemaId(schemaId: CfnTable.SchemaIdProperty) {
    cdkBuilder.schemaId(schemaId)
  }

  public fun schemaVersionId(schemaVersionId: String) {
    cdkBuilder.schemaVersionId(schemaVersionId)
  }

  public fun schemaVersionNumber(schemaVersionNumber: Number) {
    cdkBuilder.schemaVersionNumber(schemaVersionNumber)
  }

  public fun build(): CfnTable.SchemaReferenceProperty = cdkBuilder.build()
}
