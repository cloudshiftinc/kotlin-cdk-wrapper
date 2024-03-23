@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DlqDestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.s3.IBucket

/**
 * An S3 dead letter bucket destination configuration for a Lambda event source.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.S3OnFailureDestination;
 * import io.cloudshiftdev.awscdk.services.s3.IBucket;
 * IBucket bucket;
 * Function myFunction;
 * // Your MSK cluster arn
 * String clusterArn =
 * "arn:aws:kafka:us-east-1:0123456789019:cluster/SalesCluster/abcd1234-abcd-cafe-abab-9876543210ab-4";
 * // The Kafka topic you want to subscribe to
 * String topic = "some-cool-topic";
 * S3OnFailureDestination s3OnFailureDestination = new S3OnFailureDestination(bucket);
 * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
 * .clusterArn(clusterArn)
 * .topic(topic)
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .onFailure(s3OnFailureDestination)
 * .build());
 * ```
 */
public open class S3OnFailureDestination(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination,
) : CdkObject(cdkObject), IEventSourceDlq {
  public constructor(bucket: IBucket) :
      this(software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination(bucket.let(IBucket::unwrap))
  )

  /**
   * Returns a destination configuration for the DLQ.
   *
   * @param _target 
   * @param targetHandler 
   */
  public override fun bind(target: IEventSourceMapping, targetHandler: IFunction):
      DlqDestinationConfig = unwrap(this).bind(target.let(IEventSourceMapping::unwrap),
      targetHandler.let(IFunction::unwrap)).let(DlqDestinationConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination):
        S3OnFailureDestination = S3OnFailureDestination(cdkObject)

    internal fun unwrap(wrapped: S3OnFailureDestination):
        software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination
  }
}
