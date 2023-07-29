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
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.DataProtectionPolicy
import software.amazon.awscdk.services.logs.LogGroupProps
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Properties for a LogGroup.
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
public class LogGroupPropsDsl {
    private val cdkBuilder: LogGroupProps.Builder = LogGroupProps.builder()

    /** @param dataProtectionPolicy Data Protection Policy for this log group. */
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicyDsl.() -> Unit = {}) {
        val builder = DataProtectionPolicyDsl()
        builder.apply(dataProtectionPolicy)
        cdkBuilder.dataProtectionPolicy(builder.build())
    }

    /** @param dataProtectionPolicy Data Protection Policy for this log group. */
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy) {
        cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /** @param encryptionKey The KMS customer managed key to encrypt the log group with. */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param logGroupName Name of the log group. */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param removalPolicy Determine the removal policy of this log group. Normally you want to
     *   retain the log group so you can diagnose issues from logs even after a deployment that no
     *   longer includes the log group. In that case, use the normal date-based retention policy to
     *   age out your logs.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param retention How long, in days, the log contents will be retained. To retain all logs,
     *   set this value to RetentionDays.INFINITE.
     */
    public fun retention(retention: RetentionDays) {
        cdkBuilder.retention(retention)
    }

    public fun build(): LogGroupProps = cdkBuilder.build()
}
