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

  /**
   * @param schemaId A structure that contains schema identity fields.
   * Either this or the `SchemaVersionId` has to be
   * provided.
   */
  public fun schemaId(schemaId: IResolvable) {
    cdkBuilder.schemaId(schemaId)
  }

  /**
   * @param schemaId A structure that contains schema identity fields.
   * Either this or the `SchemaVersionId` has to be
   * provided.
   */
  public fun schemaId(schemaId: CfnTable.SchemaIdProperty) {
    cdkBuilder.schemaId(schemaId)
  }

  /**
   * @param schemaVersionId The unique ID assigned to a version of the schema.
   * Either this or the `SchemaId` has to be provided.
   */
  public fun schemaVersionId(schemaVersionId: String) {
    cdkBuilder.schemaVersionId(schemaVersionId)
  }

  /**
   * @param schemaVersionNumber The version number of the schema.
   */
  public fun schemaVersionNumber(schemaVersionNumber: Number) {
    cdkBuilder.schemaVersionNumber(schemaVersionNumber)
  }

  public fun build(): CfnTable.SchemaReferenceProperty = cdkBuilder.build()
}
