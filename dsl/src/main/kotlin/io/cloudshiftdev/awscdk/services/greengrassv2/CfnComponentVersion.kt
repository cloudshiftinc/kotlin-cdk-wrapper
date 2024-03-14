package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnComponentVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrComponentName(): String = unwrap(this).getAttrComponentName()

  public open fun attrComponentVersion(): String = unwrap(this).getAttrComponentVersion()

  public open fun inlineRecipe(): String? = unwrap(this).getInlineRecipe()

  public open fun inlineRecipe(`value`: String) {
    unwrap(this).setInlineRecipe(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

  public open fun lambdaFunction(`value`: IResolvable) {
    unwrap(this).setLambdaFunction(`value`.let(IResolvable::unwrap))
  }

  public open fun lambdaFunction(`value`: LambdaFunctionRecipeSourceProperty) {
    unwrap(this).setLambdaFunction(`value`.let(LambdaFunctionRecipeSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("912ee6c56bce82fb0485702ee19ea7213703738006edcfcf3f479d7751a1fb67")
  public open fun lambdaFunction(`value`: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
      Unit = lambdaFunction(LambdaFunctionRecipeSourceProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun inlineRecipe(inlineRecipe: String) {
    }

    public fun lambdaFunction(lambdaFunction: IResolvable) {
    }

    public fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1256639b251728b2059a1b5b692c31dd46259d0bedee6a8d593077e4904deb9")
    public
        fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.Builder
        = software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.Builder.create(scope, id)

    public override fun inlineRecipe(inlineRecipe: String) {
      cdkBuilder.inlineRecipe(inlineRecipe)
    }

    public override fun lambdaFunction(lambdaFunction: IResolvable) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IResolvable::unwrap))
    }

    public override fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(LambdaFunctionRecipeSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1256639b251728b2059a1b5b692c31dd46259d0bedee6a8d593077e4904deb9")
    public override
        fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
        Unit = lambdaFunction(LambdaFunctionRecipeSourceProperty(lambdaFunction))

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponentVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponentVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion):
        CfnComponentVersion = CfnComponentVersion(cdkObject)

    internal fun unwrap(wrapped: CfnComponentVersion):
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersion = wrapped.cdkObject
  }

  public interface LambdaFunctionRecipeSourceProperty {
    public fun componentDependencies(): Any? = unwrap(this).getComponentDependencies()

    public fun componentLambdaParameters(): Any? = unwrap(this).getComponentLambdaParameters()

    public fun componentName(): String? = unwrap(this).getComponentName()

    public fun componentPlatforms(): Any? = unwrap(this).getComponentPlatforms()

    public fun componentVersion(): String? = unwrap(this).getComponentVersion()

    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    public interface Builder {
      public fun componentDependencies(componentDependencies: IResolvable) {
      }

      public fun componentDependencies(componentDependencies: Map<String, Any>) {
      }

      public fun componentLambdaParameters(componentLambdaParameters: IResolvable) {
      }

      public
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2baaea23fa42a72d73625398b3745773a4ef9501bd5209c28d2a3b7974b71fce")
      public
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty.Builder.() -> Unit) {
      }

      public fun componentName(componentName: String) {
      }

      public fun componentPlatforms(componentPlatforms: IResolvable) {
      }

      public fun componentPlatforms(componentPlatforms: List<Any>) {
      }

      public fun componentVersion(componentVersion: String) {
      }

      public fun lambdaArn(lambdaArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty.builder()

      public override fun componentDependencies(componentDependencies: IResolvable) {
        cdkBuilder.componentDependencies(componentDependencies.let(IResolvable::unwrap))
      }

      public override fun componentDependencies(componentDependencies: Map<String, Any>) {
        cdkBuilder.componentDependencies(componentDependencies)
      }

      public override fun componentLambdaParameters(componentLambdaParameters: IResolvable) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters.let(IResolvable::unwrap))
      }

      public override
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters.let(LambdaExecutionParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2baaea23fa42a72d73625398b3745773a4ef9501bd5209c28d2a3b7974b71fce")
      public override
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty.Builder.() -> Unit):
          Unit =
          componentLambdaParameters(LambdaExecutionParametersProperty(componentLambdaParameters))

      public override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      public override fun componentPlatforms(componentPlatforms: IResolvable) {
        cdkBuilder.componentPlatforms(componentPlatforms.let(IResolvable::unwrap))
      }

      public override fun componentPlatforms(componentPlatforms: List<Any>) {
        cdkBuilder.componentPlatforms(componentPlatforms)
      }

      public override fun componentVersion(componentVersion: String) {
        cdkBuilder.componentVersion(componentVersion)
      }

      public override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty,
    ) : LambdaFunctionRecipeSourceProperty {
      public override fun componentDependencies(): Any? = unwrap(this).getComponentDependencies()

      public override fun componentLambdaParameters(): Any? =
          unwrap(this).getComponentLambdaParameters()

      public override fun componentName(): String? = unwrap(this).getComponentName()

      public override fun componentPlatforms(): Any? = unwrap(this).getComponentPlatforms()

      public override fun componentVersion(): String? = unwrap(this).getComponentVersion()

      public override fun lambdaArn(): String? = unwrap(this).getLambdaArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaFunctionRecipeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty):
          LambdaFunctionRecipeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionRecipeSourceProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaContainerParamsProperty {
    public fun devices(): Any? = unwrap(this).getDevices()

    public fun memorySizeInKb(): Number? = unwrap(this).getMemorySizeInKb()

    public fun mountRoSysfs(): Any? = unwrap(this).getMountRoSysfs()

    public fun volumes(): Any? = unwrap(this).getVolumes()

    public interface Builder {
      public fun devices(devices: IResolvable) {
      }

      public fun devices(devices: List<Any>) {
      }

      public fun memorySizeInKb(memorySizeInKb: Number) {
      }

      public fun mountRoSysfs(mountRoSysfs: Boolean) {
      }

      public fun mountRoSysfs(mountRoSysfs: IResolvable) {
      }

      public fun volumes(volumes: IResolvable) {
      }

      public fun volumes(volumes: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty.builder()

      public override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      public override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      public override fun memorySizeInKb(memorySizeInKb: Number) {
        cdkBuilder.memorySizeInKb(memorySizeInKb)
      }

      public override fun mountRoSysfs(mountRoSysfs: Boolean) {
        cdkBuilder.mountRoSysfs(mountRoSysfs)
      }

      public override fun mountRoSysfs(mountRoSysfs: IResolvable) {
        cdkBuilder.mountRoSysfs(mountRoSysfs.let(IResolvable::unwrap))
      }

      public override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
      }

      public override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty,
    ) : LambdaContainerParamsProperty {
      public override fun devices(): Any? = unwrap(this).getDevices()

      public override fun memorySizeInKb(): Number? = unwrap(this).getMemorySizeInKb()

      public override fun mountRoSysfs(): Any? = unwrap(this).getMountRoSysfs()

      public override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaContainerParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty):
          LambdaContainerParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaContainerParamsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaDeviceMountProperty {
    public fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

    public fun path(): String? = unwrap(this).getPath()

    public fun permission(): String? = unwrap(this).getPermission()

    public interface Builder {
      public fun addGroupOwner(addGroupOwner: Boolean) {
      }

      public fun addGroupOwner(addGroupOwner: IResolvable) {
      }

      public fun path(path: String) {
      }

      public fun permission(permission: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty.builder()

      public override fun addGroupOwner(addGroupOwner: Boolean) {
        cdkBuilder.addGroupOwner(addGroupOwner)
      }

      public override fun addGroupOwner(addGroupOwner: IResolvable) {
        cdkBuilder.addGroupOwner(addGroupOwner.let(IResolvable::unwrap))
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty,
    ) : LambdaDeviceMountProperty {
      public override fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

      public override fun path(): String? = unwrap(this).getPath()

      public override fun permission(): String? = unwrap(this).getPermission()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeviceMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty):
          LambdaDeviceMountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaDeviceMountProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentDependencyRequirementProperty {
    public fun dependencyType(): String? = unwrap(this).getDependencyType()

    public fun versionRequirement(): String? = unwrap(this).getVersionRequirement()

    public interface Builder {
      public fun dependencyType(dependencyType: String) {
      }

      public fun versionRequirement(versionRequirement: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty.builder()

      public override fun dependencyType(dependencyType: String) {
        cdkBuilder.dependencyType(dependencyType)
      }

      public override fun versionRequirement(versionRequirement: String) {
        cdkBuilder.versionRequirement(versionRequirement)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty,
    ) : ComponentDependencyRequirementProperty {
      public override fun dependencyType(): String? = unwrap(this).getDependencyType()

      public override fun versionRequirement(): String? = unwrap(this).getVersionRequirement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentDependencyRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty):
          ComponentDependencyRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentDependencyRequirementProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentPlatformProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun attributes(attributes: IResolvable) {
      }

      public fun attributes(attributes: Map<String, String>) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty.builder()

      public override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      public override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty,
    ) : ComponentPlatformProperty {
      public override fun attributes(): Any? = unwrap(this).getAttributes()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentPlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty):
          ComponentPlatformProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentPlatformProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaExecutionParametersProperty {
    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    public fun eventSources(): Any? = unwrap(this).getEventSources()

    public fun execArgs(): List<String> = unwrap(this).getExecArgs() ?: emptyList()

    public fun inputPayloadEncodingType(): String? = unwrap(this).getInputPayloadEncodingType()

    public fun linuxProcessParams(): Any? = unwrap(this).getLinuxProcessParams()

    public fun maxIdleTimeInSeconds(): Number? = unwrap(this).getMaxIdleTimeInSeconds()

    public fun maxInstancesCount(): Number? = unwrap(this).getMaxInstancesCount()

    public fun maxQueueSize(): Number? = unwrap(this).getMaxQueueSize()

    public fun pinned(): Any? = unwrap(this).getPinned()

    public fun statusTimeoutInSeconds(): Number? = unwrap(this).getStatusTimeoutInSeconds()

    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    public interface Builder {
      public fun environmentVariables(environmentVariables: IResolvable) {
      }

      public fun environmentVariables(environmentVariables: Map<String, String>) {
      }

      public fun eventSources(eventSources: IResolvable) {
      }

      public fun eventSources(eventSources: List<Any>) {
      }

      public fun execArgs(execArgs: List<String>) {
      }

      public fun inputPayloadEncodingType(inputPayloadEncodingType: String) {
      }

      public fun linuxProcessParams(linuxProcessParams: IResolvable) {
      }

      public fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d11b929d32a5b083d2f35c3eae03f5233b88cc8fe45bccc391568c97e6ed00")
      public
          fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty.Builder.() -> Unit) {
      }

      public fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number) {
      }

      public fun maxInstancesCount(maxInstancesCount: Number) {
      }

      public fun maxQueueSize(maxQueueSize: Number) {
      }

      public fun pinned(pinned: Boolean) {
      }

      public fun pinned(pinned: IResolvable) {
      }

      public fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number) {
      }

      public fun timeoutInSeconds(timeoutInSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty.builder()

      public override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
      }

      public override fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      public override fun eventSources(eventSources: IResolvable) {
        cdkBuilder.eventSources(eventSources.let(IResolvable::unwrap))
      }

      public override fun eventSources(eventSources: List<Any>) {
        cdkBuilder.eventSources(eventSources)
      }

      public override fun execArgs(execArgs: List<String>) {
        cdkBuilder.execArgs(execArgs)
      }

      public override fun inputPayloadEncodingType(inputPayloadEncodingType: String) {
        cdkBuilder.inputPayloadEncodingType(inputPayloadEncodingType)
      }

      public override fun linuxProcessParams(linuxProcessParams: IResolvable) {
        cdkBuilder.linuxProcessParams(linuxProcessParams.let(IResolvable::unwrap))
      }

      public override fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty) {
        cdkBuilder.linuxProcessParams(linuxProcessParams.let(LambdaLinuxProcessParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d11b929d32a5b083d2f35c3eae03f5233b88cc8fe45bccc391568c97e6ed00")
      public override
          fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty.Builder.() -> Unit):
          Unit = linuxProcessParams(LambdaLinuxProcessParamsProperty(linuxProcessParams))

      public override fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number) {
        cdkBuilder.maxIdleTimeInSeconds(maxIdleTimeInSeconds)
      }

      public override fun maxInstancesCount(maxInstancesCount: Number) {
        cdkBuilder.maxInstancesCount(maxInstancesCount)
      }

      public override fun maxQueueSize(maxQueueSize: Number) {
        cdkBuilder.maxQueueSize(maxQueueSize)
      }

      public override fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
      }

      public override fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned.let(IResolvable::unwrap))
      }

      public override fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number) {
        cdkBuilder.statusTimeoutInSeconds(statusTimeoutInSeconds)
      }

      public override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty,
    ) : LambdaExecutionParametersProperty {
      public override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      public override fun eventSources(): Any? = unwrap(this).getEventSources()

      public override fun execArgs(): List<String> = unwrap(this).getExecArgs() ?: emptyList()

      public override fun inputPayloadEncodingType(): String? =
          unwrap(this).getInputPayloadEncodingType()

      public override fun linuxProcessParams(): Any? = unwrap(this).getLinuxProcessParams()

      public override fun maxIdleTimeInSeconds(): Number? = unwrap(this).getMaxIdleTimeInSeconds()

      public override fun maxInstancesCount(): Number? = unwrap(this).getMaxInstancesCount()

      public override fun maxQueueSize(): Number? = unwrap(this).getMaxQueueSize()

      public override fun pinned(): Any? = unwrap(this).getPinned()

      public override fun statusTimeoutInSeconds(): Number? =
          unwrap(this).getStatusTimeoutInSeconds()

      public override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaExecutionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty):
          LambdaExecutionParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaExecutionParametersProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaEventSourceProperty {
    public fun topic(): String? = unwrap(this).getTopic()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun topic(topic: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty.builder()

      public override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty,
    ) : LambdaEventSourceProperty {
      public override fun topic(): String? = unwrap(this).getTopic()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaEventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty):
          LambdaEventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaEventSourceProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaVolumeMountProperty {
    public fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

    public fun destinationPath(): String? = unwrap(this).getDestinationPath()

    public fun permission(): String? = unwrap(this).getPermission()

    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    public interface Builder {
      public fun addGroupOwner(addGroupOwner: Boolean) {
      }

      public fun addGroupOwner(addGroupOwner: IResolvable) {
      }

      public fun destinationPath(destinationPath: String) {
      }

      public fun permission(permission: String) {
      }

      public fun sourcePath(sourcePath: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty.builder()

      public override fun addGroupOwner(addGroupOwner: Boolean) {
        cdkBuilder.addGroupOwner(addGroupOwner)
      }

      public override fun addGroupOwner(addGroupOwner: IResolvable) {
        cdkBuilder.addGroupOwner(addGroupOwner.let(IResolvable::unwrap))
      }

      public override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      public override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      public override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty,
    ) : LambdaVolumeMountProperty {
      public override fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

      public override fun destinationPath(): String? = unwrap(this).getDestinationPath()

      public override fun permission(): String? = unwrap(this).getPermission()

      public override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaVolumeMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty):
          LambdaVolumeMountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaVolumeMountProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaLinuxProcessParamsProperty {
    public fun containerParams(): Any? = unwrap(this).getContainerParams()

    public fun isolationMode(): String? = unwrap(this).getIsolationMode()

    public interface Builder {
      public fun containerParams(containerParams: IResolvable) {
      }

      public fun containerParams(containerParams: LambdaContainerParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d50906feca98faf4df750e8c8b2505d20d6d0ec007d1b01d4e003f98aa20d2")
      public
          fun containerParams(containerParams: LambdaContainerParamsProperty.Builder.() -> Unit) {
      }

      public fun isolationMode(isolationMode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty.builder()

      public override fun containerParams(containerParams: IResolvable) {
        cdkBuilder.containerParams(containerParams.let(IResolvable::unwrap))
      }

      public override fun containerParams(containerParams: LambdaContainerParamsProperty) {
        cdkBuilder.containerParams(containerParams.let(LambdaContainerParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d50906feca98faf4df750e8c8b2505d20d6d0ec007d1b01d4e003f98aa20d2")
      public override
          fun containerParams(containerParams: LambdaContainerParamsProperty.Builder.() -> Unit):
          Unit = containerParams(LambdaContainerParamsProperty(containerParams))

      public override fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty,
    ) : LambdaLinuxProcessParamsProperty {
      public override fun containerParams(): Any? = unwrap(this).getContainerParams()

      public override fun isolationMode(): String? = unwrap(this).getIsolationMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaLinuxProcessParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty):
          LambdaLinuxProcessParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaLinuxProcessParamsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
