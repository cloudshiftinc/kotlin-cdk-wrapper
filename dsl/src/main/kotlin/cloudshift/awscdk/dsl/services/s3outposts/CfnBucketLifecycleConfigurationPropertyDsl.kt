@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnBucket

@CdkDslMarker
public class CfnBucketLifecycleConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.LifecycleConfigurationProperty.Builder =
      CfnBucket.LifecycleConfigurationProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param rules The container for the lifecycle configuration rules for the objects stored in the
   * S3 on Outposts bucket. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules The container for the lifecycle configuration rules for the objects stored in the
   * S3 on Outposts bucket. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules The container for the lifecycle configuration rules for the objects stored in the
   * S3 on Outposts bucket. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnBucket.LifecycleConfigurationProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
