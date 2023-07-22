@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes

@CdkDslMarker
public class DatabaseInstanceAttributesDsl {
  private val cdkBuilder: DatabaseInstanceAttributes.Builder = DatabaseInstanceAttributes.builder()

  /**
   * @param instanceEndpointAddress The endpoint address. 
   */
  public fun instanceEndpointAddress(instanceEndpointAddress: String) {
    cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
  }

  /**
   * @param instanceIdentifier The instance identifier. 
   */
  public fun instanceIdentifier(instanceIdentifier: String) {
    cdkBuilder.instanceIdentifier(instanceIdentifier)
  }

  /**
   * @param port The database port. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): DatabaseInstanceAttributes = cdkBuilder.build()
}
