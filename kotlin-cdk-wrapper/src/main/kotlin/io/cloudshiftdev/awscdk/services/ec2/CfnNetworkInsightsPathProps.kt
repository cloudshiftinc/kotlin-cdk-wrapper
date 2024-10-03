@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNetworkInsightsPath`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInsightsPathProps cfnNetworkInsightsPathProps = CfnNetworkInsightsPathProps.builder()
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
public interface CfnNetworkInsightsPathProps {
  /**
   * The ID or ARN of the destination.
   *
   * If the resource is in another account, you must specify an ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destination)
   */
  public fun destination(): String? = unwrap(this).getDestination()

  /**
   * The IP address of the destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationip)
   */
  public fun destinationIp(): String? = unwrap(this).getDestinationIp()

  /**
   * The destination port.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationport)
   */
  public fun destinationPort(): Number? = unwrap(this).getDestinationPort()

  /**
   * Scopes the analysis to network paths that match specific filters at the destination.
   *
   * If you specify this parameter, you can't specify the parameter for the destination IP address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
   */
  public fun filterAtDestination(): Any? = unwrap(this).getFilterAtDestination()

  /**
   * Scopes the analysis to network paths that match specific filters at the source.
   *
   * If you specify this parameter, you can't specify the parameters for the source IP address or
   * the destination port.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
   */
  public fun filterAtSource(): Any? = unwrap(this).getFilterAtSource()

  /**
   * The protocol.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-protocol)
   */
  public fun protocol(): String

  /**
   * The ID or ARN of the source.
   *
   * If the resource is in another account, you must specify an ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-source)
   */
  public fun source(): String

  /**
   * The IP address of the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-sourceip)
   */
  public fun sourceIp(): String? = unwrap(this).getSourceIp()

  /**
   * The tags to add to the path.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNetworkInsightsPathProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The ID or ARN of the destination.
     * If the resource is in another account, you must specify an ARN.
     */
    public fun destination(destination: String)

    /**
     * @param destinationIp The IP address of the destination.
     */
    public fun destinationIp(destinationIp: String)

    /**
     * @param destinationPort The destination port.
     */
    public fun destinationPort(destinationPort: Number)

    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination.
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     */
    public fun filterAtDestination(filterAtDestination: IResolvable)

    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination.
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     */
    public fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty)

    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination.
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9255214da1bd1e8e2506f21fa104c69852b248f638ea1f5328fa996e8ac3de1d")
    public
        fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit)

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source.
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     */
    public fun filterAtSource(filterAtSource: IResolvable)

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source.
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     */
    public fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty)

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source.
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4997b41d43877b8f03ae45ed4287cc6ed6bd50922574997a076738712c7c83f")
    public
        fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit)

    /**
     * @param protocol The protocol. 
     */
    public fun protocol(protocol: String)

    /**
     * @param source The ID or ARN of the source. 
     * If the resource is in another account, you must specify an ARN.
     */
    public fun source(source: String)

    /**
     * @param sourceIp The IP address of the source.
     */
    public fun sourceIp(sourceIp: String)

    /**
     * @param tags The tags to add to the path.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the path.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps.Builder
        = software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps.builder()

    /**
     * @param destination The ID or ARN of the destination.
     * If the resource is in another account, you must specify an ARN.
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * @param destinationIp The IP address of the destination.
     */
    override fun destinationIp(destinationIp: String) {
      cdkBuilder.destinationIp(destinationIp)
    }

    /**
     * @param destinationPort The destination port.
     */
    override fun destinationPort(destinationPort: Number) {
      cdkBuilder.destinationPort(destinationPort)
    }

    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination.
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     */
    override fun filterAtDestination(filterAtDestination: IResolvable) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination.
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     */
    override
        fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(CfnNetworkInsightsPath.PathFilterProperty.Companion::unwrap))
    }

    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters
     * at the destination.
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9255214da1bd1e8e2506f21fa104c69852b248f638ea1f5328fa996e8ac3de1d")
    override
        fun filterAtDestination(filterAtDestination: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit):
        Unit = filterAtDestination(CfnNetworkInsightsPath.PathFilterProperty(filterAtDestination))

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source.
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     */
    override fun filterAtSource(filterAtSource: IResolvable) {
      cdkBuilder.filterAtSource(filterAtSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source.
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     */
    override fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty) {
      cdkBuilder.filterAtSource(filterAtSource.let(CfnNetworkInsightsPath.PathFilterProperty.Companion::unwrap))
    }

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the
     * source.
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4997b41d43877b8f03ae45ed4287cc6ed6bd50922574997a076738712c7c83f")
    override
        fun filterAtSource(filterAtSource: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit):
        Unit = filterAtSource(CfnNetworkInsightsPath.PathFilterProperty(filterAtSource))

    /**
     * @param protocol The protocol. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param source The ID or ARN of the source. 
     * If the resource is in another account, you must specify an ARN.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param sourceIp The IP address of the source.
     */
    override fun sourceIp(sourceIp: String) {
      cdkBuilder.sourceIp(sourceIp)
    }

    /**
     * @param tags The tags to add to the path.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the path.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps,
  ) : CdkObject(cdkObject),
      CfnNetworkInsightsPathProps {
    /**
     * The ID or ARN of the destination.
     *
     * If the resource is in another account, you must specify an ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destination)
     */
    override fun destination(): String? = unwrap(this).getDestination()

    /**
     * The IP address of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationip)
     */
    override fun destinationIp(): String? = unwrap(this).getDestinationIp()

    /**
     * The destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-destinationport)
     */
    override fun destinationPort(): Number? = unwrap(this).getDestinationPort()

    /**
     * Scopes the analysis to network paths that match specific filters at the destination.
     *
     * If you specify this parameter, you can't specify the parameter for the destination IP
     * address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratdestination)
     */
    override fun filterAtDestination(): Any? = unwrap(this).getFilterAtDestination()

    /**
     * Scopes the analysis to network paths that match specific filters at the source.
     *
     * If you specify this parameter, you can't specify the parameters for the source IP address or
     * the destination port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-filteratsource)
     */
    override fun filterAtSource(): Any? = unwrap(this).getFilterAtSource()

    /**
     * The protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-protocol)
     */
    override fun protocol(): String = unwrap(this).getProtocol()

    /**
     * The ID or ARN of the source.
     *
     * If the resource is in another account, you must specify an ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-source)
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The IP address of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-sourceip)
     */
    override fun sourceIp(): String? = unwrap(this).getSourceIp()

    /**
     * The tags to add to the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightspath.html#cfn-ec2-networkinsightspath-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInsightsPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps):
        CfnNetworkInsightsPathProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnNetworkInsightsPathProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsPathProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps
  }
}
