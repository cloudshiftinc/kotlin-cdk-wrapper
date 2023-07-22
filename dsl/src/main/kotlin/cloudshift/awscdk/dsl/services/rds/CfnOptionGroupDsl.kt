@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnOptionGroup
import software.constructs.Construct

/**
 * The `AWS::RDS::OptionGroup` resource creates or updates an option group, to enable and configure
 * features that are specific to a particular DB engine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
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
@CdkDslMarker
public class CfnOptionGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOptionGroup.Builder = CfnOptionGroup.Builder.create(scope, id)

  private val _optionConfigurations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
   * @param engineName Specifies the name of the engine that this option group should be associated
   * with. 
   */
  public fun engineName(engineName: String) {
    cdkBuilder.engineName(engineName)
  }

  /**
   * Specifies the major version of the engine that this option group should be associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
   * @param majorEngineVersion Specifies the major version of the engine that this option group
   * should be associated with. 
   */
  public fun majorEngineVersion(majorEngineVersion: String) {
    cdkBuilder.majorEngineVersion(majorEngineVersion)
  }

  /**
   * A list of options and the settings for each option.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
   * @param optionConfigurations A list of options and the settings for each option. 
   */
  public fun optionConfigurations(vararg optionConfigurations: Any) {
    _optionConfigurations.addAll(listOf(*optionConfigurations))
  }

  /**
   * A list of options and the settings for each option.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
   * @param optionConfigurations A list of options and the settings for each option. 
   */
  public fun optionConfigurations(optionConfigurations: Collection<Any>) {
    _optionConfigurations.addAll(optionConfigurations)
  }

  /**
   * A list of options and the settings for each option.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
   * @param optionConfigurations A list of options and the settings for each option. 
   */
  public fun optionConfigurations(optionConfigurations: IResolvable) {
    cdkBuilder.optionConfigurations(optionConfigurations)
  }

  /**
   * The description of the option group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
   * @param optionGroupDescription The description of the option group. 
   */
  public fun optionGroupDescription(optionGroupDescription: String) {
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
  public fun optionGroupName(optionGroupName: String) {
    cdkBuilder.optionGroupName(optionGroupName)
  }

  /**
   * An optional array of key-value pairs to apply to this option group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
   * @param tags An optional array of key-value pairs to apply to this option group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An optional array of key-value pairs to apply to this option group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
   * @param tags An optional array of key-value pairs to apply to this option group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnOptionGroup {
    if(_optionConfigurations.isNotEmpty()) cdkBuilder.optionConfigurations(_optionConfigurations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
