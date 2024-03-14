package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroup,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of the subnet group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the subnet group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the subnet group.
   */
  public open fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * The name of the subnet group.
   */
  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  /**
   * A list of VPC subnet IDs for the subnet group.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * A list of VPC subnet IDs for the subnet group.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * A list of VPC subnet IDs for the subnet group.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dax.CfnSubnetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-description)
     * @param description The description of the subnet group. 
     */
    public fun description(description: String)

    /**
     * The name of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetgroupname)
     * @param subnetGroupName The name of the subnet group. 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * A list of VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * A list of VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnSubnetGroup.Builder =
        software.amazon.awscdk.services.dax.CfnSubnetGroup.Builder.create(scope, id)

    /**
     * The description of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-description)
     * @param description The description of the subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetgroupname)
     * @param subnetGroupName The name of the subnet group. 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * A list of VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * A list of VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
     * @param subnetIds A list of VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    public fun build(): software.amazon.awscdk.services.dax.CfnSubnetGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroup): CfnSubnetGroup
        = CfnSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroup): software.amazon.awscdk.services.dax.CfnSubnetGroup
        = wrapped.cdkObject
  }
}
