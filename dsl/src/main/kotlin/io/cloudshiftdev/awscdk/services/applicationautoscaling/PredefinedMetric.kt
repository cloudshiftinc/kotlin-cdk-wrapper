package io.cloudshiftdev.awscdk.services.applicationautoscaling

public enum class PredefinedMetric(
  private val cdkObject: software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric,
) {
  APPSTREAM_AVERAGE_CAPACITY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.APPSTREAM_AVERAGE_CAPACITY_UTILIZATION),
  CASSANDRA_READ_CAPACITY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.CASSANDRA_READ_CAPACITY_UTILIZATION),
  CASSANDRA_WRITE_CAPACITY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.CASSANDRA_WRITE_CAPACITY_UTILIZATION),
  COMPREHEND_INFERENCE_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.COMPREHEND_INFERENCE_UTILIZATION),
  NEPTURE_READER_AVERAGE_CPU_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.NEPTURE_READER_AVERAGE_CPU_UTILIZATION),
  DYNAMODB_READ_CAPACITY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYNAMODB_READ_CAPACITY_UTILIZATION),
  DYNAMODB_WRITE_CAPACITY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYNAMODB_WRITE_CAPACITY_UTILIZATION),
  DYANMODB_WRITE_CAPACITY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYANMODB_WRITE_CAPACITY_UTILIZATION),
  ALB_REQUEST_COUNT_PER_TARGET(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ALB_REQUEST_COUNT_PER_TARGET),
  RDS_READER_AVERAGE_CPU_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.RDS_READER_AVERAGE_CPU_UTILIZATION),
  RDS_READER_AVERAGE_DATABASE_CONNECTIONS(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.RDS_READER_AVERAGE_DATABASE_CONNECTIONS),
  EC2_SPOT_FLEET_REQUEST_AVERAGE_CPU_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_CPU_UTILIZATION),
  EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_IN(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_IN),
  EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_OUT(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_OUT),
  SAGEMAKER_VARIANT_INVOCATIONS_PER_INSTANCE(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.SAGEMAKER_VARIANT_INVOCATIONS_PER_INSTANCE),
  SAGEMAKER_VARIANT_PROVISIONED_CONCURRENCY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.SAGEMAKER_VARIANT_PROVISIONED_CONCURRENCY_UTILIZATION),
  SAGEMAKER_INFERENCE_COMPONENT_INVOCATIONS_PER_COPY(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.SAGEMAKER_INFERENCE_COMPONENT_INVOCATIONS_PER_COPY),
  ECS_SERVICE_AVERAGE_CPU_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ECS_SERVICE_AVERAGE_CPU_UTILIZATION),
  ECS_SERVICE_AVERAGE_MEMORY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ECS_SERVICE_AVERAGE_MEMORY_UTILIZATION),
  LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION),
  KAFKA_BROKER_STORAGE_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.KAFKA_BROKER_STORAGE_UTILIZATION),
  ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION),
  ELASTICACHE_REPLICA_ENGINE_CPU_UTILIZATION(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_REPLICA_ENGINE_CPU_UTILIZATION),
  ELASTICACHE_DATABASE_MEMORY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_DATABASE_MEMORY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE),
  ELASTICACHE_DATABASE_CAPACITY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_DATABASE_CAPACITY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric):
        PredefinedMetric = when (cdkObject) {
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.APPSTREAM_AVERAGE_CAPACITY_UTILIZATION ->
          PredefinedMetric.APPSTREAM_AVERAGE_CAPACITY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.CASSANDRA_READ_CAPACITY_UTILIZATION ->
          PredefinedMetric.CASSANDRA_READ_CAPACITY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.CASSANDRA_WRITE_CAPACITY_UTILIZATION ->
          PredefinedMetric.CASSANDRA_WRITE_CAPACITY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.COMPREHEND_INFERENCE_UTILIZATION ->
          PredefinedMetric.COMPREHEND_INFERENCE_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.NEPTURE_READER_AVERAGE_CPU_UTILIZATION ->
          PredefinedMetric.NEPTURE_READER_AVERAGE_CPU_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYNAMODB_READ_CAPACITY_UTILIZATION ->
          PredefinedMetric.DYNAMODB_READ_CAPACITY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYNAMODB_WRITE_CAPACITY_UTILIZATION ->
          PredefinedMetric.DYNAMODB_WRITE_CAPACITY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYANMODB_WRITE_CAPACITY_UTILIZATION ->
          PredefinedMetric.DYANMODB_WRITE_CAPACITY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ALB_REQUEST_COUNT_PER_TARGET ->
          PredefinedMetric.ALB_REQUEST_COUNT_PER_TARGET
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.RDS_READER_AVERAGE_CPU_UTILIZATION ->
          PredefinedMetric.RDS_READER_AVERAGE_CPU_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.RDS_READER_AVERAGE_DATABASE_CONNECTIONS ->
          PredefinedMetric.RDS_READER_AVERAGE_DATABASE_CONNECTIONS
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_CPU_UTILIZATION ->
          PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_CPU_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_IN ->
          PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_IN
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_OUT ->
          PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_OUT
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.SAGEMAKER_VARIANT_INVOCATIONS_PER_INSTANCE ->
          PredefinedMetric.SAGEMAKER_VARIANT_INVOCATIONS_PER_INSTANCE
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.SAGEMAKER_VARIANT_PROVISIONED_CONCURRENCY_UTILIZATION ->
          PredefinedMetric.SAGEMAKER_VARIANT_PROVISIONED_CONCURRENCY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.SAGEMAKER_INFERENCE_COMPONENT_INVOCATIONS_PER_COPY ->
          PredefinedMetric.SAGEMAKER_INFERENCE_COMPONENT_INVOCATIONS_PER_COPY
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ECS_SERVICE_AVERAGE_CPU_UTILIZATION ->
          PredefinedMetric.ECS_SERVICE_AVERAGE_CPU_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ECS_SERVICE_AVERAGE_MEMORY_UTILIZATION ->
          PredefinedMetric.ECS_SERVICE_AVERAGE_MEMORY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION ->
          PredefinedMetric.LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.KAFKA_BROKER_STORAGE_UTILIZATION ->
          PredefinedMetric.KAFKA_BROKER_STORAGE_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION ->
          PredefinedMetric.ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_REPLICA_ENGINE_CPU_UTILIZATION ->
          PredefinedMetric.ELASTICACHE_REPLICA_ENGINE_CPU_UTILIZATION
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_DATABASE_MEMORY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE ->
          PredefinedMetric.ELASTICACHE_DATABASE_MEMORY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE
      software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ELASTICACHE_DATABASE_CAPACITY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE ->
          PredefinedMetric.ELASTICACHE_DATABASE_CAPACITY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE
    }

    internal fun unwrap(wrapped: PredefinedMetric):
        software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric = wrapped.cdkObject
  }
}
