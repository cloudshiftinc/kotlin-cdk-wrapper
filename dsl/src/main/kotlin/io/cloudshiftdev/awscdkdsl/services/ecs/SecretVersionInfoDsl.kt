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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.SecretVersionInfo

/**
 * Specify the secret's version id or version stage.
 *
 * Example:
 * ```
 * Secret secret;
 * Secret dbSecret;
 * StringParameter parameter;
 * TaskDefinition taskDefinition;
 * Bucket s3Bucket;
 * ContainerDefinition newContainer = taskDefinition.addContainer("container",
 * ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(1024)
 * .environment(Map.of( // clear text, not for sensitive data
 * "STAGE", "prod"))
 * .environmentFiles(List.of(EnvironmentFile.fromAsset("./demo-env-file.env"),
 * EnvironmentFile.fromBucket(s3Bucket, "assets/demo-env-file.env")))
 * .secrets(Map.of( // Retrieved from AWS Secrets Manager or AWS Systems Manager Parameter Store at
 * container start-up.
 * "SECRET", Secret.fromSecretsManager(secret),
 * "DB_PASSWORD", Secret.fromSecretsManager(dbSecret, "password"),  // Reference a specific JSON
 * field, (requires platform version 1.4.0 or later for Fargate tasks)
 * "API_KEY", Secret.fromSecretsManagerVersion(secret,
 * SecretVersionInfo.builder().versionId("12345").build(), "apiKey"),  // Reference a specific version
 * of the secret by its version id or version stage (requires platform version 1.4.0 or later for
 * Fargate tasks)
 * "PARAMETER", Secret.fromSsmParameter(parameter)))
 * .build());
 * newContainer.addEnvironment("QUEUE_NAME", "MyQueue");
 * newContainer.addSecret("API_KEY", Secret.fromSecretsManager(secret));
 * newContainer.addSecret("DB_PASSWORD", Secret.fromSecretsManager(secret, "password"));
 * ```
 */
@CdkDslMarker
public class SecretVersionInfoDsl {
    private val cdkBuilder: SecretVersionInfo.Builder = SecretVersionInfo.builder()

    /** @param versionId version id of the secret. */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    /** @param versionStage version stage of the secret. */
    public fun versionStage(versionStage: String) {
        cdkBuilder.versionStage(versionStage)
    }

    public fun build(): SecretVersionInfo = cdkBuilder.build()
}
