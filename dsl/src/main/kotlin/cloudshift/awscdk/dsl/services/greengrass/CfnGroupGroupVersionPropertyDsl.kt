@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnGroup

@CdkDslMarker
public class CfnGroupGroupVersionPropertyDsl {
  private val cdkBuilder: CfnGroup.GroupVersionProperty.Builder =
      CfnGroup.GroupVersionProperty.builder()

  /**
   * @param connectorDefinitionVersionArn The Amazon Resource Name (ARN) of the connector definition
   * version that contains the connectors you want to deploy with the group version.
   */
  public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
    cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
  }

  /**
   * @param coreDefinitionVersionArn The ARN of the core definition version that contains the core
   * you want to deploy with the group version.
   * Currently, the core definition version can contain only one core.
   */
  public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
    cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
  }

  /**
   * @param deviceDefinitionVersionArn The ARN of the device definition version that contains the
   * devices you want to deploy with the group version.
   */
  public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
    cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
  }

  /**
   * @param functionDefinitionVersionArn The ARN of the function definition version that contains
   * the functions you want to deploy with the group version.
   */
  public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
    cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
  }

  /**
   * @param loggerDefinitionVersionArn The ARN of the logger definition version that contains the
   * loggers you want to deploy with the group version.
   */
  public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
    cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
  }

  /**
   * @param resourceDefinitionVersionArn The ARN of the resource definition version that contains
   * the resources you want to deploy with the group version.
   */
  public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
    cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
  }

  /**
   * @param subscriptionDefinitionVersionArn The ARN of the subscription definition version that
   * contains the subscriptions you want to deploy with the group version.
   */
  public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
    cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
  }

  public fun build(): CfnGroup.GroupVersionProperty = cdkBuilder.build()
}
