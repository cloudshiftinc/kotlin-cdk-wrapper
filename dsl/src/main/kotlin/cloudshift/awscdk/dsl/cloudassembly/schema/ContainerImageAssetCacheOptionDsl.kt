@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption

/**
 * Options for configuring the Docker cache backend.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * ContainerImageAssetCacheOption containerImageAssetCacheOption =
 * ContainerImageAssetCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build();
 * ```
 */
@CdkDslMarker
public class ContainerImageAssetCacheOptionDsl {
  private val cdkBuilder: ContainerImageAssetCacheOption.Builder =
      ContainerImageAssetCacheOption.builder()

  /**
   * @param params Any parameters to pass into the docker cache backend configuration.
   * Refer to https://docs.docker.com/build/cache/backends/ for cache backend configuration.
   */
  public fun params(params: Map<String, String>) {
    cdkBuilder.params(params)
  }

  /**
   * @param type The type of cache to use. 
   * Refer to https://docs.docker.com/build/cache/backends/ for full list of backends.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): ContainerImageAssetCacheOption = cdkBuilder.build()
}
