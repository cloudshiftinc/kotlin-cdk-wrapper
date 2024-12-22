@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::DomainNameV2` resource specifies a custom domain name for your private APIs
 * in API Gateway.
 *
 * You can use a private custom domain name to provide a URL for your private API that's more
 * intuitive and easier to recall.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Object managementPolicy;
 * Object policy;
 * CfnDomainNameV2 cfnDomainNameV2 = CfnDomainNameV2.Builder.create(this, "MyCfnDomainNameV2")
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * .endpointConfiguration(EndpointConfigurationProperty.builder()
 * .types(List.of("types"))
 * .build())
 * .managementPolicy(managementPolicy)
 * .policy(policy)
 * .securityPolicy("securityPolicy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html)
 */
public open class CfnDomainNameV2(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameV2,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigateway.CfnDomainNameV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameV2Props,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnDomainNameV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainNameV2Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameV2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainNameV2Props(props)
  )

  /**
   * The ARN of the domain name.
   */
  public open fun attrDomainNameArn(): String = unwrap(this).getAttrDomainNameArn()

  /**
   * The domain name ID.
   */
  public open fun attrDomainNameId(): String = unwrap(this).getAttrDomainNameId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The reference to an AWS -managed certificate that will be used by the private endpoint for this
   * domain name.
   */
  public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The reference to an AWS -managed certificate that will be used by the private endpoint for this
   * domain name.
   */
  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  /**
   * Represents a custom domain name as a user-friendly host name of an API (RestApi).
   */
  public open fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * Represents a custom domain name as a user-friendly host name of an API (RestApi).
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
   * domain name (DomainName) has.
   */
  public open fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
   * domain name (DomainName) has.
   */
  public open fun endpointConfiguration(`value`: IResolvable) {
    unwrap(this).setEndpointConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
   * domain name (DomainName) has.
   */
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty) {
    unwrap(this).setEndpointConfiguration(`value`.let(EndpointConfigurationProperty.Companion::unwrap))
  }

  /**
   * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
   * domain name (DomainName) has.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("842b9dc58ceaa8ce331a6cea1e166d33e45d316085b94a5a02b0f5d12782844c")
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty.Builder.() -> Unit):
      Unit = endpointConfiguration(EndpointConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun managementPolicy(): Any? = unwrap(this).getManagementPolicy()

  /**
   *
   */
  public open fun managementPolicy(`value`: Any) {
    unwrap(this).setManagementPolicy(`value`)
  }

  /**
   * A stringified JSON policy document that applies to the `execute-api` service for this
   * DomainName regardless of the caller and Method configuration.
   */
  public open fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * A stringified JSON policy document that applies to the `execute-api` service for this
   * DomainName regardless of the caller and Method configuration.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
   */
  public open fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
   */
  public open fun securityPolicy(`value`: String) {
    unwrap(this).setSecurityPolicy(`value`)
  }

  /**
   * The collection of tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The collection of tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The collection of tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnDomainNameV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The reference to an AWS -managed certificate that will be used by the private endpoint for
     * this domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-certificatearn)
     * @param certificateArn The reference to an AWS -managed certificate that will be used by the
     * private endpoint for this domain name. 
     */
    public fun certificateArn(certificateArn: String)

    /**
     * Represents a custom domain name as a user-friendly host name of an API (RestApi).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-domainname)
     * @param domainName Represents a custom domain name as a user-friendly host name of an API
     * (RestApi). 
     */
    public fun domainName(domainName: String)

    /**
     * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
     * domain name (DomainName) has.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has. 
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
     * domain name (DomainName) has.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has. 
     */
    public fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty)

    /**
     * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
     * domain name (DomainName) has.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d3d050188d6981179d9fb6fabcb89fa01c6262ce1853baee8b86f7036ce882")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-managementpolicy)
     * @param managementPolicy 
     */
    public fun managementPolicy(managementPolicy: Any)

    /**
     * A stringified JSON policy document that applies to the `execute-api` service for this
     * DomainName regardless of the caller and Method configuration.
     *
     * You can use `Fn::ToJsonString` to enter your `policy` . For more information, see
     * [Fn::ToJsonString](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ToJsonString.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-policy)
     * @param policy A stringified JSON policy document that applies to the `execute-api` service
     * for this DomainName regardless of the caller and Method configuration. 
     */
    public fun policy(policy: Any)

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
     *
     * Only `TLS_1_2` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-securitypolicy)
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName. 
     */
    public fun securityPolicy(securityPolicy: String)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDomainNameV2.Builder =
        software.amazon.awscdk.services.apigateway.CfnDomainNameV2.Builder.create(scope, id)

    /**
     * The reference to an AWS -managed certificate that will be used by the private endpoint for
     * this domain name.
     *
     * AWS Certificate Manager is the only supported source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-certificatearn)
     * @param certificateArn The reference to an AWS -managed certificate that will be used by the
     * private endpoint for this domain name. 
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * Represents a custom domain name as a user-friendly host name of an API (RestApi).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-domainname)
     * @param domainName Represents a custom domain name as a user-friendly host name of an API
     * (RestApi). 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
     * domain name (DomainName) has.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has. 
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
     * domain name (DomainName) has.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has. 
     */
    override fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfigurationProperty.Companion::unwrap))
    }

    /**
     * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
     * domain name (DomainName) has.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-endpointconfiguration)
     * @param endpointConfiguration The endpoint configuration to indicate the types of endpoints an
     * API (RestApi) or its custom domain name (DomainName) has. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d3d050188d6981179d9fb6fabcb89fa01c6262ce1853baee8b86f7036ce882")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfigurationProperty(endpointConfiguration))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-managementpolicy)
     * @param managementPolicy 
     */
    override fun managementPolicy(managementPolicy: Any) {
      cdkBuilder.managementPolicy(managementPolicy)
    }

    /**
     * A stringified JSON policy document that applies to the `execute-api` service for this
     * DomainName regardless of the caller and Method configuration.
     *
     * You can use `Fn::ToJsonString` to enter your `policy` . For more information, see
     * [Fn::ToJsonString](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ToJsonString.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-policy)
     * @param policy A stringified JSON policy document that applies to the `execute-api` service
     * for this DomainName regardless of the caller and Method configuration. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName.
     *
     * Only `TLS_1_2` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-securitypolicy)
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     * DomainName. 
     */
    override fun securityPolicy(securityPolicy: String) {
      cdkBuilder.securityPolicy(securityPolicy)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainnamev2.html#cfn-apigateway-domainnamev2-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDomainNameV2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnDomainNameV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainNameV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainNameV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameV2):
        CfnDomainNameV2 = CfnDomainNameV2(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameV2):
        software.amazon.awscdk.services.apigateway.CfnDomainNameV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CfnDomainNameV2
  }

  /**
   * The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom
   * domain name (DomainName) has.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * EndpointConfigurationProperty endpointConfigurationProperty =
   * EndpointConfigurationProperty.builder()
   * .types(List.of("types"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainnamev2-endpointconfiguration.html)
   */
  public interface EndpointConfigurationProperty {
    /**
     * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName).
     *
     * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
     * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
     * the endpoint type is `PRIVATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainnamev2-endpointconfiguration.html#cfn-apigateway-domainnamev2-endpointconfiguration-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A builder for [EndpointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      public fun types(types: List<String>)

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      public fun types(vararg types: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDomainNameV2.EndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDomainNameV2.EndpointConfigurationProperty.builder()

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDomainNameV2.EndpointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameV2.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject),
        EndpointConfigurationProperty {
      /**
       * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName).
       *
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainnamev2-endpointconfiguration.html#cfn-apigateway-domainnamev2-endpointconfiguration-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameV2.EndpointConfigurationProperty):
          EndpointConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EndpointConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.apigateway.CfnDomainNameV2.EndpointConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDomainNameV2.EndpointConfigurationProperty
    }
  }
}
