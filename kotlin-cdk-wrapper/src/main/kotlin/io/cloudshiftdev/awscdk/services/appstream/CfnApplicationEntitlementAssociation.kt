@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates an application to an entitlement.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnApplicationEntitlementAssociation cfnApplicationEntitlementAssociation =
 * CfnApplicationEntitlementAssociation.Builder.create(this, "MyCfnApplicationEntitlementAssociation")
 * .applicationIdentifier("applicationIdentifier")
 * .entitlementName("entitlementName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html)
 */
public open class CfnApplicationEntitlementAssociation(
  cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationEntitlementAssociationProps,
  ) :
      this(software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationEntitlementAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationEntitlementAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationEntitlementAssociationProps(props)
  )

  /**
   * The identifier of the application.
   */
  public open fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

  /**
   * The identifier of the application.
   */
  public open fun applicationIdentifier(`value`: String) {
    unwrap(this).setApplicationIdentifier(`value`)
  }

  /**
   * The name of the entitlement.
   */
  public open fun entitlementName(): String = unwrap(this).getEntitlementName()

  /**
   * The name of the entitlement.
   */
  public open fun entitlementName(`value`: String) {
    unwrap(this).setEntitlementName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the stack.
   */
  public open fun stackName(): String = unwrap(this).getStackName()

  /**
   * The name of the stack.
   */
  public open fun stackName(`value`: String) {
    unwrap(this).setStackName(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.appstream.CfnApplicationEntitlementAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-applicationidentifier)
     * @param applicationIdentifier The identifier of the application. 
     */
    public fun applicationIdentifier(applicationIdentifier: String)

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-entitlementname)
     * @param entitlementName The name of the entitlement. 
     */
    public fun entitlementName(entitlementName: String)

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-stackname)
     * @param stackName The name of the stack. 
     */
    public fun stackName(stackName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation.Builder.create(scope,
        id)

    /**
     * The identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-applicationidentifier)
     * @param applicationIdentifier The identifier of the application. 
     */
    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-entitlementname)
     * @param entitlementName The name of the entitlement. 
     */
    override fun entitlementName(entitlementName: String) {
      cdkBuilder.entitlementName(entitlementName)
    }

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationentitlementassociation.html#cfn-appstream-applicationentitlementassociation-stackname)
     * @param stackName The name of the stack. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build():
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationEntitlementAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationEntitlementAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation):
        CfnApplicationEntitlementAssociation = CfnApplicationEntitlementAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationEntitlementAssociation):
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation
  }
}
