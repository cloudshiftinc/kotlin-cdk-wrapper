@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * VpcLattice ResourceConfiguration CFN resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnResourceConfiguration cfnResourceConfiguration = CfnResourceConfiguration.Builder.create(this,
 * "MyCfnResourceConfiguration")
 * .allowAssociationToSharableServiceNetwork(false)
 * .name("name")
 * .portRanges(List.of("portRanges"))
 * .protocolType("protocolType")
 * .resourceConfigurationAuthType("resourceConfigurationAuthType")
 * .resourceConfigurationDefinition(ResourceConfigurationDefinitionProperty.builder()
 * .ipResource("ipResource")
 * .build())
 * .resourceConfigurationGroupId("resourceConfigurationGroupId")
 * .resourceConfigurationType("resourceConfigurationType")
 * .resourceGatewayId("resourceGatewayId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html)
 */
public open class CfnResourceConfiguration(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceConfigurationProps(props)
  )

  /**
   *
   */
  public open fun allowAssociationToSharableServiceNetwork(): Any? =
      unwrap(this).getAllowAssociationToSharableServiceNetwork()

  /**
   *
   */
  public open fun allowAssociationToSharableServiceNetwork(`value`: Boolean) {
    unwrap(this).setAllowAssociationToSharableServiceNetwork(`value`)
  }

  /**
   *
   */
  public open fun allowAssociationToSharableServiceNetwork(`value`: IResolvable) {
    unwrap(this).setAllowAssociationToSharableServiceNetwork(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

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
  public open fun name(): String? = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun portRanges(): List<String> = unwrap(this).getPortRanges() ?: emptyList()

  /**
   *
   */
  public open fun portRanges(`value`: List<String>) {
    unwrap(this).setPortRanges(`value`)
  }

  /**
   *
   */
  public open fun portRanges(vararg `value`: String): Unit = portRanges(`value`.toList())

  /**
   *
   */
  public open fun protocolType(): String? = unwrap(this).getProtocolType()

  /**
   *
   */
  public open fun protocolType(`value`: String) {
    unwrap(this).setProtocolType(`value`)
  }

  /**
   *
   */
  public open fun resourceConfigurationAuthType(): String? =
      unwrap(this).getResourceConfigurationAuthType()

  /**
   *
   */
  public open fun resourceConfigurationAuthType(`value`: String) {
    unwrap(this).setResourceConfigurationAuthType(`value`)
  }

  /**
   *
   */
  public open fun resourceConfigurationDefinition(): Any? =
      unwrap(this).getResourceConfigurationDefinition()

  /**
   *
   */
  public open fun resourceConfigurationDefinition(`value`: IResolvable) {
    unwrap(this).setResourceConfigurationDefinition(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open
      fun resourceConfigurationDefinition(`value`: ResourceConfigurationDefinitionProperty) {
    unwrap(this).setResourceConfigurationDefinition(`value`.let(ResourceConfigurationDefinitionProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("753683cdec356a2d940832d84eda5f41fd22df800f700cc5bf19398b18462fa1")
  public open
      fun resourceConfigurationDefinition(`value`: ResourceConfigurationDefinitionProperty.Builder.() -> Unit):
      Unit = resourceConfigurationDefinition(ResourceConfigurationDefinitionProperty(`value`))

  /**
   *
   */
  public open fun resourceConfigurationGroupId(): String? =
      unwrap(this).getResourceConfigurationGroupId()

  /**
   *
   */
  public open fun resourceConfigurationGroupId(`value`: String) {
    unwrap(this).setResourceConfigurationGroupId(`value`)
  }

  /**
   *
   */
  public open fun resourceConfigurationType(): String? = unwrap(this).getResourceConfigurationType()

  /**
   *
   */
  public open fun resourceConfigurationType(`value`: String) {
    unwrap(this).setResourceConfigurationType(`value`)
  }

  /**
   *
   */
  public open fun resourceGatewayId(): String? = unwrap(this).getResourceGatewayId()

  /**
   *
   */
  public open fun resourceGatewayId(`value`: String) {
    unwrap(this).setResourceGatewayId(`value`)
  }

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnResourceConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork 
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork 
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges 
     */
    public fun portRanges(portRanges: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges 
     */
    public fun portRanges(vararg portRanges: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
     * @param protocolType 
     */
    public fun protocolType(protocolType: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
     * @param resourceConfigurationAuthType 
     */
    public fun resourceConfigurationAuthType(resourceConfigurationAuthType: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition 
     */
    public fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition 
     */
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43cc195d1c74e028240ae8c6de32449e5ef4a8c655009bf2c3d73b88f2266a0a")
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
     * @param resourceConfigurationGroupId 
     */
    public fun resourceConfigurationGroupId(resourceConfigurationGroupId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationtype)
     * @param resourceConfigurationType 
     */
    public fun resourceConfigurationType(resourceConfigurationType: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
     * @param resourceGatewayId 
     */
    public fun resourceGatewayId(resourceGatewayId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.Builder.create(scope,
        id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork 
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork 
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges 
     */
    override fun portRanges(portRanges: List<String>) {
      cdkBuilder.portRanges(portRanges)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges 
     */
    override fun portRanges(vararg portRanges: String): Unit = portRanges(portRanges.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
     * @param protocolType 
     */
    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
     * @param resourceConfigurationAuthType 
     */
    override fun resourceConfigurationAuthType(resourceConfigurationAuthType: String) {
      cdkBuilder.resourceConfigurationAuthType(resourceConfigurationAuthType)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition 
     */
    override fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition 
     */
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(ResourceConfigurationDefinitionProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43cc195d1c74e028240ae8c6de32449e5ef4a8c655009bf2c3d73b88f2266a0a")
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty.Builder.() -> Unit):
        Unit =
        resourceConfigurationDefinition(ResourceConfigurationDefinitionProperty(resourceConfigurationDefinition))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
     * @param resourceConfigurationGroupId 
     */
    override fun resourceConfigurationGroupId(resourceConfigurationGroupId: String) {
      cdkBuilder.resourceConfigurationGroupId(resourceConfigurationGroupId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationtype)
     * @param resourceConfigurationType 
     */
    override fun resourceConfigurationType(resourceConfigurationType: String) {
      cdkBuilder.resourceConfigurationType(resourceConfigurationType)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
     * @param resourceGatewayId 
     */
    override fun resourceGatewayId(resourceGatewayId: String) {
      cdkBuilder.resourceGatewayId(resourceGatewayId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration):
        CfnResourceConfiguration = CfnResourceConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnResourceConfiguration):
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * ResourceConfigurationDefinitionProperty resourceConfigurationDefinitionProperty =
   * ResourceConfigurationDefinitionProperty.builder()
   * .ipResource("ipResource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html)
   */
  public interface ResourceConfigurationDefinitionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-ipresource)
     */
    public fun ipResource(): String

    /**
     * A builder for [ResourceConfigurationDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipResource the value to be set. 
       */
      public fun ipResource(ipResource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.builder()

      /**
       * @param ipResource the value to be set. 
       */
      override fun ipResource(ipResource: String) {
        cdkBuilder.ipResource(ipResource)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty,
    ) : CdkObject(cdkObject),
        ResourceConfigurationDefinitionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-ipresource)
       */
      override fun ipResource(): String = unwrap(this).getIpResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceConfigurationDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty):
          ResourceConfigurationDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceConfigurationDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceConfigurationDefinitionProperty):
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty
    }
  }
}
