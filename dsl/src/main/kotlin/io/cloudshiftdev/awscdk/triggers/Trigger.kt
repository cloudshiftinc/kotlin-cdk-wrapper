package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.lambda.Function
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Trigger internal constructor(
  private val cdkObject: software.amazon.awscdk.triggers.Trigger,
) : CloudshiftdevConstructsConstruct(cdkObject), ITrigger {
  public override fun executeAfter(scopes: CloudshiftdevConstructsConstruct) {
    unwrap(this).executeAfter(scopes.let(CloudshiftdevConstructsConstruct::unwrap))
  }

  public override fun executeBefore(scopes: CloudshiftdevConstructsConstruct) {
    unwrap(this).executeBefore(scopes.let(CloudshiftdevConstructsConstruct::unwrap))
  }

  public interface Builder {
    public fun executeAfter(executeAfter: List<CloudshiftdevConstructsConstruct>)

    public fun executeBefore(executeBefore: List<CloudshiftdevConstructsConstruct>)

    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean)

    public fun handler(handler: Function)

    public fun invocationType(invocationType: InvocationType)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.triggers.Trigger.Builder =
        software.amazon.awscdk.triggers.Trigger.Builder.create(scope, id)

    override fun executeAfter(executeAfter: List<CloudshiftdevConstructsConstruct>) {
      cdkBuilder.executeAfter(executeAfter.map(CloudshiftdevConstructsConstruct::unwrap))
    }

    override fun executeBefore(executeBefore: List<CloudshiftdevConstructsConstruct>) {
      cdkBuilder.executeBefore(executeBefore.map(CloudshiftdevConstructsConstruct::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.triggers.Trigger = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Trigger {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Trigger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.Trigger): Trigger =
        Trigger(cdkObject)

    internal fun unwrap(wrapped: Trigger): software.amazon.awscdk.triggers.Trigger =
        wrapped.cdkObject
  }
}
