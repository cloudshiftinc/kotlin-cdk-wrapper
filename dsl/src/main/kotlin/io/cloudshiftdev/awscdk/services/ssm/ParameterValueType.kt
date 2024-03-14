package io.cloudshiftdev.awscdk.services.ssm

public enum class ParameterValueType(
  private val cdkObject: software.amazon.awscdk.services.ssm.ParameterValueType,
) {
  STRING(software.amazon.awscdk.services.ssm.ParameterValueType.STRING),
  AWS_EC2_AVAILABILITYZONE_NAME(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_AVAILABILITYZONE_NAME),
  AWS_EC2_IMAGE_ID(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_IMAGE_ID),
  AWS_EC2_INSTANCE_ID(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_INSTANCE_ID),
  AWS_EC2_KEYPAIR_KEYNAME(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_KEYPAIR_KEYNAME),
  AWS_EC2_SECURITYGROUP_GROUPNAME(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_SECURITYGROUP_GROUPNAME),
  AWS_EC2_SECURITYGROUP_ID(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_SECURITYGROUP_ID),
  AWS_EC2_SUBNET_ID(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_SUBNET_ID),
  AWS_EC2_VOLUME_ID(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_VOLUME_ID),
  AWS_EC2_VPC_ID(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_VPC_ID),
  AWS_ROUTE53_HOSTEDZONE_ID(software.amazon.awscdk.services.ssm.ParameterValueType.AWS_ROUTE53_HOSTEDZONE_ID),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.ParameterValueType):
        ParameterValueType = when (cdkObject) {
      software.amazon.awscdk.services.ssm.ParameterValueType.STRING -> ParameterValueType.STRING
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_AVAILABILITYZONE_NAME ->
          ParameterValueType.AWS_EC2_AVAILABILITYZONE_NAME
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_IMAGE_ID ->
          ParameterValueType.AWS_EC2_IMAGE_ID
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_INSTANCE_ID ->
          ParameterValueType.AWS_EC2_INSTANCE_ID
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_KEYPAIR_KEYNAME ->
          ParameterValueType.AWS_EC2_KEYPAIR_KEYNAME
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_SECURITYGROUP_GROUPNAME ->
          ParameterValueType.AWS_EC2_SECURITYGROUP_GROUPNAME
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_SECURITYGROUP_ID ->
          ParameterValueType.AWS_EC2_SECURITYGROUP_ID
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_SUBNET_ID ->
          ParameterValueType.AWS_EC2_SUBNET_ID
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_VOLUME_ID ->
          ParameterValueType.AWS_EC2_VOLUME_ID
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_EC2_VPC_ID ->
          ParameterValueType.AWS_EC2_VPC_ID
      software.amazon.awscdk.services.ssm.ParameterValueType.AWS_ROUTE53_HOSTEDZONE_ID ->
          ParameterValueType.AWS_ROUTE53_HOSTEDZONE_ID
    }

    internal fun unwrap(wrapped: ParameterValueType):
        software.amazon.awscdk.services.ssm.ParameterValueType = wrapped.cdkObject
  }
}
