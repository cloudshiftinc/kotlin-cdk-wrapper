@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation

@CdkDslMarker
public class CfnConfigurationAssociationConfigurationIdPropertyDsl {
  private val cdkBuilder: CfnConfigurationAssociation.ConfigurationIdProperty.Builder =
      CfnConfigurationAssociation.ConfigurationIdProperty.builder()

  /**
   * @param id The unique ID that Amazon MQ generates for the configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param revision The revision number of the configuration. 
   */
  public fun revision(revision: Number) {
    cdkBuilder.revision(revision)
  }

  public fun build(): CfnConfigurationAssociation.ConfigurationIdProperty = cdkBuilder.build()
}
