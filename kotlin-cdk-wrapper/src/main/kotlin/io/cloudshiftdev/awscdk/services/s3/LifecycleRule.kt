@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration)

    public fun enabled(enabled: Boolean)

    public fun expiration(expiration: Duration)

    public fun expirationDate(expirationDate: Instant)

    public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean)

    public fun id(id: String)

    public fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration)

    public
        fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<NoncurrentVersionTransition>)

    public fun noncurrentVersionTransitions(vararg
        noncurrentVersionTransitions: NoncurrentVersionTransition)

    public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number)

    public fun objectSizeGreaterThan(objectSizeGreaterThan: Number)

    public fun objectSizeLessThan(objectSizeLessThan: Number)

    public fun prefix(prefix: String)

    public fun tagFilters(tagFilters: Map<String, Any>)

    public fun transitions(transitions: List<Transition>)

    public fun transitions(vararg transitions: Transition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.LifecycleRule.Builder =
        software.amazon.awscdk.services.s3.LifecycleRule.builder()

    override
        fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration) {
      cdkBuilder.abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter.let(Duration::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun expiration(expiration: Duration) {
      cdkBuilder.expiration(expiration.let(Duration::unwrap))
    }

    override fun expirationDate(expirationDate: Instant) {
      cdkBuilder.expirationDate(expirationDate)
    }

    override fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
      cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
    }

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration) {
      cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration.let(Duration::unwrap))
    }

    override
        fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<NoncurrentVersionTransition>) {
      cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions.map(NoncurrentVersionTransition::unwrap))
    }

    override fun noncurrentVersionTransitions(vararg
        noncurrentVersionTransitions: NoncurrentVersionTransition): Unit =
        noncurrentVersionTransitions(noncurrentVersionTransitions.toList())

    override fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
      cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
    }

    override fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
      cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
    }

    override fun objectSizeLessThan(objectSizeLessThan: Number) {
      cdkBuilder.objectSizeLessThan(objectSizeLessThan)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    override fun tagFilters(tagFilters: Map<String, Any>) {
      cdkBuilder.tagFilters(tagFilters)
    }

    override fun transitions(transitions: List<Transition>) {
      cdkBuilder.transitions(transitions.map(Transition::unwrap))
    }

    override fun transitions(vararg transitions: Transition): Unit =
        transitions(transitions.toList())

    public fun build(): software.amazon.awscdk.services.s3.LifecycleRule = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.LifecycleRule,
  ) : CdkObject(cdkObject), LifecycleRule {
    override fun abortIncompleteMultipartUploadAfter(): Duration? =
        unwrap(this).getAbortIncompleteMultipartUploadAfter()?.let(Duration::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun expiration(): Duration? = unwrap(this).getExpiration()?.let(Duration::wrap)

    override fun expirationDate(): Instant? = unwrap(this).getExpirationDate()

    override fun expiredObjectDeleteMarker(): Boolean? = unwrap(this).getExpiredObjectDeleteMarker()

    override fun id(): String? = unwrap(this).getId()

    override fun noncurrentVersionExpiration(): Duration? =
        unwrap(this).getNoncurrentVersionExpiration()?.let(Duration::wrap)

    override fun noncurrentVersionTransitions(): List<NoncurrentVersionTransition> =
        unwrap(this).getNoncurrentVersionTransitions()?.map(NoncurrentVersionTransition::wrap) ?:
        emptyList()

    override fun noncurrentVersionsToRetain(): Number? =
        unwrap(this).getNoncurrentVersionsToRetain()

    override fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

    override fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

    override fun prefix(): String? = unwrap(this).getPrefix()

    override fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

    override fun transitions(): List<Transition> =
        unwrap(this).getTransitions()?.map(Transition::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.LifecycleRule): LifecycleRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LifecycleRule): software.amazon.awscdk.services.s3.LifecycleRule =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.LifecycleRule
  }
}
