package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVpcIngressConnectionProps {
  /**
   * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that
   * are used to create the VPC Ingress Connection resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
   */
  public fun ingressVpcConfiguration(): Any

  /**
   * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC
   * Ingress Connection resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-servicearn)
   */
  public fun serviceArn(): String

  /**
   * An optional list of metadata items that you can associate with the VPC Ingress Connection
   * resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The customer-provided VPC Ingress Connection name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-vpcingressconnectionname)
   */
  public fun vpcIngressConnectionName(): String? = unwrap(this).getVpcIngressConnectionName()

  /**
   * A builder for [CfnVpcIngressConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    public fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable)

    /**
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    public
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty)

    /**
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d30c3f41d043623eb97c7b27cdf787eabd7c982858b01b502b236b261275ea55")
    public
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder.() -> Unit)

    /**
     * @param serviceArn The Amazon Resource Name (ARN) for this App Runner service that is used to
     * create the VPC Ingress Connection resource. 
     */
    public fun serviceArn(serviceArn: String)

    /**
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcIngressConnectionName The customer-provided VPC Ingress Connection name.
     */
    public fun vpcIngressConnectionName(vpcIngressConnectionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps.builder()

    /**
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    override fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    override
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(CfnVpcIngressConnection.IngressVpcConfigurationProperty::unwrap))
    }

    /**
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d30c3f41d043623eb97c7b27cdf787eabd7c982858b01b502b236b261275ea55")
    override
        fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder.() -> Unit):
        Unit =
        ingressVpcConfiguration(CfnVpcIngressConnection.IngressVpcConfigurationProperty(ingressVpcConfiguration))

    /**
     * @param serviceArn The Amazon Resource Name (ARN) for this App Runner service that is used to
     * create the VPC Ingress Connection resource. 
     */
    override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcIngressConnectionName The customer-provided VPC Ingress Connection name.
     */
    override fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
      cdkBuilder.vpcIngressConnectionName(vpcIngressConnectionName)
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps,
  ) : CdkObject(cdkObject), CfnVpcIngressConnectionProps {
    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     */
    override fun ingressVpcConfiguration(): Any = unwrap(this).getIngressVpcConfiguration()

    /**
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC
     * Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-servicearn)
     */
    override fun serviceArn(): String = unwrap(this).getServiceArn()

    /**
     * An optional list of metadata items that you can associate with the VPC Ingress Connection
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The customer-provided VPC Ingress Connection name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-vpcingressconnectionname)
     */
    override fun vpcIngressConnectionName(): String? = unwrap(this).getVpcIngressConnectionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcIngressConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps):
        CfnVpcIngressConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcIngressConnectionProps):
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps
  }
}
