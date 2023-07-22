@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSchema

@CdkDslMarker
public class CfnSchemaRegistryPropertyDsl {
  private val cdkBuilder: CfnSchema.RegistryProperty.Builder = CfnSchema.RegistryProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the registry.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param name The name of the registry.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnSchema.RegistryProperty = cdkBuilder.build()
}
