@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps

/**
 * Properties for defining a `CfnConfigurationTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * CfnConfigurationTemplateProps cfnConfigurationTemplateProps =
 * CfnConfigurationTemplateProps.builder()
 * .applicationName("applicationName")
 * // the properties below are optional
 * .description("description")
 * .environmentId("environmentId")
 * .optionSettings(List.of(ConfigurationOptionSettingProperty.builder()
 * .namespace("namespace")
 * .optionName("optionName")
 * // the properties below are optional
 * .resourceName("resourceName")
 * .value("value")
 * .build()))
 * .platformArn("platformArn")
 * .solutionStackName("solutionStackName")
 * .sourceConfiguration(SourceConfigurationProperty.builder()
 * .applicationName("applicationName")
 * .templateName("templateName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html)
 */
@CdkDslMarker
public class CfnConfigurationTemplatePropsDsl {
    private val cdkBuilder: CfnConfigurationTemplateProps.Builder =
        CfnConfigurationTemplateProps.builder()

    private val _optionSettings: MutableList<Any> = mutableListOf()

    /**
     * @param applicationName The name of the Elastic Beanstalk application to associate with this
     *   configuration template.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /** @param description An optional description for this configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param environmentId The ID of an environment whose settings you want to use to create the
     *   configuration template. You must specify `EnvironmentId` if you don't specify `PlatformArn`
     *   , `SolutionStackName` , or `SourceConfiguration` .
     */
    public fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
    }

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     *   instance type. If specified, these values override the values obtained from the solution
     *   stack or the source configuration template. For a complete list of Elastic Beanstalk
     *   configuration options, see
     *   [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html)
     *   in the *AWS Elastic Beanstalk Developer Guide* .
     */
    public fun optionSettings(vararg optionSettings: Any) {
        _optionSettings.addAll(listOf(*optionSettings))
    }

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     *   instance type. If specified, these values override the values obtained from the solution
     *   stack or the source configuration template. For a complete list of Elastic Beanstalk
     *   configuration options, see
     *   [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html)
     *   in the *AWS Elastic Beanstalk Developer Guide* .
     */
    public fun optionSettings(optionSettings: Collection<Any>) {
        _optionSettings.addAll(optionSettings)
    }

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     *   instance type. If specified, these values override the values obtained from the solution
     *   stack or the source configuration template. For a complete list of Elastic Beanstalk
     *   configuration options, see
     *   [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html)
     *   in the *AWS Elastic Beanstalk Developer Guide* .
     */
    public fun optionSettings(optionSettings: IResolvable) {
        cdkBuilder.optionSettings(optionSettings)
    }

    /**
     * @param platformArn The Amazon Resource Name (ARN) of the custom platform. For more
     *   information, see
     *   [Custom Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html)
     *   in the *AWS Elastic Beanstalk Developer Guide* .
     *
     * If you specify `PlatformArn` , then don't specify `SolutionStackName` .
     */
    public fun platformArn(platformArn: String) {
        cdkBuilder.platformArn(platformArn)
    }

    /**
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     *   that this configuration uses. For example, `64bit Amazon Linux 2013.09 running Tomcat 7
     *   Java 7` . A solution stack specifies the operating system, runtime, and application server
     *   for a configuration template. It also determines the set of configuration options as well
     *   as the possible and default values. For more information, see
     *   [Supported Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     *   in the *AWS Elastic Beanstalk Developer Guide* .
     *
     * You must specify `SolutionStackName` if you don't specify `PlatformArn` , `EnvironmentId` ,
     * or `SourceConfiguration` .
     *
     * Use the
     * [`ListAvailableSolutionStacks`](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html)
     * API to obtain a list of available solution stacks.
     */
    public fun solutionStackName(solutionStackName: String) {
        cdkBuilder.solutionStackName(solutionStackName)
    }

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     *   If specified, Elastic Beanstalk uses the configuration values from the specified
     *   configuration template to create a new configuration.
     *
     * Values specified in `OptionSettings` override any values obtained from the
     * `SourceConfiguration` .
     *
     * You must specify `SourceConfiguration` if you don't specify `PlatformArn` , `EnvironmentId` ,
     * or `SolutionStackName` .
     *
     * Constraint: If both solution stack name and source configuration are specified, the solution
     * stack of the source configuration template must match the specified solution stack name.
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration)
    }

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     *   If specified, Elastic Beanstalk uses the configuration values from the specified
     *   configuration template to create a new configuration.
     *
     * Values specified in `OptionSettings` override any values obtained from the
     * `SourceConfiguration` .
     *
     * You must specify `SourceConfiguration` if you don't specify `PlatformArn` , `EnvironmentId` ,
     * or `SolutionStackName` .
     *
     * Constraint: If both solution stack name and source configuration are specified, the solution
     * stack of the source configuration template must match the specified solution stack name.
     */
    public fun sourceConfiguration(
        sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty
    ) {
        cdkBuilder.sourceConfiguration(sourceConfiguration)
    }

    public fun build(): CfnConfigurationTemplateProps {
        if (_optionSettings.isNotEmpty()) cdkBuilder.optionSettings(_optionSettings)
        return cdkBuilder.build()
    }
}
