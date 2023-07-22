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
