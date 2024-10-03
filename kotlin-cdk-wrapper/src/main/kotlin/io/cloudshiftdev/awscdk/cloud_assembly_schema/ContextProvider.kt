@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

public enum class ContextProvider(
  private val cdkObject: software.amazon.awscdk.cloud_assembly_schema.ContextProvider,
) {
  AMI_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.AMI_PROVIDER),
  AVAILABILITY_ZONE_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.AVAILABILITY_ZONE_PROVIDER),
  HOSTED_ZONE_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.HOSTED_ZONE_PROVIDER),
  SSM_PARAMETER_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.SSM_PARAMETER_PROVIDER),
  VPC_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.VPC_PROVIDER),
  ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER),
  LOAD_BALANCER_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.LOAD_BALANCER_PROVIDER),
  LOAD_BALANCER_LISTENER_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.LOAD_BALANCER_LISTENER_PROVIDER),
  SECURITY_GROUP_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.SECURITY_GROUP_PROVIDER),
  KEY_PROVIDER(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.KEY_PROVIDER),
  PLUGIN(software.amazon.awscdk.cloud_assembly_schema.ContextProvider.PLUGIN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.ContextProvider):
        ContextProvider = when (cdkObject) {
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.AMI_PROVIDER ->
          ContextProvider.AMI_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.AVAILABILITY_ZONE_PROVIDER ->
          ContextProvider.AVAILABILITY_ZONE_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.HOSTED_ZONE_PROVIDER ->
          ContextProvider.HOSTED_ZONE_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.SSM_PARAMETER_PROVIDER ->
          ContextProvider.SSM_PARAMETER_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.VPC_PROVIDER ->
          ContextProvider.VPC_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER ->
          ContextProvider.ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.LOAD_BALANCER_PROVIDER ->
          ContextProvider.LOAD_BALANCER_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.LOAD_BALANCER_LISTENER_PROVIDER ->
          ContextProvider.LOAD_BALANCER_LISTENER_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.SECURITY_GROUP_PROVIDER ->
          ContextProvider.SECURITY_GROUP_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.KEY_PROVIDER ->
          ContextProvider.KEY_PROVIDER
      software.amazon.awscdk.cloud_assembly_schema.ContextProvider.PLUGIN -> ContextProvider.PLUGIN
    }

    internal fun unwrap(wrapped: ContextProvider):
        software.amazon.awscdk.cloud_assembly_schema.ContextProvider = wrapped.cdkObject
  }
}
