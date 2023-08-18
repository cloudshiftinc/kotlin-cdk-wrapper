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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import software.amazon.awscdk.ResolutionTypeHint
import software.amazon.awscdk.SecretValue

/**
 * Work with secret values in the CDK.
 *
 * Constructs that need secrets will declare parameters of type `SecretValue`.
 *
 * The actual values of these secrets should not be committed to your repository, or even end up in
 * the synthesized CloudFormation template. Instead, you should store them in an external system
 * like AWS Secrets Manager or SSM Parameter Store, and you can reference them by calling
 * `SecretValue.secretsManager()` or `SecretValue.ssmSecure()`.
 *
 * You can use `SecretValue.unsafePlainText()` to construct a `SecretValue` from a literal string,
 * but doing so is highly discouraged.
 *
 * To make sure secret values don't accidentally end up in readable parts of your infrastructure
 * definition (such as the environment variables of an AWS Lambda Function, where everyone who can
 * read the function definition has access to the secret), using secret values directly is not
 * allowed. You must pass them to constructs that accept `SecretValue` properties, which are
 * guaranteed to use the value only in CloudFormation properties that are write-only.
 *
 * If you are sure that what you are doing is safe, you can call `secretValue.unsafeUnwrap()` to
 * access the protected string of the secret value.
 *
 * (If you are writing something like an AWS Lambda Function and need to access a secret inside it,
 * make the API call to `GetSecretValue` directly inside your Lamba's code, instead of using
 * environment variables.)
 *
 * Example:
 * ```
 * IPublicHostedZone myHostedZone;
 * EmailIdentity.Builder.create(this, "Identity")
 * .identity(Identity.publicHostedZone(myHostedZone))
 * .dkimIdentity(DkimIdentity.byoDkim(ByoDkimOptions.builder()
 * .privateKey(SecretValue.secretsManager("dkim-private-key"))
 * .publicKey("...base64-encoded-public-key...")
 * .selector("selector")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretValueDsl(
    protectedValue: Any,
) {
    private val cdkBuilder: SecretValue.Builder = SecretValue.Builder.create(protectedValue)

    /**
     * Capture the stack trace of where this token is created.
     *
     * Default: true
     *
     * @param stackTrace Capture the stack trace of where this token is created.
     */
    public fun stackTrace(stackTrace: Boolean) {
        cdkBuilder.stackTrace(stackTrace)
    }

    /**
     * Type that this token is expected to evaluate to.
     *
     * Default: ResolutionTypeHint.STRING
     *
     * @param typeHint Type that this token is expected to evaluate to.
     */
    public fun typeHint(typeHint: ResolutionTypeHint) {
        cdkBuilder.typeHint(typeHint)
    }

    public fun build(): SecretValue = cdkBuilder.build()
}
