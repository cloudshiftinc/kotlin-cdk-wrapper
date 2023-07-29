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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption

/**
 * Encryption Configuration of the S3 bucket.
 *
 * Example:
 * ```
 * AthenaStartQueryExecution startQueryExecutionJob = AthenaStartQueryExecution.Builder.create(this,
 * "Start Athena Query")
 * .queryString(JsonPath.stringAt("$.queryString"))
 * .queryExecutionContext(QueryExecutionContext.builder()
 * .databaseName("mydatabase")
 * .build())
 * .resultConfiguration(ResultConfiguration.builder()
 * .encryptionConfiguration(EncryptionConfiguration.builder()
 * .encryptionOption(EncryptionOption.S3_MANAGED)
 * .build())
 * .outputLocation(Location.builder()
 * .bucketName("query-results-bucket")
 * .objectKey("folder")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_EncryptionConfiguration.html)
 */
@CdkDslMarker
public class EncryptionConfigurationDsl {
    private val cdkBuilder: EncryptionConfiguration.Builder = EncryptionConfiguration.builder()

    /** @param encryptionKey KMS key ARN or ID. */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param encryptionOption Type of S3 server-side encryption enabled. */
    public fun encryptionOption(encryptionOption: EncryptionOption) {
        cdkBuilder.encryptionOption(encryptionOption)
    }

    public fun build(): EncryptionConfiguration = cdkBuilder.build()
}
