@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSchema
import software.constructs.Construct

@CdkDslMarker
public class CfnSchemaDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSchema.Builder = CfnSchema.Builder.create(scope, id)

  /**
   * The domain of a schema that you created for a dataset in a Domain dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-domain)
   * @param domain The domain of a schema that you created for a dataset in a Domain dataset group. 
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * The name of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-name)
   * @param name The name of the schema. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-schema)
   * @param schema The schema. 
   */
  public fun schema(schema: String) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnSchema = cdkBuilder.build()
}
