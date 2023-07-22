@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketIntelligentTieringConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.IntelligentTieringConfigurationProperty.Builder =
      CfnBucket.IntelligentTieringConfigurationProperty.builder()

  private val _tagFilters: MutableList<Any> = mutableListOf()

  private val _tierings: MutableList<Any> = mutableListOf()

  /**
   * @param id The ID used to identify the S3 Intelligent-Tiering configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param prefix An object key name prefix that identifies the subset of objects to which the rule
   * applies.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param status Specifies the status of the configuration. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param tagFilters A container for a key-value pair.
   */
  public fun tagFilters(vararg tagFilters: Any) {
    _tagFilters.addAll(listOf(*tagFilters))
  }

  /**
   * @param tagFilters A container for a key-value pair.
   */
  public fun tagFilters(tagFilters: Collection<Any>) {
    _tagFilters.addAll(tagFilters)
  }

  /**
   * @param tagFilters A container for a key-value pair.
   */
  public fun tagFilters(tagFilters: IResolvable) {
    cdkBuilder.tagFilters(tagFilters)
  }

  /**
   * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
   * configuration. 
   * At least one tier must be defined in the list. At most, you can specify two tiers in the list,
   * one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
   *
   *
   * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
   * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access or
   * Deep Archive Access tiers.
   */
  public fun tierings(vararg tierings: Any) {
    _tierings.addAll(listOf(*tierings))
  }

  /**
   * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
   * configuration. 
   * At least one tier must be defined in the list. At most, you can specify two tiers in the list,
   * one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
   *
   *
   * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
   * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access or
   * Deep Archive Access tiers.
   */
  public fun tierings(tierings: Collection<Any>) {
    _tierings.addAll(tierings)
  }

  /**
   * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
   * configuration. 
   * At least one tier must be defined in the list. At most, you can specify two tiers in the list,
   * one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
   *
   *
   * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
   * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access or
   * Deep Archive Access tiers.
   */
  public fun tierings(tierings: IResolvable) {
    cdkBuilder.tierings(tierings)
  }

  public fun build(): CfnBucket.IntelligentTieringConfigurationProperty {
    if(_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
    if(_tierings.isNotEmpty()) cdkBuilder.tierings(_tierings)
    return cdkBuilder.build()
  }
}
