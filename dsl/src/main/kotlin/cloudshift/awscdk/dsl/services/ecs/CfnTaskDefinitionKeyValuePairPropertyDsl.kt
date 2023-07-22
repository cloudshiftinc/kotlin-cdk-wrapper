@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionKeyValuePairPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.KeyValuePairProperty.Builder =
      CfnTaskDefinition.KeyValuePairProperty.builder()

  /**
   * @param name The name of the key-value pair.
   * For environment variables, this is the name of the environment variable.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the key-value pair.
   * For environment variables, this is the value of the environment variable.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTaskDefinition.KeyValuePairProperty = cdkBuilder.build()
}
