package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LifecycleRule {
  public fun abortIncompleteMultipartUploadAfter(): Duration? =
      unwrap(this).getAbortIncompleteMultipartUploadAfter()?.let(Duration::wrap)

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun expiration(): Duration? = unwrap(this).getExpiration()?.let(Duration::wrap)

  public fun expirationDate(): Instant? = unwrap(this).getExpirationDate()

  public fun expiredObjectDeleteMarker(): Boolean? = unwrap(this).getExpiredObjectDeleteMarker()

  public fun id(): String? = unwrap(this).getId()

  public fun noncurrentVersionExpiration(): Duration? =
      unwrap(this).getNoncurrentVersionExpiration()?.let(Duration::wrap)

  public fun noncurrentVersionTransitions(): List<NoncurrentVersionTransition> =
      unwrap(this).getNoncurrentVersionTransitions()?.map(NoncurrentVersionTransition::wrap) ?:
      emptyList()

  public fun noncurrentVersionsToRetain(): Number? = unwrap(this).getNoncurrentVersionsToRetain()

  public fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

  public fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

  public fun prefix(): String? = unwrap(this).getPrefix()

  public fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

  public fun transitions(): List<Transition> = unwrap(this).getTransitions()?.map(Transition::wrap)
      ?: emptyList()

  public interface Builder {
    public fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun expiration(expiration: Duration) {
    }

    public fun expirationDate(expirationDate: Instant) {
    }

    public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
    }

    public fun id(id: String) {
    }

    public fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration) {
    }

    public
        fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<NoncurrentVersionTransition>) {
    }

    public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
    }

    public fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
    }

    public fun objectSizeLessThan(objectSizeLessThan: Number) {
    }

    public fun prefix(prefix: String) {
    }

    public fun tagFilters(tagFilters: Map<String, Any>) {
    }

    public fun transitions(transitions: List<Transition>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.LifecycleRule.Builder =
        software.amazon.awscdk.services.s3.LifecycleRule.builder()

    public override
        fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration) {
      cdkBuilder.abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter.let(Duration::unwrap))
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun expiration(expiration: Duration) {
      cdkBuilder.expiration(expiration.let(Duration::unwrap))
    }

    public override fun expirationDate(expirationDate: Instant) {
      cdkBuilder.expirationDate(expirationDate)
    }

    public override fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
      cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
    }

    public override fun id(id: String) {
      cdkBuilder.id(id)
    }

    public override fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration) {
      cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration.let(Duration::unwrap))
    }

    public override
        fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<NoncurrentVersionTransition>) {
      cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions.map(NoncurrentVersionTransition::unwrap))
    }

    public override fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
      cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
    }

    public override fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
      cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
    }

    public override fun objectSizeLessThan(objectSizeLessThan: Number) {
      cdkBuilder.objectSizeLessThan(objectSizeLessThan)
    }

    public override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public override fun tagFilters(tagFilters: Map<String, Any>) {
      cdkBuilder.tagFilters(tagFilters)
    }

    public override fun transitions(transitions: List<Transition>) {
      cdkBuilder.transitions(transitions.map(Transition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.LifecycleRule = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.LifecycleRule,
  ) : LifecycleRule {
    public override fun abortIncompleteMultipartUploadAfter(): Duration? =
        unwrap(this).getAbortIncompleteMultipartUploadAfter()?.let(Duration::wrap)

    public override fun enabled(): Boolean? = unwrap(this).getEnabled()

    public override fun expiration(): Duration? = unwrap(this).getExpiration()?.let(Duration::wrap)

    public override fun expirationDate(): Instant? = unwrap(this).getExpirationDate()

    public override fun expiredObjectDeleteMarker(): Boolean? =
        unwrap(this).getExpiredObjectDeleteMarker()

    public override fun id(): String? = unwrap(this).getId()

    public override fun noncurrentVersionExpiration(): Duration? =
        unwrap(this).getNoncurrentVersionExpiration()?.let(Duration::wrap)

    public override fun noncurrentVersionTransitions(): List<NoncurrentVersionTransition> =
        unwrap(this).getNoncurrentVersionTransitions()?.map(NoncurrentVersionTransition::wrap) ?:
        emptyList()

    public override fun noncurrentVersionsToRetain(): Number? =
        unwrap(this).getNoncurrentVersionsToRetain()

    public override fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

    public override fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

    public override fun prefix(): String? = unwrap(this).getPrefix()

    public override fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

    public override fun transitions(): List<Transition> =
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
