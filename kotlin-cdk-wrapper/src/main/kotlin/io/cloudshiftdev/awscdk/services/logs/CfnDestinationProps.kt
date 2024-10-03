@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDestination`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnDestinationProps cfnDestinationProps = CfnDestinationProps.builder()
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
public interface CfnDestinationProps {
  /**
   * The name of the destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
   */
  public fun destinationName(): String

  /**
   * An IAM policy document that governs which AWS accounts can create subscription filters against
   * this destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
   */
  public fun destinationPolicy(): String? = unwrap(this).getDestinationPolicy()

  /**
   * The ARN of an IAM role that permits CloudWatch Logs to send data to the specified AWS resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
   */
  public fun roleArn(): String

  /**
   * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for
   * example, a Kinesis stream).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
   */
  public fun targetArn(): String

  /**
   * A builder for [CfnDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationName The name of the destination. 
     */
    public fun destinationName(destinationName: String)

    /**
     * @param destinationPolicy An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination.
     */
    public fun destinationPolicy(destinationPolicy: String)

    /**
     * @param roleArn The ARN of an IAM role that permits CloudWatch Logs to send data to the
     * specified AWS resource. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param targetArn The Amazon Resource Name (ARN) of the physical target where the log events
     * are delivered (for example, a Kinesis stream). 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDestinationProps.Builder =
        software.amazon.awscdk.services.logs.CfnDestinationProps.builder()

    /**
     * @param destinationName The name of the destination. 
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * @param destinationPolicy An IAM policy document that governs which AWS accounts can create
     * subscription filters against this destination.
     */
    override fun destinationPolicy(destinationPolicy: String) {
      cdkBuilder.destinationPolicy(destinationPolicy)
    }

    /**
     * @param roleArn The ARN of an IAM role that permits CloudWatch Logs to send data to the
     * specified AWS resource. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param targetArn The Amazon Resource Name (ARN) of the physical target where the log events
     * are delivered (for example, a Kinesis stream). 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnDestinationProps,
  ) : CdkObject(cdkObject),
      CfnDestinationProps {
    /**
     * The name of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
     */
    override fun destinationName(): String = unwrap(this).getDestinationName()

    /**
     * An IAM policy document that governs which AWS accounts can create subscription filters
     * against this destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
     */
    override fun destinationPolicy(): String? = unwrap(this).getDestinationPolicy()

    /**
     * The ARN of an IAM role that permits CloudWatch Logs to send data to the specified AWS
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for
     * example, a Kinesis stream).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDestinationProps):
        CfnDestinationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDestinationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDestinationProps):
        software.amazon.awscdk.services.logs.CfnDestinationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.CfnDestinationProps
  }
}
