@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnTable

@CdkDslMarker
public class CfnTableSchemaIdPropertyDsl {
  private val cdkBuilder: CfnTable.SchemaIdProperty.Builder = CfnTable.SchemaIdProperty.builder()

  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  public fun schemaArn(schemaArn: String) {
    cdkBuilder.schemaArn(schemaArn)
  }

  public fun schemaName(schemaName: String) {
    cdkBuilder.schemaName(schemaName)
  }

  public fun build(): CfnTable.SchemaIdProperty = cdkBuilder.build()
}
