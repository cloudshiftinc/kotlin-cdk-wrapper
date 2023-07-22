@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

@CdkDslMarker
public class CfnStackStackConfigurationManagerPropertyDsl {
  private val cdkBuilder: CfnStack.StackConfigurationManagerProperty.Builder =
      CfnStack.StackConfigurationManagerProperty.builder()

  /**
   * @param name The name.
   * This parameter must be set to `Chef` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The Chef version.
   * This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
   * stacks. The default value for Linux stacks is 12.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnStack.StackConfigurationManagerProperty = cdkBuilder.build()
}
