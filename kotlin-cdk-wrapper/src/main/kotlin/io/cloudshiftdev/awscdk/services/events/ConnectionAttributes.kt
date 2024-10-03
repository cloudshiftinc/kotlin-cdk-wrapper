@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Interface with properties necessary to import a reusable Connection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * ConnectionAttributes connectionAttributes = ConnectionAttributes.builder()
 * .connectionArn("connectionArn")
 * .connectionName("connectionName")
 * .connectionSecretArn("connectionSecretArn")
 * .build();
 * ```
 */
public interface ConnectionAttributes {
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

  /**
   * A builder for [ConnectionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionArn The ARN of the connection created. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param connectionName The Name for the connection. 
     */
    public fun connectionName(connectionName: String)

    /**
     * @param connectionSecretArn The ARN for the secret created for the connection. 
     */
    public fun connectionSecretArn(connectionSecretArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ConnectionAttributes.Builder =
        software.amazon.awscdk.services.events.ConnectionAttributes.builder()

    /**
     * @param connectionArn The ARN of the connection created. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param connectionName The Name for the connection. 
     */
    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    /**
     * @param connectionSecretArn The ARN for the secret created for the connection. 
     */
    override fun connectionSecretArn(connectionSecretArn: String) {
      cdkBuilder.connectionSecretArn(connectionSecretArn)
    }

    public fun build(): software.amazon.awscdk.services.events.ConnectionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.ConnectionAttributes,
  ) : CdkObject(cdkObject),
      ConnectionAttributes {
    /**
     * The ARN of the connection created.
     */
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    /**
     * The Name for the connection.
     */
    override fun connectionName(): String = unwrap(this).getConnectionName()

    /**
     * The ARN for the secret created for the connection.
     */
    override fun connectionSecretArn(): String = unwrap(this).getConnectionSecretArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ConnectionAttributes):
        ConnectionAttributes = CdkObjectWrappers.wrap(cdkObject) as? ConnectionAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionAttributes):
        software.amazon.awscdk.services.events.ConnectionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.ConnectionAttributes
  }
}
