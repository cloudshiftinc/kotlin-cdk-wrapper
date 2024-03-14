package io.cloudshiftdev.awscdk.services.ec2

public enum class FlowLogDestinationType(
  private val cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestinationType,
) {
  CLOUD_WATCH_LOGS(software.amazon.awscdk.services.ec2.FlowLogDestinationType.CLOUD_WATCH_LOGS),
  S3(software.amazon.awscdk.services.ec2.FlowLogDestinationType.S3),
  KINESIS_DATA_FIREHOSE(software.amazon.awscdk.services.ec2.FlowLogDestinationType.KINESIS_DATA_FIREHOSE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogDestinationType):
        FlowLogDestinationType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.FlowLogDestinationType.CLOUD_WATCH_LOGS ->
          FlowLogDestinationType.CLOUD_WATCH_LOGS
      software.amazon.awscdk.services.ec2.FlowLogDestinationType.S3 -> FlowLogDestinationType.S3
      software.amazon.awscdk.services.ec2.FlowLogDestinationType.KINESIS_DATA_FIREHOSE ->
          FlowLogDestinationType.KINESIS_DATA_FIREHOSE
    }

    internal fun unwrap(wrapped: FlowLogDestinationType):
        software.amazon.awscdk.services.ec2.FlowLogDestinationType = wrapped.cdkObject
  }
}
