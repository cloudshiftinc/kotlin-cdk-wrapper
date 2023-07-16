@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import java.time.Instant
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

@CdkDslMarker
public class LifecycleRuleDsl {
  private val cdkBuilder: LifecycleRule.Builder = LifecycleRule.builder()

  private val _noncurrentVersionTransitions: MutableList<NoncurrentVersionTransition> =
      mutableListOf()

  private val _transitions: MutableList<Transition> = mutableListOf()

  public fun abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter: Duration) {
    cdkBuilder.abortIncompleteMultipartUploadAfter(abortIncompleteMultipartUploadAfter)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun expiration(expiration: Duration) {
    cdkBuilder.expiration(expiration)
  }

  public fun expirationDate(expirationDate: Instant) {
    cdkBuilder.expirationDate(expirationDate)
  }

  public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
    cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun noncurrentVersionExpiration(noncurrentVersionExpiration: Duration) {
    cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration)
  }

  public
      fun noncurrentVersionTransitions(noncurrentVersionTransitions: NoncurrentVersionTransitionDsl.() -> Unit) {
    _noncurrentVersionTransitions.add(NoncurrentVersionTransitionDsl().apply(noncurrentVersionTransitions).build())
  }

  public
      fun noncurrentVersionTransitions(noncurrentVersionTransitions: Collection<NoncurrentVersionTransition>) {
    _noncurrentVersionTransitions.addAll(noncurrentVersionTransitions)
  }

  public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
    cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
  }

  public fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
    cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
  }

  public fun objectSizeLessThan(objectSizeLessThan: Number) {
    cdkBuilder.objectSizeLessThan(objectSizeLessThan)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun tagFilters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tagFilters(builder.map)
  }

  public fun tagFilters(tagFilters: Map<String, *>) {
    cdkBuilder.tagFilters(tagFilters)
  }

  public fun transitions(transitions: TransitionDsl.() -> Unit) {
    _transitions.add(TransitionDsl().apply(transitions).build())
  }

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
