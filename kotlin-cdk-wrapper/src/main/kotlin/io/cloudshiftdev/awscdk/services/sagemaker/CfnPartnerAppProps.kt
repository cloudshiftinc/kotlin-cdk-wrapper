@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
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
   * A collection of configuration settings for the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
   */
  public fun applicationConfig(): Any? = unwrap(this).getApplicationConfig()

  /**
   * The Auth type of PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-authtype)
   */
  public fun authType(): String

  /**
   * The client token for the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Enables IAM Session based Identity for PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
   */
  public fun enableIamSessionBasedIdentity(): Any? = unwrap(this).getEnableIamSessionBasedIdentity()

  /**
   * The execution role for the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-executionrolearn)
   */
  public fun executionRoleArn(): String

  /**
   * A collection of settings that specify the maintenance schedule for the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
   */
  public fun maintenanceConfig(): Any? = unwrap(this).getMaintenanceConfig()

  /**
   * A name for the PartnerApp.
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
   * The tier of the PartnerApp.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tier)
   */
  public fun tier(): String

  /**
   * The type of PartnerApp.
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
     * @param applicationConfig A collection of configuration settings for the PartnerApp.
     */
    public fun applicationConfig(applicationConfig: IResolvable)

    /**
     * @param applicationConfig A collection of configuration settings for the PartnerApp.
     */
    public fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty)

    /**
     * @param applicationConfig A collection of configuration settings for the PartnerApp.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef4fb31b8aaaeb6d65f8afbed209c5f21d74ae9b34304866e9c69f65167e67b")
    public
        fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty.Builder.() -> Unit)

    /**
     * @param authType The Auth type of PartnerApp. 
     */
    public fun authType(authType: String)

    /**
     * @param clientToken The client token for the PartnerApp.
     */
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
     * @param executionRoleArn The execution role for the user. 
     */
    public fun executionRoleArn(executionRoleArn: String)

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
     * @param name A name for the PartnerApp. 
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
     * @param tier The tier of the PartnerApp. 
     */
    public fun tier(tier: String)

    /**
     * @param type The type of PartnerApp. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps.builder()

    /**
     * @param applicationConfig A collection of configuration settings for the PartnerApp.
     */
    override fun applicationConfig(applicationConfig: IResolvable) {
      cdkBuilder.applicationConfig(applicationConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param applicationConfig A collection of configuration settings for the PartnerApp.
     */
    override fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty) {
      cdkBuilder.applicationConfig(applicationConfig.let(CfnPartnerApp.PartnerAppConfigProperty.Companion::unwrap))
    }

    /**
     * @param applicationConfig A collection of configuration settings for the PartnerApp.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef4fb31b8aaaeb6d65f8afbed209c5f21d74ae9b34304866e9c69f65167e67b")
    override
        fun applicationConfig(applicationConfig: CfnPartnerApp.PartnerAppConfigProperty.Builder.() -> Unit):
        Unit = applicationConfig(CfnPartnerApp.PartnerAppConfigProperty(applicationConfig))

    /**
     * @param authType The Auth type of PartnerApp. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param clientToken The client token for the PartnerApp.
     */
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
     * @param executionRoleArn The execution role for the user. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
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
     * @param name A name for the PartnerApp. 
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
     * @param tier The tier of the PartnerApp. 
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    /**
     * @param type The type of PartnerApp. 
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
     * A collection of configuration settings for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-applicationconfig)
     */
    override fun applicationConfig(): Any? = unwrap(this).getApplicationConfig()

    /**
     * The Auth type of PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-authtype)
     */
    override fun authType(): String = unwrap(this).getAuthType()

    /**
     * The client token for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * Enables IAM Session based Identity for PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-enableiamsessionbasedidentity)
     */
    override fun enableIamSessionBasedIdentity(): Any? =
        unwrap(this).getEnableIamSessionBasedIdentity()

    /**
     * The execution role for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-executionrolearn)
     */
    override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

    /**
     * A collection of settings that specify the maintenance schedule for the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-maintenanceconfig)
     */
    override fun maintenanceConfig(): Any? = unwrap(this).getMaintenanceConfig()

    /**
     * A name for the PartnerApp.
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
     * The tier of the PartnerApp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-partnerapp.html#cfn-sagemaker-partnerapp-tier)
     */
    override fun tier(): String = unwrap(this).getTier()

    /**
     * The type of PartnerApp.
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
