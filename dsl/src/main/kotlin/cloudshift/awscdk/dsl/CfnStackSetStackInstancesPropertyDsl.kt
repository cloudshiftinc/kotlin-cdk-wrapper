@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.IResolvable

@CdkDslMarker
public class CfnStackSetStackInstancesPropertyDsl {
  private val cdkBuilder: CfnStackSet.StackInstancesProperty.Builder =
      CfnStackSet.StackInstancesProperty.builder()

  private val _parameterOverrides: MutableList<Any> = mutableListOf()

  private val _regions: MutableList<String> = mutableListOf()

  /**
   * @param deploymentTargets The AWS `OrganizationalUnitIds` or `Accounts` for which to create
   * stack instances in the specified Regions. 
   */
  public fun deploymentTargets(deploymentTargets: CfnStackSet.DeploymentTargetsProperty) {
    cdkBuilder.deploymentTargets(deploymentTargets)
  }

  /**
   * @param deploymentTargets The AWS `OrganizationalUnitIds` or `Accounts` for which to create
   * stack instances in the specified Regions. 
   */
  public fun deploymentTargets(deploymentTargets: IResolvable) {
    cdkBuilder.deploymentTargets(deploymentTargets)
  }

  /**
   * @param parameterOverrides A list of stack set parameters whose values you want to override in
   * the selected stack instances.
   */
  public fun parameterOverrides(vararg parameterOverrides: Any) {
    _parameterOverrides.addAll(listOf(*parameterOverrides))
  }

  /**
   * @param parameterOverrides A list of stack set parameters whose values you want to override in
   * the selected stack instances.
   */
  public fun parameterOverrides(parameterOverrides: Collection<Any>) {
    _parameterOverrides.addAll(parameterOverrides)
  }

  /**
   * @param parameterOverrides A list of stack set parameters whose values you want to override in
   * the selected stack instances.
   */
  public fun parameterOverrides(parameterOverrides: IResolvable) {
    cdkBuilder.parameterOverrides(parameterOverrides)
  }

  /**
   * @param regions The names of one or more Regions where you want to create stack instances using
   * the specified AWS accounts . 
   */
  public fun regions(vararg regions: String) {
    _regions.addAll(listOf(*regions))
  }

  /**
   * @param regions The names of one or more Regions where you want to create stack instances using
   * the specified AWS accounts . 
   */
  public fun regions(regions: Collection<String>) {
    _regions.addAll(regions)
  }

  public fun build(): CfnStackSet.StackInstancesProperty {
    if(_parameterOverrides.isNotEmpty()) cdkBuilder.parameterOverrides(_parameterOverrides)
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    return cdkBuilder.build()
  }
}
