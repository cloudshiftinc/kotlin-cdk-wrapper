@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for creating a data protection policy.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * LogGroup logGroupDestination = LogGroup.Builder.create(this, "LogGroupLambdaAudit")
 * .logGroupName("auditDestinationForCDK")
 * .build();
 * Bucket bucket = new Bucket(this, "audit-bucket");
 * S3Bucket s3Destination = new S3Bucket(bucket);
 * DeliveryStream deliveryStream = DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(s3Destination)
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
public interface DataProtectionPolicyProps {
  /**
   * Amazon Data Firehose delivery stream to send audit findings to.
   *
   * The delivery stream must already exist.
   *
   * Default: - no firehose delivery stream audit destination
   */
  public fun deliveryStreamNameAuditDestination(): String? =
      unwrap(this).getDeliveryStreamNameAuditDestination()

  /**
   * Description of the data protection policy.
   *
   * Default: - 'cdk generated data protection policy'
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * List of data protection identifiers.
   *
   * Managed data identifiers must be in the following list:
   * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
   * Custom data identifiers must have a valid regex defined:
   * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
   */
  public fun identifiers(): List<DataIdentifier>

  /**
   * CloudWatch Logs log group to send audit findings to.
   *
   * The log group must already exist prior to creating the data protection policy.
   *
   * Default: - no CloudWatch Logs audit destination
   */
  public fun logGroupAuditDestination(): ILogGroup? =
      unwrap(this).getLogGroupAuditDestination()?.let(ILogGroup::wrap)

  /**
   * Name of the data protection policy.
   *
   * Default: - 'data-protection-policy-cdk'
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * S3 bucket to send audit findings to.
   *
   * The bucket must already exist.
   *
   * Default: - no S3 bucket audit destination
   */
  public fun s3BucketAuditDestination(): IBucket? =
      unwrap(this).getS3BucketAuditDestination()?.let(IBucket::wrap)

  /**
   * A builder for [DataProtectionPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryStreamNameAuditDestination Amazon Data Firehose delivery stream to send audit
     * findings to.
     * The delivery stream must already exist.
     */
    public fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String)

    /**
     * @param description Description of the data protection policy.
     */
    public fun description(description: String)

    /**
     * @param identifiers List of data protection identifiers. 
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     */
    public fun identifiers(identifiers: List<DataIdentifier>)

    /**
     * @param identifiers List of data protection identifiers. 
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     */
    public fun identifiers(vararg identifiers: DataIdentifier)

    /**
     * @param logGroupAuditDestination CloudWatch Logs log group to send audit findings to.
     * The log group must already exist prior to creating the data protection policy.
     */
    public fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup)

    /**
     * @param name Name of the data protection policy.
     */
    public fun name(name: String)

    /**
     * @param s3BucketAuditDestination S3 bucket to send audit findings to.
     * The bucket must already exist.
     */
    public fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.DataProtectionPolicyProps.Builder =
        software.amazon.awscdk.services.logs.DataProtectionPolicyProps.builder()

    /**
     * @param deliveryStreamNameAuditDestination Amazon Data Firehose delivery stream to send audit
     * findings to.
     * The delivery stream must already exist.
     */
    override fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String) {
      cdkBuilder.deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination)
    }

    /**
     * @param description Description of the data protection policy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param identifiers List of data protection identifiers. 
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     */
    override fun identifiers(identifiers: List<DataIdentifier>) {
      cdkBuilder.identifiers(identifiers.map(DataIdentifier.Companion::unwrap))
    }

    /**
     * @param identifiers List of data protection identifiers. 
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     */
    override fun identifiers(vararg identifiers: DataIdentifier): Unit =
        identifiers(identifiers.toList())

    /**
     * @param logGroupAuditDestination CloudWatch Logs log group to send audit findings to.
     * The log group must already exist prior to creating the data protection policy.
     */
    override fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup) {
      cdkBuilder.logGroupAuditDestination(logGroupAuditDestination.let(ILogGroup.Companion::unwrap))
    }

    /**
     * @param name Name of the data protection policy.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param s3BucketAuditDestination S3 bucket to send audit findings to.
     * The bucket must already exist.
     */
    override fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket) {
      cdkBuilder.s3BucketAuditDestination(s3BucketAuditDestination.let(IBucket.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.DataProtectionPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicyProps,
  ) : CdkObject(cdkObject),
      DataProtectionPolicyProps {
    /**
     * Amazon Data Firehose delivery stream to send audit findings to.
     *
     * The delivery stream must already exist.
     *
     * Default: - no firehose delivery stream audit destination
     */
    override fun deliveryStreamNameAuditDestination(): String? =
        unwrap(this).getDeliveryStreamNameAuditDestination()

    /**
     * Description of the data protection policy.
     *
     * Default: - 'cdk generated data protection policy'
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * List of data protection identifiers.
     *
     * Managed data identifiers must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-managed-data-identifiers.html
     * Custom data identifiers must have a valid regex defined:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL-custom-data-identifiers.html#custom-data-identifiers-constraints
     */
    override fun identifiers(): List<DataIdentifier> =
        unwrap(this).getIdentifiers().map(DataIdentifier::wrap)

    /**
     * CloudWatch Logs log group to send audit findings to.
     *
     * The log group must already exist prior to creating the data protection policy.
     *
     * Default: - no CloudWatch Logs audit destination
     */
    override fun logGroupAuditDestination(): ILogGroup? =
        unwrap(this).getLogGroupAuditDestination()?.let(ILogGroup::wrap)

    /**
     * Name of the data protection policy.
     *
     * Default: - 'data-protection-policy-cdk'
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * S3 bucket to send audit findings to.
     *
     * The bucket must already exist.
     *
     * Default: - no S3 bucket audit destination
     */
    override fun s3BucketAuditDestination(): IBucket? =
        unwrap(this).getS3BucketAuditDestination()?.let(IBucket::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProtectionPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicyProps):
        DataProtectionPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? DataProtectionPolicyProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataProtectionPolicyProps):
        software.amazon.awscdk.services.logs.DataProtectionPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.DataProtectionPolicyProps
  }
}
