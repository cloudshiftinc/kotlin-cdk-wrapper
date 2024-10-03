@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a Traffic Mirror filter.
 *
 * A Traffic Mirror filter is a set of rules that defines the traffic to mirror.
 *
 * By default, no traffic is mirrored. To mirror traffic, use
 * [AWS::EC2::TrafficMirrorFilterRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
 * to add Traffic Mirror rules to the filter. The rules you add define what traffic gets mirrored.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTrafficMirrorFilter cfnTrafficMirrorFilter = CfnTrafficMirrorFilter.Builder.create(this,
 * "MyCfnTrafficMirrorFilter")
 * .description("description")
 * .networkServices(List.of("networkServices"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html)
 */
public open class CfnTrafficMirrorFilter(
  cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrafficMirrorFilterProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTrafficMirrorFilterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrafficMirrorFilterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTrafficMirrorFilterProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of the Traffic Mirror filter.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the Traffic Mirror filter.
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
   * The network service traffic that is associated with the Traffic Mirror filter.
   */
  public open fun networkServices(): List<String> = unwrap(this).getNetworkServices() ?: emptyList()

  /**
   * The network service traffic that is associated with the Traffic Mirror filter.
   */
  public open fun networkServices(`value`: List<String>) {
    unwrap(this).setNetworkServices(`value`)
  }

  /**
   * The network service traffic that is associated with the Traffic Mirror filter.
   */
  public open fun networkServices(vararg `value`: String): Unit = networkServices(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to assign to a Traffic Mirror filter.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to assign to a Traffic Mirror filter.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to assign to a Traffic Mirror filter.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTrafficMirrorFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-description)
     * @param description The description of the Traffic Mirror filter. 
     */
    public fun description(description: String)

    /**
     * The network service traffic that is associated with the Traffic Mirror filter.
     *
     * Valid values are `amazon-dns` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter. 
     */
    public fun networkServices(networkServices: List<String>)

    /**
     * The network service traffic that is associated with the Traffic Mirror filter.
     *
     * Valid values are `amazon-dns` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter. 
     */
    public fun networkServices(vararg networkServices: String)

    /**
     * The tags to assign to a Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
     * @param tags The tags to assign to a Traffic Mirror filter. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to a Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
     * @param tags The tags to assign to a Traffic Mirror filter. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter.Builder.create(scope, id)

    /**
     * The description of the Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-description)
     * @param description The description of the Traffic Mirror filter. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The network service traffic that is associated with the Traffic Mirror filter.
     *
     * Valid values are `amazon-dns` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter. 
     */
    override fun networkServices(networkServices: List<String>) {
      cdkBuilder.networkServices(networkServices)
    }

    /**
     * The network service traffic that is associated with the Traffic Mirror filter.
     *
     * Valid values are `amazon-dns` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter. 
     */
    override fun networkServices(vararg networkServices: String): Unit =
        networkServices(networkServices.toList())

    /**
     * The tags to assign to a Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
     * @param tags The tags to assign to a Traffic Mirror filter. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to assign to a Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
     * @param tags The tags to assign to a Traffic Mirror filter. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrafficMirrorFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrafficMirrorFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter):
        CfnTrafficMirrorFilter = CfnTrafficMirrorFilter(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorFilter):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter
  }
}
