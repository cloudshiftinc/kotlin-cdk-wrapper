@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigurationTemplate.Builder =
      CfnConfigurationTemplate.Builder.create(scope, id)

  private val _optionSettings: MutableList<Any> = mutableListOf()

  /**
   * The name of the Elastic Beanstalk application to associate with this configuration template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
   * @param applicationName The name of the Elastic Beanstalk application to associate with this
   * configuration template. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * An optional description for this configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
   * @param description An optional description for this configuration. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ID of an environment whose settings you want to use to create the configuration template.
   *
   * You must specify `EnvironmentId` if you don't specify `PlatformArn` , `SolutionStackName` , or
   * `SourceConfiguration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
   * @param environmentId The ID of an environment whose settings you want to use to create the
   * configuration template. 
   */
  public fun environmentId(environmentId: String) {
    cdkBuilder.environmentId(environmentId)
  }

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   *
   * If specified, these values override the values obtained from the solution stack or the source
   * configuration template. For a complete list of Elastic Beanstalk configuration options, see
   * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
   * the *AWS Elastic Beanstalk Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
   * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
   * instance type. 
   */
  public fun optionSettings(vararg optionSettings: Any) {
    _optionSettings.addAll(listOf(*optionSettings))
  }

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   *
   * If specified, these values override the values obtained from the solution stack or the source
   * configuration template. For a complete list of Elastic Beanstalk configuration options, see
   * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
   * the *AWS Elastic Beanstalk Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
   * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
   * instance type. 
   */
  public fun optionSettings(optionSettings: Collection<Any>) {
    _optionSettings.addAll(optionSettings)
  }

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   *
   * If specified, these values override the values obtained from the solution stack or the source
   * configuration template. For a complete list of Elastic Beanstalk configuration options, see
   * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
   * the *AWS Elastic Beanstalk Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
   * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
   * instance type. 
   */
  public fun optionSettings(optionSettings: IResolvable) {
    cdkBuilder.optionSettings(optionSettings)
  }

  /**
   * The Amazon Resource Name (ARN) of the custom platform.
   *
   * For more information, see [Custom
   * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html) in the
   * *AWS Elastic Beanstalk Developer Guide* .
   *
   *
   * If you specify `PlatformArn` , then don't specify `SolutionStackName` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn)
   * @param platformArn The Amazon Resource Name (ARN) of the custom platform. 
   */
  public fun platformArn(platformArn: String) {
    cdkBuilder.platformArn(platformArn)
  }

  /**
   * The name of an Elastic Beanstalk solution stack (platform version) that this configuration
   * uses.
   *
   * For example, `64bit Amazon Linux 2013.09 running Tomcat 7 Java 7` . A solution stack specifies
   * the operating system, runtime, and application server for a configuration template. It also
   * determines the set of configuration options as well as the possible and default values. For more
   * information, see [Supported
   * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html) in the
   * *AWS Elastic Beanstalk Developer Guide* .
   *
   * You must specify `SolutionStackName` if you don't specify `PlatformArn` , `EnvironmentId` , or
   * `SourceConfiguration` .
   *
   * Use the
   * [`ListAvailableSolutionStacks`](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html)
   * API to obtain a list of available solution stacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname)
   * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
   * that this configuration uses. 
   */
  public fun solutionStackName(solutionStackName: String) {
    cdkBuilder.solutionStackName(solutionStackName)
  }

  /**
   * An Elastic Beanstalk configuration template to base this one on.
   *
   * If specified, Elastic Beanstalk uses the configuration values from the specified configuration
   * template to create a new configuration.
   *
   * Values specified in `OptionSettings` override any values obtained from the
   * `SourceConfiguration` .
   *
   * You must specify `SourceConfiguration` if you don't specify `PlatformArn` , `EnvironmentId` ,
   * or `SolutionStackName` .
   *
   * Constraint: If both solution stack name and source configuration are specified, the solution
   * stack of the source configuration template must match the specified solution stack name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration)
   * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
   */
  public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  /**
   * An Elastic Beanstalk configuration template to base this one on.
   *
   * If specified, Elastic Beanstalk uses the configuration values from the specified configuration
   * template to create a new configuration.
   *
   * Values specified in `OptionSettings` override any values obtained from the
   * `SourceConfiguration` .
   *
   * You must specify `SourceConfiguration` if you don't specify `PlatformArn` , `EnvironmentId` ,
   * or `SolutionStackName` .
   *
   * Constraint: If both solution stack name and source configuration are specified, the solution
   * stack of the source configuration template must match the specified solution stack name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration)
   * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
   */
  public
      fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  public fun build(): CfnConfigurationTemplate {
    if(_optionSettings.isNotEmpty()) cdkBuilder.optionSettings(_optionSettings)
    return cdkBuilder.build()
  }
}
