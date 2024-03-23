@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specify an AWS App Runner VPC Ingress Connection by using the
 * `AWS::AppRunner::VpcIngressConnection` resource in an AWS CloudFormation template.
 *
 * The `AWS::AppRunner::VpcIngressConnection` resource is an AWS App Runner resource type that
 * specifies an App Runner VPC Ingress Connection.
 *
 * App Runner requires this resource when you want to associate your App Runner service to an Amazon
 * VPC endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apprunner.*;
 * CfnVpcIngressConnection cfnVpcIngressConnection = CfnVpcIngressConnection.Builder.create(this,
 * "MyCfnVpcIngressConnection")
 * .ingressVpcConfiguration(IngressVpcConfigurationProperty.builder()
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build())
 * .serviceArn("serviceArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcIngressConnectionName("vpcIngressConnectionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html)
 */
public open class CfnVpcIngressConnection(
  cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcIngressConnectionProps,
  ) :
      this(software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVpcIngressConnectionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcIngressConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVpcIngressConnectionProps(props)
  )

  /**
   * The domain name associated with the VPC Ingress Connection resource.
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   * The current status of the VPC Ingress Connection.
   *
   * The VPC Ingress Connection displays one of the following statuses: `AVAILABLE` ,
   * `PENDING_CREATION` , `PENDING_UPDATE` , `PENDING_DELETION` , `FAILED_CREATION` , `FAILED_UPDATE` ,
   * `FAILED_DELETION` , and `DELETED` ..
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
   */
  public open fun attrVpcIngressConnectionArn(): String =
      unwrap(this).getAttrVpcIngressConnectionArn()

  /**
   * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that
   * are used to create the VPC Ingress Connection resource.
   */
  public open fun ingressVpcConfiguration(): Any = unwrap(this).getIngressVpcConfiguration()

  /**
   * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that
   * are used to create the VPC Ingress Connection resource.
   */
  public open fun ingressVpcConfiguration(`value`: IResolvable) {
    unwrap(this).setIngressVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that
   * are used to create the VPC Ingress Connection resource.
   */
  public open fun ingressVpcConfiguration(`value`: IngressVpcConfigurationProperty) {
    unwrap(this).setIngressVpcConfiguration(`value`.let(IngressVpcConfigurationProperty::unwrap))
  }

  /**
   * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that
   * are used to create the VPC Ingress Connection resource.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("465498462b9de592866f9a8f249515eb5e34c2c02bafdb4d2a2a9e55df7c6c2b")
  public open
      fun ingressVpcConfiguration(`value`: IngressVpcConfigurationProperty.Builder.() -> Unit): Unit
      = ingressVpcConfiguration(IngressVpcConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC
   * Ingress Connection resource.
   */
  public open fun serviceArn(): String = unwrap(this).getServiceArn()

  /**
   * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC
   * Ingress Connection resource.
   */
  public open fun serviceArn(`value`: String) {
    unwrap(this).setServiceArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional list of metadata items that you can associate with the VPC Ingress Connection
   * resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional list of metadata items that you can associate with the VPC Ingress Connection
   * resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional list of metadata items that you can associate with the VPC Ingress Connection
   * resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The customer-provided VPC Ingress Connection name.
   */
  public open fun vpcIngressConnectionName(): String? = unwrap(this).getVpcIngressConnectionName()

  /**
   * The customer-provided VPC Ingress Connection name.
   */
  public open fun vpcIngressConnectionName(`value`: String) {
    unwrap(this).setVpcIngressConnectionName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apprunner.CfnVpcIngressConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    public fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable)

    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    public fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty)

    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80b0ca5f0097ddac8852115093d814ff5b98399275ebb4b5a669f001d5066de5")
    public
        fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC
     * Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-servicearn)
     * @param serviceArn The Amazon Resource Name (ARN) for this App Runner service that is used to
     * create the VPC Ingress Connection resource. 
     */
    public fun serviceArn(serviceArn: String)

    /**
     * An optional list of metadata items that you can associate with the VPC Ingress Connection
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional list of metadata items that you can associate with the VPC Ingress Connection
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The customer-provided VPC Ingress Connection name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-vpcingressconnectionname)
     * @param vpcIngressConnectionName The customer-provided VPC Ingress Connection name. 
     */
    public fun vpcIngressConnectionName(vpcIngressConnectionName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.Builder =
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.Builder.create(scope, id)

    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    override fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    override fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty) {
      cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration.let(IngressVpcConfigurationProperty::unwrap))
    }

    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     * AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80b0ca5f0097ddac8852115093d814ff5b98399275ebb4b5a669f001d5066de5")
    override
        fun ingressVpcConfiguration(ingressVpcConfiguration: IngressVpcConfigurationProperty.Builder.() -> Unit):
        Unit = ingressVpcConfiguration(IngressVpcConfigurationProperty(ingressVpcConfiguration))

    /**
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC
     * Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-servicearn)
     * @param serviceArn The Amazon Resource Name (ARN) for this App Runner service that is used to
     * create the VPC Ingress Connection resource. 
     */
    override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    /**
     * An optional list of metadata items that you can associate with the VPC Ingress Connection
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An optional list of metadata items that you can associate with the VPC Ingress Connection
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     * Connection resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The customer-provided VPC Ingress Connection name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-vpcingressconnectionname)
     * @param vpcIngressConnectionName The customer-provided VPC Ingress Connection name. 
     */
    override fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
      cdkBuilder.vpcIngressConnectionName(vpcIngressConnectionName)
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcIngressConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcIngressConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection):
        CfnVpcIngressConnection = CfnVpcIngressConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVpcIngressConnection):
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection = wrapped.cdkObject as
        software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
  }

  /**
   * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to
   * associate with the VPC Ingress Connection resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apprunner.*;
   * IngressVpcConfigurationProperty ingressVpcConfigurationProperty =
   * IngressVpcConfigurationProperty.builder()
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-vpcingressconnection-ingressvpcconfiguration.html)
   */
  public interface IngressVpcConfigurationProperty {
    /**
     * The ID of the VPC endpoint that your App Runner service connects to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-vpcingressconnection-ingressvpcconfiguration.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration-vpcendpointid)
     */
    public fun vpcEndpointId(): String

    /**
     * The ID of the VPC that is used for the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-vpcingressconnection-ingressvpcconfiguration.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration-vpcid)
     */
    public fun vpcId(): String

    /**
     * A builder for [IngressVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcEndpointId The ID of the VPC endpoint that your App Runner service connects to. 
       */
      public fun vpcEndpointId(vpcEndpointId: String)

      /**
       * @param vpcId The ID of the VPC that is used for the VPC endpoint. 
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder()

      /**
       * @param vpcEndpointId The ID of the VPC endpoint that your App Runner service connects to. 
       */
      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      /**
       * @param vpcId The ID of the VPC that is used for the VPC endpoint. 
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty,
    ) : CdkObject(cdkObject), IngressVpcConfigurationProperty {
      /**
       * The ID of the VPC endpoint that your App Runner service connects to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-vpcingressconnection-ingressvpcconfiguration.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration-vpcendpointid)
       */
      override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

      /**
       * The ID of the VPC that is used for the VPC endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-vpcingressconnection-ingressvpcconfiguration.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration-vpcid)
       */
      override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty):
          IngressVpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressVpcConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressVpcConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection.IngressVpcConfigurationProperty
    }
  }
}
