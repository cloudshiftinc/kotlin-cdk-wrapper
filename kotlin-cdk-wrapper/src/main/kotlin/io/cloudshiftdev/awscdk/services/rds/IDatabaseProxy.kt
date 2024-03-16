@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * DB Proxy.
 */
public interface IDatabaseProxy : IResource {
  /**
   * DB Proxy ARN.
   */
  public fun dbProxyArn(): String

  /**
   * DB Proxy Name.
   */
  public fun dbProxyName(): String

  /**
   * Endpoint.
   */
  public fun endpoint(): String

  /**
   * Grant the given identity connection access to the proxy.
   *
   * Default: - if the Proxy had been provided a single Secret value,
   * the user will be taken from that Secret
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the proxy.
   */
  public fun grantConnect(grantee: IGrantable): Grant

  /**
   * Grant the given identity connection access to the proxy.
   *
   * Default: - if the Proxy had been provided a single Secret value,
   * the user will be taken from that Secret
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the proxy.
   */
  public fun grantConnect(grantee: IGrantable, dbUser: String): Grant

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseProxy): IDatabaseProxy
        = CdkObjectWrappers.wrap(cdkObject) as IDatabaseProxy

    internal fun unwrap(wrapped: IDatabaseProxy): software.amazon.awscdk.services.rds.IDatabaseProxy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.IDatabaseProxy
  }
}
