@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnMonitor`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnMonitorProps cfnMonitorProps = CfnMonitorProps.builder()
 * .displayName("displayName")
 * .identityCenterInstanceArn("identityCenterInstanceArn")
 * .roleArn("roleArn")
 * .subdomain("subdomain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html)
 */
public interface CfnMonitorProps {
  /**
   * The name of the monitor that displays on the Deadline Cloud console.
   *
   *
   * This field can store any content. Escape or encode this content before displaying it on a
   * webpage or any other system that might interpret the content of this field.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-displayname)
   */
  public fun displayName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for
   * authenticating monitor users.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-identitycenterinstancearn)
   */
  public fun identityCenterInstanceArn(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role for the monitor.
   *
   * Users of the monitor use this role to access Deadline Cloud resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-rolearn)
   */
  public fun roleArn(): String

  /**
   * The subdomain used for the monitor URL.
   *
   * The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-subdomain)
   */
  public fun subdomain(): String

  /**
   * A builder for [CfnMonitorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayName The name of the monitor that displays on the Deadline Cloud console. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    public fun displayName(displayName: String)

    /**
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance responsible for authenticating monitor users. 
     */
    public fun identityCenterInstanceArn(identityCenterInstanceArn: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role for the monitor. 
     * Users of the monitor use this role to access Deadline Cloud resources.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param subdomain The subdomain used for the monitor URL. 
     * The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     */
    public fun subdomain(subdomain: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnMonitorProps.Builder =
        software.amazon.awscdk.services.deadline.CfnMonitorProps.builder()

    /**
     * @param displayName The name of the monitor that displays on the Deadline Cloud console. 
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance responsible for authenticating monitor users. 
     */
    override fun identityCenterInstanceArn(identityCenterInstanceArn: String) {
      cdkBuilder.identityCenterInstanceArn(identityCenterInstanceArn)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role for the monitor. 
     * Users of the monitor use this role to access Deadline Cloud resources.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param subdomain The subdomain used for the monitor URL. 
     * The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     */
    override fun subdomain(subdomain: String) {
      cdkBuilder.subdomain(subdomain)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnMonitorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnMonitorProps,
  ) : CdkObject(cdkObject),
      CfnMonitorProps {
    /**
     * The name of the monitor that displays on the Deadline Cloud console.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for
     * authenticating monitor users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-identitycenterinstancearn)
     */
    override fun identityCenterInstanceArn(): String = unwrap(this).getIdentityCenterInstanceArn()

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the monitor.
     *
     * Users of the monitor use this role to access Deadline Cloud resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The subdomain used for the monitor URL.
     *
     * The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-subdomain)
     */
    override fun subdomain(): String = unwrap(this).getSubdomain()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMonitorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnMonitorProps):
        CfnMonitorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMonitorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMonitorProps):
        software.amazon.awscdk.services.deadline.CfnMonitorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.deadline.CfnMonitorProps
  }
}
