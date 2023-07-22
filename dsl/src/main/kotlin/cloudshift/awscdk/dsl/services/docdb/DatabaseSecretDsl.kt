@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.docdb.DatabaseSecret
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct

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
