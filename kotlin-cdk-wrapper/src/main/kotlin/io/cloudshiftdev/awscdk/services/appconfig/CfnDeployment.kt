@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
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
 * * Choose a pre-defined deployment strategy or create your own
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
 * .dynamicExtensionParameters(List.of(DynamicExtensionParametersProperty.builder()
 * .extensionReference("extensionReference")
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
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
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.CfnDeployment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeploymentProps.Companion::unwrap))
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
   * A map of dynamic extension parameter names to values to pass to associated extensions with
   * `PRE_START_DEPLOYMENT` actions.
   */
  public open fun dynamicExtensionParameters(): Any? = unwrap(this).getDynamicExtensionParameters()

  /**
   * A map of dynamic extension parameter names to values to pass to associated extensions with
   * `PRE_START_DEPLOYMENT` actions.
   */
  public open fun dynamicExtensionParameters(`value`: IResolvable) {
    unwrap(this).setDynamicExtensionParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A map of dynamic extension parameter names to values to pass to associated extensions with
   * `PRE_START_DEPLOYMENT` actions.
   */
  public open fun dynamicExtensionParameters(`value`: List<Any>) {
    unwrap(this).setDynamicExtensionParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A map of dynamic extension parameter names to values to pass to associated extensions with
   * `PRE_START_DEPLOYMENT` actions.
   */
  public open fun dynamicExtensionParameters(vararg `value`: Any): Unit =
      dynamicExtensionParameters(`value`.toList())

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
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
     * A map of dynamic extension parameter names to values to pass to associated extensions with
     * `PRE_START_DEPLOYMENT` actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-dynamicextensionparameters)
     * @param dynamicExtensionParameters A map of dynamic extension parameter names to values to
     * pass to associated extensions with `PRE_START_DEPLOYMENT` actions. 
     */
    public fun dynamicExtensionParameters(dynamicExtensionParameters: IResolvable)

    /**
     * A map of dynamic extension parameter names to values to pass to associated extensions with
     * `PRE_START_DEPLOYMENT` actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-dynamicextensionparameters)
     * @param dynamicExtensionParameters A map of dynamic extension parameter names to values to
     * pass to associated extensions with `PRE_START_DEPLOYMENT` actions. 
     */
    public fun dynamicExtensionParameters(dynamicExtensionParameters: List<Any>)

    /**
     * A map of dynamic extension parameter names to values to pass to associated extensions with
     * `PRE_START_DEPLOYMENT` actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-dynamicextensionparameters)
     * @param dynamicExtensionParameters A map of dynamic extension parameter names to values to
     * pass to associated extensions with `PRE_START_DEPLOYMENT` actions. 
     */
    public fun dynamicExtensionParameters(vararg dynamicExtensionParameters: Any)

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
     * A map of dynamic extension parameter names to values to pass to associated extensions with
     * `PRE_START_DEPLOYMENT` actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-dynamicextensionparameters)
     * @param dynamicExtensionParameters A map of dynamic extension parameter names to values to
     * pass to associated extensions with `PRE_START_DEPLOYMENT` actions. 
     */
    override fun dynamicExtensionParameters(dynamicExtensionParameters: IResolvable) {
      cdkBuilder.dynamicExtensionParameters(dynamicExtensionParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * A map of dynamic extension parameter names to values to pass to associated extensions with
     * `PRE_START_DEPLOYMENT` actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-dynamicextensionparameters)
     * @param dynamicExtensionParameters A map of dynamic extension parameter names to values to
     * pass to associated extensions with `PRE_START_DEPLOYMENT` actions. 
     */
    override fun dynamicExtensionParameters(dynamicExtensionParameters: List<Any>) {
      cdkBuilder.dynamicExtensionParameters(dynamicExtensionParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A map of dynamic extension parameter names to values to pass to associated extensions with
     * `PRE_START_DEPLOYMENT` actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-dynamicextensionparameters)
     * @param dynamicExtensionParameters A map of dynamic extension parameter names to values to
     * pass to associated extensions with `PRE_START_DEPLOYMENT` actions. 
     */
    override fun dynamicExtensionParameters(vararg dynamicExtensionParameters: Any): Unit =
        dynamicExtensionParameters(dynamicExtensionParameters.toList())

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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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

  /**
   * A map of dynamic extension parameter names to values to pass to associated extensions with
   * `PRE_START_DEPLOYMENT` actions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appconfig.*;
   * DynamicExtensionParametersProperty dynamicExtensionParametersProperty =
   * DynamicExtensionParametersProperty.builder()
   * .extensionReference("extensionReference")
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-dynamicextensionparameters.html)
   */
  public interface DynamicExtensionParametersProperty {
    /**
     * The ARN or ID of the extension for which you are inserting a dynamic parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-dynamicextensionparameters.html#cfn-appconfig-deployment-dynamicextensionparameters-extensionreference)
     */
    public fun extensionReference(): String? = unwrap(this).getExtensionReference()

    /**
     * The parameter name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-dynamicextensionparameters.html#cfn-appconfig-deployment-dynamicextensionparameters-parametername)
     */
    public fun parameterName(): String? = unwrap(this).getParameterName()

    /**
     * The parameter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-dynamicextensionparameters.html#cfn-appconfig-deployment-dynamicextensionparameters-parametervalue)
     */
    public fun parameterValue(): String? = unwrap(this).getParameterValue()

    /**
     * A builder for [DynamicExtensionParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param extensionReference The ARN or ID of the extension for which you are inserting a
       * dynamic parameter.
       */
      public fun extensionReference(extensionReference: String)

      /**
       * @param parameterName The parameter name.
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue The parameter value.
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnDeployment.DynamicExtensionParametersProperty.Builder
          =
          software.amazon.awscdk.services.appconfig.CfnDeployment.DynamicExtensionParametersProperty.builder()

      /**
       * @param extensionReference The ARN or ID of the extension for which you are inserting a
       * dynamic parameter.
       */
      override fun extensionReference(extensionReference: String) {
        cdkBuilder.extensionReference(extensionReference)
      }

      /**
       * @param parameterName The parameter name.
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue The parameter value.
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.appconfig.CfnDeployment.DynamicExtensionParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appconfig.CfnDeployment.DynamicExtensionParametersProperty,
    ) : CdkObject(cdkObject),
        DynamicExtensionParametersProperty {
      /**
       * The ARN or ID of the extension for which you are inserting a dynamic parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-dynamicextensionparameters.html#cfn-appconfig-deployment-dynamicextensionparameters-extensionreference)
       */
      override fun extensionReference(): String? = unwrap(this).getExtensionReference()

      /**
       * The parameter name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-dynamicextensionparameters.html#cfn-appconfig-deployment-dynamicextensionparameters-parametername)
       */
      override fun parameterName(): String? = unwrap(this).getParameterName()

      /**
       * The parameter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-dynamicextensionparameters.html#cfn-appconfig-deployment-dynamicextensionparameters-parametervalue)
       */
      override fun parameterValue(): String? = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynamicExtensionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnDeployment.DynamicExtensionParametersProperty):
          DynamicExtensionParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DynamicExtensionParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamicExtensionParametersProperty):
          software.amazon.awscdk.services.appconfig.CfnDeployment.DynamicExtensionParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnDeployment.DynamicExtensionParametersProperty
    }
  }
}
