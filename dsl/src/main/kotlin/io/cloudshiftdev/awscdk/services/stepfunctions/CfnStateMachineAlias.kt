package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStateMachineAlias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

  public open fun deploymentPreference(`value`: IResolvable) {
    unwrap(this).setDeploymentPreference(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty) {
    unwrap(this).setDeploymentPreference(`value`.let(DeploymentPreferenceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f2229c970014eb3d9445f097eb57ea8be893fbe4c782c5e101feade2737fb73")
  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty.Builder.() -> Unit):
      Unit = deploymentPreference(DeploymentPreferenceProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

  public open fun routingConfiguration(`value`: IResolvable) {
    unwrap(this).setRoutingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun routingConfiguration(__idx_ac66f0: List<Any>) {
    unwrap(this).setRoutingConfiguration(__idx_ac66f0)
  }

  public interface Builder {
    public fun deploymentPreference(deploymentPreference: IResolvable)

    public fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1962753474155368b7bbfd69a608a1d69b2cf283bf9dc71d5338dcc916936569")
    public
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun routingConfiguration(routingConfiguration: IResolvable)

    public fun routingConfiguration(routingConfiguration: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.Builder.create(scope, id)

    override fun deploymentPreference(deploymentPreference: IResolvable) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(IResolvable::unwrap))
    }

    override fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(DeploymentPreferenceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1962753474155368b7bbfd69a608a1d69b2cf283bf9dc71d5338dcc916936569")
    override
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit):
        Unit = deploymentPreference(DeploymentPreferenceProperty(deploymentPreference))

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachineAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachineAlias(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias):
        CfnStateMachineAlias = CfnStateMachineAlias(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineAlias):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias = wrapped.cdkObject
  }

  public interface RoutingConfigurationVersionProperty {
    public fun stateMachineVersionArn(): String

    public fun weight(): Number

    public interface Builder {
      public fun stateMachineVersionArn(stateMachineVersionArn: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty.builder()

      override fun stateMachineVersionArn(stateMachineVersionArn: String) {
        cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty,
    ) : RoutingConfigurationVersionProperty {
      override fun stateMachineVersionArn(): String = unwrap(this).getStateMachineVersionArn()

      override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RoutingConfigurationVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty):
          RoutingConfigurationVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingConfigurationVersionProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentPreferenceProperty {
    public fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun percentage(): Number? = unwrap(this).getPercentage()

    public fun stateMachineVersionArn(): String

    public fun type(): String

    public interface Builder {
      public fun alarms(alarms: List<String>)

      public fun interval(interval: Number)

      public fun percentage(percentage: Number)

      public fun stateMachineVersionArn(stateMachineVersionArn: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty.builder()

      override fun alarms(alarms: List<String>) {
        cdkBuilder.alarms(alarms)
      }

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun percentage(percentage: Number) {
        cdkBuilder.percentage(percentage)
      }

      override fun stateMachineVersionArn(stateMachineVersionArn: String) {
        cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty,
    ) : DeploymentPreferenceProperty {
      override fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

      override fun interval(): Number? = unwrap(this).getInterval()

      override fun percentage(): Number? = unwrap(this).getPercentage()

      override fun stateMachineVersionArn(): String = unwrap(this).getStateMachineVersionArn()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentPreferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty):
          DeploymentPreferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentPreferenceProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
