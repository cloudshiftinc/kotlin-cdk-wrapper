@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.KeyProps
import software.amazon.awscdk.services.kms.KeySpec
import software.amazon.awscdk.services.kms.KeyUsage
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Construction properties for a KMS Key object.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.kms.*;
 * Artifact sourceOutput = new Artifact();
 * Bucket targetBucket = new Bucket(this, "MyBucket");
 * IKey key = Key.Builder.create(this, "EnvVarEncryptKey")
 * .description("sample key")
 * .build();
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * S3DeployAction deployAction = S3DeployAction.Builder.create()
 * .actionName("S3Deploy")
 * .bucket(targetBucket)
 * .input(sourceOutput)
 * .encryptionKey(key)
 * .build();
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class KeyPropsDsl {
    private val cdkBuilder: KeyProps.Builder = KeyProps.builder()

    private val _admins: MutableList<IPrincipal> = mutableListOf()

    /**
     * @param admins A list of principals to add as key administrators to the key policy.
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions
     * to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     */
    public fun admins(vararg admins: IPrincipal) {
        _admins.addAll(listOf(*admins))
    }

    /**
     * @param admins A list of principals to add as key administrators to the key policy.
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions
     * to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     */
    public fun admins(admins: Collection<IPrincipal>) {
        _admins.addAll(admins)
    }

    /**
     * @param alias Initial alias to add to the key.
     * More aliases can be added later by calling `addAlias`.
     */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /**
     * @param description A description of the key.
     * Use a description that helps your users decide
     * whether the key is appropriate for a particular task.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param enableKeyRotation Indicates whether AWS KMS rotates the key.
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean) {
        cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * @param enabled Indicates whether the key is available for use.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param keySpec The cryptographic configuration of the key. The valid value depends on usage of
     * the key.
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     */
    public fun keySpec(keySpec: KeySpec) {
        cdkBuilder.keySpec(keySpec)
    }

    /**
     * @param keyUsage The cryptographic operations for which the key can be used.
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     */
    public fun keyUsage(keyUsage: KeyUsage) {
        cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * @param pendingWindow Specifies the number of days in the waiting period before AWS KMS deletes
     * a CMK that has been removed from a CloudFormation stack.
     * When you remove a customer master key (CMK) from a CloudFormation stack, AWS KMS schedules the
     * CMK for deletion
     * and starts the mandatory waiting period. The PendingWindowInDays property determines the length
     * of waiting period.
     * During the waiting period, the key state of CMK is Pending Deletion, which prevents the CMK
     * from being used in
     * cryptographic operations. When the waiting period expires, AWS KMS permanently deletes the CMK.
     *
     * Enter a value between 7 and 30 days.
     */
    public fun pendingWindow(pendingWindow: Duration) {
        cdkBuilder.pendingWindow(pendingWindow)
    }

    /**
     * @param policy Custom policy document to attach to the KMS key.
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects),
     * this policy will *override* the default key policy and become the only key policy for the key.
     * If the
     * feature flag is not set, this policy will be appended to the default key policy.
     */
    public fun policy(policy: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(policy)
        cdkBuilder.policy(builder.build())
    }

    /**
     * @param policy Custom policy document to attach to the KMS key.
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects),
     * this policy will *override* the default key policy and become the only key policy for the key.
     * If the
     * feature flag is not set, this policy will be appended to the default key policy.
     */
    public fun policy(policy: PolicyDocument) {
        cdkBuilder.policy(policy)
    }

    /**
     * @param removalPolicy Whether the encryption key should be retained when it is removed from the
     * Stack.
     * This is useful when one wants to
     * retain access to data that was encrypted with a key that is being retired.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): KeyProps {
        if (_admins.isNotEmpty()) cdkBuilder.admins(_admins)
        return cdkBuilder.build()
    }
}
