package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventBusPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.EventBusPolicy,
) : Resource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.EventBusPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The event bus to which the policy applies.
     *
     * @param eventBus The event bus to which the policy applies. 
     */
    public fun eventBus(eventBus: IEventBus)

    /**
     * An IAM Policy Statement to apply to the Event Bus.
     *
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    public fun statement(statement: PolicyStatement)

    /**
     * An IAM Policy Statement to apply to the Event Bus.
     *
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29e8ed3497b5beb6432837edb02ee514842c6dcfde77834c4ab2433f0dae5ef8")
    public fun statement(statement: PolicyStatement.Builder.() -> Unit)

    /**
     * An identifier string for the external account that you are granting permissions to.
     *
     * @param statementId An identifier string for the external account that you are granting
     * permissions to. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusPolicy.Builder =
        software.amazon.awscdk.services.events.EventBusPolicy.Builder.create(scope, id)

    /**
     * The event bus to which the policy applies.
     *
     * @param eventBus The event bus to which the policy applies. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    /**
     * An IAM Policy Statement to apply to the Event Bus.
     *
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    override fun statement(statement: PolicyStatement) {
      cdkBuilder.statement(statement.let(PolicyStatement::unwrap))
    }

    /**
     * An IAM Policy Statement to apply to the Event Bus.
     *
     * @param statement An IAM Policy Statement to apply to the Event Bus. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29e8ed3497b5beb6432837edb02ee514842c6dcfde77834c4ab2433f0dae5ef8")
    override fun statement(statement: PolicyStatement.Builder.() -> Unit): Unit =
        statement(PolicyStatement(statement))

    /**
     * An identifier string for the external account that you are granting permissions to.
     *
     * @param statementId An identifier string for the external account that you are granting
     * permissions to. 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusPolicy = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventBusPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventBusPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusPolicy):
        EventBusPolicy = EventBusPolicy(cdkObject)

    internal fun unwrap(wrapped: EventBusPolicy):
        software.amazon.awscdk.services.events.EventBusPolicy = wrapped.cdkObject
  }
}
