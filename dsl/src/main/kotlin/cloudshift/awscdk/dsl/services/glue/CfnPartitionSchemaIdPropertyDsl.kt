@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnPartition

@CdkDslMarker
public class CfnPartitionSchemaIdPropertyDsl {
  private val cdkBuilder: CfnPartition.SchemaIdProperty.Builder =
      CfnPartition.SchemaIdProperty.builder()

  /**
   * @param registryName The name of the schema registry that contains the schema.
   */
  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  /**
   * @param schemaArn The Amazon Resource Name (ARN) of the schema.
   * One of `SchemaArn` or `SchemaName` has to be
   * provided.
   */
  public fun schemaArn(schemaArn: String) {
    cdkBuilder.schemaArn(schemaArn)
  }

  /**
   * @param schemaName The name of the schema.
   * One of `SchemaArn` or `SchemaName` has to be provided.
   */
  public fun schemaName(schemaName: String) {
    cdkBuilder.schemaName(schemaName)
  }

  public fun build(): CfnPartition.SchemaIdProperty = cdkBuilder.build()
}
