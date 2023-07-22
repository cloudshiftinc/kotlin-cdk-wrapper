@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusPolicyProps
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.iam.PolicyStatement

@CdkDslMarker
public class EventBusPolicyPropsDsl {
  private val cdkBuilder: EventBusPolicyProps.Builder = EventBusPolicyProps.builder()

  /**
   * @param eventBus The event bus to which the policy applies. 
   */
  public fun eventBus(eventBus: IEventBus) {
    cdkBuilder.eventBus(eventBus)
  }

  /**
   * @param statement An IAM Policy Statement to apply to the Event Bus. 
   */
  public fun statement(statement: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(statement)
    cdkBuilder.statement(builder.build())
  }

  /**
   * @param statement An IAM Policy Statement to apply to the Event Bus. 
   */
  public fun statement(statement: PolicyStatement) {
    cdkBuilder.statement(statement)
  }

  /**
   * @param statementId An identifier string for the external account that you are granting
   * permissions to. 
   */
  public fun statementId(statementId: String) {
    cdkBuilder.statementId(statementId)
  }

  public fun build(): EventBusPolicyProps = cdkBuilder.build()
}
