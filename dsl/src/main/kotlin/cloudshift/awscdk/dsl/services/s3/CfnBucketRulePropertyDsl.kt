@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketRulePropertyDsl {
  private val cdkBuilder: CfnBucket.RuleProperty.Builder = CfnBucket.RuleProperty.builder()

  private val _noncurrentVersionTransitions: MutableList<Any> = mutableListOf()

  private val _tagFilters: MutableList<Any> = mutableListOf()

  private val _transitions: MutableList<Any> = mutableListOf()

  /**
   * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
   * multipart uploads to an Amazon S3 bucket.
   */
  public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  /**
   * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
   * multipart uploads to an Amazon S3 bucket.
   */
  public
      fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: CfnBucket.AbortIncompleteMultipartUploadProperty) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  /**
   * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon S3 Glacier.
   * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify an
   * expiration and transition time, you must use the same time unit for both properties (either in
   * days or by date). The expiration time must also be later than the transition time.
   */
  public fun expirationDate(expirationDate: Instant) {
    cdkBuilder.expirationDate(expirationDate)
  }

  /**
   * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon S3 Glacier.
   * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify an
   * expiration and transition time, you must use the same time unit for both properties (either in
   * days or by date). The expiration time must also be later than the transition time.
   */
  public fun expirationDate(expirationDate: IResolvable) {
    cdkBuilder.expirationDate(expirationDate)
  }

  /**
   * @param expirationInDays Indicates the number of days after creation when objects are deleted
   * from Amazon S3 and Amazon S3 Glacier.
   * If you specify an expiration and transition time, you must use the same time unit for both
   * properties (either in days or by date). The expiration time must also be later than the transition
   * time.
   */
  public fun expirationInDays(expirationInDays: Number) {
    cdkBuilder.expirationInDays(expirationInDays)
  }

  /**
   * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker
   * without any noncurrent versions.
   * If set to true, the delete marker will be removed if there are no noncurrent versions. This
   * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
   */
  public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
    cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
  }

  /**
   * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker
   * without any noncurrent versions.
   * If set to true, the delete marker will be removed if there are no noncurrent versions. This
   * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
   */
  public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: IResolvable) {
    cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
  }

  /**
   * @param id Unique identifier for the rule.
   * The value can't be longer than 255 characters.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
   * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
   * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request
   * that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
   */
  public fun noncurrentVersionExpiration(noncurrentVersionExpiration: IResolvable) {
    cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration)
  }

  /**
   * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
   * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
   * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request
   * that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
   */
  public
      fun noncurrentVersionExpiration(noncurrentVersionExpiration: CfnBucket.NoncurrentVersionExpirationProperty) {
    cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration)
  }

  /**
   * @param noncurrentVersionExpirationInDays (Deprecated.) For buckets with versioning enabled (or
   * suspended), specifies the time, in days, between when a new version of the object is uploaded to
   * the bucket and when old versions of the object expire. When object versions expire, Amazon S3
   * permanently deletes them. If you specify a transition and expiration time, the expiration time
   * must be later than the transition time.
   */
  public fun noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays: Number) {
    cdkBuilder.noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays)
  }

  /**
   * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
   * suspended), specifies when non-current objects transition to a specified storage class. If you
   * specify a transition and expiration time, the expiration time must be later than the transition
   * time. If you specify this property, don't specify the `NoncurrentVersionTransitions` property.
   */
  public fun noncurrentVersionTransition(noncurrentVersionTransition: IResolvable) {
    cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition)
  }

  /**
   * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
   * suspended), specifies when non-current objects transition to a specified storage class. If you
   * specify a transition and expiration time, the expiration time must be later than the transition
   * time. If you specify this property, don't specify the `NoncurrentVersionTransitions` property.
   */
  public
      fun noncurrentVersionTransition(noncurrentVersionTransition: CfnBucket.NoncurrentVersionTransitionProperty) {
    cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition)
  }

  /**
   * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one or
   * more transition rules that specify when non-current objects transition to a specified storage
   * class.
   * If you specify a transition and expiration time, the expiration time must be later than the
   * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
   * property.
   */
  public fun noncurrentVersionTransitions(vararg noncurrentVersionTransitions: Any) {
    _noncurrentVersionTransitions.addAll(listOf(*noncurrentVersionTransitions))
  }

  /**
   * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one or
   * more transition rules that specify when non-current objects transition to a specified storage
   * class.
   * If you specify a transition and expiration time, the expiration time must be later than the
   * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
   * property.
   */
  public fun noncurrentVersionTransitions(noncurrentVersionTransitions: Collection<Any>) {
    _noncurrentVersionTransitions.addAll(noncurrentVersionTransitions)
  }

  /**
   * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one or
   * more transition rules that specify when non-current objects transition to a specified storage
   * class.
   * If you specify a transition and expiration time, the expiration time must be later than the
   * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
   * property.
   */
  public fun noncurrentVersionTransitions(noncurrentVersionTransitions: IResolvable) {
    cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions)
  }

  /**
   * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to apply
   * to.
   * Objects must be larger than this value in bytes. For more information about size based rules,
   * see [Lifecycle configuration using size-based
   * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
   * in the *Amazon S3 User Guide* .
   */
  public fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
    cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
  }

  /**
   * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply to.
   * Objects must be smaller than this value in bytes. For more information about sized based rules,
   * see [Lifecycle configuration using size-based
   * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
   * in the *Amazon S3 User Guide* .
   */
  public fun objectSizeLessThan(objectSizeLessThan: Number) {
    cdkBuilder.objectSizeLessThan(objectSizeLessThan)
  }

  /**
   * @param prefix Object key prefix that identifies one or more objects to which this rule applies.
   *
   * Replacement must be made for object keys containing special characters (such as carriage
   * returns) when using XML requests. For more information, see [XML related object key
   * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
   * .
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param status If `Enabled` , the rule is currently being applied. 
   * If `Disabled` , the rule is not currently being applied.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
   * applies.
   */
  public fun tagFilters(vararg tagFilters: Any) {
    _tagFilters.addAll(listOf(*tagFilters))
  }

  /**
   * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
   * applies.
   */
  public fun tagFilters(tagFilters: Collection<Any>) {
    _tagFilters.addAll(tagFilters)
  }

  /**
   * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
   * applies.
   */
  public fun tagFilters(tagFilters: IResolvable) {
    cdkBuilder.tagFilters(tagFilters)
  }

  /**
   * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
   * class. If you specify an expiration and transition time, you must use the same time unit for both
   * properties (either in days or by date). The expiration time must also be later than the transition
   * time. If you specify this property, don't specify the `Transitions` property.
   */
  public fun transition(transition: IResolvable) {
    cdkBuilder.transition(transition)
  }

  /**
   * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
   * class. If you specify an expiration and transition time, you must use the same time unit for both
   * properties (either in days or by date). The expiration time must also be later than the transition
   * time. If you specify this property, don't specify the `Transitions` property.
   */
  public fun transition(transition: CfnBucket.TransitionProperty) {
    cdkBuilder.transition(transition)
  }

  /**
   * @param transitions One or more transition rules that specify when an object transitions to a
   * specified storage class.
   * If you specify an expiration and transition time, you must use the same time unit for both
   * properties (either in days or by date). The expiration time must also be later than the transition
   * time. If you specify this property, don't specify the `Transition` property.
   */
  public fun transitions(vararg transitions: Any) {
    _transitions.addAll(listOf(*transitions))
  }

  /**
   * @param transitions One or more transition rules that specify when an object transitions to a
   * specified storage class.
   * If you specify an expiration and transition time, you must use the same time unit for both
   * properties (either in days or by date). The expiration time must also be later than the transition
   * time. If you specify this property, don't specify the `Transition` property.
   */
  public fun transitions(transitions: Collection<Any>) {
    _transitions.addAll(transitions)
  }

  /**
   * @param transitions One or more transition rules that specify when an object transitions to a
   * specified storage class.
   * If you specify an expiration and transition time, you must use the same time unit for both
   * properties (either in days or by date). The expiration time must also be later than the transition
   * time. If you specify this property, don't specify the `Transition` property.
   */
  public fun transitions(transitions: IResolvable) {
    cdkBuilder.transitions(transitions)
  }

  public fun build(): CfnBucket.RuleProperty {
    if(_noncurrentVersionTransitions.isNotEmpty())
        cdkBuilder.noncurrentVersionTransitions(_noncurrentVersionTransitions)
    if(_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
    if(_transitions.isNotEmpty()) cdkBuilder.transitions(_transitions)
    return cdkBuilder.build()
  }
}
