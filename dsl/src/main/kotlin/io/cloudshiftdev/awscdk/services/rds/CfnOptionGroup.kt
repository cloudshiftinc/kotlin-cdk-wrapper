package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOptionGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun engineName(): String = unwrap(this).getEngineName()

  public open fun engineName(`value`: String) {
    unwrap(this).setEngineName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun majorEngineVersion(): String = unwrap(this).getMajorEngineVersion()

  public open fun majorEngineVersion(`value`: String) {
    unwrap(this).setMajorEngineVersion(`value`)
  }

  public open fun optionConfigurations(): Any? = unwrap(this).getOptionConfigurations()

  public open fun optionConfigurations(`value`: IResolvable) {
    unwrap(this).setOptionConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun optionConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setOptionConfigurations(__idx_ac66f0)
  }

  public open fun optionGroupDescription(): String = unwrap(this).getOptionGroupDescription()

  public open fun optionGroupDescription(`value`: String) {
    unwrap(this).setOptionGroupDescription(`value`)
  }

  public open fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  public open fun optionGroupName(`value`: String) {
    unwrap(this).setOptionGroupName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun engineName(engineName: String) {
    }

    public fun majorEngineVersion(majorEngineVersion: String) {
    }

    public fun optionConfigurations(optionConfigurations: IResolvable) {
    }

    public fun optionConfigurations(optionConfigurations: List<Any>) {
    }

    public fun optionGroupDescription(optionGroupDescription: String) {
    }

    public fun optionGroupName(optionGroupName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnOptionGroup.Builder =
        software.amazon.awscdk.services.rds.CfnOptionGroup.Builder.create(scope, id)

    public override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    public override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    public override fun optionConfigurations(optionConfigurations: IResolvable) {
      cdkBuilder.optionConfigurations(optionConfigurations.let(IResolvable::unwrap))
    }

    public override fun optionConfigurations(optionConfigurations: List<Any>) {
      cdkBuilder.optionConfigurations(optionConfigurations)
    }

    public override fun optionGroupDescription(optionGroupDescription: String) {
      cdkBuilder.optionGroupDescription(optionGroupDescription)
    }

    public override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnOptionGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOptionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOptionGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup): CfnOptionGroup
        = CfnOptionGroup(cdkObject)

    internal fun unwrap(wrapped: CfnOptionGroup): software.amazon.awscdk.services.rds.CfnOptionGroup
        = wrapped.cdkObject
  }

  public interface OptionConfigurationProperty {
    public fun dbSecurityGroupMemberships(): List<String> =
        unwrap(this).getDbSecurityGroupMemberships() ?: emptyList()

    public fun optionName(): String

    public fun optionSettings(): Any? = unwrap(this).getOptionSettings()

    public fun optionVersion(): String? = unwrap(this).getOptionVersion()

    public fun port(): Number? = unwrap(this).getPort()

    public fun vpcSecurityGroupMemberships(): List<String> =
        unwrap(this).getVpcSecurityGroupMemberships() ?: emptyList()

    public interface Builder {
      public fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: List<String>) {
      }

      public fun optionName(optionName: String) {
      }

      public fun optionSettings(optionSettings: IResolvable) {
      }

      public fun optionSettings(optionSettings: List<Any>) {
      }

      public fun optionVersion(optionVersion: String) {
      }

      public fun port(port: Number) {
      }

      public fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty.Builder =
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty.builder()

      public override fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: List<String>) {
        cdkBuilder.dbSecurityGroupMemberships(dbSecurityGroupMemberships)
      }

      public override fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
      }

      public override fun optionSettings(optionSettings: IResolvable) {
        cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
      }

      public override fun optionSettings(optionSettings: List<Any>) {
        cdkBuilder.optionSettings(optionSettings)
      }

      public override fun optionVersion(optionVersion: String) {
        cdkBuilder.optionVersion(optionVersion)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: List<String>) {
        cdkBuilder.vpcSecurityGroupMemberships(vpcSecurityGroupMemberships)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty,
    ) : OptionConfigurationProperty {
      public override fun dbSecurityGroupMemberships(): List<String> =
          unwrap(this).getDbSecurityGroupMemberships() ?: emptyList()

      public override fun optionName(): String = unwrap(this).getOptionName()

      public override fun optionSettings(): Any? = unwrap(this).getOptionSettings()

      public override fun optionVersion(): String? = unwrap(this).getOptionVersion()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun vpcSecurityGroupMemberships(): List<String> =
          unwrap(this).getVpcSecurityGroupMemberships() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty):
          OptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OptionSettingProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty.Builder =
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty,
    ) : OptionSettingProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OptionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty):
          OptionSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionSettingProperty):
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
