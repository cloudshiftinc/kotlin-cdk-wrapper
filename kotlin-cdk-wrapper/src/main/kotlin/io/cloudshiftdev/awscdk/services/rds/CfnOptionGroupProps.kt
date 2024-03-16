@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnOptionGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnOptionGroupProps cfnOptionGroupProps = CfnOptionGroupProps.builder()
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
public interface CfnOptionGroupProps {
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
   */
  public fun engineName(): String

  /**
   * Specifies the major version of the engine that this option group should be associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
   */
  public fun majorEngineVersion(): String

  /**
   * A list of options and the settings for each option.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
   */
  public fun optionConfigurations(): Any? = unwrap(this).getOptionConfigurations()

  /**
   * The description of the option group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
   */
  public fun optionGroupDescription(): String

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
   */
  public fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  /**
   * An optional array of key-value pairs to apply to this option group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnOptionGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param engineName Specifies the name of the engine that this option group should be
     * associated with. 
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
     */
    public fun engineName(engineName: String)

    /**
     * @param majorEngineVersion Specifies the major version of the engine that this option group
     * should be associated with. 
     */
    public fun majorEngineVersion(majorEngineVersion: String)

    /**
     * @param optionConfigurations A list of options and the settings for each option.
     */
    public fun optionConfigurations(optionConfigurations: IResolvable)

    /**
     * @param optionConfigurations A list of options and the settings for each option.
     */
    public fun optionConfigurations(optionConfigurations: List<Any>)

    /**
     * @param optionConfigurations A list of options and the settings for each option.
     */
    public fun optionConfigurations(vararg optionConfigurations: Any)

    /**
     * @param optionGroupDescription The description of the option group. 
     */
    public fun optionGroupDescription(optionGroupDescription: String)

    /**
     * @param optionGroupName The name of the option group to be created.
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
     */
    public fun optionGroupName(optionGroupName: String)

    /**
     * @param tags An optional array of key-value pairs to apply to this option group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional array of key-value pairs to apply to this option group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnOptionGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnOptionGroupProps.builder()

    /**
     * @param engineName Specifies the name of the engine that this option group should be
     * associated with. 
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
     */
    override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    /**
     * @param majorEngineVersion Specifies the major version of the engine that this option group
     * should be associated with. 
     */
    override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    /**
     * @param optionConfigurations A list of options and the settings for each option.
     */
    override fun optionConfigurations(optionConfigurations: IResolvable) {
      cdkBuilder.optionConfigurations(optionConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param optionConfigurations A list of options and the settings for each option.
     */
    override fun optionConfigurations(optionConfigurations: List<Any>) {
      cdkBuilder.optionConfigurations(optionConfigurations)
    }

    /**
     * @param optionConfigurations A list of options and the settings for each option.
     */
    override fun optionConfigurations(vararg optionConfigurations: Any): Unit =
        optionConfigurations(optionConfigurations.toList())

    /**
     * @param optionGroupDescription The description of the option group. 
     */
    override fun optionGroupDescription(optionGroupDescription: String) {
      cdkBuilder.optionGroupDescription(optionGroupDescription)
    }

    /**
     * @param optionGroupName The name of the option group to be created.
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
     */
    override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this option group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this option group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnOptionGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroupProps,
  ) : CdkObject(cdkObject), CfnOptionGroupProps {
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
     */
    override fun engineName(): String = unwrap(this).getEngineName()

    /**
     * Specifies the major version of the engine that this option group should be associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
     */
    override fun majorEngineVersion(): String = unwrap(this).getMajorEngineVersion()

    /**
     * A list of options and the settings for each option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
     */
    override fun optionConfigurations(): Any? = unwrap(this).getOptionConfigurations()

    /**
     * The description of the option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
     */
    override fun optionGroupDescription(): String = unwrap(this).getOptionGroupDescription()

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
     */
    override fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

    /**
     * An optional array of key-value pairs to apply to this option group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOptionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroupProps):
        CfnOptionGroupProps = CdkObjectWrappers.wrap(cdkObject) as CfnOptionGroupProps

    internal fun unwrap(wrapped: CfnOptionGroupProps):
        software.amazon.awscdk.services.rds.CfnOptionGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnOptionGroupProps
  }
}
