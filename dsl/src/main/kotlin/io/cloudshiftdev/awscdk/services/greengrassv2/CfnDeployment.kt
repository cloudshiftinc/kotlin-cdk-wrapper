package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeployment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDeploymentId(): String = unwrap(this).getAttrDeploymentId()

  public open fun components(): Any? = unwrap(this).getComponents()

  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable::unwrap))
  }

  public open fun components(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setComponents(__item_ac66f0)
  }

  public open fun deploymentName(): String? = unwrap(this).getDeploymentName()

  public open fun deploymentName(`value`: String) {
    unwrap(this).setDeploymentName(`value`)
  }

  public open fun deploymentPolicies(): Any? = unwrap(this).getDeploymentPolicies()

  public open fun deploymentPolicies(`value`: IResolvable) {
    unwrap(this).setDeploymentPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentPolicies(`value`: DeploymentPoliciesProperty) {
    unwrap(this).setDeploymentPolicies(`value`.let(DeploymentPoliciesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e932e3cdf74eecca3597cda2b744411d664a7dc32176062461c79cc91b97cc8")
  public open fun deploymentPolicies(`value`: DeploymentPoliciesProperty.Builder.() -> Unit): Unit =
      deploymentPolicies(DeploymentPoliciesProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun iotJobConfiguration(): Any? = unwrap(this).getIotJobConfiguration()

  public open fun iotJobConfiguration(`value`: IResolvable) {
    unwrap(this).setIotJobConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun iotJobConfiguration(`value`: DeploymentIoTJobConfigurationProperty) {
    unwrap(this).setIotJobConfiguration(`value`.let(DeploymentIoTJobConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54578ced49c987e269c6f5f2922f0208a0a96f232f97b778c894c28bcd56b237")
  public open
      fun iotJobConfiguration(`value`: DeploymentIoTJobConfigurationProperty.Builder.() -> Unit):
      Unit = iotJobConfiguration(DeploymentIoTJobConfigurationProperty(`value`))

  public open fun parentTargetArn(): String? = unwrap(this).getParentTargetArn()

  public open fun parentTargetArn(`value`: String) {
    unwrap(this).setParentTargetArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun targetArn(): String = unwrap(this).getTargetArn()

  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  public interface Builder {
    public fun components(components: IResolvable)

    public fun components(components: Map<String, Any>)

    public fun deploymentName(deploymentName: String)

    public fun deploymentPolicies(deploymentPolicies: IResolvable)

    public fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6abdf667c4571f2e053be60238321b64f1b0cb205d4938adba46df49ad0ba187")
    public fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty.Builder.() -> Unit)

    public fun iotJobConfiguration(iotJobConfiguration: IResolvable)

    public fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47375d74830768d23d48de5b6201039cef3e1b3620fe1f6ef05e4b6ccd0a4c6c")
    public
        fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty.Builder.() -> Unit)

    public fun parentTargetArn(parentTargetArn: String)

    public fun tags(tags: Map<String, String>)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrassv2.CfnDeployment.Builder =
        software.amazon.awscdk.services.greengrassv2.CfnDeployment.Builder.create(scope, id)

    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components)
    }

    override fun deploymentName(deploymentName: String) {
      cdkBuilder.deploymentName(deploymentName)
    }

    override fun deploymentPolicies(deploymentPolicies: IResolvable) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(IResolvable::unwrap))
    }

    override fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(DeploymentPoliciesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6abdf667c4571f2e053be60238321b64f1b0cb205d4938adba46df49ad0ba187")
    override
        fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty.Builder.() -> Unit):
        Unit = deploymentPolicies(DeploymentPoliciesProperty(deploymentPolicies))

    override fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(IResolvable::unwrap))
    }

    override fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(DeploymentIoTJobConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47375d74830768d23d48de5b6201039cef3e1b3620fe1f6ef05e4b6ccd0a4c6c")
    override
        fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty.Builder.() -> Unit):
        Unit = iotJobConfiguration(DeploymentIoTJobConfigurationProperty(iotJobConfiguration))

    override fun parentTargetArn(parentTargetArn: String) {
      cdkBuilder.parentTargetArn(parentTargetArn)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnDeployment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment):
        CfnDeployment = CfnDeployment(cdkObject)

    internal fun unwrap(wrapped: CfnDeployment):
        software.amazon.awscdk.services.greengrassv2.CfnDeployment = wrapped.cdkObject
  }

  public interface ComponentDeploymentSpecificationProperty {
    public fun componentVersion(): String? = unwrap(this).getComponentVersion()

    public fun configurationUpdate(): Any? = unwrap(this).getConfigurationUpdate()

    public fun runWith(): Any? = unwrap(this).getRunWith()

    public interface Builder {
      public fun componentVersion(componentVersion: String)

      public fun configurationUpdate(configurationUpdate: IResolvable)

      public fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bff8a79f37c7f2b8d15a21d1fb6b2699725a3bd18ee3d1a1210700f5854c3c98")
      public
          fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty.Builder.() -> Unit)

      public fun runWith(runWith: IResolvable)

      public fun runWith(runWith: ComponentRunWithProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fedfda318dca168ff86448eb05b7921146a82619d9f1a0fc65d92986e666558")
      public fun runWith(runWith: ComponentRunWithProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty.builder()

      override fun componentVersion(componentVersion: String) {
        cdkBuilder.componentVersion(componentVersion)
      }

      override fun configurationUpdate(configurationUpdate: IResolvable) {
        cdkBuilder.configurationUpdate(configurationUpdate.let(IResolvable::unwrap))
      }

      override fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty) {
        cdkBuilder.configurationUpdate(configurationUpdate.let(ComponentConfigurationUpdateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bff8a79f37c7f2b8d15a21d1fb6b2699725a3bd18ee3d1a1210700f5854c3c98")
      override
          fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty.Builder.() -> Unit):
          Unit = configurationUpdate(ComponentConfigurationUpdateProperty(configurationUpdate))

      override fun runWith(runWith: IResolvable) {
        cdkBuilder.runWith(runWith.let(IResolvable::unwrap))
      }

      override fun runWith(runWith: ComponentRunWithProperty) {
        cdkBuilder.runWith(runWith.let(ComponentRunWithProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fedfda318dca168ff86448eb05b7921146a82619d9f1a0fc65d92986e666558")
      override fun runWith(runWith: ComponentRunWithProperty.Builder.() -> Unit): Unit =
          runWith(ComponentRunWithProperty(runWith))

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty,
    ) : ComponentDeploymentSpecificationProperty {
      override fun componentVersion(): String? = unwrap(this).getComponentVersion()

      override fun configurationUpdate(): Any? = unwrap(this).getConfigurationUpdate()

      override fun runWith(): Any? = unwrap(this).getRunWith()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentDeploymentSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty):
          ComponentDeploymentSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentDeploymentSpecificationProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IoTJobAbortCriteriaProperty {
    public fun action(): String

    public fun failureType(): String

    public fun minNumberOfExecutedThings(): Number

    public fun thresholdPercentage(): Number

    public interface Builder {
      public fun action(action: String)

      public fun failureType(failureType: String)

      public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number)

      public fun thresholdPercentage(thresholdPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
      }

      override fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
        cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
      }

      override fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty,
    ) : IoTJobAbortCriteriaProperty {
      override fun action(): String = unwrap(this).getAction()

      override fun failureType(): String = unwrap(this).getFailureType()

      override fun minNumberOfExecutedThings(): Number = unwrap(this).getMinNumberOfExecutedThings()

      override fun thresholdPercentage(): Number = unwrap(this).getThresholdPercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IoTJobAbortCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty):
          IoTJobAbortCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobAbortCriteriaProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentConfigurationValidationPolicyProperty {
    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    public interface Builder {
      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty.builder()

      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty,
    ) : DeploymentConfigurationValidationPolicyProperty {
      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeploymentConfigurationValidationPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty):
          DeploymentConfigurationValidationPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigurationValidationPolicyProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SystemResourceLimitsProperty {
    public fun cpus(): Number? = unwrap(this).getCpus()

    public fun memory(): Number? = unwrap(this).getMemory()

    public interface Builder {
      public fun cpus(cpus: Number)

      public fun memory(memory: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty.builder()

      override fun cpus(cpus: Number) {
        cdkBuilder.cpus(cpus)
      }

      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty,
    ) : SystemResourceLimitsProperty {
      override fun cpus(): Number? = unwrap(this).getCpus()

      override fun memory(): Number? = unwrap(this).getMemory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SystemResourceLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty):
          SystemResourceLimitsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemResourceLimitsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IoTJobTimeoutConfigProperty {
    public fun inProgressTimeoutInMinutes(): Number? = unwrap(this).getInProgressTimeoutInMinutes()

    public interface Builder {
      public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty.builder()

      override fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
        cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty,
    ) : IoTJobTimeoutConfigProperty {
      override fun inProgressTimeoutInMinutes(): Number? =
          unwrap(this).getInProgressTimeoutInMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IoTJobTimeoutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty):
          IoTJobTimeoutConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobTimeoutConfigProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentConfigurationUpdateProperty {
    public fun merge(): String? = unwrap(this).getMerge()

    public fun reset(): List<String> = unwrap(this).getReset() ?: emptyList()

    public interface Builder {
      public fun merge(merge: String)

      public fun reset(reset: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty.builder()

      override fun merge(merge: String) {
        cdkBuilder.merge(merge)
      }

      override fun reset(reset: List<String>) {
        cdkBuilder.reset(reset)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty,
    ) : ComponentConfigurationUpdateProperty {
      override fun merge(): String? = unwrap(this).getMerge()

      override fun reset(): List<String> = unwrap(this).getReset() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentConfigurationUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty):
          ComponentConfigurationUpdateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConfigurationUpdateProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentPoliciesProperty {
    public fun componentUpdatePolicy(): Any? = unwrap(this).getComponentUpdatePolicy()

    public fun configurationValidationPolicy(): Any? =
        unwrap(this).getConfigurationValidationPolicy()

    public fun failureHandlingPolicy(): String? = unwrap(this).getFailureHandlingPolicy()

    public interface Builder {
      public fun componentUpdatePolicy(componentUpdatePolicy: IResolvable)

      public
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd23378d3da5e5acd7651bf7bf4ea97194d457df8dfe715430fb85addc9a463e")
      public
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty.Builder.() -> Unit)

      public fun configurationValidationPolicy(configurationValidationPolicy: IResolvable)

      public
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17f4cf5091503aa7e9264b7b3909fd1087ec714ea6e3e7ffea9a49a6d6e15f0b")
      public
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty.Builder.() -> Unit)

      public fun failureHandlingPolicy(failureHandlingPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty.builder()

      override fun componentUpdatePolicy(componentUpdatePolicy: IResolvable) {
        cdkBuilder.componentUpdatePolicy(componentUpdatePolicy.let(IResolvable::unwrap))
      }

      override
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty) {
        cdkBuilder.componentUpdatePolicy(componentUpdatePolicy.let(DeploymentComponentUpdatePolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd23378d3da5e5acd7651bf7bf4ea97194d457df8dfe715430fb85addc9a463e")
      override
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty.Builder.() -> Unit):
          Unit =
          componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty(componentUpdatePolicy))

      override fun configurationValidationPolicy(configurationValidationPolicy: IResolvable) {
        cdkBuilder.configurationValidationPolicy(configurationValidationPolicy.let(IResolvable::unwrap))
      }

      override
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty) {
        cdkBuilder.configurationValidationPolicy(configurationValidationPolicy.let(DeploymentConfigurationValidationPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17f4cf5091503aa7e9264b7b3909fd1087ec714ea6e3e7ffea9a49a6d6e15f0b")
      override
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty.Builder.() -> Unit):
          Unit =
          configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty(configurationValidationPolicy))

      override fun failureHandlingPolicy(failureHandlingPolicy: String) {
        cdkBuilder.failureHandlingPolicy(failureHandlingPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty,
    ) : DeploymentPoliciesProperty {
      override fun componentUpdatePolicy(): Any? = unwrap(this).getComponentUpdatePolicy()

      override fun configurationValidationPolicy(): Any? =
          unwrap(this).getConfigurationValidationPolicy()

      override fun failureHandlingPolicy(): String? = unwrap(this).getFailureHandlingPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentPoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty):
          DeploymentPoliciesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentPoliciesProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IoTJobAbortConfigProperty {
    public fun criteriaList(): Any

    public interface Builder {
      public fun criteriaList(criteriaList: IResolvable)

      public fun criteriaList(criteriaList: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty.builder()

      override fun criteriaList(criteriaList: IResolvable) {
        cdkBuilder.criteriaList(criteriaList.let(IResolvable::unwrap))
      }

      override fun criteriaList(criteriaList: List<Any>) {
        cdkBuilder.criteriaList(criteriaList)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty,
    ) : IoTJobAbortConfigProperty {
      override fun criteriaList(): Any = unwrap(this).getCriteriaList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IoTJobAbortConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty):
          IoTJobAbortConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobAbortConfigProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentComponentUpdatePolicyProperty {
    public fun action(): String? = unwrap(this).getAction()

    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    public interface Builder {
      public fun action(action: String)

      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty,
    ) : DeploymentComponentUpdatePolicyProperty {
      override fun action(): String? = unwrap(this).getAction()

      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeploymentComponentUpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty):
          DeploymentComponentUpdatePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentComponentUpdatePolicyProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentIoTJobConfigurationProperty {
    public fun abortConfig(): Any? = unwrap(this).getAbortConfig()

    public fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

    public fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()

    public interface Builder {
      public fun abortConfig(abortConfig: IResolvable)

      public fun abortConfig(abortConfig: IoTJobAbortConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d858e42f8f3f4ef01f1431c7d10deefde49f8ac38da46d650259358da27a86e")
      public fun abortConfig(abortConfig: IoTJobAbortConfigProperty.Builder.() -> Unit)

      public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IResolvable)

      public
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ce12a5b66c90be2970b4d2ff92e31b15057ab75bc218b87232f484795e2b796")
      public
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty.Builder.() -> Unit)

      public fun timeoutConfig(timeoutConfig: IResolvable)

      public fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bbff9c41ac0d600277c1581de9bef91b834f376dabcf95949d9426d71cd1527")
      public fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty.builder()

      override fun abortConfig(abortConfig: IResolvable) {
        cdkBuilder.abortConfig(abortConfig.let(IResolvable::unwrap))
      }

      override fun abortConfig(abortConfig: IoTJobAbortConfigProperty) {
        cdkBuilder.abortConfig(abortConfig.let(IoTJobAbortConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d858e42f8f3f4ef01f1431c7d10deefde49f8ac38da46d650259358da27a86e")
      override fun abortConfig(abortConfig: IoTJobAbortConfigProperty.Builder.() -> Unit): Unit =
          abortConfig(IoTJobAbortConfigProperty(abortConfig))

      override fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IResolvable) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig.let(IResolvable::unwrap))
      }

      override
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig.let(IoTJobExecutionsRolloutConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ce12a5b66c90be2970b4d2ff92e31b15057ab75bc218b87232f484795e2b796")
      override
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty.Builder.() -> Unit):
          Unit =
          jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty(jobExecutionsRolloutConfig))

      override fun timeoutConfig(timeoutConfig: IResolvable) {
        cdkBuilder.timeoutConfig(timeoutConfig.let(IResolvable::unwrap))
      }

      override fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty) {
        cdkBuilder.timeoutConfig(timeoutConfig.let(IoTJobTimeoutConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bbff9c41ac0d600277c1581de9bef91b834f376dabcf95949d9426d71cd1527")
      override fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty.Builder.() -> Unit):
          Unit = timeoutConfig(IoTJobTimeoutConfigProperty(timeoutConfig))

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty,
    ) : DeploymentIoTJobConfigurationProperty {
      override fun abortConfig(): Any? = unwrap(this).getAbortConfig()

      override fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

      override fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeploymentIoTJobConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty):
          DeploymentIoTJobConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentIoTJobConfigurationProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IoTJobExponentialRolloutRateProperty {
    public fun baseRatePerMinute(): Number

    public fun incrementFactor(): Number

    public fun rateIncreaseCriteria(): Any

    public interface Builder {
      public fun baseRatePerMinute(baseRatePerMinute: Number)

      public fun incrementFactor(incrementFactor: Number)

      public fun rateIncreaseCriteria(rateIncreaseCriteria: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty.builder()

      override fun baseRatePerMinute(baseRatePerMinute: Number) {
        cdkBuilder.baseRatePerMinute(baseRatePerMinute)
      }

      override fun incrementFactor(incrementFactor: Number) {
        cdkBuilder.incrementFactor(incrementFactor)
      }

      override fun rateIncreaseCriteria(rateIncreaseCriteria: Any) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty,
    ) : IoTJobExponentialRolloutRateProperty {
      override fun baseRatePerMinute(): Number = unwrap(this).getBaseRatePerMinute()

      override fun incrementFactor(): Number = unwrap(this).getIncrementFactor()

      override fun rateIncreaseCriteria(): Any = unwrap(this).getRateIncreaseCriteria()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IoTJobExponentialRolloutRateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty):
          IoTJobExponentialRolloutRateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobExponentialRolloutRateProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentRunWithProperty {
    public fun posixUser(): String? = unwrap(this).getPosixUser()

    public fun systemResourceLimits(): Any? = unwrap(this).getSystemResourceLimits()

    public fun windowsUser(): String? = unwrap(this).getWindowsUser()

    public interface Builder {
      public fun posixUser(posixUser: String)

      public fun systemResourceLimits(systemResourceLimits: IResolvable)

      public fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aef781a843243efacf3e7c91fe786e9fcf8a47f6be21dd3ead4beb719503243e")
      public
          fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty.Builder.() -> Unit)

      public fun windowsUser(windowsUser: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty.builder()

      override fun posixUser(posixUser: String) {
        cdkBuilder.posixUser(posixUser)
      }

      override fun systemResourceLimits(systemResourceLimits: IResolvable) {
        cdkBuilder.systemResourceLimits(systemResourceLimits.let(IResolvable::unwrap))
      }

      override fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty) {
        cdkBuilder.systemResourceLimits(systemResourceLimits.let(SystemResourceLimitsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aef781a843243efacf3e7c91fe786e9fcf8a47f6be21dd3ead4beb719503243e")
      override
          fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty.Builder.() -> Unit):
          Unit = systemResourceLimits(SystemResourceLimitsProperty(systemResourceLimits))

      override fun windowsUser(windowsUser: String) {
        cdkBuilder.windowsUser(windowsUser)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty,
    ) : ComponentRunWithProperty {
      override fun posixUser(): String? = unwrap(this).getPosixUser()

      override fun systemResourceLimits(): Any? = unwrap(this).getSystemResourceLimits()

      override fun windowsUser(): String? = unwrap(this).getWindowsUser()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentRunWithProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty):
          ComponentRunWithProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentRunWithProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IoTJobExecutionsRolloutConfigProperty {
    public fun exponentialRate(): Any? = unwrap(this).getExponentialRate()

    public fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()

    public interface Builder {
      public fun exponentialRate(exponentialRate: IResolvable)

      public fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9352d70c9c76997bcbd392503dd83aa2ecde1cd0de73073eddaab53ba524c5dd")
      public
          fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty.Builder.() -> Unit)

      public fun maximumPerMinute(maximumPerMinute: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty.builder()

      override fun exponentialRate(exponentialRate: IResolvable) {
        cdkBuilder.exponentialRate(exponentialRate.let(IResolvable::unwrap))
      }

      override fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty) {
        cdkBuilder.exponentialRate(exponentialRate.let(IoTJobExponentialRolloutRateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9352d70c9c76997bcbd392503dd83aa2ecde1cd0de73073eddaab53ba524c5dd")
      override
          fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty.Builder.() -> Unit):
          Unit = exponentialRate(IoTJobExponentialRolloutRateProperty(exponentialRate))

      override fun maximumPerMinute(maximumPerMinute: Number) {
        cdkBuilder.maximumPerMinute(maximumPerMinute)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty,
    ) : IoTJobExecutionsRolloutConfigProperty {
      override fun exponentialRate(): Any? = unwrap(this).getExponentialRate()

      override fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IoTJobExecutionsRolloutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty):
          IoTJobExecutionsRolloutConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobExecutionsRolloutConfigProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
