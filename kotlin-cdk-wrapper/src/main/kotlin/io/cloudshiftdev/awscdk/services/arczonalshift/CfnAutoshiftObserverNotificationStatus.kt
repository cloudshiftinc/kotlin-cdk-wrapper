@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.arczonalshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::ARCZonalShift::AutoshiftObserverNotificationStatus Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.arczonalshift.*;
 * CfnAutoshiftObserverNotificationStatus cfnAutoshiftObserverNotificationStatus =
 * CfnAutoshiftObserverNotificationStatus.Builder.create(this,
 * "MyCfnAutoshiftObserverNotificationStatus")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-autoshiftobservernotificationstatus.html)
 */
public open class CfnAutoshiftObserverNotificationStatus(
  cdkObject: software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAutoshiftObserverNotificationStatusProps,
  ) :
      this(software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAutoshiftObserverNotificationStatusProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAutoshiftObserverNotificationStatusProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAutoshiftObserverNotificationStatusProps(props)
  )

  /**
   * User account id, used as part of the primary identifier for the resource.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Region, used as part of the primary identifier for the resource.
   */
  public open fun attrRegion(): String = unwrap(this).getAttrRegion()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun status(): String = unwrap(this).getStatus()

  /**
   *
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-autoshiftobservernotificationstatus.html#cfn-arczonalshift-autoshiftobservernotificationstatus-status)
     * @param status 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus.Builder
        =
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus.Builder.create(scope,
        id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-autoshiftobservernotificationstatus.html#cfn-arczonalshift-autoshiftobservernotificationstatus-status)
     * @param status 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build():
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAutoshiftObserverNotificationStatus {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAutoshiftObserverNotificationStatus(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus):
        CfnAutoshiftObserverNotificationStatus = CfnAutoshiftObserverNotificationStatus(cdkObject)

    internal fun unwrap(wrapped: CfnAutoshiftObserverNotificationStatus):
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus =
        wrapped.cdkObject as
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus
  }
}
