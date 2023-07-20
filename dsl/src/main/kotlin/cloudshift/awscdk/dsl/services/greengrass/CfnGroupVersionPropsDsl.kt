@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnGroupVersionProps

@CdkDslMarker
public class CfnGroupVersionPropsDsl {
  private val cdkBuilder: CfnGroupVersionProps.Builder = CfnGroupVersionProps.builder()

  public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
    cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
  }

  public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
    cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
  }

  public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
    cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
  }

  public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
    cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
  }

  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
    cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
  }

  public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
    cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
  }

  public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
    cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
  }

  public fun build(): CfnGroupVersionProps = cdkBuilder.build()
}
