@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Creates a data protection policy for CloudWatch Logs log groups.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.alpha.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.destinations.alpha.*;
 * LogGroup logGroupDestination = LogGroup.Builder.create(this, "LogGroupLambdaAudit")
 * .logGroupName("auditDestinationForCDK")
 * .build();
 * Bucket bucket = new Bucket(this, "audit-bucket");
 * S3Bucket s3Destination = new S3Bucket(bucket);
 * DeliveryStream deliveryStream = DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destinations(List.of(s3Destination))
 * .build();
 * DataProtectionPolicy dataProtectionPolicy = DataProtectionPolicy.Builder.create()
 * .name("data protection policy")
 * .description("policy description")
 * .identifiers(List.of(DataIdentifier.DRIVERSLICENSE_US,  // managed data identifier
 * new DataIdentifier("EmailAddress"),  // forward compatibility for new managed data identifiers
 * new CustomDataIdentifier("EmployeeId", "EmployeeId-\\d{9}"))) // custom data identifier
 * .logGroupAuditDestination(logGroupDestination)
 * .s3BucketAuditDestination(bucket)
 * .deliveryStreamNameAuditDestination(deliveryStream.getDeliveryStreamName())
 * .build();
 * LogGroup.Builder.create(this, "LogGroupLambda")
 * .logGroupName("cdkIntegLogGroup")
 * .dataProtectionPolicy(dataProtectionPolicy)
 * .build();
 * ```
 */
public open class DataProtectionPolicy(
  cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicy,
) : CdkObject(cdkObject) {
  public constructor(props: DataProtectionPolicyProps) :
      this(software.amazon.awscdk.services.logs.DataProtectionPolicy(props.let(DataProtectionPolicyProps.Companion::unwrap))
  )

  public constructor(props: DataProtectionPolicyProps.Builder.() -> Unit) :
      this(DataProtectionPolicyProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.DataProtectionPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Amazon Kinesis Data Firehose delivery stream to send audit findings to.
     *
     * The delivery stream must already exist.
     *
     * Default: - no firehose delivery stream audit destination
     *
     * @param deliveryStreamNameAuditDestination Amazon Kinesis Data Firehose delivery stream to
     * send audit findings to. 
     */
    public fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String)

    /**
     * Description of the data protection policy.
     *
     * Default: - 'cdk generated data protection policy'
     *
     * @param description Description of the data protection policy. 
     */
    public fun description(description: String)

    /**
     * List of data protection identifiers.
     *
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     *
     * @param identifiers List of data protection identifiers. 
     */
    public fun identifiers(identifiers: List<DataIdentifier>)

    /**
     * List of data protection identifiers.
     *
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     *
     * @param identifiers List of data protection identifiers. 
     */
    public fun identifiers(vararg identifiers: DataIdentifier)

    /**
     * CloudWatch Logs log group to send audit findings to.
     *
     * The log group must already exist prior to creating the data protection policy.
     *
     * Default: - no CloudWatch Logs audit destination
     *
     * @param logGroupAuditDestination CloudWatch Logs log group to send audit findings to. 
     */
    public fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup)

    /**
     * Name of the data protection policy.
     *
     * Default: - 'data-protection-policy-cdk'
     *
     * @param name Name of the data protection policy. 
     */
    public fun name(name: String)

    /**
     * S3 bucket to send audit findings to.
     *
     * The bucket must already exist.
     *
     * Default: - no S3 bucket audit destination
     *
     * @param s3BucketAuditDestination S3 bucket to send audit findings to. 
     */
    public fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.DataProtectionPolicy.Builder =
        software.amazon.awscdk.services.logs.DataProtectionPolicy.Builder.create()

    /**
     * Amazon Kinesis Data Firehose delivery stream to send audit findings to.
     *
     * The delivery stream must already exist.
     *
     * Default: - no firehose delivery stream audit destination
     *
     * @param deliveryStreamNameAuditDestination Amazon Kinesis Data Firehose delivery stream to
     * send audit findings to. 
     */
    override fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String) {
      cdkBuilder.deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination)
    }

    /**
     * Description of the data protection policy.
     *
     * Default: - 'cdk generated data protection policy'
     *
     * @param description Description of the data protection policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * List of data protection identifiers.
     *
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     *
     * @param identifiers List of data protection identifiers. 
     */
    override fun identifiers(identifiers: List<DataIdentifier>) {
      cdkBuilder.identifiers(identifiers.map(DataIdentifier.Companion::unwrap))
    }

    /**
     * List of data protection identifiers.
     *
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     *
     * @param identifiers List of data protection identifiers. 
     */
    override fun identifiers(vararg identifiers: DataIdentifier): Unit =
        identifiers(identifiers.toList())

    /**
     * CloudWatch Logs log group to send audit findings to.
     *
     * The log group must already exist prior to creating the data protection policy.
     *
     * Default: - no CloudWatch Logs audit destination
     *
     * @param logGroupAuditDestination CloudWatch Logs log group to send audit findings to. 
     */
    override fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup) {
      cdkBuilder.logGroupAuditDestination(logGroupAuditDestination.let(ILogGroup.Companion::unwrap))
    }

    /**
     * Name of the data protection policy.
     *
     * Default: - 'data-protection-policy-cdk'
     *
     * @param name Name of the data protection policy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * S3 bucket to send audit findings to.
     *
     * The bucket must already exist.
     *
     * Default: - no S3 bucket audit destination
     *
     * @param s3BucketAuditDestination S3 bucket to send audit findings to. 
     */
    override fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket) {
      cdkBuilder.s3BucketAuditDestination(s3BucketAuditDestination.let(IBucket.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.DataProtectionPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProtectionPolicy {
      val builderImpl = BuilderImpl()
      return DataProtectionPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicy):
        DataProtectionPolicy = DataProtectionPolicy(cdkObject)

    internal fun unwrap(wrapped: DataProtectionPolicy):
        software.amazon.awscdk.services.logs.DataProtectionPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.DataProtectionPolicy
  }
}
