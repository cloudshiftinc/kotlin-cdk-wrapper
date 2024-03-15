@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A secret environment variable.
 *
 * Example:
 *
 * ```
 * Secret secret;
 * StringParameter parameter;
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.firelens(FireLensLogDriverProps.builder()
 * .options(Map.of())
 * .secretOptions(Map.of( // Retrieved from AWS Secrets Manager or AWS Systems Manager Parameter
 * Store
 * "apikey", Secret.fromSecretsManager(secret),
 * "host", Secret.fromSsmParameter(parameter)))
 * .build()))
 * .build());
 * ```
 */
public abstract class Secret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.Secret,
) : CdkObject(cdkObject) {
  /**
   * The ARN of the secret.
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * Grants reading the secret to a principal.
   *
   * @param grantee 
   */
  public open fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Whether this secret uses a specific JSON field.
   */
  public open fun hasField(): Boolean? = unwrap(this).getHasField()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Secret,
  ) : Secret(cdkObject)

  public companion object {
    public fun fromSecretsManager(secret: ISecret): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManager(secret.let(ISecret::unwrap)).let(Secret::wrap)

    public fun fromSecretsManager(secret: ISecret, `field`: String): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManager(secret.let(ISecret::unwrap),
        `field`).let(Secret::wrap)

    public fun fromSecretsManagerVersion(secret: ISecret, versionInfo: SecretVersionInfo): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap)).let(Secret::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("920c861858a2d3dfda5936da694fb8ff6329cc08a1fb9d3f2bdebc5f069220cb")
    public fun fromSecretsManagerVersion(secret: ISecret,
        versionInfo: SecretVersionInfo.Builder.() -> Unit): Secret =
        fromSecretsManagerVersion(secret, SecretVersionInfo(versionInfo))

    public fun fromSecretsManagerVersion(
      secret: ISecret,
      versionInfo: SecretVersionInfo,
      `field`: String,
    ): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap), `field`).let(Secret::wrap)

    public fun fromSsmParameter(parameter: IParameter): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSsmParameter(parameter.let(IParameter::unwrap)).let(Secret::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Secret): Secret =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Secret): software.amazon.awscdk.services.ecs.Secret = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Secret
  }
}
