@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrEndpointName(): String = unwrap(this).getAttrEndpointName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

  public open fun deploymentConfig(`value`: IResolvable) {
    unwrap(this).setDeploymentConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentConfig(`value`: DeploymentConfigProperty) {
    unwrap(this).setDeploymentConfig(`value`.let(DeploymentConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e2b32a23f66da38d7dff68e0c983951737613491f0eb018d089471b1a4ce50c")
  public open fun deploymentConfig(`value`: DeploymentConfigProperty.Builder.() -> Unit): Unit =
      deploymentConfig(DeploymentConfigProperty(`value`))

  public open fun endpointConfigName(): String = unwrap(this).getEndpointConfigName()

  public open fun endpointConfigName(`value`: String) {
    unwrap(this).setEndpointConfigName(`value`)
  }

  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public open fun excludeRetainedVariantProperties(): Any? =
      unwrap(this).getExcludeRetainedVariantProperties()

  public open fun excludeRetainedVariantProperties(`value`: IResolvable) {
    unwrap(this).setExcludeRetainedVariantProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun excludeRetainedVariantProperties(__idx_ac66f0: List<Any>) {
    unwrap(this).setExcludeRetainedVariantProperties(__idx_ac66f0)
  }

  public open fun excludeRetainedVariantProperties(vararg __idx_ac66f0: Any): Unit =
      excludeRetainedVariantProperties(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun retainAllVariantProperties(): Any? = unwrap(this).getRetainAllVariantProperties()

  public open fun retainAllVariantProperties(`value`: Boolean) {
    unwrap(this).setRetainAllVariantProperties(`value`)
  }

  public open fun retainAllVariantProperties(`value`: IResolvable) {
    unwrap(this).setRetainAllVariantProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun retainDeploymentConfig(): Any? = unwrap(this).getRetainDeploymentConfig()

  public open fun retainDeploymentConfig(`value`: Boolean) {
    unwrap(this).setRetainDeploymentConfig(`value`)
  }

  public open fun retainDeploymentConfig(`value`: IResolvable) {
    unwrap(this).setRetainDeploymentConfig(`value`.let(IResolvable::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun deploymentConfig(deploymentConfig: IResolvable)

    public fun deploymentConfig(deploymentConfig: DeploymentConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a541c408e70416a81e50a6f3c53ab0ea85b12aaa791ea908466a2e921fa9fd67")
    public fun deploymentConfig(deploymentConfig: DeploymentConfigProperty.Builder.() -> Unit)

    public fun endpointConfigName(endpointConfigName: String)

    public fun endpointName(endpointName: String)

    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable)

    public fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: List<Any>)

    public fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any)

    public fun retainAllVariantProperties(retainAllVariantProperties: Boolean)

    public fun retainAllVariantProperties(retainAllVariantProperties: IResolvable)

    public fun retainDeploymentConfig(retainDeploymentConfig: Boolean)

    public fun retainDeploymentConfig(retainDeploymentConfig: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpoint.Builder =
        software.amazon.awscdk.services.sagemaker.CfnEndpoint.Builder.create(scope, id)

    override fun deploymentConfig(deploymentConfig: IResolvable) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IResolvable::unwrap))
    }

    override fun deploymentConfig(deploymentConfig: DeploymentConfigProperty) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(DeploymentConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a541c408e70416a81e50a6f3c53ab0ea85b12aaa791ea908466a2e921fa9fd67")
    override fun deploymentConfig(deploymentConfig: DeploymentConfigProperty.Builder.() -> Unit):
        Unit = deploymentConfig(DeploymentConfigProperty(deploymentConfig))

    override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: IResolvable) {
      cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties.let(IResolvable::unwrap))
    }

    override fun excludeRetainedVariantProperties(excludeRetainedVariantProperties: List<Any>) {
      cdkBuilder.excludeRetainedVariantProperties(excludeRetainedVariantProperties)
    }

    override fun excludeRetainedVariantProperties(vararg excludeRetainedVariantProperties: Any):
        Unit = excludeRetainedVariantProperties(excludeRetainedVariantProperties.toList())

    override fun retainAllVariantProperties(retainAllVariantProperties: Boolean) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties)
    }

    override fun retainAllVariantProperties(retainAllVariantProperties: IResolvable) {
      cdkBuilder.retainAllVariantProperties(retainAllVariantProperties.let(IResolvable::unwrap))
    }

    override fun retainDeploymentConfig(retainDeploymentConfig: Boolean) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig)
    }

    override fun retainDeploymentConfig(retainDeploymentConfig: IResolvable) {
      cdkBuilder.retainDeploymentConfig(retainDeploymentConfig.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint): CfnEndpoint
        = CfnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEndpoint): software.amazon.awscdk.services.sagemaker.CfnEndpoint
        = wrapped.cdkObject
  }

  public interface BlueGreenUpdatePolicyProperty {
    public fun maximumExecutionTimeoutInSeconds(): Number? =
        unwrap(this).getMaximumExecutionTimeoutInSeconds()

    public fun terminationWaitInSeconds(): Number? = unwrap(this).getTerminationWaitInSeconds()

    public fun trafficRoutingConfiguration(): Any

    @CdkDslMarker
    public interface Builder {
      public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number)

      public fun terminationWaitInSeconds(terminationWaitInSeconds: Number)

      public fun trafficRoutingConfiguration(trafficRoutingConfiguration: IResolvable)

      public
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51869a7c33e2d22e368bc328ee4247451f379d44eaf37de8dcf248ff6f736472")
      public
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty.builder()

      override fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
        cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
      }

      override fun terminationWaitInSeconds(terminationWaitInSeconds: Number) {
        cdkBuilder.terminationWaitInSeconds(terminationWaitInSeconds)
      }

      override fun trafficRoutingConfiguration(trafficRoutingConfiguration: IResolvable) {
        cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty) {
        cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration.let(TrafficRoutingConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51869a7c33e2d22e368bc328ee4247451f379d44eaf37de8dcf248ff6f736472")
      override
          fun trafficRoutingConfiguration(trafficRoutingConfiguration: TrafficRoutingConfigProperty.Builder.() -> Unit):
          Unit =
          trafficRoutingConfiguration(TrafficRoutingConfigProperty(trafficRoutingConfiguration))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty,
    ) : CdkObject(cdkObject), BlueGreenUpdatePolicyProperty {
      override fun maximumExecutionTimeoutInSeconds(): Number? =
          unwrap(this).getMaximumExecutionTimeoutInSeconds()

      override fun terminationWaitInSeconds(): Number? = unwrap(this).getTerminationWaitInSeconds()

      override fun trafficRoutingConfiguration(): Any =
          unwrap(this).getTrafficRoutingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlueGreenUpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty):
          BlueGreenUpdatePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlueGreenUpdatePolicyProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty
    }
  }

  public interface CapacitySizeProperty {
    public fun type(): String

    public fun `value`(): Number

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty,
    ) : CdkObject(cdkObject), CapacitySizeProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacitySizeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty):
          CapacitySizeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacitySizeProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty
    }
  }

  public interface AlarmProperty {
    public fun alarmName(): String

    @CdkDslMarker
    public interface Builder {
      public fun alarmName(alarmName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty.builder()

      override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty,
    ) : CdkObject(cdkObject), AlarmProperty {
      override fun alarmName(): String = unwrap(this).getAlarmName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty):
          AlarmProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty
    }
  }

  public interface VariantPropertyProperty {
    public fun variantPropertyType(): String? = unwrap(this).getVariantPropertyType()

    @CdkDslMarker
    public interface Builder {
      public fun variantPropertyType(variantPropertyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty.builder()

      override fun variantPropertyType(variantPropertyType: String) {
        cdkBuilder.variantPropertyType(variantPropertyType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty,
    ) : CdkObject(cdkObject), VariantPropertyProperty {
      override fun variantPropertyType(): String? = unwrap(this).getVariantPropertyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VariantPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty):
          VariantPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariantPropertyProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty
    }
  }

  public interface RollingUpdatePolicyProperty {
    public fun maximumBatchSize(): Any

    public fun maximumExecutionTimeoutInSeconds(): Number? =
        unwrap(this).getMaximumExecutionTimeoutInSeconds()

    public fun rollbackMaximumBatchSize(): Any? = unwrap(this).getRollbackMaximumBatchSize()

    public fun waitIntervalInSeconds(): Number

    @CdkDslMarker
    public interface Builder {
      public fun maximumBatchSize(maximumBatchSize: IResolvable)

      public fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32b94e7fa10506ddc71461a663ace895c4b842cc406ba48b75d5b58d099d98f6")
      public fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty.Builder.() -> Unit)

      public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number)

      public fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: IResolvable)

      public fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eebdbfee6d8c83471bb6ba6753b4e9174787cb4c3e0ce6b798ce75383ee16656")
      public
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty.Builder.() -> Unit)

      public fun waitIntervalInSeconds(waitIntervalInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty.builder()

      override fun maximumBatchSize(maximumBatchSize: IResolvable) {
        cdkBuilder.maximumBatchSize(maximumBatchSize.let(IResolvable::unwrap))
      }

      override fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty) {
        cdkBuilder.maximumBatchSize(maximumBatchSize.let(CapacitySizeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32b94e7fa10506ddc71461a663ace895c4b842cc406ba48b75d5b58d099d98f6")
      override fun maximumBatchSize(maximumBatchSize: CapacitySizeProperty.Builder.() -> Unit): Unit
          = maximumBatchSize(CapacitySizeProperty(maximumBatchSize))

      override fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
        cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
      }

      override fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: IResolvable) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize.let(IResolvable::unwrap))
      }

      override fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize.let(CapacitySizeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eebdbfee6d8c83471bb6ba6753b4e9174787cb4c3e0ce6b798ce75383ee16656")
      override
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: CapacitySizeProperty.Builder.() -> Unit):
          Unit = rollbackMaximumBatchSize(CapacitySizeProperty(rollbackMaximumBatchSize))

      override fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty,
    ) : CdkObject(cdkObject), RollingUpdatePolicyProperty {
      override fun maximumBatchSize(): Any = unwrap(this).getMaximumBatchSize()

      override fun maximumExecutionTimeoutInSeconds(): Number? =
          unwrap(this).getMaximumExecutionTimeoutInSeconds()

      override fun rollbackMaximumBatchSize(): Any? = unwrap(this).getRollbackMaximumBatchSize()

      override fun waitIntervalInSeconds(): Number = unwrap(this).getWaitIntervalInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RollingUpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty):
          RollingUpdatePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RollingUpdatePolicyProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.RollingUpdatePolicyProperty
    }
  }

  public interface TrafficRoutingConfigProperty {
    public fun canarySize(): Any? = unwrap(this).getCanarySize()

    public fun linearStepSize(): Any? = unwrap(this).getLinearStepSize()

    public fun type(): String

    public fun waitIntervalInSeconds(): Number? = unwrap(this).getWaitIntervalInSeconds()

    @CdkDslMarker
    public interface Builder {
      public fun canarySize(canarySize: IResolvable)

      public fun canarySize(canarySize: CapacitySizeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c71f5bea9be0b32e1b90249590a39011c7ed824dd03e8f24610eedb0153327")
      public fun canarySize(canarySize: CapacitySizeProperty.Builder.() -> Unit)

      public fun linearStepSize(linearStepSize: IResolvable)

      public fun linearStepSize(linearStepSize: CapacitySizeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f4e7862c25a4542dca6816d79476a0bfbaf5837819073237189a60f8a763343")
      public fun linearStepSize(linearStepSize: CapacitySizeProperty.Builder.() -> Unit)

      public fun type(type: String)

      public fun waitIntervalInSeconds(waitIntervalInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty.builder()

      override fun canarySize(canarySize: IResolvable) {
        cdkBuilder.canarySize(canarySize.let(IResolvable::unwrap))
      }

      override fun canarySize(canarySize: CapacitySizeProperty) {
        cdkBuilder.canarySize(canarySize.let(CapacitySizeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c71f5bea9be0b32e1b90249590a39011c7ed824dd03e8f24610eedb0153327")
      override fun canarySize(canarySize: CapacitySizeProperty.Builder.() -> Unit): Unit =
          canarySize(CapacitySizeProperty(canarySize))

      override fun linearStepSize(linearStepSize: IResolvable) {
        cdkBuilder.linearStepSize(linearStepSize.let(IResolvable::unwrap))
      }

      override fun linearStepSize(linearStepSize: CapacitySizeProperty) {
        cdkBuilder.linearStepSize(linearStepSize.let(CapacitySizeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f4e7862c25a4542dca6816d79476a0bfbaf5837819073237189a60f8a763343")
      override fun linearStepSize(linearStepSize: CapacitySizeProperty.Builder.() -> Unit): Unit =
          linearStepSize(CapacitySizeProperty(linearStepSize))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty,
    ) : CdkObject(cdkObject), TrafficRoutingConfigProperty {
      override fun canarySize(): Any? = unwrap(this).getCanarySize()

      override fun linearStepSize(): Any? = unwrap(this).getLinearStepSize()

      override fun type(): String = unwrap(this).getType()

      override fun waitIntervalInSeconds(): Number? = unwrap(this).getWaitIntervalInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty):
          TrafficRoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficRoutingConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty
    }
  }

  public interface AutoRollbackConfigProperty {
    public fun alarms(): Any

    @CdkDslMarker
    public interface Builder {
      public fun alarms(alarms: IResolvable)

      public fun alarms(alarms: List<Any>)

      public fun alarms(vararg alarms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty.builder()

      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms)
      }

      override fun alarms(vararg alarms: Any): Unit = alarms(alarms.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty,
    ) : CdkObject(cdkObject), AutoRollbackConfigProperty {
      override fun alarms(): Any = unwrap(this).getAlarms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoRollbackConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty):
          AutoRollbackConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoRollbackConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty
    }
  }

  public interface DeploymentConfigProperty {
    public fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

    public fun blueGreenUpdatePolicy(): Any? = unwrap(this).getBlueGreenUpdatePolicy()

    public fun rollingUpdatePolicy(): Any? = unwrap(this).getRollingUpdatePolicy()

    @CdkDslMarker
    public interface Builder {
      public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable)

      public fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91c784e9b22c4fa4e9231cc0983480e54d126259089cd2d399efdba9976aae58")
      public
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty.Builder.() -> Unit)

      public fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: IResolvable)

      public fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1a1c7d71c378c8c09d73dd58cc6ccfcc453f7ea516b959e0c6d54b927918e84")
      public
          fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty.Builder.() -> Unit)

      public fun rollingUpdatePolicy(rollingUpdatePolicy: IResolvable)

      public fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da9c76e6c3ab105d9e15606e840dcdcb00d8103aa17e1b3ca60bd12cd834d2cd")
      public
          fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty.builder()

      override fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(IResolvable::unwrap))
      }

      override
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(AutoRollbackConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91c784e9b22c4fa4e9231cc0983480e54d126259089cd2d399efdba9976aae58")
      override
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigProperty.Builder.() -> Unit):
          Unit = autoRollbackConfiguration(AutoRollbackConfigProperty(autoRollbackConfiguration))

      override fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: IResolvable) {
        cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy.let(IResolvable::unwrap))
      }

      override fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty) {
        cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy.let(BlueGreenUpdatePolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1a1c7d71c378c8c09d73dd58cc6ccfcc453f7ea516b959e0c6d54b927918e84")
      override
          fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: BlueGreenUpdatePolicyProperty.Builder.() -> Unit):
          Unit = blueGreenUpdatePolicy(BlueGreenUpdatePolicyProperty(blueGreenUpdatePolicy))

      override fun rollingUpdatePolicy(rollingUpdatePolicy: IResolvable) {
        cdkBuilder.rollingUpdatePolicy(rollingUpdatePolicy.let(IResolvable::unwrap))
      }

      override fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty) {
        cdkBuilder.rollingUpdatePolicy(rollingUpdatePolicy.let(RollingUpdatePolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da9c76e6c3ab105d9e15606e840dcdcb00d8103aa17e1b3ca60bd12cd834d2cd")
      override
          fun rollingUpdatePolicy(rollingUpdatePolicy: RollingUpdatePolicyProperty.Builder.() -> Unit):
          Unit = rollingUpdatePolicy(RollingUpdatePolicyProperty(rollingUpdatePolicy))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty,
    ) : CdkObject(cdkObject), DeploymentConfigProperty {
      override fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

      override fun blueGreenUpdatePolicy(): Any? = unwrap(this).getBlueGreenUpdatePolicy()

      override fun rollingUpdatePolicy(): Any? = unwrap(this).getRollingUpdatePolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty):
          DeploymentConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty
    }
  }
}
