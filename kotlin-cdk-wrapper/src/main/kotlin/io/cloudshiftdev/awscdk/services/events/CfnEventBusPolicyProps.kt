@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnEventBusPolicyProps {
  public fun action(): String? = unwrap(this).getAction()

  public fun condition(): Any? = unwrap(this).getCondition()

  public fun eventBusName(): String? = unwrap(this).getEventBusName()

  public fun principal(): String? = unwrap(this).getPrincipal()

  public fun statement(): Any? = unwrap(this).getStatement()

  public fun statementId(): String

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun condition(condition: IResolvable)

    public fun condition(condition: CfnEventBusPolicy.ConditionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5ce8bf20b3118b22e6d94130e52b244dfdf435c95ef3872b9697d7651a89c1")
    public fun condition(condition: CfnEventBusPolicy.ConditionProperty.Builder.() -> Unit)

    public fun eventBusName(eventBusName: String)

    public fun principal(principal: String)

    public fun statement(statement: Any)

    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder =
        software.amazon.awscdk.services.events.CfnEventBusPolicyProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun condition(condition: IResolvable) {
      cdkBuilder.condition(condition.let(IResolvable::unwrap))
    }

    override fun condition(condition: CfnEventBusPolicy.ConditionProperty) {
      cdkBuilder.condition(condition.let(CfnEventBusPolicy.ConditionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5ce8bf20b3118b22e6d94130e52b244dfdf435c95ef3872b9697d7651a89c1")
    override fun condition(condition: CfnEventBusPolicy.ConditionProperty.Builder.() -> Unit): Unit
        = condition(CfnEventBusPolicy.ConditionProperty(condition))

    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun statement(statement: Any) {
      cdkBuilder.statement(statement)
    }

    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnEventBusPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicyProps,
  ) : CdkObject(cdkObject), CfnEventBusPolicyProps {
    override fun action(): String? = unwrap(this).getAction()

    override fun condition(): Any? = unwrap(this).getCondition()

    override fun eventBusName(): String? = unwrap(this).getEventBusName()

    override fun principal(): String? = unwrap(this).getPrincipal()

    override fun statement(): Any? = unwrap(this).getStatement()

    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventBusPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEventBusPolicyProps):
        CfnEventBusPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventBusPolicyProps):
        software.amazon.awscdk.services.events.CfnEventBusPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnEventBusPolicyProps
  }
}
