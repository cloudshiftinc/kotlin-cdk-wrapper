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

  /**
   * A metadata key in a key-value pair for metadata.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-key)
   * @param key A metadata key in a key-value pair for metadata. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * The version number of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-schemaversionid)
   * @param schemaVersionId The version number of the schema. 
   */
  public fun schemaVersionId(schemaVersionId: String) {
    cdkBuilder.schemaVersionId(schemaVersionId)
  }

  /**
   * A metadata key's corresponding value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-value)
   * @param value A metadata key's corresponding value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnSchemaVersionMetadata = cdkBuilder.build()
}
