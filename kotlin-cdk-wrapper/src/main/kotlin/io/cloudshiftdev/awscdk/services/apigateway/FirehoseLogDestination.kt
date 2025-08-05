@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Use a Firehose delivery stream as a custom access log destination for API Gateway.
 *
 * Example:
 *
 * ```
 * Bucket destinationBucket = new Bucket(this, "Bucket");
 * Role deliveryStreamRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("firehose.amazonaws.com"))
 * .build();
 * CfnDeliveryStream stream = CfnDeliveryStream.Builder.create(this, "MyStream")
 * .deliveryStreamName("amazon-apigateway-delivery-stream")
 * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
 * .bucketArn(destinationBucket.getBucketArn())
 * .roleArn(deliveryStreamRole.getRoleArn())
 * .build())
 * .build();
 * RestApi api = RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new FirehoseLogDestination(stream))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
 * .build())
 * .build();
 * ```
 */
public open class FirehoseLogDestination(
  cdkObject: software.amazon.awscdk.services.apigateway.FirehoseLogDestination,
) : CdkObject(cdkObject),
    IAccessLogDestination {
  public constructor(stream: CfnDeliveryStream) :
      this(software.amazon.awscdk.services.apigateway.FirehoseLogDestination(stream.let(CfnDeliveryStream.Companion::unwrap))
  )

  /**
   * Binds this destination to the Firehose delivery stream.
   *
   * @param stage 
   */
  public override fun bind(stage: IStage): AccessLogDestinationConfig =
      unwrap(this).bind(stage.let(IStage.Companion::unwrap)).let(AccessLogDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.FirehoseLogDestination):
        FirehoseLogDestination = FirehoseLogDestination(cdkObject)

    internal fun unwrap(wrapped: FirehoseLogDestination):
        software.amazon.awscdk.services.apigateway.FirehoseLogDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.FirehoseLogDestination
  }
}
