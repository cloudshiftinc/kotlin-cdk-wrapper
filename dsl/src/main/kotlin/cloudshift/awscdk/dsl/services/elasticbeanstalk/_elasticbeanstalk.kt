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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps
import software.constructs.Construct

public object elasticbeanstalk {
    /**
     * Specify an AWS Elastic Beanstalk application by using the AWS::ElasticBeanstalk::Application
     * resource in an AWS CloudFormation template.
     *
     * The AWS::ElasticBeanstalk::Application resource is an AWS Elastic Beanstalk Beanstalk
     * resource type that specifies an Elastic Beanstalk application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .applicationName("applicationName")
     * .description("description")
     * .resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty.builder()
     * .serviceRole("serviceRole")
     * .versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty.builder()
     * .maxAgeRule(MaxAgeRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxAgeInDays(123)
     * .build())
     * .maxCountRule(MaxCountRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxCount(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `ApplicationResourceLifecycleConfig` property type to specify lifecycle settings for
     * resources that belong to an AWS Elastic Beanstalk application when defining an
     * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
     *
     * The resource lifecycle configuration for an application. Defines lifecycle settings for
     * resources that belong to the application, and the service role that Elastic Beanstalk assumes
     * in order to apply lifecycle settings. The version lifecycle configuration defines lifecycle
     * settings for application versions.
     *
     * `ApplicationResourceLifecycleConfig` is a property of the
     * [AWS::ElasticBeanstalk::Application](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * ApplicationResourceLifecycleConfigProperty applicationResourceLifecycleConfigProperty =
     * ApplicationResourceLifecycleConfigProperty.builder()
     * .serviceRole("serviceRole")
     * .versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty.builder()
     * .maxAgeRule(MaxAgeRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxAgeInDays(123)
     * .build())
     * .maxCountRule(MaxCountRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxCount(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html)
     */
    public inline fun cfnApplicationApplicationResourceLifecycleConfigProperty(
        block: CfnApplicationApplicationResourceLifecycleConfigPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationResourceLifecycleConfigProperty {
        val builder = CfnApplicationApplicationResourceLifecycleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `ApplicationVersionLifecycleConfig` property type to specify application version
     * lifecycle settings for an AWS Elastic Beanstalk application when defining an
     * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
     *
     * The application version lifecycle settings for an application. Defines the rules that Elastic
     * Beanstalk applies to an application's versions in order to avoid hitting the per-region limit
     * for application versions.
     *
     * When Elastic Beanstalk deletes an application version from its database, you can no longer
     * deploy that version to an environment. The source bundle remains in S3 unless you configure
     * the rule to delete it.
     *
     * `ApplicationVersionLifecycleConfig` is a property of the
     * [ApplicationResourceLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * ApplicationVersionLifecycleConfigProperty applicationVersionLifecycleConfigProperty =
     * ApplicationVersionLifecycleConfigProperty.builder()
     * .maxAgeRule(MaxAgeRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxAgeInDays(123)
     * .build())
     * .maxCountRule(MaxCountRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxCount(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
     */
    public inline fun cfnApplicationApplicationVersionLifecycleConfigProperty(
        block: CfnApplicationApplicationVersionLifecycleConfigPropertyDsl.() -> Unit = {}
    ): CfnApplication.ApplicationVersionLifecycleConfigProperty {
        val builder = CfnApplicationApplicationVersionLifecycleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `MaxAgeRule` property type to specify a max age rule to restrict the length of time
     * that application versions are retained for an AWS Elastic Beanstalk application when defining
     * an AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
     *
     * A lifecycle rule that deletes application versions after the specified number of days.
     *
     * `MaxAgeRule` is a property of the
     * [ApplicationVersionLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * MaxAgeRuleProperty maxAgeRuleProperty = MaxAgeRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxAgeInDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html)
     */
    public inline fun cfnApplicationMaxAgeRuleProperty(
        block: CfnApplicationMaxAgeRulePropertyDsl.() -> Unit = {}
    ): CfnApplication.MaxAgeRuleProperty {
        val builder = CfnApplicationMaxAgeRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `MaxAgeRule` property type to specify a max count rule to restrict the number of
     * application versions that are retained for an AWS Elastic Beanstalk application when defining
     * an AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
     *
     * A lifecycle rule that deletes the oldest application version when the maximum count is
     * exceeded.
     *
     * `MaxCountRule` is a property of the
     * [ApplicationVersionLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * MaxCountRuleProperty maxCountRuleProperty = MaxCountRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html)
     */
    public inline fun cfnApplicationMaxCountRuleProperty(
        block: CfnApplicationMaxCountRulePropertyDsl.() -> Unit = {}
    ): CfnApplication.MaxCountRuleProperty {
        val builder = CfnApplicationMaxCountRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .applicationName("applicationName")
     * .description("description")
     * .resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty.builder()
     * .serviceRole("serviceRole")
     * .versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty.builder()
     * .maxAgeRule(MaxAgeRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxAgeInDays(123)
     * .build())
     * .maxCountRule(MaxCountRuleProperty.builder()
     * .deleteSourceFromS3(false)
     * .enabled(false)
     * .maxCount(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify an AWS Elastic Beanstalk application version by using the
     * AWS::ElasticBeanstalk::ApplicationVersion resource in an AWS CloudFormation template.
     *
     * The AWS::ElasticBeanstalk::ApplicationVersion resource is an AWS Elastic Beanstalk resource
     * type that specifies an application version, an iteration of deployable code, for an Elastic
     * Beanstalk application.
     *
     * After you create an application version with a specified Amazon S3 bucket and key location,
     * you can't change that Amazon S3 location. If you change the Amazon S3 location, an attempt to
     * launch an environment from the application version will fail.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * CfnApplicationVersion cfnApplicationVersion = CfnApplicationVersion.Builder.create(this,
     * "MyCfnApplicationVersion")
     * .applicationName("applicationName")
     * .sourceBundle(SourceBundleProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html)
     */
    public inline fun cfnApplicationVersion(
        scope: Construct,
        id: String,
        block: CfnApplicationVersionDsl.() -> Unit = {},
    ): CfnApplicationVersion {
        val builder = CfnApplicationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * CfnApplicationVersionProps cfnApplicationVersionProps = CfnApplicationVersionProps.builder()
     * .applicationName("applicationName")
     * .sourceBundle(SourceBundleProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html)
     */
    public inline fun cfnApplicationVersionProps(
        block: CfnApplicationVersionPropsDsl.() -> Unit = {}
    ): CfnApplicationVersionProps {
        val builder = CfnApplicationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `SourceBundle` property type to specify the Amazon S3 location of the source bundle
     * for an AWS Elastic Beanstalk application version when defining an
     * AWS::ElasticBeanstalk::ApplicationVersion resource in an AWS CloudFormation template.
     *
     * The `SourceBundle` property is an embedded property of the
     * [AWS::ElasticBeanstalk::ApplicationVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html)
     * resource. It specifies the Amazon S3 location of the source bundle for an AWS Elastic
     * Beanstalk application version.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * SourceBundleProperty sourceBundleProperty = SourceBundleProperty.builder()
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-applicationversion-sourcebundle.html)
     */
    public inline fun cfnApplicationVersionSourceBundleProperty(
        block: CfnApplicationVersionSourceBundlePropertyDsl.() -> Unit = {}
    ): CfnApplicationVersion.SourceBundleProperty {
        val builder = CfnApplicationVersionSourceBundlePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify an AWS Elastic Beanstalk configuration template by using the
     * AWS::ElasticBeanstalk::ConfigurationTemplate resource in an AWS CloudFormation template.
     *
     * The AWS::ElasticBeanstalk::ConfigurationTemplate resource is an AWS Elastic Beanstalk
     * resource type that specifies an Elastic Beanstalk configuration template, associated with a
     * specific Elastic Beanstalk application. You define application configuration settings in a
     * configuration template. You can then use the configuration template to deploy different
     * versions of the application with the same configuration settings.
     *
     * The Elastic Beanstalk console and documentation often refer to configuration templates as
     * *saved configurations* . When you set configuration options in a saved configuration
     * (configuration template), Elastic Beanstalk applies them with a particular precedence as part
     * of applying options from multiple sources. For more information, see
     * [Configuration Options](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html)
     * in the *AWS Elastic Beanstalk Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * CfnConfigurationTemplate cfnConfigurationTemplate =
     * CfnConfigurationTemplate.Builder.create(this, "MyCfnConfigurationTemplate")
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
    public inline fun cfnConfigurationTemplate(
        scope: Construct,
        id: String,
        block: CfnConfigurationTemplateDsl.() -> Unit = {},
    ): CfnConfigurationTemplate {
        val builder = CfnConfigurationTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `ConfigurationOptionSetting` property type to specify an option for an AWS Elastic
     * Beanstalk configuration template when defining an
     * AWS::ElasticBeanstalk::ConfigurationTemplate resource in an AWS CloudFormation template.
     *
     * The `ConfigurationOptionSetting` property type specifies an option for an AWS Elastic
     * Beanstalk configuration template.
     *
     * The `OptionSettings` property of the
     * [AWS::ElasticBeanstalk::ConfigurationTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * resource contains a list of `ConfigurationOptionSetting` property types.
     *
     * For a list of possible namespaces and option values, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html)
     * in the *AWS Elastic Beanstalk Developer Guide* .
     *
     * Example:
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
    public inline fun cfnConfigurationTemplateConfigurationOptionSettingProperty(
        block: CfnConfigurationTemplateConfigurationOptionSettingPropertyDsl.() -> Unit = {}
    ): CfnConfigurationTemplate.ConfigurationOptionSettingProperty {
        val builder = CfnConfigurationTemplateConfigurationOptionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnConfigurationTemplateProps(
        block: CfnConfigurationTemplatePropsDsl.() -> Unit = {}
    ): CfnConfigurationTemplateProps {
        val builder = CfnConfigurationTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `SourceConfiguration` property type to specify another AWS Elastic Beanstalk
     * configuration template as the base to creating a new
     * AWS::ElasticBeanstalk::ConfigurationTemplate resource in an AWS CloudFormation template.
     *
     * An AWS Elastic Beanstalk configuration template to base a new one on. You can use it to
     * define a
     * [AWS::ElasticBeanstalk::ConfigurationTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * resource.
     *
     * Example:
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
    public inline fun cfnConfigurationTemplateSourceConfigurationProperty(
        block: CfnConfigurationTemplateSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnConfigurationTemplate.SourceConfigurationProperty {
        val builder = CfnConfigurationTemplateSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify an AWS Elastic Beanstalk environment by using the AWS::ElasticBeanstalk::Environment
     * resource in an AWS CloudFormation template.
     *
     * The AWS::ElasticBeanstalk::Environment resource is an AWS Elastic Beanstalk resource type
     * that specifies an Elastic Beanstalk environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
     * .applicationName("applicationName")
     * // the properties below are optional
     * .cnamePrefix("cnamePrefix")
     * .description("description")
     * .environmentName("environmentName")
     * .operationsRole("operationsRole")
     * .optionSettings(List.of(OptionSettingProperty.builder()
     * .namespace("namespace")
     * .optionName("optionName")
     * // the properties below are optional
     * .resourceName("resourceName")
     * .value("value")
     * .build()))
     * .platformArn("platformArn")
     * .solutionStackName("solutionStackName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateName("templateName")
     * .tier(TierProperty.builder()
     * .name("name")
     * .type("type")
     * .version("version")
     * .build())
     * .versionLabel("versionLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html)
     */
    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `OptionSetting` property type to specify an option for an AWS Elastic Beanstalk
     * environment when defining an AWS::ElasticBeanstalk::Environment resource in an AWS
     * CloudFormation template.
     *
     * The `OptionSetting` property type specifies an option for an AWS Elastic Beanstalk
     * environment.
     *
     * The `OptionSettings` property of the
     * [AWS::ElasticBeanstalk::Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html)
     * resource contains a list of `OptionSetting` property types.
     *
     * For a list of possible namespaces and option values, see
     * [Option Values](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html)
     * in the *AWS Elastic Beanstalk Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * OptionSettingProperty optionSettingProperty = OptionSettingProperty.builder()
     * .namespace("namespace")
     * .optionName("optionName")
     * // the properties below are optional
     * .resourceName("resourceName")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html)
     */
    public inline fun cfnEnvironmentOptionSettingProperty(
        block: CfnEnvironmentOptionSettingPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.OptionSettingProperty {
        val builder = CfnEnvironmentOptionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
     * .applicationName("applicationName")
     * // the properties below are optional
     * .cnamePrefix("cnamePrefix")
     * .description("description")
     * .environmentName("environmentName")
     * .operationsRole("operationsRole")
     * .optionSettings(List.of(OptionSettingProperty.builder()
     * .namespace("namespace")
     * .optionName("optionName")
     * // the properties below are optional
     * .resourceName("resourceName")
     * .value("value")
     * .build()))
     * .platformArn("platformArn")
     * .solutionStackName("solutionStackName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateName("templateName")
     * .tier(TierProperty.builder()
     * .name("name")
     * .type("type")
     * .version("version")
     * .build())
     * .versionLabel("versionLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html)
     */
    public inline fun cfnEnvironmentProps(
        block: CfnEnvironmentPropsDsl.() -> Unit = {}
    ): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `Tier` property type to specify the environment tier for an AWS Elastic Beanstalk
     * environment when defining an AWS::ElasticBeanstalk::Environment resource in an AWS
     * CloudFormation template.
     *
     * Describes the environment tier for an
     * [AWS::ElasticBeanstalk::Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html)
     * resource. For more information, see
     * [Environment Tiers](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features-managing-env-tiers.html)
     * in the *AWS Elastic Beanstalk Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticbeanstalk.*;
     * TierProperty tierProperty = TierProperty.builder()
     * .name("name")
     * .type("type")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html)
     */
    public inline fun cfnEnvironmentTierProperty(
        block: CfnEnvironmentTierPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.TierProperty {
        val builder = CfnEnvironmentTierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
