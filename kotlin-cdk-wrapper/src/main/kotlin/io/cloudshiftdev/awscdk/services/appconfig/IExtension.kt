@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.IExtension,
  ) : CdkObject(cdkObject), IExtension {
    override fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?:
        emptyList()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun description(): String? = unwrap(this).getDescription()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun extensionArn(): String = unwrap(this).getExtensionArn()

    override fun extensionId(): String = unwrap(this).getExtensionId()

    override fun extensionVersionNumber(): Number = unwrap(this).getExtensionVersionNumber()

    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap)
        ?: emptyList()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IExtension): IExtension =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IExtension): software.amazon.awscdk.services.appconfig.IExtension =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IExtension
  }
}
