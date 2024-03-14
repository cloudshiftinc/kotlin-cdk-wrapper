package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrEndpointUrl(): String = unwrap(this).getAttrEndpointUrl()

  public open fun cnamePrefix(): String? = unwrap(this).getCnamePrefix()

  public open fun cnamePrefix(`value`: String) {
    unwrap(this).setCnamePrefix(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun operationsRole(): String? = unwrap(this).getOperationsRole()

  public open fun operationsRole(`value`: String) {
    unwrap(this).setOperationsRole(`value`)
  }

  public open fun optionSettings(): Any? = unwrap(this).getOptionSettings()

  public open fun optionSettings(`value`: IResolvable) {
    unwrap(this).setOptionSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun optionSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setOptionSettings(__idx_ac66f0)
  }

  public open fun optionSettings(vararg __idx_ac66f0: Any): Unit =
      optionSettings(__idx_ac66f0.toList())

  public open fun platformArn(): String? = unwrap(this).getPlatformArn()

  public open fun platformArn(`value`: String) {
    unwrap(this).setPlatformArn(`value`)
  }

  public open fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

  public open fun solutionStackName(`value`: String) {
    unwrap(this).setSolutionStackName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun templateName(): String? = unwrap(this).getTemplateName()

  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  public open fun tier(): Any? = unwrap(this).getTier()

  public open fun tier(`value`: IResolvable) {
    unwrap(this).setTier(`value`.let(IResolvable::unwrap))
  }

  public open fun tier(`value`: TierProperty) {
    unwrap(this).setTier(`value`.let(TierProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016c99eb44a253444e7f6db18a461c703af4f63f9846add6b7855cb273a91480")
  public open fun tier(`value`: TierProperty.Builder.() -> Unit): Unit = tier(TierProperty(`value`))

  public open fun versionLabel(): String? = unwrap(this).getVersionLabel()

  public open fun versionLabel(`value`: String) {
    unwrap(this).setVersionLabel(`value`)
  }

  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun cnamePrefix(cnamePrefix: String)

    public fun description(description: String)

    public fun environmentName(environmentName: String)

    public fun operationsRole(operationsRole: String)

    public fun optionSettings(optionSettings: IResolvable)

    public fun optionSettings(optionSettings: List<Any>)

    public fun optionSettings(vararg optionSettings: Any)

    public fun platformArn(platformArn: String)

    public fun solutionStackName(solutionStackName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateName(templateName: String)

    public fun tier(tier: IResolvable)

    public fun tier(tier: TierProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da8a7b4f68c3a6fb28e3ae16f58ad6cc5abb1b5b4ce910ac21f323e9497a3e51")
    public fun tier(tier: TierProperty.Builder.() -> Unit)

    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.Builder
        = software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.Builder.create(scope, id)

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun cnamePrefix(cnamePrefix: String) {
      cdkBuilder.cnamePrefix(cnamePrefix)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun operationsRole(operationsRole: String) {
      cdkBuilder.operationsRole(operationsRole)
    }

    override fun optionSettings(optionSettings: IResolvable) {
      cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
    }

    override fun optionSettings(optionSettings: List<Any>) {
      cdkBuilder.optionSettings(optionSettings)
    }

    override fun optionSettings(vararg optionSettings: Any): Unit =
        optionSettings(optionSettings.toList())

    override fun platformArn(platformArn: String) {
      cdkBuilder.platformArn(platformArn)
    }

    override fun solutionStackName(solutionStackName: String) {
      cdkBuilder.solutionStackName(solutionStackName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    override fun tier(tier: IResolvable) {
      cdkBuilder.tier(tier.let(IResolvable::unwrap))
    }

    override fun tier(tier: TierProperty) {
      cdkBuilder.tier(tier.let(TierProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da8a7b4f68c3a6fb28e3ae16f58ad6cc5abb1b5b4ce910ac21f323e9497a3e51")
    override fun tier(tier: TierProperty.Builder.() -> Unit): Unit = tier(TierProperty(tier))

    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment = wrapped.cdkObject
  }

  public interface TierProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun type(): String? = unwrap(this).getType()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun name(name: String)

      public fun type(type: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder =
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty,
    ) : TierProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun type(): String? = unwrap(this).getType()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty):
          TierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TierProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OptionSettingProperty {
    public fun namespace(): String

    public fun optionName(): String

    public fun resourceName(): String? = unwrap(this).getResourceName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun namespace(namespace: String)

      public fun optionName(optionName: String)

      public fun resourceName(resourceName: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.builder()

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
      }

      override fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty,
    ) : OptionSettingProperty {
      override fun namespace(): String = unwrap(this).getNamespace()

      override fun optionName(): String = unwrap(this).getOptionName()

      override fun resourceName(): String? = unwrap(this).getResourceName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OptionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty):
          OptionSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionSettingProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
