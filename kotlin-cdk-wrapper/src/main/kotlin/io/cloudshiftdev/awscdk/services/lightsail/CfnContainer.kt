@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lightsail::Container` resource specifies a container service.
 *
 * A Lightsail container service is a compute resource to which you can deploy containers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnContainer cfnContainer = CfnContainer.Builder.create(this, "MyCfnContainer")
 * .power("power")
 * .scale(123)
 * .serviceName("serviceName")
 * // the properties below are optional
 * .containerServiceDeployment(ContainerServiceDeploymentProperty.builder()
 * .containers(List.of(ContainerProperty.builder()
 * .command(List.of("command"))
 * .containerName("containerName")
 * .environment(List.of(EnvironmentVariableProperty.builder()
 * .value("value")
 * .variable("variable")
 * .build()))
 * .image("image")
 * .ports(List.of(PortInfoProperty.builder()
 * .port("port")
 * .protocol("protocol")
 * .build()))
 * .build()))
 * .publicEndpoint(PublicEndpointProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .healthCheckConfig(HealthCheckConfigProperty.builder()
 * .healthyThreshold(123)
 * .intervalSeconds(123)
 * .path("path")
 * .successCodes("successCodes")
 * .timeoutSeconds(123)
 * .unhealthyThreshold(123)
 * .build())
 * .build())
 * .build())
 * .isDisabled(false)
 * .privateRegistryAccess(PrivateRegistryAccessProperty.builder()
 * .ecrImagePullerRole(EcrImagePullerRoleProperty.builder()
 * .isActive(false)
 * .principalArn("principalArn")
 * .build())
 * .build())
 * .publicDomainNames(List.of(PublicDomainNameProperty.builder()
 * .certificateName("certificateName")
 * .domainNames(List.of("domainNames"))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
 */
public open class CfnContainer(
  cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerProps,
  ) :
      this(software.amazon.awscdk.services.lightsail.CfnContainer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnContainerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContainerProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the container.
   */
  public open fun attrContainerArn(): String = unwrap(this).getAttrContainerArn()

  /**
   * The principle Amazon Resource Name (ARN) of the role.
   */
  public open fun attrPrincipalArn(): String = unwrap(this).getAttrPrincipalArn()

  /**
   * The principle Amazon Resource Name (ARN) of the role.
   */
  public open fun attrPrivateRegistryAccessEcrImagePullerRolePrincipalArn(): String =
      unwrap(this).getAttrPrivateRegistryAccessEcrImagePullerRolePrincipalArn()

  /**
   * The publicly accessible URL of the container service.
   *
   * If no public endpoint is specified in the current deployment, this URL returns a 404 response.
   */
  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  /**
   * An object that describes the current container deployment of the container service.
   */
  public open fun containerServiceDeployment(): Any? = unwrap(this).getContainerServiceDeployment()

  /**
   * An object that describes the current container deployment of the container service.
   */
  public open fun containerServiceDeployment(`value`: IResolvable) {
    unwrap(this).setContainerServiceDeployment(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that describes the current container deployment of the container service.
   */
  public open fun containerServiceDeployment(`value`: ContainerServiceDeploymentProperty) {
    unwrap(this).setContainerServiceDeployment(`value`.let(ContainerServiceDeploymentProperty.Companion::unwrap))
  }

  /**
   * An object that describes the current container deployment of the container service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f054c56b7195a01dbd63be82d391c716c6500d8a63ffcbd1007cec40f6745569")
  public open
      fun containerServiceDeployment(`value`: ContainerServiceDeploymentProperty.Builder.() -> Unit):
      Unit = containerServiceDeployment(ContainerServiceDeploymentProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A Boolean value indicating whether the container service is disabled.
   */
  public open fun isDisabled(): Any? = unwrap(this).getIsDisabled()

  /**
   * A Boolean value indicating whether the container service is disabled.
   */
  public open fun isDisabled(`value`: Boolean) {
    unwrap(this).setIsDisabled(`value`)
  }

  /**
   * A Boolean value indicating whether the container service is disabled.
   */
  public open fun isDisabled(`value`: IResolvable) {
    unwrap(this).setIsDisabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The power specification of the container service.
   */
  public open fun power(): String = unwrap(this).getPower()

  /**
   * The power specification of the container service.
   */
  public open fun power(`value`: String) {
    unwrap(this).setPower(`value`)
  }

  /**
   * An object that describes the configuration for the container service to access private
   * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
   * repositories.
   */
  public open fun privateRegistryAccess(): Any? = unwrap(this).getPrivateRegistryAccess()

  /**
   * An object that describes the configuration for the container service to access private
   * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
   * repositories.
   */
  public open fun privateRegistryAccess(`value`: IResolvable) {
    unwrap(this).setPrivateRegistryAccess(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that describes the configuration for the container service to access private
   * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
   * repositories.
   */
  public open fun privateRegistryAccess(`value`: PrivateRegistryAccessProperty) {
    unwrap(this).setPrivateRegistryAccess(`value`.let(PrivateRegistryAccessProperty.Companion::unwrap))
  }

  /**
   * An object that describes the configuration for the container service to access private
   * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
   * repositories.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38482a3fa868b9cf1aeb015531e2d0b7ac0ee30c2bc62b924eb011a5d4b93605")
  public open fun privateRegistryAccess(`value`: PrivateRegistryAccessProperty.Builder.() -> Unit):
      Unit = privateRegistryAccess(PrivateRegistryAccessProperty(`value`))

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   */
  public open fun publicDomainNames(): Any? = unwrap(this).getPublicDomainNames()

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   */
  public open fun publicDomainNames(`value`: IResolvable) {
    unwrap(this).setPublicDomainNames(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   */
  public open fun publicDomainNames(`value`: List<Any>) {
    unwrap(this).setPublicDomainNames(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   */
  public open fun publicDomainNames(vararg `value`: Any): Unit = publicDomainNames(`value`.toList())

  /**
   * The scale specification of the container service.
   */
  public open fun scale(): Number = unwrap(this).getScale()

  /**
   * The scale specification of the container service.
   */
  public open fun scale(`value`: Number) {
    unwrap(this).setScale(`value`)
  }

  /**
   * The name of the container service.
   */
  public open fun serviceName(): String = unwrap(this).getServiceName()

  /**
   * The name of the container service.
   */
  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnContainer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An object that describes the current container deployment of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service. 
     */
    public fun containerServiceDeployment(containerServiceDeployment: IResolvable)

    /**
     * An object that describes the current container deployment of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service. 
     */
    public
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty)

    /**
     * An object that describes the current container deployment of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("910de1d67437b07873e857602657233912e64a04b1bd95e036f3e6b94de73148")
    public
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty.Builder.() -> Unit)

    /**
     * A Boolean value indicating whether the container service is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
     * @param isDisabled A Boolean value indicating whether the container service is disabled. 
     */
    public fun isDisabled(isDisabled: Boolean)

    /**
     * A Boolean value indicating whether the container service is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
     * @param isDisabled A Boolean value indicating whether the container service is disabled. 
     */
    public fun isDisabled(isDisabled: IResolvable)

    /**
     * The power specification of the container service.
     *
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the
     * container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-power)
     * @param power The power specification of the container service. 
     */
    public fun power(power: String)

    /**
     * An object that describes the configuration for the container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
     * repositories.
     *
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories. 
     */
    public fun privateRegistryAccess(privateRegistryAccess: IResolvable)

    /**
     * An object that describes the configuration for the container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
     * repositories.
     *
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories. 
     */
    public fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty)

    /**
     * An object that describes the configuration for the container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
     * repositories.
     *
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51d988934b3c0025c7ccb6fe2246ff1029e269c5028299f7e8ee97c8f8ce44eb")
    public
        fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty.Builder.() -> Unit)

    /**
     * The public domain name of the container service, such as `example.com` and `www.example.com`
     * .
     *
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` . 
     */
    public fun publicDomainNames(publicDomainNames: IResolvable)

    /**
     * The public domain name of the container service, such as `example.com` and `www.example.com`
     * .
     *
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` . 
     */
    public fun publicDomainNames(publicDomainNames: List<Any>)

    /**
     * The public domain name of the container service, such as `example.com` and `www.example.com`
     * .
     *
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` . 
     */
    public fun publicDomainNames(vararg publicDomainNames: Any)

    /**
     * The scale specification of the container service.
     *
     * The scale specifies the allocated compute nodes of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-scale)
     * @param scale The scale specification of the container service. 
     */
    public fun scale(scale: Number)

    /**
     * The name of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-servicename)
     * @param serviceName The name of the container service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnContainer.Builder =
        software.amazon.awscdk.services.lightsail.CfnContainer.Builder.create(scope, id)

    /**
     * An object that describes the current container deployment of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service. 
     */
    override fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that describes the current container deployment of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service. 
     */
    override
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(ContainerServiceDeploymentProperty.Companion::unwrap))
    }

    /**
     * An object that describes the current container deployment of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("910de1d67437b07873e857602657233912e64a04b1bd95e036f3e6b94de73148")
    override
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty.Builder.() -> Unit):
        Unit =
        containerServiceDeployment(ContainerServiceDeploymentProperty(containerServiceDeployment))

    /**
     * A Boolean value indicating whether the container service is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
     * @param isDisabled A Boolean value indicating whether the container service is disabled. 
     */
    override fun isDisabled(isDisabled: Boolean) {
      cdkBuilder.isDisabled(isDisabled)
    }

    /**
     * A Boolean value indicating whether the container service is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
     * @param isDisabled A Boolean value indicating whether the container service is disabled. 
     */
    override fun isDisabled(isDisabled: IResolvable) {
      cdkBuilder.isDisabled(isDisabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The power specification of the container service.
     *
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the
     * container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-power)
     * @param power The power specification of the container service. 
     */
    override fun power(power: String) {
      cdkBuilder.power(power)
    }

    /**
     * An object that describes the configuration for the container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
     * repositories.
     *
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories. 
     */
    override fun privateRegistryAccess(privateRegistryAccess: IResolvable) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that describes the configuration for the container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
     * repositories.
     *
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories. 
     */
    override fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(PrivateRegistryAccessProperty.Companion::unwrap))
    }

    /**
     * An object that describes the configuration for the container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
     * repositories.
     *
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51d988934b3c0025c7ccb6fe2246ff1029e269c5028299f7e8ee97c8f8ce44eb")
    override
        fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty.Builder.() -> Unit):
        Unit = privateRegistryAccess(PrivateRegistryAccessProperty(privateRegistryAccess))

    /**
     * The public domain name of the container service, such as `example.com` and `www.example.com`
     * .
     *
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` . 
     */
    override fun publicDomainNames(publicDomainNames: IResolvable) {
      cdkBuilder.publicDomainNames(publicDomainNames.let(IResolvable.Companion::unwrap))
    }

    /**
     * The public domain name of the container service, such as `example.com` and `www.example.com`
     * .
     *
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` . 
     */
    override fun publicDomainNames(publicDomainNames: List<Any>) {
      cdkBuilder.publicDomainNames(publicDomainNames.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The public domain name of the container service, such as `example.com` and `www.example.com`
     * .
     *
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` . 
     */
    override fun publicDomainNames(vararg publicDomainNames: Any): Unit =
        publicDomainNames(publicDomainNames.toList())

    /**
     * The scale specification of the container service.
     *
     * The scale specifies the allocated compute nodes of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-scale)
     * @param scale The scale specification of the container service. 
     */
    override fun scale(scale: Number) {
      cdkBuilder.scale(scale)
    }

    /**
     * The name of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-servicename)
     * @param serviceName The name of the container service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnContainer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnContainer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContainer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContainer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer):
        CfnContainer = CfnContainer(cdkObject)

    internal fun unwrap(wrapped: CfnContainer):
        software.amazon.awscdk.services.lightsail.CfnContainer = wrapped.cdkObject as
        software.amazon.awscdk.services.lightsail.CfnContainer
  }

  /**
   * `Container` is a property of the
   * [ContainerServiceDeployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
   * property. It describes the settings of a container that will be launched, or that is launched, to
   * an Amazon Lightsail container service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * ContainerProperty containerProperty = ContainerProperty.builder()
   * .command(List.of("command"))
   * .containerName("containerName")
   * .environment(List.of(EnvironmentVariableProperty.builder()
   * .value("value")
   * .variable("variable")
   * .build()))
   * .image("image")
   * .ports(List.of(PortInfoProperty.builder()
   * .port("port")
   * .protocol("protocol")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
   */
  public interface ContainerProperty {
    /**
     * The launch command for the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The name of the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-containername)
     */
    public fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * The environment variables of the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The name of the image used for the container.
     *
     * Container images that are sourced from (registered and stored on) your container service
     * start with a colon ( `:` ). For example, if your container service name is `container-service-1`
     * , the container image label is `mystaticsite` , and you want to use the third version ( `3` ) of
     * the registered container image, then you should specify `:container-service-1.mystaticsite.3` .
     * To use the latest version of a container image, specify `latest` instead of a version number
     * (for example, `:container-service-1.mystaticsite.latest` ). Your container service will
     * automatically use the highest numbered version of the registered container image.
     *
     * Container images that are sourced from a public registry like Docker Hub don’t start with a
     * colon. For example, `nginx:latest` or `nginx` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-image)
     */
    public fun image(): String? = unwrap(this).getImage()

    /**
     * An object that describes the open firewall ports and protocols of the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-ports)
     */
    public fun ports(): Any? = unwrap(this).getPorts()

    /**
     * A builder for [ContainerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command The launch command for the container.
       */
      public fun command(command: List<String>)

      /**
       * @param command The launch command for the container.
       */
      public fun command(vararg command: String)

      /**
       * @param containerName The name of the container.
       */
      public fun containerName(containerName: String)

      /**
       * @param environment The environment variables of the container.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment variables of the container.
       */
      public fun environment(environment: List<Any>)

      /**
       * @param environment The environment variables of the container.
       */
      public fun environment(vararg environment: Any)

      /**
       * @param image The name of the image used for the container.
       * Container images that are sourced from (registered and stored on) your container service
       * start with a colon ( `:` ). For example, if your container service name is
       * `container-service-1` , the container image label is `mystaticsite` , and you want to use the
       * third version ( `3` ) of the registered container image, then you should specify
       * `:container-service-1.mystaticsite.3` . To use the latest version of a container image,
       * specify `latest` instead of a version number (for example,
       * `:container-service-1.mystaticsite.latest` ). Your container service will automatically use
       * the highest numbered version of the registered container image.
       *
       * Container images that are sourced from a public registry like Docker Hub don’t start with a
       * colon. For example, `nginx:latest` or `nginx` .
       */
      public fun image(image: String)

      /**
       * @param ports An object that describes the open firewall ports and protocols of the
       * container.
       */
      public fun ports(ports: IResolvable)

      /**
       * @param ports An object that describes the open firewall ports and protocols of the
       * container.
       */
      public fun ports(ports: List<Any>)

      /**
       * @param ports An object that describes the open firewall ports and protocols of the
       * container.
       */
      public fun ports(vararg ports: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty.builder()

      /**
       * @param command The launch command for the container.
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command The launch command for the container.
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param containerName The name of the container.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param environment The environment variables of the container.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environment The environment variables of the container.
       */
      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param environment The environment variables of the container.
       */
      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      /**
       * @param image The name of the image used for the container.
       * Container images that are sourced from (registered and stored on) your container service
       * start with a colon ( `:` ). For example, if your container service name is
       * `container-service-1` , the container image label is `mystaticsite` , and you want to use the
       * third version ( `3` ) of the registered container image, then you should specify
       * `:container-service-1.mystaticsite.3` . To use the latest version of a container image,
       * specify `latest` instead of a version number (for example,
       * `:container-service-1.mystaticsite.latest` ). Your container service will automatically use
       * the highest numbered version of the registered container image.
       *
       * Container images that are sourced from a public registry like Docker Hub don’t start with a
       * colon. For example, `nginx:latest` or `nginx` .
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param ports An object that describes the open firewall ports and protocols of the
       * container.
       */
      override fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ports An object that describes the open firewall ports and protocols of the
       * container.
       */
      override fun ports(ports: List<Any>) {
        cdkBuilder.ports(ports.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ports An object that describes the open firewall ports and protocols of the
       * container.
       */
      override fun ports(vararg ports: Any): Unit = ports(ports.toList())

      public fun build(): software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty,
    ) : CdkObject(cdkObject), ContainerProperty {
      /**
       * The launch command for the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The name of the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-containername)
       */
      override fun containerName(): String? = unwrap(this).getContainerName()

      /**
       * The environment variables of the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The name of the image used for the container.
       *
       * Container images that are sourced from (registered and stored on) your container service
       * start with a colon ( `:` ). For example, if your container service name is
       * `container-service-1` , the container image label is `mystaticsite` , and you want to use the
       * third version ( `3` ) of the registered container image, then you should specify
       * `:container-service-1.mystaticsite.3` . To use the latest version of a container image,
       * specify `latest` instead of a version number (for example,
       * `:container-service-1.mystaticsite.latest` ). Your container service will automatically use
       * the highest numbered version of the registered container image.
       *
       * Container images that are sourced from a public registry like Docker Hub don’t start with a
       * colon. For example, `nginx:latest` or `nginx` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-image)
       */
      override fun image(): String? = unwrap(this).getImage()

      /**
       * An object that describes the open firewall ports and protocols of the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html#cfn-lightsail-container-container-ports)
       */
      override fun ports(): Any? = unwrap(this).getPorts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty):
          ContainerProperty = CdkObjectWrappers.wrap(cdkObject) as? ContainerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty
    }
  }

  /**
   * `ContainerServiceDeployment` is a property of the
   * [AWS::Lightsail::Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
   * resource. It describes a container deployment configuration of a container service.
   *
   * A deployment specifies the settings, such as the ports and launch command, of containers that
   * are deployed to your container service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * ContainerServiceDeploymentProperty containerServiceDeploymentProperty =
   * ContainerServiceDeploymentProperty.builder()
   * .containers(List.of(ContainerProperty.builder()
   * .command(List.of("command"))
   * .containerName("containerName")
   * .environment(List.of(EnvironmentVariableProperty.builder()
   * .value("value")
   * .variable("variable")
   * .build()))
   * .image("image")
   * .ports(List.of(PortInfoProperty.builder()
   * .port("port")
   * .protocol("protocol")
   * .build()))
   * .build()))
   * .publicEndpoint(PublicEndpointProperty.builder()
   * .containerName("containerName")
   * .containerPort(123)
   * .healthCheckConfig(HealthCheckConfigProperty.builder()
   * .healthyThreshold(123)
   * .intervalSeconds(123)
   * .path("path")
   * .successCodes("successCodes")
   * .timeoutSeconds(123)
   * .unhealthyThreshold(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
   */
  public interface ContainerServiceDeploymentProperty {
    /**
     * An object that describes the configuration for the containers of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html#cfn-lightsail-container-containerservicedeployment-containers)
     */
    public fun containers(): Any? = unwrap(this).getContainers()

    /**
     * An object that describes the endpoint of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html#cfn-lightsail-container-containerservicedeployment-publicendpoint)
     */
    public fun publicEndpoint(): Any? = unwrap(this).getPublicEndpoint()

    /**
     * A builder for [ContainerServiceDeploymentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containers An object that describes the configuration for the containers of the
       * deployment.
       */
      public fun containers(containers: IResolvable)

      /**
       * @param containers An object that describes the configuration for the containers of the
       * deployment.
       */
      public fun containers(containers: List<Any>)

      /**
       * @param containers An object that describes the configuration for the containers of the
       * deployment.
       */
      public fun containers(vararg containers: Any)

      /**
       * @param publicEndpoint An object that describes the endpoint of the deployment.
       */
      public fun publicEndpoint(publicEndpoint: IResolvable)

      /**
       * @param publicEndpoint An object that describes the endpoint of the deployment.
       */
      public fun publicEndpoint(publicEndpoint: PublicEndpointProperty)

      /**
       * @param publicEndpoint An object that describes the endpoint of the deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c45185e4c5081a7a57c2048a7d30a43fc4200b5d930c77ba5f693d10f5ced8b")
      public fun publicEndpoint(publicEndpoint: PublicEndpointProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty.builder()

      /**
       * @param containers An object that describes the configuration for the containers of the
       * deployment.
       */
      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containers An object that describes the configuration for the containers of the
       * deployment.
       */
      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param containers An object that describes the configuration for the containers of the
       * deployment.
       */
      override fun containers(vararg containers: Any): Unit = containers(containers.toList())

      /**
       * @param publicEndpoint An object that describes the endpoint of the deployment.
       */
      override fun publicEndpoint(publicEndpoint: IResolvable) {
        cdkBuilder.publicEndpoint(publicEndpoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param publicEndpoint An object that describes the endpoint of the deployment.
       */
      override fun publicEndpoint(publicEndpoint: PublicEndpointProperty) {
        cdkBuilder.publicEndpoint(publicEndpoint.let(PublicEndpointProperty.Companion::unwrap))
      }

      /**
       * @param publicEndpoint An object that describes the endpoint of the deployment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c45185e4c5081a7a57c2048a7d30a43fc4200b5d930c77ba5f693d10f5ced8b")
      override fun publicEndpoint(publicEndpoint: PublicEndpointProperty.Builder.() -> Unit): Unit =
          publicEndpoint(PublicEndpointProperty(publicEndpoint))

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty,
    ) : CdkObject(cdkObject), ContainerServiceDeploymentProperty {
      /**
       * An object that describes the configuration for the containers of the deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html#cfn-lightsail-container-containerservicedeployment-containers)
       */
      override fun containers(): Any? = unwrap(this).getContainers()

      /**
       * An object that describes the endpoint of the deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html#cfn-lightsail-container-containerservicedeployment-publicendpoint)
       */
      override fun publicEndpoint(): Any? = unwrap(this).getPublicEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContainerServiceDeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty):
          ContainerServiceDeploymentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerServiceDeploymentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerServiceDeploymentProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty
    }
  }

  /**
   * Describes the IAM role that you can use to grant a Lightsail container service access to Amazon
   * ECR private repositories.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * EcrImagePullerRoleProperty ecrImagePullerRoleProperty = EcrImagePullerRoleProperty.builder()
   * .isActive(false)
   * .principalArn("principalArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-ecrimagepullerrole.html)
   */
  public interface EcrImagePullerRoleProperty {
    /**
     * A boolean value that indicates whether the `ECRImagePullerRole` is active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-ecrimagepullerrole.html#cfn-lightsail-container-ecrimagepullerrole-isactive)
     */
    public fun isActive(): Any? = unwrap(this).getIsActive()

    /**
     * The principle Amazon Resource Name (ARN) of the role.
     *
     * This property is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-ecrimagepullerrole.html#cfn-lightsail-container-ecrimagepullerrole-principalarn)
     */
    public fun principalArn(): String? = unwrap(this).getPrincipalArn()

    /**
     * A builder for [EcrImagePullerRoleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isActive A boolean value that indicates whether the `ECRImagePullerRole` is active.
       */
      public fun isActive(isActive: Boolean)

      /**
       * @param isActive A boolean value that indicates whether the `ECRImagePullerRole` is active.
       */
      public fun isActive(isActive: IResolvable)

      /**
       * @param principalArn The principle Amazon Resource Name (ARN) of the role.
       * This property is read-only.
       */
      public fun principalArn(principalArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty.builder()

      /**
       * @param isActive A boolean value that indicates whether the `ECRImagePullerRole` is active.
       */
      override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      /**
       * @param isActive A boolean value that indicates whether the `ECRImagePullerRole` is active.
       */
      override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param principalArn The principle Amazon Resource Name (ARN) of the role.
       * This property is read-only.
       */
      override fun principalArn(principalArn: String) {
        cdkBuilder.principalArn(principalArn)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty,
    ) : CdkObject(cdkObject), EcrImagePullerRoleProperty {
      /**
       * A boolean value that indicates whether the `ECRImagePullerRole` is active.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-ecrimagepullerrole.html#cfn-lightsail-container-ecrimagepullerrole-isactive)
       */
      override fun isActive(): Any? = unwrap(this).getIsActive()

      /**
       * The principle Amazon Resource Name (ARN) of the role.
       *
       * This property is read-only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-ecrimagepullerrole.html#cfn-lightsail-container-ecrimagepullerrole-principalarn)
       */
      override fun principalArn(): String? = unwrap(this).getPrincipalArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcrImagePullerRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty):
          EcrImagePullerRoleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EcrImagePullerRoleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcrImagePullerRoleProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty
    }
  }

  /**
   * `EnvironmentVariable` is a property of the
   * [Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
   * property. It describes the environment variables of a container on a container service which are
   * key-value parameters that provide dynamic configuration of the application or script run by the
   * container.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
   * .value("value")
   * .variable("variable")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-environmentvariable.html)
   */
  public interface EnvironmentVariableProperty {
    /**
     * The environment variable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-environmentvariable.html#cfn-lightsail-container-environmentvariable-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * The environment variable key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-environmentvariable.html#cfn-lightsail-container-environmentvariable-variable)
     */
    public fun variable(): String? = unwrap(this).getVariable()

    /**
     * A builder for [EnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The environment variable value.
       */
      public fun `value`(`value`: String)

      /**
       * @param variable The environment variable key.
       */
      public fun variable(variable: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty.builder()

      /**
       * @param value The environment variable value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param variable The environment variable key.
       */
      override fun variable(variable: String) {
        cdkBuilder.variable(variable)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EnvironmentVariableProperty {
      /**
       * The environment variable value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-environmentvariable.html#cfn-lightsail-container-environmentvariable-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()

      /**
       * The environment variable key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-environmentvariable.html#cfn-lightsail-container-environmentvariable-variable)
       */
      override fun variable(): String? = unwrap(this).getVariable()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty):
          EnvironmentVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty
    }
  }

  /**
   * `HealthCheckConfig` is a property of the
   * [PublicEndpoint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html)
   * property. It describes the healthcheck configuration of a container deployment on a container
   * service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
   * .healthyThreshold(123)
   * .intervalSeconds(123)
   * .path("path")
   * .successCodes("successCodes")
   * .timeoutSeconds(123)
   * .unhealthyThreshold(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html)
   */
  public interface HealthCheckConfigProperty {
    /**
     * The number of consecutive health check successes required before moving the container to the
     * `Healthy` state.
     *
     * The default value is `2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-healthythreshold)
     */
    public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    /**
     * The approximate interval, in seconds, between health checks of an individual container.
     *
     * You can specify between `5` and `300` seconds. The default value is `5` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-intervalseconds)
     */
    public fun intervalSeconds(): Number? = unwrap(this).getIntervalSeconds()

    /**
     * The path on the container on which to perform the health check.
     *
     * The default value is `/` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The HTTP codes to use when checking for a successful response from a container.
     *
     * You can specify values between `200` and `499` . You can specify multiple values (for
     * example, `200,202` ) or a range of values (for example, `200-299` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-successcodes)
     */
    public fun successCodes(): String? = unwrap(this).getSuccessCodes()

    /**
     * The amount of time, in seconds, during which no response means a failed health check.
     *
     * You can specify between `2` and `60` seconds. The default value is `2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-timeoutseconds)
     */
    public fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

    /**
     * The number of consecutive health check failures required before moving the container to the
     * `Unhealthy` state.
     *
     * The default value is `2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-unhealthythreshold)
     */
    public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

    /**
     * A builder for [HealthCheckConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthyThreshold The number of consecutive health check successes required before
       * moving the container to the `Healthy` state.
       * The default value is `2` .
       */
      public fun healthyThreshold(healthyThreshold: Number)

      /**
       * @param intervalSeconds The approximate interval, in seconds, between health checks of an
       * individual container.
       * You can specify between `5` and `300` seconds. The default value is `5` .
       */
      public fun intervalSeconds(intervalSeconds: Number)

      /**
       * @param path The path on the container on which to perform the health check.
       * The default value is `/` .
       */
      public fun path(path: String)

      /**
       * @param successCodes The HTTP codes to use when checking for a successful response from a
       * container.
       * You can specify values between `200` and `499` . You can specify multiple values (for
       * example, `200,202` ) or a range of values (for example, `200-299` ).
       */
      public fun successCodes(successCodes: String)

      /**
       * @param timeoutSeconds The amount of time, in seconds, during which no response means a
       * failed health check.
       * You can specify between `2` and `60` seconds. The default value is `2` .
       */
      public fun timeoutSeconds(timeoutSeconds: Number)

      /**
       * @param unhealthyThreshold The number of consecutive health check failures required before
       * moving the container to the `Unhealthy` state.
       * The default value is `2` .
       */
      public fun unhealthyThreshold(unhealthyThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty.builder()

      /**
       * @param healthyThreshold The number of consecutive health check successes required before
       * moving the container to the `Healthy` state.
       * The default value is `2` .
       */
      override fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      /**
       * @param intervalSeconds The approximate interval, in seconds, between health checks of an
       * individual container.
       * You can specify between `5` and `300` seconds. The default value is `5` .
       */
      override fun intervalSeconds(intervalSeconds: Number) {
        cdkBuilder.intervalSeconds(intervalSeconds)
      }

      /**
       * @param path The path on the container on which to perform the health check.
       * The default value is `/` .
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param successCodes The HTTP codes to use when checking for a successful response from a
       * container.
       * You can specify values between `200` and `499` . You can specify multiple values (for
       * example, `200,202` ) or a range of values (for example, `200-299` ).
       */
      override fun successCodes(successCodes: String) {
        cdkBuilder.successCodes(successCodes)
      }

      /**
       * @param timeoutSeconds The amount of time, in seconds, during which no response means a
       * failed health check.
       * You can specify between `2` and `60` seconds. The default value is `2` .
       */
      override fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
      }

      /**
       * @param unhealthyThreshold The number of consecutive health check failures required before
       * moving the container to the `Unhealthy` state.
       * The default value is `2` .
       */
      override fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty,
    ) : CdkObject(cdkObject), HealthCheckConfigProperty {
      /**
       * The number of consecutive health check successes required before moving the container to
       * the `Healthy` state.
       *
       * The default value is `2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-healthythreshold)
       */
      override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

      /**
       * The approximate interval, in seconds, between health checks of an individual container.
       *
       * You can specify between `5` and `300` seconds. The default value is `5` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-intervalseconds)
       */
      override fun intervalSeconds(): Number? = unwrap(this).getIntervalSeconds()

      /**
       * The path on the container on which to perform the health check.
       *
       * The default value is `/` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The HTTP codes to use when checking for a successful response from a container.
       *
       * You can specify values between `200` and `499` . You can specify multiple values (for
       * example, `200,202` ) or a range of values (for example, `200-299` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-successcodes)
       */
      override fun successCodes(): String? = unwrap(this).getSuccessCodes()

      /**
       * The amount of time, in seconds, during which no response means a failed health check.
       *
       * You can specify between `2` and `60` seconds. The default value is `2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-timeoutseconds)
       */
      override fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

      /**
       * The number of consecutive health check failures required before moving the container to the
       * `Unhealthy` state.
       *
       * The default value is `2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html#cfn-lightsail-container-healthcheckconfig-unhealthythreshold)
       */
      override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty):
          HealthCheckConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HealthCheckConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty
    }
  }

  /**
   * `PortInfo` is a property of the
   * [Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
   * property. It describes the ports to open and the protocols to use for a container on a Amazon
   * Lightsail container service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * PortInfoProperty portInfoProperty = PortInfoProperty.builder()
   * .port("port")
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-portinfo.html)
   */
  public interface PortInfoProperty {
    /**
     * The open firewall ports of the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-portinfo.html#cfn-lightsail-container-portinfo-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * The protocol name for the open ports.
     *
     * *Allowed values* : `HTTP` | `HTTPS` | `TCP` | `UDP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-portinfo.html#cfn-lightsail-container-portinfo-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * A builder for [PortInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The open firewall ports of the container.
       */
      public fun port(port: String)

      /**
       * @param protocol The protocol name for the open ports.
       * *Allowed values* : `HTTP` | `HTTPS` | `TCP` | `UDP`
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty.builder()

      /**
       * @param port The open firewall ports of the container.
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocol name for the open ports.
       * *Allowed values* : `HTTP` | `HTTPS` | `TCP` | `UDP`
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty,
    ) : CdkObject(cdkObject), PortInfoProperty {
      /**
       * The open firewall ports of the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-portinfo.html#cfn-lightsail-container-portinfo-port)
       */
      override fun port(): String? = unwrap(this).getPort()

      /**
       * The protocol name for the open ports.
       *
       * *Allowed values* : `HTTP` | `HTTPS` | `TCP` | `UDP`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-portinfo.html#cfn-lightsail-container-portinfo-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty):
          PortInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? PortInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortInfoProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty
    }
  }

  /**
   * Describes the configuration for an Amazon Lightsail container service to access private
   * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
   * repositories.
   *
   * For more information, see [Configuring access to an Amazon ECR private repository for an Amazon
   * Lightsail container
   * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
   * in the *Amazon Lightsail Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * PrivateRegistryAccessProperty privateRegistryAccessProperty =
   * PrivateRegistryAccessProperty.builder()
   * .ecrImagePullerRole(EcrImagePullerRoleProperty.builder()
   * .isActive(false)
   * .principalArn("principalArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-privateregistryaccess.html)
   */
  public interface PrivateRegistryAccessProperty {
    /**
     * An object that describes the activation status of the role that you can use to grant a
     * Lightsail container service access to Amazon ECR private repositories.
     *
     * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-privateregistryaccess.html#cfn-lightsail-container-privateregistryaccess-ecrimagepullerrole)
     */
    public fun ecrImagePullerRole(): Any? = unwrap(this).getEcrImagePullerRole()

    /**
     * A builder for [PrivateRegistryAccessProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ecrImagePullerRole An object that describes the activation status of the role that
       * you can use to grant a Lightsail container service access to Amazon ECR private repositories.
       * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
       */
      public fun ecrImagePullerRole(ecrImagePullerRole: IResolvable)

      /**
       * @param ecrImagePullerRole An object that describes the activation status of the role that
       * you can use to grant a Lightsail container service access to Amazon ECR private repositories.
       * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
       */
      public fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty)

      /**
       * @param ecrImagePullerRole An object that describes the activation status of the role that
       * you can use to grant a Lightsail container service access to Amazon ECR private repositories.
       * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa629e212b634adb107bf727e15842e667ed1f17f336bacee57bd0201774c2b2")
      public
          fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty.builder()

      /**
       * @param ecrImagePullerRole An object that describes the activation status of the role that
       * you can use to grant a Lightsail container service access to Amazon ECR private repositories.
       * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
       */
      override fun ecrImagePullerRole(ecrImagePullerRole: IResolvable) {
        cdkBuilder.ecrImagePullerRole(ecrImagePullerRole.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecrImagePullerRole An object that describes the activation status of the role that
       * you can use to grant a Lightsail container service access to Amazon ECR private repositories.
       * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
       */
      override fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty) {
        cdkBuilder.ecrImagePullerRole(ecrImagePullerRole.let(EcrImagePullerRoleProperty.Companion::unwrap))
      }

      /**
       * @param ecrImagePullerRole An object that describes the activation status of the role that
       * you can use to grant a Lightsail container service access to Amazon ECR private repositories.
       * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa629e212b634adb107bf727e15842e667ed1f17f336bacee57bd0201774c2b2")
      override
          fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty.Builder.() -> Unit):
          Unit = ecrImagePullerRole(EcrImagePullerRoleProperty(ecrImagePullerRole))

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty,
    ) : CdkObject(cdkObject), PrivateRegistryAccessProperty {
      /**
       * An object that describes the activation status of the role that you can use to grant a
       * Lightsail container service access to Amazon ECR private repositories.
       *
       * If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-privateregistryaccess.html#cfn-lightsail-container-privateregistryaccess-ecrimagepullerrole)
       */
      override fun ecrImagePullerRole(): Any? = unwrap(this).getEcrImagePullerRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateRegistryAccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty):
          PrivateRegistryAccessProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateRegistryAccessProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateRegistryAccessProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty
    }
  }

  /**
   * `PublicDomainName` is a property of the
   * [AWS::Lightsail::Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
   * resource. It describes the public domain names to use with a container service, such as
   * `example.com` and `www.example.com` . It also describes the certificates to use with a container
   * service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * PublicDomainNameProperty publicDomainNameProperty = PublicDomainNameProperty.builder()
   * .certificateName("certificateName")
   * .domainNames(List.of("domainNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicdomainname.html)
   */
  public interface PublicDomainNameProperty {
    /**
     * The name of the certificate for the public domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicdomainname.html#cfn-lightsail-container-publicdomainname-certificatename)
     */
    public fun certificateName(): String? = unwrap(this).getCertificateName()

    /**
     * The public domain names to use with the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicdomainname.html#cfn-lightsail-container-publicdomainname-domainnames)
     */
    public fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()

    /**
     * A builder for [PublicDomainNameProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateName The name of the certificate for the public domains.
       */
      public fun certificateName(certificateName: String)

      /**
       * @param domainNames The public domain names to use with the container service.
       */
      public fun domainNames(domainNames: List<String>)

      /**
       * @param domainNames The public domain names to use with the container service.
       */
      public fun domainNames(vararg domainNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty.builder()

      /**
       * @param certificateName The name of the certificate for the public domains.
       */
      override fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
      }

      /**
       * @param domainNames The public domain names to use with the container service.
       */
      override fun domainNames(domainNames: List<String>) {
        cdkBuilder.domainNames(domainNames)
      }

      /**
       * @param domainNames The public domain names to use with the container service.
       */
      override fun domainNames(vararg domainNames: String): Unit = domainNames(domainNames.toList())

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty,
    ) : CdkObject(cdkObject), PublicDomainNameProperty {
      /**
       * The name of the certificate for the public domains.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicdomainname.html#cfn-lightsail-container-publicdomainname-certificatename)
       */
      override fun certificateName(): String? = unwrap(this).getCertificateName()

      /**
       * The public domain names to use with the container service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicdomainname.html#cfn-lightsail-container-publicdomainname-domainnames)
       */
      override fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PublicDomainNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty):
          PublicDomainNameProperty = CdkObjectWrappers.wrap(cdkObject) as? PublicDomainNameProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicDomainNameProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty
    }
  }

  /**
   * `PublicEndpoint` is a property of the
   * [ContainerServiceDeployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
   * property. It describes describes the settings of the public endpoint of a container on a container
   * service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * PublicEndpointProperty publicEndpointProperty = PublicEndpointProperty.builder()
   * .containerName("containerName")
   * .containerPort(123)
   * .healthCheckConfig(HealthCheckConfigProperty.builder()
   * .healthyThreshold(123)
   * .intervalSeconds(123)
   * .path("path")
   * .successCodes("successCodes")
   * .timeoutSeconds(123)
   * .unhealthyThreshold(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html)
   */
  public interface PublicEndpointProperty {
    /**
     * The name of the container entry of the deployment that the endpoint configuration applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html#cfn-lightsail-container-publicendpoint-containername)
     */
    public fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * The port of the specified container to which traffic is forwarded to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html#cfn-lightsail-container-publicendpoint-containerport)
     */
    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * An object that describes the health check configuration of the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html#cfn-lightsail-container-publicendpoint-healthcheckconfig)
     */
    public fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

    /**
     * A builder for [PublicEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerName The name of the container entry of the deployment that the endpoint
       * configuration applies to.
       */
      public fun containerName(containerName: String)

      /**
       * @param containerPort The port of the specified container to which traffic is forwarded to.
       */
      public fun containerPort(containerPort: Number)

      /**
       * @param healthCheckConfig An object that describes the health check configuration of the
       * container.
       */
      public fun healthCheckConfig(healthCheckConfig: IResolvable)

      /**
       * @param healthCheckConfig An object that describes the health check configuration of the
       * container.
       */
      public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty)

      /**
       * @param healthCheckConfig An object that describes the health check configuration of the
       * container.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fa4e095f5a171e0db397ff2351377f66c7e234035c5d0f7629259cf0298758")
      public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty.builder()

      /**
       * @param containerName The name of the container entry of the deployment that the endpoint
       * configuration applies to.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param containerPort The port of the specified container to which traffic is forwarded to.
       */
      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      /**
       * @param healthCheckConfig An object that describes the health check configuration of the
       * container.
       */
      override fun healthCheckConfig(healthCheckConfig: IResolvable) {
        cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param healthCheckConfig An object that describes the health check configuration of the
       * container.
       */
      override fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty) {
        cdkBuilder.healthCheckConfig(healthCheckConfig.let(HealthCheckConfigProperty.Companion::unwrap))
      }

      /**
       * @param healthCheckConfig An object that describes the health check configuration of the
       * container.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fa4e095f5a171e0db397ff2351377f66c7e234035c5d0f7629259cf0298758")
      override
          fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit):
          Unit = healthCheckConfig(HealthCheckConfigProperty(healthCheckConfig))

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty,
    ) : CdkObject(cdkObject), PublicEndpointProperty {
      /**
       * The name of the container entry of the deployment that the endpoint configuration applies
       * to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html#cfn-lightsail-container-publicendpoint-containername)
       */
      override fun containerName(): String? = unwrap(this).getContainerName()

      /**
       * The port of the specified container to which traffic is forwarded to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html#cfn-lightsail-container-publicendpoint-containerport)
       */
      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      /**
       * An object that describes the health check configuration of the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html#cfn-lightsail-container-publicendpoint-healthcheckconfig)
       */
      override fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PublicEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty):
          PublicEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? PublicEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicEndpointProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty
    }
  }
}
