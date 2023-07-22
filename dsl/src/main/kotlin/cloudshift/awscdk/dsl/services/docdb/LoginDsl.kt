@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.docdb.Login
import software.amazon.awscdk.services.kms.IKey

/**
 * Login credentials for a database cluster.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .masterUser(Login.builder()
 * .username("myuser")
 * .build())
 * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .vpc(vpc)
 * .deletionProtection(true)
 * .build();
 * ```
 */
@CdkDslMarker
public class LoginDsl {
  private val cdkBuilder: Login.Builder = Login.builder()

  /**
   * @param excludeCharacters Specifies characters to not include in generated passwords.
   */
  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  /**
   * @param kmsKey KMS encryption key to encrypt the generated secret.
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * @param password Password.
   * Do not put passwords in your CDK code directly.
   */
  public fun password(password: SecretValue) {
    cdkBuilder.password(password)
  }

  /**
   * @param secretName The physical name of the secret, that will be generated.
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  /**
   * @param username Username. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): Login = cdkBuilder.build()
}
