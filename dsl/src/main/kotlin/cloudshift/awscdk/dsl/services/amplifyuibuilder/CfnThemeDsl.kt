@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme
import software.constructs.Construct

@CdkDslMarker
public class CfnThemeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTheme.Builder = CfnTheme.Builder.create(scope, id)

  private val _overrides: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun overrides(vararg overrides: Any) {
    _overrides.addAll(listOf(*overrides))
  }

  public fun overrides(overrides: Collection<Any>) {
    _overrides.addAll(overrides)
  }

  public fun overrides(overrides: IResolvable) {
    cdkBuilder.overrides(overrides)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnTheme {
    if(_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
