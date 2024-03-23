@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnGraph`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.detective.*;
 * CfnGraphProps cfnGraphProps = CfnGraphProps.builder()
 * .autoEnableMembers(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html)
 */
public interface CfnGraphProps {
  /**
   * Indicates whether to automatically enable new organization accounts as member accounts in the
   * organization behavior graph.
   *
   * By default, this property is set to `false` . If you want to change the value of this property,
   * you must be the Detective administrator for the organization. For more information on setting a
   * Detective administrator account, see
   * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-autoenablemembers)
   */
  public fun autoEnableMembers(): Any? = unwrap(this).getAutoEnableMembers()

  /**
   * The tag values to assign to the new behavior graph.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGraphProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph.
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     */
    public fun autoEnableMembers(autoEnableMembers: Boolean)

    /**
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph.
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     */
    public fun autoEnableMembers(autoEnableMembers: IResolvable)

    /**
     * @param tags The tag values to assign to the new behavior graph.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tag values to assign to the new behavior graph.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnGraphProps.Builder =
        software.amazon.awscdk.services.detective.CfnGraphProps.builder()

    /**
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph.
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     */
    override fun autoEnableMembers(autoEnableMembers: Boolean) {
      cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    /**
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     * as member accounts in the organization behavior graph.
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     */
    override fun autoEnableMembers(autoEnableMembers: IResolvable) {
      cdkBuilder.autoEnableMembers(autoEnableMembers.let(IResolvable::unwrap))
    }

    /**
     * @param tags The tag values to assign to the new behavior graph.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tag values to assign to the new behavior graph.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.detective.CfnGraphProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.detective.CfnGraphProps,
  ) : CdkObject(cdkObject), CfnGraphProps {
    /**
     * Indicates whether to automatically enable new organization accounts as member accounts in the
     * organization behavior graph.
     *
     * By default, this property is set to `false` . If you want to change the value of this
     * property, you must be the Detective administrator for the organization. For more information on
     * setting a Detective administrator account, see
     * [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-autoenablemembers)
     */
    override fun autoEnableMembers(): Any? = unwrap(this).getAutoEnableMembers()

    /**
     * The tag values to assign to the new behavior graph.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html#cfn-detective-graph-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnGraphProps):
        CfnGraphProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGraphProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGraphProps):
        software.amazon.awscdk.services.detective.CfnGraphProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.detective.CfnGraphProps
  }
}
