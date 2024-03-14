package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the VPC endpoint.
   *
   * See [Amazon resource
   * names](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *General
   * Reference guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The DNS name that Device Farm will use to map to the private service you want to access.
   */
  public open fun serviceDnsName(): String = unwrap(this).getServiceDnsName()

  /**
   * The DNS name that Device Farm will use to map to the private service you want to access.
   */
  public open fun serviceDnsName(`value`: String) {
    unwrap(this).setServiceDnsName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An optional description that provides details about your VPC endpoint configuration.
   */
  public open fun vpceConfigurationDescription(): String? =
      unwrap(this).getVpceConfigurationDescription()

  /**
   * An optional description that provides details about your VPC endpoint configuration.
   */
  public open fun vpceConfigurationDescription(`value`: String) {
    unwrap(this).setVpceConfigurationDescription(`value`)
  }

  /**
   * The friendly name you give to your VPC endpoint configuration to manage your configurations
   * more easily.
   */
  public open fun vpceConfigurationName(): String = unwrap(this).getVpceConfigurationName()

  /**
   * The friendly name you give to your VPC endpoint configuration to manage your configurations
   * more easily.
   */
  public open fun vpceConfigurationName(`value`: String) {
    unwrap(this).setVpceConfigurationName(`value`)
  }

  /**
   * The name of the VPC endpoint service that you want to access from Device Farm.
   */
  public open fun vpceServiceName(): String = unwrap(this).getVpceServiceName()

  /**
   * The name of the VPC endpoint service that you want to access from Device Farm.
   */
  public open fun vpceServiceName(`value`: String) {
    unwrap(this).setVpceServiceName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devicefarm.CfnVPCEConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The DNS name that Device Farm will use to map to the private service you want to access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-servicednsname)
     * @param serviceDnsName The DNS name that Device Farm will use to map to the private service
     * you want to access. 
     */
    public fun serviceDnsName(serviceDnsName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An optional description that provides details about your VPC endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationdescription)
     * @param vpceConfigurationDescription An optional description that provides details about your
     * VPC endpoint configuration. 
     */
    public fun vpceConfigurationDescription(vpceConfigurationDescription: String)

    /**
     * The friendly name you give to your VPC endpoint configuration to manage your configurations
     * more easily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationname)
     * @param vpceConfigurationName The friendly name you give to your VPC endpoint configuration to
     * manage your configurations more easily. 
     */
    public fun vpceConfigurationName(vpceConfigurationName: String)

    /**
     * The name of the VPC endpoint service that you want to access from Device Farm.
     *
     * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceservicename)
     * @param vpceServiceName The name of the VPC endpoint service that you want to access from
     * Device Farm. 
     */
    public fun vpceServiceName(vpceServiceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration.Builder
        = software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration.Builder.create(scope, id)

    /**
     * The DNS name that Device Farm will use to map to the private service you want to access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-servicednsname)
     * @param serviceDnsName The DNS name that Device Farm will use to map to the private service
     * you want to access. 
     */
    override fun serviceDnsName(serviceDnsName: String) {
      cdkBuilder.serviceDnsName(serviceDnsName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An optional description that provides details about your VPC endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationdescription)
     * @param vpceConfigurationDescription An optional description that provides details about your
     * VPC endpoint configuration. 
     */
    override fun vpceConfigurationDescription(vpceConfigurationDescription: String) {
      cdkBuilder.vpceConfigurationDescription(vpceConfigurationDescription)
    }

    /**
     * The friendly name you give to your VPC endpoint configuration to manage your configurations
     * more easily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationname)
     * @param vpceConfigurationName The friendly name you give to your VPC endpoint configuration to
     * manage your configurations more easily. 
     */
    override fun vpceConfigurationName(vpceConfigurationName: String) {
      cdkBuilder.vpceConfigurationName(vpceConfigurationName)
    }

    /**
     * The name of the VPC endpoint service that you want to access from Device Farm.
     *
     * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceservicename)
     * @param vpceServiceName The name of the VPC endpoint service that you want to access from
     * Device Farm. 
     */
    override fun vpceServiceName(vpceServiceName: String) {
      cdkBuilder.vpceServiceName(vpceServiceName)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration):
        CfnVPCEConfiguration = CfnVPCEConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEConfiguration):
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration = wrapped.cdkObject
  }
}
