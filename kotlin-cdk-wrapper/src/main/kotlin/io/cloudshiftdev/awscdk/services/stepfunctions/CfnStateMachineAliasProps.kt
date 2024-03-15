@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStateMachineAliasProps {
  public fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun deploymentPreference(deploymentPreference: IResolvable)

    public
        fun deploymentPreference(deploymentPreference: CfnStateMachineAlias.DeploymentPreferenceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c0cb2bd91c7d46ced1f7c99db65852cb1ad917b55cf4d48d0b8c3fe7f512f7d")
    public
        fun deploymentPreference(deploymentPreference: CfnStateMachineAlias.DeploymentPreferenceProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun routingConfiguration(routingConfiguration: IResolvable)

    public fun routingConfiguration(routingConfiguration: List<Any>)

    public fun routingConfiguration(vararg routingConfiguration: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps.builder()

    override fun deploymentPreference(deploymentPreference: IResolvable) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(IResolvable::unwrap))
    }

    override
        fun deploymentPreference(deploymentPreference: CfnStateMachineAlias.DeploymentPreferenceProperty) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(CfnStateMachineAlias.DeploymentPreferenceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c0cb2bd91c7d46ced1f7c99db65852cb1ad917b55cf4d48d0b8c3fe7f512f7d")
    override
        fun deploymentPreference(deploymentPreference: CfnStateMachineAlias.DeploymentPreferenceProperty.Builder.() -> Unit):
        Unit =
        deploymentPreference(CfnStateMachineAlias.DeploymentPreferenceProperty(deploymentPreference))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun routingConfiguration(routingConfiguration: IResolvable) {
      cdkBuilder.routingConfiguration(routingConfiguration.let(IResolvable::unwrap))
    }

    override fun routingConfiguration(routingConfiguration: List<Any>) {
      cdkBuilder.routingConfiguration(routingConfiguration)
    }

    override fun routingConfiguration(vararg routingConfiguration: Any): Unit =
        routingConfiguration(routingConfiguration.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps,
  ) : CdkObject(cdkObject), CfnStateMachineAliasProps {
    override fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateMachineAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps):
        CfnStateMachineAliasProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineAliasProps):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps
  }
}
