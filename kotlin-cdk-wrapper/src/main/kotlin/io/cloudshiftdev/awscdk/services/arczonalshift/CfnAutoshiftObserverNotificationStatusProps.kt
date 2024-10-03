@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.arczonalshift

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAutoshiftObserverNotificationStatus`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.arczonalshift.*;
 * CfnAutoshiftObserverNotificationStatusProps cfnAutoshiftObserverNotificationStatusProps =
 * CfnAutoshiftObserverNotificationStatusProps.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-autoshiftobservernotificationstatus.html)
 */
public interface CfnAutoshiftObserverNotificationStatusProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-autoshiftobservernotificationstatus.html#cfn-arczonalshift-autoshiftobservernotificationstatus-status)
   */
  public fun status(): String

  /**
   * A builder for [CfnAutoshiftObserverNotificationStatusProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param status the value to be set. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps.Builder
        =
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps.builder()

    /**
     * @param status the value to be set. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build():
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps,
  ) : CdkObject(cdkObject),
      CfnAutoshiftObserverNotificationStatusProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-autoshiftobservernotificationstatus.html#cfn-arczonalshift-autoshiftobservernotificationstatus-status)
     */
    override fun status(): String = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnAutoshiftObserverNotificationStatusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps):
        CfnAutoshiftObserverNotificationStatusProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAutoshiftObserverNotificationStatusProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoshiftObserverNotificationStatusProps):
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps
  }
}
