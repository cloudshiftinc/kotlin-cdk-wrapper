@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AlbControllerOptions
import software.amazon.awscdk.services.eks.AlbControllerVersion

@CdkDslMarker
public class AlbControllerOptionsDsl {
  private val cdkBuilder: AlbControllerOptions.Builder = AlbControllerOptions.builder()

  public fun policy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policy(builder.map)
  }

  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  public fun version(version: AlbControllerVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): AlbControllerOptions = cdkBuilder.build()
}
