@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMailManagerAddonSubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerAddonSubscriptionProps cfnMailManagerAddonSubscriptionProps =
 * CfnMailManagerAddonSubscriptionProps.builder()
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
public interface CfnMailManagerAddonSubscriptionProps {
  /**
   * The name of the Add On to subscribe to.
   *
   * You can only have one subscription for each Add On name.
   *
   * Valid Values: `TRENDMICRO_VSAPI | SPAMHAUS_DBL | ABUSIX_MAIL_INTELLIGENCE`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-addonname)
   */
  public fun addonName(): String

  /**
   * The tags used to organize, track, or control access for the resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMailManagerAddonSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addonName The name of the Add On to subscribe to. 
     * You can only have one subscription for each Add On name.
     *
     * Valid Values: `TRENDMICRO_VSAPI | SPAMHAUS_DBL | ABUSIX_MAIL_INTELLIGENCE`
     */
    public fun addonName(addonName: String)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps.builder()

    /**
     * @param addonName The name of the Add On to subscribe to. 
     * You can only have one subscription for each Add On name.
     *
     * Valid Values: `TRENDMICRO_VSAPI | SPAMHAUS_DBL | ABUSIX_MAIL_INTELLIGENCE`
     */
    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps,
  ) : CdkObject(cdkObject),
      CfnMailManagerAddonSubscriptionProps {
    /**
     * The name of the Add On to subscribe to.
     *
     * You can only have one subscription for each Add On name.
     *
     * Valid Values: `TRENDMICRO_VSAPI | SPAMHAUS_DBL | ABUSIX_MAIL_INTELLIGENCE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-addonname)
     */
    override fun addonName(): String = unwrap(this).getAddonName()

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddonsubscription.html#cfn-ses-mailmanageraddonsubscription-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnMailManagerAddonSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps):
        CfnMailManagerAddonSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMailManagerAddonSubscriptionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerAddonSubscriptionProps):
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps
  }
}
