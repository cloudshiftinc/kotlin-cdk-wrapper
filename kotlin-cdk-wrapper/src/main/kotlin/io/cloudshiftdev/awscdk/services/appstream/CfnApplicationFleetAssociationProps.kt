@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnApplicationFleetAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnApplicationFleetAssociationProps cfnApplicationFleetAssociationProps =
 * CfnApplicationFleetAssociationProps.builder()
 * .applicationArn("applicationArn")
 * .fleetName("fleetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html)
 */
public interface CfnApplicationFleetAssociationProps {
  /**
   * The ARN of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-applicationarn)
   */
  public fun applicationArn(): String

  /**
   * The name of the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-fleetname)
   */
  public fun fleetName(): String

  /**
   * A builder for [CfnApplicationFleetAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationArn The ARN of the application. 
     */
    public fun applicationArn(applicationArn: String)

    /**
     * @param fleetName The name of the fleet. 
     */
    public fun fleetName(fleetName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps.builder()

    /**
     * @param applicationArn The ARN of the application. 
     */
    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * @param fleetName The name of the fleet. 
     */
    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    public fun build():
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps,
  ) : CdkObject(cdkObject), CfnApplicationFleetAssociationProps {
    /**
     * The ARN of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-applicationarn)
     */
    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    /**
     * The name of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-fleetname)
     */
    override fun fleetName(): String = unwrap(this).getFleetName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationFleetAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps):
        CfnApplicationFleetAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnApplicationFleetAssociationProps

    internal fun unwrap(wrapped: CfnApplicationFleetAssociationProps):
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps
  }
}
