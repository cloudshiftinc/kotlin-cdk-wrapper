@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketS3KeyFilterPropertyDsl {
  private val cdkBuilder: CfnBucket.S3KeyFilterProperty.Builder =
      CfnBucket.S3KeyFilterProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param rules A list of containers for the key-value pair that defines the criteria for the
   * filter rule. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules A list of containers for the key-value pair that defines the criteria for the
   * filter rule. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules A list of containers for the key-value pair that defines the criteria for the
   * filter rule. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnBucket.S3KeyFilterProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
