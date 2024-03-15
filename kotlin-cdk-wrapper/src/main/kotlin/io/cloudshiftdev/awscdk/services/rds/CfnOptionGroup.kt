@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOptionGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup,
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

  public open fun optionConfigurations(vararg __idx_ac66f0: Any): Unit =
      optionConfigurations(__idx_ac66f0.toList())

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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun engineName(engineName: String)

    public fun majorEngineVersion(majorEngineVersion: String)

    public fun optionConfigurations(optionConfigurations: IResolvable)

    public fun optionConfigurations(optionConfigurations: List<Any>)

    public fun optionConfigurations(vararg optionConfigurations: Any)

    public fun optionGroupDescription(optionGroupDescription: String)

    public fun optionGroupName(optionGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnOptionGroup.Builder =
        software.amazon.awscdk.services.rds.CfnOptionGroup.Builder.create(scope, id)

    override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    override fun optionConfigurations(optionConfigurations: IResolvable) {
      cdkBuilder.optionConfigurations(optionConfigurations.let(IResolvable::unwrap))
    }

    override fun optionConfigurations(optionConfigurations: List<Any>) {
      cdkBuilder.optionConfigurations(optionConfigurations)
    }

    override fun optionConfigurations(vararg optionConfigurations: Any): Unit =
        optionConfigurations(optionConfigurations.toList())

    override fun optionGroupDescription(optionGroupDescription: String) {
      cdkBuilder.optionGroupDescription(optionGroupDescription)
    }

    override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnOptionGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnOptionGroup.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: List<String>)

      public fun dbSecurityGroupMemberships(vararg dbSecurityGroupMemberships: String)

      public fun optionName(optionName: String)

      public fun optionSettings(optionSettings: IResolvable)

      public fun optionSettings(optionSettings: List<Any>)

      public fun optionSettings(vararg optionSettings: Any)

      public fun optionVersion(optionVersion: String)

      public fun port(port: Number)

      public fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: List<String>)

      public fun vpcSecurityGroupMemberships(vararg vpcSecurityGroupMemberships: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty.Builder =
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty.builder()

      override fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: List<String>) {
        cdkBuilder.dbSecurityGroupMemberships(dbSecurityGroupMemberships)
      }

      override fun dbSecurityGroupMemberships(vararg dbSecurityGroupMemberships: String): Unit =
          dbSecurityGroupMemberships(dbSecurityGroupMemberships.toList())

      override fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
      }

      override fun optionSettings(optionSettings: IResolvable) {
        cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
      }

      override fun optionSettings(optionSettings: List<Any>) {
        cdkBuilder.optionSettings(optionSettings)
      }

      override fun optionSettings(vararg optionSettings: Any): Unit =
          optionSettings(optionSettings.toList())

      override fun optionVersion(optionVersion: String) {
        cdkBuilder.optionVersion(optionVersion)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: List<String>) {
        cdkBuilder.vpcSecurityGroupMemberships(vpcSecurityGroupMemberships)
      }

      override fun vpcSecurityGroupMemberships(vararg vpcSecurityGroupMemberships: String): Unit =
          vpcSecurityGroupMemberships(vpcSecurityGroupMemberships.toList())

      public fun build():
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty,
    ) : CdkObject(cdkObject), OptionConfigurationProperty {
      override fun dbSecurityGroupMemberships(): List<String> =
          unwrap(this).getDbSecurityGroupMemberships() ?: emptyList()

      override fun optionName(): String = unwrap(this).getOptionName()

      override fun optionSettings(): Any? = unwrap(this).getOptionSettings()

      override fun optionVersion(): String? = unwrap(this).getOptionVersion()

      override fun port(): Number? = unwrap(this).getPort()

      override fun vpcSecurityGroupMemberships(): List<String> =
          unwrap(this).getVpcSecurityGroupMemberships() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty):
          OptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty
    }
  }

  public interface OptionSettingProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty.Builder =
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty,
    ) : CdkObject(cdkObject), OptionSettingProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty):
          OptionSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionSettingProperty):
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty
    }
  }
}
