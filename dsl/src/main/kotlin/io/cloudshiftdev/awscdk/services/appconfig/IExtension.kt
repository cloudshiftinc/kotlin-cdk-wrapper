package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public interface IExtension : IResource {
  public fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun extensionArn(): String

  public fun extensionId(): String

  public fun extensionVersionNumber(): Number

  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public fun name(): String? = unwrap(this).getName()

  public fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap) ?:
      emptyList()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IExtension,
  ) : IExtension {
    public override fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?:
        emptyList()

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun extensionArn(): String = unwrap(this).getExtensionArn()

    public override fun extensionId(): String = unwrap(this).getExtensionId()

    public override fun extensionVersionNumber(): Number = unwrap(this).getExtensionVersionNumber()

    public override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    public override fun name(): String? = unwrap(this).getName()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun parameters(): List<Parameter> =
        unwrap(this).getParameters()?.map(Parameter::wrap) ?: emptyList()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IExtension): IExtension =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IExtension): software.amazon.awscdk.services.appconfig.IExtension =
        (wrapped as Wrapper).cdkObject
  }
}
