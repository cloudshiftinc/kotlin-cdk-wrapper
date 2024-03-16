@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
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
public interface CfnConfigurationTemplateProps {
  /**
   * The name of the Elastic Beanstalk application to associate with this configuration template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
   */
  public fun applicationName(): String

  /**
   * An optional description for this configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of an environment whose settings you want to use to create the configuration template.
   *
   * You must specify `EnvironmentId` if you don't specify `PlatformArn` , `SolutionStackName` , or
   * `SourceConfiguration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
   */
  public fun environmentId(): String? = unwrap(this).getEnvironmentId()

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   *
   * If specified, these values override the values obtained from the solution stack or the source
   * configuration template. For a complete list of Elastic Beanstalk configuration options, see
   * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
   * the *AWS Elastic Beanstalk Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
   */
  public fun optionSettings(): Any? = unwrap(this).getOptionSettings()

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
   */
  public fun platformArn(): String? = unwrap(this).getPlatformArn()

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
   */
  public fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

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
   */
  public fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  /**
   * A builder for [CfnConfigurationTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The name of the Elastic Beanstalk application to associate with this
     * configuration template. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param description An optional description for this configuration.
     */
    public fun description(description: String)

    /**
     * @param environmentId The ID of an environment whose settings you want to use to create the
     * configuration template.
     * You must specify `EnvironmentId` if you don't specify `PlatformArn` , `SolutionStackName` ,
     * or `SourceConfiguration` .
     */
    public fun environmentId(environmentId: String)

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     * instance type.
     * If specified, these values override the values obtained from the solution stack or the source
     * configuration template. For a complete list of Elastic Beanstalk configuration options, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     */
    public fun optionSettings(optionSettings: IResolvable)

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     * instance type.
     * If specified, these values override the values obtained from the solution stack or the source
     * configuration template. For a complete list of Elastic Beanstalk configuration options, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     */
    public fun optionSettings(optionSettings: List<Any>)

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     * instance type.
     * If specified, these values override the values obtained from the solution stack or the source
     * configuration template. For a complete list of Elastic Beanstalk configuration options, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     */
    public fun optionSettings(vararg optionSettings: Any)

    /**
     * @param platformArn The Amazon Resource Name (ARN) of the custom platform.
     * For more information, see [Custom
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html) in the
     * *AWS Elastic Beanstalk Developer Guide* .
     *
     *
     * If you specify `PlatformArn` , then don't specify `SolutionStackName` .
     */
    public fun platformArn(platformArn: String)

    /**
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     * that this configuration uses.
     * For example, `64bit Amazon Linux 2013.09 running Tomcat 7 Java 7` . A solution stack
     * specifies the operating system, runtime, and application server for a configuration template. It
     * also determines the set of configuration options as well as the possible and default values. For
     * more information, see [Supported
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     *
     * You must specify `SolutionStackName` if you don't specify `PlatformArn` , `EnvironmentId` ,
     * or `SourceConfiguration` .
     *
     * Use the
     * [`ListAvailableSolutionStacks`](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html)
     * API to obtain a list of available solution stacks.
     */
    public fun solutionStackName(solutionStackName: String)

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     * If specified, Elastic Beanstalk uses the configuration values from the specified
     * configuration template to create a new configuration.
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
    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     * If specified, Elastic Beanstalk uses the configuration values from the specified
     * configuration template to create a new configuration.
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
    public
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty)

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     * If specified, Elastic Beanstalk uses the configuration values from the specified
     * configuration template to create a new configuration.
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c68c5258b737ceeec172522c1c98d600aba99dcc18cc631de89bc374d504eea")
    public
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.builder()

    /**
     * @param applicationName The name of the Elastic Beanstalk application to associate with this
     * configuration template. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param description An optional description for this configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param environmentId The ID of an environment whose settings you want to use to create the
     * configuration template.
     * You must specify `EnvironmentId` if you don't specify `PlatformArn` , `SolutionStackName` ,
     * or `SourceConfiguration` .
     */
    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     * instance type.
     * If specified, these values override the values obtained from the solution stack or the source
     * configuration template. For a complete list of Elastic Beanstalk configuration options, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     */
    override fun optionSettings(optionSettings: IResolvable) {
      cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
    }

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     * instance type.
     * If specified, these values override the values obtained from the solution stack or the source
     * configuration template. For a complete list of Elastic Beanstalk configuration options, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     */
    override fun optionSettings(optionSettings: List<Any>) {
      cdkBuilder.optionSettings(optionSettings)
    }

    /**
     * @param optionSettings Option values for the Elastic Beanstalk configuration, such as the
     * instance type.
     * If specified, these values override the values obtained from the solution stack or the source
     * configuration template. For a complete list of Elastic Beanstalk configuration options, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     */
    override fun optionSettings(vararg optionSettings: Any): Unit =
        optionSettings(optionSettings.toList())

    /**
     * @param platformArn The Amazon Resource Name (ARN) of the custom platform.
     * For more information, see [Custom
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html) in the
     * *AWS Elastic Beanstalk Developer Guide* .
     *
     *
     * If you specify `PlatformArn` , then don't specify `SolutionStackName` .
     */
    override fun platformArn(platformArn: String) {
      cdkBuilder.platformArn(platformArn)
    }

    /**
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     * that this configuration uses.
     * For example, `64bit Amazon Linux 2013.09 running Tomcat 7 Java 7` . A solution stack
     * specifies the operating system, runtime, and application server for a configuration template. It
     * also determines the set of configuration options as well as the possible and default values. For
     * more information, see [Supported
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     *
     * You must specify `SolutionStackName` if you don't specify `PlatformArn` , `EnvironmentId` ,
     * or `SourceConfiguration` .
     *
     * Use the
     * [`ListAvailableSolutionStacks`](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html)
     * API to obtain a list of available solution stacks.
     */
    override fun solutionStackName(solutionStackName: String) {
      cdkBuilder.solutionStackName(solutionStackName)
    }

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     * If specified, Elastic Beanstalk uses the configuration values from the specified
     * configuration template to create a new configuration.
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
    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     * If specified, Elastic Beanstalk uses the configuration values from the specified
     * configuration template to create a new configuration.
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
    override
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(CfnConfigurationTemplate.SourceConfigurationProperty::unwrap))
    }

    /**
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on.
     * If specified, Elastic Beanstalk uses the configuration values from the specified
     * configuration template to create a new configuration.
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c68c5258b737ceeec172522c1c98d600aba99dcc18cc631de89bc374d504eea")
    override
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        sourceConfiguration(CfnConfigurationTemplate.SourceConfigurationProperty(sourceConfiguration))

    public fun build():
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps,
  ) : CdkObject(cdkObject), CfnConfigurationTemplateProps {
    /**
     * The name of the Elastic Beanstalk application to associate with this configuration template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * An optional description for this configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of an environment whose settings you want to use to create the configuration template.
     *
     * You must specify `EnvironmentId` if you don't specify `PlatformArn` , `SolutionStackName` ,
     * or `SourceConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
     */
    override fun environmentId(): String? = unwrap(this).getEnvironmentId()

    /**
     * Option values for the Elastic Beanstalk configuration, such as the instance type.
     *
     * If specified, these values override the values obtained from the solution stack or the source
     * configuration template. For a complete list of Elastic Beanstalk configuration options, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
     */
    override fun optionSettings(): Any? = unwrap(this).getOptionSettings()

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
     */
    override fun platformArn(): String? = unwrap(this).getPlatformArn()

    /**
     * The name of an Elastic Beanstalk solution stack (platform version) that this configuration
     * uses.
     *
     * For example, `64bit Amazon Linux 2013.09 running Tomcat 7 Java 7` . A solution stack
     * specifies the operating system, runtime, and application server for a configuration template. It
     * also determines the set of configuration options as well as the possible and default values. For
     * more information, see [Supported
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html) in
     * the *AWS Elastic Beanstalk Developer Guide* .
     *
     * You must specify `SolutionStackName` if you don't specify `PlatformArn` , `EnvironmentId` ,
     * or `SourceConfiguration` .
     *
     * Use the
     * [`ListAvailableSolutionStacks`](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html)
     * API to obtain a list of available solution stacks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname)
     */
    override fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

    /**
     * An Elastic Beanstalk configuration template to base this one on.
     *
     * If specified, Elastic Beanstalk uses the configuration values from the specified
     * configuration template to create a new configuration.
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
     */
    override fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps):
        CfnConfigurationTemplateProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnConfigurationTemplateProps

    internal fun unwrap(wrapped: CfnConfigurationTemplateProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps
  }
}
