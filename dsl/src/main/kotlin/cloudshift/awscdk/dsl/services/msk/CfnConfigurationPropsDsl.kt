@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnConfigurationProps

@CdkDslMarker
public class CfnConfigurationPropsDsl {
  private val cdkBuilder: CfnConfigurationProps.Builder = CfnConfigurationProps.builder()

  private val _kafkaVersionsList: MutableList<String> = mutableListOf()

  /**
   * @param description The description of the configuration.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param kafkaVersionsList the value to be set.
   */
  public fun kafkaVersionsList(vararg kafkaVersionsList: String) {
    _kafkaVersionsList.addAll(listOf(*kafkaVersionsList))
  }

  /**
   * @param kafkaVersionsList the value to be set.
   */
  public fun kafkaVersionsList(kafkaVersionsList: Collection<String>) {
    _kafkaVersionsList.addAll(kafkaVersionsList)
  }

  /**
   * @param name The name of the configuration. 
   * Configuration names are strings that match the regex "^[0-9A-Za-z][0-9A-Za-z-]{0,}$".
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param serverProperties Contents of the server.properties file. When using the API, you must
   * ensure that the contents of the file are base64 encoded. When using the console, the SDK, or the
   * CLI, the contents of server.properties can be in plaintext. 
   */
  public fun serverProperties(serverProperties: String) {
    cdkBuilder.serverProperties(serverProperties)
  }

  public fun build(): CfnConfigurationProps {
    if(_kafkaVersionsList.isNotEmpty()) cdkBuilder.kafkaVersionsList(_kafkaVersionsList)
    return cdkBuilder.build()
  }
}
