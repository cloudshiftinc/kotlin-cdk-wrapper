@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationMatchPatternPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.MatchPatternProperty.Builder =
      CfnLoggingConfiguration.MatchPatternProperty.builder()

  private val _includedPaths: MutableList<String> = mutableListOf()

  public fun all(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.all(builder.map)
  }

  public fun all(all: Any) {
    cdkBuilder.all(all)
  }

  public fun includedPaths(vararg includedPaths: String) {
    _includedPaths.addAll(listOf(*includedPaths))
  }

  public fun includedPaths(includedPaths: Collection<String>) {
    _includedPaths.addAll(includedPaths)
  }

  public fun build(): CfnLoggingConfiguration.MatchPatternProperty {
    if(_includedPaths.isNotEmpty()) cdkBuilder.includedPaths(_includedPaths)
    return cdkBuilder.build()
  }
}
