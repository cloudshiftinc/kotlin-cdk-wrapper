@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Parameters and Secrets Extension layer version.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * Secret secret = new Secret(this, "Secret");
 * StringParameter parameter = StringParameter.Builder.create(this, "Parameter")
 * .parameterName("mySsmParameterName")
 * .stringValue("mySsmParameterValue")
 * .build();
 * ParamsAndSecretsLayerVersion paramsAndSecrets =
 * ParamsAndSecretsLayerVersion.fromVersion(ParamsAndSecretsVersions.V1_0_103,
 * ParamsAndSecretsOptions.builder()
 * .cacheSize(500)
 * .logLevel(ParamsAndSecretsLogLevel.DEBUG)
 * .build());
 * Function lambdaFunction = Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .architecture(Architecture.ARM_64)
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .paramsAndSecrets(paramsAndSecrets)
 * .build();
 * secret.grantRead(lambdaFunction);
 * parameter.grantRead(lambdaFunction);
 * ```
 */
public abstract class ParamsAndSecretsLayerVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion,
) : CdkObject(cdkObject) {
  public companion object {
    public fun fromVersion(version: ParamsAndSecretsVersions): ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersion(version.let(ParamsAndSecretsVersions::unwrap)).let(ParamsAndSecretsLayerVersion::wrap)

    public fun fromVersion(version: ParamsAndSecretsVersions, options: ParamsAndSecretsOptions):
        ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersion(version.let(ParamsAndSecretsVersions::unwrap),
        options.let(ParamsAndSecretsOptions::unwrap)).let(ParamsAndSecretsLayerVersion::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1b82c076f39ba30e00df9abcd79a9e4954d933bd2f8b2c77ba643a3cb00f202")
    public fun fromVersion(version: ParamsAndSecretsVersions,
        options: ParamsAndSecretsOptions.Builder.() -> Unit): ParamsAndSecretsLayerVersion =
        fromVersion(version, ParamsAndSecretsOptions(options))

    public fun fromVersionArn(arn: String): ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersionArn(arn).let(ParamsAndSecretsLayerVersion::wrap)

    public fun fromVersionArn(arn: String, options: ParamsAndSecretsOptions):
        ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersionArn(arn,
        options.let(ParamsAndSecretsOptions::unwrap)).let(ParamsAndSecretsLayerVersion::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3292c50e00e6ffb93a6b79c2d477463172c96cf17a9de19268d2294bfd3aadfd")
    public fun fromVersionArn(arn: String, options: ParamsAndSecretsOptions.Builder.() -> Unit):
        ParamsAndSecretsLayerVersion = fromVersionArn(arn, ParamsAndSecretsOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion):
        ParamsAndSecretsLayerVersion = CdkObjectWrappers.wrap(cdkObject) as
        ParamsAndSecretsLayerVersion

    internal fun unwrap(wrapped: ParamsAndSecretsLayerVersion):
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion
  }
}
