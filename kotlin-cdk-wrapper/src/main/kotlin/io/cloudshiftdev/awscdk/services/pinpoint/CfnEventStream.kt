@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new event stream for an application or updates the settings of an existing event stream
 * for an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnEventStream cfnEventStream = CfnEventStream.Builder.create(this, "MyCfnEventStream")
 * .applicationId("applicationId")
 * .destinationStreamArn("destinationStreamArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html)
 */
public open class CfnEventStream(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnEventStream,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventStreamProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnEventStream(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventStreamProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventStreamProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventStreamProps(props)
  )

  /**
   * The unique identifier for the Amazon Pinpoint application that you want to export data from.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application that you want to export data from.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream or Amazon Data Firehose
   * delivery stream that you want to publish event data to.
   */
  public open fun destinationStreamArn(): String = unwrap(this).getDestinationStreamArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream or Amazon Data Firehose
   * delivery stream that you want to publish event data to.
   */
  public open fun destinationStreamArn(`value`: String) {
    unwrap(this).setDestinationStreamArn(`value`)
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
   * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish
   * event data to the stream in your AWS account.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish
   * event data to the stream in your AWS account.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnEventStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier for the Amazon Pinpoint application that you want to export data from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you want
     * to export data from. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream or Amazon Data Firehose
     * delivery stream that you want to publish event data to.
     *
     * For a Kinesis Data Stream, the ARN format is: `arn:aws:kinesis: region : account-id :stream/
     * stream_name`
     *
     * For a Firehose delivery stream, the ARN format is: `arn:aws:firehose: region : account-id
     * :deliverystream/ stream_name`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-destinationstreamarn)
     * @param destinationStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream
     * or Amazon Data Firehose delivery stream that you want to publish event data to. 
     */
    public fun destinationStreamArn(destinationStreamArn: String)

    /**
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish
     * event data to the stream in your AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-rolearn)
     * @param roleArn The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEventStream.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEventStream.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that you want to export data from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you want
     * to export data from. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream or Amazon Data Firehose
     * delivery stream that you want to publish event data to.
     *
     * For a Kinesis Data Stream, the ARN format is: `arn:aws:kinesis: region : account-id :stream/
     * stream_name`
     *
     * For a Firehose delivery stream, the ARN format is: `arn:aws:firehose: region : account-id
     * :deliverystream/ stream_name`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-destinationstreamarn)
     * @param destinationStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream
     * or Amazon Data Firehose delivery stream that you want to publish event data to. 
     */
    override fun destinationStreamArn(destinationStreamArn: String) {
      cdkBuilder.destinationStreamArn(destinationStreamArn)
    }

    /**
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish
     * event data to the stream in your AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-rolearn)
     * @param roleArn The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEventStream = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnEventStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEventStream):
        CfnEventStream = CfnEventStream(cdkObject)

    internal fun unwrap(wrapped: CfnEventStream):
        software.amazon.awscdk.services.pinpoint.CfnEventStream = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnEventStream
  }
}
