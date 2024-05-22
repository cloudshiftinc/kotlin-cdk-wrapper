@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMaintenanceWindowTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * CfnMaintenanceWindowTargetProps cfnMaintenanceWindowTargetProps =
 * CfnMaintenanceWindowTargetProps.builder()
 * .resourceType("resourceType")
 * .targets(List.of(TargetsProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .windowId("windowId")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .ownerInformation("ownerInformation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
 */
public interface CfnMaintenanceWindowTargetProps {
  /**
   * A description for the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name for the maintenance window target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A user-provided value that will be included in any Amazon CloudWatch Events events that are
   * raised while running tasks for these targets in this maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-ownerinformation)
   */
  public fun ownerInformation(): String? = unwrap(this).getOwnerInformation()

  /**
   * The type of target that is being registered with the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-resourcetype)
   */
  public fun resourceType(): String

  /**
   * The targets to register with the maintenance window.
   *
   * In other words, the instances to run commands on when the maintenance window runs.
   *
   * You must specify targets by using the `WindowTargetIds` parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
   */
  public fun targets(): Any

  /**
   * The ID of the maintenance window to register the target with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-windowid)
   */
  public fun windowId(): String

  /**
   * A builder for [CfnMaintenanceWindowTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the target.
     */
    public fun description(description: String)

    /**
     * @param name The name for the maintenance window target.
     */
    public fun name(name: String)

    /**
     * @param ownerInformation A user-provided value that will be included in any Amazon CloudWatch
     * Events events that are raised while running tasks for these targets in this maintenance window.
     */
    public fun ownerInformation(ownerInformation: String)

    /**
     * @param resourceType The type of target that is being registered with the maintenance window. 
     */
    public fun resourceType(resourceType: String)

    /**
     * @param targets The targets to register with the maintenance window. 
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets The targets to register with the maintenance window. 
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     */
    public fun targets(targets: List<Any>)

    /**
     * @param targets The targets to register with the maintenance window. 
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     */
    public fun targets(vararg targets: Any)

    /**
     * @param windowId The ID of the maintenance window to register the target with. 
     */
    public fun windowId(windowId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps.builder()

    /**
     * @param description A description for the target.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name for the maintenance window target.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ownerInformation A user-provided value that will be included in any Amazon CloudWatch
     * Events events that are raised while running tasks for these targets in this maintenance window.
     */
    override fun ownerInformation(ownerInformation: String) {
      cdkBuilder.ownerInformation(ownerInformation)
    }

    /**
     * @param resourceType The type of target that is being registered with the maintenance window. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param targets The targets to register with the maintenance window. 
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targets The targets to register with the maintenance window. 
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param targets The targets to register with the maintenance window. 
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * @param windowId The ID of the maintenance window to register the target with. 
     */
    override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps,
  ) : CdkObject(cdkObject), CfnMaintenanceWindowTargetProps {
    /**
     * A description for the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name for the maintenance window target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A user-provided value that will be included in any Amazon CloudWatch Events events that are
     * raised while running tasks for these targets in this maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-ownerinformation)
     */
    override fun ownerInformation(): String? = unwrap(this).getOwnerInformation()

    /**
     * The type of target that is being registered with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-resourcetype)
     */
    override fun resourceType(): String = unwrap(this).getResourceType()

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     */
    override fun targets(): Any = unwrap(this).getTargets()

    /**
     * The ID of the maintenance window to register the target with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-windowid)
     */
    override fun windowId(): String = unwrap(this).getWindowId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMaintenanceWindowTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps):
        CfnMaintenanceWindowTargetProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMaintenanceWindowTargetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTargetProps):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps
  }
}
