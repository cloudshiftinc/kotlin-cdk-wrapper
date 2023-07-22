@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnOptionGroup

/**
 * The `OptionConfiguration` property type specifies an individual option, and its settings, within
 * an `AWS::RDS::OptionGroup` resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
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
@CdkDslMarker
public class CfnOptionGroupOptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnOptionGroup.OptionConfigurationProperty.Builder =
      CfnOptionGroup.OptionConfigurationProperty.builder()

  private val _dbSecurityGroupMemberships: MutableList<String> = mutableListOf()

  private val _optionSettings: MutableList<Any> = mutableListOf()

  private val _vpcSecurityGroupMemberships: MutableList<String> = mutableListOf()

  /**
   * @param dbSecurityGroupMemberships A list of DBSecurityGroupMembership name strings used for
   * this option.
   */
  public fun dbSecurityGroupMemberships(vararg dbSecurityGroupMemberships: String) {
    _dbSecurityGroupMemberships.addAll(listOf(*dbSecurityGroupMemberships))
  }

  /**
   * @param dbSecurityGroupMemberships A list of DBSecurityGroupMembership name strings used for
   * this option.
   */
  public fun dbSecurityGroupMemberships(dbSecurityGroupMemberships: Collection<String>) {
    _dbSecurityGroupMemberships.addAll(dbSecurityGroupMemberships)
  }

  /**
   * @param optionName The configuration of options to include in a group. 
   */
  public fun optionName(optionName: String) {
    cdkBuilder.optionName(optionName)
  }

  /**
   * @param optionSettings The option settings to include in an option group.
   */
  public fun optionSettings(vararg optionSettings: Any) {
    _optionSettings.addAll(listOf(*optionSettings))
  }

  /**
   * @param optionSettings The option settings to include in an option group.
   */
  public fun optionSettings(optionSettings: Collection<Any>) {
    _optionSettings.addAll(optionSettings)
  }

  /**
   * @param optionSettings The option settings to include in an option group.
   */
  public fun optionSettings(optionSettings: IResolvable) {
    cdkBuilder.optionSettings(optionSettings)
  }

  /**
   * @param optionVersion The version for the option.
   */
  public fun optionVersion(optionVersion: String) {
    cdkBuilder.optionVersion(optionVersion)
  }

  /**
   * @param port The optional port for the option.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param vpcSecurityGroupMemberships A list of VpcSecurityGroupMembership name strings used for
   * this option.
   */
  public fun vpcSecurityGroupMemberships(vararg vpcSecurityGroupMemberships: String) {
    _vpcSecurityGroupMemberships.addAll(listOf(*vpcSecurityGroupMemberships))
  }

  /**
   * @param vpcSecurityGroupMemberships A list of VpcSecurityGroupMembership name strings used for
   * this option.
   */
  public fun vpcSecurityGroupMemberships(vpcSecurityGroupMemberships: Collection<String>) {
    _vpcSecurityGroupMemberships.addAll(vpcSecurityGroupMemberships)
  }

  public fun build(): CfnOptionGroup.OptionConfigurationProperty {
    if(_dbSecurityGroupMemberships.isNotEmpty())
        cdkBuilder.dbSecurityGroupMemberships(_dbSecurityGroupMemberships)
    if(_optionSettings.isNotEmpty()) cdkBuilder.optionSettings(_optionSettings)
    if(_vpcSecurityGroupMemberships.isNotEmpty())
        cdkBuilder.vpcSecurityGroupMemberships(_vpcSecurityGroupMemberships)
    return cdkBuilder.build()
  }
}
