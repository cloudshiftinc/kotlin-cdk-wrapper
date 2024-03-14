package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LifecycleRule {
  /**
   * Specifies a lifecycle rule that aborts incomplete multipart uploads to an Amazon S3 bucket.
   *
   * The AbortIncompleteMultipartUpload property type creates a lifecycle
   * rule that aborts incomplete multipart uploads to an Amazon S3 bucket.
   * When Amazon S3 aborts a multipart upload, it deletes all parts
   * associated with the multipart upload.
   *
   * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
   * does not represent a whole number of days will result in a runtime or deployment error.
   *
   * Default: - Incomplete uploads are never aborted
   */
  public fun abortIncompleteMultipartUploadAfter(): Duration? =
      unwrap(this).getAbortIncompleteMultipartUploadAfter()?.let(Duration::wrap)

  /**
   * Whether this rule is enabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * Indicates the number of days after creation when objects are deleted from Amazon S3 and Amazon
   * Glacier.
   *
   * If you specify an expiration and transition time, you must use the same
   * time unit for both properties (either in days or by date). The
   * expiration time must also be later than the transition time.
   *
   * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
   * does not represent a whole number of days will result in a runtime or deployment error.
   *
   * Default: - No expiration timeout
   */
  public fun expiration(): Duration? = unwrap(this).getExpiration()?.let(Duration::wrap)

  /**
   * Indicates when objects are deleted from Amazon S3 and Amazon Glacier.
   *
   * The date value must be in ISO 8601 format. The time is always midnight UTC.
   *
   * If you specify an expiration and transition time, you must use the same
   * time unit for both properties (either in days or by date). The
   * expiration time must also be later than the transition time.
   *
   * Default: - No expiration date
   */
  public fun expirationDate(): Instant? = unwrap(this).getExpirationDate()

  /**
   * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions.
   *
   * If set to true, the delete marker will be expired.
   *
   * Default: false
   */
  public fun expiredObjectDeleteMarker(): Boolean? = unwrap(this).getExpiredObjectDeleteMarker()

  /**
   * A unique identifier for this rule.
   *
   * The value cannot be more than 255 characters.
   */
  public fun id(): String? = unwrap(this).getId()

  /**
   * Time between when a new version of the object is uploaded to the bucket and when old versions
   * of the object expire.
   *
   * For buckets with versioning enabled (or suspended), specifies the time,
   * in days, between when a new version of the object is uploaded to the
   * bucket and when old versions of the object expire. When object versions
   * expire, Amazon S3 permanently deletes them. If you specify a transition
   * and expiration time, the expiration time must be later than the
   * transition time.
   *
   * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
   * does not represent a whole number of days will result in a runtime or deployment error.
   *
   * Default: - No noncurrent version expiration
   */
  public fun noncurrentVersionExpiration(): Duration? =
      unwrap(this).getNoncurrentVersionExpiration()?.let(Duration::wrap)

  /**
   * One or more transition rules that specify when non-current objects transition to a specified
   * storage class.
   *
   * Only for for buckets with versioning enabled (or suspended).
   *
   * If you specify a transition and expiration time, the expiration time
   * must be later than the transition time.
   */
  public fun noncurrentVersionTransitions(): List<NoncurrentVersionTransition> =
      unwrap(this).getNoncurrentVersionTransitions()?.map(NoncurrentVersionTransition::wrap) ?:
      emptyList()

  /**
   * Indicates a maximum number of noncurrent versions to retain.
   *
   * If there are this many more noncurrent versions,
   * Amazon S3 permanently deletes them.
   *
   * Default: - No noncurrent versions to retain
   */
  public fun noncurrentVersionsToRetain(): Number? = unwrap(this).getNoncurrentVersionsToRetain()

  /**
   * Specifies the minimum object size in bytes for this rule to apply to.
   *
   * Objects must be larger than this value in bytes.
   *
   * Default: - No rule
   */
  public fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

  /**
   * Specifies the maximum object size in bytes for this rule to apply to.
   *
   * Objects must be smaller than this value in bytes.
   *
   * Default: - No rule
   */
  public fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

  /**
   * Object key prefix that identifies one or more objects to which this rule applies.
   *
   * Default: - Rule applies to all objects
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * The TagFilter property type specifies tags to use to identify a subset of objects for an Amazon
   * S3 bucket.
   *
   * Default: - Rule applies to all objects
   */
  public fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

  /**
   * One or more transition rules that specify when an object transitions to a specified storage
   * class.
   *
   * If you specify an expiration and transition time, you must use the same
   * time unit for both properties (either in days or by date). The
   * expiration time must also be later than the transition time.
   *
   * Default: - No transition rules
   */
  public fun transitions(): List<Transition> = unwrap(this).getTransitions()?.map(Transition::wrap)
      ?: emptyList()

  /**
   * A builder for [LifecycleRule]
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration)

    /**
     * @param enabled Whether this rule is enabled.
     */
    public fun enabled(enabled: Boolean)

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
    public fun expiration(expiration: Duration)

    /**
     * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon Glacier.
     * The date value must be in ISO 8601 format. The time is always midnight UTC.
     *
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     */
    public fun expirationDate(expirationDate: Instant)

    /**
     * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker with
     * no noncurrent versions.
     * If set to true, the delete marker will be expired.
     */
    public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean)

    /**
     * @param id A unique identifier for this rule.
     * The value cannot be more than 255 characters.
     */
    public fun id(id: String)

    /**
     * @param noncurrentVersionExpiration Time between when a new version of the object is uploaded
     * to the bucket and when old versions of the object expire.
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
    public fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration)

    /**
     * @param noncurrentVersionTransitions One or more transition rules that specify when
     * non-current objects transition to a specified storage class.
     * Only for for buckets with versioning enabled (or suspended).
     *
     * If you specify a transition and expiration time, the expiration time
     * must be later than the transition time.
     */
    public
        fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<NoncurrentVersionTransition>)

    /**
     * @param noncurrentVersionTransitions One or more transition rules that specify when
     * non-current objects transition to a specified storage class.
     * Only for for buckets with versioning enabled (or suspended).
     *
     * If you specify a transition and expiration time, the expiration time
     * must be later than the transition time.
     */
    public fun noncurrentVersionTransitions(vararg
        noncurrentVersionTransitions: NoncurrentVersionTransition)

    /**
     * @param noncurrentVersionsToRetain Indicates a maximum number of noncurrent versions to
     * retain.
     * If there are this many more noncurrent versions,
     * Amazon S3 permanently deletes them.
     */
    public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number)

    /**
     * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to
     * apply to.
     * Objects must be larger than this value in bytes.
     */
    public fun objectSizeGreaterThan(objectSizeGreaterThan: Number)

    /**
     * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply
     * to.
     * Objects must be smaller than this value in bytes.
     */
    public fun objectSizeLessThan(objectSizeLessThan: Number)

    /**
     * @param prefix Object key prefix that identifies one or more objects to which this rule
     * applies.
     */
    public fun prefix(prefix: String)

    /**
     * @param tagFilters The TagFilter property type specifies tags to use to identify a subset of
     * objects for an Amazon S3 bucket.
     */
    public fun tagFilters(tagFilters: Map<String, Any>)

    /**
     * @param transitions One or more transition rules that specify when an object transitions to a
     * specified storage class.
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     */
    public fun transitions(transitions: List<Transition>)

    /**
     * @param transitions One or more transition rules that specify when an object transitions to a
     * specified storage class.
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     */
    public fun transitions(vararg transitions: Transition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.LifecycleRule.Builder =
        software.amazon.awscdk.services.s3.LifecycleRule.builder()

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
    override
        fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration) {
      cdkBuilder.abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter.let(Duration::unwrap))
    }

    /**
     * @param enabled Whether this rule is enabled.
     */
    override fun enabled(enabled: Boolean) {
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
    override fun expiration(expiration: Duration) {
      cdkBuilder.expiration(expiration.let(Duration::unwrap))
    }

    /**
     * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon Glacier.
     * The date value must be in ISO 8601 format. The time is always midnight UTC.
     *
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     */
    override fun expirationDate(expirationDate: Instant) {
      cdkBuilder.expirationDate(expirationDate)
    }

    /**
     * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker with
     * no noncurrent versions.
     * If set to true, the delete marker will be expired.
     */
    override fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
      cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
    }

    /**
     * @param id A unique identifier for this rule.
     * The value cannot be more than 255 characters.
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param noncurrentVersionExpiration Time between when a new version of the object is uploaded
     * to the bucket and when old versions of the object expire.
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
    override fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration) {
      cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration.let(Duration::unwrap))
    }

    /**
     * @param noncurrentVersionTransitions One or more transition rules that specify when
     * non-current objects transition to a specified storage class.
     * Only for for buckets with versioning enabled (or suspended).
     *
     * If you specify a transition and expiration time, the expiration time
     * must be later than the transition time.
     */
    override
        fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<NoncurrentVersionTransition>) {
      cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions.map(NoncurrentVersionTransition::unwrap))
    }

    /**
     * @param noncurrentVersionTransitions One or more transition rules that specify when
     * non-current objects transition to a specified storage class.
     * Only for for buckets with versioning enabled (or suspended).
     *
     * If you specify a transition and expiration time, the expiration time
     * must be later than the transition time.
     */
    override fun noncurrentVersionTransitions(vararg
        noncurrentVersionTransitions: NoncurrentVersionTransition): Unit =
        noncurrentVersionTransitions(noncurrentVersionTransitions.toList())

    /**
     * @param noncurrentVersionsToRetain Indicates a maximum number of noncurrent versions to
     * retain.
     * If there are this many more noncurrent versions,
     * Amazon S3 permanently deletes them.
     */
    override fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
      cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
    }

    /**
     * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to
     * apply to.
     * Objects must be larger than this value in bytes.
     */
    override fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
      cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
    }

    /**
     * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply
     * to.
     * Objects must be smaller than this value in bytes.
     */
    override fun objectSizeLessThan(objectSizeLessThan: Number) {
      cdkBuilder.objectSizeLessThan(objectSizeLessThan)
    }

    /**
     * @param prefix Object key prefix that identifies one or more objects to which this rule
     * applies.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param tagFilters The TagFilter property type specifies tags to use to identify a subset of
     * objects for an Amazon S3 bucket.
     */
    override fun tagFilters(tagFilters: Map<String, Any>) {
      cdkBuilder.tagFilters(tagFilters)
    }

    /**
     * @param transitions One or more transition rules that specify when an object transitions to a
     * specified storage class.
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     */
    override fun transitions(transitions: List<Transition>) {
      cdkBuilder.transitions(transitions.map(Transition::unwrap))
    }

    /**
     * @param transitions One or more transition rules that specify when an object transitions to a
     * specified storage class.
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     */
    override fun transitions(vararg transitions: Transition): Unit =
        transitions(transitions.toList())

    public fun build(): software.amazon.awscdk.services.s3.LifecycleRule = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.LifecycleRule,
  ) : LifecycleRule {
    /**
     * Specifies a lifecycle rule that aborts incomplete multipart uploads to an Amazon S3 bucket.
     *
     * The AbortIncompleteMultipartUpload property type creates a lifecycle
     * rule that aborts incomplete multipart uploads to an Amazon S3 bucket.
     * When Amazon S3 aborts a multipart upload, it deletes all parts
     * associated with the multipart upload.
     *
     * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
     * does not represent a whole number of days will result in a runtime or deployment error.
     *
     * Default: - Incomplete uploads are never aborted
     */
    override fun abortIncompleteMultipartUploadAfter(): Duration? =
        unwrap(this).getAbortIncompleteMultipartUploadAfter()?.let(Duration::wrap)

    /**
     * Whether this rule is enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Indicates the number of days after creation when objects are deleted from Amazon S3 and
     * Amazon Glacier.
     *
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     *
     * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
     * does not represent a whole number of days will result in a runtime or deployment error.
     *
     * Default: - No expiration timeout
     */
    override fun expiration(): Duration? = unwrap(this).getExpiration()?.let(Duration::wrap)

    /**
     * Indicates when objects are deleted from Amazon S3 and Amazon Glacier.
     *
     * The date value must be in ISO 8601 format. The time is always midnight UTC.
     *
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     *
     * Default: - No expiration date
     */
    override fun expirationDate(): Instant? = unwrap(this).getExpirationDate()

    /**
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions.
     *
     * If set to true, the delete marker will be expired.
     *
     * Default: false
     */
    override fun expiredObjectDeleteMarker(): Boolean? = unwrap(this).getExpiredObjectDeleteMarker()

    /**
     * A unique identifier for this rule.
     *
     * The value cannot be more than 255 characters.
     */
    override fun id(): String? = unwrap(this).getId()

    /**
     * Time between when a new version of the object is uploaded to the bucket and when old versions
     * of the object expire.
     *
     * For buckets with versioning enabled (or suspended), specifies the time,
     * in days, between when a new version of the object is uploaded to the
     * bucket and when old versions of the object expire. When object versions
     * expire, Amazon S3 permanently deletes them. If you specify a transition
     * and expiration time, the expiration time must be later than the
     * transition time.
     *
     * The underlying configuration is expressed in whole numbers of days. Providing a Duration that
     * does not represent a whole number of days will result in a runtime or deployment error.
     *
     * Default: - No noncurrent version expiration
     */
    override fun noncurrentVersionExpiration(): Duration? =
        unwrap(this).getNoncurrentVersionExpiration()?.let(Duration::wrap)

    /**
     * One or more transition rules that specify when non-current objects transition to a specified
     * storage class.
     *
     * Only for for buckets with versioning enabled (or suspended).
     *
     * If you specify a transition and expiration time, the expiration time
     * must be later than the transition time.
     */
    override fun noncurrentVersionTransitions(): List<NoncurrentVersionTransition> =
        unwrap(this).getNoncurrentVersionTransitions()?.map(NoncurrentVersionTransition::wrap) ?:
        emptyList()

    /**
     * Indicates a maximum number of noncurrent versions to retain.
     *
     * If there are this many more noncurrent versions,
     * Amazon S3 permanently deletes them.
     *
     * Default: - No noncurrent versions to retain
     */
    override fun noncurrentVersionsToRetain(): Number? =
        unwrap(this).getNoncurrentVersionsToRetain()

    /**
     * Specifies the minimum object size in bytes for this rule to apply to.
     *
     * Objects must be larger than this value in bytes.
     *
     * Default: - No rule
     */
    override fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

    /**
     * Specifies the maximum object size in bytes for this rule to apply to.
     *
     * Objects must be smaller than this value in bytes.
     *
     * Default: - No rule
     */
    override fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

    /**
     * Object key prefix that identifies one or more objects to which this rule applies.
     *
     * Default: - Rule applies to all objects
     */
    override fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The TagFilter property type specifies tags to use to identify a subset of objects for an
     * Amazon S3 bucket.
     *
     * Default: - Rule applies to all objects
     */
    override fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

    /**
     * One or more transition rules that specify when an object transitions to a specified storage
     * class.
     *
     * If you specify an expiration and transition time, you must use the same
     * time unit for both properties (either in days or by date). The
     * expiration time must also be later than the transition time.
     *
     * Default: - No transition rules
     */
    override fun transitions(): List<Transition> =
        unwrap(this).getTransitions()?.map(Transition::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.LifecycleRule): LifecycleRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LifecycleRule): software.amazon.awscdk.services.s3.LifecycleRule =
        (wrapped as Wrapper).cdkObject
  }
}
