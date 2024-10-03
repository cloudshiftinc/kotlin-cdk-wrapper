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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A resource discovery is an IPAM component that enables IPAM to manage and monitor resources that
 * belong to the owning account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMResourceDiscovery cfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery.Builder.create(this,
 * "MyCfnIPAMResourceDiscovery")
 * .description("description")
 * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
 * .regionName("regionName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html)
 */
public open class CfnIPAMResourceDiscovery(
  cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPAMResourceDiscoveryProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIPAMResourceDiscoveryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPAMResourceDiscoveryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIPAMResourceDiscoveryProps(props)
  )

  /**
   * The resource discovery ARN.
   */
  public open fun attrIpamResourceDiscoveryArn(): String =
      unwrap(this).getAttrIpamResourceDiscoveryArn()

  /**
   * The resource discovery ID.
   */
  public open fun attrIpamResourceDiscoveryId(): String =
      unwrap(this).getAttrIpamResourceDiscoveryId()

  /**
   * The resource discovery Region.
   */
  public open fun attrIpamResourceDiscoveryRegion(): String =
      unwrap(this).getAttrIpamResourceDiscoveryRegion()

  /**
   * Defines if the resource discovery is the default.
   *
   * The default resource discovery is the resource discovery automatically created when you create
   * an IPAM.
   */
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  /**
   * The owner ID.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The resource discovery's state.
   *
   * * `create-in-progress` - Resource discovery is being created.
   * * `create-complete` - Resource discovery creation is complete.
   * * `create-failed` - Resource discovery creation has failed.
   * * `modify-in-progress` - Resource discovery is being modified.
   * * `modify-complete` - Resource discovery modification is complete.
   * * `modify-failed` - Resource discovery modification has failed.
   * * `delete-in-progress` - Resource discovery is being deleted.
   * * `delete-complete` - Resource discovery deletion is complete.
   * * `delete-failed` - Resource discovery deletion has failed.
   * * `isolate-in-progress` - AWS account that created the resource discovery has been removed and
   * the resource discovery is being isolated.
   * * `isolate-complete` - Resource discovery isolation is complete.
   * * `restore-in-progress` - AWS account that created the resource discovery and was isolated has
   * been restored.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The resource discovery description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The resource discovery description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The operating Regions for the resource discovery.
   */
  public open fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

  /**
   * The operating Regions for the resource discovery.
   */
  public open fun operatingRegions(`value`: IResolvable) {
    unwrap(this).setOperatingRegions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The operating Regions for the resource discovery.
   */
  public open fun operatingRegions(`value`: List<Any>) {
    unwrap(this).setOperatingRegions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The operating Regions for the resource discovery.
   */
  public open fun operatingRegions(vararg `value`: Any): Unit = operatingRegions(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A tag is a label that you assign to an AWS resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A tag is a label that you assign to an AWS resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A tag is a label that you assign to an AWS resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnIPAMResourceDiscovery].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The resource discovery description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-description)
     * @param description The resource discovery description. 
     */
    public fun description(description: String)

    /**
     * The operating Regions for the resource discovery.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
     * @param operatingRegions The operating Regions for the resource discovery. 
     */
    public fun operatingRegions(operatingRegions: IResolvable)

    /**
     * The operating Regions for the resource discovery.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
     * @param operatingRegions The operating Regions for the resource discovery. 
     */
    public fun operatingRegions(operatingRegions: List<Any>)

    /**
     * The operating Regions for the resource discovery.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
     * @param operatingRegions The operating Regions for the resource discovery. 
     */
    public fun operatingRegions(vararg operatingRegions: Any)

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.Builder.create(scope, id)

    /**
     * The resource discovery description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-description)
     * @param description The resource discovery description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The operating Regions for the resource discovery.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
     * @param operatingRegions The operating Regions for the resource discovery. 
     */
    override fun operatingRegions(operatingRegions: IResolvable) {
      cdkBuilder.operatingRegions(operatingRegions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The operating Regions for the resource discovery.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
     * @param operatingRegions The operating Regions for the resource discovery. 
     */
    override fun operatingRegions(operatingRegions: List<Any>) {
      cdkBuilder.operatingRegions(operatingRegions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The operating Regions for the resource discovery.
     *
     * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
     * only discovers and monitors resources in the AWS Regions you select as operating Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-operatingregions)
     * @param operatingRegions The operating Regions for the resource discovery. 
     */
    override fun operatingRegions(vararg operatingRegions: Any): Unit =
        operatingRegions(operatingRegions.toList())

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html#cfn-ec2-ipamresourcediscovery-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMResourceDiscovery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMResourceDiscovery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery):
        CfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscovery):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery
  }

  /**
   * The operating Regions for an IPAM.
   *
   * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
   * only discovers and monitors resources in the AWS Regions you select as operating Regions.
   *
   * For more information about operating Regions, see [Create an
   * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM User
   * Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IpamOperatingRegionProperty ipamOperatingRegionProperty = IpamOperatingRegionProperty.builder()
   * .regionName("regionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipamresourcediscovery-ipamoperatingregion.html)
   */
  public interface IpamOperatingRegionProperty {
    /**
     * The name of the operating Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipamresourcediscovery-ipamoperatingregion.html#cfn-ec2-ipamresourcediscovery-ipamoperatingregion-regionname)
     */
    public fun regionName(): String

    /**
     * A builder for [IpamOperatingRegionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param regionName The name of the operating Region. 
       */
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.builder()

      /**
       * @param regionName The name of the operating Region. 
       */
      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty,
    ) : CdkObject(cdkObject),
        IpamOperatingRegionProperty {
      /**
       * The name of the operating Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipamresourcediscovery-ipamoperatingregion.html#cfn-ec2-ipamresourcediscovery-ipamoperatingregion-regionname)
       */
      override fun regionName(): String = unwrap(this).getRegionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpamOperatingRegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty):
          IpamOperatingRegionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IpamOperatingRegionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpamOperatingRegionProperty):
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery.IpamOperatingRegionProperty
    }
  }
}
