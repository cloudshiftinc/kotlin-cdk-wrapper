@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Constructs for types of environment files.
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
public abstract class EnvironmentFile(
  cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFile,
) : CdkObject(cdkObject) {
  /**
   * Called when the container is initialized to allow this object to bind to the stack.
   *
   * @param scope The binding scope. 
   */
  public open fun bind(scope: Construct): EnvironmentFileConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(EnvironmentFileConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFile,
  ) : EnvironmentFile(cdkObject)

  public companion object {
    public fun fromAsset(path: String): AssetEnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromAsset(path).let(AssetEnvironmentFile::wrap)

    public fun fromAsset(path: String, options: AssetOptions): AssetEnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(AssetEnvironmentFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edeec1152b0bf37aee91af633844d9f37c3d95bf602d5a2e342201186b0d53ef")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit):
        AssetEnvironmentFile = fromAsset(path, AssetOptions(options))

    public fun fromBucket(bucket: IBucket, key: String): S3EnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromBucket(bucket.let(IBucket::unwrap),
        key).let(S3EnvironmentFile::wrap)

    public fun fromBucket(
      bucket: IBucket,
      key: String,
      objectVersion: String,
    ): S3EnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromBucket(bucket.let(IBucket::unwrap),
        key, objectVersion).let(S3EnvironmentFile::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFile):
        EnvironmentFile = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentFile ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentFile):
        software.amazon.awscdk.services.ecs.EnvironmentFile = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.EnvironmentFile
  }
}
