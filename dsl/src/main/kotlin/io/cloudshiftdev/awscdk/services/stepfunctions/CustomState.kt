package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomState internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.CustomState,
) : State(cdkObject), IChainable, INextable {
  public open fun addCatch(handler: IChainable): CustomState =
      unwrap(this).addCatch(handler.let(IChainable::unwrap)).let(CustomState::wrap)

  public open fun addCatch(handler: IChainable, props: CatchProps): CustomState =
      unwrap(this).addCatch(handler.let(IChainable::unwrap),
      props.let(CatchProps::unwrap)).let(CustomState::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adaa20bd07e28fb7ea3c3501c09f4e814a7db5b38f512959ba2b8e8363c50e65")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit): CustomState =
      addCatch(handler, CatchProps(props))

  public open fun addRetry(): CustomState = unwrap(this).addRetry().let(CustomState::wrap)

  public open fun addRetry(props: RetryProps): CustomState =
      unwrap(this).addRetry(props.let(RetryProps::unwrap)).let(CustomState::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c02a3a1fba1376165cb275b716affc038930e660dd6bbe1f83a63987816dc527")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): CustomState =
      addRetry(RetryProps(props))

  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  public interface Builder {
    public fun stateJson(stateJson: Map<String, Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CustomState.Builder =
        software.amazon.awscdk.services.stepfunctions.CustomState.Builder.create(scope, id)

    public override fun stateJson(stateJson: Map<String, Any>) {
      cdkBuilder.stateJson(stateJson)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CustomState =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomState {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomState(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CustomState):
        CustomState = CustomState(cdkObject)

    internal fun unwrap(wrapped: CustomState):
        software.amazon.awscdk.services.stepfunctions.CustomState = wrapped.cdkObject
  }
}
