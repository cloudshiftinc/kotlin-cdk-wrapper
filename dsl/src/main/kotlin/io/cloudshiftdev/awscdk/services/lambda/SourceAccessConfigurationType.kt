package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class SourceAccessConfigurationType internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.SourceAccessConfigurationType,
) : CdkObject(cdkObject) {
  /**
   * The key to use in `SourceAccessConfigurationProperty.Type` property in CloudFormation.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html#cfn-lambda-eventsourcemapping-sourceaccessconfiguration-type)
   */
  public open fun type(): String = unwrap(this).getType()

  public companion object {
    public val BASIC_AUTH: SourceAccessConfigurationType =
        SourceAccessConfigurationType.wrap(software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.BASIC_AUTH)

    public val CLIENT_CERTIFICATE_TLS_AUTH: SourceAccessConfigurationType =
        SourceAccessConfigurationType.wrap(software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.CLIENT_CERTIFICATE_TLS_AUTH)

    public val SASL_SCRAM_256_AUTH: SourceAccessConfigurationType =
        SourceAccessConfigurationType.wrap(software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.SASL_SCRAM_256_AUTH)

    public val SASL_SCRAM_512_AUTH: SourceAccessConfigurationType =
        SourceAccessConfigurationType.wrap(software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.SASL_SCRAM_512_AUTH)

    public val SERVER_ROOT_CA_CERTIFICATE: SourceAccessConfigurationType =
        SourceAccessConfigurationType.wrap(software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.SERVER_ROOT_CA_CERTIFICATE)

    public val VPC_SECURITY_GROUP: SourceAccessConfigurationType =
        SourceAccessConfigurationType.wrap(software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.VPC_SECURITY_GROUP)

    public val VPC_SUBNET: SourceAccessConfigurationType =
        SourceAccessConfigurationType.wrap(software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.VPC_SUBNET)

    public fun of(name: String): SourceAccessConfigurationType =
        software.amazon.awscdk.services.lambda.SourceAccessConfigurationType.of(name).let(SourceAccessConfigurationType::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfigurationType):
        SourceAccessConfigurationType = SourceAccessConfigurationType(cdkObject)

    internal fun unwrap(wrapped: SourceAccessConfigurationType):
        software.amazon.awscdk.services.lambda.SourceAccessConfigurationType = wrapped.cdkObject
  }
}
