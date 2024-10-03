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
 * Properties for defining a `CfnMailManagerAddonInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerAddonInstanceProps cfnMailManagerAddonInstanceProps =
 * CfnMailManagerAddonInstanceProps.builder()
 * .addonSubscriptionId("addonSubscriptionId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html)
 */
public interface CfnMailManagerAddonInstanceProps {
  /**
   * The subscription ID for the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-addonsubscriptionid)
   */
  public fun addonSubscriptionId(): String

  /**
   * The tags used to organize, track, or control access for the resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMailManagerAddonInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addonSubscriptionId The subscription ID for the instance. 
     */
    public fun addonSubscriptionId(addonSubscriptionId: String)

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
        software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps.builder()

    /**
     * @param addonSubscriptionId The subscription ID for the instance. 
     */
    override fun addonSubscriptionId(addonSubscriptionId: String) {
      cdkBuilder.addonSubscriptionId(addonSubscriptionId)
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

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps,
  ) : CdkObject(cdkObject),
      CfnMailManagerAddonInstanceProps {
    /**
     * The subscription ID for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-addonsubscriptionid)
     */
    override fun addonSubscriptionId(): String = unwrap(this).getAddonSubscriptionId()

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMailManagerAddonInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps):
        CfnMailManagerAddonInstanceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMailManagerAddonInstanceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerAddonInstanceProps):
        software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnMailManagerAddonInstanceProps
  }
}
