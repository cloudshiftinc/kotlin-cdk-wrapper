@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * EventBus eventBus;
 * PolicyStatement policyStatement;
 * EventBusPolicy eventBusPolicy = EventBusPolicy.Builder.create(this, "MyEventBusPolicy")
 * .eventBus(eventBus)
 * .statement(policyStatement)
 * .statementId("statementId")
 * .build();
 * ```
 */
public open class EventBusPolicy(
  cdkObject: software.amazon.awscdk.services.events.EventBusPolicy,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventBusPolicyProps,
  ) :
      this(software.amazon.awscdk.services.events.EventBusPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(EventBusPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventBusPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, EventBusPolicyProps(props)
  )

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
        software.amazon.awscdk.services.events.EventBusPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.events.EventBusPolicy
  }
}
