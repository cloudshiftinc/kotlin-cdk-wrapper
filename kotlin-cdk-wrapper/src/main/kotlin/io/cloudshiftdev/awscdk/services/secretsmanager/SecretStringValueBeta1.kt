@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String

/**
 * (deprecated) An experimental class used to specify an initial secret value for a Secret.
 *
 * The class wraps a simple string (or JSON representation) in order to provide some safety checks
 * and warnings
 * about the dangers of using plaintext strings as initial secret seed values via
 * CDK/CloudFormation.
 *
 * Example:
 *
 * ```
 * User user = new User(this, "User");
 * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
 * SecretStringValueBeta1 secretValue = SecretStringValueBeta1.fromToken(JSON.stringify(Map.of(
 * "username", user.getUserName(),
 * "database", "foo",
 * "password", accessKey.secretAccessKey.unsafeUnwrap())));
 * ```
 *
 * @deprecated Use `cdk.SecretValue` instead.
 */
public open class SecretStringValueBeta1(
  cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1,
) : CdkObject(cdkObject) {
  /**
   * (deprecated) Returns the secret value.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun secretValue(): String = unwrap(this).secretValue()

  public companion object {
    @Deprecated(message = "deprecated in CDK")
    public fun fromToken(secretValueFromToken: String): SecretStringValueBeta1 =
        software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1.fromToken(secretValueFromToken).let(SecretStringValueBeta1::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun fromUnsafePlaintext(secretValue: String): SecretStringValueBeta1 =
        software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1.fromUnsafePlaintext(secretValue).let(SecretStringValueBeta1::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1):
        SecretStringValueBeta1 = SecretStringValueBeta1(cdkObject)

    internal fun unwrap(wrapped: SecretStringValueBeta1):
        software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1 = wrapped.cdkObject as
        software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1
  }
}
