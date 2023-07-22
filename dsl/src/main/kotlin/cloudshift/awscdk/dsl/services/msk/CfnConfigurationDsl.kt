@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfiguration.Builder = CfnConfiguration.Builder.create(scope, id)

  private val _kafkaVersionsList: MutableList<String> = mutableListOf()

  /**
   * The description of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
   * @param description The description of the configuration. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
   * @param kafkaVersionsList 
   */
  public fun kafkaVersionsList(vararg kafkaVersionsList: String) {
    _kafkaVersionsList.addAll(listOf(*kafkaVersionsList))
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
   * @param kafkaVersionsList 
   */
  public fun kafkaVersionsList(kafkaVersionsList: Collection<String>) {
    _kafkaVersionsList.addAll(kafkaVersionsList)
  }

  /**
   * The name of the configuration.
   *
   * Configuration names are strings that match the regex "^[0-9A-Za-z][0-9A-Za-z-]{0,}$".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
   * @param name The name of the configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Contents of the server.properties file. When using the API, you must ensure that the contents
   * of the file are base64 encoded. When using the console, the SDK, or the CLI, the contents of
   * server.properties can be in plaintext.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
   * @param serverProperties Contents of the server.properties file. When using the API, you must
   * ensure that the contents of the file are base64 encoded. When using the console, the SDK, or the
   * CLI, the contents of server.properties can be in plaintext. 
   */
  public fun serverProperties(serverProperties: String) {
    cdkBuilder.serverProperties(serverProperties)
  }

  public fun build(): CfnConfiguration {
    if(_kafkaVersionsList.isNotEmpty()) cdkBuilder.kafkaVersionsList(_kafkaVersionsList)
    return cdkBuilder.build()
  }
}
