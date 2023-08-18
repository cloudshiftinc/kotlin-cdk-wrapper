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

package io.cloudshiftdev.awscdkdsl.services.docdb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.docdb.DatabaseSecret
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct

/**
 * A database secret.
 *
 * Example:
 * ```
 * DatabaseCluster cluster;
 * DatabaseSecret myUserSecret = DatabaseSecret.Builder.create(this, "MyUserSecret")
 * .username("myuser")
 * .masterSecret(cluster.getSecret())
 * .build();
 * ISecret myUserSecretAttached = myUserSecret.attach(cluster); // Adds DB connections information
 * in the secret
 * cluster.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder() // Add rotation using
 * the multi user scheme
 * .secret(myUserSecretAttached).build());
 * ```
 */
@CdkDslMarker
public class DatabaseSecretDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DatabaseSecret.Builder = DatabaseSecret.Builder.create(scope, id)

    /**
     * The KMS key to use to encrypt the secret.
     *
     * Default: default master key
     *
     * @param encryptionKey The KMS key to use to encrypt the secret.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * Characters to not include in the generated password.
     *
     * Default: "\"@/"
     *
     * @param excludeCharacters Characters to not include in the generated password.
     */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * The master secret which will be used to rotate this secret.
     *
     * Default: - no master secret information will be included
     *
     * @param masterSecret The master secret which will be used to rotate this secret.
     */
    public fun masterSecret(masterSecret: ISecret) {
        cdkBuilder.masterSecret(masterSecret)
    }

    /**
     * The physical name of the secret.
     *
     * Default: Secretsmanager will generate a physical name for the secret
     *
     * @param secretName The physical name of the secret.
     */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    /**
     * The username.
     *
     * @param username The username.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): DatabaseSecret = cdkBuilder.build()
}
