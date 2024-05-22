@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties to associate Event Buses with a policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * EventBus eventBus;
 * PolicyStatement policyStatement;
 * EventBusPolicyProps eventBusPolicyProps = EventBusPolicyProps.builder()
 * .eventBus(eventBus)
 * .statement(policyStatement)
 * .statementId("statementId")
 * .build();
 * ```
 */
public interface EventBusPolicyProps {
  /**
   * The event bus to which the policy applies.
   */
  public fun eventBus(): IEventBus

  /**
   * An IAM Policy Statement to apply to the Event Bus.
   */
  public fun statement(): PolicyStatement

  /**
   * An identifier string for the external account that you are granting permissions to.
   */
  public fun statementId(): String

  /**
   * A builder for [EventBusPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventBus The event bus to which the policy applies. 
     */
    public fun eventBus(eventBus: IEventBus)

    /**
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    public fun statement(statement: PolicyStatement)

    /**
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b2e9fdd7532fa08a86191a613d146be6fa8833ccc992f24edf10dcbc1fc7af0")
    public fun statement(statement: PolicyStatement.Builder.() -> Unit)

    /**
     * @param statementId An identifier string for the external account that you are granting
     * permissions to. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusPolicyProps.Builder =
        software.amazon.awscdk.services.events.EventBusPolicyProps.builder()

    /**
     * @param eventBus The event bus to which the policy applies. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus.Companion::unwrap))
    }

    /**
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    override fun statement(statement: PolicyStatement) {
      cdkBuilder.statement(statement.let(PolicyStatement.Companion::unwrap))
    }

    /**
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b2e9fdd7532fa08a86191a613d146be6fa8833ccc992f24edf10dcbc1fc7af0")
    override fun statement(statement: PolicyStatement.Builder.() -> Unit): Unit =
        statement(PolicyStatement(statement))

    /**
     * @param statementId An identifier string for the external account that you are granting
     * permissions to. 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.EventBusPolicyProps,
  ) : CdkObject(cdkObject), EventBusPolicyProps {
    /**
     * The event bus to which the policy applies.
     */
    override fun eventBus(): IEventBus = unwrap(this).getEventBus().let(IEventBus::wrap)

    /**
     * An IAM Policy Statement to apply to the Event Bus.
     */
    override fun statement(): PolicyStatement =
        unwrap(this).getStatement().let(PolicyStatement::wrap)

    /**
     * An identifier string for the external account that you are granting permissions to.
     */
    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusPolicyProps):
        EventBusPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? EventBusPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusPolicyProps):
        software.amazon.awscdk.services.events.EventBusPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.EventBusPolicyProps
  }
}
