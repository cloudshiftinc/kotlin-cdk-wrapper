@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnIPSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
 * .format("format")
 * .location("location")
 * // the properties below are optional
 * .activate(false)
 * .detectorId("detectorId")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html)
 */
public interface CfnIPSetProps {
  /**
   * Indicates whether or not GuardDuty uses the `IPSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
   */
  public fun activate(): Any? = unwrap(this).getActivate()

  /**
   * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
   */
  public fun detectorId(): String? = unwrap(this).getDetectorId()

  /**
   * The format of the file that contains the IPSet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
   */
  public fun format(): String

  /**
   * The URI of the file that contains the IPSet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
   */
  public fun location(): String

  /**
   * The user-friendly name to identify the IPSet.
   *
   * Allowed characters are alphanumeric, whitespace, dash (-), and underscores (_).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags to be added to a new IP set resource.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIPSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
     */
    public fun activate(activate: Boolean)

    /**
     * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
     */
    public fun activate(activate: IResolvable)

    /**
     * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
     * create an IPSet for.
     */
    public fun detectorId(detectorId: String)

    /**
     * @param format The format of the file that contains the IPSet. 
     */
    public fun format(format: String)

    /**
     * @param location The URI of the file that contains the IPSet. 
     */
    public fun location(location: String)

    /**
     * @param name The user-friendly name to identify the IPSet.
     * Allowed characters are alphanumeric, whitespace, dash (-), and underscores (_).
     */
    public fun name(name: String)

    /**
     * @param tags The tags to be added to a new IP set resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be added to a new IP set resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnIPSetProps.builder()

    /**
     * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
     */
    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    /**
     * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
     */
    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    /**
     * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
     * create an IPSet for.
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * @param format The format of the file that contains the IPSet. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * @param location The URI of the file that contains the IPSet. 
     */
    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    /**
     * @param name The user-friendly name to identify the IPSet.
     * Allowed characters are alphanumeric, whitespace, dash (-), and underscores (_).
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to be added to a new IP set resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to be added to a new IP set resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnIPSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSetProps,
  ) : CdkObject(cdkObject), CfnIPSetProps {
    /**
     * Indicates whether or not GuardDuty uses the `IPSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
     */
    override fun activate(): Any? = unwrap(this).getActivate()

    /**
     * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
     */
    override fun detectorId(): String? = unwrap(this).getDetectorId()

    /**
     * The format of the file that contains the IPSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
     */
    override fun format(): String = unwrap(this).getFormat()

    /**
     * The URI of the file that contains the IPSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
     */
    override fun location(): String = unwrap(this).getLocation()

    /**
     * The user-friendly name to identify the IPSet.
     *
     * Allowed characters are alphanumeric, whitespace, dash (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags to be added to a new IP set resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSetProps):
        CfnIPSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIPSetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPSetProps):
        software.amazon.awscdk.services.guardduty.CfnIPSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnIPSetProps
  }
}
