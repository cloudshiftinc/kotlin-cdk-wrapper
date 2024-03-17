@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * Specifies a path to analyze for reachability.
 *
 * VPC Reachability Analyzer enables you to analyze and debug network reachability between two
 * resources in your virtual private cloud (VPC). For more information, see the [Reachability Analyzer
 * User Guide](https://docs.aws.amazon.com/vpc/latest/reachability/what-is-reachability-analyzer.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInsightsPath cfnNetworkInsightsPath = CfnNetworkInsightsPath.Builder.create(this,
 * "MyCfnNetworkInsightsPath")
 * .protocol("protocol")
 * .source("source")
 * // the properties below are optional
 * .destination("destination")
 * .destinationIp("destinationIp")
 * .destinationPort(123)
 * .filterAtDestination(PathFilterProperty.builder()
 * .destinationAddress("destinationAddress")
 * .destinationPortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .sourceAddress("sourceAddress")
 * .sourcePortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .build())
 * .filterAtSource(PathFilterProperty.builder()
 * .destinationAddress("destinationAddress")
 * .destinationPortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .sourceAddress("sourceAddress")
 * .sourcePortRange(FilterPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .build())
 * .sourceIp("sourceIp")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html)
 */
public open class CfnNetworkInsightsPath internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The time stamp when the path was created.
   */
  public open fun attrCreatedDate(): String = unwrap(this).getAttrCreatedDate()

  /**
   * The Amazon Resource Name (ARN) of the destination.
   */
  public open fun attrDestinationArn(): String = unwrap(this).getAttrDestinationArn()

  /**
   * The Amazon Resource Name (ARN) of the path.
   */
  public open fun attrNetworkInsightsPathArn(): String =
      unwrap(this).getAttrNetworkInsightsPathArn()

  /**
   * The ID of the path.
   */
  public open fun attrNetworkInsightsPathId(): String = unwrap(this).getAttrNetworkInsightsPathId()

  /**
   * The Amazon Resource Name (ARN) of the source.
   */
  public open fun attrSourceArn(): String = unwrap(this).getAttrSourceArn()

  /**
   * The ID or ARN of the destination.
   */
  public open fun destination(): String? = unwrap(this).getDestination()

  /**
   * The ID or ARN of the destination.
   */
  public open fun destination(`value`: String) {
    unwrap(this).setDestination(`value`)
  }

  /**
   * The IP address of the destination.
   */
  public open fun destinationIp(): String? = unwrap(this).getDestinationIp()

  /**
   * The IP address of the destination.
   */
  public open fun destinationIp(`value`: String) {
    unwrap(this).setDestinationIp(`value`)
  }

  /**
   * The destination port.
   */
  public open fun destinationPort(): Number? = unwrap(this).getDestinationPort()

  /**
   * The destination port.
   */
  public open fun destinationPort(`value`: Number) {
    unwrap(this).setDestinationPort(`value`)
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the destination.
   */
  public open fun filterAtDestination(): Any? = unwrap(this).getFilterAtDestination()

  /**
   * Scopes the analysis to network paths that match specific filters at the destination.
   */
  public open fun filterAtDestination(`value`: IResolvable) {
    unwrap(this).setFilterAtDestination(`value`.let(IResolvable::unwrap))
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the destination.
   */
  public open fun filterAtDestination(`value`: PathFilterProperty) {
    unwrap(this).setFilterAtDestination(`value`.let(PathFilterProperty::unwrap))
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the destination.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("811226232cd399da97bd4a0e15da731af46c73e929db62cc81474e019b945684")
  public open fun filterAtDestination(`value`: PathFilterProperty.Builder.() -> Unit): Unit =
      filterAtDestination(PathFilterProperty(`value`))

  /**
   * Scopes the analysis to network paths that match specific filters at the source.
   */
  public open fun filterAtSource(): Any? = unwrap(this).getFilterAtSource()

  /**
   * Scopes the analysis to network paths that match specific filters at the source.
   */
  public open fun filterAtSource(`value`: IResolvable) {
    unwrap(this).setFilterAtSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the source.
   */
  public open fun filterAtSource(`value`: PathFilterProperty) {
    unwrap(this).setFilterAtSource(`value`.let(PathFilterProperty::unwrap))
  }

  /**
   * Scopes the analysis to network paths that match specific filters at the source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("606c3a46cb8ac9d7e6a3d4e3c4ccf69b5a0ece272cf356ef23ff148455476fda")
  public open fun filterAtSource(`value`: PathFilterProperty.Builder.() -> Unit): Unit =
      filterAtSource(PathFilterProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The protocol.
   */
  public open fun protocol(): String = unwrap(this).getProtocol()

  /**
   * The protocol.
   */
  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * The ID or ARN of the source.
   */
  public open fun source(): String = unwrap(this).getSource()

  /**
   * The ID or ARN of the source.
   */
  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  /**
   * The IP address of the source.
   */
  public open fun sourceIp(): String? = unwrap(this).getSourceIp()

  /**
   * The IP address of the source.
   */
  public open fun sourceIp(`value`: String) {
    unwrap(this).setSourceIp(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to add to the path.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to add to the path.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to add to the path.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkInsightsPath].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID or ARN of the destination.
     *
     * If the resource is in another account, you must specify an ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destination)
     * @param destination The ID or ARN of the destination. 
     */
    public fun destination(destination: String)

    /**
     * The IP address of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationip)
     * @param destinationIp The IP address of the destination. 
     */
    public fun destinationIp(destinationIp: String)

    /**
     * The destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationport)
     * @param destinationPort The destination port. 
     */
    public fun destinationPort(destinationPort: Number)

    /**
     * Scopes the analysis to network paths that match specific filters at the destination.
     *
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination. 
     */
    public fun filterAtDestination(filterAtDestination: IResolvable)

    /**
     * Scopes the analysis to network paths that match specific filters at the destination.
     *
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination. 
     */
    public fun filterAtDestination(filterAtDestination: PathFilterProperty)

    /**
     * Scopes the analysis to network paths that match specific filters at the destination.
     *
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fc130fe57308efc3533736b34dac6c768021dee3a12c125c4af637efd2dfd29")
    public fun filterAtDestination(filterAtDestination: PathFilterProperty.Builder.() -> Unit)

    /**
     * Scopes the analysis to network paths that match specific filters at the source.
     *
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source. 
     */
    public fun filterAtSource(filterAtSource: IResolvable)

    /**
     * Scopes the analysis to network paths that match specific filters at the source.
     *
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source. 
     */
    public fun filterAtSource(filterAtSource: PathFilterProperty)

    /**
     * Scopes the analysis to network paths that match specific filters at the source.
     *
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38704953e7735b78475c41a7ccf525fb6e132f5f4e23a8fb04bf1c9d6d18eb63")
    public fun filterAtSource(filterAtSource: PathFilterProperty.Builder.() -> Unit)

    /**
     * The protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-protocol)
     * @param protocol The protocol. 
     */
    public fun protocol(protocol: String)

    /**
     * The ID or ARN of the source.
     *
     * If the resource is in another account, you must specify an ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-source)
     * @param source The ID or ARN of the source. 
     */
    public fun source(source: String)

    /**
     * The IP address of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-sourceip)
     * @param sourceIp The IP address of the source. 
     */
    public fun sourceIp(sourceIp: String)

    /**
     * The tags to add to the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
     * @param tags The tags to add to the path. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
     * @param tags The tags to add to the path. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.Builder.create(scope, id)

    /**
     * The ID or ARN of the destination.
     *
     * If the resource is in another account, you must specify an ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destination)
     * @param destination The ID or ARN of the destination. 
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * The IP address of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationip)
     * @param destinationIp The IP address of the destination. 
     */
    override fun destinationIp(destinationIp: String) {
      cdkBuilder.destinationIp(destinationIp)
    }

    /**
     * The destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationport)
     * @param destinationPort The destination port. 
     */
    override fun destinationPort(destinationPort: Number) {
      cdkBuilder.destinationPort(destinationPort)
    }

    /**
     * Scopes the analysis to network paths that match specific filters at the destination.
     *
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination. 
     */
    override fun filterAtDestination(filterAtDestination: IResolvable) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(IResolvable::unwrap))
    }

    /**
     * Scopes the analysis to network paths that match specific filters at the destination.
     *
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination. 
     */
    override fun filterAtDestination(filterAtDestination: PathFilterProperty) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(PathFilterProperty::unwrap))
    }

    /**
     * Scopes the analysis to network paths that match specific filters at the destination.
     *
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fc130fe57308efc3533736b34dac6c768021dee3a12c125c4af637efd2dfd29")
    override fun filterAtDestination(filterAtDestination: PathFilterProperty.Builder.() -> Unit):
        Unit = filterAtDestination(PathFilterProperty(filterAtDestination))

    /**
     * Scopes the analysis to network paths that match specific filters at the source.
     *
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source. 
     */
    override fun filterAtSource(filterAtSource: IResolvable) {
      cdkBuilder.filterAtSource(filterAtSource.let(IResolvable::unwrap))
    }

    /**
     * Scopes the analysis to network paths that match specific filters at the source.
     *
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source. 
     */
    override fun filterAtSource(filterAtSource: PathFilterProperty) {
      cdkBuilder.filterAtSource(filterAtSource.let(PathFilterProperty::unwrap))
    }

    /**
     * Scopes the analysis to network paths that match specific filters at the source.
     *
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38704953e7735b78475c41a7ccf525fb6e132f5f4e23a8fb04bf1c9d6d18eb63")
    override fun filterAtSource(filterAtSource: PathFilterProperty.Builder.() -> Unit): Unit =
        filterAtSource(PathFilterProperty(filterAtSource))

    /**
     * The protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-protocol)
     * @param protocol The protocol. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * The ID or ARN of the source.
     *
     * If the resource is in another account, you must specify an ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-source)
     * @param source The ID or ARN of the source. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * The IP address of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-sourceip)
     * @param sourceIp The IP address of the source. 
     */
    override fun sourceIp(sourceIp: String) {
      cdkBuilder.sourceIp(sourceIp)
    }

    /**
     * The tags to add to the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
     * @param tags The tags to add to the path. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to add to the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
     * @param tags The tags to add to the path. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInsightsPath {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInsightsPath(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath):
        CfnNetworkInsightsPath = CfnNetworkInsightsPath(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsPath):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath = wrapped.cdkObject
  }

  /**
   * Describes a set of filters for a path analysis.
   *
   * Use path filters to scope the analysis when there can be multiple resulting paths.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PathFilterProperty pathFilterProperty = PathFilterProperty.builder()
   * .destinationAddress("destinationAddress")
   * .destinationPortRange(FilterPortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build())
   * .sourceAddress("sourceAddress")
   * .sourcePortRange(FilterPortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html)
   */
  public interface PathFilterProperty {
    /**
     * The destination IPv4 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-destinationaddress)
     */
    public fun destinationAddress(): String? = unwrap(this).getDestinationAddress()

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-destinationportrange)
     */
    public fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

    /**
     * The source IPv4 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-sourceaddress)
     */
    public fun sourceAddress(): String? = unwrap(this).getSourceAddress()

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-sourceportrange)
     */
    public fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

    /**
     * A builder for [PathFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationAddress The destination IPv4 address.
       */
      public fun destinationAddress(destinationAddress: String)

      /**
       * @param destinationPortRange The destination port range.
       */
      public fun destinationPortRange(destinationPortRange: IResolvable)

      /**
       * @param destinationPortRange The destination port range.
       */
      public fun destinationPortRange(destinationPortRange: FilterPortRangeProperty)

      /**
       * @param destinationPortRange The destination port range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2e3d751dbdd68807cdb605a72c7006ea486c9202424100dbd476d58321fb565")
      public
          fun destinationPortRange(destinationPortRange: FilterPortRangeProperty.Builder.() -> Unit)

      /**
       * @param sourceAddress The source IPv4 address.
       */
      public fun sourceAddress(sourceAddress: String)

      /**
       * @param sourcePortRange The source port range.
       */
      public fun sourcePortRange(sourcePortRange: IResolvable)

      /**
       * @param sourcePortRange The source port range.
       */
      public fun sourcePortRange(sourcePortRange: FilterPortRangeProperty)

      /**
       * @param sourcePortRange The source port range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cb8eb403d87ec69322d186a73a64fce9267a481e349f0eb4dd921267b55e2d")
      public fun sourcePortRange(sourcePortRange: FilterPortRangeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty.builder()

      /**
       * @param destinationAddress The destination IPv4 address.
       */
      override fun destinationAddress(destinationAddress: String) {
        cdkBuilder.destinationAddress(destinationAddress)
      }

      /**
       * @param destinationPortRange The destination port range.
       */
      override fun destinationPortRange(destinationPortRange: IResolvable) {
        cdkBuilder.destinationPortRange(destinationPortRange.let(IResolvable::unwrap))
      }

      /**
       * @param destinationPortRange The destination port range.
       */
      override fun destinationPortRange(destinationPortRange: FilterPortRangeProperty) {
        cdkBuilder.destinationPortRange(destinationPortRange.let(FilterPortRangeProperty::unwrap))
      }

      /**
       * @param destinationPortRange The destination port range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2e3d751dbdd68807cdb605a72c7006ea486c9202424100dbd476d58321fb565")
      override
          fun destinationPortRange(destinationPortRange: FilterPortRangeProperty.Builder.() -> Unit):
          Unit = destinationPortRange(FilterPortRangeProperty(destinationPortRange))

      /**
       * @param sourceAddress The source IPv4 address.
       */
      override fun sourceAddress(sourceAddress: String) {
        cdkBuilder.sourceAddress(sourceAddress)
      }

      /**
       * @param sourcePortRange The source port range.
       */
      override fun sourcePortRange(sourcePortRange: IResolvable) {
        cdkBuilder.sourcePortRange(sourcePortRange.let(IResolvable::unwrap))
      }

      /**
       * @param sourcePortRange The source port range.
       */
      override fun sourcePortRange(sourcePortRange: FilterPortRangeProperty) {
        cdkBuilder.sourcePortRange(sourcePortRange.let(FilterPortRangeProperty::unwrap))
      }

      /**
       * @param sourcePortRange The source port range.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cb8eb403d87ec69322d186a73a64fce9267a481e349f0eb4dd921267b55e2d")
      override fun sourcePortRange(sourcePortRange: FilterPortRangeProperty.Builder.() -> Unit):
          Unit = sourcePortRange(FilterPortRangeProperty(sourcePortRange))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty,
    ) : CdkObject(cdkObject), PathFilterProperty {
      /**
       * The destination IPv4 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-destinationaddress)
       */
      override fun destinationAddress(): String? = unwrap(this).getDestinationAddress()

      /**
       * The destination port range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-destinationportrange)
       */
      override fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

      /**
       * The source IPv4 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-sourceaddress)
       */
      override fun sourceAddress(): String? = unwrap(this).getSourceAddress()

      /**
       * The source port range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-pathfilter.html#cfn-ec2-networkinsightspath-pathfilter-sourceportrange)
       */
      override fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty):
          PathFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? PathFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathFilterProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty
    }
  }

  /**
   * Describes a port range.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * FilterPortRangeProperty filterPortRangeProperty = FilterPortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-filterportrange.html)
   */
  public interface FilterPortRangeProperty {
    /**
     * The first port in the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-filterportrange.html#cfn-ec2-networkinsightspath-filterportrange-fromport)
     */
    public fun fromPort(): Number? = unwrap(this).getFromPort()

    /**
     * The last port in the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-filterportrange.html#cfn-ec2-networkinsightspath-filterportrange-toport)
     */
    public fun toPort(): Number? = unwrap(this).getToPort()

    /**
     * A builder for [FilterPortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort The first port in the range.
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param toPort The last port in the range.
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty.builder()

      /**
       * @param fromPort The first port in the range.
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param toPort The last port in the range.
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty,
    ) : CdkObject(cdkObject), FilterPortRangeProperty {
      /**
       * The first port in the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-filterportrange.html#cfn-ec2-networkinsightspath-filterportrange-fromport)
       */
      override fun fromPort(): Number? = unwrap(this).getFromPort()

      /**
       * The last port in the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightspath-filterportrange.html#cfn-ec2-networkinsightspath-filterportrange-toport)
       */
      override fun toPort(): Number? = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterPortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty):
          FilterPortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterPortRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterPortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty
    }
  }
}
