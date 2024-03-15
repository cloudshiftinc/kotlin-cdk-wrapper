@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface EventBusPolicyProps {
  public fun eventBus(): IEventBus

  public fun statement(): PolicyStatement

  public fun statementId(): String

  @CdkDslMarker
  public interface Builder {
    public fun eventBus(eventBus: IEventBus)

    public fun statement(statement: PolicyStatement)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b2e9fdd7532fa08a86191a613d146be6fa8833ccc992f24edf10dcbc1fc7af0")
    public fun statement(statement: PolicyStatement.Builder.() -> Unit)

    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusPolicyProps.Builder =
        software.amazon.awscdk.services.events.EventBusPolicyProps.builder()

    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    override fun statement(statement: PolicyStatement) {
      cdkBuilder.statement(statement.let(PolicyStatement::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b2e9fdd7532fa08a86191a613d146be6fa8833ccc992f24edf10dcbc1fc7af0")
    override fun statement(statement: PolicyStatement.Builder.() -> Unit): Unit =
        statement(PolicyStatement(statement))

    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.EventBusPolicyProps,
  ) : CdkObject(cdkObject), EventBusPolicyProps {
    override fun eventBus(): IEventBus = unwrap(this).getEventBus().let(IEventBus::wrap)

    override fun statement(): PolicyStatement =
        unwrap(this).getStatement().let(PolicyStatement::wrap)

    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusPolicyProps):
        EventBusPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusPolicyProps):
        software.amazon.awscdk.services.events.EventBusPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.EventBusPolicyProps
  }
}
