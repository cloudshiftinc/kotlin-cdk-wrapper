@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.DataIdentifier
import software.amazon.awscdk.services.logs.DataProtectionPolicy
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket

/**
 * Creates a data protection policy for CloudWatch Logs log groups.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.kinesisfirehose.alpha.*;
 * import software.amazon.awscdk.services.kinesisfirehose.destinations.alpha.*;
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
 * .identifiers(List.of(DataIdentifier.DRIVERSLICENSE_US, new DataIdentifier("EmailAddress")))
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
@CdkDslMarker
public class DataProtectionPolicyDsl {
    private val cdkBuilder: DataProtectionPolicy.Builder = DataProtectionPolicy.Builder.create()

    private val _identifiers: MutableList<DataIdentifier> = mutableListOf()

    /**
     * Amazon Kinesis Data Firehose delivery stream to send audit findings to.
     *
     * The delivery stream must already exist.
     *
     * Default: - no firehose delivery stream audit destination
     *
     * @param deliveryStreamNameAuditDestination Amazon Kinesis Data Firehose delivery stream to
     *   send audit findings to.
     */
    public fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String) {
        cdkBuilder.deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination)
    }

    /**
     * Description of the data protection policy.
     *
     * Default: - 'cdk generated data protection policy'
     *
     * @param description Description of the data protection policy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * List of data protection identifiers.
     *
     * Must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/protect-sensitive-log-data-types.html
     *
     * @param identifiers List of data protection identifiers.
     */
    public fun identifiers(vararg identifiers: DataIdentifier) {
        _identifiers.addAll(listOf(*identifiers))
    }

    /**
     * List of data protection identifiers.
     *
     * Must be in the following list:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/protect-sensitive-log-data-types.html
     *
     * @param identifiers List of data protection identifiers.
     */
    public fun identifiers(identifiers: Collection<DataIdentifier>) {
        _identifiers.addAll(identifiers)
    }

    /**
     * CloudWatch Logs log group to send audit findings to.
     *
     * The log group must already exist prior to creating the data protection policy.
     *
     * Default: - no CloudWatch Logs audit destination
     *
     * @param logGroupAuditDestination CloudWatch Logs log group to send audit findings to.
     */
    public fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup) {
        cdkBuilder.logGroupAuditDestination(logGroupAuditDestination)
    }

    /**
     * Name of the data protection policy.
     *
     * Default: - 'data-protection-policy-cdk'
     *
     * @param name Name of the data protection policy.
     */
    public fun name(name: String) {
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
    public fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket) {
        cdkBuilder.s3BucketAuditDestination(s3BucketAuditDestination)
    }

    public fun build(): DataProtectionPolicy {
        if (_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
        return cdkBuilder.build()
    }
}
