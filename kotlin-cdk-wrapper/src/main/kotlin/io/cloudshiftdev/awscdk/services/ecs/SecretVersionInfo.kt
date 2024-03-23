@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Specify the secret's version id or version stage.
 *
 * Example:
 *
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
public interface SecretVersionInfo {
  /**
   * version id of the secret.
   *
   * Default: - use default version id
   */
  public fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * version stage of the secret.
   *
   * Default: - use default version stage
   */
  public fun versionStage(): String? = unwrap(this).getVersionStage()

  /**
   * A builder for [SecretVersionInfo]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param versionId version id of the secret.
     */
    public fun versionId(versionId: String)

    /**
     * @param versionStage version stage of the secret.
     */
    public fun versionStage(versionStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SecretVersionInfo.Builder =
        software.amazon.awscdk.services.ecs.SecretVersionInfo.builder()

    /**
     * @param versionId version id of the secret.
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    /**
     * @param versionStage version stage of the secret.
     */
    override fun versionStage(versionStage: String) {
      cdkBuilder.versionStage(versionStage)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SecretVersionInfo = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.SecretVersionInfo,
  ) : CdkObject(cdkObject), SecretVersionInfo {
    /**
     * version id of the secret.
     *
     * Default: - use default version id
     */
    override fun versionId(): String? = unwrap(this).getVersionId()

    /**
     * version stage of the secret.
     *
     * Default: - use default version stage
     */
    override fun versionStage(): String? = unwrap(this).getVersionStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretVersionInfo {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SecretVersionInfo):
        SecretVersionInfo = CdkObjectWrappers.wrap(cdkObject) as? SecretVersionInfo ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretVersionInfo):
        software.amazon.awscdk.services.ecs.SecretVersionInfo = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.SecretVersionInfo
  }
}
