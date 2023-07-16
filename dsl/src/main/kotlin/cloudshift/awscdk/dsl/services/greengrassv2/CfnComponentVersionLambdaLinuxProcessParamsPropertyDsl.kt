@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaLinuxProcessParamsPropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaLinuxProcessParamsProperty.Builder =
      CfnComponentVersion.LambdaLinuxProcessParamsProperty.builder()

  public fun containerParams(containerParams: IResolvable) {
    cdkBuilder.containerParams(containerParams)
  }

  public fun containerParams(containerParams: CfnComponentVersion.LambdaContainerParamsProperty) {
    cdkBuilder.containerParams(containerParams)
  }

  public fun isolationMode(isolationMode: String) {
    cdkBuilder.isolationMode(isolationMode)
  }

  public fun build(): CfnComponentVersion.LambdaLinuxProcessParamsProperty = cdkBuilder.build()
}
