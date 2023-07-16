@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.GrpcRetryEvent
import software.amazon.awscdk.services.appmesh.GrpcRetryPolicy
import software.amazon.awscdk.services.appmesh.HttpRetryEvent
import software.amazon.awscdk.services.appmesh.TcpRetryEvent

@CdkDslMarker
public class GrpcRetryPolicyDsl {
  private val cdkBuilder: GrpcRetryPolicy.Builder = GrpcRetryPolicy.builder()

  private val _grpcRetryEvents: MutableList<GrpcRetryEvent> = mutableListOf()

  private val _httpRetryEvents: MutableList<HttpRetryEvent> = mutableListOf()

  private val _tcpRetryEvents: MutableList<TcpRetryEvent> = mutableListOf()

  public fun grpcRetryEvents(vararg grpcRetryEvents: GrpcRetryEvent) {
    _grpcRetryEvents.addAll(listOf(*grpcRetryEvents))
  }

  public fun grpcRetryEvents(grpcRetryEvents: Collection<GrpcRetryEvent>) {
    _grpcRetryEvents.addAll(grpcRetryEvents)
  }

  public fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent) {
    _httpRetryEvents.addAll(listOf(*httpRetryEvents))
  }

  public fun httpRetryEvents(httpRetryEvents: Collection<HttpRetryEvent>) {
    _httpRetryEvents.addAll(httpRetryEvents)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun retryTimeout(retryTimeout: Duration) {
    cdkBuilder.retryTimeout(retryTimeout)
  }

  public fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent) {
    _tcpRetryEvents.addAll(listOf(*tcpRetryEvents))
  }

  public fun tcpRetryEvents(tcpRetryEvents: Collection<TcpRetryEvent>) {
    _tcpRetryEvents.addAll(tcpRetryEvents)
  }

  public fun build(): GrpcRetryPolicy {
    if(_grpcRetryEvents.isNotEmpty()) cdkBuilder.grpcRetryEvents(_grpcRetryEvents)
    if(_httpRetryEvents.isNotEmpty()) cdkBuilder.httpRetryEvents(_httpRetryEvents)
    if(_tcpRetryEvents.isNotEmpty()) cdkBuilder.tcpRetryEvents(_tcpRetryEvents)
    return cdkBuilder.build()
  }
}
