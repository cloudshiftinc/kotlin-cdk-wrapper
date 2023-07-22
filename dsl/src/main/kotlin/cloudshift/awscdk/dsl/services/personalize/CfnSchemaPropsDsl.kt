@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSchemaProps

@CdkDslMarker
public class CfnSchemaPropsDsl {
  private val cdkBuilder: CfnSchemaProps.Builder = CfnSchemaProps.builder()

  /**
   * @param domain The domain of a schema that you created for a dataset in a Domain dataset group.
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param name The name of the schema. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param schema The schema. 
   */
  public fun schema(schema: String) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnSchemaProps = cdkBuilder.build()
}
