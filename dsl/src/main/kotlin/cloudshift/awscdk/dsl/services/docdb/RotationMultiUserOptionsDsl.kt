@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.docdb.RotationMultiUserOptions
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Options to add the multi user rotation.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Secret myImportedSecret;
 * DatabaseCluster cluster;
 * cluster.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder()
 * .secret(myImportedSecret)
 * .build());
 * ```
 */
@CdkDslMarker
public class RotationMultiUserOptionsDsl {
  private val cdkBuilder: RotationMultiUserOptions.Builder = RotationMultiUserOptions.builder()

  /**
   * @param automaticallyAfter Specifies the number of days after the previous rotation before
   * Secrets Manager triggers the next automatic rotation.
   */
  public fun automaticallyAfter(automaticallyAfter: Duration) {
    cdkBuilder.automaticallyAfter(automaticallyAfter)
  }

  /**
   * @param secret The secret to rotate. 
   * It must be a JSON string with the following format:
   *
   * ```
   * {
   * "engine": &lt;required: must be set to 'mongo'&gt;,
   * "host": &lt;required: instance host name&gt;,
   * "username": &lt;required: username&gt;,
   * "password": &lt;required: password&gt;,
   * "dbname": &lt;optional: database name&gt;,
   * "port": &lt;optional: if not specified, default port 27017 will be used&gt;,
   * "masterarn": &lt;required: the arn of the master secret which will be used to create
   * users/change passwords&gt;
   * "ssl": &lt;optional: if not specified, defaults to false. This must be true if being used for
   * DocumentDB rotations
   * where the cluster has TLS enabled&gt;
   * }
   * ```
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun build(): RotationMultiUserOptions = cdkBuilder.build()
}
