@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::Logs::Destination resource specifies a CloudWatch Logs destination.
 *
 * A destination encapsulates a physical resource (such as an Amazon Kinesis data stream) and
 * enables you to subscribe that resource to a stream of log events.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnDestination cfnDestination = CfnDestination.Builder.create(this, "MyCfnDestination")
 * .destinationName("destinationName")
 * .roleArn("roleArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .destinationPolicy("destinationPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html)
 */
public open class CfnDestination(
  cdkObject: software.amazon.awscdk.services.logs.CfnDestination,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDestinationProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDestinationProps(props)
  )

  /**
   * The ARN of the CloudWatch Logs destination, such as
   * `arn:aws:logs:us-west-1:123456789012:destination:MyDestination` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the destination.
   */
  public open fun destinationName(): String = unwrap(this).getDestinationName()

  /**
   * The name of the destination.
   */
  public open fun destinationName(`value`: String) {
    unwrap(this).setDestinationName(`value`)
  }

  /**
   * An IAM policy document that governs which AWS accounts can create subscription filters against
   * this destination.
   */
  public open fun destinationPolicy(): String? = unwrap(this).getDestinationPolicy()

  /**
   * An IAM policy document that governs which AWS accounts can create subscription filters against
   * this destination.
   */
  public open fun destinationPolicy(`value`: String) {
    unwrap(this).setDestinationPolicy(`value`)
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
   * The ARN of an IAM role that permits CloudWatch Logs to send data to the specified AWS resource.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of an IAM role that permits CloudWatch Logs to send data to the specified AWS resource.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for
   * example, a Kinesis stream).
   */
  public open fun targetArn(): String = unwrap(this).getTargetArn()

  /**
   * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for
   * example, a Kinesis stream).
   */
  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
     * @param destinationName The name of the destination. 
     */
    public fun destinationName(destinationName: String)

    /**
     * An IAM policy document that governs which AWS accounts can create subscription filters
     * against this destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
     * @param destinationPolicy An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination. 
     */
    public fun destinationPolicy(destinationPolicy: String)

    /**
     * The ARN of an IAM role that permits CloudWatch Logs to send data to the specified AWS
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
     * @param roleArn The ARN of an IAM role that permits CloudWatch Logs to send data to the
     * specified AWS resource. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for
     * example, a Kinesis stream).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of the physical target where the log events
     * are delivered (for example, a Kinesis stream). 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDestination.Builder =
        software.amazon.awscdk.services.logs.CfnDestination.Builder.create(scope, id)

    /**
     * The name of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
     * @param destinationName The name of the destination. 
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * An IAM policy document that governs which AWS accounts can create subscription filters
     * against this destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
     * @param destinationPolicy An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination. 
     */
    override fun destinationPolicy(destinationPolicy: String) {
      cdkBuilder.destinationPolicy(destinationPolicy)
    }

    /**
     * The ARN of an IAM role that permits CloudWatch Logs to send data to the specified AWS
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
     * @param roleArn The ARN of an IAM role that permits CloudWatch Logs to send data to the
     * specified AWS resource. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for
     * example, a Kinesis stream).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of the physical target where the log events
     * are delivered (for example, a Kinesis stream). 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnDestination = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnDestination.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDestination):
        CfnDestination = CfnDestination(cdkObject)

    internal fun unwrap(wrapped: CfnDestination):
        software.amazon.awscdk.services.logs.CfnDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnDestination
  }
}
