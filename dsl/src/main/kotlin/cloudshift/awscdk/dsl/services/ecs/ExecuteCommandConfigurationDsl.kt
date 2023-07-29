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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration
import software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration
import software.amazon.awscdk.services.ecs.ExecuteCommandLogging
import software.amazon.awscdk.services.kms.IKey

/**
 * The details of the execute command configuration.
 *
 * For more information, see [ExecuteCommandConfiguration]
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html
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
public class ExecuteCommandConfigurationDsl {
    private val cdkBuilder: ExecuteCommandConfiguration.Builder =
        ExecuteCommandConfiguration.builder()

    /**
     * @param kmsKey The AWS Key Management Service key ID to encrypt the data between the local
     *   client and the container.
     */
    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     *   The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     */
    public fun logConfiguration(
        logConfiguration: ExecuteCommandLogConfigurationDsl.() -> Unit = {}
    ) {
        val builder = ExecuteCommandLogConfigurationDsl()
        builder.apply(logConfiguration)
        cdkBuilder.logConfiguration(builder.build())
    }

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     *   The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     */
    public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /** @param logging The log settings to use for logging the execute command session. */
    public fun logging(logging: ExecuteCommandLogging) {
        cdkBuilder.logging(logging)
    }

    public fun build(): ExecuteCommandConfiguration = cdkBuilder.build()
}
