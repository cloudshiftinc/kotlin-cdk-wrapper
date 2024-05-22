@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Construct
import kotlin.String
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
 * DefinitionBody stringDefinitionBody = StringDefinitionBody.fromChainable(chainable);
 * ```
 */
public open class StringDefinitionBody(
  cdkObject: software.amazon.awscdk.services.stepfunctions.StringDefinitionBody,
) : DefinitionBody(cdkObject) {
  public constructor(body: String) :
      this(software.amazon.awscdk.services.stepfunctions.StringDefinitionBody(body)
  )

  /**
   * @param _scope 
   * @param _sfnPrincipal 
   * @param _sfnProps 
   * @param _graph
   */
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      sfnPrincipal.let(IPrincipal.Companion::unwrap),
      sfnProps.let(StateMachineProps.Companion::unwrap)).let(DefinitionConfig::wrap)

  /**
   * @param _scope 
   * @param _sfnPrincipal 
   * @param _sfnProps 
   * @param _graph
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2dbd4d1e5f21bba5dd51d75253d432be0ee512a924449cbb7efb61b2d333163")
  public override fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps.Builder.() -> Unit,
  ): DefinitionConfig = bind(scope, sfnPrincipal, StateMachineProps(sfnProps))

  /**
   * @param _scope 
   * @param _sfnPrincipal 
   * @param _sfnProps 
   * @param _graph
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
  public open fun body(): String = unwrap(this).getBody()

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StringDefinitionBody):
        StringDefinitionBody = StringDefinitionBody(cdkObject)

    internal fun unwrap(wrapped: StringDefinitionBody):
        software.amazon.awscdk.services.stepfunctions.StringDefinitionBody = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.StringDefinitionBody
  }
}
