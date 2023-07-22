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

  /**
   * @param all Match all of the elements.
   * You must specify either this setting or the `IncludedPaths` setting, but not both.
   */
  public fun all(all: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(all)
    cdkBuilder.all(builder.map)
  }

  /**
   * @param all Match all of the elements.
   * You must specify either this setting or the `IncludedPaths` setting, but not both.
   */
  public fun all(all: Any) {
    cdkBuilder.all(all)
  }

  /**
   * @param includedPaths Match only the specified include paths.
   * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
   * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
   * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
   * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
   *
   * You must specify either this setting or the `All` setting, but not both.
   *
   *
   * Don't use this option to include all paths. Instead, use the `All` setting.
   */
  public fun includedPaths(vararg includedPaths: String) {
    _includedPaths.addAll(listOf(*includedPaths))
  }

  /**
   * @param includedPaths Match only the specified include paths.
   * Provide the include paths using JSON Pointer syntax. For example, `"IncludedPaths":
   * ["/dogs/0/name", "/dogs/1/name"]` . For information about this syntax, see the Internet
   * Engineering Task Force (IETF) documentation [JavaScript Object Notation (JSON)
   * Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
   *
   * You must specify either this setting or the `All` setting, but not both.
   *
   *
   * Don't use this option to include all paths. Instead, use the `All` setting.
   */
  public fun includedPaths(includedPaths: Collection<String>) {
    _includedPaths.addAll(includedPaths)
  }

  public fun build(): CfnLoggingConfiguration.MatchPatternProperty {
    if(_includedPaths.isNotEmpty()) cdkBuilder.includedPaths(_includedPaths)
    return cdkBuilder.build()
  }
}
