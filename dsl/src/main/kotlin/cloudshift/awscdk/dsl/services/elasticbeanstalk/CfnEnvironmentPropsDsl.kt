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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps

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
@CdkDslMarker
public class CfnEnvironmentPropsDsl {
    private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

    private val _optionSettings: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param applicationName The name of the application that is associated with this environment.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param cnamePrefix If specified, the environment attempts to use this value as the prefix for
     *   the CNAME in your Elastic Beanstalk environment URL. If not specified, the CNAME is
     *   generated automatically by appending a random alphanumeric string to the environment name.
     */
    public fun cnamePrefix(cnamePrefix: String) {
        cdkBuilder.cnamePrefix(cnamePrefix)
    }

    /** @param description Your description for this environment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param environmentName A unique name for the environment. Constraint: Must be from 4 to 40
     *   characters in length. The name can contain only letters, numbers, and hyphens. It can't
     *   start or end with a hyphen. This name must be unique within a region in your account.
     *
     * If you don't specify the `CNAMEPrefix` parameter, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     *
     * If you don't specify an environment name, AWS CloudFormation generates a unique physical ID
     * and uses that ID for the environment name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     */
    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param operationsRole The operations role feature of AWS Elastic Beanstalk is in beta release
     *   and is subject to change. The Amazon Resource Name (ARN) of an existing IAM role to be used
     *   as the environment's operations role. If specified, Elastic Beanstalk uses the operations
     *   role for permissions to downstream services during this call and during subsequent calls
     *   acting on this environment. To specify an operations role, you must have the `iam:PassRole`
     *   permission for the role.
     */
    public fun operationsRole(operationsRole: String) {
        cdkBuilder.operationsRole(operationsRole)
    }

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     *   such as the instance type. These options override the values that are defined in the
     *   solution stack or the
     *   [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     *   . If you remove any options during a stack update, the removed options retain their current
     *   values.
     */
    public fun optionSettings(vararg optionSettings: Any) {
        _optionSettings.addAll(listOf(*optionSettings))
    }

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     *   such as the instance type. These options override the values that are defined in the
     *   solution stack or the
     *   [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     *   . If you remove any options during a stack update, the removed options retain their current
     *   values.
     */
    public fun optionSettings(optionSettings: Collection<Any>) {
        _optionSettings.addAll(optionSettings)
    }

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     *   such as the instance type. These options override the values that are defined in the
     *   solution stack or the
     *   [configuration template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     *   . If you remove any options during a stack update, the removed options retain their current
     *   values.
     */
    public fun optionSettings(optionSettings: IResolvable) {
        cdkBuilder.optionSettings(optionSettings)
    }

    /**
     * @param platformArn The Amazon Resource Name (ARN) of the custom platform to use with the
     *   environment. For more information, see
     *   [Custom Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html)
     *   in the *AWS Elastic Beanstalk Developer Guide* .
     *
     * If you specify `PlatformArn` , don't specify `SolutionStackName` .
     */
    public fun platformArn(platformArn: String) {
        cdkBuilder.platformArn(platformArn)
    }

    /**
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     *   to use with the environment. If specified, Elastic Beanstalk sets the configuration values
     *   to the default values associated with the specified solution stack. For a list of current
     *   solution stacks, see
     *   [Elastic Beanstalk Supported Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html)
     *   in the *AWS Elastic Beanstalk Platforms* guide.
     *
     * If you specify `SolutionStackName` , don't specify `PlatformArn` or `TemplateName` .
     */
    public fun solutionStackName(solutionStackName: String) {
        cdkBuilder.solutionStackName(solutionStackName)
    }

    /** @param tags Specifies the tags applied to resources in the environment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Specifies the tags applied to resources in the environment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param templateName The name of the Elastic Beanstalk configuration template to use with the
     *   environment.
     *
     * If you specify `TemplateName` , then don't specify `SolutionStackName` .
     */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    /**
     * @param tier Specifies the tier to use in creating this environment. The environment tier that
     *   you choose determines whether Elastic Beanstalk provisions resources to support a web
     *   application that handles HTTP(S) requests or a web application that handles
     *   background-processing tasks.
     */
    public fun tier(tier: IResolvable) {
        cdkBuilder.tier(tier)
    }

    /**
     * @param tier Specifies the tier to use in creating this environment. The environment tier that
     *   you choose determines whether Elastic Beanstalk provisions resources to support a web
     *   application that handles HTTP(S) requests or a web application that handles
     *   background-processing tasks.
     */
    public fun tier(tier: CfnEnvironment.TierProperty) {
        cdkBuilder.tier(tier)
    }

    /**
     * @param versionLabel The name of the application version to deploy. Default: If not specified,
     *   Elastic Beanstalk attempts to deploy the sample application.
     */
    public fun versionLabel(versionLabel: String) {
        cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): CfnEnvironmentProps {
        if (_optionSettings.isNotEmpty()) cdkBuilder.optionSettings(_optionSettings)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
