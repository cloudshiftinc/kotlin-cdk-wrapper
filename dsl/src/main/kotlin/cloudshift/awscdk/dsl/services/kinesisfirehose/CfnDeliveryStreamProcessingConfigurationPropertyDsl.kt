@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamProcessingConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ProcessingConfigurationProperty.Builder =
      CfnDeliveryStream.ProcessingConfigurationProperty.builder()

  private val _processors: MutableList<Any> = mutableListOf()

  /**
   * @param enabled Indicates whether data processing is enabled (true) or disabled (false).
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether data processing is enabled (true) or disabled (false).
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param processors The data processors.
   */
  public fun processors(vararg processors: Any) {
    _processors.addAll(listOf(*processors))
  }

  /**
   * @param processors The data processors.
   */
  public fun processors(processors: Collection<Any>) {
    _processors.addAll(processors)
  }

  /**
   * @param processors The data processors.
   */
  public fun processors(processors: IResolvable) {
    cdkBuilder.processors(processors)
  }

  public fun build(): CfnDeliveryStream.ProcessingConfigurationProperty {
    if(_processors.isNotEmpty()) cdkBuilder.processors(_processors)
    return cdkBuilder.build()
  }
}
