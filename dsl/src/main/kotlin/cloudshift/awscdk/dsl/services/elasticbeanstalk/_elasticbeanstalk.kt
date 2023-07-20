@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object elasticbeanstalk {
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationApplicationResourceLifecycleConfigProperty(
        block: CfnApplicationApplicationResourceLifecycleConfigPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.ApplicationResourceLifecycleConfigProperty {
        val builder = CfnApplicationApplicationResourceLifecycleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationApplicationVersionLifecycleConfigProperty(
        block: CfnApplicationApplicationVersionLifecycleConfigPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.ApplicationVersionLifecycleConfigProperty {
        val builder = CfnApplicationApplicationVersionLifecycleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationMaxAgeRuleProperty(
        block: CfnApplicationMaxAgeRulePropertyDsl.() -> Unit =
            {},
    ): CfnApplication.MaxAgeRuleProperty {
        val builder = CfnApplicationMaxAgeRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationMaxCountRuleProperty(
        block: CfnApplicationMaxCountRulePropertyDsl.() -> Unit =
            {},
    ): CfnApplication.MaxCountRuleProperty {
        val builder = CfnApplicationMaxCountRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationVersion(
        scope: Construct,
        id: String,
        block: CfnApplicationVersionDsl.() -> Unit = {},
    ): CfnApplicationVersion {
        val builder = CfnApplicationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationVersionProps(
        block: CfnApplicationVersionPropsDsl.() -> Unit =
            {},
    ): CfnApplicationVersionProps {
        val builder = CfnApplicationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationVersionSourceBundleProperty(
        block: CfnApplicationVersionSourceBundlePropertyDsl.() -> Unit =
            {},
    ): CfnApplicationVersion.SourceBundleProperty {
        val builder = CfnApplicationVersionSourceBundlePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationTemplate(
        scope: Construct,
        id: String,
        block: CfnConfigurationTemplateDsl.() -> Unit = {},
    ): CfnConfigurationTemplate {
        val builder = CfnConfigurationTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationTemplateConfigurationOptionSettingProperty(
        block: CfnConfigurationTemplateConfigurationOptionSettingPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationTemplate.ConfigurationOptionSettingProperty {
        val builder = CfnConfigurationTemplateConfigurationOptionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationTemplateProps(
        block: CfnConfigurationTemplatePropsDsl.() -> Unit =
            {},
    ): CfnConfigurationTemplateProps {
        val builder = CfnConfigurationTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationTemplateSourceConfigurationProperty(
        block: CfnConfigurationTemplateSourceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationTemplate.SourceConfigurationProperty {
        val builder = CfnConfigurationTemplateSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironmentOptionSettingProperty(
        block: CfnEnvironmentOptionSettingPropertyDsl.() -> Unit =
            {},
    ): CfnEnvironment.OptionSettingProperty {
        val builder = CfnEnvironmentOptionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironmentProps(block: CfnEnvironmentPropsDsl.() -> Unit = {}): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnvironmentTierProperty(
        block: CfnEnvironmentTierPropertyDsl.() -> Unit =
            {},
    ): CfnEnvironment.TierProperty {
        val builder = CfnEnvironmentTierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
