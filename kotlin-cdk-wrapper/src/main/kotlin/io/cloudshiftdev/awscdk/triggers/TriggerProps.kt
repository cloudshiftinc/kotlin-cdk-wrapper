@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.Function
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface TriggerProps : TriggerOptions {
  public fun handler(): Function

  public fun invocationType(): InvocationType? =
      unwrap(this).getInvocationType()?.let(InvocationType::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun executeAfter(executeAfter: List<Construct>)

    public fun executeAfter(vararg executeAfter: Construct)

    public fun executeBefore(executeBefore: List<Construct>)

    public fun executeBefore(vararg executeBefore: Construct)

    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean)

    public fun handler(handler: Function)

    public fun invocationType(invocationType: InvocationType)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.triggers.TriggerProps.Builder =
        software.amazon.awscdk.triggers.TriggerProps.builder()

    override fun executeAfter(executeAfter: List<Construct>) {
      cdkBuilder.executeAfter(executeAfter.map(Construct::unwrap))
    }

    override fun executeAfter(vararg executeAfter: Construct): Unit =
        executeAfter(executeAfter.toList())

    override fun executeBefore(executeBefore: List<Construct>) {
      cdkBuilder.executeBefore(executeBefore.map(Construct::unwrap))
    }

    override fun executeBefore(vararg executeBefore: Construct): Unit =
        executeBefore(executeBefore.toList())

    override fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
      cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    override fun handler(handler: Function) {
      cdkBuilder.handler(handler.let(Function::unwrap))
    }

    override fun invocationType(invocationType: InvocationType) {
      cdkBuilder.invocationType(invocationType.let(InvocationType::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.triggers.TriggerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.triggers.TriggerProps,
  ) : CdkObject(cdkObject), TriggerProps {
    override fun executeAfter(): List<Construct> =
        unwrap(this).getExecuteAfter()?.map(Construct::wrap) ?: emptyList()

    override fun executeBefore(): List<Construct> =
        unwrap(this).getExecuteBefore()?.map(Construct::wrap) ?: emptyList()

    override fun executeOnHandlerChange(): Boolean? = unwrap(this).getExecuteOnHandlerChange()

    override fun handler(): Function = unwrap(this).getHandler().let(Function::wrap)

    override fun invocationType(): InvocationType? =
        unwrap(this).getInvocationType()?.let(InvocationType::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TriggerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.TriggerProps): TriggerProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TriggerProps): software.amazon.awscdk.triggers.TriggerProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.triggers.TriggerProps
  }
}
