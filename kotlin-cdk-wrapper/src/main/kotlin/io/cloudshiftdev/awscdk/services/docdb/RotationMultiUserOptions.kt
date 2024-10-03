@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Unit

/**
 * Options to add the multi user rotation.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * Secret myImportedSecret;
 * DatabaseCluster cluster;
 * cluster.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder()
 * .secret(myImportedSecret)
 * .build());
 * ```
 */
public interface RotationMultiUserOptions {
  /**
   * Specifies the number of days after the previous rotation before Secrets Manager triggers the
   * next automatic rotation.
   *
   * Default: Duration.days(30)
   */
  public fun automaticallyAfter(): Duration? =
      unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

  /**
   * The secret to rotate.
   *
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
  public fun secret(): ISecret

  /**
   * A builder for [RotationMultiUserOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     */
    public fun automaticallyAfter(automaticallyAfter: Duration)

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
    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.RotationMultiUserOptions.Builder =
        software.amazon.awscdk.services.docdb.RotationMultiUserOptions.builder()

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     */
    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration.Companion::unwrap))
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
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.RotationMultiUserOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.RotationMultiUserOptions,
  ) : CdkObject(cdkObject),
      RotationMultiUserOptions {
    /**
     * Specifies the number of days after the previous rotation before Secrets Manager triggers the
     * next automatic rotation.
     *
     * Default: Duration.days(30)
     */
    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    /**
     * The secret to rotate.
     *
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
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RotationMultiUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.RotationMultiUserOptions):
        RotationMultiUserOptions = CdkObjectWrappers.wrap(cdkObject) as? RotationMultiUserOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationMultiUserOptions):
        software.amazon.awscdk.services.docdb.RotationMultiUserOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.RotationMultiUserOptions
  }
}
