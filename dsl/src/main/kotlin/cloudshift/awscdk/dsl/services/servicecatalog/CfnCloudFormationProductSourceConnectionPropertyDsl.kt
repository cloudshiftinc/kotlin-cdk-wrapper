@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

@CdkDslMarker
public class CfnCloudFormationProductSourceConnectionPropertyDsl {
  private val cdkBuilder: CfnCloudFormationProduct.SourceConnectionProperty.Builder =
      CfnCloudFormationProduct.SourceConnectionProperty.builder()

  /**
   * @param connectionParameters The connection details based on the connection `Type` . 
   */
  public fun connectionParameters(connectionParameters: IResolvable) {
    cdkBuilder.connectionParameters(connectionParameters)
  }

  /**
   * @param connectionParameters The connection details based on the connection `Type` . 
   */
  public
      fun connectionParameters(connectionParameters: CfnCloudFormationProduct.ConnectionParametersProperty) {
    cdkBuilder.connectionParameters(connectionParameters)
  }

  /**
   * @param type The only supported `SourceConnection` type is Codestar. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCloudFormationProduct.SourceConnectionProperty = cdkBuilder.build()
}
