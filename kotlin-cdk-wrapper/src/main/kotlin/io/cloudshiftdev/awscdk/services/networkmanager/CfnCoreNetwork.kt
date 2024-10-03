@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Describes a core network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * Object policyDocument;
 * CfnCoreNetwork cfnCoreNetwork = CfnCoreNetwork.Builder.create(this, "MyCfnCoreNetwork")
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .description("description")
 * .policyDocument(policyDocument)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html)
 */
public open class CfnCoreNetwork(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCoreNetworkProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnCoreNetwork(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCoreNetworkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCoreNetworkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCoreNetworkProps(props)
  )

  /**
   * The ARN of the core network.
   */
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  /**
   * The ID of the core network.
   */
  public open fun attrCoreNetworkId(): String = unwrap(this).getAttrCoreNetworkId()

  /**
   * The timestamp when the core network was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The edges.
   */
  public open fun attrEdges(): IResolvable = unwrap(this).getAttrEdges().let(IResolvable::wrap)

  /**
   * The network function groups associated with a core network.
   */
  public open fun attrNetworkFunctionGroups(): IResolvable =
      unwrap(this).getAttrNetworkFunctionGroups().let(IResolvable::wrap)

  /**
   * The owner of the core network.
   */
  public open fun attrOwnerAccount(): String = unwrap(this).getAttrOwnerAccount()

  /**
   * The segments.
   */
  public open fun attrSegments(): IResolvable =
      unwrap(this).getAttrSegments().let(IResolvable::wrap)

  /**
   * The current state of the core network.
   *
   * These states are: `CREATING` | `UPDATING` | `AVAILABLE` | `DELETING` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The description of a core network.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of a core network.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the global network that your core network is a part of.
   */
  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  /**
   * The ID of the global network that your core network is a part of.
   */
  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Describes a core network policy.
   *
   * For more information, see [Core network
   * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
   * .
   */
  public open fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  /**
   * Describes a core network policy.
   *
   * For more information, see [Core network
   * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
   * .
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of key-value tags associated with a core network.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of key-value tags associated with a core network.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The list of key-value tags associated with a core network.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnCoreNetwork].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-description)
     * @param description The description of a core network. 
     */
    public fun description(description: String)

    /**
     * The ID of the global network that your core network is a part of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-globalnetworkid)
     * @param globalNetworkId The ID of the global network that your core network is a part of. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * Describes a core network policy. For more information, see [Core network
     * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
     * .
     *
     * If you update the policy document, CloudFormation will apply the core network change set
     * generated from the updated policy document, and then set it as the LIVE policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-policydocument)
     * @param policyDocument Describes a core network policy. For more information, see [Core
     * network
     * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
     * . 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * The list of key-value tags associated with a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-tags)
     * @param tags The list of key-value tags associated with a core network. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value tags associated with a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-tags)
     * @param tags The list of key-value tags associated with a core network. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.Builder =
        software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.Builder.create(scope, id)

    /**
     * The description of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-description)
     * @param description The description of a core network. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the global network that your core network is a part of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-globalnetworkid)
     * @param globalNetworkId The ID of the global network that your core network is a part of. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * Describes a core network policy. For more information, see [Core network
     * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
     * .
     *
     * If you update the policy document, CloudFormation will apply the core network change set
     * generated from the updated policy document, and then set it as the LIVE policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-policydocument)
     * @param policyDocument Describes a core network policy. For more information, see [Core
     * network
     * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
     * . 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The list of key-value tags associated with a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-tags)
     * @param tags The list of key-value tags associated with a core network. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The list of key-value tags associated with a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-tags)
     * @param tags The list of key-value tags associated with a core network. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnCoreNetwork =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCoreNetwork {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCoreNetwork(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork):
        CfnCoreNetwork = CfnCoreNetwork(cdkObject)

    internal fun unwrap(wrapped: CfnCoreNetwork):
        software.amazon.awscdk.services.networkmanager.CfnCoreNetwork = wrapped.cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnCoreNetwork
  }

  /**
   * Describes a core network edge.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * CoreNetworkEdgeProperty coreNetworkEdgeProperty = CoreNetworkEdgeProperty.builder()
   * .asn(123)
   * .edgeLocation("edgeLocation")
   * .insideCidrBlocks(List.of("insideCidrBlocks"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html)
   */
  public interface CoreNetworkEdgeProperty {
    /**
     * The ASN of a core network edge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html#cfn-networkmanager-corenetwork-corenetworkedge-asn)
     */
    public fun asn(): Number? = unwrap(this).getAsn()

    /**
     * The Region where a core network edge is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html#cfn-networkmanager-corenetwork-corenetworkedge-edgelocation)
     */
    public fun edgeLocation(): String? = unwrap(this).getEdgeLocation()

    /**
     * The inside IP addresses used for core network edges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html#cfn-networkmanager-corenetwork-corenetworkedge-insidecidrblocks)
     */
    public fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?: emptyList()

    /**
     * A builder for [CoreNetworkEdgeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param asn The ASN of a core network edge.
       */
      public fun asn(asn: Number)

      /**
       * @param edgeLocation The Region where a core network edge is located.
       */
      public fun edgeLocation(edgeLocation: String)

      /**
       * @param insideCidrBlocks The inside IP addresses used for core network edges.
       */
      public fun insideCidrBlocks(insideCidrBlocks: List<String>)

      /**
       * @param insideCidrBlocks The inside IP addresses used for core network edges.
       */
      public fun insideCidrBlocks(vararg insideCidrBlocks: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty.builder()

      /**
       * @param asn The ASN of a core network edge.
       */
      override fun asn(asn: Number) {
        cdkBuilder.asn(asn)
      }

      /**
       * @param edgeLocation The Region where a core network edge is located.
       */
      override fun edgeLocation(edgeLocation: String) {
        cdkBuilder.edgeLocation(edgeLocation)
      }

      /**
       * @param insideCidrBlocks The inside IP addresses used for core network edges.
       */
      override fun insideCidrBlocks(insideCidrBlocks: List<String>) {
        cdkBuilder.insideCidrBlocks(insideCidrBlocks)
      }

      /**
       * @param insideCidrBlocks The inside IP addresses used for core network edges.
       */
      override fun insideCidrBlocks(vararg insideCidrBlocks: String): Unit =
          insideCidrBlocks(insideCidrBlocks.toList())

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty,
    ) : CdkObject(cdkObject),
        CoreNetworkEdgeProperty {
      /**
       * The ASN of a core network edge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html#cfn-networkmanager-corenetwork-corenetworkedge-asn)
       */
      override fun asn(): Number? = unwrap(this).getAsn()

      /**
       * The Region where a core network edge is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html#cfn-networkmanager-corenetwork-corenetworkedge-edgelocation)
       */
      override fun edgeLocation(): String? = unwrap(this).getEdgeLocation()

      /**
       * The inside IP addresses used for core network edges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworkedge.html#cfn-networkmanager-corenetwork-corenetworkedge-insidecidrblocks)
       */
      override fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreNetworkEdgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty):
          CoreNetworkEdgeProperty = CdkObjectWrappers.wrap(cdkObject) as? CoreNetworkEdgeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreNetworkEdgeProperty):
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty
    }
  }

  /**
   * Describes a network function group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * CoreNetworkNetworkFunctionGroupProperty coreNetworkNetworkFunctionGroupProperty =
   * CoreNetworkNetworkFunctionGroupProperty.builder()
   * .edgeLocations(List.of("edgeLocations"))
   * .name("name")
   * .segments(SegmentsProperty.builder()
   * .sendTo(List.of("sendTo"))
   * .sendVia(List.of("sendVia"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworknetworkfunctiongroup.html)
   */
  public interface CoreNetworkNetworkFunctionGroupProperty {
    /**
     * The core network edge locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworknetworkfunctiongroup.html#cfn-networkmanager-corenetwork-corenetworknetworkfunctiongroup-edgelocations)
     */
    public fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations() ?: emptyList()

    /**
     * The name of the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworknetworkfunctiongroup.html#cfn-networkmanager-corenetwork-corenetworknetworkfunctiongroup-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The segments associated with the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworknetworkfunctiongroup.html#cfn-networkmanager-corenetwork-corenetworknetworkfunctiongroup-segments)
     */
    public fun segments(): Any? = unwrap(this).getSegments()

    /**
     * A builder for [CoreNetworkNetworkFunctionGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param edgeLocations The core network edge locations.
       */
      public fun edgeLocations(edgeLocations: List<String>)

      /**
       * @param edgeLocations The core network edge locations.
       */
      public fun edgeLocations(vararg edgeLocations: String)

      /**
       * @param name The name of the network function group.
       */
      public fun name(name: String)

      /**
       * @param segments The segments associated with the network function group.
       */
      public fun segments(segments: IResolvable)

      /**
       * @param segments The segments associated with the network function group.
       */
      public fun segments(segments: SegmentsProperty)

      /**
       * @param segments The segments associated with the network function group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc84dbfb73c147f9408f8d81b434398ef4935a84ad613ee87dec028a068c0a3b")
      public fun segments(segments: SegmentsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkNetworkFunctionGroupProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkNetworkFunctionGroupProperty.builder()

      /**
       * @param edgeLocations The core network edge locations.
       */
      override fun edgeLocations(edgeLocations: List<String>) {
        cdkBuilder.edgeLocations(edgeLocations)
      }

      /**
       * @param edgeLocations The core network edge locations.
       */
      override fun edgeLocations(vararg edgeLocations: String): Unit =
          edgeLocations(edgeLocations.toList())

      /**
       * @param name The name of the network function group.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param segments The segments associated with the network function group.
       */
      override fun segments(segments: IResolvable) {
        cdkBuilder.segments(segments.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param segments The segments associated with the network function group.
       */
      override fun segments(segments: SegmentsProperty) {
        cdkBuilder.segments(segments.let(SegmentsProperty.Companion::unwrap))
      }

      /**
       * @param segments The segments associated with the network function group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc84dbfb73c147f9408f8d81b434398ef4935a84ad613ee87dec028a068c0a3b")
      override fun segments(segments: SegmentsProperty.Builder.() -> Unit): Unit =
          segments(SegmentsProperty(segments))

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkNetworkFunctionGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkNetworkFunctionGroupProperty,
    ) : CdkObject(cdkObject),
        CoreNetworkNetworkFunctionGroupProperty {
      /**
       * The core network edge locations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworknetworkfunctiongroup.html#cfn-networkmanager-corenetwork-corenetworknetworkfunctiongroup-edgelocations)
       */
      override fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations() ?: emptyList()

      /**
       * The name of the network function group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworknetworkfunctiongroup.html#cfn-networkmanager-corenetwork-corenetworknetworkfunctiongroup-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The segments associated with the network function group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworknetworkfunctiongroup.html#cfn-networkmanager-corenetwork-corenetworknetworkfunctiongroup-segments)
       */
      override fun segments(): Any? = unwrap(this).getSegments()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CoreNetworkNetworkFunctionGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkNetworkFunctionGroupProperty):
          CoreNetworkNetworkFunctionGroupProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CoreNetworkNetworkFunctionGroupProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreNetworkNetworkFunctionGroupProperty):
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkNetworkFunctionGroupProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkNetworkFunctionGroupProperty
    }
  }

  /**
   * Describes a core network segment, which are dedicated routes.
   *
   * Only attachments within this segment can communicate with each other.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * CoreNetworkSegmentProperty coreNetworkSegmentProperty = CoreNetworkSegmentProperty.builder()
   * .edgeLocations(List.of("edgeLocations"))
   * .name("name")
   * .sharedSegments(List.of("sharedSegments"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html)
   */
  public interface CoreNetworkSegmentProperty {
    /**
     * The Regions where the edges are located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html#cfn-networkmanager-corenetwork-corenetworksegment-edgelocations)
     */
    public fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations() ?: emptyList()

    /**
     * The name of a core network segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html#cfn-networkmanager-corenetwork-corenetworksegment-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The shared segments of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html#cfn-networkmanager-corenetwork-corenetworksegment-sharedsegments)
     */
    public fun sharedSegments(): List<String> = unwrap(this).getSharedSegments() ?: emptyList()

    /**
     * A builder for [CoreNetworkSegmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param edgeLocations The Regions where the edges are located.
       */
      public fun edgeLocations(edgeLocations: List<String>)

      /**
       * @param edgeLocations The Regions where the edges are located.
       */
      public fun edgeLocations(vararg edgeLocations: String)

      /**
       * @param name The name of a core network segment.
       */
      public fun name(name: String)

      /**
       * @param sharedSegments The shared segments of a core network.
       */
      public fun sharedSegments(sharedSegments: List<String>)

      /**
       * @param sharedSegments The shared segments of a core network.
       */
      public fun sharedSegments(vararg sharedSegments: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty.builder()

      /**
       * @param edgeLocations The Regions where the edges are located.
       */
      override fun edgeLocations(edgeLocations: List<String>) {
        cdkBuilder.edgeLocations(edgeLocations)
      }

      /**
       * @param edgeLocations The Regions where the edges are located.
       */
      override fun edgeLocations(vararg edgeLocations: String): Unit =
          edgeLocations(edgeLocations.toList())

      /**
       * @param name The name of a core network segment.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sharedSegments The shared segments of a core network.
       */
      override fun sharedSegments(sharedSegments: List<String>) {
        cdkBuilder.sharedSegments(sharedSegments)
      }

      /**
       * @param sharedSegments The shared segments of a core network.
       */
      override fun sharedSegments(vararg sharedSegments: String): Unit =
          sharedSegments(sharedSegments.toList())

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty,
    ) : CdkObject(cdkObject),
        CoreNetworkSegmentProperty {
      /**
       * The Regions where the edges are located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html#cfn-networkmanager-corenetwork-corenetworksegment-edgelocations)
       */
      override fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations() ?: emptyList()

      /**
       * The name of a core network segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html#cfn-networkmanager-corenetwork-corenetworksegment-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The shared segments of a core network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html#cfn-networkmanager-corenetwork-corenetworksegment-sharedsegments)
       */
      override fun sharedSegments(): List<String> = unwrap(this).getSharedSegments() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreNetworkSegmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty):
          CoreNetworkSegmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CoreNetworkSegmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreNetworkSegmentProperty):
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * SegmentsProperty segmentsProperty = SegmentsProperty.builder()
   * .sendTo(List.of("sendTo"))
   * .sendVia(List.of("sendVia"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-segments.html)
   */
  public interface SegmentsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-segments.html#cfn-networkmanager-corenetwork-segments-sendto)
     */
    public fun sendTo(): List<String> = unwrap(this).getSendTo() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-segments.html#cfn-networkmanager-corenetwork-segments-sendvia)
     */
    public fun sendVia(): List<String> = unwrap(this).getSendVia() ?: emptyList()

    /**
     * A builder for [SegmentsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sendTo the value to be set.
       */
      public fun sendTo(sendTo: List<String>)

      /**
       * @param sendTo the value to be set.
       */
      public fun sendTo(vararg sendTo: String)

      /**
       * @param sendVia the value to be set.
       */
      public fun sendVia(sendVia: List<String>)

      /**
       * @param sendVia the value to be set.
       */
      public fun sendVia(vararg sendVia: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.SegmentsProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.SegmentsProperty.builder()

      /**
       * @param sendTo the value to be set.
       */
      override fun sendTo(sendTo: List<String>) {
        cdkBuilder.sendTo(sendTo)
      }

      /**
       * @param sendTo the value to be set.
       */
      override fun sendTo(vararg sendTo: String): Unit = sendTo(sendTo.toList())

      /**
       * @param sendVia the value to be set.
       */
      override fun sendVia(sendVia: List<String>) {
        cdkBuilder.sendVia(sendVia)
      }

      /**
       * @param sendVia the value to be set.
       */
      override fun sendVia(vararg sendVia: String): Unit = sendVia(sendVia.toList())

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.SegmentsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.SegmentsProperty,
    ) : CdkObject(cdkObject),
        SegmentsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-segments.html#cfn-networkmanager-corenetwork-segments-sendto)
       */
      override fun sendTo(): List<String> = unwrap(this).getSendTo() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-segments.html#cfn-networkmanager-corenetwork-segments-sendvia)
       */
      override fun sendVia(): List<String> = unwrap(this).getSendVia() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.SegmentsProperty):
          SegmentsProperty = CdkObjectWrappers.wrap(cdkObject) as? SegmentsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentsProperty):
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.SegmentsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.SegmentsProperty
    }
  }
}
