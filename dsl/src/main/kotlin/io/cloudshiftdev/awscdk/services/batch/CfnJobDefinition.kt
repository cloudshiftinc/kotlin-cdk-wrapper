package io.cloudshiftdev.awscdk.services.batch

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnJobDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun containerProperties(): Any? = unwrap(this).getContainerProperties()

  public open fun containerProperties(`value`: IResolvable) {
    unwrap(this).setContainerProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun containerProperties(`value`: ContainerPropertiesProperty) {
    unwrap(this).setContainerProperties(`value`.let(ContainerPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("40ac4a0e096005b6e2ca3b6883bc7caeb84df81f437cbbfba58086df9b5d21ec")
  public open fun containerProperties(`value`: ContainerPropertiesProperty.Builder.() -> Unit): Unit
      = containerProperties(ContainerPropertiesProperty(`value`))

  public open fun eksProperties(): Any? = unwrap(this).getEksProperties()

  public open fun eksProperties(`value`: IResolvable) {
    unwrap(this).setEksProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun eksProperties(`value`: EksPropertiesProperty) {
    unwrap(this).setEksProperties(`value`.let(EksPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0febfb1968f1c75340f144a1ccc0e6eccac7956d6f6491b3115babc5c74b7fd5")
  public open fun eksProperties(`value`: EksPropertiesProperty.Builder.() -> Unit): Unit =
      eksProperties(EksPropertiesProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

  public open fun jobDefinitionName(`value`: String) {
    unwrap(this).setJobDefinitionName(`value`)
  }

  public open fun nodeProperties(): Any? = unwrap(this).getNodeProperties()

  public open fun nodeProperties(`value`: IResolvable) {
    unwrap(this).setNodeProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun nodeProperties(`value`: NodePropertiesProperty) {
    unwrap(this).setNodeProperties(`value`.let(NodePropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a0e39f92a1952bd073f1435a340c98076398f561704e72d263cfc036eae7252")
  public open fun nodeProperties(`value`: NodePropertiesProperty.Builder.() -> Unit): Unit =
      nodeProperties(NodePropertiesProperty(`value`))

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  public open fun platformCapabilities(): List<String> = unwrap(this).getPlatformCapabilities() ?:
      emptyList()

  public open fun platformCapabilities(`value`: List<String>) {
    unwrap(this).setPlatformCapabilities(`value`)
  }

  public open fun propagateTags(): Any? = unwrap(this).getPropagateTags()

  public open fun propagateTags(`value`: Boolean) {
    unwrap(this).setPropagateTags(`value`)
  }

  public open fun propagateTags(`value`: IResolvable) {
    unwrap(this).setPropagateTags(`value`.let(IResolvable::unwrap))
  }

  public open fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

  public open fun retryStrategy(`value`: IResolvable) {
    unwrap(this).setRetryStrategy(`value`.let(IResolvable::unwrap))
  }

  public open fun retryStrategy(`value`: RetryStrategyProperty) {
    unwrap(this).setRetryStrategy(`value`.let(RetryStrategyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("abc822b22f6ffd6ca47069f05ded9e9598abbfc223dc7504e9cddd50d7a68812")
  public open fun retryStrategy(`value`: RetryStrategyProperty.Builder.() -> Unit): Unit =
      retryStrategy(RetryStrategyProperty(`value`))

  public open fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  public open fun schedulingPriority(`value`: Number) {
    unwrap(this).setSchedulingPriority(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun timeout(): Any? = unwrap(this).getTimeout()

  public open fun timeout(`value`: IResolvable) {
    unwrap(this).setTimeout(`value`.let(IResolvable::unwrap))
  }

  public open fun timeout(`value`: TimeoutProperty) {
    unwrap(this).setTimeout(`value`.let(TimeoutProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2f4dcec0c9c4e7fccbe630c4290daea7f8f2a7fe48b779c67ee673b1e242954")
  public open fun timeout(`value`: TimeoutProperty.Builder.() -> Unit): Unit =
      timeout(TimeoutProperty(`value`))

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun containerProperties(containerProperties: IResolvable)

    public fun containerProperties(containerProperties: ContainerPropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4cf19641d5566ae14a63dfceec2d34db0f790bc7d23f120f624afcdf4d912eb")
    public
        fun containerProperties(containerProperties: ContainerPropertiesProperty.Builder.() -> Unit)

    public fun eksProperties(eksProperties: IResolvable)

    public fun eksProperties(eksProperties: EksPropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43c1980ac80b3ad25079e08d8a06b74092d3abe1ea8288a17f3daef7bb2c3071")
    public fun eksProperties(eksProperties: EksPropertiesProperty.Builder.() -> Unit)

    public fun jobDefinitionName(jobDefinitionName: String)

    public fun nodeProperties(nodeProperties: IResolvable)

    public fun nodeProperties(nodeProperties: NodePropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bde92f0b9ddcf3791dc7f0235f8fd0f91ffb9d87442b55922414a7a4c0ec9cf")
    public fun nodeProperties(nodeProperties: NodePropertiesProperty.Builder.() -> Unit)

    public fun parameters(parameters: Any)

    public fun platformCapabilities(platformCapabilities: List<String>)

    public fun propagateTags(propagateTags: Boolean)

    public fun propagateTags(propagateTags: IResolvable)

    public fun retryStrategy(retryStrategy: IResolvable)

    public fun retryStrategy(retryStrategy: RetryStrategyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da92ab106676a30c7021e50aec7579220a6dfb3f5ec608a37a8c69959c47409")
    public fun retryStrategy(retryStrategy: RetryStrategyProperty.Builder.() -> Unit)

    public fun schedulingPriority(schedulingPriority: Number)

    public fun tags(tags: Any)

    public fun timeout(timeout: IResolvable)

    public fun timeout(timeout: TimeoutProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7768b6ac80ab858102acc185f6a6f5c5f5387a7a9198410d26fcb8e328050932")
    public fun timeout(timeout: TimeoutProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobDefinition.Builder =
        software.amazon.awscdk.services.batch.CfnJobDefinition.Builder.create(scope, id)

    override fun containerProperties(containerProperties: IResolvable) {
      cdkBuilder.containerProperties(containerProperties.let(IResolvable::unwrap))
    }

    override fun containerProperties(containerProperties: ContainerPropertiesProperty) {
      cdkBuilder.containerProperties(containerProperties.let(ContainerPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4cf19641d5566ae14a63dfceec2d34db0f790bc7d23f120f624afcdf4d912eb")
    override
        fun containerProperties(containerProperties: ContainerPropertiesProperty.Builder.() -> Unit):
        Unit = containerProperties(ContainerPropertiesProperty(containerProperties))

    override fun eksProperties(eksProperties: IResolvable) {
      cdkBuilder.eksProperties(eksProperties.let(IResolvable::unwrap))
    }

    override fun eksProperties(eksProperties: EksPropertiesProperty) {
      cdkBuilder.eksProperties(eksProperties.let(EksPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43c1980ac80b3ad25079e08d8a06b74092d3abe1ea8288a17f3daef7bb2c3071")
    override fun eksProperties(eksProperties: EksPropertiesProperty.Builder.() -> Unit): Unit =
        eksProperties(EksPropertiesProperty(eksProperties))

    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    override fun nodeProperties(nodeProperties: IResolvable) {
      cdkBuilder.nodeProperties(nodeProperties.let(IResolvable::unwrap))
    }

    override fun nodeProperties(nodeProperties: NodePropertiesProperty) {
      cdkBuilder.nodeProperties(nodeProperties.let(NodePropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bde92f0b9ddcf3791dc7f0235f8fd0f91ffb9d87442b55922414a7a4c0ec9cf")
    override fun nodeProperties(nodeProperties: NodePropertiesProperty.Builder.() -> Unit): Unit =
        nodeProperties(NodePropertiesProperty(nodeProperties))

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun platformCapabilities(platformCapabilities: List<String>) {
      cdkBuilder.platformCapabilities(platformCapabilities)
    }

    override fun propagateTags(propagateTags: Boolean) {
      cdkBuilder.propagateTags(propagateTags)
    }

    override fun propagateTags(propagateTags: IResolvable) {
      cdkBuilder.propagateTags(propagateTags.let(IResolvable::unwrap))
    }

    override fun retryStrategy(retryStrategy: IResolvable) {
      cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
    }

    override fun retryStrategy(retryStrategy: RetryStrategyProperty) {
      cdkBuilder.retryStrategy(retryStrategy.let(RetryStrategyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da92ab106676a30c7021e50aec7579220a6dfb3f5ec608a37a8c69959c47409")
    override fun retryStrategy(retryStrategy: RetryStrategyProperty.Builder.() -> Unit): Unit =
        retryStrategy(RetryStrategyProperty(retryStrategy))

    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun timeout(timeout: IResolvable) {
      cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
    }

    override fun timeout(timeout: TimeoutProperty) {
      cdkBuilder.timeout(timeout.let(TimeoutProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7768b6ac80ab858102acc185f6a6f5c5f5387a7a9198410d26fcb8e328050932")
    override fun timeout(timeout: TimeoutProperty.Builder.() -> Unit): Unit =
        timeout(TimeoutProperty(timeout))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition):
        CfnJobDefinition = CfnJobDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnJobDefinition):
        software.amazon.awscdk.services.batch.CfnJobDefinition = wrapped.cdkObject
  }

  public interface RepositoryCredentialsProperty {
    public fun credentialsParameter(): String

    public interface Builder {
      public fun credentialsParameter(credentialsParameter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty.builder()

      override fun credentialsParameter(credentialsParameter: String) {
        cdkBuilder.credentialsParameter(credentialsParameter)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty,
    ) : RepositoryCredentialsProperty {
      override fun credentialsParameter(): String = unwrap(this).getCredentialsParameter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty):
          RepositoryCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryCredentialsProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.RepositoryCredentialsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LinuxParametersProperty {
    public fun devices(): Any? = unwrap(this).getDevices()

    public fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

    public fun maxSwap(): Number? = unwrap(this).getMaxSwap()

    public fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

    public fun swappiness(): Number? = unwrap(this).getSwappiness()

    public fun tmpfs(): Any? = unwrap(this).getTmpfs()

    public interface Builder {
      public fun devices(devices: IResolvable)

      public fun devices(devices: List<Any>)

      public fun initProcessEnabled(initProcessEnabled: Boolean)

      public fun initProcessEnabled(initProcessEnabled: IResolvable)

      public fun maxSwap(maxSwap: Number)

      public fun sharedMemorySize(sharedMemorySize: Number)

      public fun swappiness(swappiness: Number)

      public fun tmpfs(tmpfs: IResolvable)

      public fun tmpfs(tmpfs: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty.builder()

      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      override fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
      }

      override fun initProcessEnabled(initProcessEnabled: IResolvable) {
        cdkBuilder.initProcessEnabled(initProcessEnabled.let(IResolvable::unwrap))
      }

      override fun maxSwap(maxSwap: Number) {
        cdkBuilder.maxSwap(maxSwap)
      }

      override fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
      }

      override fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
      }

      override fun tmpfs(tmpfs: IResolvable) {
        cdkBuilder.tmpfs(tmpfs.let(IResolvable::unwrap))
      }

      override fun tmpfs(tmpfs: List<Any>) {
        cdkBuilder.tmpfs(tmpfs)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty,
    ) : LinuxParametersProperty {
      override fun devices(): Any? = unwrap(this).getDevices()

      override fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

      override fun maxSwap(): Number? = unwrap(this).getMaxSwap()

      override fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

      override fun swappiness(): Number? = unwrap(this).getSwappiness()

      override fun tmpfs(): Any? = unwrap(this).getTmpfs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty):
          LinuxParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LinuxParametersProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ResourcesProperty {
    public fun limits(): Any? = unwrap(this).getLimits()

    public fun requests(): Any? = unwrap(this).getRequests()

    public interface Builder {
      public fun limits(limits: Any)

      public fun requests(requests: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty.builder()

      override fun limits(limits: Any) {
        cdkBuilder.limits(limits)
      }

      override fun requests(requests: Any) {
        cdkBuilder.requests(requests)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty,
    ) : ResourcesProperty {
      override fun limits(): Any? = unwrap(this).getLimits()

      override fun requests(): Any? = unwrap(this).getRequests()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty):
          ResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourcesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResourceRequirementProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty,
    ) : ResourceRequirementProperty {
      override fun type(): String? = unwrap(this).getType()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty):
          ResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceRequirementProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimeoutProperty {
    public fun attemptDurationSeconds(): Number? = unwrap(this).getAttemptDurationSeconds()

    public interface Builder {
      public fun attemptDurationSeconds(attemptDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.builder()

      override fun attemptDurationSeconds(attemptDurationSeconds: Number) {
        cdkBuilder.attemptDurationSeconds(attemptDurationSeconds)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty,
    ) : TimeoutProperty {
      override fun attemptDurationSeconds(): Number? = unwrap(this).getAttemptDurationSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty):
          TimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SecretProperty {
    public fun name(): String

    public fun valueFrom(): String

    public interface Builder {
      public fun name(name: String)

      public fun valueFrom(valueFrom: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty,
    ) : SecretProperty {
      override fun name(): String = unwrap(this).getName()

      override fun valueFrom(): String = unwrap(this).getValueFrom()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty):
          SecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecretProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VolumesHostProperty {
    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    public interface Builder {
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.builder()

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty,
    ) : VolumesHostProperty {
      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumesHostProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty):
          VolumesHostProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumesHostProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AuthorizationConfigProperty {
    public fun accessPointId(): String? = unwrap(this).getAccessPointId()

    public fun iam(): String? = unwrap(this).getIam()

    public interface Builder {
      public fun accessPointId(accessPointId: String)

      public fun iam(iam: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty.builder()

      override fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
      }

      override fun iam(iam: String) {
        cdkBuilder.iam(iam)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty,
    ) : AuthorizationConfigProperty {
      override fun accessPointId(): String? = unwrap(this).getAccessPointId()

      override fun iam(): String? = unwrap(this).getIam()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty):
          AuthorizationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationConfigProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.AuthorizationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EfsVolumeConfigurationProperty {
    public fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

    public fun fileSystemId(): String

    public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    public fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

    public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

    public interface Builder {
      public fun authorizationConfig(authorizationConfig: IResolvable)

      public fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7470c3e9883cb1e0e2e062dc1bd64cd1081ea458e11357768aaf3f5322d39814")
      public
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit)

      public fun fileSystemId(fileSystemId: String)

      public fun rootDirectory(rootDirectory: String)

      public fun transitEncryption(transitEncryption: String)

      public fun transitEncryptionPort(transitEncryptionPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty.builder()

      override fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(IResolvable::unwrap))
      }

      override fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7470c3e9883cb1e0e2e062dc1bd64cd1081ea458e11357768aaf3f5322d39814")
      override
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit):
          Unit = authorizationConfig(AuthorizationConfigProperty(authorizationConfig))

      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      override fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
      }

      override fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
      }

      override fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty,
    ) : EfsVolumeConfigurationProperty {
      override fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

      override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

      override fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

      override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty):
          EfsVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EfsVolumeConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MountPointsProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun sourceVolume(): String? = unwrap(this).getSourceVolume()

    public interface Builder {
      public fun containerPath(containerPath: String)

      public fun readOnly(readOnly: Boolean)

      public fun readOnly(readOnly: IResolvable)

      public fun sourceVolume(sourceVolume: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.builder()

      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      override fun sourceVolume(sourceVolume: String) {
        cdkBuilder.sourceVolume(sourceVolume)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty,
    ) : MountPointsProperty {
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      override fun sourceVolume(): String? = unwrap(this).getSourceVolume()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MountPointsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty):
          MountPointsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountPointsProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EksSecretProperty {
    public fun optional(): Any? = unwrap(this).getOptional()

    public fun secretName(): String

    public interface Builder {
      public fun optional(optional: Boolean)

      public fun optional(optional: IResolvable)

      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty.builder()

      override fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
      }

      override fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional.let(IResolvable::unwrap))
      }

      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty,
    ) : EksSecretProperty {
      override fun optional(): Any? = unwrap(this).getOptional()

      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EksSecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty):
          EksSecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksSecretProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksSecretProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EksPropertiesProperty {
    public fun podProperties(): Any? = unwrap(this).getPodProperties()

    public interface Builder {
      public fun podProperties(podProperties: IResolvable)

      public fun podProperties(podProperties: PodPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("736253c4cd1efc18e8b136980a99629cc7b68d3ead8e7f8bf14257b5e627ee7c")
      public fun podProperties(podProperties: PodPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty.builder()

      override fun podProperties(podProperties: IResolvable) {
        cdkBuilder.podProperties(podProperties.let(IResolvable::unwrap))
      }

      override fun podProperties(podProperties: PodPropertiesProperty) {
        cdkBuilder.podProperties(podProperties.let(PodPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("736253c4cd1efc18e8b136980a99629cc7b68d3ead8e7f8bf14257b5e627ee7c")
      override fun podProperties(podProperties: PodPropertiesProperty.Builder.() -> Unit): Unit =
          podProperties(PodPropertiesProperty(podProperties))

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty,
    ) : EksPropertiesProperty {
      override fun podProperties(): Any? = unwrap(this).getPodProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EksPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty):
          EksPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksPropertiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NodePropertiesProperty {
    public fun mainNode(): Number

    public fun nodeRangeProperties(): Any

    public fun numNodes(): Number

    public interface Builder {
      public fun mainNode(mainNode: Number)

      public fun nodeRangeProperties(nodeRangeProperties: IResolvable)

      public fun nodeRangeProperties(nodeRangeProperties: List<Any>)

      public fun numNodes(numNodes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.builder()

      override fun mainNode(mainNode: Number) {
        cdkBuilder.mainNode(mainNode)
      }

      override fun nodeRangeProperties(nodeRangeProperties: IResolvable) {
        cdkBuilder.nodeRangeProperties(nodeRangeProperties.let(IResolvable::unwrap))
      }

      override fun nodeRangeProperties(nodeRangeProperties: List<Any>) {
        cdkBuilder.nodeRangeProperties(nodeRangeProperties)
      }

      override fun numNodes(numNodes: Number) {
        cdkBuilder.numNodes(numNodes)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty,
    ) : NodePropertiesProperty {
      override fun mainNode(): Number = unwrap(this).getMainNode()

      override fun nodeRangeProperties(): Any = unwrap(this).getNodeRangeProperties()

      override fun numNodes(): Number = unwrap(this).getNumNodes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NodePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty):
          NodePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodePropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LogConfigurationProperty {
    public fun logDriver(): String

    public fun options(): Any? = unwrap(this).getOptions()

    public fun secretOptions(): Any? = unwrap(this).getSecretOptions()

    public interface Builder {
      public fun logDriver(logDriver: String)

      public fun options(options: Any)

      public fun secretOptions(secretOptions: IResolvable)

      public fun secretOptions(secretOptions: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty.builder()

      override fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
      }

      override fun options(options: Any) {
        cdkBuilder.options(options)
      }

      override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable::unwrap))
      }

      override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty,
    ) : LogConfigurationProperty {
      override fun logDriver(): String = unwrap(this).getLogDriver()

      override fun options(): Any? = unwrap(this).getOptions()

      override fun secretOptions(): Any? = unwrap(this).getSecretOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FargatePlatformConfigurationProperty {
    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    public interface Builder {
      public fun platformVersion(platformVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty.builder()

      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty,
    ) : FargatePlatformConfigurationProperty {
      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FargatePlatformConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty):
          FargatePlatformConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FargatePlatformConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HostPathProperty {
    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty.builder()

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty,
    ) : HostPathProperty {
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HostPathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty):
          HostPathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostPathProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.HostPathProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EvaluateOnExitProperty {
    public fun action(): String

    public fun onExitCode(): String? = unwrap(this).getOnExitCode()

    public fun onReason(): String? = unwrap(this).getOnReason()

    public fun onStatusReason(): String? = unwrap(this).getOnStatusReason()

    public interface Builder {
      public fun action(action: String)

      public fun onExitCode(onExitCode: String)

      public fun onReason(onReason: String)

      public fun onStatusReason(onStatusReason: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun onExitCode(onExitCode: String) {
        cdkBuilder.onExitCode(onExitCode)
      }

      override fun onReason(onReason: String) {
        cdkBuilder.onReason(onReason)
      }

      override fun onStatusReason(onStatusReason: String) {
        cdkBuilder.onStatusReason(onStatusReason)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty,
    ) : EvaluateOnExitProperty {
      override fun action(): String = unwrap(this).getAction()

      override fun onExitCode(): String? = unwrap(this).getOnExitCode()

      override fun onReason(): String? = unwrap(this).getOnReason()

      override fun onStatusReason(): String? = unwrap(this).getOnStatusReason()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluateOnExitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty):
          EvaluateOnExitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluateOnExitProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EvaluateOnExitProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TmpfsProperty {
    public fun containerPath(): String

    public fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

    public fun size(): Number

    public interface Builder {
      public fun containerPath(containerPath: String)

      public fun mountOptions(mountOptions: List<String>)

      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty.builder()

      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      override fun mountOptions(mountOptions: List<String>) {
        cdkBuilder.mountOptions(mountOptions)
      }

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty,
    ) : TmpfsProperty {
      override fun containerPath(): String = unwrap(this).getContainerPath()

      override fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

      override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TmpfsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty):
          TmpfsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TmpfsProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EmptyDirProperty {
    public fun medium(): String? = unwrap(this).getMedium()

    public fun sizeLimit(): String? = unwrap(this).getSizeLimit()

    public interface Builder {
      public fun medium(medium: String)

      public fun sizeLimit(sizeLimit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty.builder()

      override fun medium(medium: String) {
        cdkBuilder.medium(medium)
      }

      override fun sizeLimit(sizeLimit: String) {
        cdkBuilder.sizeLimit(sizeLimit)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty,
    ) : EmptyDirProperty {
      override fun medium(): String? = unwrap(this).getMedium()

      override fun sizeLimit(): String? = unwrap(this).getSizeLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EmptyDirProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty):
          EmptyDirProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmptyDirProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EmptyDirProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NodeRangePropertyProperty {
    public fun container(): Any? = unwrap(this).getContainer()

    public fun targetNodes(): String

    public interface Builder {
      public fun container(container: IResolvable)

      public fun container(container: ContainerPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("beb00cb70cdb4bab988f0a25a32c1d8f94755a029fbe4437334920bf4c93357f")
      public fun container(container: ContainerPropertiesProperty.Builder.() -> Unit)

      public fun targetNodes(targetNodes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.builder()

      override fun container(container: IResolvable) {
        cdkBuilder.container(container.let(IResolvable::unwrap))
      }

      override fun container(container: ContainerPropertiesProperty) {
        cdkBuilder.container(container.let(ContainerPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("beb00cb70cdb4bab988f0a25a32c1d8f94755a029fbe4437334920bf4c93357f")
      override fun container(container: ContainerPropertiesProperty.Builder.() -> Unit): Unit =
          container(ContainerPropertiesProperty(container))

      override fun targetNodes(targetNodes: String) {
        cdkBuilder.targetNodes(targetNodes)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty,
    ) : NodeRangePropertyProperty {
      override fun container(): Any? = unwrap(this).getContainer()

      override fun targetNodes(): String = unwrap(this).getTargetNodes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NodeRangePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty):
          NodeRangePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeRangePropertyProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EksVolumeProperty {
    public fun emptyDir(): Any? = unwrap(this).getEmptyDir()

    public fun hostPath(): Any? = unwrap(this).getHostPath()

    public fun name(): String

    public fun secret(): Any? = unwrap(this).getSecret()

    public interface Builder {
      public fun emptyDir(emptyDir: IResolvable)

      public fun emptyDir(emptyDir: EmptyDirProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cab76735c658ec67ac65517c202eefb6137d8eee9951122cfebcdd48045f53")
      public fun emptyDir(emptyDir: EmptyDirProperty.Builder.() -> Unit)

      public fun hostPath(hostPath: IResolvable)

      public fun hostPath(hostPath: HostPathProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d360658cd48b7781285f3855793f22f6f3abd4bf05b19c4e530bf084e5b94fe")
      public fun hostPath(hostPath: HostPathProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun secret(secret: IResolvable)

      public fun secret(secret: EksSecretProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77c654dd46a76748a6e3c3effa6bc364c3a500a99e98f1ee4495ba5a5ed8ec1")
      public fun secret(secret: EksSecretProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty.builder()

      override fun emptyDir(emptyDir: IResolvable) {
        cdkBuilder.emptyDir(emptyDir.let(IResolvable::unwrap))
      }

      override fun emptyDir(emptyDir: EmptyDirProperty) {
        cdkBuilder.emptyDir(emptyDir.let(EmptyDirProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cab76735c658ec67ac65517c202eefb6137d8eee9951122cfebcdd48045f53")
      override fun emptyDir(emptyDir: EmptyDirProperty.Builder.() -> Unit): Unit =
          emptyDir(EmptyDirProperty(emptyDir))

      override fun hostPath(hostPath: IResolvable) {
        cdkBuilder.hostPath(hostPath.let(IResolvable::unwrap))
      }

      override fun hostPath(hostPath: HostPathProperty) {
        cdkBuilder.hostPath(hostPath.let(HostPathProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d360658cd48b7781285f3855793f22f6f3abd4bf05b19c4e530bf084e5b94fe")
      override fun hostPath(hostPath: HostPathProperty.Builder.() -> Unit): Unit =
          hostPath(HostPathProperty(hostPath))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun secret(secret: IResolvable) {
        cdkBuilder.secret(secret.let(IResolvable::unwrap))
      }

      override fun secret(secret: EksSecretProperty) {
        cdkBuilder.secret(secret.let(EksSecretProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c77c654dd46a76748a6e3c3effa6bc364c3a500a99e98f1ee4495ba5a5ed8ec1")
      override fun secret(secret: EksSecretProperty.Builder.() -> Unit): Unit =
          secret(EksSecretProperty(secret))

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty,
    ) : EksVolumeProperty {
      override fun emptyDir(): Any? = unwrap(this).getEmptyDir()

      override fun hostPath(): Any? = unwrap(this).getHostPath()

      override fun name(): String = unwrap(this).getName()

      override fun secret(): Any? = unwrap(this).getSecret()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EksVolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty):
          EksVolumeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksVolumeProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksVolumeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    public interface Builder {
      public fun assignPublicIp(assignPublicIp: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty.builder()

      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UlimitProperty {
    public fun hardLimit(): Number

    public fun name(): String

    public fun softLimit(): Number

    public interface Builder {
      public fun hardLimit(hardLimit: Number)

      public fun name(name: String)

      public fun softLimit(softLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.builder()

      override fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty,
    ) : UlimitProperty {
      override fun hardLimit(): Number = unwrap(this).getHardLimit()

      override fun name(): String = unwrap(this).getName()

      override fun softLimit(): Number = unwrap(this).getSoftLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UlimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty):
          UlimitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UlimitProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EksContainerProperty {
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun env(): Any? = unwrap(this).getEnv()

    public fun image(): String

    public fun imagePullPolicy(): String? = unwrap(this).getImagePullPolicy()

    public fun name(): String? = unwrap(this).getName()

    public fun resources(): Any? = unwrap(this).getResources()

    public fun securityContext(): Any? = unwrap(this).getSecurityContext()

    public fun volumeMounts(): Any? = unwrap(this).getVolumeMounts()

    public interface Builder {
      public fun args(args: List<String>)

      public fun command(command: List<String>)

      public fun env(env: IResolvable)

      public fun env(env: List<Any>)

      public fun image(image: String)

      public fun imagePullPolicy(imagePullPolicy: String)

      public fun name(name: String)

      public fun resources(resources: IResolvable)

      public fun resources(resources: ResourcesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89941c1ac68cbe28dafe670b2382cb982458533ae9752c48e46ddfce3e62863")
      public fun resources(resources: ResourcesProperty.Builder.() -> Unit)

      public fun securityContext(securityContext: IResolvable)

      public fun securityContext(securityContext: SecurityContextProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("630ea6b519c7e542aaed3622e1835518d66bad7f20d399381064a7aa911e4af9")
      public fun securityContext(securityContext: SecurityContextProperty.Builder.() -> Unit)

      public fun volumeMounts(volumeMounts: IResolvable)

      public fun volumeMounts(volumeMounts: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty.builder()

      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      override fun env(env: IResolvable) {
        cdkBuilder.env(env.let(IResolvable::unwrap))
      }

      override fun env(env: List<Any>) {
        cdkBuilder.env(env)
      }

      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      override fun imagePullPolicy(imagePullPolicy: String) {
        cdkBuilder.imagePullPolicy(imagePullPolicy)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources.let(IResolvable::unwrap))
      }

      override fun resources(resources: ResourcesProperty) {
        cdkBuilder.resources(resources.let(ResourcesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89941c1ac68cbe28dafe670b2382cb982458533ae9752c48e46ddfce3e62863")
      override fun resources(resources: ResourcesProperty.Builder.() -> Unit): Unit =
          resources(ResourcesProperty(resources))

      override fun securityContext(securityContext: IResolvable) {
        cdkBuilder.securityContext(securityContext.let(IResolvable::unwrap))
      }

      override fun securityContext(securityContext: SecurityContextProperty) {
        cdkBuilder.securityContext(securityContext.let(SecurityContextProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("630ea6b519c7e542aaed3622e1835518d66bad7f20d399381064a7aa911e4af9")
      override fun securityContext(securityContext: SecurityContextProperty.Builder.() -> Unit):
          Unit = securityContext(SecurityContextProperty(securityContext))

      override fun volumeMounts(volumeMounts: IResolvable) {
        cdkBuilder.volumeMounts(volumeMounts.let(IResolvable::unwrap))
      }

      override fun volumeMounts(volumeMounts: List<Any>) {
        cdkBuilder.volumeMounts(volumeMounts)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty,
    ) : EksContainerProperty {
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      override fun env(): Any? = unwrap(this).getEnv()

      override fun image(): String = unwrap(this).getImage()

      override fun imagePullPolicy(): String? = unwrap(this).getImagePullPolicy()

      override fun name(): String? = unwrap(this).getName()

      override fun resources(): Any? = unwrap(this).getResources()

      override fun securityContext(): Any? = unwrap(this).getSecurityContext()

      override fun volumeMounts(): Any? = unwrap(this).getVolumeMounts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EksContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty):
          EksContainerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksContainerProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VolumesProperty {
    public fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

    public fun host(): Any? = unwrap(this).getHost()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable)

      public fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39e3c0c777d8054e49cf8a6374ec7913736c25549290310919297432a3e67e03")
      public
          fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty.Builder.() -> Unit)

      public fun host(host: IResolvable)

      public fun host(host: VolumesHostProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f307de4c2cf22a50de68540c5f0e5ecb133e07393df0da68a313d24480803f")
      public fun host(host: VolumesHostProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.builder()

      override fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(IResolvable::unwrap))
      }

      override fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(EfsVolumeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39e3c0c777d8054e49cf8a6374ec7913736c25549290310919297432a3e67e03")
      override
          fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = efsVolumeConfiguration(EfsVolumeConfigurationProperty(efsVolumeConfiguration))

      override fun host(host: IResolvable) {
        cdkBuilder.host(host.let(IResolvable::unwrap))
      }

      override fun host(host: VolumesHostProperty) {
        cdkBuilder.host(host.let(VolumesHostProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f307de4c2cf22a50de68540c5f0e5ecb133e07393df0da68a313d24480803f")
      override fun host(host: VolumesHostProperty.Builder.() -> Unit): Unit =
          host(VolumesHostProperty(host))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty,
    ) : VolumesProperty {
      override fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

      override fun host(): Any? = unwrap(this).getHost()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty):
          VolumesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SecurityContextProperty {
    public fun privileged(): Any? = unwrap(this).getPrivileged()

    public fun readOnlyRootFilesystem(): Any? = unwrap(this).getReadOnlyRootFilesystem()

    public fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

    public fun runAsNonRoot(): Any? = unwrap(this).getRunAsNonRoot()

    public fun runAsUser(): Number? = unwrap(this).getRunAsUser()

    public interface Builder {
      public fun privileged(privileged: Boolean)

      public fun privileged(privileged: IResolvable)

      public fun readOnlyRootFilesystem(readOnlyRootFilesystem: Boolean)

      public fun readOnlyRootFilesystem(readOnlyRootFilesystem: IResolvable)

      public fun runAsGroup(runAsGroup: Number)

      public fun runAsNonRoot(runAsNonRoot: Boolean)

      public fun runAsNonRoot(runAsNonRoot: IResolvable)

      public fun runAsUser(runAsUser: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty.builder()

      override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      override fun readOnlyRootFilesystem(readOnlyRootFilesystem: Boolean) {
        cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem)
      }

      override fun readOnlyRootFilesystem(readOnlyRootFilesystem: IResolvable) {
        cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem.let(IResolvable::unwrap))
      }

      override fun runAsGroup(runAsGroup: Number) {
        cdkBuilder.runAsGroup(runAsGroup)
      }

      override fun runAsNonRoot(runAsNonRoot: Boolean) {
        cdkBuilder.runAsNonRoot(runAsNonRoot)
      }

      override fun runAsNonRoot(runAsNonRoot: IResolvable) {
        cdkBuilder.runAsNonRoot(runAsNonRoot.let(IResolvable::unwrap))
      }

      override fun runAsUser(runAsUser: Number) {
        cdkBuilder.runAsUser(runAsUser)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty,
    ) : SecurityContextProperty {
      override fun privileged(): Any? = unwrap(this).getPrivileged()

      override fun readOnlyRootFilesystem(): Any? = unwrap(this).getReadOnlyRootFilesystem()

      override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

      override fun runAsNonRoot(): Any? = unwrap(this).getRunAsNonRoot()

      override fun runAsUser(): Number? = unwrap(this).getRunAsUser()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty):
          SecurityContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityContextProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.SecurityContextProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RuntimePlatformProperty {
    public fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

    public fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()

    public interface Builder {
      public fun cpuArchitecture(cpuArchitecture: String)

      public fun operatingSystemFamily(operatingSystemFamily: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty.builder()

      override fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
      }

      override fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty,
    ) : RuntimePlatformProperty {
      override fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

      override fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty):
          RuntimePlatformProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimePlatformProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.RuntimePlatformProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PodPropertiesProperty {
    public fun containers(): Any? = unwrap(this).getContainers()

    public fun dnsPolicy(): String? = unwrap(this).getDnsPolicy()

    public fun hostNetwork(): Any? = unwrap(this).getHostNetwork()

    public fun metadata(): Any? = unwrap(this).getMetadata()

    public fun serviceAccountName(): String? = unwrap(this).getServiceAccountName()

    public fun volumes(): Any? = unwrap(this).getVolumes()

    public interface Builder {
      public fun containers(containers: IResolvable)

      public fun containers(containers: List<Any>)

      public fun dnsPolicy(dnsPolicy: String)

      public fun hostNetwork(hostNetwork: Boolean)

      public fun hostNetwork(hostNetwork: IResolvable)

      public fun metadata(metadata: IResolvable)

      public fun metadata(metadata: MetadataProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4b08aa845521711bde52771185c3919a7e074569382fc63bb622ded44148f2b")
      public fun metadata(metadata: MetadataProperty.Builder.() -> Unit)

      public fun serviceAccountName(serviceAccountName: String)

      public fun volumes(volumes: IResolvable)

      public fun volumes(volumes: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty.builder()

      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      override fun dnsPolicy(dnsPolicy: String) {
        cdkBuilder.dnsPolicy(dnsPolicy)
      }

      override fun hostNetwork(hostNetwork: Boolean) {
        cdkBuilder.hostNetwork(hostNetwork)
      }

      override fun hostNetwork(hostNetwork: IResolvable) {
        cdkBuilder.hostNetwork(hostNetwork.let(IResolvable::unwrap))
      }

      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      override fun metadata(metadata: MetadataProperty) {
        cdkBuilder.metadata(metadata.let(MetadataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4b08aa845521711bde52771185c3919a7e074569382fc63bb622ded44148f2b")
      override fun metadata(metadata: MetadataProperty.Builder.() -> Unit): Unit =
          metadata(MetadataProperty(metadata))

      override fun serviceAccountName(serviceAccountName: String) {
        cdkBuilder.serviceAccountName(serviceAccountName)
      }

      override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
      }

      override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty,
    ) : PodPropertiesProperty {
      override fun containers(): Any? = unwrap(this).getContainers()

      override fun dnsPolicy(): String? = unwrap(this).getDnsPolicy()

      override fun hostNetwork(): Any? = unwrap(this).getHostNetwork()

      override fun metadata(): Any? = unwrap(this).getMetadata()

      override fun serviceAccountName(): String? = unwrap(this).getServiceAccountName()

      override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PodPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty):
          PodPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PodPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.PodPropertiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetadataProperty {
    public fun labels(): Any? = unwrap(this).getLabels()

    public interface Builder {
      public fun labels(labels: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty.builder()

      override fun labels(labels: Any) {
        cdkBuilder.labels(labels)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty,
    ) : MetadataProperty {
      override fun labels(): Any? = unwrap(this).getLabels()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty):
          MetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.MetadataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EnvironmentProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty,
    ) : EnvironmentProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty):
          EnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EksContainerEnvironmentVariableProperty {
    public fun name(): String

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty,
    ) : EksContainerEnvironmentVariableProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EksContainerEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty):
          EksContainerEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksContainerEnvironmentVariableProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerEnvironmentVariableProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EphemeralStorageProperty {
    public fun sizeInGiB(): Number

    public interface Builder {
      public fun sizeInGiB(sizeInGiB: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty.builder()

      override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty,
    ) : EphemeralStorageProperty {
      override fun sizeInGiB(): Number = unwrap(this).getSizeInGiB()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty):
          EphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EphemeralStorageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ContainerPropertiesProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    public fun fargatePlatformConfiguration(): Any? = unwrap(this).getFargatePlatformConfiguration()

    public fun image(): String

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun jobRoleArn(): String? = unwrap(this).getJobRoleArn()

    public fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    public fun memory(): Number? = unwrap(this).getMemory()

    public fun mountPoints(): Any? = unwrap(this).getMountPoints()

    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    public fun privileged(): Any? = unwrap(this).getPrivileged()

    public fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

    public fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    public fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

    public fun secrets(): Any? = unwrap(this).getSecrets()

    public fun ulimits(): Any? = unwrap(this).getUlimits()

    public fun user(): String? = unwrap(this).getUser()

    public fun vcpus(): Number? = unwrap(this).getVcpus()

    public fun volumes(): Any? = unwrap(this).getVolumes()

    public interface Builder {
      public fun command(command: List<String>)

      public fun environment(environment: IResolvable)

      public fun environment(environment: List<Any>)

      public fun ephemeralStorage(ephemeralStorage: IResolvable)

      public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e73378b595cc6c4fca0e6da600a4089f07dd3af9b2f35cdfc34ec6ec42961c")
      public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

      public fun executionRoleArn(executionRoleArn: String)

      public fun fargatePlatformConfiguration(fargatePlatformConfiguration: IResolvable)

      public
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9b52813c7c400f8615b05a91517e932b2efc31357ada779b753a705e1f3a3f4")
      public
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty.Builder.() -> Unit)

      public fun image(image: String)

      public fun instanceType(instanceType: String)

      public fun jobRoleArn(jobRoleArn: String)

      public fun linuxParameters(linuxParameters: IResolvable)

      public fun linuxParameters(linuxParameters: LinuxParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905b256d03d629094b0c74f3b07a1e527b0a9c3cae07b007bbf275f17b10489c")
      public fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit)

      public fun logConfiguration(logConfiguration: IResolvable)

      public fun logConfiguration(logConfiguration: LogConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfa04ac24a26fb769b04d9a76d721780cf2939be5672d1c633390d17d911abdc")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit)

      public fun memory(memory: Number)

      public fun mountPoints(mountPoints: IResolvable)

      public fun mountPoints(mountPoints: List<Any>)

      public fun networkConfiguration(networkConfiguration: IResolvable)

      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84646023e3ec8692064dcfb9e9fad69fe2c3e7a874c2a70744d27f577b4c92e0")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      public fun privileged(privileged: Boolean)

      public fun privileged(privileged: IResolvable)

      public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

      public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable)

      public fun repositoryCredentials(repositoryCredentials: IResolvable)

      public fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a5f329b8daae4793f12cdc8e64a0f0ae7ea09fdfb022c71f7da4fb30cd56225")
      public
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit)

      public fun resourceRequirements(resourceRequirements: IResolvable)

      public fun resourceRequirements(resourceRequirements: List<Any>)

      public fun runtimePlatform(runtimePlatform: IResolvable)

      public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f72a76832d0064469b7780c971fbcac43944532b65a5d2c80f44a35167058d")
      public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit)

      public fun secrets(secrets: IResolvable)

      public fun secrets(secrets: List<Any>)

      public fun ulimits(ulimits: IResolvable)

      public fun ulimits(ulimits: List<Any>)

      public fun user(user: String)

      public fun vcpus(vcpus: Number)

      public fun volumes(volumes: IResolvable)

      public fun volumes(volumes: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.builder()

      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      override fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
      }

      override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e73378b595cc6c4fca0e6da600a4089f07dd3af9b2f35cdfc34ec6ec42961c")
      override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
          Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      override fun fargatePlatformConfiguration(fargatePlatformConfiguration: IResolvable) {
        cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration.let(IResolvable::unwrap))
      }

      override
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty) {
        cdkBuilder.fargatePlatformConfiguration(fargatePlatformConfiguration.let(FargatePlatformConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9b52813c7c400f8615b05a91517e932b2efc31357ada779b753a705e1f3a3f4")
      override
          fun fargatePlatformConfiguration(fargatePlatformConfiguration: FargatePlatformConfigurationProperty.Builder.() -> Unit):
          Unit =
          fargatePlatformConfiguration(FargatePlatformConfigurationProperty(fargatePlatformConfiguration))

      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun jobRoleArn(jobRoleArn: String) {
        cdkBuilder.jobRoleArn(jobRoleArn)
      }

      override fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters.let(IResolvable::unwrap))
      }

      override fun linuxParameters(linuxParameters: LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters.let(LinuxParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905b256d03d629094b0c74f3b07a1e527b0a9c3cae07b007bbf275f17b10489c")
      override fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit):
          Unit = linuxParameters(LinuxParametersProperty(linuxParameters))

      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfa04ac24a26fb769b04d9a76d721780cf2939be5672d1c633390d17d911abdc")
      override fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(LogConfigurationProperty(logConfiguration))

      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable::unwrap))
      }

      override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints)
      }

      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84646023e3ec8692064dcfb9e9fad69fe2c3e7a874c2a70744d27f577b4c92e0")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
      }

      override fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem.let(IResolvable::unwrap))
      }

      override fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(IResolvable::unwrap))
      }

      override fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(RepositoryCredentialsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a5f329b8daae4793f12cdc8e64a0f0ae7ea09fdfb022c71f7da4fb30cd56225")
      override
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit):
          Unit = repositoryCredentials(RepositoryCredentialsProperty(repositoryCredentials))

      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      override fun runtimePlatform(runtimePlatform: IResolvable) {
        cdkBuilder.runtimePlatform(runtimePlatform.let(IResolvable::unwrap))
      }

      override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty) {
        cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatformProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f72a76832d0064469b7780c971fbcac43944532b65a5d2c80f44a35167058d")
      override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit):
          Unit = runtimePlatform(RuntimePlatformProperty(runtimePlatform))

      override fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets.let(IResolvable::unwrap))
      }

      override fun secrets(secrets: List<Any>) {
        cdkBuilder.secrets(secrets)
      }

      override fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits.let(IResolvable::unwrap))
      }

      override fun ulimits(ulimits: List<Any>) {
        cdkBuilder.ulimits(ulimits)
      }

      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      override fun vcpus(vcpus: Number) {
        cdkBuilder.vcpus(vcpus)
      }

      override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
      }

      override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty,
    ) : ContainerPropertiesProperty {
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

      override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

      override fun fargatePlatformConfiguration(): Any? =
          unwrap(this).getFargatePlatformConfiguration()

      override fun image(): String = unwrap(this).getImage()

      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun jobRoleArn(): String? = unwrap(this).getJobRoleArn()

      override fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      override fun memory(): Number? = unwrap(this).getMemory()

      override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      override fun privileged(): Any? = unwrap(this).getPrivileged()

      override fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

      override fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

      override fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

      override fun secrets(): Any? = unwrap(this).getSecrets()

      override fun ulimits(): Any? = unwrap(this).getUlimits()

      override fun user(): String? = unwrap(this).getUser()

      override fun vcpus(): Number? = unwrap(this).getVcpus()

      override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty):
          ContainerPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerPropertiesProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RetryStrategyProperty {
    public fun attempts(): Number? = unwrap(this).getAttempts()

    public fun evaluateOnExit(): Any? = unwrap(this).getEvaluateOnExit()

    public interface Builder {
      public fun attempts(attempts: Number)

      public fun evaluateOnExit(evaluateOnExit: IResolvable)

      public fun evaluateOnExit(evaluateOnExit: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.builder()

      override fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
      }

      override fun evaluateOnExit(evaluateOnExit: IResolvable) {
        cdkBuilder.evaluateOnExit(evaluateOnExit.let(IResolvable::unwrap))
      }

      override fun evaluateOnExit(evaluateOnExit: List<Any>) {
        cdkBuilder.evaluateOnExit(evaluateOnExit)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty,
    ) : RetryStrategyProperty {
      override fun attempts(): Number? = unwrap(this).getAttempts()

      override fun evaluateOnExit(): Any? = unwrap(this).getEvaluateOnExit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetryStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty):
          RetryStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryStrategyProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EksContainerVolumeMountProperty {
    public fun mountPath(): String? = unwrap(this).getMountPath()

    public fun name(): String? = unwrap(this).getName()

    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public interface Builder {
      public fun mountPath(mountPath: String)

      public fun name(name: String)

      public fun readOnly(readOnly: Boolean)

      public fun readOnly(readOnly: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty.builder()

      override fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty,
    ) : EksContainerVolumeMountProperty {
      override fun mountPath(): String? = unwrap(this).getMountPath()

      override fun name(): String? = unwrap(this).getName()

      override fun readOnly(): Any? = unwrap(this).getReadOnly()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EksContainerVolumeMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty):
          EksContainerVolumeMountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksContainerVolumeMountProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.EksContainerVolumeMountProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeviceProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun hostPath(): String? = unwrap(this).getHostPath()

    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    public interface Builder {
      public fun containerPath(containerPath: String)

      public fun hostPath(hostPath: String)

      public fun permissions(permissions: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty.Builder =
          software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty.builder()

      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      override fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
      }

      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      public fun build(): software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty,
    ) : DeviceProperty {
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      override fun hostPath(): String? = unwrap(this).getHostPath()

      override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty):
          DeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
