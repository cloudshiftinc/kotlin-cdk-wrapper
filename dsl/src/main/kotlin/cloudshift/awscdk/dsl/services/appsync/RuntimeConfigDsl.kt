@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.RuntimeConfig

/**
 * Config for binding runtime to a function or resolver.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * RuntimeConfig runtimeConfig = RuntimeConfig.builder()
 * .name("name")
 * .runtimeVersion("runtimeVersion")
 * .build();
 * ```
 */
@CdkDslMarker
public class RuntimeConfigDsl {
  private val cdkBuilder: RuntimeConfig.Builder = RuntimeConfig.builder()

  /**
   * @param name The name of the runtime. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param runtimeVersion The version string of the runtime. 
   */
  public fun runtimeVersion(runtimeVersion: String) {
    cdkBuilder.runtimeVersion(runtimeVersion)
  }

  public fun build(): RuntimeConfig = cdkBuilder.build()
}
