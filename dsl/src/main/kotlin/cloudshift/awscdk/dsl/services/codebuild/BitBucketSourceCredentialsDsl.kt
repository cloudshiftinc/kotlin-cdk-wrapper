@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.constructs.Construct

/**
 * The source credentials used when contacting the BitBucket API.
 *
 * **Note**: CodeBuild only allows a single credential for BitBucket
 * to be saved in a given AWS account in a given region -
 * any attempt to add more than one will result in an error.
 *
 * Example:
 *
 * ```
 * BitBucketSourceCredentials.Builder.create(this, "CodeBuildBitBucketCreds")
 * .username(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("username").build()))
 * .password(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("password").build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class BitBucketSourceCredentialsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: BitBucketSourceCredentials.Builder =
      BitBucketSourceCredentials.Builder.create(scope, id)

  /**
   * Your BitBucket application password.
   *
   * @param password Your BitBucket application password. 
   */
  public fun password(password: SecretValue) {
    cdkBuilder.password(password)
  }

  /**
   * Your BitBucket username.
   *
   * @param username Your BitBucket username. 
   */
  public fun username(username: SecretValue) {
    cdkBuilder.username(username)
  }

  public fun build(): BitBucketSourceCredentials = cdkBuilder.build()
}
