@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@CdkDslMarker
public class CfnFunctionDefinitionVersionEnvironmentPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersion.EnvironmentProperty.Builder =
      CfnFunctionDefinitionVersion.EnvironmentProperty.builder()

  private val _resourceAccessPolicies: MutableList<Any> = mutableListOf()

  public fun accessSysfs(accessSysfs: Boolean) {
    cdkBuilder.accessSysfs(accessSysfs)
  }

  public fun accessSysfs(accessSysfs: IResolvable) {
    cdkBuilder.accessSysfs(accessSysfs)
  }

  public fun execution(execution: IResolvable) {
    cdkBuilder.execution(execution)
  }

  public fun execution(execution: CfnFunctionDefinitionVersion.ExecutionProperty) {
    cdkBuilder.execution(execution)
  }

  public fun resourceAccessPolicies(vararg resourceAccessPolicies: Any) {
    _resourceAccessPolicies.addAll(listOf(*resourceAccessPolicies))
  }

  public fun resourceAccessPolicies(resourceAccessPolicies: Collection<Any>) {
    _resourceAccessPolicies.addAll(resourceAccessPolicies)
  }

  public fun resourceAccessPolicies(resourceAccessPolicies: IResolvable) {
    cdkBuilder.resourceAccessPolicies(resourceAccessPolicies)
  }

  public fun variables(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.variables(builder.map)
  }

  public fun variables(variables: Any) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnFunctionDefinitionVersion.EnvironmentProperty {
    if(_resourceAccessPolicies.isNotEmpty())
        cdkBuilder.resourceAccessPolicies(_resourceAccessPolicies)
    return cdkBuilder.build()
  }
}
