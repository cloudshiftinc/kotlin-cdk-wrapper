@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate

/**
 * Use the `ConfigurationOptionSetting` property type to specify an option for an AWS Elastic
 * Beanstalk configuration template when defining an AWS::ElasticBeanstalk::ConfigurationTemplate
 * resource in an AWS CloudFormation template.
 *
 * The `ConfigurationOptionSetting` property type specifies an option for an AWS Elastic Beanstalk
 * configuration template.
 *
 * The `OptionSettings` property of the
 * [AWS::ElasticBeanstalk::ConfigurationTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
 * resource contains a list of `ConfigurationOptionSetting` property types.
 *
 * For a list of possible namespaces and option values, see [Option
 * Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in the *AWS
 * Elastic Beanstalk Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * ConfigurationOptionSettingProperty configurationOptionSettingProperty =
 * ConfigurationOptionSettingProperty.builder()
 * .namespace("namespace")
 * .optionName("optionName")
 * // the properties below are optional
 * .resourceName("resourceName")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html)
 */
@CdkDslMarker
public class CfnConfigurationTemplateConfigurationOptionSettingPropertyDsl {
  private val cdkBuilder: CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder =
      CfnConfigurationTemplate.ConfigurationOptionSettingProperty.builder()

  /**
   * @param namespace A unique namespace that identifies the option's associated AWS resource. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param optionName The name of the configuration option. 
   */
  public fun optionName(optionName: String) {
    cdkBuilder.optionName(optionName)
  }

  /**
   * @param resourceName A unique resource name for the option setting.
   * Use it for a time–based scaling configuration option.
   */
  public fun resourceName(resourceName: String) {
    cdkBuilder.resourceName(resourceName)
  }

  /**
   * @param value The current value for the configuration option.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnConfigurationTemplate.ConfigurationOptionSettingProperty =
      cdkBuilder.build()
}
