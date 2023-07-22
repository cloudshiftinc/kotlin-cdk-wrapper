@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.PluginContextQuery

/**
 * Query input for plugins.
 *
 * This alternate branch is necessary because it needs to be able to escape all type checking
 * we do on on the cloud assembly -- we cannot know the properties that will be used a priori.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * PluginContextQuery pluginContextQuery = PluginContextQuery.builder()
 * .pluginName("pluginName")
 * .build();
 * ```
 */
@CdkDslMarker
public class PluginContextQueryDsl {
  private val cdkBuilder: PluginContextQuery.Builder = PluginContextQuery.builder()

  /**
   * @param pluginName The name of the plugin. 
   */
  public fun pluginName(pluginName: String) {
    cdkBuilder.pluginName(pluginName)
  }

  public fun build(): PluginContextQuery = cdkBuilder.build()
}
