@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

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
 * Properties for defining a `CfnResourceConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnResourceConfigurationProps cfnResourceConfigurationProps =
 * CfnResourceConfigurationProps.builder()
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
public interface CfnResourceConfigurationProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
   */
  public fun allowAssociationToSharableServiceNetwork(): Any? =
      unwrap(this).getAllowAssociationToSharableServiceNetwork()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
   */
  public fun portRanges(): List<String> = unwrap(this).getPortRanges() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
   */
  public fun protocolType(): String? = unwrap(this).getProtocolType()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
   */
  public fun resourceConfigurationAuthType(): String? =
      unwrap(this).getResourceConfigurationAuthType()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
   */
  public fun resourceConfigurationDefinition(): Any? =
      unwrap(this).getResourceConfigurationDefinition()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
   */
  public fun resourceConfigurationGroupId(): String? =
      unwrap(this).getResourceConfigurationGroupId()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationtype)
   */
  public fun resourceConfigurationType(): String? = unwrap(this).getResourceConfigurationType()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
   */
  public fun resourceGatewayId(): String? = unwrap(this).getResourceGatewayId()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResourceConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAssociationToSharableServiceNetwork the value to be set.
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean)

    /**
     * @param allowAssociationToSharableServiceNetwork the value to be set.
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable)

    /**
     * @param name the value to be set.
     */
    public fun name(name: String)

    /**
     * @param portRanges the value to be set.
     */
    public fun portRanges(portRanges: List<String>)

    /**
     * @param portRanges the value to be set.
     */
    public fun portRanges(vararg portRanges: String)

    /**
     * @param protocolType the value to be set.
     */
    public fun protocolType(protocolType: String)

    /**
     * @param resourceConfigurationAuthType the value to be set.
     */
    public fun resourceConfigurationAuthType(resourceConfigurationAuthType: String)

    /**
     * @param resourceConfigurationDefinition the value to be set.
     */
    public fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable)

    /**
     * @param resourceConfigurationDefinition the value to be set.
     */
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty)

    /**
     * @param resourceConfigurationDefinition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53bb3a0a57f4fc564db4fc154f86abc46ee3b86ecb81f434eb20ddf0f8c5a565")
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Builder.() -> Unit)

    /**
     * @param resourceConfigurationGroupId the value to be set.
     */
    public fun resourceConfigurationGroupId(resourceConfigurationGroupId: String)

    /**
     * @param resourceConfigurationType the value to be set.
     */
    public fun resourceConfigurationType(resourceConfigurationType: String)

    /**
     * @param resourceGatewayId the value to be set.
     */
    public fun resourceGatewayId(resourceGatewayId: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps.builder()

    /**
     * @param allowAssociationToSharableServiceNetwork the value to be set.
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork)
    }

    /**
     * @param allowAssociationToSharableServiceNetwork the value to be set.
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name the value to be set.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param portRanges the value to be set.
     */
    override fun portRanges(portRanges: List<String>) {
      cdkBuilder.portRanges(portRanges)
    }

    /**
     * @param portRanges the value to be set.
     */
    override fun portRanges(vararg portRanges: String): Unit = portRanges(portRanges.toList())

    /**
     * @param protocolType the value to be set.
     */
    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    /**
     * @param resourceConfigurationAuthType the value to be set.
     */
    override fun resourceConfigurationAuthType(resourceConfigurationAuthType: String) {
      cdkBuilder.resourceConfigurationAuthType(resourceConfigurationAuthType)
    }

    /**
     * @param resourceConfigurationDefinition the value to be set.
     */
    override fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceConfigurationDefinition the value to be set.
     */
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param resourceConfigurationDefinition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53bb3a0a57f4fc564db4fc154f86abc46ee3b86ecb81f434eb20ddf0f8c5a565")
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Builder.() -> Unit):
        Unit =
        resourceConfigurationDefinition(CfnResourceConfiguration.ResourceConfigurationDefinitionProperty(resourceConfigurationDefinition))

    /**
     * @param resourceConfigurationGroupId the value to be set.
     */
    override fun resourceConfigurationGroupId(resourceConfigurationGroupId: String) {
      cdkBuilder.resourceConfigurationGroupId(resourceConfigurationGroupId)
    }

    /**
     * @param resourceConfigurationType the value to be set.
     */
    override fun resourceConfigurationType(resourceConfigurationType: String) {
      cdkBuilder.resourceConfigurationType(resourceConfigurationType)
    }

    /**
     * @param resourceGatewayId the value to be set.
     */
    override fun resourceGatewayId(resourceGatewayId: String) {
      cdkBuilder.resourceGatewayId(resourceGatewayId)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnResourceConfigurationProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     */
    override fun allowAssociationToSharableServiceNetwork(): Any? =
        unwrap(this).getAllowAssociationToSharableServiceNetwork()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     */
    override fun portRanges(): List<String> = unwrap(this).getPortRanges() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
     */
    override fun protocolType(): String? = unwrap(this).getProtocolType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
     */
    override fun resourceConfigurationAuthType(): String? =
        unwrap(this).getResourceConfigurationAuthType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     */
    override fun resourceConfigurationDefinition(): Any? =
        unwrap(this).getResourceConfigurationDefinition()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
     */
    override fun resourceConfigurationGroupId(): String? =
        unwrap(this).getResourceConfigurationGroupId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationtype)
     */
    override fun resourceConfigurationType(): String? = unwrap(this).getResourceConfigurationType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
     */
    override fun resourceGatewayId(): String? = unwrap(this).getResourceGatewayId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps):
        CfnResourceConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnResourceConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceConfigurationProps):
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps
  }
}
