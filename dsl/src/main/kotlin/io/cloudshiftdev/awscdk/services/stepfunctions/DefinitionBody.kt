package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class DefinitionBody internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.DefinitionBody,
) : CdkObject(cdkObject) {
  /**
   * @param scope 
   * @param sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  public open fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      sfnPrincipal.let(IPrincipal::unwrap),
      sfnProps.let(StateMachineProps::unwrap)).let(DefinitionConfig::wrap)

  /**
   * @param scope 
   * @param sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2dbd4d1e5f21bba5dd51d75253d432be0ee512a924449cbb7efb61b2d333163")
  public open fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps.Builder.() -> Unit,
  ): DefinitionConfig = bind(scope, sfnPrincipal, StateMachineProps(sfnProps))

  /**
   * @param scope 
   * @param sfnPrincipal 
   * @param sfnProps 
   * @param graph
   */
  public open fun bind(
    scope: Construct,
    sfnPrincipal: IPrincipal,
    sfnProps: StateMachineProps,
    graph: StateGraph,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      sfnPrincipal.let(IPrincipal::unwrap), sfnProps.let(StateMachineProps::unwrap),
      graph.let(StateGraph::unwrap)).let(DefinitionConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.DefinitionBody,
  ) : DefinitionBody(cdkObject)

  public companion object {
    public fun fromChainable(chainable: IChainable): DefinitionBody =
        software.amazon.awscdk.services.stepfunctions.DefinitionBody.fromChainable(chainable.let(IChainable::unwrap)).let(DefinitionBody::wrap)

    public fun fromFile(path: String): DefinitionBody =
        software.amazon.awscdk.services.stepfunctions.DefinitionBody.fromFile(path).let(DefinitionBody::wrap)

    public fun fromFile(path: String, options: AssetOptions): DefinitionBody =
        software.amazon.awscdk.services.stepfunctions.DefinitionBody.fromFile(path,
        options.let(AssetOptions::unwrap)).let(DefinitionBody::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21d27b6a48dac2c5dbaf4ef80ba3ee7acc7ea5c13cf38f0df0bb52a4fb253451")
    public fun fromFile(path: String, options: AssetOptions.Builder.() -> Unit): DefinitionBody =
        fromFile(path, AssetOptions(options))

    public fun fromString(definition: String): DefinitionBody =
        software.amazon.awscdk.services.stepfunctions.DefinitionBody.fromString(definition).let(DefinitionBody::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.DefinitionBody):
        DefinitionBody = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DefinitionBody):
        software.amazon.awscdk.services.stepfunctions.DefinitionBody = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.DefinitionBody
  }
}
