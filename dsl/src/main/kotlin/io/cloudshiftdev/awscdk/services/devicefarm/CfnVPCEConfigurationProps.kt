package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCEConfigurationProps {
  /**
   * The DNS name that Device Farm will use to map to the private service you want to access.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-servicednsname)
   */
  public fun serviceDnsName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional description that provides details about your VPC endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationdescription)
   */
  public fun vpceConfigurationDescription(): String? =
      unwrap(this).getVpceConfigurationDescription()

  /**
   * The friendly name you give to your VPC endpoint configuration to manage your configurations
   * more easily.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationname)
   */
  public fun vpceConfigurationName(): String

  /**
   * The name of the VPC endpoint service that you want to access from Device Farm.
   *
   * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceservicename)
   */
  public fun vpceServiceName(): String

  /**
   * A builder for [CfnVPCEConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param serviceDnsName The DNS name that Device Farm will use to map to the private service
     * you want to access. 
     */
    public fun serviceDnsName(serviceDnsName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpceConfigurationDescription An optional description that provides details about your
     * VPC endpoint configuration.
     */
    public fun vpceConfigurationDescription(vpceConfigurationDescription: String)

    /**
     * @param vpceConfigurationName The friendly name you give to your VPC endpoint configuration to
     * manage your configurations more easily. 
     */
    public fun vpceConfigurationName(vpceConfigurationName: String)

    /**
     * @param vpceServiceName The name of the VPC endpoint service that you want to access from
     * Device Farm. 
     * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
     */
    public fun vpceServiceName(vpceServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps.builder()

    /**
     * @param serviceDnsName The DNS name that Device Farm will use to map to the private service
     * you want to access. 
     */
    override fun serviceDnsName(serviceDnsName: String) {
      cdkBuilder.serviceDnsName(serviceDnsName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpceConfigurationDescription An optional description that provides details about your
     * VPC endpoint configuration.
     */
    override fun vpceConfigurationDescription(vpceConfigurationDescription: String) {
      cdkBuilder.vpceConfigurationDescription(vpceConfigurationDescription)
    }

    /**
     * @param vpceConfigurationName The friendly name you give to your VPC endpoint configuration to
     * manage your configurations more easily. 
     */
    override fun vpceConfigurationName(vpceConfigurationName: String) {
      cdkBuilder.vpceConfigurationName(vpceConfigurationName)
    }

    /**
     * @param vpceServiceName The name of the VPC endpoint service that you want to access from
     * Device Farm. 
     * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
     */
    override fun vpceServiceName(vpceServiceName: String) {
      cdkBuilder.vpceServiceName(vpceServiceName)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps,
  ) : CdkObject(cdkObject), CfnVPCEConfigurationProps {
    /**
     * The DNS name that Device Farm will use to map to the private service you want to access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-servicednsname)
     */
    override fun serviceDnsName(): String = unwrap(this).getServiceDnsName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An optional description that provides details about your VPC endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationdescription)
     */
    override fun vpceConfigurationDescription(): String? =
        unwrap(this).getVpceConfigurationDescription()

    /**
     * The friendly name you give to your VPC endpoint configuration to manage your configurations
     * more easily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationname)
     */
    override fun vpceConfigurationName(): String = unwrap(this).getVpceConfigurationName()

    /**
     * The name of the VPC endpoint service that you want to access from Device Farm.
     *
     * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceservicename)
     */
    override fun vpceServiceName(): String = unwrap(this).getVpceServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCEConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps):
        CfnVPCEConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEConfigurationProps):
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps
  }
}
