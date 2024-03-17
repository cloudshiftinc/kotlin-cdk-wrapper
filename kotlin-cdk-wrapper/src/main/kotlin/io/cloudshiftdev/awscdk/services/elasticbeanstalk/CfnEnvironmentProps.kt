@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
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
public interface CfnEnvironmentProps {
  /**
   * The name of the application that is associated with this environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-applicationname)
   */
  public fun applicationName(): String

  /**
   * If specified, the environment attempts to use this value as the prefix for the CNAME in your
   * Elastic Beanstalk environment URL.
   *
   * If not specified, the CNAME is generated automatically by appending a random alphanumeric
   * string to the environment name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-cnameprefix)
   */
  public fun cnamePrefix(): String? = unwrap(this).getCnamePrefix()

  /**
   * Your description for this environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A unique name for the environment.
   *
   * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters,
   * numbers, and hyphens. It can't start or end with a hyphen. This name must be unique within a
   * region in your account.
   *
   * If you don't specify the `CNAMEPrefix` parameter, the environment name becomes part of the
   * CNAME, and therefore part of the visible URL for your application.
   *
   * If you don't specify an environment name, AWS CloudFormation generates a unique physical ID and
   * uses that ID for the environment name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-environmentname)
   */
  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The operations role feature of AWS Elastic Beanstalk is in beta release and is subject to
   * change.
   *
   * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's
   * operations role. If specified, Elastic Beanstalk uses the operations role for permissions to
   * downstream services during this call and during subsequent calls acting on this environment. To
   * specify an operations role, you must have the `iam:PassRole` permission for the role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-operationsrole)
   */
  public fun operationsRole(): String? = unwrap(this).getOperationsRole()

  /**
   * Key-value pairs defining configuration options for this environment, such as the instance type.
   *
   * These options override the values that are defined in the solution stack or the [configuration
   * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
   * . If you remove any options during a stack update, the removed options retain their current
   * values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
   */
  public fun optionSettings(): Any? = unwrap(this).getOptionSettings()

  /**
   * The Amazon Resource Name (ARN) of the custom platform to use with the environment.
   *
   * For more information, see [Custom
   * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html) in the
   * *AWS Elastic Beanstalk Developer Guide* .
   *
   *
   * If you specify `PlatformArn` , don't specify `SolutionStackName` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-platformarn)
   */
  public fun platformArn(): String? = unwrap(this).getPlatformArn()

  /**
   * The name of an Elastic Beanstalk solution stack (platform version) to use with the environment.
   *
   * If specified, Elastic Beanstalk sets the configuration values to the default values associated
   * with the specified solution stack. For a list of current solution stacks, see [Elastic Beanstalk
   * Supported
   * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html)
   * in the *AWS Elastic Beanstalk Platforms* guide.
   *
   *
   * If you specify `SolutionStackName` , don't specify `PlatformArn` or `TemplateName` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-solutionstackname)
   */
  public fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

  /**
   * Specifies the tags applied to resources in the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the Elastic Beanstalk configuration template to use with the environment.
   *
   *
   * If you specify `TemplateName` , then don't specify `SolutionStackName` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-templatename)
   */
  public fun templateName(): String? = unwrap(this).getTemplateName()

  /**
   * Specifies the tier to use in creating this environment.
   *
   * The environment tier that you choose determines whether Elastic Beanstalk provisions resources
   * to support a web application that handles HTTP(S) requests or a web application that handles
   * background-processing tasks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
   */
  public fun tier(): Any? = unwrap(this).getTier()

  /**
   * The name of the application version to deploy.
   *
   * Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-versionlabel)
   */
  public fun versionLabel(): String? = unwrap(this).getVersionLabel()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The name of the application that is associated with this environment. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param cnamePrefix If specified, the environment attempts to use this value as the prefix for
     * the CNAME in your Elastic Beanstalk environment URL.
     * If not specified, the CNAME is generated automatically by appending a random alphanumeric
     * string to the environment name.
     */
    public fun cnamePrefix(cnamePrefix: String)

    /**
     * @param description Your description for this environment.
     */
    public fun description(description: String)

    /**
     * @param environmentName A unique name for the environment.
     * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters,
     * numbers, and hyphens. It can't start or end with a hyphen. This name must be unique within a
     * region in your account.
     *
     * If you don't specify the `CNAMEPrefix` parameter, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     *
     * If you don't specify an environment name, AWS CloudFormation generates a unique physical ID
     * and uses that ID for the environment name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun environmentName(environmentName: String)

    /**
     * @param operationsRole The operations role feature of AWS Elastic Beanstalk is in beta release
     * and is subject to change.
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's
     * operations role. If specified, Elastic Beanstalk uses the operations role for permissions to
     * downstream services during this call and during subsequent calls acting on this environment. To
     * specify an operations role, you must have the `iam:PassRole` permission for the role.
     */
    public fun operationsRole(operationsRole: String)

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     * such as the instance type.
     * These options override the values that are defined in the solution stack or the
     * [configuration
     * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * . If you remove any options during a stack update, the removed options retain their current
     * values.
     */
    public fun optionSettings(optionSettings: IResolvable)

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     * such as the instance type.
     * These options override the values that are defined in the solution stack or the
     * [configuration
     * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * . If you remove any options during a stack update, the removed options retain their current
     * values.
     */
    public fun optionSettings(optionSettings: List<Any>)

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     * such as the instance type.
     * These options override the values that are defined in the solution stack or the
     * [configuration
     * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * . If you remove any options during a stack update, the removed options retain their current
     * values.
     */
    public fun optionSettings(vararg optionSettings: Any)

    /**
     * @param platformArn The Amazon Resource Name (ARN) of the custom platform to use with the
     * environment.
     * For more information, see [Custom
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html) in the
     * *AWS Elastic Beanstalk Developer Guide* .
     *
     *
     * If you specify `PlatformArn` , don't specify `SolutionStackName` .
     */
    public fun platformArn(platformArn: String)

    /**
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     * to use with the environment.
     * If specified, Elastic Beanstalk sets the configuration values to the default values
     * associated with the specified solution stack. For a list of current solution stacks, see
     * [Elastic Beanstalk Supported
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html)
     * in the *AWS Elastic Beanstalk Platforms* guide.
     *
     *
     * If you specify `SolutionStackName` , don't specify `PlatformArn` or `TemplateName` .
     */
    public fun solutionStackName(solutionStackName: String)

    /**
     * @param tags Specifies the tags applied to resources in the environment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies the tags applied to resources in the environment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param templateName The name of the Elastic Beanstalk configuration template to use with the
     * environment.
     *
     * If you specify `TemplateName` , then don't specify `SolutionStackName` .
     */
    public fun templateName(templateName: String)

    /**
     * @param tier Specifies the tier to use in creating this environment.
     * The environment tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a web application that
     * handles background-processing tasks.
     */
    public fun tier(tier: IResolvable)

    /**
     * @param tier Specifies the tier to use in creating this environment.
     * The environment tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a web application that
     * handles background-processing tasks.
     */
    public fun tier(tier: CfnEnvironment.TierProperty)

    /**
     * @param tier Specifies the tier to use in creating this environment.
     * The environment tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a web application that
     * handles background-processing tasks.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0325c6bffe853836c3f1a8af9d71f618fa1b11625d09ed79c079ba050111fecb")
    public fun tier(tier: CfnEnvironment.TierProperty.Builder.() -> Unit)

    /**
     * @param versionLabel The name of the application version to deploy.
     * Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
     */
    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.builder()

    /**
     * @param applicationName The name of the application that is associated with this environment. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param cnamePrefix If specified, the environment attempts to use this value as the prefix for
     * the CNAME in your Elastic Beanstalk environment URL.
     * If not specified, the CNAME is generated automatically by appending a random alphanumeric
     * string to the environment name.
     */
    override fun cnamePrefix(cnamePrefix: String) {
      cdkBuilder.cnamePrefix(cnamePrefix)
    }

    /**
     * @param description Your description for this environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param environmentName A unique name for the environment.
     * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters,
     * numbers, and hyphens. It can't start or end with a hyphen. This name must be unique within a
     * region in your account.
     *
     * If you don't specify the `CNAMEPrefix` parameter, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     *
     * If you don't specify an environment name, AWS CloudFormation generates a unique physical ID
     * and uses that ID for the environment name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param operationsRole The operations role feature of AWS Elastic Beanstalk is in beta release
     * and is subject to change.
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's
     * operations role. If specified, Elastic Beanstalk uses the operations role for permissions to
     * downstream services during this call and during subsequent calls acting on this environment. To
     * specify an operations role, you must have the `iam:PassRole` permission for the role.
     */
    override fun operationsRole(operationsRole: String) {
      cdkBuilder.operationsRole(operationsRole)
    }

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     * such as the instance type.
     * These options override the values that are defined in the solution stack or the
     * [configuration
     * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * . If you remove any options during a stack update, the removed options retain their current
     * values.
     */
    override fun optionSettings(optionSettings: IResolvable) {
      cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
    }

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     * such as the instance type.
     * These options override the values that are defined in the solution stack or the
     * [configuration
     * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * . If you remove any options during a stack update, the removed options retain their current
     * values.
     */
    override fun optionSettings(optionSettings: List<Any>) {
      cdkBuilder.optionSettings(optionSettings)
    }

    /**
     * @param optionSettings Key-value pairs defining configuration options for this environment,
     * such as the instance type.
     * These options override the values that are defined in the solution stack or the
     * [configuration
     * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * . If you remove any options during a stack update, the removed options retain their current
     * values.
     */
    override fun optionSettings(vararg optionSettings: Any): Unit =
        optionSettings(optionSettings.toList())

    /**
     * @param platformArn The Amazon Resource Name (ARN) of the custom platform to use with the
     * environment.
     * For more information, see [Custom
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html) in the
     * *AWS Elastic Beanstalk Developer Guide* .
     *
     *
     * If you specify `PlatformArn` , don't specify `SolutionStackName` .
     */
    override fun platformArn(platformArn: String) {
      cdkBuilder.platformArn(platformArn)
    }

    /**
     * @param solutionStackName The name of an Elastic Beanstalk solution stack (platform version)
     * to use with the environment.
     * If specified, Elastic Beanstalk sets the configuration values to the default values
     * associated with the specified solution stack. For a list of current solution stacks, see
     * [Elastic Beanstalk Supported
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html)
     * in the *AWS Elastic Beanstalk Platforms* guide.
     *
     *
     * If you specify `SolutionStackName` , don't specify `PlatformArn` or `TemplateName` .
     */
    override fun solutionStackName(solutionStackName: String) {
      cdkBuilder.solutionStackName(solutionStackName)
    }

    /**
     * @param tags Specifies the tags applied to resources in the environment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies the tags applied to resources in the environment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param templateName The name of the Elastic Beanstalk configuration template to use with the
     * environment.
     *
     * If you specify `TemplateName` , then don't specify `SolutionStackName` .
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    /**
     * @param tier Specifies the tier to use in creating this environment.
     * The environment tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a web application that
     * handles background-processing tasks.
     */
    override fun tier(tier: IResolvable) {
      cdkBuilder.tier(tier.let(IResolvable::unwrap))
    }

    /**
     * @param tier Specifies the tier to use in creating this environment.
     * The environment tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a web application that
     * handles background-processing tasks.
     */
    override fun tier(tier: CfnEnvironment.TierProperty) {
      cdkBuilder.tier(tier.let(CfnEnvironment.TierProperty::unwrap))
    }

    /**
     * @param tier Specifies the tier to use in creating this environment.
     * The environment tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a web application that
     * handles background-processing tasks.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0325c6bffe853836c3f1a8af9d71f618fa1b11625d09ed79c079ba050111fecb")
    override fun tier(tier: CfnEnvironment.TierProperty.Builder.() -> Unit): Unit =
        tier(CfnEnvironment.TierProperty(tier))

    /**
     * @param versionLabel The name of the application version to deploy.
     * Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
     */
    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    /**
     * The name of the application that is associated with this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * If specified, the environment attempts to use this value as the prefix for the CNAME in your
     * Elastic Beanstalk environment URL.
     *
     * If not specified, the CNAME is generated automatically by appending a random alphanumeric
     * string to the environment name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-cnameprefix)
     */
    override fun cnamePrefix(): String? = unwrap(this).getCnamePrefix()

    /**
     * Your description for this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A unique name for the environment.
     *
     * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters,
     * numbers, and hyphens. It can't start or end with a hyphen. This name must be unique within a
     * region in your account.
     *
     * If you don't specify the `CNAMEPrefix` parameter, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     *
     * If you don't specify an environment name, AWS CloudFormation generates a unique physical ID
     * and uses that ID for the environment name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-environmentname)
     */
    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /**
     * The operations role feature of AWS Elastic Beanstalk is in beta release and is subject to
     * change.
     *
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's
     * operations role. If specified, Elastic Beanstalk uses the operations role for permissions to
     * downstream services during this call and during subsequent calls acting on this environment. To
     * specify an operations role, you must have the `iam:PassRole` permission for the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-operationsrole)
     */
    override fun operationsRole(): String? = unwrap(this).getOperationsRole()

    /**
     * Key-value pairs defining configuration options for this environment, such as the instance
     * type.
     *
     * These options override the values that are defined in the solution stack or the
     * [configuration
     * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-beanstalk-configurationtemplate.html)
     * . If you remove any options during a stack update, the removed options retain their current
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-optionsettings)
     */
    override fun optionSettings(): Any? = unwrap(this).getOptionSettings()

    /**
     * The Amazon Resource Name (ARN) of the custom platform to use with the environment.
     *
     * For more information, see [Custom
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html) in the
     * *AWS Elastic Beanstalk Developer Guide* .
     *
     *
     * If you specify `PlatformArn` , don't specify `SolutionStackName` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-platformarn)
     */
    override fun platformArn(): String? = unwrap(this).getPlatformArn()

    /**
     * The name of an Elastic Beanstalk solution stack (platform version) to use with the
     * environment.
     *
     * If specified, Elastic Beanstalk sets the configuration values to the default values
     * associated with the specified solution stack. For a list of current solution stacks, see
     * [Elastic Beanstalk Supported
     * Platforms](https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html)
     * in the *AWS Elastic Beanstalk Platforms* guide.
     *
     *
     * If you specify `SolutionStackName` , don't specify `PlatformArn` or `TemplateName` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-solutionstackname)
     */
    override fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

    /**
     * Specifies the tags applied to resources in the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the Elastic Beanstalk configuration template to use with the environment.
     *
     *
     * If you specify `TemplateName` , then don't specify `SolutionStackName` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-templatename)
     */
    override fun templateName(): String? = unwrap(this).getTemplateName()

    /**
     * Specifies the tier to use in creating this environment.
     *
     * The environment tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a web application that
     * handles background-processing tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-tier)
     */
    override fun tier(): Any? = unwrap(this).getTier()

    /**
     * The name of the application version to deploy.
     *
     * Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-environment.html#cfn-elasticbeanstalk-environment-versionlabel)
     */
    override fun versionLabel(): String? = unwrap(this).getVersionLabel()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps):
        CfnEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps
  }
}
