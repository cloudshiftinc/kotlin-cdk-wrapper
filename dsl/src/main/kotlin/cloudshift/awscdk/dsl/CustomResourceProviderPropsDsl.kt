@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CustomResourceProviderProps
import software.amazon.awscdk.CustomResourceProviderRuntime
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Size

@CdkDslMarker
public class CustomResourceProviderPropsDsl {
  private val cdkBuilder: CustomResourceProviderProps.Builder =
      CustomResourceProviderProps.builder()

  private val _policyStatements: MutableList<Any> = mutableListOf()

  public fun codeDirectory(codeDirectory: String) {
    cdkBuilder.codeDirectory(codeDirectory)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  public fun memorySize(memorySize: Size) {
    cdkBuilder.memorySize(memorySize)
  }

  public fun policyStatements(vararg policyStatements: Any) {
    _policyStatements.addAll(listOf(*policyStatements))
  }

  public fun policyStatements(policyStatements: Collection<Any>) {
    _policyStatements.addAll(policyStatements)
  }

  public fun runtime(runtime: CustomResourceProviderRuntime) {
    cdkBuilder.runtime(runtime)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
    cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
  }

  public fun build(): CustomResourceProviderProps {
    if(_policyStatements.isNotEmpty()) cdkBuilder.policyStatements(_policyStatements)
    return cdkBuilder.build()
  }
}
