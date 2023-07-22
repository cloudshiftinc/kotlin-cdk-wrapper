@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.s3.LifecycleRule
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition
import software.amazon.awscdk.services.s3.Transition

/**
 * Declaration of a Life cycle rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.*;
 * StorageClass storageClass;
 * Object tagFilters;
 * LifecycleRule lifecycleRule = LifecycleRule.builder()
 * .abortIncompleteMultipartUploadAfter(Duration.minutes(30))
 * .enabled(false)
 * .expiration(Duration.minutes(30))
 * .expirationDate(new Date())
 * .expiredObjectDeleteMarker(false)
 * .id("id")
 * .noncurrentVersionExpiration(Duration.minutes(30))
 * .noncurrentVersionsToRetain(123)
 * .noncurrentVersionTransitions(List.of(NoncurrentVersionTransition.builder()
 * .storageClass(storageClass)
 * .transitionAfter(Duration.minutes(30))
 * // the properties below are optional
 * .noncurrentVersionsToRetain(123)
 * .build()))
 * .objectSizeGreaterThan(123)
 * .objectSizeLessThan(123)
 * .prefix("prefix")
 * .tagFilters(Map.of(
 * "tagFiltersKey", tagFilters))
 * .transitions(List.of(Transition.builder()
 * .storageClass(storageClass)
 * // the properties below are optional
 * .transitionAfter(Duration.minutes(30))
 * .transitionDate(new Date())
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class LifecycleRuleDsl {
  private val cdkBuilder: LifecycleRule.Builder = LifecycleRule.builder()

  private val _noncurrentVersionTransitions: MutableList<NoncurrentVersionTransition> =
      mutableListOf()

  private val _transitions: MutableList<Transition> = mutableListOf()

  /**
   * @param abortIncompleteMultipartUploadAfter Specifies a lifecycle rule that aborts incomplete
   * multipart uploads to an Amazon S3 bucket.
   * The AbortIncompleteMultipartUpload property type creates a lifecycle
   * rule that aborts incomplete multipart uploads to an Amazon S3 bucket.
   * When Amazon S3 aborts a multipart upload, it deletes all parts
   * associated with the multipart upload.
   *
   * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
   * does not represent a whole number of days will result in a runtime or deployment error.
   */
  public fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration) {
    cdkBuilder.abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter)
  }

  /**
   * @param enabled Whether this rule is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param expiration Indicates the number of days after creation when objects are deleted from
   * Amazon S3 and Amazon Glacier.
   * If you specify an expiration and transition time, you must use the same
   * time unit for both properties (either in days or by date). The
   * expiration time must also be later than the transition time.
   *
   * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
   * does not represent a whole number of days will result in a runtime or deployment error.
   */
  public fun expiration(expiration: Duration) {
    cdkBuilder.expiration(expiration)
  }

  /**
   * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon Glacier.
   * The date value must be in ISO 8601 format. The time is always midnight UTC.
   *
   * If you specify an expiration and transition time, you must use the same
   * time unit for both properties (either in days or by date). The
   * expiration time must also be later than the transition time.
   */
  public fun expirationDate(expirationDate: Instant) {
    cdkBuilder.expirationDate(expirationDate)
  }

  /**
   * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker with
   * no noncurrent versions.
   * If set to true, the delete marker will be expired.
   */
  public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
    cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
  }

  /**
   * @param id A unique identifier for this rule.
   * The value cannot be more than 255 characters.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param noncurrentVersionExpiration Time between when a new version of the object is uploaded to
   * the bucket and when old versions of the object expire.
   * For buckets with versioning enabled (or suspended), specifies the time,
   * in days, between when a new version of the object is uploaded to the
   * bucket and when old versions of the object expire. When object versions
   * expire, Amazon S3 permanently deletes them. If you specify a transition
   * and expiration time, the expiration time must be later than the
   * transition time.
   *
   * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
   * does not represent a whole number of days will result in a runtime or deployment error.
   */
  public fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration) {
    cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration)
  }

  /**
   * @param noncurrentVersionTransitions One or more transition rules that specify when non-current
   * objects transition to a specified storage class.
   * Only for for buckets with versioning enabled (or suspended).
   *
   * If you specify a transition and expiration time, the expiration time
   * must be later than the transition time.
   */
  public
      fun noncurrentVersionTransitions(noncurrentVersionTransitions: NoncurrentVersionTransitionDsl.() -> Unit) {
    _noncurrentVersionTransitions.add(NoncurrentVersionTransitionDsl().apply(noncurrentVersionTransitions).build())
  }

  /**
   * @param noncurrentVersionTransitions One or more transition rules that specify when non-current
   * objects transition to a specified storage class.
   * Only for for buckets with versioning enabled (or suspended).
   *
   * If you specify a transition and expiration time, the expiration time
   * must be later than the transition time.
   */
  public
      fun noncurrentVersionTransitions(noncurrentVersionTransitions: Collection<NoncurrentVersionTransition>) {
    _noncurrentVersionTransitions.addAll(noncurrentVersionTransitions)
  }

  /**
   * @param noncurrentVersionsToRetain Indicates a maximum number of noncurrent versions to retain.
   * If there are this many more noncurrent versions,
   * Amazon S3 permanently deletes them.
   */
  public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
    cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
  }

  /**
   * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to apply
   * to.
   */
  public fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
    cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
  }

  /**
   * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply to.
   */
  public fun objectSizeLessThan(objectSizeLessThan: Number) {
    cdkBuilder.objectSizeLessThan(objectSizeLessThan)
  }

  /**
   * @param prefix Object key prefix that identifies one or more objects to which this rule applies.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param tagFilters The TagFilter property type specifies tags to use to identify a subset of
   * objects for an Amazon S3 bucket.
   */
  public fun tagFilters(tagFilters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tagFilters)
    cdkBuilder.tagFilters(builder.map)
  }

  /**
   * @param tagFilters The TagFilter property type specifies tags to use to identify a subset of
   * objects for an Amazon S3 bucket.
   */
  public fun tagFilters(tagFilters: Map<String, Any>) {
    cdkBuilder.tagFilters(tagFilters)
  }

  /**
   * @param transitions One or more transition rules that specify when an object transitions to a
   * specified storage class.
   * If you specify an expiration and transition time, you must use the same
   * time unit for both properties (either in days or by date). The
   * expiration time must also be later than the transition time.
   */
  public fun transitions(transitions: TransitionDsl.() -> Unit) {
    _transitions.add(TransitionDsl().apply(transitions).build())
  }

  /**
   * @param transitions One or more transition rules that specify when an object transitions to a
   * specified storage class.
   * If you specify an expiration and transition time, you must use the same
   * time unit for both properties (either in days or by date). The
   * expiration time must also be later than the transition time.
   */
  public fun transitions(transitions: Collection<Transition>) {
    _transitions.addAll(transitions)
  }

  public fun build(): LifecycleRule {
    if(_noncurrentVersionTransitions.isNotEmpty())
        cdkBuilder.noncurrentVersionTransitions(_noncurrentVersionTransitions)
    if(_transitions.isNotEmpty()) cdkBuilder.transitions(_transitions)
    return cdkBuilder.build()
  }
}
