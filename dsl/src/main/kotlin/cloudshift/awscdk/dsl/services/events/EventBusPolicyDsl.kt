@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusPolicy
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.iam.PolicyStatement
import software.constructs.Construct

/**
 * The policy for an Event Bus.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called
 * `addToResourcePolicy()`, which will automatically create a new resource
 * policy if one doesn't exist yet, otherwise it will add to the existing
 * policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.iam.*;
 * EventBus eventBus;
 * PolicyStatement policyStatement;
 * EventBusPolicy eventBusPolicy = EventBusPolicy.Builder.create(this, "MyEventBusPolicy")
 * .eventBus(eventBus)
 * .statement(policyStatement)
 * .statementId("statementId")
 * .build();
 * ```
 */
@CdkDslMarker
public class EventBusPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EventBusPolicy.Builder = EventBusPolicy.Builder.create(scope, id)

  /**
   * The event bus to which the policy applies.
   *
   * @param eventBus The event bus to which the policy applies. 
   */
  public fun eventBus(eventBus: IEventBus) {
    cdkBuilder.eventBus(eventBus)
  }

  /**
   * An IAM Policy Statement to apply to the Event Bus.
   *
   * @param statement An IAM Policy Statement to apply to the Event Bus. 
   */
  public fun statement(statement: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(statement)
    cdkBuilder.statement(builder.build())
  }

  /**
   * An IAM Policy Statement to apply to the Event Bus.
   *
   * @param statement An IAM Policy Statement to apply to the Event Bus. 
   */
  public fun statement(statement: PolicyStatement) {
    cdkBuilder.statement(statement)
  }

  /**
   * An identifier string for the external account that you are granting permissions to.
   *
   * @param statementId An identifier string for the external account that you are granting
   * permissions to. 
   */
  public fun statementId(statementId: String) {
    cdkBuilder.statementId(statementId)
  }

  public fun build(): EventBusPolicy = cdkBuilder.build()
}
