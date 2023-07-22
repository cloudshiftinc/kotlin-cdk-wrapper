@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFormDataTypeConfigPropertyDsl {
  private val cdkBuilder: CfnForm.FormDataTypeConfigProperty.Builder =
      CfnForm.FormDataTypeConfigProperty.builder()

  /**
   * @param dataSourceType The data source type, either an Amplify DataStore model or a custom data
   * type. 
   */
  public fun dataSourceType(dataSourceType: String) {
    cdkBuilder.dataSourceType(dataSourceType)
  }

  /**
   * @param dataTypeName The unique name of the data type you are using as the data source for the
   * form. 
   */
  public fun dataTypeName(dataTypeName: String) {
    cdkBuilder.dataTypeName(dataTypeName)
  }

  public fun build(): CfnForm.FormDataTypeConfigProperty = cdkBuilder.build()
}
