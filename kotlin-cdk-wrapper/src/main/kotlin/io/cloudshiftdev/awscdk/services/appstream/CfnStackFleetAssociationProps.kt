@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnStackFleetAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnStackFleetAssociationProps cfnStackFleetAssociationProps =
 * CfnStackFleetAssociationProps.builder()
 * .fleetName("fleetName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html)
 */
public interface CfnStackFleetAssociationProps {
  /**
   * The name of the fleet.
   *
   * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
   * more information, see [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname)
   */
  public fun fleetName(): String

  /**
   * The name of the stack.
   *
   * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
   * more information, see [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname)
   */
  public fun stackName(): String

  /**
   * A builder for [CfnStackFleetAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fleetName The name of the fleet. 
     * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    public fun fleetName(fleetName: String)

    /**
     * @param stackName The name of the stack. 
     * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    public fun stackName(stackName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.builder()

    /**
     * @param fleetName The name of the fleet. 
     * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    /**
     * @param stackName The name of the stack. 
     * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps,
  ) : CdkObject(cdkObject), CfnStackFleetAssociationProps {
    /**
     * The name of the fleet.
     *
     * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname)
     */
    override fun fleetName(): String = unwrap(this).getFleetName()

    /**
     * The name of the stack.
     *
     * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname)
     */
    override fun stackName(): String = unwrap(this).getStackName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackFleetAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps):
        CfnStackFleetAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackFleetAssociationProps):
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
  }
}
