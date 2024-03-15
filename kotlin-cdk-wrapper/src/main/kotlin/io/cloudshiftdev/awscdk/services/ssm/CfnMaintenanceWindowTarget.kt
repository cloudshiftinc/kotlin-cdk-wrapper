@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SSM::MaintenanceWindowTarget` resource registers a target with a maintenance window for
 * AWS Systems Manager .
 *
 * For more information, see
 * [RegisterTargetWithMaintenanceWindow](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterTargetWithMaintenanceWindow.html)
 * in the *AWS Systems Manager API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * CfnMaintenanceWindowTarget cfnMaintenanceWindowTarget =
 * CfnMaintenanceWindowTarget.Builder.create(this, "MyCfnMaintenanceWindowTarget")
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
public open class CfnMaintenanceWindowTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description for the target.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the target.
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
   * The name for the maintenance window target.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name for the maintenance window target.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A user-provided value that will be included in any Amazon CloudWatch Events events that are
   * raised while running tasks for these targets in this maintenance window.
   */
  public open fun ownerInformation(): String? = unwrap(this).getOwnerInformation()

  /**
   * A user-provided value that will be included in any Amazon CloudWatch Events events that are
   * raised while running tasks for these targets in this maintenance window.
   */
  public open fun ownerInformation(`value`: String) {
    unwrap(this).setOwnerInformation(`value`)
  }

  /**
   * The type of target that is being registered with the maintenance window.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * The type of target that is being registered with the maintenance window.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * The targets to register with the maintenance window.
   */
  public open fun targets(): Any = unwrap(this).getTargets()

  /**
   * The targets to register with the maintenance window.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * The targets to register with the maintenance window.
   */
  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  /**
   * The targets to register with the maintenance window.
   */
  public open fun targets(vararg __idx_ac66f0: Any): Unit = targets(__idx_ac66f0.toList())

  /**
   * The ID of the maintenance window to register the target with.
   */
  public open fun windowId(): String = unwrap(this).getWindowId()

  /**
   * The ID of the maintenance window to register the target with.
   */
  public open fun windowId(`value`: String) {
    unwrap(this).setWindowId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnMaintenanceWindowTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-description)
     * @param description A description for the target. 
     */
    public fun description(description: String)

    /**
     * The name for the maintenance window target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-name)
     * @param name The name for the maintenance window target. 
     */
    public fun name(name: String)

    /**
     * A user-provided value that will be included in any Amazon CloudWatch Events events that are
     * raised while running tasks for these targets in this maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-ownerinformation)
     * @param ownerInformation A user-provided value that will be included in any Amazon CloudWatch
     * Events events that are raised while running tasks for these targets in this maintenance window. 
     */
    public fun ownerInformation(ownerInformation: String)

    /**
     * The type of target that is being registered with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-resourcetype)
     * @param resourceType The type of target that is being registered with the maintenance window. 
     */
    public fun resourceType(resourceType: String)

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window. 
     */
    public fun targets(targets: IResolvable)

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window. 
     */
    public fun targets(targets: List<Any>)

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window. 
     */
    public fun targets(vararg targets: Any)

    /**
     * The ID of the maintenance window to register the target with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-windowid)
     * @param windowId The ID of the maintenance window to register the target with. 
     */
    public fun windowId(windowId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.Builder.create(scope, id)

    /**
     * A description for the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-description)
     * @param description A description for the target. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name for the maintenance window target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-name)
     * @param name The name for the maintenance window target. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A user-provided value that will be included in any Amazon CloudWatch Events events that are
     * raised while running tasks for these targets in this maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-ownerinformation)
     * @param ownerInformation A user-provided value that will be included in any Amazon CloudWatch
     * Events events that are raised while running tasks for these targets in this maintenance window. 
     */
    override fun ownerInformation(ownerInformation: String) {
      cdkBuilder.ownerInformation(ownerInformation)
    }

    /**
     * The type of target that is being registered with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-resourcetype)
     * @param resourceType The type of target that is being registered with the maintenance window. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * The ID of the maintenance window to register the target with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-windowid)
     * @param windowId The ID of the maintenance window to register the target with. 
     */
    override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaintenanceWindowTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaintenanceWindowTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget):
        CfnMaintenanceWindowTarget = CfnMaintenanceWindowTarget(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTarget):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget = wrapped.cdkObject
  }

  /**
   * The `Targets` property type specifies adding a target to a maintenance window target in AWS
   * Systems Manager .
   *
   * `Targets` is a property of the
   * [AWS::SSM::MaintenanceWindowTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssm.*;
   * TargetsProperty targetsProperty = TargetsProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtarget-targets.html)
   */
  public interface TargetsProperty {
    /**
     * User-defined criteria for sending commands that target managed nodes that meet the criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtarget-targets.html#cfn-ssm-maintenancewindowtarget-targets-key)
     */
    public fun key(): String

    /**
     * User-defined criteria that maps to `Key` .
     *
     * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run a
     * command on instances that include EC2 tags of `ServerRole,WebServer` .
     *
     * Depending on the type of target, the maximum number of values for a key might be lower than
     * the global maximum of 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtarget-targets.html#cfn-ssm-maintenancewindowtarget-targets-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [TargetsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key User-defined criteria for sending commands that target managed nodes that meet
       * the criteria. 
       */
      public fun key(key: String)

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      public fun values(values: List<String>)

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty.builder()

      /**
       * @param key User-defined criteria for sending commands that target managed nodes that meet
       * the criteria. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values User-defined criteria that maps to `Key` . 
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty,
    ) : CdkObject(cdkObject), TargetsProperty {
      /**
       * User-defined criteria for sending commands that target managed nodes that meet the
       * criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtarget-targets.html#cfn-ssm-maintenancewindowtarget-targets-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * User-defined criteria that maps to `Key` .
       *
       * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run
       * a command on instances that include EC2 tags of `ServerRole,WebServer` .
       *
       * Depending on the type of target, the maximum number of values for a key might be lower than
       * the global maximum of 50.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtarget-targets.html#cfn-ssm-maintenancewindowtarget-targets-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty):
          TargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty
    }
  }
}
