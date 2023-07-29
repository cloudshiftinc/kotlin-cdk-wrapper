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

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeySpec
import software.amazon.awscdk.services.kms.KeyUsage
import software.constructs.Construct

/**
 * Defines a KMS key.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.kms.*;
 * Key encryptionKey = Key.Builder.create(this, "Key")
 * .enableKeyRotation(true)
 * .build();
 * Table table = Table.Builder.create(this, "MyTable")
 * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
 * .encryption(TableEncryption.CUSTOMER_MANAGED)
 * .encryptionKey(encryptionKey)
 * .build();
 * ```
 */
@CdkDslMarker
public class KeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Key.Builder = Key.Builder.create(scope, id)

    private val _admins: MutableList<IPrincipal> = mutableListOf()

    /**
     * A list of principals to add as key administrators to the key policy.
     *
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     *
     * Default: []
     *
     * @param admins A list of principals to add as key administrators to the key policy.
     */
    public fun admins(vararg admins: IPrincipal) {
        _admins.addAll(listOf(*admins))
    }

    /**
     * A list of principals to add as key administrators to the key policy.
     *
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     *
     * Default: []
     *
     * @param admins A list of principals to add as key administrators to the key policy.
     */
    public fun admins(admins: Collection<IPrincipal>) {
        _admins.addAll(admins)
    }

    /**
     * Initial alias to add to the key.
     *
     * More aliases can be added later by calling `addAlias`.
     *
     * Default: - No alias is added for the key.
     *
     * @param alias Initial alias to add to the key.
     */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /**
     * A description of the key.
     *
     * Use a description that helps your users decide whether the key is appropriate for a
     * particular task.
     *
     * Default: - No description.
     *
     * @param description A description of the key.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Indicates whether AWS KMS rotates the key.
     *
     * Default: false
     *
     * @param enableKeyRotation Indicates whether AWS KMS rotates the key.
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean) {
        cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * Indicates whether the key is available for use.
     *
     * Default: - Key is enabled.
     *
     * @param enabled Indicates whether the key is available for use.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The cryptographic configuration of the key. The valid value depends on usage of the key.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion and a new key is created with the specified value.
     *
     * Default: KeySpec.SYMMETRIC_DEFAULT
     *
     * @param keySpec The cryptographic configuration of the key. The valid value depends on usage
     *   of the key.
     */
    public fun keySpec(keySpec: KeySpec) {
        cdkBuilder.keySpec(keySpec)
    }

    /**
     * The cryptographic operations for which the key can be used.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion and a new key is created with the specified value.
     *
     * Default: KeyUsage.ENCRYPT_DECRYPT
     *
     * @param keyUsage The cryptographic operations for which the key can be used.
     */
    public fun keyUsage(keyUsage: KeyUsage) {
        cdkBuilder.keyUsage(keyUsage)
    }

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes a CMK that has been
     * removed from a CloudFormation stack.
     *
     * When you remove a customer master key (CMK) from a CloudFormation stack, AWS KMS schedules
     * the CMK for deletion and starts the mandatory waiting period. The PendingWindowInDays
     * property determines the length of waiting period. During the waiting period, the key state of
     * CMK is Pending Deletion, which prevents the CMK from being used in cryptographic operations.
     * When the waiting period expires, AWS KMS permanently deletes the CMK.
     *
     * Enter a value between 7 and 30 days.
     *
     * Default: - 30 days
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-pendingwindowindays)
     *
     * @param pendingWindow Specifies the number of days in the waiting period before AWS KMS
     *   deletes a CMK that has been removed from a CloudFormation stack.
     */
    public fun pendingWindow(pendingWindow: Duration) {
        cdkBuilder.pendingWindow(pendingWindow)
    }

    /**
     * Custom policy document to attach to the KMS key.
     *
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects), this policy will *override* the default key policy and become the only key
     * policy for the key. If the feature flag is not set, this policy will be appended to the
     * default key policy.
     *
     * Default: - A policy document with permissions for the account root to administer the key will
     * be created.
     *
     * @param policy Custom policy document to attach to the KMS key.
     */
    public fun policy(policy: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(policy)
        cdkBuilder.policy(builder.build())
    }

    /**
     * Custom policy document to attach to the KMS key.
     *
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects), this policy will *override* the default key policy and become the only key
     * policy for the key. If the feature flag is not set, this policy will be appended to the
     * default key policy.
     *
     * Default: - A policy document with permissions for the account root to administer the key will
     * be created.
     *
     * @param policy Custom policy document to attach to the KMS key.
     */
    public fun policy(policy: PolicyDocument) {
        cdkBuilder.policy(policy)
    }

    /**
     * Whether the encryption key should be retained when it is removed from the Stack.
     *
     * This is useful when one wants to retain access to data that was encrypted with a key that is
     * being retired.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Whether the encryption key should be retained when it is removed from
     *   the Stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): Key {
        if (_admins.isNotEmpty()) cdkBuilder.admins(_admins)
        return cdkBuilder.build()
    }
}
