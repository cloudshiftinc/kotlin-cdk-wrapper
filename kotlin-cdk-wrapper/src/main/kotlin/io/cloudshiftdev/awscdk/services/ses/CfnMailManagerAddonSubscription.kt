@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a subscription for an Add On representing the acceptance of its terms of use and
 * additional pricing.
 *
 * The subscription can then be used to create an instance for use in rule sets or traffic policies.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerAddonSubscription cfnMailManagerAddonSubscription =
 * CfnMailManagerAddonSubscription.Builder.create(this, "MyCfnMailManagerAddonSubscription")
 * .addonName("addonName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html)
 */
public open class CfnMailManagerAddonSubscription(
  cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerAddonSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMailManagerAddonSubscriptionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerAddonSubscriptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMailManagerAddonSubscriptionProps(props)
  )

  /**
   * The name of the Add On to subscribe to.
   */
  public open fun addonName(): String = unwrap(this).getAddonName()

  /**
   * The name of the Add On to subscribe to.
   */
  public open fun addonName(`value`: String) {
    unwrap(this).setAddonName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Add On subscription.
   */
  public open fun attrAddonSubscriptionArn(): String = unwrap(this).getAttrAddonSubscriptionArn()

  /**
   * The unique ID of the Add On subscription.
   */
  public open fun attrAddonSubscriptionId(): String = unwrap(this).getAttrAddonSubscriptionId()

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
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnMailManagerAddonSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Add On to subscribe to.
     *
     * You can only have one subscription for each Add On name.
     *
     * Valid Values: `TRENDMICRO_VSAPI | SPAMHAUS_DBL | ABUSIX_MAIL_INTELLIGENCE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-addonname)
     * @param addonName The name of the Add On to subscribe to. 
     */
    public fun addonName(addonName: String)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription.Builder.create(scope,
        id)

    /**
     * The name of the Add On to subscribe to.
     *
     * You can only have one subscription for each Add On name.
     *
     * Valid Values: `TRENDMICRO_VSAPI | SPAMHAUS_DBL | ABUSIX_MAIL_INTELLIGENCE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-addonname)
     * @param addonName The name of the Add On to subscribe to. 
     */
    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMailManagerAddonSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMailManagerAddonSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription):
        CfnMailManagerAddonSubscription = CfnMailManagerAddonSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerAddonSubscription):
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription
  }
}
