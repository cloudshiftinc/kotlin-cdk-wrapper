@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.docdb.DatabaseSecretProps
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Construction properties for a DatabaseSecret.
 *
 * Example:
 *
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
public class DatabaseSecretPropsDsl {
  private val cdkBuilder: DatabaseSecretProps.Builder = DatabaseSecretProps.builder()

  /**
   * @param encryptionKey The KMS key to use to encrypt the secret.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param excludeCharacters Characters to not include in the generated password.
   */
  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  /**
   * @param masterSecret The master secret which will be used to rotate this secret.
   */
  public fun masterSecret(masterSecret: ISecret) {
    cdkBuilder.masterSecret(masterSecret)
  }

  /**
   * @param secretName The physical name of the secret.
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  /**
   * @param username The username. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): DatabaseSecretProps = cdkBuilder.build()
}
