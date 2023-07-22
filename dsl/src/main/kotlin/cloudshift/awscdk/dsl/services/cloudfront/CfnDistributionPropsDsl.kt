@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnDistributionProps

@CdkDslMarker
public class CfnDistributionPropsDsl {
  private val cdkBuilder: CfnDistributionProps.Builder = CfnDistributionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param distributionConfig The distribution's configuration. 
   */
  public fun distributionConfig(distributionConfig: IResolvable) {
    cdkBuilder.distributionConfig(distributionConfig)
  }

  /**
   * @param distributionConfig The distribution's configuration. 
   */
  public fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty) {
    cdkBuilder.distributionConfig(distributionConfig)
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

  public fun build(): CfnDistributionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
