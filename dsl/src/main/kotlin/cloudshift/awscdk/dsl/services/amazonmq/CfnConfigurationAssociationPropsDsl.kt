@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps

@CdkDslMarker
public class CfnConfigurationAssociationPropsDsl {
  private val cdkBuilder: CfnConfigurationAssociationProps.Builder =
      CfnConfigurationAssociationProps.builder()

  /**
   * @param broker The broker to associate with a configuration. 
   */
  public fun broker(broker: String) {
    cdkBuilder.broker(broker)
  }

  /**
   * @param configuration The configuration to associate with a broker. 
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration The configuration to associate with a broker. 
   */
  public fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): CfnConfigurationAssociationProps = cdkBuilder.build()
}
