@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDiscoverer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eventschemas.*;
 * CfnDiscovererProps cfnDiscovererProps = CfnDiscovererProps.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .crossAccount(false)
 * .description("description")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html)
 */
public interface CfnDiscovererProps {
  /**
   * Allows for the discovery of the event schemas that are sent to the event bus from another
   * account.
   *
   * Default: - true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
   */
  public fun crossAccount(): Any? = unwrap(this).getCrossAccount()

  /**
   * A description for the discoverer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ARN of the event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-sourcearn)
   */
  public fun sourceArn(): String

  /**
   * Tags associated with the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
   */
  public fun tags(): List<CfnDiscoverer.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnDiscoverer.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnDiscovererProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account.
     */
    public fun crossAccount(crossAccount: Boolean)

    /**
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account.
     */
    public fun crossAccount(crossAccount: IResolvable)

    /**
     * @param description A description for the discoverer.
     */
    public fun description(description: String)

    /**
     * @param sourceArn The ARN of the event bus. 
     */
    public fun sourceArn(sourceArn: String)

    /**
     * @param tags Tags associated with the resource.
     */
    public fun tags(tags: List<CfnDiscoverer.TagsEntryProperty>)

    /**
     * @param tags Tags associated with the resource.
     */
    public fun tags(vararg tags: CfnDiscoverer.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnDiscovererProps.Builder
        = software.amazon.awscdk.services.eventschemas.CfnDiscovererProps.builder()

    /**
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account.
     */
    override fun crossAccount(crossAccount: Boolean) {
      cdkBuilder.crossAccount(crossAccount)
    }

    /**
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account.
     */
    override fun crossAccount(crossAccount: IResolvable) {
      cdkBuilder.crossAccount(crossAccount.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param description A description for the discoverer.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param sourceArn The ARN of the event bus. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * @param tags Tags associated with the resource.
     */
    override fun tags(tags: List<CfnDiscoverer.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnDiscoverer.TagsEntryProperty.Companion::unwrap))
    }

    /**
     * @param tags Tags associated with the resource.
     */
    override fun tags(vararg tags: CfnDiscoverer.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnDiscovererProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscovererProps,
  ) : CdkObject(cdkObject),
      CfnDiscovererProps {
    /**
     * Allows for the discovery of the event schemas that are sent to the event bus from another
     * account.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
     */
    override fun crossAccount(): Any? = unwrap(this).getCrossAccount()

    /**
     * A description for the discoverer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ARN of the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-sourcearn)
     */
    override fun sourceArn(): String = unwrap(this).getSourceArn()

    /**
     * Tags associated with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
     */
    override fun tags(): List<CfnDiscoverer.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnDiscoverer.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDiscovererProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscovererProps):
        CfnDiscovererProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDiscovererProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDiscovererProps):
        software.amazon.awscdk.services.eventschemas.CfnDiscovererProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnDiscovererProps
  }
}
