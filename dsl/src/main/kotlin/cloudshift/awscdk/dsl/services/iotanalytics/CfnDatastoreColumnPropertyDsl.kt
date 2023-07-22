@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreColumnPropertyDsl {
  private val cdkBuilder: CfnDatastore.ColumnProperty.Builder =
      CfnDatastore.ColumnProperty.builder()

  /**
   * @param name The name of the column. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type The type of data. 
   * For more information about the supported data types, see [Common data
   * types](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html) in the *AWS Glue
   * Developer Guide* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDatastore.ColumnProperty = cdkBuilder.build()
}
