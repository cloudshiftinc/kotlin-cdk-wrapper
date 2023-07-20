@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.docdb.DatabaseSecretProps
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class DatabaseSecretPropsDsl {
  private val cdkBuilder: DatabaseSecretProps.Builder = DatabaseSecretProps.builder()

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  public fun masterSecret(masterSecret: ISecret) {
    cdkBuilder.masterSecret(masterSecret)
  }

  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): DatabaseSecretProps = cdkBuilder.build()
}
