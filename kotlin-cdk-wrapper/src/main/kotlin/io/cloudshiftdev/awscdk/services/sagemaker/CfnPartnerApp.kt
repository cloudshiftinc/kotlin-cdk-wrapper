@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource Type definition for AWS::SageMaker::PartnerApp.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnPartnerApp cfnPartnerApp = CfnPartnerApp.Builder.create(this, "MyCfnPartnerApp")
 * .authType("authType")
 * .executionRoleArn("executionRoleArn")
 * .name("name")
 * .tier("tier")
 * .type("type")
 * // the properties below are optional
 * .applicationConfig(PartnerAppConfigProperty.builder()
 * .adminUsers(List.of("adminUsers"))
 * .arguments(Map.of(
 * "argumentsKey", "arguments"))
 * .build())
 * .clientToken("clientToken")
 * .enableIamSessionBasedIdentity(false)
 * .maintenanceConfig(PartnerAppMaintenanceConfigProperty.builder()
 * .maintenanceWindowStart("maintenanceWindowStart")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html)
 */
public open class CfnPartnerApp(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerApp,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartnerAppProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnPartnerApp(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPartnerAppProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartnerAppProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPartnerAppProps(props)
  )

  /**
   * A collection of configuration settings for the PartnerApp.
   */
  public open fun applicationConfig(): Any? = unwrap(this).getApplicationConfig()

  /**
   * A collection of configuration settings for the PartnerApp.
   */
  public open fun applicationConfig(`value`: IResolvable) {
    unwrap(this).setApplicationConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A collection of configuration settings for the PartnerApp.
   */
  public open fun applicationConfig(`value`: PartnerAppConfigProperty) {
    unwrap(this).setApplicationConfig(`value`.let(PartnerAppConfigProperty.Companion::unwrap))
  }

  /**
   * A collection of configuration settings for the PartnerApp.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f220482bfab17d673941767a0886890e191998cd56d1d0654e6fcd2ff22b9cce")
  public open fun applicationConfig(`value`: PartnerAppConfigProperty.Builder.() -> Unit): Unit =
      applicationConfig(PartnerAppConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the created PartnerApp.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The AppServerUrl based on app and account-info.
   */
  public open fun attrBaseUrl(): String = unwrap(this).getAttrBaseUrl()

  /**
   * The Auth type of PartnerApp.
   */
  public open fun authType(): String = unwrap(this).getAuthType()

  /**
   * The Auth type of PartnerApp.
   */
  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The client token for the PartnerApp.
   */
  public open fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * The client token for the PartnerApp.
   */
  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  /**
   * Enables IAM Session based Identity for PartnerApp.
   */
  public open fun enableIamSessionBasedIdentity(): Any? =
      unwrap(this).getEnableIamSessionBasedIdentity()

  /**
   * Enables IAM Session based Identity for PartnerApp.
   */
  public open fun enableIamSessionBasedIdentity(`value`: Boolean) {
    unwrap(this).setEnableIamSessionBasedIdentity(`value`)
  }

  /**
   * Enables IAM Session based Identity for PartnerApp.
   */
  public open fun enableIamSessionBasedIdentity(`value`: IResolvable) {
    unwrap(this).setEnableIamSessionBasedIdentity(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The execution role for the user.
   */
  public open fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

  /**
   * The execution role for the user.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
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
   * A collection of settings that specify the maintenance schedule for the PartnerApp.
   */
  public open fun maintenanceConfig(): Any? = unwrap(this).getMaintenanceConfig()

  /**
   * A collection of settings that specify the maintenance schedule for the PartnerApp.
   */
  public open fun maintenanceConfig(`value`: IResolvable) {
    unwrap(this).setMaintenanceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A collection of settings that specify the maintenance schedule for the PartnerApp.
   */
  public open fun maintenanceConfig(`value`: PartnerAppMaintenanceConfigProperty) {
    unwrap(this).setMaintenanceConfig(`value`.let(PartnerAppMaintenanceConfigProperty.Companion::unwrap))
  }

  /**
   * A collection of settings that specify the maintenance schedule for the PartnerApp.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11e00d74e039e6e6036b6a2af479798200952962a66f1b484db5f3d58a986e99")
  public open
      fun maintenanceConfig(`value`: PartnerAppMaintenanceConfigProperty.Builder.() -> Unit): Unit =
      maintenanceConfig(PartnerAppMaintenanceConfigProperty(`value`))

  /**
   * A name for the PartnerApp.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the PartnerApp.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of tags to apply to the PartnerApp.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags to apply to the PartnerApp.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags to apply to the PartnerApp.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The tier of the PartnerApp.
   */
  public open fun tier(): String = unwrap(this).getTier()

  /**
   * The tier of the PartnerApp.
   */
  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  /**
   * The type of PartnerApp.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of PartnerApp.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnPartnerApp].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A collection of configuration settings for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     * @param applicationConfig A collection of configuration settings for the PartnerApp. 
     */
    public fun applicationConfig(applicationConfig: IResolvable)

    /**
     * A collection of configuration settings for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     * @param applicationConfig A collection of configuration settings for the PartnerApp. 
     */
    public fun applicationConfig(applicationConfig: PartnerAppConfigProperty)

    /**
     * A collection of configuration settings for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     * @param applicationConfig A collection of configuration settings for the PartnerApp. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca5ab66766d992a5f369d9da53cab9956d4e70e6bda2f25703cf28c223933247")
    public fun applicationConfig(applicationConfig: PartnerAppConfigProperty.Builder.() -> Unit)

    /**
     * The Auth type of PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-authtype)
     * @param authType The Auth type of PartnerApp. 
     */
    public fun authType(authType: String)

    /**
     * The client token for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-clienttoken)
     * @param clientToken The client token for the PartnerApp. 
     */
    public fun clientToken(clientToken: String)

    /**
     * Enables IAM Session based Identity for PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp. 
     */
    public fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: Boolean)

    /**
     * Enables IAM Session based Identity for PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp. 
     */
    public fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: IResolvable)

    /**
     * The execution role for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-executionrolearn)
     * @param executionRoleArn The execution role for the user. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp. 
     */
    public fun maintenanceConfig(maintenanceConfig: IResolvable)

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp. 
     */
    public fun maintenanceConfig(maintenanceConfig: PartnerAppMaintenanceConfigProperty)

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("996849e435beb0840dc36f3369a583db369ade7d93f01c6780958f2ba9f41951")
    public
        fun maintenanceConfig(maintenanceConfig: PartnerAppMaintenanceConfigProperty.Builder.() -> Unit)

    /**
     * A name for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-name)
     * @param name A name for the PartnerApp. 
     */
    public fun name(name: String)

    /**
     * A list of tags to apply to the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tags)
     * @param tags A list of tags to apply to the PartnerApp. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to apply to the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tags)
     * @param tags A list of tags to apply to the PartnerApp. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The tier of the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tier)
     * @param tier The tier of the PartnerApp. 
     */
    public fun tier(tier: String)

    /**
     * The type of PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-type)
     * @param type The type of PartnerApp. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnPartnerApp.Builder =
        software.amazon.awscdk.services.sagemaker.CfnPartnerApp.Builder.create(scope, id)

    /**
     * A collection of configuration settings for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     * @param applicationConfig A collection of configuration settings for the PartnerApp. 
     */
    override fun applicationConfig(applicationConfig: IResolvable) {
      cdkBuilder.applicationConfig(applicationConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A collection of configuration settings for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     * @param applicationConfig A collection of configuration settings for the PartnerApp. 
     */
    override fun applicationConfig(applicationConfig: PartnerAppConfigProperty) {
      cdkBuilder.applicationConfig(applicationConfig.let(PartnerAppConfigProperty.Companion::unwrap))
    }

    /**
     * A collection of configuration settings for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     * @param applicationConfig A collection of configuration settings for the PartnerApp. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca5ab66766d992a5f369d9da53cab9956d4e70e6bda2f25703cf28c223933247")
    override fun applicationConfig(applicationConfig: PartnerAppConfigProperty.Builder.() -> Unit):
        Unit = applicationConfig(PartnerAppConfigProperty(applicationConfig))

    /**
     * The Auth type of PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-authtype)
     * @param authType The Auth type of PartnerApp. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * The client token for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-clienttoken)
     * @param clientToken The client token for the PartnerApp. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * Enables IAM Session based Identity for PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp. 
     */
    override fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: Boolean) {
      cdkBuilder.enableIamSessionBasedIdentity(enableIamSessionBasedIdentity)
    }

    /**
     * Enables IAM Session based Identity for PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp. 
     */
    override fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: IResolvable) {
      cdkBuilder.enableIamSessionBasedIdentity(enableIamSessionBasedIdentity.let(IResolvable.Companion::unwrap))
    }

    /**
     * The execution role for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-executionrolearn)
     * @param executionRoleArn The execution role for the user. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp. 
     */
    override fun maintenanceConfig(maintenanceConfig: IResolvable) {
      cdkBuilder.maintenanceConfig(maintenanceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp. 
     */
    override fun maintenanceConfig(maintenanceConfig: PartnerAppMaintenanceConfigProperty) {
      cdkBuilder.maintenanceConfig(maintenanceConfig.let(PartnerAppMaintenanceConfigProperty.Companion::unwrap))
    }

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("996849e435beb0840dc36f3369a583db369ade7d93f01c6780958f2ba9f41951")
    override
        fun maintenanceConfig(maintenanceConfig: PartnerAppMaintenanceConfigProperty.Builder.() -> Unit):
        Unit = maintenanceConfig(PartnerAppMaintenanceConfigProperty(maintenanceConfig))

    /**
     * A name for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-name)
     * @param name A name for the PartnerApp. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of tags to apply to the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tags)
     * @param tags A list of tags to apply to the PartnerApp. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags to apply to the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tags)
     * @param tags A list of tags to apply to the PartnerApp. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The tier of the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tier)
     * @param tier The tier of the PartnerApp. 
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    /**
     * The type of PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-type)
     * @param type The type of PartnerApp. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnPartnerApp = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnPartnerApp.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPartnerApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPartnerApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerApp):
        CfnPartnerApp = CfnPartnerApp(cdkObject)

    internal fun unwrap(wrapped: CfnPartnerApp):
        software.amazon.awscdk.services.sagemaker.CfnPartnerApp = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnPartnerApp
  }

  /**
   * A collection of configuration settings for the PartnerApp.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * PartnerAppConfigProperty partnerAppConfigProperty = PartnerAppConfigProperty.builder()
   * .adminUsers(List.of("adminUsers"))
   * .arguments(Map.of(
   * "argumentsKey", "arguments"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappconfig.html)
   */
  public interface PartnerAppConfigProperty {
    /**
     * A list of users with administrator privileges for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappconfig.html#cfn-sagemaker-partnerapp-partnerappconfig-adminusers)
     */
    public fun adminUsers(): List<String> = unwrap(this).getAdminUsers() ?: emptyList()

    /**
     * A list of arguments to pass to the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappconfig.html#cfn-sagemaker-partnerapp-partnerappconfig-arguments)
     */
    public fun arguments(): Any? = unwrap(this).getArguments()

    /**
     * A builder for [PartnerAppConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adminUsers A list of users with administrator privileges for the PartnerApp.
       */
      public fun adminUsers(adminUsers: List<String>)

      /**
       * @param adminUsers A list of users with administrator privileges for the PartnerApp.
       */
      public fun adminUsers(vararg adminUsers: String)

      /**
       * @param arguments A list of arguments to pass to the PartnerApp.
       */
      public fun arguments(arguments: IResolvable)

      /**
       * @param arguments A list of arguments to pass to the PartnerApp.
       */
      public fun arguments(arguments: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppConfigProperty.builder()

      /**
       * @param adminUsers A list of users with administrator privileges for the PartnerApp.
       */
      override fun adminUsers(adminUsers: List<String>) {
        cdkBuilder.adminUsers(adminUsers)
      }

      /**
       * @param adminUsers A list of users with administrator privileges for the PartnerApp.
       */
      override fun adminUsers(vararg adminUsers: String): Unit = adminUsers(adminUsers.toList())

      /**
       * @param arguments A list of arguments to pass to the PartnerApp.
       */
      override fun arguments(arguments: IResolvable) {
        cdkBuilder.arguments(arguments.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param arguments A list of arguments to pass to the PartnerApp.
       */
      override fun arguments(arguments: Map<String, String>) {
        cdkBuilder.arguments(arguments)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppConfigProperty,
    ) : CdkObject(cdkObject),
        PartnerAppConfigProperty {
      /**
       * A list of users with administrator privileges for the PartnerApp.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappconfig.html#cfn-sagemaker-partnerapp-partnerappconfig-adminusers)
       */
      override fun adminUsers(): List<String> = unwrap(this).getAdminUsers() ?: emptyList()

      /**
       * A list of arguments to pass to the PartnerApp.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappconfig.html#cfn-sagemaker-partnerapp-partnerappconfig-arguments)
       */
      override fun arguments(): Any? = unwrap(this).getArguments()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PartnerAppConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppConfigProperty):
          PartnerAppConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? PartnerAppConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartnerAppConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppConfigProperty
    }
  }

  /**
   * A collection of settings that specify the maintenance schedule for the PartnerApp.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * PartnerAppMaintenanceConfigProperty partnerAppMaintenanceConfigProperty =
   * PartnerAppMaintenanceConfigProperty.builder()
   * .maintenanceWindowStart("maintenanceWindowStart")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappmaintenanceconfig.html)
   */
  public interface PartnerAppMaintenanceConfigProperty {
    /**
     * The maintenance window start day and time for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappmaintenanceconfig.html#cfn-sagemaker-partnerapp-partnerappmaintenanceconfig-maintenancewindowstart)
     */
    public fun maintenanceWindowStart(): String

    /**
     * A builder for [PartnerAppMaintenanceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maintenanceWindowStart The maintenance window start day and time for the PartnerApp.
       * 
       */
      public fun maintenanceWindowStart(maintenanceWindowStart: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppMaintenanceConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppMaintenanceConfigProperty.builder()

      /**
       * @param maintenanceWindowStart The maintenance window start day and time for the PartnerApp.
       * 
       */
      override fun maintenanceWindowStart(maintenanceWindowStart: String) {
        cdkBuilder.maintenanceWindowStart(maintenanceWindowStart)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppMaintenanceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppMaintenanceConfigProperty,
    ) : CdkObject(cdkObject),
        PartnerAppMaintenanceConfigProperty {
      /**
       * The maintenance window start day and time for the PartnerApp.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-partnerapp-partnerappmaintenanceconfig.html#cfn-sagemaker-partnerapp-partnerappmaintenanceconfig-maintenancewindowstart)
       */
      override fun maintenanceWindowStart(): String = unwrap(this).getMaintenanceWindowStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PartnerAppMaintenanceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppMaintenanceConfigProperty):
          PartnerAppMaintenanceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PartnerAppMaintenanceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartnerAppMaintenanceConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppMaintenanceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPartnerApp.PartnerAppMaintenanceConfigProperty
    }
  }
}
