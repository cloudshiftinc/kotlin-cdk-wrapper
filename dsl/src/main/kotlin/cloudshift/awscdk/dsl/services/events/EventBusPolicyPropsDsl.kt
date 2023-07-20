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

  public fun eventBus(eventBus: IEventBus) {
    cdkBuilder.eventBus(eventBus)
  }

  public fun statement(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    cdkBuilder.statement(builder.build())
  }

  public fun statement(statement: PolicyStatement) {
    cdkBuilder.statement(statement)
  }

  public fun statementId(statementId: String) {
    cdkBuilder.statementId(statementId)
  }

  public fun build(): EventBusPolicyProps = cdkBuilder.build()
}
