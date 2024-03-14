package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The name of the application that is associated with this environment. */
    public open fun applicationName(): String = unwrap(this).getApplicationName()

    /** The name of the application that is associated with this environment. */
    public open fun applicationName(`value`: String) {
        unwrap(this).setApplicationName(`value`)
    }

    /**
     * For load-balanced, autoscaling environments, the URL to the load balancer. For
     * single-instance environments, the IP address of the instance.
     *
     * Example load balancer URL:
     *
     * Example instance IP address:
     *
     * `192.0.2.0`
     */
    public open fun attrEndpointUrl(): String = unwrap(this).getAttrEndpointUrl()

    /**
     * If specified, the environment attempts to use this value as the prefix for the CNAME in your
     * Elastic Beanstalk environment URL.
     */
    public open fun cnamePrefix(): String? = unwrap(this).getCnamePrefix()

    /**
     * If specified, the environment attempts to use this value as the prefix for the CNAME in your
     * Elastic Beanstalk environment URL.
     */
    public open fun cnamePrefix(`value`: String) {
        unwrap(this).setCnamePrefix(`value`)
    }

    /** Your description for this environment. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** Your description for this environment. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** A unique name for the environment. */
    public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /** A unique name for the environment. */
    public open fun environmentName(`value`: String) {
        unwrap(this).setEnvironmentName(`value`)
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
     * The operations role feature of AWS Elastic Beanstalk is in beta release and is subject to
     * change.
     */
    public open fun operationsRole(): String? = unwrap(this).getOperationsRole()

    /**
     * The operations role feature of AWS Elastic Beanstalk is in beta release and is subject to
     * change.
     */
    public open fun operationsRole(`value`: String) {
        unwrap(this).setOperationsRole(`value`)
    }

    /**
     * Key-value pairs defining configuration options for this environment, such as the instance
     * type.
     */
    public open fun optionSettings(): Any? = unwrap(this).getOptionSettings()

    /**
     * Key-value pairs defining configuration options for this environment, such as the instance
     * type.
     */
    public open fun optionSettings(`value`: IResolvable) {
        unwrap(this).setOptionSettings(`value`.let(IResolvable::unwrap))
    }

    /**
     * Key-value pairs defining configuration options for this environment, such as the instance
     * type.
     */
    public open fun optionSettings(__idx_ac66f0: List<Any>) {
        unwrap(this).setOptionSettings(__idx_ac66f0)
    }

    /**
     * Key-value pairs defining configuration options for this environment, such as the instance
     * type.
     */
    public open fun optionSettings(vararg __idx_ac66f0: Any): Unit =
        optionSettings(__idx_ac66f0.toList())

    /** The Amazon Resource Name (ARN) of the custom platform to use with the environment. */
    public open fun platformArn(): String? = unwrap(this).getPlatformArn()

    /** The Amazon Resource Name (ARN) of the custom platform to use with the environment. */
    public open fun platformArn(`value`: String) {
        unwrap(this).setPlatformArn(`value`)
    }

    /**
     * The name of an Elastic Beanstalk solution stack (platform version) to use with the
     * environment.
     */
    public open fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

    /**
     * The name of an Elastic Beanstalk solution stack (platform version) to use with the
     * environment.
     */
    public open fun solutionStackName(`value`: String) {
        unwrap(this).setSolutionStackName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** Specifies the tags applied to resources in the environment. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** Specifies the tags applied to resources in the environment. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** Specifies the tags applied to resources in the environment. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The name of the Elastic Beanstalk configuration template to use with the environment. */
    public open fun templateName(): String? = unwrap(this).getTemplateName()

    /** The name of the Elastic Beanstalk configuration template to use with the environment. */
    public open fun templateName(`value`: String) {
        unwrap(this).setTemplateName(`value`)
    }

    /** Specifies the tier to use in creating this environment. */
    public open fun tier(): Any? = unwrap(this).getTier()

    /** Specifies the tier to use in creating this environment. */
    public open fun tier(`value`: IResolvable) {
        unwrap(this).setTier(`value`.let(IResolvable::unwrap))
    }

    /** Specifies the tier to use in creating this environment. */
    public open fun tier(`value`: TierProperty) {
        unwrap(this).setTier(`value`.let(TierProperty::unwrap))
    }

    /** Specifies the tier to use in creating this environment. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("016c99eb44a253444e7f6db18a461c703af4f63f9846add6b7855cb273a91480")
    public open fun tier(`value`: TierProperty.Builder.() -> Unit): Unit =
        tier(TierProperty(`value`))

    /** The name of the application version to deploy. */
    public open fun versionLabel(): String? = unwrap(this).getVersionLabel()

    /** The name of the application version to deploy. */
    public open fun versionLabel(`value`: String) {
        unwrap(this).setVersionLabel(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.elasticbeanstalk.CfnEnvironment]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the application that is associated with this environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-applicationname)
         *
         * @param applicationName The name of the application that is associated with this
         *   environment.
         */
        public fun applicationName(applicationName: String)

        /**
         * If specified, the environment attempts to use this value as the prefix for the CNAME in
         * your Elastic Beanstalk environment URL.
         *
         * If not specified, the CNAME is generated automatically by appending a random alphanumeric
         * string to the environment name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-cnameprefix)
         *
         * @param cnamePrefix If specified, the environment attempts to use this value as the prefix
         *   for the CNAME in your Elastic Beanstalk environment URL.
         */
        public fun cnamePrefix(cnamePrefix: String)

        /**
         * Your description for this environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-description)
         *
         * @param description Your description for this environment.
         */
        public fun description(description: String)

        /**
         * A unique name for the environment.
         *
         * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters,
         * numbers, and hyphens. It can't start or end with a hyphen. This name must be unique
         * within a region in your account.
         *
         * If you don't specify the `CNAMEPrefix` parameter, the environment name becomes part of
         * the CNAME, and therefore part of the visible URL for your application.
         *
         * If you don't specify an environment name, AWS CloudFormation generates a unique physical
         * ID and uses that ID for the environment name. For more information, see
         * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
         * .
         *
         * If you specify a name, you cannot perform updates that require replacement of this
         * resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-environmentname)
         *
         * @param environmentName A unique name for the environment.
         */
        public fun environmentName(environmentName: String)

        /**
         * The operations role feature of AWS Elastic Beanstalk is in beta release and is subject to
         * change.
         *
         * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's
         * operations role. If specified, Elastic Beanstalk uses the operations role for permissions
         * to downstream services during this call and during subsequent calls acting on this
         * environment. To specify an operations role, you must have the `iam:PassRole` permission
         * for the role.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-operationsrole)
         *
         * @param operationsRole The operations role feature of AWS Elastic Beanstalk is in beta
         *   release and is subject to change.
         */
        public fun operationsRole(operationsRole: String)

        /**
         * Key-value pairs defining configuration options for this environment, such as the instance
         * type.
         *
         * These options override the values that are defined in the solution stack or the
         * [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
         * . If you remove any options during a stack update, the removed options retain their
         * current values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
         *
         * @param optionSettings Key-value pairs defining configuration options for this
         *   environment, such as the instance type.
         */
        public fun optionSettings(optionSettings: IResolvable)

        /**
         * Key-value pairs defining configuration options for this environment, such as the instance
         * type.
         *
         * These options override the values that are defined in the solution stack or the
         * [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
         * . If you remove any options during a stack update, the removed options retain their
         * current values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
         *
         * @param optionSettings Key-value pairs defining configuration options for this
         *   environment, such as the instance type.
         */
        public fun optionSettings(optionSettings: List<Any>)

        /**
         * Key-value pairs defining configuration options for this environment, such as the instance
         * type.
         *
         * These options override the values that are defined in the solution stack or the
         * [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
         * . If you remove any options during a stack update, the removed options retain their
         * current values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
         *
         * @param optionSettings Key-value pairs defining configuration options for this
         *   environment, such as the instance type.
         */
        public fun optionSettings(vararg optionSettings: Any)

        /**
         * The Amazon Resource Name (ARN) of the custom platform to use with the environment.
         *
         * For more information, see
         * [Custom Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html)
         * in the *AWS Elastic Beanstalk Developer Guide* .
         *
         * If you specify `PlatformArn` , don't specify `SolutionStackName` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-platformarn)
         *
         * @param platformArn The Amazon Resource Name (ARN) of the custom platform to use with the
         *   environment.
         */
        public fun platformArn(platformArn: String)

        /**
         * The name of an Elastic Beanstalk solution stack (platform version) to use with the
         * environment.
         *
         * If specified, Elastic Beanstalk sets the configuration values to the default values
         * associated with the specified solution stack. For a list of current solution stacks, see
         * [Elastic Beanstalk Supported Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html)
         * in the *AWS Elastic Beanstalk Platforms* guide.
         *
         * If you specify `SolutionStackName` , don't specify `PlatformArn` or `TemplateName` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-solutionstackname)
         *
         * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform
         *   version) to use with the environment.
         */
        public fun solutionStackName(solutionStackName: String)

        /**
         * Specifies the tags applied to resources in the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
         *
         * @param tags Specifies the tags applied to resources in the environment.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Specifies the tags applied to resources in the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
         *
         * @param tags Specifies the tags applied to resources in the environment.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The name of the Elastic Beanstalk configuration template to use with the environment.
         *
         * If you specify `TemplateName` , then don't specify `SolutionStackName` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-templatename)
         *
         * @param templateName The name of the Elastic Beanstalk configuration template to use with
         *   the environment.
         */
        public fun templateName(templateName: String)

        /**
         * Specifies the tier to use in creating this environment.
         *
         * The environment tier that you choose determines whether Elastic Beanstalk provisions
         * resources to support a web application that handles HTTP(S) requests or a web application
         * that handles background-processing tasks.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
         *
         * @param tier Specifies the tier to use in creating this environment.
         */
        public fun tier(tier: IResolvable)

        /**
         * Specifies the tier to use in creating this environment.
         *
         * The environment tier that you choose determines whether Elastic Beanstalk provisions
         * resources to support a web application that handles HTTP(S) requests or a web application
         * that handles background-processing tasks.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
         *
         * @param tier Specifies the tier to use in creating this environment.
         */
        public fun tier(tier: TierProperty)

        /**
         * Specifies the tier to use in creating this environment.
         *
         * The environment tier that you choose determines whether Elastic Beanstalk provisions
         * resources to support a web application that handles HTTP(S) requests or a web application
         * that handles background-processing tasks.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
         *
         * @param tier Specifies the tier to use in creating this environment.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("da8a7b4f68c3a6fb28e3ae16f58ad6cc5abb1b5b4ce910ac21f323e9497a3e51")
        public fun tier(tier: TierProperty.Builder.() -> Unit)

        /**
         * The name of the application version to deploy.
         *
         * Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-versionlabel)
         *
         * @param versionLabel The name of the application version to deploy.
         */
        public fun versionLabel(versionLabel: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.Builder =
            software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.Builder.create(
                scope,
                id
            )

        /**
         * The name of the application that is associated with this environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-applicationname)
         *
         * @param applicationName The name of the application that is associated with this
         *   environment.
         */
        override fun applicationName(applicationName: String) {
            cdkBuilder.applicationName(applicationName)
        }

        /**
         * If specified, the environment attempts to use this value as the prefix for the CNAME in
         * your Elastic Beanstalk environment URL.
         *
         * If not specified, the CNAME is generated automatically by appending a random alphanumeric
         * string to the environment name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-cnameprefix)
         *
         * @param cnamePrefix If specified, the environment attempts to use this value as the prefix
         *   for the CNAME in your Elastic Beanstalk environment URL.
         */
        override fun cnamePrefix(cnamePrefix: String) {
            cdkBuilder.cnamePrefix(cnamePrefix)
        }

        /**
         * Your description for this environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-description)
         *
         * @param description Your description for this environment.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * A unique name for the environment.
         *
         * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters,
         * numbers, and hyphens. It can't start or end with a hyphen. This name must be unique
         * within a region in your account.
         *
         * If you don't specify the `CNAMEPrefix` parameter, the environment name becomes part of
         * the CNAME, and therefore part of the visible URL for your application.
         *
         * If you don't specify an environment name, AWS CloudFormation generates a unique physical
         * ID and uses that ID for the environment name. For more information, see
         * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
         * .
         *
         * If you specify a name, you cannot perform updates that require replacement of this
         * resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-environmentname)
         *
         * @param environmentName A unique name for the environment.
         */
        override fun environmentName(environmentName: String) {
            cdkBuilder.environmentName(environmentName)
        }

        /**
         * The operations role feature of AWS Elastic Beanstalk is in beta release and is subject to
         * change.
         *
         * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's
         * operations role. If specified, Elastic Beanstalk uses the operations role for permissions
         * to downstream services during this call and during subsequent calls acting on this
         * environment. To specify an operations role, you must have the `iam:PassRole` permission
         * for the role.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-operationsrole)
         *
         * @param operationsRole The operations role feature of AWS Elastic Beanstalk is in beta
         *   release and is subject to change.
         */
        override fun operationsRole(operationsRole: String) {
            cdkBuilder.operationsRole(operationsRole)
        }

        /**
         * Key-value pairs defining configuration options for this environment, such as the instance
         * type.
         *
         * These options override the values that are defined in the solution stack or the
         * [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
         * . If you remove any options during a stack update, the removed options retain their
         * current values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
         *
         * @param optionSettings Key-value pairs defining configuration options for this
         *   environment, such as the instance type.
         */
        override fun optionSettings(optionSettings: IResolvable) {
            cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
        }

        /**
         * Key-value pairs defining configuration options for this environment, such as the instance
         * type.
         *
         * These options override the values that are defined in the solution stack or the
         * [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
         * . If you remove any options during a stack update, the removed options retain their
         * current values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
         *
         * @param optionSettings Key-value pairs defining configuration options for this
         *   environment, such as the instance type.
         */
        override fun optionSettings(optionSettings: List<Any>) {
            cdkBuilder.optionSettings(optionSettings)
        }

        /**
         * Key-value pairs defining configuration options for this environment, such as the instance
         * type.
         *
         * These options override the values that are defined in the solution stack or the
         * [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
         * . If you remove any options during a stack update, the removed options retain their
         * current values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
         *
         * @param optionSettings Key-value pairs defining configuration options for this
         *   environment, such as the instance type.
         */
        override fun optionSettings(vararg optionSettings: Any): Unit =
            optionSettings(optionSettings.toList())

        /**
         * The Amazon Resource Name (ARN) of the custom platform to use with the environment.
         *
         * For more information, see
         * [Custom Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html)
         * in the *AWS Elastic Beanstalk Developer Guide* .
         *
         * If you specify `PlatformArn` , don't specify `SolutionStackName` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-platformarn)
         *
         * @param platformArn The Amazon Resource Name (ARN) of the custom platform to use with the
         *   environment.
         */
        override fun platformArn(platformArn: String) {
            cdkBuilder.platformArn(platformArn)
        }

        /**
         * The name of an Elastic Beanstalk solution stack (platform version) to use with the
         * environment.
         *
         * If specified, Elastic Beanstalk sets the configuration values to the default values
         * associated with the specified solution stack. For a list of current solution stacks, see
         * [Elastic Beanstalk Supported Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html)
         * in the *AWS Elastic Beanstalk Platforms* guide.
         *
         * If you specify `SolutionStackName` , don't specify `PlatformArn` or `TemplateName` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-solutionstackname)
         *
         * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform
         *   version) to use with the environment.
         */
        override fun solutionStackName(solutionStackName: String) {
            cdkBuilder.solutionStackName(solutionStackName)
        }

        /**
         * Specifies the tags applied to resources in the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
         *
         * @param tags Specifies the tags applied to resources in the environment.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Specifies the tags applied to resources in the environment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
         *
         * @param tags Specifies the tags applied to resources in the environment.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The name of the Elastic Beanstalk configuration template to use with the environment.
         *
         * If you specify `TemplateName` , then don't specify `SolutionStackName` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-templatename)
         *
         * @param templateName The name of the Elastic Beanstalk configuration template to use with
         *   the environment.
         */
        override fun templateName(templateName: String) {
            cdkBuilder.templateName(templateName)
        }

        /**
         * Specifies the tier to use in creating this environment.
         *
         * The environment tier that you choose determines whether Elastic Beanstalk provisions
         * resources to support a web application that handles HTTP(S) requests or a web application
         * that handles background-processing tasks.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
         *
         * @param tier Specifies the tier to use in creating this environment.
         */
        override fun tier(tier: IResolvable) {
            cdkBuilder.tier(tier.let(IResolvable::unwrap))
        }

        /**
         * Specifies the tier to use in creating this environment.
         *
         * The environment tier that you choose determines whether Elastic Beanstalk provisions
         * resources to support a web application that handles HTTP(S) requests or a web application
         * that handles background-processing tasks.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
         *
         * @param tier Specifies the tier to use in creating this environment.
         */
        override fun tier(tier: TierProperty) {
            cdkBuilder.tier(tier.let(TierProperty::unwrap))
        }

        /**
         * Specifies the tier to use in creating this environment.
         *
         * The environment tier that you choose determines whether Elastic Beanstalk provisions
         * resources to support a web application that handles HTTP(S) requests or a web application
         * that handles background-processing tasks.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
         *
         * @param tier Specifies the tier to use in creating this environment.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("da8a7b4f68c3a6fb28e3ae16f58ad6cc5abb1b5b4ce910ac21f323e9497a3e51")
        override fun tier(tier: TierProperty.Builder.() -> Unit): Unit = tier(TierProperty(tier))

        /**
         * The name of the application version to deploy.
         *
         * Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-versionlabel)
         *
         * @param versionLabel The name of the application version to deploy.
         */
        override fun versionLabel(versionLabel: String) {
            cdkBuilder.versionLabel(versionLabel)
        }

        public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnEnvironment {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnEnvironment(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
        ): CfnEnvironment = CfnEnvironment(cdkObject)

        internal fun unwrap(
            wrapped: CfnEnvironment
        ): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment = wrapped.cdkObject
    }

    public interface TierProperty {
        /**
         * The name of this environment tier.
         *
         * Valid values:
         * * For *Web server tier* – `WebServer`
         * * For *Worker tier* – `Worker`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html#cfn-elasticbeanstalk-environment-tier-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * The type of this environment tier.
         *
         * Valid values:
         * * For *Web server tier* – `Standard`
         * * For *Worker tier* – `SQS/HTTP`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html#cfn-elasticbeanstalk-environment-tier-type)
         */
        public fun type(): String? = unwrap(this).getType()

        /**
         * The version of this environment tier.
         *
         * When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker
         * tier version.
         *
         * This member is deprecated. Any specific version that you set may become out of date. We
         * recommend leaving it unspecified.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html#cfn-elasticbeanstalk-environment-tier-version)
         */
        public fun version(): String? = unwrap(this).getVersion()

        /** A builder for [TierProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param name The name of this environment tier. Valid values:
             * * For *Web server tier* – `WebServer`
             * * For *Worker tier* – `Worker`
             */
            public fun name(name: String)

            /**
             * @param type The type of this environment tier. Valid values:
             * * For *Web server tier* – `Standard`
             * * For *Worker tier* – `SQS/HTTP`
             */
            public fun type(type: String)

            /**
             * @param version The version of this environment tier. When you don't set a value to
             *   it, Elastic Beanstalk uses the latest compatible worker tier version.
             *
             * This member is deprecated. Any specific version that you set may become out of date.
             * We recommend leaving it unspecified.
             */
            public fun version(version: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder =
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty
                    .builder()

            /**
             * @param name The name of this environment tier. Valid values:
             * * For *Web server tier* – `WebServer`
             * * For *Worker tier* – `Worker`
             */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param type The type of this environment tier. Valid values:
             * * For *Web server tier* – `Standard`
             * * For *Worker tier* – `SQS/HTTP`
             */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            /**
             * @param version The version of this environment tier. When you don't set a value to
             *   it, Elastic Beanstalk uses the latest compatible worker tier version.
             *
             * This member is deprecated. Any specific version that you set may become out of date.
             * We recommend leaving it unspecified.
             */
            override fun version(version: String) {
                cdkBuilder.version(version)
            }

            public fun build():
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty,
        ) : TierProperty {
            /**
             * The name of this environment tier.
             *
             * Valid values:
             * * For *Web server tier* – `WebServer`
             * * For *Worker tier* – `Worker`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html#cfn-elasticbeanstalk-environment-tier-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * The type of this environment tier.
             *
             * Valid values:
             * * For *Web server tier* – `Standard`
             * * For *Worker tier* – `SQS/HTTP`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html#cfn-elasticbeanstalk-environment-tier-type)
             */
            override fun type(): String? = unwrap(this).getType()

            /**
             * The version of this environment tier.
             *
             * When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker
             * tier version.
             *
             * This member is deprecated. Any specific version that you set may become out of date.
             * We recommend leaving it unspecified.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-tier.html#cfn-elasticbeanstalk-environment-tier-version)
             */
            override fun version(): String? = unwrap(this).getVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TierProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty
            ): TierProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TierProperty
            ): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface OptionSettingProperty {
        /**
         * A unique namespace that identifies the option's associated AWS resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-namespace)
         */
        public fun namespace(): String

        /**
         * The name of the configuration option.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-optionname)
         */
        public fun optionName(): String

        /**
         * A unique resource name for the option setting.
         *
         * Use it for a time–based scaling configuration option.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename)
         */
        public fun resourceName(): String? = unwrap(this).getResourceName()

        /**
         * The current value for the configuration option.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-value)
         */
        public fun `value`(): String? = unwrap(this).getValue()

        /** A builder for [OptionSettingProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param namespace A unique namespace that identifies the option's associated AWS
             *   resource.
             */
            public fun namespace(namespace: String)

            /** @param optionName The name of the configuration option. */
            public fun optionName(optionName: String)

            /**
             * @param resourceName A unique resource name for the option setting. Use it for a
             *   time–based scaling configuration option.
             */
            public fun resourceName(resourceName: String)

            /** @param value The current value for the configuration option. */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder =
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
                    .OptionSettingProperty
                    .builder()

            /**
             * @param namespace A unique namespace that identifies the option's associated AWS
             *   resource.
             */
            override fun namespace(namespace: String) {
                cdkBuilder.namespace(namespace)
            }

            /** @param optionName The name of the configuration option. */
            override fun optionName(optionName: String) {
                cdkBuilder.optionName(optionName)
            }

            /**
             * @param resourceName A unique resource name for the option setting. Use it for a
             *   time–based scaling configuration option.
             */
            override fun resourceName(resourceName: String) {
                cdkBuilder.resourceName(resourceName)
            }

            /** @param value The current value for the configuration option. */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty,
        ) : OptionSettingProperty {
            /**
             * A unique namespace that identifies the option's associated AWS resource.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-namespace)
             */
            override fun namespace(): String = unwrap(this).getNamespace()

            /**
             * The name of the configuration option.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-optionname)
             */
            override fun optionName(): String = unwrap(this).getOptionName()

            /**
             * A unique resource name for the option setting.
             *
             * Use it for a time–based scaling configuration option.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename)
             */
            override fun resourceName(): String? = unwrap(this).getResourceName()

            /**
             * The current value for the configuration option.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-environment-optionsetting.html#cfn-elasticbeanstalk-environment-optionsetting-value)
             */
            override fun `value`(): String? = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): OptionSettingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty
            ): OptionSettingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: OptionSettingProperty
            ): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
