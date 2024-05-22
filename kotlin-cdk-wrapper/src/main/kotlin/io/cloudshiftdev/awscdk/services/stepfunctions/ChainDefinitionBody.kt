@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * IChainable chainable;
 * DefinitionBody chainDefinitionBody = ChainDefinitionBody.fromChainable(chainable);
 * ```
 */
public open class ChainDefinitionBody(
  cdkObject: software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody,
) : DefinitionBody(cdkObject) {
  public constructor(chainable: IChainable) :
      this(software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody(chainable.let(IChainable.Companion::unwrap))
  )

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      sfnPrincipal.let(IPrincipal.Companion::unwrap),
      sfnProps.let(StateMachineProps.Companion::unwrap)).let(DefinitionConfig::wrap)

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2dbd4d1e5f21bba5dd51d75253d432be0ee512a924449cbb7efb61b2d333163")
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps.Builder.() -> Unit,
  ): DefinitionConfig = bind(scope, sfnPrincipal, StateMachineProps(sfnProps))

  /**
   * @param scope 
   * @param _sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
    graph: StateGraph,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      sfnPrincipal.let(IPrincipal.Companion::unwrap),
      sfnProps.let(StateMachineProps.Companion::unwrap),
      graph.let(StateGraph.Companion::unwrap)).let(DefinitionConfig::wrap)

  /**
   *
   */
  public open fun chainable(): IChainable = unwrap(this).getChainable().let(IChainable::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody):
        ChainDefinitionBody = ChainDefinitionBody(cdkObject)

    internal fun unwrap(wrapped: ChainDefinitionBody):
        software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.ChainDefinitionBody
  }
}
