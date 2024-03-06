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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.s3.LocationDsl
import kotlin.Unit
import software.amazon.awscdk.services.s3.Location
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration

/**
 * Location of query result along with S3 bucket configuration.
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
 * .executionParameters(List.of("param1", "param2"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_ResultConfiguration.html)
 */
@CdkDslMarker
public class ResultConfigurationDsl {
    private val cdkBuilder: ResultConfiguration.Builder = ResultConfiguration.builder()

    /** @param encryptionConfiguration Encryption option used if enabled in S3. */
    public fun encryptionConfiguration(
        encryptionConfiguration: EncryptionConfigurationDsl.() -> Unit = {}
    ) {
        val builder = EncryptionConfigurationDsl()
        builder.apply(encryptionConfiguration)
        cdkBuilder.encryptionConfiguration(builder.build())
    }

    /** @param encryptionConfiguration Encryption option used if enabled in S3. */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param outputLocation S3 path of query results. Example value:
     *   `s3://query-results-bucket/folder/`
     */
    public fun outputLocation(outputLocation: LocationDsl.() -> Unit = {}) {
        val builder = LocationDsl()
        builder.apply(outputLocation)
        cdkBuilder.outputLocation(builder.build())
    }

    /**
     * @param outputLocation S3 path of query results. Example value:
     *   `s3://query-results-bucket/folder/`
     */
    public fun outputLocation(outputLocation: Location) {
        cdkBuilder.outputLocation(outputLocation)
    }

    public fun build(): ResultConfiguration = cdkBuilder.build()
}
