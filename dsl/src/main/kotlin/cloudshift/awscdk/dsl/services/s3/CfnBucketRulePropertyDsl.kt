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

  public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  public
      fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: CfnBucket.AbortIncompleteMultipartUploadProperty) {
    cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload)
  }

  public fun expirationDate(expirationDate: Instant) {
    cdkBuilder.expirationDate(expirationDate)
  }

  public fun expirationDate(expirationDate: IResolvable) {
    cdkBuilder.expirationDate(expirationDate)
  }

  public fun expirationInDays(expirationInDays: Number) {
    cdkBuilder.expirationInDays(expirationInDays)
  }

  public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
    cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
  }

  public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: IResolvable) {
    cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun noncurrentVersionExpiration(noncurrentVersionExpiration: IResolvable) {
    cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration)
  }

  public
      fun noncurrentVersionExpiration(noncurrentVersionExpiration: CfnBucket.NoncurrentVersionExpirationProperty) {
    cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration)
  }

  public fun noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays: Number) {
    cdkBuilder.noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays)
  }

  public fun noncurrentVersionTransition(noncurrentVersionTransition: IResolvable) {
    cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition)
  }

  public
      fun noncurrentVersionTransition(noncurrentVersionTransition: CfnBucket.NoncurrentVersionTransitionProperty) {
    cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition)
  }

  public fun noncurrentVersionTransitions(vararg noncurrentVersionTransitions: Any) {
    _noncurrentVersionTransitions.addAll(listOf(*noncurrentVersionTransitions))
  }

  public fun noncurrentVersionTransitions(noncurrentVersionTransitions: Collection<Any>) {
    _noncurrentVersionTransitions.addAll(noncurrentVersionTransitions)
  }

  public fun noncurrentVersionTransitions(noncurrentVersionTransitions: IResolvable) {
    cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions)
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

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tagFilters(vararg tagFilters: Any) {
    _tagFilters.addAll(listOf(*tagFilters))
  }

  public fun tagFilters(tagFilters: Collection<Any>) {
    _tagFilters.addAll(tagFilters)
  }

  public fun tagFilters(tagFilters: IResolvable) {
    cdkBuilder.tagFilters(tagFilters)
  }

  public fun transition(transition: IResolvable) {
    cdkBuilder.transition(transition)
  }

  public fun transition(transition: CfnBucket.TransitionProperty) {
    cdkBuilder.transition(transition)
  }

  public fun transitions(vararg transitions: Any) {
    _transitions.addAll(listOf(*transitions))
  }

  public fun transitions(transitions: Collection<Any>) {
    _transitions.addAll(transitions)
  }

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
