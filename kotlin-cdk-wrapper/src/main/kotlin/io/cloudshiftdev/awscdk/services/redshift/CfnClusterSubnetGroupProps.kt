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
 * Properties for defining a `CfnClusterSubnetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnClusterSubnetGroupProps cfnClusterSubnetGroupProps = CfnClusterSubnetGroupProps.builder()
 * .description("description")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html)
 */
public interface CfnClusterSubnetGroupProps {
  /**
   * A description for the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-description)
   */
  public fun description(): String

  /**
   * An array of VPC subnet IDs.
   *
   * A maximum of 20 subnets can be modified in a single request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
   *
   * Use tags to manage your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnClusterSubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the subnet group. 
     */
    public fun description(description: String)

    /**
     * @param subnetIds An array of VPC subnet IDs. 
     * A maximum of 20 subnets can be modified in a single request.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds An array of VPC subnet IDs. 
     * A maximum of 20 subnets can be modified in a single request.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group.
     * Use tags to manage your resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group.
     * Use tags to manage your resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.builder()

    /**
     * @param description A description for the subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param subnetIds An array of VPC subnet IDs. 
     * A maximum of 20 subnets can be modified in a single request.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds An array of VPC subnet IDs. 
     * A maximum of 20 subnets can be modified in a single request.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group.
     * Use tags to manage your resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group.
     * Use tags to manage your resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnClusterSubnetGroupProps {
    /**
     * A description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * An array of VPC subnet IDs.
     *
     * A maximum of 20 subnets can be modified in a single request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps):
        CfnClusterSubnetGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnClusterSubnetGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSubnetGroupProps):
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps
  }
}
