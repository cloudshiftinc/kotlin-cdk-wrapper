@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPartnerApp`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnPartnerAppProps cfnPartnerAppProps = CfnPartnerAppProps.builder()
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
 * .kmsKeyId("kmsKeyId")
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
public interface CfnPartnerAppProps {
  /**
   * Configuration settings for the Partner AI App.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
   */
  public fun applicationConfig(): Any? = unwrap(this).getApplicationConfig()

  /**
   * Defines the authentication type used for the Partner AI App.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-authtype)
   */
  public fun authType(): String

  /**
   * (deprecated) The client token for the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-clienttoken)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Enables IAM Session based Identity for PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
   */
  public fun enableIamSessionBasedIdentity(): Any? = unwrap(this).getEnableIamSessionBasedIdentity()

  /**
   * The Amazon Resource Name (ARN) of the IAM role of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-executionrolearn)
   */
  public fun executionRoleArn(): String

  /**
   * The AWS KMS customer managed key used to encrypt the data associated with the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * A collection of settings that specify the maintenance schedule for the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
   */
  public fun maintenanceConfig(): Any? = unwrap(this).getMaintenanceConfig()

  /**
   * The name of the Partner AI App.
   *
   * This name must be unique within your account and region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-name)
   */
  public fun name(): String

  /**
   * A list of tags to apply to the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the tier or level of the Partner AI App.
   *
   * The tier size impacts the speed and capabilities of the application. For more information, see
   * [Set up Partner AI Apps](https://docs.aws.amazon.com/sagemaker/latest/dg/partner-app-onboard.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tier)
   */
  public fun tier(): String

  /**
   * Specifies the type of Partner AI App being created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnPartnerAppProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationConfig Configuration settings for the Partner AI App.
     */
    public fun applicationConfig(applicationConfig: IResolvable)

    /**
     * @param applicationConfig Configuration settings for the Partner AI App.
     */
    public fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty)

    /**
     * @param applicationConfig Configuration settings for the Partner AI App.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef4fb31b8aaaeb6d65f8afbed209c5f21d74ae9b34304866e9c69f65167e67b")
    public
        fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty.Builder.() -> Unit)

    /**
     * @param authType Defines the authentication type used for the Partner AI App. 
     */
    public fun authType(authType: String)

    /**
     * @param clientToken The client token for the PartnerApp.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun clientToken(clientToken: String)

    /**
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp.
     */
    public fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: Boolean)

    /**
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp.
     */
    public fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: IResolvable)

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role of the user. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param kmsKeyId The AWS KMS customer managed key used to encrypt the data associated with the
     * PartnerApp.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp.
     */
    public fun maintenanceConfig(maintenanceConfig: IResolvable)

    /**
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp.
     */
    public
        fun maintenanceConfig(maintenanceConfig: CfnPartnerApp.PartnerAppMaintenanceConfigProperty)

    /**
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77015a9cd99ed21e514c6497f62fefe34235ccfdd97d86fd12ab9caee6817dc7")
    public
        fun maintenanceConfig(maintenanceConfig: CfnPartnerApp.PartnerAppMaintenanceConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the Partner AI App. 
     * This name must be unique within your account and region.
     */
    public fun name(name: String)

    /**
     * @param tags A list of tags to apply to the PartnerApp.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to apply to the PartnerApp.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tier Specifies the tier or level of the Partner AI App. 
     * The tier size impacts the speed and capabilities of the application. For more information,
     * see [Set up Partner AI
     * Apps](https://docs.aws.amazon.com/sagemaker/latest/dg/partner-app-onboard.html) .
     */
    public fun tier(tier: String)

    /**
     * @param type Specifies the type of Partner AI App being created. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps.builder()

    /**
     * @param applicationConfig Configuration settings for the Partner AI App.
     */
    override fun applicationConfig(applicationConfig: IResolvable) {
      cdkBuilder.applicationConfig(applicationConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param applicationConfig Configuration settings for the Partner AI App.
     */
    override fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty) {
      cdkBuilder.applicationConfig(applicationConfig.let(CfnPartnerApp.PartnerAppConfigProperty.Companion::unwrap))
    }

    /**
     * @param applicationConfig Configuration settings for the Partner AI App.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef4fb31b8aaaeb6d65f8afbed209c5f21d74ae9b34304866e9c69f65167e67b")
    override
        fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty.Builder.() -> Unit):
        Unit = applicationConfig(CfnPartnerApp.PartnerAppConfigProperty(applicationConfig))

    /**
     * @param authType Defines the authentication type used for the Partner AI App. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param clientToken The client token for the PartnerApp.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp.
     */
    override fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: Boolean) {
      cdkBuilder.enableIamSessionBasedIdentity(enableIamSessionBasedIdentity)
    }

    /**
     * @param enableIamSessionBasedIdentity Enables IAM Session based Identity for PartnerApp.
     */
    override fun enableIamSessionBasedIdentity(enableIamSessionBasedIdentity: IResolvable) {
      cdkBuilder.enableIamSessionBasedIdentity(enableIamSessionBasedIdentity.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role of the user. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param kmsKeyId The AWS KMS customer managed key used to encrypt the data associated with the
     * PartnerApp.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp.
     */
    override fun maintenanceConfig(maintenanceConfig: IResolvable) {
      cdkBuilder.maintenanceConfig(maintenanceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp.
     */
    override
        fun maintenanceConfig(maintenanceConfig: CfnPartnerApp.PartnerAppMaintenanceConfigProperty) {
      cdkBuilder.maintenanceConfig(maintenanceConfig.let(CfnPartnerApp.PartnerAppMaintenanceConfigProperty.Companion::unwrap))
    }

    /**
     * @param maintenanceConfig A collection of settings that specify the maintenance schedule for
     * the PartnerApp.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77015a9cd99ed21e514c6497f62fefe34235ccfdd97d86fd12ab9caee6817dc7")
    override
        fun maintenanceConfig(maintenanceConfig: CfnPartnerApp.PartnerAppMaintenanceConfigProperty.Builder.() -> Unit):
        Unit =
        maintenanceConfig(CfnPartnerApp.PartnerAppMaintenanceConfigProperty(maintenanceConfig))

    /**
     * @param name The name of the Partner AI App. 
     * This name must be unique within your account and region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of tags to apply to the PartnerApp.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to apply to the PartnerApp.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tier Specifies the tier or level of the Partner AI App. 
     * The tier size impacts the speed and capabilities of the application. For more information,
     * see [Set up Partner AI
     * Apps](https://docs.aws.amazon.com/sagemaker/latest/dg/partner-app-onboard.html) .
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    /**
     * @param type Specifies the type of Partner AI App being created. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps,
  ) : CdkObject(cdkObject),
      CfnPartnerAppProps {
    /**
     * Configuration settings for the Partner AI App.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     */
    override fun applicationConfig(): Any? = unwrap(this).getApplicationConfig()

    /**
     * Defines the authentication type used for the Partner AI App.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-authtype)
     */
    override fun authType(): String = unwrap(this).getAuthType()

    /**
     * (deprecated) The client token for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-clienttoken)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * Enables IAM Session based Identity for PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
     */
    override fun enableIamSessionBasedIdentity(): Any? =
        unwrap(this).getEnableIamSessionBasedIdentity()

    /**
     * The Amazon Resource Name (ARN) of the IAM role of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-executionrolearn)
     */
    override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

    /**
     * The AWS KMS customer managed key used to encrypt the data associated with the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     */
    override fun maintenanceConfig(): Any? = unwrap(this).getMaintenanceConfig()

    /**
     * The name of the Partner AI App.
     *
     * This name must be unique within your account and region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of tags to apply to the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the tier or level of the Partner AI App.
     *
     * The tier size impacts the speed and capabilities of the application. For more information,
     * see [Set up Partner AI
     * Apps](https://docs.aws.amazon.com/sagemaker/latest/dg/partner-app-onboard.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tier)
     */
    override fun tier(): String = unwrap(this).getTier()

    /**
     * Specifies the type of Partner AI App being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPartnerAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps):
        CfnPartnerAppProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPartnerAppProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPartnerAppProps):
        software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps
  }
}
