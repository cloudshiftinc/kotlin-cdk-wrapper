@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an AWS Deadline Cloud monitor that you can use to view your farms, queues, and fleets.
 *
 * After you submit a job, you can track the progress of the tasks and steps that make up the job,
 * and then download the job's results.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnMonitor cfnMonitor = CfnMonitor.Builder.create(this, "MyCfnMonitor")
 * .displayName("displayName")
 * .identityCenterInstanceArn("identityCenterInstanceArn")
 * .roleArn("roleArn")
 * .subdomain("subdomain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html)
 */
public open class CfnMonitor(
  cdkObject: software.amazon.awscdk.services.deadline.CfnMonitor,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMonitorProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnMonitor(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMonitorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMonitorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMonitorProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the monitor.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) that the IAM Identity Center assigned to the monitor when it was
   * created.
   */
  public open fun attrIdentityCenterApplicationArn(): String =
      unwrap(this).getAttrIdentityCenterApplicationArn()

  /**
   * The unique identifier for the monitor.
   */
  public open fun attrMonitorId(): String = unwrap(this).getAttrMonitorId()

  /**
   * The complete URL of the monitor.
   *
   * The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
   */
  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  /**
   * The name of the monitor that displays on the Deadline Cloud console.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The name of the monitor that displays on the Deadline Cloud console.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for
   * authenticating monitor users.
   */
  public open fun identityCenterInstanceArn(): String = unwrap(this).getIdentityCenterInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for
   * authenticating monitor users.
   */
  public open fun identityCenterInstanceArn(`value`: String) {
    unwrap(this).setIdentityCenterInstanceArn(`value`)
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
   * The Amazon Resource Name (ARN) of the IAM role for the monitor.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role for the monitor.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The subdomain used for the monitor URL.
   */
  public open fun subdomain(): String = unwrap(this).getSubdomain()

  /**
   * The subdomain used for the monitor URL.
   */
  public open fun subdomain(`value`: String) {
    unwrap(this).setSubdomain(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnMonitor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the monitor that displays on the Deadline Cloud console.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-displayname)
     * @param displayName The name of the monitor that displays on the Deadline Cloud console. 
     */
    public fun displayName(displayName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for
     * authenticating monitor users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-identitycenterinstancearn)
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance responsible for authenticating monitor users. 
     */
    public fun identityCenterInstanceArn(identityCenterInstanceArn: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the monitor.
     *
     * Users of the monitor use this role to access Deadline Cloud resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role for the monitor. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The subdomain used for the monitor URL.
     *
     * The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-subdomain)
     * @param subdomain The subdomain used for the monitor URL. 
     */
    public fun subdomain(subdomain: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnMonitor.Builder =
        software.amazon.awscdk.services.deadline.CfnMonitor.Builder.create(scope, id)

    /**
     * The name of the monitor that displays on the Deadline Cloud console.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-displayname)
     * @param displayName The name of the monitor that displays on the Deadline Cloud console. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance responsible for
     * authenticating monitor users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-identitycenterinstancearn)
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance responsible for authenticating monitor users. 
     */
    override fun identityCenterInstanceArn(identityCenterInstanceArn: String) {
      cdkBuilder.identityCenterInstanceArn(identityCenterInstanceArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the monitor.
     *
     * Users of the monitor use this role to access Deadline Cloud resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role for the monitor. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The subdomain used for the monitor URL.
     *
     * The full URL of the monitor is subdomain.Region.deadlinecloud.amazonaws.com.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-monitor.html#cfn-deadline-monitor-subdomain)
     * @param subdomain The subdomain used for the monitor URL. 
     */
    override fun subdomain(subdomain: String) {
      cdkBuilder.subdomain(subdomain)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnMonitor = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnMonitor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnMonitor): CfnMonitor =
        CfnMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnMonitor): software.amazon.awscdk.services.deadline.CfnMonitor =
        wrapped.cdkObject as software.amazon.awscdk.services.deadline.CfnMonitor
  }
}
