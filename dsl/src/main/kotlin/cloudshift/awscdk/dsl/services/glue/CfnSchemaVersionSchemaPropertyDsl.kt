@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSchemaVersion

@CdkDslMarker
public class CfnSchemaVersionSchemaPropertyDsl {
  private val cdkBuilder: CfnSchemaVersion.SchemaProperty.Builder =
      CfnSchemaVersion.SchemaProperty.builder()

  /**
   * @param registryName The name of the registry where the schema is stored.
   * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
   */
  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  /**
   * @param schemaArn The Amazon Resource Name (ARN) of the schema.
   * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
   */
  public fun schemaArn(schemaArn: String) {
    cdkBuilder.schemaArn(schemaArn)
  }

  /**
   * @param schemaName The name of the schema.
   * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
   */
  public fun schemaName(schemaName: String) {
    cdkBuilder.schemaName(schemaName)
  }

  public fun build(): CfnSchemaVersion.SchemaProperty = cdkBuilder.build()
}
