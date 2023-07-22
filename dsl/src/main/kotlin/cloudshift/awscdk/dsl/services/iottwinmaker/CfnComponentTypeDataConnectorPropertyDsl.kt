@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypeDataConnectorPropertyDsl {
  private val cdkBuilder: CfnComponentType.DataConnectorProperty.Builder =
      CfnComponentType.DataConnectorProperty.builder()

  /**
   * @param isNative A boolean value that specifies whether the data connector is native to IoT
   * TwinMaker.
   */
  public fun isNative(isNative: Boolean) {
    cdkBuilder.isNative(isNative)
  }

  /**
   * @param isNative A boolean value that specifies whether the data connector is native to IoT
   * TwinMaker.
   */
  public fun isNative(isNative: IResolvable) {
    cdkBuilder.isNative(isNative)
  }

  /**
   * @param lambda The Lambda function associated with the data connector.
   */
  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param lambda The Lambda function associated with the data connector.
   */
  public fun lambda(lambda: CfnComponentType.LambdaFunctionProperty) {
    cdkBuilder.lambda(lambda)
  }

  public fun build(): CfnComponentType.DataConnectorProperty = cdkBuilder.build()
}
