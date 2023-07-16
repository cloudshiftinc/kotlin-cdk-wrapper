@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.AliasOptions
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.VersionWeight

@CdkDslMarker
public class AliasOptionsDsl {
  private val cdkBuilder: AliasOptions.Builder = AliasOptions.builder()

  private val _additionalVersions: MutableList<VersionWeight> = mutableListOf()

  public fun additionalVersions(additionalVersions: VersionWeightDsl.() -> Unit) {
    _additionalVersions.add(VersionWeightDsl().apply(additionalVersions).build())
  }

  public fun additionalVersions(additionalVersions: Collection<VersionWeight>) {
    _additionalVersions.addAll(additionalVersions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun onFailure(onFailure: IDestination) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun onSuccess(onSuccess: IDestination) {
    cdkBuilder.onSuccess(onSuccess)
  }

  public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
    cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): AliasOptions {
    if(_additionalVersions.isNotEmpty()) cdkBuilder.additionalVersions(_additionalVersions)
    return cdkBuilder.build()
  }
}
