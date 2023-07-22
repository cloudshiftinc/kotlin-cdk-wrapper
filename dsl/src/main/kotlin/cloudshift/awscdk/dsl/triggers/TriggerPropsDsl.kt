@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.triggers

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.triggers.InvocationType
import software.amazon.awscdk.triggers.TriggerProps
import software.constructs.Construct

@CdkDslMarker
public class TriggerPropsDsl {
  private val cdkBuilder: TriggerProps.Builder = TriggerProps.builder()

  private val _executeAfter: MutableList<Construct> = mutableListOf()

  private val _executeBefore: MutableList<Construct> = mutableListOf()

  /**
   * @param executeAfter Adds trigger dependencies. Execute this trigger only after these construct
   * scopes have been provisioned.
   * You can also use `trigger.executeAfter()` to add additional dependencies.
   */
  public fun executeAfter(vararg executeAfter: Construct) {
    _executeAfter.addAll(listOf(*executeAfter))
  }

  /**
   * @param executeAfter Adds trigger dependencies. Execute this trigger only after these construct
   * scopes have been provisioned.
   * You can also use `trigger.executeAfter()` to add additional dependencies.
   */
  public fun executeAfter(executeAfter: Collection<Construct>) {
    _executeAfter.addAll(executeAfter)
  }

  /**
   * @param executeBefore Adds this trigger as a dependency on other constructs.
   * This means that this
   * trigger will get executed *before* the given construct(s).
   *
   * You can also use `trigger.executeBefore()` to add additional dependants.
   */
  public fun executeBefore(vararg executeBefore: Construct) {
    _executeBefore.addAll(listOf(*executeBefore))
  }

  /**
   * @param executeBefore Adds this trigger as a dependency on other constructs.
   * This means that this
   * trigger will get executed *before* the given construct(s).
   *
   * You can also use `trigger.executeBefore()` to add additional dependants.
   */
  public fun executeBefore(executeBefore: Collection<Construct>) {
    _executeBefore.addAll(executeBefore)
  }

  /**
   * @param executeOnHandlerChange Re-executes the trigger every time the handler changes.
   * This implies that the trigger is associated with the `currentVersion` of
   * the handler, which gets recreated every time the handler or its
   * configuration is updated.
   */
  public fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
    cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
  }

  /**
   * @param handler The AWS Lambda function of the handler to execute. 
   */
  public fun handler(handler: Function) {
    cdkBuilder.handler(handler)
  }

  /**
   * @param invocationType The invocation type to invoke the Lambda function with.
   */
  public fun invocationType(invocationType: InvocationType) {
    cdkBuilder.invocationType(invocationType)
  }

  /**
   * @param timeout The timeout of the invocation call of the Lambda function to be triggered.
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): TriggerProps {
    if(_executeAfter.isNotEmpty()) cdkBuilder.executeAfter(_executeAfter)
    if(_executeBefore.isNotEmpty()) cdkBuilder.executeBefore(_executeBefore)
    return cdkBuilder.build()
  }
}
