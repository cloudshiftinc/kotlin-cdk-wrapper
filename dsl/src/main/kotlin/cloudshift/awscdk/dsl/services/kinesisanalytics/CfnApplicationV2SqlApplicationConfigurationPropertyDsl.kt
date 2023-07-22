@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2SqlApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.SqlApplicationConfigurationProperty.Builder =
      CfnApplicationV2.SqlApplicationConfigurationProperty.builder()

  private val _inputs: MutableList<Any> = mutableListOf()

  /**
   * @param inputs The array of
   * [Input](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_Input.html) objects
   * describing the input streams used by the application.
   */
  public fun inputs(vararg inputs: Any) {
    _inputs.addAll(listOf(*inputs))
  }

  /**
   * @param inputs The array of
   * [Input](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_Input.html) objects
   * describing the input streams used by the application.
   */
  public fun inputs(inputs: Collection<Any>) {
    _inputs.addAll(inputs)
  }

  /**
   * @param inputs The array of
   * [Input](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_Input.html) objects
   * describing the input streams used by the application.
   */
  public fun inputs(inputs: IResolvable) {
    cdkBuilder.inputs(inputs)
  }

  public fun build(): CfnApplicationV2.SqlApplicationConfigurationProperty {
    if(_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
    return cdkBuilder.build()
  }
}
