@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * factory methods for access log format.
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
public open class AccessLogFormat(
  cdkObject: software.amazon.awscdk.services.apigateway.AccessLogFormat,
) : CdkObject(cdkObject) {
  public companion object {
    public fun clf(): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.clf().let(AccessLogFormat::wrap)

    public fun custom(format: String): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.custom(format).let(AccessLogFormat::wrap)

    public fun jsonWithStandardFields(): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.jsonWithStandardFields().let(AccessLogFormat::wrap)

    public fun jsonWithStandardFields(fields: JsonWithStandardFieldProps): AccessLogFormat =
        software.amazon.awscdk.services.apigateway.AccessLogFormat.jsonWithStandardFields(fields.let(JsonWithStandardFieldProps.Companion::unwrap)).let(AccessLogFormat::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4591f774534462d212e2135b0ca5f8af84d2e9b6494b7e776a0c1a4eb95e9593")
    public fun jsonWithStandardFields(fields: JsonWithStandardFieldProps.Builder.() -> Unit):
        AccessLogFormat = jsonWithStandardFields(JsonWithStandardFieldProps(fields))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AccessLogFormat):
        AccessLogFormat = AccessLogFormat(cdkObject)

    internal fun unwrap(wrapped: AccessLogFormat):
        software.amazon.awscdk.services.apigateway.AccessLogFormat = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.AccessLogFormat
  }
}
