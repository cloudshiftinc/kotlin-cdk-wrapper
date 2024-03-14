package io.cloudshiftdev.awscdk.services.fis

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

public open class CfnExperimentTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun actions(): Any? = unwrap(this).getActions()

  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  public open fun actions(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setActions(__item_ac66f0)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun experimentOptions(): Any? = unwrap(this).getExperimentOptions()

  public open fun experimentOptions(`value`: IResolvable) {
    unwrap(this).setExperimentOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun experimentOptions(`value`: ExperimentTemplateExperimentOptionsProperty) {
    unwrap(this).setExperimentOptions(`value`.let(ExperimentTemplateExperimentOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9a68fd568b1ee455e011fefb0079750fff55b15abd2d76c90aa1a98209c5e03e")
  public open
      fun experimentOptions(`value`: ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit):
      Unit = experimentOptions(ExperimentTemplateExperimentOptionsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun logConfiguration(`value`: ExperimentTemplateLogConfigurationProperty) {
    unwrap(this).setLogConfiguration(`value`.let(ExperimentTemplateLogConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1903bbf82fe1aa6109b4ed61aeddd4255fbf59faaf7fca7e3c69515d398c9638")
  public open
      fun logConfiguration(`value`: ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit):
      Unit = logConfiguration(ExperimentTemplateLogConfigurationProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun stopConditions(): Any = unwrap(this).getStopConditions()

  public open fun stopConditions(`value`: IResolvable) {
    unwrap(this).setStopConditions(`value`.let(IResolvable::unwrap))
  }

  public open fun stopConditions(__idx_ac66f0: List<Any>) {
    unwrap(this).setStopConditions(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun targets(): Any = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setTargets(__item_ac66f0)
  }

  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: Map<String, Any>)

    public fun description(description: String)

    public fun experimentOptions(experimentOptions: IResolvable)

    public fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b2a656422787a97a708d2580eec4e1c60a9b5cc48903943948c7f8119b43d0")
    public
        fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit)

    public fun logConfiguration(logConfiguration: IResolvable)

    public fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe63142c92764aa56294f606a6c0d291ce9297af2391022a95186c98cf92218")
    public
        fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stopConditions(stopConditions: IResolvable)

    public fun stopConditions(stopConditions: List<Any>)

    public fun tags(tags: Map<String, String>)

    public fun targets(targets: IResolvable)

    public fun targets(targets: Map<String, Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fis.CfnExperimentTemplate.Builder =
        software.amazon.awscdk.services.fis.CfnExperimentTemplate.Builder.create(scope, id)

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: Map<String, Any>) {
      cdkBuilder.actions(actions)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun experimentOptions(experimentOptions: IResolvable) {
      cdkBuilder.experimentOptions(experimentOptions.let(IResolvable::unwrap))
    }

    override fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty) {
      cdkBuilder.experimentOptions(experimentOptions.let(ExperimentTemplateExperimentOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b2a656422787a97a708d2580eec4e1c60a9b5cc48903943948c7f8119b43d0")
    override
        fun experimentOptions(experimentOptions: ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit):
        Unit = experimentOptions(ExperimentTemplateExperimentOptionsProperty(experimentOptions))

    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    override fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(ExperimentTemplateLogConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe63142c92764aa56294f606a6c0d291ce9297af2391022a95186c98cf92218")
    override
        fun logConfiguration(logConfiguration: ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(ExperimentTemplateLogConfigurationProperty(logConfiguration))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stopConditions(stopConditions: IResolvable) {
      cdkBuilder.stopConditions(stopConditions.let(IResolvable::unwrap))
    }

    override fun stopConditions(stopConditions: List<Any>) {
      cdkBuilder.stopConditions(stopConditions)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: Map<String, Any>) {
      cdkBuilder.targets(targets)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnExperimentTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExperimentTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExperimentTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate):
        CfnExperimentTemplate = CfnExperimentTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnExperimentTemplate):
        software.amazon.awscdk.services.fis.CfnExperimentTemplate = wrapped.cdkObject
  }

  public interface ExperimentTemplateTargetFilterProperty {
    public fun path(): String

    public fun values(): List<String>

    public interface Builder {
      public fun path(path: String)

      public fun values(values: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty.builder()

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty,
    ) : ExperimentTemplateTargetFilterProperty {
      override fun path(): String = unwrap(this).getPath()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateTargetFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty):
          ExperimentTemplateTargetFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateTargetFilterProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExperimentTemplateTargetProperty {
    public fun filters(): Any? = unwrap(this).getFilters()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    public fun resourceType(): String

    public fun selectionMode(): String

    public interface Builder {
      public fun filters(filters: IResolvable)

      public fun filters(filters: List<Any>)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: Map<String, String>)

      public fun resourceArns(resourceArns: List<String>)

      public fun resourceTags(resourceTags: IResolvable)

      public fun resourceTags(resourceTags: Map<String, String>)

      public fun resourceType(resourceType: String)

      public fun selectionMode(selectionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty.builder()

      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      override fun resourceArns(resourceArns: List<String>) {
        cdkBuilder.resourceArns(resourceArns)
      }

      override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
      }

      override fun resourceTags(resourceTags: Map<String, String>) {
        cdkBuilder.resourceTags(resourceTags)
      }

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      override fun selectionMode(selectionMode: String) {
        cdkBuilder.selectionMode(selectionMode)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty,
    ) : ExperimentTemplateTargetProperty {
      override fun filters(): Any? = unwrap(this).getFilters()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

      override fun resourceTags(): Any? = unwrap(this).getResourceTags()

      override fun resourceType(): String = unwrap(this).getResourceType()

      override fun selectionMode(): String = unwrap(this).getSelectionMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExperimentTemplateTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty):
          ExperimentTemplateTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateTargetProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateTargetProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExperimentTemplateLogConfigurationProperty {
    public fun cloudWatchLogsConfiguration(): Any? = unwrap(this).getCloudWatchLogsConfiguration()

    public fun logSchemaVersion(): Number

    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    public interface Builder {
      public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: Any)

      public fun logSchemaVersion(logSchemaVersion: Number)

      public fun s3Configuration(s3Configuration: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.builder()

      override fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: Any) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
      }

      override fun logSchemaVersion(logSchemaVersion: Number) {
        cdkBuilder.logSchemaVersion(logSchemaVersion)
      }

      override fun s3Configuration(s3Configuration: Any) {
        cdkBuilder.s3Configuration(s3Configuration)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty,
    ) : ExperimentTemplateLogConfigurationProperty {
      override fun cloudWatchLogsConfiguration(): Any? =
          unwrap(this).getCloudWatchLogsConfiguration()

      override fun logSchemaVersion(): Number = unwrap(this).getLogSchemaVersion()

      override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty):
          ExperimentTemplateLogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateLogConfigurationProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExperimentTemplateExperimentOptionsProperty {
    public fun accountTargeting(): String? = unwrap(this).getAccountTargeting()

    public fun emptyTargetResolutionMode(): String? = unwrap(this).getEmptyTargetResolutionMode()

    public interface Builder {
      public fun accountTargeting(accountTargeting: String)

      public fun emptyTargetResolutionMode(emptyTargetResolutionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.builder()

      override fun accountTargeting(accountTargeting: String) {
        cdkBuilder.accountTargeting(accountTargeting)
      }

      override fun emptyTargetResolutionMode(emptyTargetResolutionMode: String) {
        cdkBuilder.emptyTargetResolutionMode(emptyTargetResolutionMode)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty,
    ) : ExperimentTemplateExperimentOptionsProperty {
      override fun accountTargeting(): String? = unwrap(this).getAccountTargeting()

      override fun emptyTargetResolutionMode(): String? =
          unwrap(this).getEmptyTargetResolutionMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateExperimentOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty):
          ExperimentTemplateExperimentOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateExperimentOptionsProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ConfigurationProperty {
    public fun bucketName(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty,
    ) : S3ConfigurationProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty):
          S3ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigurationProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.S3ConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExperimentTemplateStopConditionProperty {
    public fun source(): String

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun source(source: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.builder()

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty,
    ) : ExperimentTemplateStopConditionProperty {
      override fun source(): String = unwrap(this).getSource()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExperimentTemplateStopConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty):
          ExperimentTemplateStopConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateStopConditionProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExperimentTemplateActionProperty {
    public fun actionId(): String

    public fun description(): String? = unwrap(this).getDescription()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun startAfter(): List<String> = unwrap(this).getStartAfter() ?: emptyList()

    public fun targets(): Any? = unwrap(this).getTargets()

    public interface Builder {
      public fun actionId(actionId: String)

      public fun description(description: String)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: Map<String, String>)

      public fun startAfter(startAfter: List<String>)

      public fun targets(targets: IResolvable)

      public fun targets(targets: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty.builder()

      override fun actionId(actionId: String) {
        cdkBuilder.actionId(actionId)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      override fun startAfter(startAfter: List<String>) {
        cdkBuilder.startAfter(startAfter)
      }

      override fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets.let(IResolvable::unwrap))
      }

      override fun targets(targets: Map<String, String>) {
        cdkBuilder.targets(targets)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty,
    ) : ExperimentTemplateActionProperty {
      override fun actionId(): String = unwrap(this).getActionId()

      override fun description(): String? = unwrap(this).getDescription()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun startAfter(): List<String> = unwrap(this).getStartAfter() ?: emptyList()

      override fun targets(): Any? = unwrap(this).getTargets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExperimentTemplateActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty):
          ExperimentTemplateActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExperimentTemplateActionProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateActionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsConfigurationProperty {
    public fun logGroupArn(): String

    public interface Builder {
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.builder()

      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty,
    ) : CloudWatchLogsConfigurationProperty {
      override fun logGroupArn(): String = unwrap(this).getLogGroupArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty):
          CloudWatchLogsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsConfigurationProperty):
          software.amazon.awscdk.services.fis.CfnExperimentTemplate.CloudWatchLogsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
