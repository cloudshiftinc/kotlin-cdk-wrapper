@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specify an AWS Elastic Beanstalk configuration template by using the
 * AWS::ElasticBeanstalk::ConfigurationTemplate resource in an AWS CloudFormation template.
 *
 * The AWS::ElasticBeanstalk::ConfigurationTemplate resource is an AWS Elastic Beanstalk resource
 * type that specifies an Elastic Beanstalk configuration template, associated with a specific Elastic
 * Beanstalk application. You define application configuration settings in a configuration template.
 * You can then use the configuration template to deploy different versions of the application with the
 * same configuration settings.
 *
 *
 * The Elastic Beanstalk console and documentation often refer to configuration templates as *saved
 * configurations* . When you set configuration options in a saved configuration (configuration
 * template), Elastic Beanstalk applies them with a particular precedence as part of applying options
 * from multiple sources. For more information, see [Configuration
 * Options](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html) in the *AWS
 * Elastic Beanstalk Developer Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
 * CfnConfigurationTemplate cfnConfigurationTemplate = CfnConfigurationTemplate.Builder.create(this,
 * "MyCfnConfigurationTemplate")
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
public open class CfnConfigurationTemplate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of the Elastic Beanstalk application to associate with this configuration template.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * The name of the Elastic Beanstalk application to associate with this configuration template.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   * The name of the configuration template.
   *
   * Constraint: This name must be unique per application.
   */
  public open fun attrTemplateName(): String = unwrap(this).getAttrTemplateName()

  /**
   * An optional description for this configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description for this configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of an environment whose settings you want to use to create the configuration template.
   */
  public open fun environmentId(): String? = unwrap(this).getEnvironmentId()

  /**
   * The ID of an environment whose settings you want to use to create the configuration template.
   */
  public open fun environmentId(`value`: String) {
    unwrap(this).setEnvironmentId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   */
  public open fun optionSettings(): Any? = unwrap(this).getOptionSettings()

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   */
  public open fun optionSettings(`value`: IResolvable) {
    unwrap(this).setOptionSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   */
  public open fun optionSettings(`value`: List<Any>) {
    unwrap(this).setOptionSettings(`value`)
  }

  /**
   * Option values for the Elastic Beanstalk configuration, such as the instance type.
   */
  public open fun optionSettings(vararg `value`: Any): Unit = optionSettings(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the custom platform.
   */
  public open fun platformArn(): String? = unwrap(this).getPlatformArn()

  /**
   * The Amazon Resource Name (ARN) of the custom platform.
   */
  public open fun platformArn(`value`: String) {
    unwrap(this).setPlatformArn(`value`)
  }

  /**
   * The name of an Elastic Beanstalk solution stack (platform version) that this configuration
   * uses.
   */
  public open fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

  /**
   * The name of an Elastic Beanstalk solution stack (platform version) that this configuration
   * uses.
   */
  public open fun solutionStackName(`value`: String) {
    unwrap(this).setSolutionStackName(`value`)
  }

  /**
   * An Elastic Beanstalk configuration template to base this one on.
   */
  public open fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  /**
   * An Elastic Beanstalk configuration template to base this one on.
   */
  public open fun sourceConfiguration(`value`: IResolvable) {
    unwrap(this).setSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * An Elastic Beanstalk configuration template to base this one on.
   */
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty) {
    unwrap(this).setSourceConfiguration(`value`.let(SourceConfigurationProperty::unwrap))
  }

  /**
   * An Elastic Beanstalk configuration template to base this one on.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2dbfb3519c872cee89334a68164763593cde2fb978e49dfbacb2198a70f61e84")
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty.Builder.() -> Unit): Unit
      = sourceConfiguration(SourceConfigurationProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Elastic Beanstalk application to associate with this configuration template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
     * @param applicationName The name of the Elastic Beanstalk application to associate with this
     * configuration template. 
     */
    public fun applicationName(applicationName: String)

    /**
     * An optional description for this configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
     * @param description An optional description for this configuration. 
     */
    public fun description(description: String)

    /**
     * The ID of an environment whose settings you want to use to create the configuration template.
     *
     * You must specify `EnvironmentId` if you don't specify `PlatformArn` , `SolutionStackName` ,
     * or `SourceConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
     * @param environmentId The ID of an environment whose settings you want to use to create the
     * configuration template. 
     */
    public fun environmentId(environmentId: String)

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
    public fun optionSettings(optionSettings: IResolvable)

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
    public fun optionSettings(optionSettings: List<Any>)

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
    public fun optionSettings(vararg optionSettings: Any)

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
    public fun platformArn(platformArn: String)

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
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     * that this configuration uses. 
     */
    public fun solutionStackName(solutionStackName: String)

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
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable)

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
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
     */
    public fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty)

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
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("129bcec5738d69f094bfb48aba3e262cad19c3693cd134a8fededc23223e3f43")
    public
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.Builder.create(scope,
        id)

    /**
     * The name of the Elastic Beanstalk application to associate with this configuration template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
     * @param applicationName The name of the Elastic Beanstalk application to associate with this
     * configuration template. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * An optional description for this configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
     * @param description An optional description for this configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of an environment whose settings you want to use to create the configuration template.
     *
     * You must specify `EnvironmentId` if you don't specify `PlatformArn` , `SolutionStackName` ,
     * or `SourceConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
     * @param environmentId The ID of an environment whose settings you want to use to create the
     * configuration template. 
     */
    override fun environmentId(environmentId: String) {
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
    override fun optionSettings(optionSettings: IResolvable) {
      cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
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
    override fun optionSettings(optionSettings: List<Any>) {
      cdkBuilder.optionSettings(optionSettings)
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
    override fun optionSettings(vararg optionSettings: Any): Unit =
        optionSettings(optionSettings.toList())

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
    override fun platformArn(platformArn: String) {
      cdkBuilder.platformArn(platformArn)
    }

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
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     * that this configuration uses. 
     */
    override fun solutionStackName(solutionStackName: String) {
      cdkBuilder.solutionStackName(solutionStackName)
    }

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
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
     */
    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

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
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
     */
    override fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(SourceConfigurationProperty::unwrap))
    }

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
     * @param sourceConfiguration An Elastic Beanstalk configuration template to base this one on. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("129bcec5738d69f094bfb48aba3e262cad19c3693cd134a8fededc23223e3f43")
    override
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(SourceConfigurationProperty(sourceConfiguration))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationTemplate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate):
        CfnConfigurationTemplate = CfnConfigurationTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationTemplate):
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate =
        wrapped.cdkObject
  }

  /**
   * Use the `SourceConfiguration` property type to specify another AWS Elastic Beanstalk
   * configuration template as the base to creating a new AWS::ElasticBeanstalk::ConfigurationTemplate
   * resource in an AWS CloudFormation template.
   *
   * An AWS Elastic Beanstalk configuration template to base a new one on. You can use it to define
   * a
   * [AWS::ElasticBeanstalk::ConfigurationTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
   * SourceConfigurationProperty sourceConfigurationProperty = SourceConfigurationProperty.builder()
   * .applicationName("applicationName")
   * .templateName("templateName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html)
   */
  public interface SourceConfigurationProperty {
    /**
     * The name of the application associated with the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname)
     */
    public fun applicationName(): String

    /**
     * The name of the configuration template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename)
     */
    public fun templateName(): String

    /**
     * A builder for [SourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationName The name of the application associated with the configuration. 
       */
      public fun applicationName(applicationName: String)

      /**
       * @param templateName The name of the configuration template. 
       */
      public fun templateName(templateName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.builder()

      /**
       * @param applicationName The name of the application associated with the configuration. 
       */
      override fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
      }

      /**
       * @param templateName The name of the configuration template. 
       */
      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty,
    ) : CdkObject(cdkObject), SourceConfigurationProperty {
      /**
       * The name of the application associated with the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname)
       */
      override fun applicationName(): String = unwrap(this).getApplicationName()

      /**
       * The name of the configuration template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename)
       */
      override fun templateName(): String = unwrap(this).getTemplateName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty):
          SourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          SourceConfigurationProperty

      internal fun unwrap(wrapped: SourceConfigurationProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty
    }
  }

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
   * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
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
  public interface ConfigurationOptionSettingProperty {
    /**
     * A unique namespace that identifies the option's associated AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace)
     */
    public fun namespace(): String

    /**
     * The name of the configuration option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname)
     */
    public fun optionName(): String

    /**
     * A unique resource name for the option setting.
     *
     * Use it for a time–based scaling configuration option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename)
     */
    public fun resourceName(): String? = unwrap(this).getResourceName()

    /**
     * The current value for the configuration option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ConfigurationOptionSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param namespace A unique namespace that identifies the option's associated AWS resource. 
       */
      public fun namespace(namespace: String)

      /**
       * @param optionName The name of the configuration option. 
       */
      public fun optionName(optionName: String)

      /**
       * @param resourceName A unique resource name for the option setting.
       * Use it for a time–based scaling configuration option.
       */
      public fun resourceName(resourceName: String)

      /**
       * @param value The current value for the configuration option.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.builder()

      /**
       * @param namespace A unique namespace that identifies the option's associated AWS resource. 
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param optionName The name of the configuration option. 
       */
      override fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
      }

      /**
       * @param resourceName A unique resource name for the option setting.
       * Use it for a time–based scaling configuration option.
       */
      override fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
      }

      /**
       * @param value The current value for the configuration option.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty,
    ) : CdkObject(cdkObject), ConfigurationOptionSettingProperty {
      /**
       * A unique namespace that identifies the option's associated AWS resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()

      /**
       * The name of the configuration option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname)
       */
      override fun optionName(): String = unwrap(this).getOptionName()

      /**
       * A unique resource name for the option setting.
       *
       * Use it for a time–based scaling configuration option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename)
       */
      override fun resourceName(): String? = unwrap(this).getResourceName()

      /**
       * The current value for the configuration option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfigurationOptionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty):
          ConfigurationOptionSettingProperty = CdkObjectWrappers.wrap(cdkObject) as
          ConfigurationOptionSettingProperty

      internal fun unwrap(wrapped: ConfigurationOptionSettingProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty
    }
  }
}
