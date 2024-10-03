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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::OptionGroup` resource creates or updates an option group, to enable and configure
 * features that are specific to a particular DB engine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnOptionGroup cfnOptionGroup = CfnOptionGroup.Builder.create(this, "MyCfnOptionGroup")
 * .engineName("engineName")
 * .majorEngineVersion("majorEngineVersion")
 * .optionGroupDescription("optionGroupDescription")
 * // the properties below are optional
 * .optionConfigurations(List.of(OptionConfigurationProperty.builder()
 * .optionName("optionName")
 * // the properties below are optional
 * .dbSecurityGroupMemberships(List.of("dbSecurityGroupMemberships"))
 * .optionSettings(List.of(OptionSettingProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .optionVersion("optionVersion")
 * .port(123)
 * .vpcSecurityGroupMemberships(List.of("vpcSecurityGroupMemberships"))
 * .build()))
 * .optionGroupName("optionGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html)
 */
public open class CfnOptionGroup(
  cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOptionGroupProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnOptionGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnOptionGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOptionGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOptionGroupProps(props)
  )

  /**
   * Specifies the name of the engine that this option group should be associated with.
   */
  public open fun engineName(): String = unwrap(this).getEngineName()

  /**
   * Specifies the name of the engine that this option group should be associated with.
   */
  public open fun engineName(`value`: String) {
    unwrap(this).setEngineName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies the major version of the engine that this option group should be associated with.
   */
  public open fun majorEngineVersion(): String = unwrap(this).getMajorEngineVersion()

  /**
   * Specifies the major version of the engine that this option group should be associated with.
   */
  public open fun majorEngineVersion(`value`: String) {
    unwrap(this).setMajorEngineVersion(`value`)
  }

  /**
   * A list of all available options for an option group.
   */
  public open fun optionConfigurations(): Any? = unwrap(this).getOptionConfigurations()

  /**
   * A list of all available options for an option group.
   */
  public open fun optionConfigurations(`value`: IResolvable) {
    unwrap(this).setOptionConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of all available options for an option group.
   */
  public open fun optionConfigurations(`value`: List<Any>) {
    unwrap(this).setOptionConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of all available options for an option group.
   */
  public open fun optionConfigurations(vararg `value`: Any): Unit =
      optionConfigurations(`value`.toList())

  /**
   * The description of the option group.
   */
  public open fun optionGroupDescription(): String = unwrap(this).getOptionGroupDescription()

  /**
   * The description of the option group.
   */
  public open fun optionGroupDescription(`value`: String) {
    unwrap(this).setOptionGroupDescription(`value`)
  }

  /**
   * The name of the option group to be created.
   */
  public open fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  /**
   * The name of the option group to be created.
   */
  public open fun optionGroupName(`value`: String) {
    unwrap(this).setOptionGroupName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags to assign to the option group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags to assign to the option group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to assign to the option group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnOptionGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the name of the engine that this option group should be associated with.
     *
     * Valid Values:
     *
     * * `mariadb`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename)
     * @param engineName Specifies the name of the engine that this option group should be
     * associated with. 
     */
    public fun engineName(engineName: String)

    /**
     * Specifies the major version of the engine that this option group should be associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
     * @param majorEngineVersion Specifies the major version of the engine that this option group
     * should be associated with. 
     */
    public fun majorEngineVersion(majorEngineVersion: String)

    /**
     * A list of all available options for an option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
     * @param optionConfigurations A list of all available options for an option group. 
     */
    public fun optionConfigurations(optionConfigurations: IResolvable)

    /**
     * A list of all available options for an option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
     * @param optionConfigurations A list of all available options for an option group. 
     */
    public fun optionConfigurations(optionConfigurations: List<Any>)

    /**
     * A list of all available options for an option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
     * @param optionConfigurations A list of all available options for an option group. 
     */
    public fun optionConfigurations(vararg optionConfigurations: Any)

    /**
     * The description of the option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
     * @param optionGroupDescription The description of the option group. 
     */
    public fun optionGroupDescription(optionGroupDescription: String)

    /**
     * The name of the option group to be created.
     *
     * Constraints:
     *
     * * Must be 1 to 255 letters, numbers, or hyphens
     * * First character must be a letter
     * * Can't end with a hyphen or contain two consecutive hyphens
     *
     * Example: `myoptiongroup`
     *
     * If you don't specify a value for `OptionGroupName` property, a name is automatically created
     * for the option group.
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupname)
     * @param optionGroupName The name of the option group to be created. 
     */
    public fun optionGroupName(optionGroupName: String)

    /**
     * Tags to assign to the option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
     * @param tags Tags to assign to the option group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to assign to the option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
     * @param tags Tags to assign to the option group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnOptionGroup.Builder =
        software.amazon.awscdk.services.rds.CfnOptionGroup.Builder.create(scope, id)

    /**
     * Specifies the name of the engine that this option group should be associated with.
     *
     * Valid Values:
     *
     * * `mariadb`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename)
     * @param engineName Specifies the name of the engine that this option group should be
     * associated with. 
     */
    override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    /**
     * Specifies the major version of the engine that this option group should be associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
     * @param majorEngineVersion Specifies the major version of the engine that this option group
     * should be associated with. 
     */
    override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    /**
     * A list of all available options for an option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
     * @param optionConfigurations A list of all available options for an option group. 
     */
    override fun optionConfigurations(optionConfigurations: IResolvable) {
      cdkBuilder.optionConfigurations(optionConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of all available options for an option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
     * @param optionConfigurations A list of all available options for an option group. 
     */
    override fun optionConfigurations(optionConfigurations: List<Any>) {
      cdkBuilder.optionConfigurations(optionConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of all available options for an option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
     * @param optionConfigurations A list of all available options for an option group. 
     */
    override fun optionConfigurations(vararg optionConfigurations: Any): Unit =
        optionConfigurations(optionConfigurations.toList())

    /**
     * The description of the option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
     * @param optionGroupDescription The description of the option group. 
     */
    override fun optionGroupDescription(optionGroupDescription: String) {
      cdkBuilder.optionGroupDescription(optionGroupDescription)
    }

    /**
     * The name of the option group to be created.
     *
     * Constraints:
     *
     * * Must be 1 to 255 letters, numbers, or hyphens
     * * First character must be a letter
     * * Can't end with a hyphen or contain two consecutive hyphens
     *
     * Example: `myoptiongroup`
     *
     * If you don't specify a value for `OptionGroupName` property, a name is automatically created
     * for the option group.
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupname)
     * @param optionGroupName The name of the option group to be created. 
     */
    override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

    /**
     * Tags to assign to the option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
     * @param tags Tags to assign to the option group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to assign to the option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
     * @param tags Tags to assign to the option group. 
     */
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
        = wrapped.cdkObject as software.amazon.awscdk.services.rds.CfnOptionGroup
  }

  /**
   * The `OptionConfiguration` property type specifies an individual option, and its settings,
   * within an `AWS::RDS::OptionGroup` resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * OptionConfigurationProperty optionConfigurationProperty = OptionConfigurationProperty.builder()
   * .optionName("optionName")
   * // the properties below are optional
   * .dbSecurityGroupMemberships(List.of("dbSecurityGroupMemberships"))
   * .optionSettings(List.of(OptionSettingProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .optionVersion("optionVersion")
   * .port(123)
   * .vpcSecurityGroupMemberships(List.of("vpcSecurityGroupMemberships"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html)
   */
  public interface OptionConfigurationProperty {
    /**
     * A list of DB security groups used for this option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-dbsecuritygroupmemberships)
     */
    public fun dbSecurityGroupMemberships(): List<String> =
        unwrap(this).getDbSecurityGroupMemberships() ?: emptyList()

    /**
     * The configuration of options to include in a group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-optionname)
     */
    public fun optionName(): String

    /**
     * The option settings to include in an option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-optionsettings)
     */
    public fun optionSettings(): Any? = unwrap(this).getOptionSettings()

    /**
     * The version for the option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-optionversion)
     */
    public fun optionVersion(): String? = unwrap(this).getOptionVersion()

    /**
     * The optional port for the option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A list of VPC security group names used for this option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-vpcsecuritygroupmemberships)
     */
    public fun vpcSecurityGroupMemberships(): List<String> =
        unwrap(this).getVpcSecurityGroupMemberships() ?: emptyList()

    /**
     * A builder for [OptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dbSecurityGroupMemberships A list of DB security groups used for this option.
       */
      public fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: List<String>)

      /**
       * @param dbSecurityGroupMemberships A list of DB security groups used for this option.
       */
      public fun dbSecurityGroupMemberships(vararg dbSecurityGroupMemberships: String)

      /**
       * @param optionName The configuration of options to include in a group. 
       */
      public fun optionName(optionName: String)

      /**
       * @param optionSettings The option settings to include in an option group.
       */
      public fun optionSettings(optionSettings: IResolvable)

      /**
       * @param optionSettings The option settings to include in an option group.
       */
      public fun optionSettings(optionSettings: List<Any>)

      /**
       * @param optionSettings The option settings to include in an option group.
       */
      public fun optionSettings(vararg optionSettings: Any)

      /**
       * @param optionVersion The version for the option.
       */
      public fun optionVersion(optionVersion: String)

      /**
       * @param port The optional port for the option.
       */
      public fun port(port: Number)

      /**
       * @param vpcSecurityGroupMemberships A list of VPC security group names used for this option.
       */
      public fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: List<String>)

      /**
       * @param vpcSecurityGroupMemberships A list of VPC security group names used for this option.
       */
      public fun vpcSecurityGroupMemberships(vararg vpcSecurityGroupMemberships: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty.Builder =
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty.builder()

      /**
       * @param dbSecurityGroupMemberships A list of DB security groups used for this option.
       */
      override fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: List<String>) {
        cdkBuilder.dbSecurityGroupMemberships(dbSecurityGroupMemberships)
      }

      /**
       * @param dbSecurityGroupMemberships A list of DB security groups used for this option.
       */
      override fun dbSecurityGroupMemberships(vararg dbSecurityGroupMemberships: String): Unit =
          dbSecurityGroupMemberships(dbSecurityGroupMemberships.toList())

      /**
       * @param optionName The configuration of options to include in a group. 
       */
      override fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
      }

      /**
       * @param optionSettings The option settings to include in an option group.
       */
      override fun optionSettings(optionSettings: IResolvable) {
        cdkBuilder.optionSettings(optionSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param optionSettings The option settings to include in an option group.
       */
      override fun optionSettings(optionSettings: List<Any>) {
        cdkBuilder.optionSettings(optionSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param optionSettings The option settings to include in an option group.
       */
      override fun optionSettings(vararg optionSettings: Any): Unit =
          optionSettings(optionSettings.toList())

      /**
       * @param optionVersion The version for the option.
       */
      override fun optionVersion(optionVersion: String) {
        cdkBuilder.optionVersion(optionVersion)
      }

      /**
       * @param port The optional port for the option.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param vpcSecurityGroupMemberships A list of VPC security group names used for this option.
       */
      override fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: List<String>) {
        cdkBuilder.vpcSecurityGroupMemberships(vpcSecurityGroupMemberships)
      }

      /**
       * @param vpcSecurityGroupMemberships A list of VPC security group names used for this option.
       */
      override fun vpcSecurityGroupMemberships(vararg vpcSecurityGroupMemberships: String): Unit =
          vpcSecurityGroupMemberships(vpcSecurityGroupMemberships.toList())

      public fun build():
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        OptionConfigurationProperty {
      /**
       * A list of DB security groups used for this option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-dbsecuritygroupmemberships)
       */
      override fun dbSecurityGroupMemberships(): List<String> =
          unwrap(this).getDbSecurityGroupMemberships() ?: emptyList()

      /**
       * The configuration of options to include in a group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-optionname)
       */
      override fun optionName(): String = unwrap(this).getOptionName()

      /**
       * The option settings to include in an option group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-optionsettings)
       */
      override fun optionSettings(): Any? = unwrap(this).getOptionSettings()

      /**
       * The version for the option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-optionversion)
       */
      override fun optionVersion(): String? = unwrap(this).getOptionVersion()

      /**
       * The optional port for the option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * A list of VPC security group names used for this option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html#cfn-rds-optiongroup-optionconfiguration-vpcsecuritygroupmemberships)
       */
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
          OptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionConfigurationProperty
    }
  }

  /**
   * The `OptionSetting` property type specifies the value for an option within an `OptionSetting`
   * property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * OptionSettingProperty optionSettingProperty = OptionSettingProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionsetting.html)
   */
  public interface OptionSettingProperty {
    /**
     * The name of the option that has settings that you can set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionsetting.html#cfn-rds-optiongroup-optionsetting-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The current value of the option setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionsetting.html#cfn-rds-optiongroup-optionsetting-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [OptionSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the option that has settings that you can set.
       */
      public fun name(name: String)

      /**
       * @param value The current value of the option setting.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty.Builder =
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty.builder()

      /**
       * @param name The name of the option that has settings that you can set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The current value of the option setting.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty,
    ) : CdkObject(cdkObject),
        OptionSettingProperty {
      /**
       * The name of the option that has settings that you can set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionsetting.html#cfn-rds-optiongroup-optionsetting-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The current value of the option setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionsetting.html#cfn-rds-optiongroup-optionsetting-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty):
          OptionSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? OptionSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionSettingProperty):
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty
    }
  }
}
