package io.cloudshiftdev.awscdk.services.applicationautoscaling

public enum class ServiceNamespace(
  private val cdkObject: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace,
) {
  ECS(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ECS),
  ELASTIC_MAP_REDUCE(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ELASTIC_MAP_REDUCE),
  EC2(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.EC2),
  APPSTREAM(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.APPSTREAM),
  DYNAMODB(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.DYNAMODB),
  RDS(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.RDS),
  SAGEMAKER(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.SAGEMAKER),
  CUSTOM_RESOURCE(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.CUSTOM_RESOURCE),
  LAMBDA(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.LAMBDA),
  COMPREHEND(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.COMPREHEND),
  KAFKA(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.KAFKA),
  ELASTICACHE(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ELASTICACHE),
  NEPTUNE(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.NEPTUNE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace):
        ServiceNamespace = when (cdkObject) {
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ECS ->
          ServiceNamespace.ECS
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ELASTIC_MAP_REDUCE ->
          ServiceNamespace.ELASTIC_MAP_REDUCE
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.EC2 ->
          ServiceNamespace.EC2
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.APPSTREAM ->
          ServiceNamespace.APPSTREAM
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.DYNAMODB ->
          ServiceNamespace.DYNAMODB
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.RDS ->
          ServiceNamespace.RDS
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.SAGEMAKER ->
          ServiceNamespace.SAGEMAKER
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.CUSTOM_RESOURCE ->
          ServiceNamespace.CUSTOM_RESOURCE
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.LAMBDA ->
          ServiceNamespace.LAMBDA
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.COMPREHEND ->
          ServiceNamespace.COMPREHEND
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.KAFKA ->
          ServiceNamespace.KAFKA
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ELASTICACHE ->
          ServiceNamespace.ELASTICACHE
      software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.NEPTUNE ->
          ServiceNamespace.NEPTUNE
    }

    internal fun unwrap(wrapped: ServiceNamespace):
        software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace = wrapped.cdkObject
  }
}
