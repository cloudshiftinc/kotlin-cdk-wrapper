@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnClusterSecurityGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnClusterSecurityGroupProps cfnClusterSecurityGroupProps =
 * CfnClusterSecurityGroupProps.builder()
 * .description("description")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html)
 */
public interface CfnClusterSecurityGroupProps {
  /**
   * A description for the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-description)
   */
  public fun description(): String

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
   *
   * Use tags to manage your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnClusterSecurityGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the security group. 
     */
    public fun description(description: String)

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group.
     * Use tags to manage your resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group.
     * Use tags to manage your resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.builder()

    /**
     * @param description A description for the security group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group.
     * Use tags to manage your resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group.
     * Use tags to manage your resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps,
  ) : CdkObject(cdkObject),
      CfnClusterSecurityGroupProps {
    /**
     * A description for the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps):
        CfnClusterSecurityGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnClusterSecurityGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSecurityGroupProps):
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps
  }
}
