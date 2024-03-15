@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSubnetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dax.*;
 * CfnSubnetGroupProps cfnSubnetGroupProps = CfnSubnetGroupProps.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .description("description")
 * .subnetGroupName("subnetGroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html)
 */
public interface CfnSubnetGroupProps {
  /**
   * The description of the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetgroupname)
   */
  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * A list of VPC subnet IDs for the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * A builder for [CfnSubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the subnet group.
     */
    public fun description(description: String)

    /**
     * @param subnetGroupName The name of the subnet group.
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder =
        software.amazon.awscdk.services.dax.CfnSubnetGroupProps.builder()

    /**
     * @param description The description of the subnet group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param subnetGroupName The name of the subnet group.
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    public fun build(): software.amazon.awscdk.services.dax.CfnSubnetGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnSubnetGroupProps {
    /**
     * The description of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetgroupname)
     */
    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    /**
     * A list of VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroupProps):
        CfnSubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroupProps):
        software.amazon.awscdk.services.dax.CfnSubnetGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dax.CfnSubnetGroupProps
  }
}
