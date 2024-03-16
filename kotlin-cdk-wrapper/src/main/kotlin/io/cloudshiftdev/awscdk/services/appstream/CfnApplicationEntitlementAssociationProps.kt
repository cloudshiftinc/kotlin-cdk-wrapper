@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnApplicationEntitlementAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnApplicationEntitlementAssociationProps cfnApplicationEntitlementAssociationProps =
 * CfnApplicationEntitlementAssociationProps.builder()
 * .applicationIdentifier("applicationIdentifier")
 * .entitlementName("entitlementName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html)
 */
public interface CfnApplicationEntitlementAssociationProps {
  /**
   * The identifier of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-applicationidentifier)
   */
  public fun applicationIdentifier(): String

  /**
   * The name of the entitlement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-entitlementname)
   */
  public fun entitlementName(): String

  /**
   * The name of the stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-stackname)
   */
  public fun stackName(): String

  /**
   * A builder for [CfnApplicationEntitlementAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationIdentifier The identifier of the application. 
     */
    public fun applicationIdentifier(applicationIdentifier: String)

    /**
     * @param entitlementName The name of the entitlement. 
     */
    public fun entitlementName(entitlementName: String)

    /**
     * @param stackName The name of the stack. 
     */
    public fun stackName(stackName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps.Builder
        =
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps.builder()

    /**
     * @param applicationIdentifier The identifier of the application. 
     */
    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /**
     * @param entitlementName The name of the entitlement. 
     */
    override fun entitlementName(entitlementName: String) {
      cdkBuilder.entitlementName(entitlementName)
    }

    /**
     * @param stackName The name of the stack. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build():
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps,
  ) : CdkObject(cdkObject), CfnApplicationEntitlementAssociationProps {
    /**
     * The identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-applicationidentifier)
     */
    override fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-entitlementname)
     */
    override fun entitlementName(): String = unwrap(this).getEntitlementName()

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-stackname)
     */
    override fun stackName(): String = unwrap(this).getStackName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationEntitlementAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps):
        CfnApplicationEntitlementAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnApplicationEntitlementAssociationProps

    internal fun unwrap(wrapped: CfnApplicationEntitlementAssociationProps):
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps
  }
}
