@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Enables aggregation across AWS Regions .
 *
 * This API is in private preview and subject to change.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnAggregatorV2 cfnAggregatorV2 = CfnAggregatorV2.Builder.create(this, "MyCfnAggregatorV2")
 * .linkedRegions(List.of("linkedRegions"))
 * .regionLinkingMode("regionLinkingMode")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html)
 */
public open class CfnAggregatorV2(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnAggregatorV2,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAggregatorV2Props,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnAggregatorV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAggregatorV2Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAggregatorV2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnAggregatorV2Props(props)
  )

  /**
   * The AWS Region where data is aggregated.
   */
  public open fun attrAggregationRegion(): String = unwrap(this).getAttrAggregationRegion()

  /**
   * The ARN of the AggregatorV2.
   */
  public open fun attrAggregatorV2Arn(): String = unwrap(this).getAttrAggregatorV2Arn()

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
   * The list of Regions that are linked to the aggregation Region.
   */
  public open fun linkedRegions(): List<String> = unwrap(this).getLinkedRegions()

  /**
   * The list of Regions that are linked to the aggregation Region.
   */
  public open fun linkedRegions(`value`: List<String>) {
    unwrap(this).setLinkedRegions(`value`)
  }

  /**
   * The list of Regions that are linked to the aggregation Region.
   */
  public open fun linkedRegions(vararg `value`: String): Unit = linkedRegions(`value`.toList())

  /**
   * Determines how Regions are linked to an Aggregator V2.
   */
  public open fun regionLinkingMode(): String = unwrap(this).getRegionLinkingMode()

  /**
   * Determines how Regions are linked to an Aggregator V2.
   */
  public open fun regionLinkingMode(`value`: String) {
    unwrap(this).setRegionLinkingMode(`value`)
  }

  /**
   * A list of key-value pairs to be applied to the AggregatorV2.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A list of key-value pairs to be applied to the AggregatorV2.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnAggregatorV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of Regions that are linked to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-linkedregions)
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    public fun linkedRegions(linkedRegions: List<String>)

    /**
     * The list of Regions that are linked to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-linkedregions)
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    public fun linkedRegions(vararg linkedRegions: String)

    /**
     * Determines how Regions are linked to an Aggregator V2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-regionlinkingmode)
     * @param regionLinkingMode Determines how Regions are linked to an Aggregator V2. 
     */
    public fun regionLinkingMode(regionLinkingMode: String)

    /**
     * A list of key-value pairs to be applied to the AggregatorV2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-tags)
     * @param tags A list of key-value pairs to be applied to the AggregatorV2. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnAggregatorV2.Builder =
        software.amazon.awscdk.services.securityhub.CfnAggregatorV2.Builder.create(scope, id)

    /**
     * The list of Regions that are linked to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-linkedregions)
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    override fun linkedRegions(linkedRegions: List<String>) {
      cdkBuilder.linkedRegions(linkedRegions)
    }

    /**
     * The list of Regions that are linked to the aggregation Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-linkedregions)
     * @param linkedRegions The list of Regions that are linked to the aggregation Region. 
     */
    override fun linkedRegions(vararg linkedRegions: String): Unit =
        linkedRegions(linkedRegions.toList())

    /**
     * Determines how Regions are linked to an Aggregator V2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-regionlinkingmode)
     * @param regionLinkingMode Determines how Regions are linked to an Aggregator V2. 
     */
    override fun regionLinkingMode(regionLinkingMode: String) {
      cdkBuilder.regionLinkingMode(regionLinkingMode)
    }

    /**
     * A list of key-value pairs to be applied to the AggregatorV2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-aggregatorv2.html#cfn-securityhub-aggregatorv2-tags)
     * @param tags A list of key-value pairs to be applied to the AggregatorV2. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnAggregatorV2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnAggregatorV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAggregatorV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAggregatorV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnAggregatorV2):
        CfnAggregatorV2 = CfnAggregatorV2(cdkObject)

    internal fun unwrap(wrapped: CfnAggregatorV2):
        software.amazon.awscdk.services.securityhub.CfnAggregatorV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnAggregatorV2
  }
}
