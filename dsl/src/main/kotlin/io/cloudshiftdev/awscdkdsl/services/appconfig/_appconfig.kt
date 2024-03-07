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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.Action
import software.amazon.awscdk.services.appconfig.ActionProps
import software.amazon.awscdk.services.appconfig.Application
import software.amazon.awscdk.services.appconfig.ApplicationProps
import software.amazon.awscdk.services.appconfig.CfnApplication
import software.amazon.awscdk.services.appconfig.CfnApplicationProps
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.amazon.awscdk.services.appconfig.CfnDeploymentProps
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.amazon.awscdk.services.appconfig.CfnEnvironmentProps
import software.amazon.awscdk.services.appconfig.CfnExtension
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociation
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps
import software.amazon.awscdk.services.appconfig.CfnExtensionProps
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
import software.amazon.awscdk.services.appconfig.ConfigurationOptions
import software.amazon.awscdk.services.appconfig.ConfigurationProps
import software.amazon.awscdk.services.appconfig.DeploymentStrategy
import software.amazon.awscdk.services.appconfig.DeploymentStrategyProps
import software.amazon.awscdk.services.appconfig.EnvironmentAttributes
import software.amazon.awscdk.services.appconfig.EnvironmentOptions
import software.amazon.awscdk.services.appconfig.EnvironmentProps
import software.amazon.awscdk.services.appconfig.ExtensionAttributes
import software.amazon.awscdk.services.appconfig.ExtensionOptions
import software.amazon.awscdk.services.appconfig.ExtensionProps
import software.amazon.awscdk.services.appconfig.HostedConfiguration
import software.amazon.awscdk.services.appconfig.HostedConfigurationOptions
import software.amazon.awscdk.services.appconfig.HostedConfigurationProps
import software.amazon.awscdk.services.appconfig.IEnvironment
import software.amazon.awscdk.services.appconfig.IExtension
import software.amazon.awscdk.services.appconfig.RolloutStrategyProps
import software.amazon.awscdk.services.appconfig.SourcedConfiguration
import software.amazon.awscdk.services.appconfig.SourcedConfigurationOptions
import software.amazon.awscdk.services.appconfig.SourcedConfigurationProps
import software.constructs.Construct

public object appconfig {
    /**
     * Defines an action for an extension.
     *
     * Example:
     * ```
     * Function fn;
     * Extension.Builder.create(this, "MyExtension")
     * .actions(List.of(
     * Action.Builder.create()
     * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
     * .eventDestination(new LambdaDestination(fn))
     * .build()))
     * .build();
     * ```
     */
    public inline fun action(block: ActionDsl.() -> Unit = {}): Action {
        val builder = ActionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the Action construct.
     *
     * Example:
     * ```
     * Function fn;
     * Extension.Builder.create(this, "MyExtension")
     * .actions(List.of(
     * Action.Builder.create()
     * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
     * .eventDestination(new LambdaDestination(fn))
     * .build()))
     * .build();
     * ```
     */
    public inline fun actionProps(block: ActionPropsDsl.() -> Unit = {}): ActionProps {
        val builder = ActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS AppConfig application.
     *
     * Example:
     * ```
     * Application app = new Application(this, "MyApp");
     * Environment env = Environment.Builder.create(this, "MyEnv")
     * .application(app)
     * .build();
     * HostedConfiguration.Builder.create(this, "MyHostedConfig")
     * .application(app)
     * .deployTo(List.of(env))
     * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-application.html)
     */
    public inline fun application(
        scope: Construct,
        id: String,
        block: ApplicationDsl.() -> Unit = {},
    ): Application {
        val builder = ApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the Application construct.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * ApplicationProps applicationProps = ApplicationProps.builder()
     * .applicationName("applicationName")
     * .description("description")
     * .build();
     * ```
     */
    public inline fun applicationProps(
        block: ApplicationPropsDsl.() -> Unit = {}
    ): ApplicationProps {
        val builder = ApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppConfig::Application` resource creates an application.
     *
     * In AWS AppConfig , an application is simply an organizational construct like a folder. This
     * organizational construct has a relationship with some unit of executable code. For example,
     * you could create an application called MyMobileApp to organize and manage configuration data
     * for a mobile application installed by your users.
     *
     * AWS AppConfig requires that you create resources and deploy a configuration in the following
     * order:
     * * Create an application
     * * Create an environment
     * * Create a configuration profile
     * * Create a deployment strategy
     * * Deploy the configuration
     *
     * For more information, see
     * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html)
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
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata to assign to the application.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-application-tags.html)
     */
    public inline fun cfnApplicationTagsProperty(
        block: CfnApplicationTagsPropertyDsl.() -> Unit = {}
    ): CfnApplication.TagsProperty {
        val builder = CfnApplicationTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppConfig::ConfigurationProfile` resource creates a configuration profile that
     * enables AWS AppConfig to access the configuration source.
     *
     * Valid configuration sources include AWS Systems Manager (SSM) documents, SSM Parameter Store
     * parameters, and Amazon S3 . A configuration profile includes the following information.
     * * The Uri location of the configuration data.
     * * The AWS Identity and Access Management ( IAM ) role that provides access to the
     *   configuration data.
     * * A validator for the configuration data. Available validators include either a JSON Schema
     *   or the Amazon Resource Name (ARN) of an AWS Lambda function.
     *
     * AWS AppConfig requires that you create resources and deploy a configuration in the following
     * order:
     * * Create an application
     * * Create an environment
     * * Create a configuration profile
     * * Create a deployment strategy
     * * Deploy the configuration
     *
     * For more information, see
     * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnConfigurationProfile cfnConfigurationProfile = CfnConfigurationProfile.Builder.create(this,
     * "MyCfnConfigurationProfile")
     * .applicationId("applicationId")
     * .locationUri("locationUri")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .retrievalRoleArn("retrievalRoleArn")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .validators(List.of(ValidatorsProperty.builder()
     * .content("content")
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html)
     */
    public inline fun cfnConfigurationProfile(
        scope: Construct,
        id: String,
        block: CfnConfigurationProfileDsl.() -> Unit = {},
    ): CfnConfigurationProfile {
        val builder = CfnConfigurationProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfigurationProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnConfigurationProfileProps cfnConfigurationProfileProps =
     * CfnConfigurationProfileProps.builder()
     * .applicationId("applicationId")
     * .locationUri("locationUri")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .retrievalRoleArn("retrievalRoleArn")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .validators(List.of(ValidatorsProperty.builder()
     * .content("content")
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html)
     */
    public inline fun cfnConfigurationProfileProps(
        block: CfnConfigurationProfilePropsDsl.() -> Unit = {}
    ): CfnConfigurationProfileProps {
        val builder = CfnConfigurationProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-tags.html)
     */
    public inline fun cfnConfigurationProfileTagsProperty(
        block: CfnConfigurationProfileTagsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationProfile.TagsProperty {
        val builder = CfnConfigurationProfileTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A validator provides a syntactic or semantic check to ensure the configuration that you want
     * to deploy functions as intended.
     *
     * To validate your application configuration data, you provide a schema or an AWS Lambda
     * function that runs against the configuration. The configuration deployment or update can only
     * proceed when the configuration data is valid.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * ValidatorsProperty validatorsProperty = ValidatorsProperty.builder()
     * .content("content")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-validators.html)
     */
    public inline fun cfnConfigurationProfileValidatorsProperty(
        block: CfnConfigurationProfileValidatorsPropertyDsl.() -> Unit = {}
    ): CfnConfigurationProfile.ValidatorsProperty {
        val builder = CfnConfigurationProfileValidatorsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppConfig::Deployment` resource starts a deployment.
     *
     * Starting a deployment in AWS AppConfig calls the `StartDeployment` API action. This call
     * includes the IDs of the AWS AppConfig application, the environment, the configuration
     * profile, and (optionally) the configuration data version to deploy. The call also includes
     * the ID of the deployment strategy to use, which determines how the configuration data is
     * deployed.
     *
     * AWS AppConfig monitors the distribution to all hosts and reports status. If a distribution
     * fails, then AWS AppConfig rolls back the configuration.
     *
     * AWS AppConfig requires that you create resources and deploy a configuration in the following
     * order:
     * * Create an application
     * * Create an environment
     * * Create a configuration profile
     * * Create a deployment strategy
     * * Deploy the configuration
     *
     * For more information, see
     * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
     * .applicationId("applicationId")
     * .configurationProfileId("configurationProfileId")
     * .configurationVersion("configurationVersion")
     * .deploymentStrategyId("deploymentStrategyId")
     * .environmentId("environmentId")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html)
     */
    public inline fun cfnDeployment(
        scope: Construct,
        id: String,
        block: CfnDeploymentDsl.() -> Unit = {},
    ): CfnDeployment {
        val builder = CfnDeploymentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeployment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
     * .applicationId("applicationId")
     * .configurationProfileId("configurationProfileId")
     * .configurationVersion("configurationVersion")
     * .deploymentStrategyId("deploymentStrategyId")
     * .environmentId("environmentId")
     * // the properties below are optional
     * .description("description")
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html)
     */
    public inline fun cfnDeploymentProps(
        block: CfnDeploymentPropsDsl.() -> Unit = {}
    ): CfnDeploymentProps {
        val builder = CfnDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppConfig::DeploymentStrategy` resource creates an AWS AppConfig deployment
     * strategy.
     *
     * A deployment strategy defines important criteria for rolling out your configuration to the
     * designated targets. A deployment strategy includes: the overall duration required, a
     * percentage of targets to receive the deployment during each interval, an algorithm that
     * defines how percentage grows, and bake time.
     *
     * AWS AppConfig requires that you create resources and deploy a configuration in the following
     * order:
     * * Create an application
     * * Create an environment
     * * Create a configuration profile
     * * Create a deployment strategy
     * * Deploy the configuration
     *
     * For more information, see
     * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnDeploymentStrategy cfnDeploymentStrategy = CfnDeploymentStrategy.Builder.create(this,
     * "MyCfnDeploymentStrategy")
     * .deploymentDurationInMinutes(123)
     * .growthFactor(123)
     * .name("name")
     * .replicateTo("replicateTo")
     * // the properties below are optional
     * .description("description")
     * .finalBakeTimeInMinutes(123)
     * .growthType("growthType")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html)
     */
    public inline fun cfnDeploymentStrategy(
        scope: Construct,
        id: String,
        block: CfnDeploymentStrategyDsl.() -> Unit = {},
    ): CfnDeploymentStrategy {
        val builder = CfnDeploymentStrategyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeploymentStrategy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnDeploymentStrategyProps cfnDeploymentStrategyProps = CfnDeploymentStrategyProps.builder()
     * .deploymentDurationInMinutes(123)
     * .growthFactor(123)
     * .name("name")
     * .replicateTo("replicateTo")
     * // the properties below are optional
     * .description("description")
     * .finalBakeTimeInMinutes(123)
     * .growthType("growthType")
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html)
     */
    public inline fun cfnDeploymentStrategyProps(
        block: CfnDeploymentStrategyPropsDsl.() -> Unit = {}
    ): CfnDeploymentStrategyProps {
        val builder = CfnDeploymentStrategyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata to assign to the deployment strategy.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deploymentstrategy-tags.html)
     */
    public inline fun cfnDeploymentStrategyTagsProperty(
        block: CfnDeploymentStrategyTagsPropertyDsl.() -> Unit = {}
    ): CfnDeploymentStrategy.TagsProperty {
        val builder = CfnDeploymentStrategyTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata to assign to the deployment strategy.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html)
     */
    public inline fun cfnDeploymentTagsProperty(
        block: CfnDeploymentTagsPropertyDsl.() -> Unit = {}
    ): CfnDeployment.TagsProperty {
        val builder = CfnDeploymentTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppConfig::Environment` resource creates an environment, which is a logical
     * deployment group of AWS AppConfig targets, such as applications in a `Beta` or `Production`
     * environment.
     *
     * You define one or more environments for each AWS AppConfig application. You can also define
     * environments for application subcomponents such as the `Web` , `Mobile` and `Back-end`
     * components for your application. You can configure Amazon CloudWatch alarms for each
     * environment. The system monitors alarms during a configuration deployment. If an alarm is
     * triggered, the system rolls back the configuration.
     *
     * AWS AppConfig requires that you create resources and deploy a configuration in the following
     * order:
     * * Create an application
     * * Create an environment
     * * Create a configuration profile
     * * Create a deployment strategy
     * * Deploy the configuration
     *
     * For more information, see
     * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
     * .applicationId("applicationId")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .monitors(List.of(MonitorsProperty.builder()
     * .alarmArn("alarmArn")
     * .alarmRoleArn("alarmRoleArn")
     * .build()))
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html)
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
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * MonitorProperty monitorProperty = MonitorProperty.builder()
     * .alarmArn("alarmArn")
     * // the properties below are optional
     * .alarmRoleArn("alarmRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitor.html)
     */
    public inline fun cfnEnvironmentMonitorProperty(
        block: CfnEnvironmentMonitorPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.MonitorProperty {
        val builder = CfnEnvironmentMonitorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * MonitorsProperty monitorsProperty = MonitorsProperty.builder()
     * .alarmArn("alarmArn")
     * .alarmRoleArn("alarmRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html)
     */
    public inline fun cfnEnvironmentMonitorsProperty(
        block: CfnEnvironmentMonitorsPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.MonitorsProperty {
        val builder = CfnEnvironmentMonitorsPropertyDsl()
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
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
     * .applicationId("applicationId")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .monitors(List.of(MonitorsProperty.builder()
     * .alarmArn("alarmArn")
     * .alarmRoleArn("alarmRoleArn")
     * .build()))
     * .tags(List.of(TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html)
     */
    public inline fun cfnEnvironmentProps(
        block: CfnEnvironmentPropsDsl.() -> Unit = {}
    ): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * TagsProperty tagsProperty = TagsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-tags.html)
     */
    public inline fun cfnEnvironmentTagsProperty(
        block: CfnEnvironmentTagsPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.TagsProperty {
        val builder = CfnEnvironmentTagsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an AWS AppConfig extension.
     *
     * An extension augments your ability to inject logic or behavior at different points during the
     * AWS AppConfig workflow of creating or deploying a configuration.
     *
     * You can create your own extensions or use the AWS authored extensions provided by AWS
     * AppConfig . For an AWS AppConfig extension that uses AWS Lambda , you must create a Lambda
     * function to perform any computation and processing defined in the extension. If you plan to
     * create custom versions of the AWS authored notification extensions, you only need to specify
     * an Amazon Resource Name (ARN) in the `Uri` field for the new extension version.
     * * For a custom EventBridge notification extension, enter the ARN of the EventBridge default
     *   events in the `Uri` field.
     * * For a custom Amazon SNS notification extension, enter the ARN of an Amazon SNS topic in the
     *   `Uri` field.
     * * For a custom Amazon SQS notification extension, enter the ARN of an Amazon SQS message
     *   queue in the `Uri` field.
     *
     * For more information about extensions, see
     * [Working with AWS AppConfig extensions](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * Object actions;
     * CfnExtension cfnExtension = CfnExtension.Builder.create(this, "MyCfnExtension")
     * .actions(actions)
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .latestVersionNumber(123)
     * .parameters(Map.of(
     * "parametersKey", ParameterProperty.builder()
     * .required(false)
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html)
     */
    public inline fun cfnExtension(
        scope: Construct,
        id: String,
        block: CfnExtensionDsl.() -> Unit = {},
    ): CfnExtension {
        val builder = CfnExtensionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An action defines the tasks that the extension performs during the AWS AppConfig workflow.
     *
     * Each action includes an action point such as `ON_CREATE_HOSTED_CONFIGURATION` ,
     * `PRE_DEPLOYMENT` , or `ON_DEPLOYMENT` . Each action also includes a name, a URI to an AWS
     * Lambda function, and an Amazon Resource Name (ARN) for an AWS Identity and Access Management
     * assume role. You specify the name, URI, and ARN for each *action point* defined in the
     * extension. You can specify the following actions for an extension:
     * * `PRE_CREATE_HOSTED_CONFIGURATION_VERSION`
     * * `PRE_START_DEPLOYMENT`
     * * `ON_DEPLOYMENT_START`
     * * `ON_DEPLOYMENT_STEP`
     * * `ON_DEPLOYMENT_BAKING`
     * * `ON_DEPLOYMENT_COMPLETE`
     * * `ON_DEPLOYMENT_ROLLED_BACK`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .name("name")
     * .uri("uri")
     * // the properties below are optional
     * .description("description")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html)
     */
    public inline fun cfnExtensionActionProperty(
        block: CfnExtensionActionPropertyDsl.() -> Unit = {}
    ): CfnExtension.ActionProperty {
        val builder = CfnExtensionActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you create an extension or configure an AWS authored extension, you associate the
     * extension with an AWS AppConfig application, environment, or configuration profile.
     *
     * For example, you can choose to run the `AWS AppConfig deployment events to Amazon SNS` AWS
     * authored extension and receive notifications on an Amazon SNS topic anytime a configuration
     * deployment is started for a specific application. Defining which extension to associate with
     * an AWS AppConfig resource is called an *extension association* . An extension association is
     * a specified relationship between an extension and an AWS AppConfig resource, such as an
     * application or a configuration profile. For more information about extensions and
     * associations, see
     * [Working with AWS AppConfig extensions](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnExtensionAssociation cfnExtensionAssociation = CfnExtensionAssociation.Builder.create(this,
     * "MyCfnExtensionAssociation")
     * .extensionIdentifier("extensionIdentifier")
     * .extensionVersionNumber(123)
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html)
     */
    public inline fun cfnExtensionAssociation(
        scope: Construct,
        id: String,
        block: CfnExtensionAssociationDsl.() -> Unit = {},
    ): CfnExtensionAssociation {
        val builder = CfnExtensionAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnExtensionAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnExtensionAssociationProps cfnExtensionAssociationProps =
     * CfnExtensionAssociationProps.builder()
     * .extensionIdentifier("extensionIdentifier")
     * .extensionVersionNumber(123)
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html)
     */
    public inline fun cfnExtensionAssociationProps(
        block: CfnExtensionAssociationPropsDsl.() -> Unit = {}
    ): CfnExtensionAssociationProps {
        val builder = CfnExtensionAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A value such as an Amazon Resource Name (ARN) or an Amazon Simple Notification Service topic
     * entered in an extension when invoked.
     *
     * Parameter values are specified in an extension association. For more information about
     * extensions, see
     * [Working with AWS AppConfig extensions](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
     * in the *AWS AppConfig User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * ParameterProperty parameterProperty = ParameterProperty.builder()
     * .required(false)
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html)
     */
    public inline fun cfnExtensionParameterProperty(
        block: CfnExtensionParameterPropertyDsl.() -> Unit = {}
    ): CfnExtension.ParameterProperty {
        val builder = CfnExtensionParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnExtension`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * Object actions;
     * CfnExtensionProps cfnExtensionProps = CfnExtensionProps.builder()
     * .actions(actions)
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .latestVersionNumber(123)
     * .parameters(Map.of(
     * "parametersKey", ParameterProperty.builder()
     * .required(false)
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html)
     */
    public inline fun cfnExtensionProps(
        block: CfnExtensionPropsDsl.() -> Unit = {}
    ): CfnExtensionProps {
        val builder = CfnExtensionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a new configuration in the AWS AppConfig hosted configuration store.
     *
     * Configurations must be 1 MB or smaller. The AWS AppConfig hosted configuration store provides
     * the following benefits over other configuration store options.
     * * You don't need to set up and configure other services such as Amazon Simple Storage Service
     *   ( Amazon S3 ) or Parameter Store.
     * * You don't need to configure AWS Identity and Access Management ( IAM ) permissions to use
     *   the configuration store.
     * * You can store configurations in any content type.
     * * There is no cost to use the store.
     * * You can create a configuration and add it to the store when you create a configuration
     *   profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnHostedConfigurationVersion cfnHostedConfigurationVersion =
     * CfnHostedConfigurationVersion.Builder.create(this, "MyCfnHostedConfigurationVersion")
     * .applicationId("applicationId")
     * .configurationProfileId("configurationProfileId")
     * .content("content")
     * .contentType("contentType")
     * // the properties below are optional
     * .description("description")
     * .latestVersionNumber(123)
     * .versionLabel("versionLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html)
     */
    public inline fun cfnHostedConfigurationVersion(
        scope: Construct,
        id: String,
        block: CfnHostedConfigurationVersionDsl.() -> Unit = {},
    ): CfnHostedConfigurationVersion {
        val builder = CfnHostedConfigurationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHostedConfigurationVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * CfnHostedConfigurationVersionProps cfnHostedConfigurationVersionProps =
     * CfnHostedConfigurationVersionProps.builder()
     * .applicationId("applicationId")
     * .configurationProfileId("configurationProfileId")
     * .content("content")
     * .contentType("contentType")
     * // the properties below are optional
     * .description("description")
     * .latestVersionNumber(123)
     * .versionLabel("versionLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html)
     */
    public inline fun cfnHostedConfigurationVersionProps(
        block: CfnHostedConfigurationVersionPropsDsl.() -> Unit = {}
    ): CfnHostedConfigurationVersionProps {
        val builder = CfnHostedConfigurationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the Configuration construct.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * import software.amazon.awscdk.services.kms.*;
     * DeploymentStrategy deploymentStrategy;
     * Environment environment;
     * Key key;
     * IValidator validator;
     * ConfigurationOptions configurationOptions = ConfigurationOptions.builder()
     * .deploymentKey(key)
     * .deploymentStrategy(deploymentStrategy)
     * .deployTo(List.of(environment))
     * .description("description")
     * .name("name")
     * .type(ConfigurationType.FREEFORM)
     * .validators(List.of(validator))
     * .build();
     * ```
     */
    public inline fun configurationOptions(
        block: ConfigurationOptionsDsl.() -> Unit = {}
    ): ConfigurationOptions {
        val builder = ConfigurationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the Configuration construct.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * import software.amazon.awscdk.services.kms.*;
     * Application application;
     * DeploymentStrategy deploymentStrategy;
     * Environment environment;
     * Key key;
     * IValidator validator;
     * ConfigurationProps configurationProps = ConfigurationProps.builder()
     * .application(application)
     * // the properties below are optional
     * .deploymentKey(key)
     * .deploymentStrategy(deploymentStrategy)
     * .deployTo(List.of(environment))
     * .description("description")
     * .name("name")
     * .type(ConfigurationType.FREEFORM)
     * .validators(List.of(validator))
     * .build();
     * ```
     */
    public inline fun configurationProps(
        block: ConfigurationPropsDsl.() -> Unit = {}
    ): ConfigurationProps {
        val builder = ConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS AppConfig deployment strategy.
     *
     * Example:
     * ```
     * DeploymentStrategy.Builder.create(this, "MyDeploymentStrategy")
     * .rolloutStrategy(RolloutStrategy.linear(RolloutStrategyProps.builder()
     * .growthFactor(20)
     * .deploymentDuration(Duration.minutes(30))
     * .finalBakeTime(Duration.minutes(30))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html)
     */
    public inline fun deploymentStrategy(
        scope: Construct,
        id: String,
        block: DeploymentStrategyDsl.() -> Unit = {},
    ): DeploymentStrategy {
        val builder = DeploymentStrategyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for DeploymentStrategy.
     *
     * Example:
     * ```
     * DeploymentStrategy.Builder.create(this, "MyDeploymentStrategy")
     * .rolloutStrategy(RolloutStrategy.linear(RolloutStrategyProps.builder()
     * .growthFactor(20)
     * .deploymentDuration(Duration.minutes(30))
     * .finalBakeTime(Duration.minutes(30))
     * .build()))
     * .build();
     * ```
     */
    public inline fun deploymentStrategyProps(
        block: DeploymentStrategyPropsDsl.() -> Unit = {}
    ): DeploymentStrategyProps {
        val builder = DeploymentStrategyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS AppConfig environment.
     *
     * Example:
     * ```
     * Application app = new Application(this, "MyApp");
     * Environment env = Environment.Builder.create(this, "MyEnv")
     * .application(app)
     * .build();
     * HostedConfiguration.Builder.create(this, "MyHostedConfig")
     * .application(app)
     * .deployTo(List.of(env))
     * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-environment.html)
     */
    public inline fun environment(
        scope: Construct,
        id: String,
        block: EnvironmentDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.appconfig.Environment {
        val builder = EnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes of an existing AWS AppConfig environment to import it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * Application application;
     * Monitor monitor;
     * EnvironmentAttributes environmentAttributes = EnvironmentAttributes.builder()
     * .application(application)
     * .environmentId("environmentId")
     * // the properties below are optional
     * .description("description")
     * .monitors(List.of(monitor))
     * .name("name")
     * .build();
     * ```
     */
    public inline fun environmentAttributes(
        block: EnvironmentAttributesDsl.() -> Unit = {}
    ): EnvironmentAttributes {
        val builder = EnvironmentAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the Environment construct.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * Monitor monitor;
     * EnvironmentOptions environmentOptions = EnvironmentOptions.builder()
     * .description("description")
     * .environmentName("environmentName")
     * .monitors(List.of(monitor))
     * .build();
     * ```
     */
    public inline fun environmentOptions(
        block: EnvironmentOptionsDsl.() -> Unit = {}
    ): EnvironmentOptions {
        val builder = EnvironmentOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the Environment construct.
     *
     * Example:
     * ```
     * Application app = new Application(this, "MyApp");
     * Environment env = Environment.Builder.create(this, "MyEnv")
     * .application(app)
     * .build();
     * HostedConfiguration.Builder.create(this, "MyHostedConfig")
     * .application(app)
     * .deployTo(List.of(env))
     * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
     * .build();
     * ```
     */
    public inline fun environmentProps(
        block: EnvironmentPropsDsl.() -> Unit = {}
    ): EnvironmentProps {
        val builder = EnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS AppConfig extension.
     *
     * Example:
     * ```
     * Function fn;
     * Extension.Builder.create(this, "MyExtension")
     * .actions(List.of(
     * Action.Builder.create()
     * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
     * .eventDestination(new LambdaDestination(fn))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
     */
    public inline fun extension(
        scope: Construct,
        id: String,
        block: ExtensionDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.appconfig.Extension {
        val builder = ExtensionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes of an existing AWS AppConfig extension to import.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * Action action;
     * ExtensionAttributes extensionAttributes = ExtensionAttributes.builder()
     * .extensionId("extensionId")
     * .extensionVersionNumber(123)
     * // the properties below are optional
     * .actions(List.of(action))
     * .description("description")
     * .extensionArn("extensionArn")
     * .name("name")
     * .build();
     * ```
     */
    public inline fun extensionAttributes(
        block: ExtensionAttributesDsl.() -> Unit = {}
    ): ExtensionAttributes {
        val builder = ExtensionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the Extension construct.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * Parameter parameter;
     * ExtensionOptions extensionOptions = ExtensionOptions.builder()
     * .description("description")
     * .extensionName("extensionName")
     * .latestVersionNumber(123)
     * .parameters(List.of(parameter))
     * .build();
     * ```
     */
    public inline fun extensionOptions(
        block: ExtensionOptionsDsl.() -> Unit = {}
    ): ExtensionOptions {
        val builder = ExtensionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the Extension construct.
     *
     * Example:
     * ```
     * Function fn;
     * Extension.Builder.create(this, "MyExtension")
     * .actions(List.of(
     * Action.Builder.create()
     * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
     * .eventDestination(new LambdaDestination(fn))
     * .build()))
     * .build();
     * ```
     */
    public inline fun extensionProps(block: ExtensionPropsDsl.() -> Unit = {}): ExtensionProps {
        val builder = ExtensionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A hosted configuration represents configuration stored in the AWS AppConfig hosted
     * configuration store.
     *
     * Example:
     * ```
     * Application application;
     * HostedConfiguration.Builder.create(this, "MyHostedConfiguration")
     * .application(application)
     * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
     * .type(ConfigurationType.FEATURE_FLAGS)
     * .build();
     * ```
     */
    public inline fun hostedConfiguration(
        scope: Construct,
        id: String,
        block: HostedConfigurationDsl.() -> Unit = {},
    ): HostedConfiguration {
        val builder = HostedConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for HostedConfiguration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * import software.amazon.awscdk.services.kms.*;
     * ConfigurationContent configurationContent;
     * DeploymentStrategy deploymentStrategy;
     * Environment environment;
     * Key key;
     * IValidator validator;
     * HostedConfigurationOptions hostedConfigurationOptions = HostedConfigurationOptions.builder()
     * .content(configurationContent)
     * // the properties below are optional
     * .deploymentKey(key)
     * .deploymentStrategy(deploymentStrategy)
     * .deployTo(List.of(environment))
     * .description("description")
     * .latestVersionNumber(123)
     * .name("name")
     * .type(ConfigurationType.FREEFORM)
     * .validators(List.of(validator))
     * .versionLabel("versionLabel")
     * .build();
     * ```
     */
    public inline fun hostedConfigurationOptions(
        block: HostedConfigurationOptionsDsl.() -> Unit = {}
    ): HostedConfigurationOptions {
        val builder = HostedConfigurationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for HostedConfiguration.
     *
     * Example:
     * ```
     * Application application;
     * HostedConfiguration.Builder.create(this, "MyHostedConfiguration")
     * .application(application)
     * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
     * .type(ConfigurationType.FEATURE_FLAGS)
     * .build();
     * ```
     */
    public inline fun hostedConfigurationProps(
        block: HostedConfigurationPropsDsl.() -> Unit = {}
    ): HostedConfigurationProps {
        val builder = HostedConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the Rollout Strategy.
     *
     * Example:
     * ```
     * Application application;
     * HostedConfiguration.Builder.create(this, "MyHostedConfiguration")
     * .application(application)
     * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
     * .deploymentStrategy(DeploymentStrategy.Builder.create(this, "MyDeploymentStrategy")
     * .rolloutStrategy(RolloutStrategy.linear(RolloutStrategyProps.builder()
     * .growthFactor(15)
     * .deploymentDuration(Duration.minutes(30))
     * .finalBakeTime(Duration.minutes(15))
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun rolloutStrategyProps(
        block: RolloutStrategyPropsDsl.() -> Unit = {}
    ): RolloutStrategyProps {
        val builder = RolloutStrategyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A sourced configuration represents configuration stored in an Amazon S3 bucket, AWS Secrets
     * Manager secret, Systems Manager (SSM) Parameter Store parameter, SSM document, or AWS
     * CodePipeline.
     *
     * Example:
     * ```
     * Application application;
     * Bucket bucket;
     * SourcedConfiguration.Builder.create(this, "MySourcedConfiguration")
     * .application(application)
     * .location(ConfigurationSource.fromBucket(bucket, "path/to/file.json"))
     * .type(ConfigurationType.FEATURE_FLAGS)
     * .name("MyConfig")
     * .description("This is my sourced configuration from CDK.")
     * .build();
     * ```
     */
    public inline fun sourcedConfiguration(
        scope: Construct,
        id: String,
        block: SourcedConfigurationDsl.() -> Unit = {},
    ): SourcedConfiguration {
        val builder = SourcedConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for SourcedConfiguration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appconfig.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kms.*;
     * ConfigurationSource configurationSource;
     * DeploymentStrategy deploymentStrategy;
     * Environment environment;
     * Key key;
     * Role role;
     * IValidator validator;
     * SourcedConfigurationOptions sourcedConfigurationOptions = SourcedConfigurationOptions.builder()
     * .location(configurationSource)
     * // the properties below are optional
     * .deploymentKey(key)
     * .deploymentStrategy(deploymentStrategy)
     * .deployTo(List.of(environment))
     * .description("description")
     * .name("name")
     * .retrievalRole(role)
     * .type(ConfigurationType.FREEFORM)
     * .validators(List.of(validator))
     * .versionNumber("versionNumber")
     * .build();
     * ```
     */
    public inline fun sourcedConfigurationOptions(
        block: SourcedConfigurationOptionsDsl.() -> Unit = {}
    ): SourcedConfigurationOptions {
        val builder = SourcedConfigurationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for SourcedConfiguration.
     *
     * Example:
     * ```
     * Application application;
     * Bucket bucket;
     * SourcedConfiguration.Builder.create(this, "MySourcedConfiguration")
     * .application(application)
     * .location(ConfigurationSource.fromBucket(bucket, "path/to/file.json"))
     * .type(ConfigurationType.FEATURE_FLAGS)
     * .name("MyConfig")
     * .description("This is my sourced configuration from CDK.")
     * .build();
     * ```
     */
    public inline fun sourcedConfigurationProps(
        block: SourcedConfigurationPropsDsl.() -> Unit = {}
    ): SourcedConfigurationProps {
        val builder = SourcedConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public object Environment {
        public fun fromEnvironmentAttributes(
            scope: Construct,
            id: String,
            block: EnvironmentAttributesDsl.() -> Unit = {},
        ): IEnvironment {
            val builder = EnvironmentAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.appconfig.Environment.fromEnvironmentAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object Extension {
        public fun fromExtensionAttributes(
            scope: Construct,
            id: String,
            block: ExtensionAttributesDsl.() -> Unit = {},
        ): IExtension {
            val builder = ExtensionAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.appconfig.Extension.fromExtensionAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object Monitor {
        public fun fromCfnMonitorsProperty(
            block: CfnEnvironmentMonitorsPropertyDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.appconfig.Monitor {
            val builder = CfnEnvironmentMonitorsPropertyDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.appconfig.Monitor.fromCfnMonitorsProperty(
                builder.build()
            )
        }
    }

    public object RolloutStrategy {
        public fun exponential(
            block: RolloutStrategyPropsDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.appconfig.RolloutStrategy {
            val builder = RolloutStrategyPropsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.appconfig.RolloutStrategy.exponential(
                builder.build()
            )
        }

        public fun linear(
            block: RolloutStrategyPropsDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.appconfig.RolloutStrategy {
            val builder = RolloutStrategyPropsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.appconfig.RolloutStrategy.linear(builder.build())
        }
    }
}
