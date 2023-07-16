@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionRetryStrategyPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.RetryStrategyProperty.Builder =
      CfnJobDefinition.RetryStrategyProperty.builder()

  private val _evaluateOnExit: MutableList<Any> = mutableListOf()

  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  public fun evaluateOnExit(vararg evaluateOnExit: Any) {
    _evaluateOnExit.addAll(listOf(*evaluateOnExit))
  }

  public fun evaluateOnExit(evaluateOnExit: Collection<Any>) {
    _evaluateOnExit.addAll(evaluateOnExit)
  }

  public fun evaluateOnExit(evaluateOnExit: IResolvable) {
    cdkBuilder.evaluateOnExit(evaluateOnExit)
  }

  public fun build(): CfnJobDefinition.RetryStrategyProperty {
    if(_evaluateOnExit.isNotEmpty()) cdkBuilder.evaluateOnExit(_evaluateOnExit)
    return cdkBuilder.build()
  }
}
