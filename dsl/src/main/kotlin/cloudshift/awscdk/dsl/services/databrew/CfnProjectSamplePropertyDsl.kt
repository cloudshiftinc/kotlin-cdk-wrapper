@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnProject

@CdkDslMarker
public class CfnProjectSamplePropertyDsl {
  private val cdkBuilder: CfnProject.SampleProperty.Builder = CfnProject.SampleProperty.builder()

  /**
   * @param size The number of rows in the sample.
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  /**
   * @param type The way in which DataBrew obtains rows from a dataset. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnProject.SampleProperty = cdkBuilder.build()
}
