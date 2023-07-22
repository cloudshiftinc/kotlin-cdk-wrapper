@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.ConnectionAttributes

@CdkDslMarker
public class ConnectionAttributesDsl {
  private val cdkBuilder: ConnectionAttributes.Builder = ConnectionAttributes.builder()

  /**
   * @param connectionArn The ARN of the connection created. 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * @param connectionName The Name for the connection. 
   */
  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  /**
   * @param connectionSecretArn The ARN for the secret created for the connection. 
   */
  public fun connectionSecretArn(connectionSecretArn: String) {
    cdkBuilder.connectionSecretArn(connectionSecretArn)
  }

  public fun build(): ConnectionAttributes = cdkBuilder.build()
}
