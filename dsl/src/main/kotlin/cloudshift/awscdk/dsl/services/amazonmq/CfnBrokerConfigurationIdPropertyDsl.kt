@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.amazonmq.CfnBroker

/**
 * A list of information about the configuration.
 *
 *
 * Does not apply to RabbitMQ brokers.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * ConfigurationIdProperty configurationIdProperty = ConfigurationIdProperty.builder()
 * .id("id")
 * .revision(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html)
 */
@CdkDslMarker
public class CfnBrokerConfigurationIdPropertyDsl {
  private val cdkBuilder: CfnBroker.ConfigurationIdProperty.Builder =
      CfnBroker.ConfigurationIdProperty.builder()

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

  public fun build(): CfnBroker.ConfigurationIdProperty = cdkBuilder.build()
}
