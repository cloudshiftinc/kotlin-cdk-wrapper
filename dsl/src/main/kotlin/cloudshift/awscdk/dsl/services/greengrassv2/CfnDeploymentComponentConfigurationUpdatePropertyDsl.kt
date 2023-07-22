@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentComponentConfigurationUpdatePropertyDsl {
  private val cdkBuilder: CfnDeployment.ComponentConfigurationUpdateProperty.Builder =
      CfnDeployment.ComponentConfigurationUpdateProperty.builder()

  private val _reset: MutableList<String> = mutableListOf()

  /**
   * @param merge A serialized JSON string that contains the configuration object to merge to target
   * devices.
   * The core device merges this configuration with the component's existing configuration. If this
   * is the first time a component deploys on a device, the core device merges this configuration with
   * the component's default configuration. This means that the core device keeps it's existing
   * configuration for keys and values that you don't specify in this object. For more information, see
   * [Merge configuration
   * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   */
  public fun merge(merge: String) {
    cdkBuilder.merge(merge)
  }

  /**
   * @param reset The list of configuration nodes to reset to default values on target devices.
   * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash ( `/`
   * ) and use forward slashes to separate the key for each level in the object. For more information,
   * see the [JSON pointer
   * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
   * configuration
   * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   */
  public fun reset(vararg reset: String) {
    _reset.addAll(listOf(*reset))
  }

  /**
   * @param reset The list of configuration nodes to reset to default values on target devices.
   * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash ( `/`
   * ) and use forward slashes to separate the key for each level in the object. For more information,
   * see the [JSON pointer
   * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
   * configuration
   * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   */
  public fun reset(reset: Collection<String>) {
    _reset.addAll(reset)
  }

  public fun build(): CfnDeployment.ComponentConfigurationUpdateProperty {
    if(_reset.isNotEmpty()) cdkBuilder.reset(_reset)
    return cdkBuilder.build()
  }
}
