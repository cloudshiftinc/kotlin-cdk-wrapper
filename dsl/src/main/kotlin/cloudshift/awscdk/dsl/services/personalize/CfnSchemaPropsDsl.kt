@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSchemaProps

@CdkDslMarker
public class CfnSchemaPropsDsl {
  private val cdkBuilder: CfnSchemaProps.Builder = CfnSchemaProps.builder()

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun schema(schema: String) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnSchemaProps = cdkBuilder.build()
}
