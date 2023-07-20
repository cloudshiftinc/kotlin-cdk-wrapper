@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation
import software.amazon.awscdk.services.cloudformation.CfnTypeActivationProps

@CdkDslMarker
public class CfnTypeActivationPropsDsl {
  private val cdkBuilder: CfnTypeActivationProps.Builder = CfnTypeActivationProps.builder()

  public fun autoUpdate(autoUpdate: Boolean) {
    cdkBuilder.autoUpdate(autoUpdate)
  }

  public fun autoUpdate(autoUpdate: IResolvable) {
    cdkBuilder.autoUpdate(autoUpdate)
  }

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun loggingConfig(loggingConfig: IResolvable) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  public fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty) {
    cdkBuilder.loggingConfig(loggingConfig)
  }

  public fun majorVersion(majorVersion: String) {
    cdkBuilder.majorVersion(majorVersion)
  }

  public fun publicTypeArn(publicTypeArn: String) {
    cdkBuilder.publicTypeArn(publicTypeArn)
  }

  public fun publisherId(publisherId: String) {
    cdkBuilder.publisherId(publisherId)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun typeNameAlias(typeNameAlias: String) {
    cdkBuilder.typeNameAlias(typeNameAlias)
  }

  public fun versionBump(versionBump: String) {
    cdkBuilder.versionBump(versionBump)
  }

  public fun build(): CfnTypeActivationProps = cdkBuilder.build()
}
