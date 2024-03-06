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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.DataProtectionPolicy
import software.amazon.awscdk.services.logs.LogGroupClass
import software.amazon.awscdk.services.logs.LogGroupProps
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Properties for a LogGroup.
 *
 * Example:
 * ```
 * Vpc vpc;
 * Key kmsKey = new Key(this, "KmsKey");
 * // Pass the KMS key in the `encryptionKey` field to associate the key to the log group
 * LogGroup logGroup = LogGroup.Builder.create(this, "LogGroup")
 * .encryptionKey(kmsKey)
 * .build();
 * // Pass the KMS key in the `encryptionKey` field to associate the key to the S3 bucket
 * Bucket execBucket = Bucket.Builder.create(this, "EcsExecBucket")
 * .encryptionKey(kmsKey)
 * .build();
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .vpc(vpc)
 * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
 * .kmsKey(kmsKey)
 * .logConfiguration(ExecuteCommandLogConfiguration.builder()
 * .cloudWatchLogGroup(logGroup)
 * .cloudWatchEncryptionEnabled(true)
 * .s3Bucket(execBucket)
 * .s3EncryptionEnabled(true)
 * .s3KeyPrefix("exec-command-output")
 * .build())
 * .logging(ExecuteCommandLogging.OVERRIDE)
 * .build())
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

    /**
     * @param logGroupClass The class of the log group. Possible values are: STANDARD and
     *   INFREQUENT_ACCESS. INFREQUENT_ACCESS class provides customers a cost-effective way to
     *   consolidate logs which supports querying using Logs Insights. The logGroupClass property
     *   cannot be changed once the log group is created.
     */
    public fun logGroupClass(logGroupClass: LogGroupClass) {
        cdkBuilder.logGroupClass(logGroupClass)
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
