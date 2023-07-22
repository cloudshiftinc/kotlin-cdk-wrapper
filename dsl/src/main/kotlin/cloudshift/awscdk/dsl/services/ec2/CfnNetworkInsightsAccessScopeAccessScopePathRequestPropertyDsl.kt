@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@CdkDslMarker
public class CfnNetworkInsightsAccessScopeAccessScopePathRequestPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.Builder =
      CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.builder()

  private val _throughResources: MutableList<Any> = mutableListOf()

  /**
   * @param destination The destination.
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination The destination.
   */
  public fun destination(destination: CfnNetworkInsightsAccessScope.PathStatementRequestProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param source The source.
   */
  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  /**
   * @param source The source.
   */
  public fun source(source: CfnNetworkInsightsAccessScope.PathStatementRequestProperty) {
    cdkBuilder.source(source)
  }

  /**
   * @param throughResources The through resources.
   */
  public fun throughResources(vararg throughResources: Any) {
    _throughResources.addAll(listOf(*throughResources))
  }

  /**
   * @param throughResources The through resources.
   */
  public fun throughResources(throughResources: Collection<Any>) {
    _throughResources.addAll(throughResources)
  }

  /**
   * @param throughResources The through resources.
   */
  public fun throughResources(throughResources: IResolvable) {
    cdkBuilder.throughResources(throughResources)
  }

  public fun build(): CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty {
    if(_throughResources.isNotEmpty()) cdkBuilder.throughResources(_throughResources)
    return cdkBuilder.build()
  }
}
