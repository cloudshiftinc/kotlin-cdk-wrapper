@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps

@CdkDslMarker
public class CfnResourceVersionPropsDsl {
  private val cdkBuilder: CfnResourceVersionProps.Builder = CfnResourceVersionProps.builder()

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun loggingConfig(loggingConfig: IResolvable) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  public fun loggingConfig(loggingConfig: CfnResourceVersion.LoggingConfigProperty) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  public fun schemaHandlerPackage(schemaHandlerPackage: String) {
    cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
  }

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnResourceVersionProps = cdkBuilder.build()
}
