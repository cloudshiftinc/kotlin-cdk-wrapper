@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppConfig::Deployment` resource starts a deployment.
 *
 * Starting a deployment in AWS AppConfig calls the `StartDeployment` API action. This call includes
 * the IDs of the AWS AppConfig application, the environment, the configuration profile, and
 * (optionally) the configuration data version to deploy. The call also includes the ID of the
 * deployment strategy to use, which determines how the configuration data is deployed.
 *
 * AWS AppConfig monitors the distribution to all hosts and reports status. If a distribution fails,
 * then AWS AppConfig rolls back the configuration.
 *
 * AWS AppConfig requires that you create resources and deploy a configuration in the following
 * order:
 *
 * * Create an application
 * * Create an environment
 * * Create a configuration profile
 * * Create a deployment strategy
 * * Deploy the configuration
 *
 * For more information, see [AWS
 * AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the
 * *AWS AppConfig User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
 * .applicationId("applicationId")
 * .configurationProfileId("configurationProfileId")
 * .configurationVersion("configurationVersion")
 * .deploymentStrategyId("deploymentStrategyId")
 * .environmentId("environmentId")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html)
 */
public open class CfnDeployment(
  cdkObject: software.amazon.awscdk.services.appconfig.CfnDeployment,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.CfnDeployment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeploymentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentProps(props)
  )

  /**
   * The application ID.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The application ID.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The configuration profile ID.
   */
  public open fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

  /**
   * The configuration profile ID.
   */
  public open fun configurationProfileId(`value`: String) {
    unwrap(this).setConfigurationProfileId(`value`)
  }

  /**
   * The configuration version to deploy.
   */
  public open fun configurationVersion(): String = unwrap(this).getConfigurationVersion()

  /**
   * The configuration version to deploy.
   */
  public open fun configurationVersion(`value`: String) {
    unwrap(this).setConfigurationVersion(`value`)
  }

  /**
   * The deployment strategy ID.
   */
  public open fun deploymentStrategyId(): String = unwrap(this).getDeploymentStrategyId()

  /**
   * The deployment strategy ID.
   */
  public open fun deploymentStrategyId(`value`: String) {
    unwrap(this).setDeploymentStrategyId(`value`)
  }

  /**
   * A description of the deployment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the deployment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The environment ID.
   */
  public open fun environmentId(): String = unwrap(this).getEnvironmentId()

  /**
   * The environment ID.
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
   * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when the
   * resource was created or updated.
   */
  public open fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when the
   * resource was created or updated.
   */
  public open fun kmsKeyIdentifier(`value`: String) {
    unwrap(this).setKmsKeyIdentifier(`value`)
  }

  /**
   * Metadata to assign to the deployment.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata to assign to the deployment.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata to assign to the deployment.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.CfnDeployment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-applicationid)
     * @param applicationId The application ID. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The configuration profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid)
     * @param configurationProfileId The configuration profile ID. 
     */
    public fun configurationProfileId(configurationProfileId: String)

    /**
     * The configuration version to deploy.
     *
     * If deploying an AWS AppConfig hosted configuration version, you can specify either the
     * version number or version label. For all other configurations, you must specify the version
     * number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion)
     * @param configurationVersion The configuration version to deploy. 
     */
    public fun configurationVersion(configurationVersion: String)

    /**
     * The deployment strategy ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid)
     * @param deploymentStrategyId The deployment strategy ID. 
     */
    public fun deploymentStrategyId(deploymentStrategyId: String)

    /**
     * A description of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description)
     * @param description A description of the deployment. 
     */
    public fun description(description: String)

    /**
     * The environment ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid)
     * @param environmentId The environment ID. 
     */
    public fun environmentId(environmentId: String)

    /**
     * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when
     * the resource was created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-kmskeyidentifier)
     * @param kmsKeyIdentifier The AWS Key Management Service key identifier (key ID, key alias, or
     * key ARN) provided when the resource was created or updated. 
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * Metadata to assign to the deployment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
     * @param tags Metadata to assign to the deployment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata to assign to the deployment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
     * @param tags Metadata to assign to the deployment. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnDeployment.Builder =
        software.amazon.awscdk.services.appconfig.CfnDeployment.Builder.create(scope, id)

    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-applicationid)
     * @param applicationId The application ID. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The configuration profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid)
     * @param configurationProfileId The configuration profile ID. 
     */
    override fun configurationProfileId(configurationProfileId: String) {
      cdkBuilder.configurationProfileId(configurationProfileId)
    }

    /**
     * The configuration version to deploy.
     *
     * If deploying an AWS AppConfig hosted configuration version, you can specify either the
     * version number or version label. For all other configurations, you must specify the version
     * number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion)
     * @param configurationVersion The configuration version to deploy. 
     */
    override fun configurationVersion(configurationVersion: String) {
      cdkBuilder.configurationVersion(configurationVersion)
    }

    /**
     * The deployment strategy ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid)
     * @param deploymentStrategyId The deployment strategy ID. 
     */
    override fun deploymentStrategyId(deploymentStrategyId: String) {
      cdkBuilder.deploymentStrategyId(deploymentStrategyId)
    }

    /**
     * A description of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description)
     * @param description A description of the deployment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The environment ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid)
     * @param environmentId The environment ID. 
     */
    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    /**
     * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when
     * the resource was created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-kmskeyidentifier)
     * @param kmsKeyIdentifier The AWS Key Management Service key identifier (key ID, key alias, or
     * key ARN) provided when the resource was created or updated. 
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * Metadata to assign to the deployment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
     * @param tags Metadata to assign to the deployment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata to assign to the deployment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
     * @param tags Metadata to assign to the deployment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnDeployment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnDeployment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnDeployment):
        CfnDeployment = CfnDeployment(cdkObject)

    internal fun unwrap(wrapped: CfnDeployment):
        software.amazon.awscdk.services.appconfig.CfnDeployment = wrapped.cdkObject as
        software.amazon.awscdk.services.appconfig.CfnDeployment
  }
}
