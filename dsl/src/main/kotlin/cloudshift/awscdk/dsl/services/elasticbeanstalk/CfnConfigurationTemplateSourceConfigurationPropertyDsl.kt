@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate

/**
 * Use the `SourceConfiguration` property type to specify another AWS Elastic Beanstalk
 * configuration template as the base to creating a new AWS::ElasticBeanstalk::ConfigurationTemplate
 * resource in an AWS CloudFormation template.
 *
 * An AWS Elastic Beanstalk configuration template to base a new one on. You can use it to define a
 * [AWS::ElasticBeanstalk::ConfigurationTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * SourceConfigurationProperty sourceConfigurationProperty = SourceConfigurationProperty.builder()
 * .applicationName("applicationName")
 * .templateName("templateName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html)
 */
@CdkDslMarker
public class CfnConfigurationTemplateSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnConfigurationTemplate.SourceConfigurationProperty.Builder =
      CfnConfigurationTemplate.SourceConfigurationProperty.builder()

  /**
   * @param applicationName The name of the application associated with the configuration. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param templateName The name of the configuration template. 
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun build(): CfnConfigurationTemplate.SourceConfigurationProperty = cdkBuilder.build()
}
