@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.GetContextKeyOptions

@CdkDslMarker
public class GetContextKeyOptionsDsl {
  private val cdkBuilder: GetContextKeyOptions.Builder = GetContextKeyOptions.builder()

  /**
   * @param includeEnvironment Whether to include the stack's account and region automatically.
   */
  public fun includeEnvironment(includeEnvironment: Boolean) {
    cdkBuilder.includeEnvironment(includeEnvironment)
  }

  /**
   * @param props Provider-specific properties.
   */
  public fun props(props: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(props)
    cdkBuilder.props(builder.map)
  }

  /**
   * @param props Provider-specific properties.
   */
  public fun props(props: Map<String, Any>) {
    cdkBuilder.props(props)
  }

  /**
   * @param provider The context provider to query. 
   */
  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  public fun build(): GetContextKeyOptions = cdkBuilder.build()
}
