@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata
import software.constructs.Construct

@CdkDslMarker
public class CfnSchemaVersionMetadataDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSchemaVersionMetadata.Builder =
      CfnSchemaVersionMetadata.Builder.create(scope, id)

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun schemaVersionId(schemaVersionId: String) {
    cdkBuilder.schemaVersionId(schemaVersionId)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnSchemaVersionMetadata = cdkBuilder.build()
}
