package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class ChainDefinitionBody internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody,
) : DefinitionBody(cdkObject) {
  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  public override fun bind(
    scope: Construct,
    _sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      _sfnPrincipal.let(IPrincipal::unwrap),
      sfnProps.let(StateMachineProps::unwrap)).let(DefinitionConfig::wrap)

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2dbd4d1e5f21bba5dd51d75253d432be0ee512a924449cbb7efb61b2d333163")
  public override fun bind(
    scope: Construct,
    _sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps.Builder.() -> Unit,
  ): DefinitionConfig = bind(scope, _sfnPrincipal, StateMachineProps(sfnProps))

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  public override fun bind(
    scope: Construct,
    _sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
    graph: StateGraph,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      _sfnPrincipal.let(IPrincipal::unwrap), sfnProps.let(StateMachineProps::unwrap),
      graph.let(StateGraph::unwrap)).let(DefinitionConfig::wrap)

  /**
   *
   */
  public open fun chainable(): IChainable = unwrap(this).getChainable().let(IChainable::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody):
        ChainDefinitionBody = ChainDefinitionBody(cdkObject)

    internal fun unwrap(wrapped: ChainDefinitionBody):
        software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody = wrapped.cdkObject
  }
}
