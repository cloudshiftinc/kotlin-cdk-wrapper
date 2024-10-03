@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
 * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
 * .name("name")
 * // the properties below are optional
 * .resourceArns(List.of("resourceArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html)
 */
public interface CfnGroupProps {
  /**
   * A name for the group. It can include any Unicode characters.
   *
   * The names for all groups in your account, across all Regions, must be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-name)
   */
  public fun name(): String

  /**
   * The ARNs of the canaries that you want to associate with this group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
   */
  public fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

  /**
   * The list of key-value pairs that are associated with the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name A name for the group. It can include any Unicode characters. 
     * The names for all groups in your account, across all Regions, must be unique.
     */
    public fun name(name: String)

    /**
     * @param resourceArns The ARNs of the canaries that you want to associate with this group.
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * @param resourceArns The ARNs of the canaries that you want to associate with this group.
     */
    public fun resourceArns(vararg resourceArns: String)

    /**
     * @param tags The list of key-value pairs that are associated with the group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value pairs that are associated with the group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CfnGroupProps.Builder =
        software.amazon.awscdk.services.synthetics.CfnGroupProps.builder()

    /**
     * @param name A name for the group. It can include any Unicode characters. 
     * The names for all groups in your account, across all Regions, must be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourceArns The ARNs of the canaries that you want to associate with this group.
     */
    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    /**
     * @param resourceArns The ARNs of the canaries that you want to associate with this group.
     */
    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    /**
     * @param tags The list of key-value pairs that are associated with the group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of key-value pairs that are associated with the group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.synthetics.CfnGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.synthetics.CfnGroupProps,
  ) : CdkObject(cdkObject),
      CfnGroupProps {
    /**
     * A name for the group. It can include any Unicode characters.
     *
     * The names for all groups in your account, across all Regions, must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     */
    override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnGroupProps):
        CfnGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps):
        software.amazon.awscdk.services.synthetics.CfnGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.synthetics.CfnGroupProps
  }
}
