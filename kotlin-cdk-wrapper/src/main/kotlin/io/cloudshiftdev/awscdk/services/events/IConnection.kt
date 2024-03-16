@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for EventBus Connections.
 */
public interface IConnection : IResource {
  /**
   * The ARN of the connection created.
   */
  public fun connectionArn(): String

  /**
   * The Name for the connection.
   */
  public fun connectionName(): String

  /**
   * The ARN for the secret created for the connection.
   */
  public fun connectionSecretArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IConnection): IConnection =
        CdkObjectWrappers.wrap(cdkObject) as IConnection

    internal fun unwrap(wrapped: IConnection): software.amazon.awscdk.services.events.IConnection =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.IConnection
  }
}
