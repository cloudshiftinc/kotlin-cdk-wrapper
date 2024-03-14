package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventBusPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.EventBusPolicy,
) : Resource(cdkObject) {
  public interface Builder {
    public fun eventBus(eventBus: IEventBus)

    public fun statement(statement: PolicyStatement)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29e8ed3497b5beb6432837edb02ee514842c6dcfde77834c4ab2433f0dae5ef8")
    public fun statement(statement: PolicyStatement.Builder.() -> Unit)

    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusPolicy.Builder =
        software.amazon.awscdk.services.events.EventBusPolicy.Builder.create(scope, id)

    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    override fun statement(statement: PolicyStatement) {
      cdkBuilder.statement(statement.let(PolicyStatement::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29e8ed3497b5beb6432837edb02ee514842c6dcfde77834c4ab2433f0dae5ef8")
    override fun statement(statement: PolicyStatement.Builder.() -> Unit): Unit =
        statement(PolicyStatement(statement))

    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
