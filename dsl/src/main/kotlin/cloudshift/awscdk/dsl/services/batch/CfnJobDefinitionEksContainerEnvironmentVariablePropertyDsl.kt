@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * An environment variable.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EksContainerEnvironmentVariableProperty eksContainerEnvironmentVariableProperty =
 * EksContainerEnvironmentVariableProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainerenvironmentvariable.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEksContainerEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EksContainerEnvironmentVariableProperty.Builder =
      CfnJobDefinition.EksContainerEnvironmentVariableProperty.builder()

  /**
   * @param name The name of the environment variable. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the environment variable.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnJobDefinition.EksContainerEnvironmentVariableProperty = cdkBuilder.build()
}
