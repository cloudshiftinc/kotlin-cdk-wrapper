@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

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
 * Properties for defining a `CfnAppBlockBuilder`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnAppBlockBuilderProps cfnAppBlockBuilderProps = CfnAppBlockBuilderProps.builder()
 * .instanceType("instanceType")
 * .name("name")
 * .platform("platform")
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * // the properties below are optional
 * .accessEndpoints(List.of(AccessEndpointProperty.builder()
 * .endpointType("endpointType")
 * .vpceId("vpceId")
 * .build()))
 * .appBlockArns(List.of("appBlockArns"))
 * .description("description")
 * .displayName("displayName")
 * .enableDefaultInternetAccess(false)
 * .iamRoleArn("iamRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html)
 */
public interface CfnAppBlockBuilderProps {
  /**
   * The access endpoints of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
   */
  public fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  /**
   * The ARN of the app block.
   *
   * *Maximum* : `1`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
   */
  public fun appBlockArns(): List<String> = unwrap(this).getAppBlockArns() ?: emptyList()

  /**
   * The description of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * Indicates whether default internet access is enabled for the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
   */
  public fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

  /**
   * The ARN of the IAM role that is applied to the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-iamrolearn)
   */
  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The instance type of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-instancetype)
   */
  public fun instanceType(): String

  /**
   * The name of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-name)
   */
  public fun name(): String

  /**
   * The platform of the app block builder.
   *
   * *Allowed values* : `WINDOWS_SERVER_2019`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-platform)
   */
  public fun platform(): String

  /**
   * The tags of the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The VPC configuration for the app block builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
   */
  public fun vpcConfig(): Any

  /**
   * A builder for [CfnAppBlockBuilderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessEndpoints The access endpoints of the app block builder.
     */
    public fun accessEndpoints(accessEndpoints: IResolvable)

    /**
     * @param accessEndpoints The access endpoints of the app block builder.
     */
    public fun accessEndpoints(accessEndpoints: List<Any>)

    /**
     * @param accessEndpoints The access endpoints of the app block builder.
     */
    public fun accessEndpoints(vararg accessEndpoints: Any)

    /**
     * @param appBlockArns The ARN of the app block.
     * *Maximum* : `1`
     */
    public fun appBlockArns(appBlockArns: List<String>)

    /**
     * @param appBlockArns The ARN of the app block.
     * *Maximum* : `1`
     */
    public fun appBlockArns(vararg appBlockArns: String)

    /**
     * @param description The description of the app block builder.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the app block builder.
     */
    public fun displayName(displayName: String)

    /**
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    /**
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    /**
     * @param iamRoleArn The ARN of the IAM role that is applied to the app block builder.
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param instanceType The instance type of the app block builder. 
     */
    public fun instanceType(instanceType: String)

    /**
     * @param name The name of the app block builder. 
     */
    public fun name(name: String)

    /**
     * @param platform The platform of the app block builder. 
     * *Allowed values* : `WINDOWS_SERVER_2019`
     */
    public fun platform(platform: String)

    /**
     * @param tags The tags of the app block builder.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags of the app block builder.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    public fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty)

    /**
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("780e93272e0f59c93eebc95748d082f36fbc729212054545a2ce81598a77bece")
    public fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps.builder()

    /**
     * @param accessEndpoints The access endpoints of the app block builder.
     */
    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessEndpoints The access endpoints of the app block builder.
     */
    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param accessEndpoints The access endpoints of the app block builder.
     */
    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    /**
     * @param appBlockArns The ARN of the app block.
     * *Maximum* : `1`
     */
    override fun appBlockArns(appBlockArns: List<String>) {
      cdkBuilder.appBlockArns(appBlockArns)
    }

    /**
     * @param appBlockArns The ARN of the app block.
     * *Maximum* : `1`
     */
    override fun appBlockArns(vararg appBlockArns: String): Unit =
        appBlockArns(appBlockArns.toList())

    /**
     * @param description The description of the app block builder.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the app block builder.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder.
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder.
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param iamRoleArn The ARN of the IAM role that is applied to the app block builder.
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param instanceType The instance type of the app block builder. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param name The name of the app block builder. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param platform The platform of the app block builder. 
     * *Allowed values* : `WINDOWS_SERVER_2019`
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param tags The tags of the app block builder.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags of the app block builder.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    override fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnAppBlockBuilder.VpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("780e93272e0f59c93eebc95748d082f36fbc729212054545a2ce81598a77bece")
    override fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty.Builder.() -> Unit): Unit
        = vpcConfig(CfnAppBlockBuilder.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps,
  ) : CdkObject(cdkObject),
      CfnAppBlockBuilderProps {
    /**
     * The access endpoints of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
     */
    override fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

    /**
     * The ARN of the app block.
     *
     * *Maximum* : `1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
     */
    override fun appBlockArns(): List<String> = unwrap(this).getAppBlockArns() ?: emptyList()

    /**
     * The description of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * Indicates whether default internet access is enabled for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
     */
    override fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

    /**
     * The ARN of the IAM role that is applied to the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-iamrolearn)
     */
    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    /**
     * The instance type of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The name of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The platform of the app block builder.
     *
     * *Allowed values* : `WINDOWS_SERVER_2019`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-platform)
     */
    override fun platform(): String = unwrap(this).getPlatform()

    /**
     * The tags of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The VPC configuration for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
     */
    override fun vpcConfig(): Any = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppBlockBuilderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps):
        CfnAppBlockBuilderProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAppBlockBuilderProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlockBuilderProps):
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps
  }
}
