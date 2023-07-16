@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSchemaVersion

@CdkDslMarker
public class CfnSchemaVersionSchemaPropertyDsl {
  private val cdkBuilder: CfnSchemaVersion.SchemaProperty.Builder =
      CfnSchemaVersion.SchemaProperty.builder()

  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  public fun schemaArn(schemaArn: String) {
    cdkBuilder.schemaArn(schemaArn)
  }

  public fun schemaName(schemaName: String) {
    cdkBuilder.schemaName(schemaName)
  }

  public fun build(): CfnSchemaVersion.SchemaProperty = cdkBuilder.build()
}
