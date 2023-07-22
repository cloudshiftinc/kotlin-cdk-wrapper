@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps

@CdkDslMarker
public class CfnStreamingDistributionPropsDsl {
  private val cdkBuilder: CfnStreamingDistributionProps.Builder =
      CfnStreamingDistributionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param streamingDistributionConfig The current configuration information for the RTMP
   * distribution. 
   */
  public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
    cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
  }

  /**
   * @param streamingDistributionConfig The current configuration information for the RTMP
   * distribution. 
   */
  public
      fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty) {
    cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
  }

  /**
   * @param tags A complex type that contains zero or more `Tag` elements.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A complex type that contains zero or more `Tag` elements.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStreamingDistributionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
