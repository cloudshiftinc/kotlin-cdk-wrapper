@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.constructs.Construct

@CdkDslMarker
public class CfnWebhookDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWebhook.Builder = CfnWebhook.Builder.create(scope, id)

  private val _filters: MutableList<Any> = mutableListOf()

  public fun authentication(authentication: String) {
    cdkBuilder.authentication(authentication)
  }

  public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
    cdkBuilder.authenticationConfiguration(authenticationConfiguration)
  }

  public
      fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty) {
    cdkBuilder.authenticationConfiguration(authenticationConfiguration)
  }

  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun registerWithThirdParty(registerWithThirdParty: Boolean) {
    cdkBuilder.registerWithThirdParty(registerWithThirdParty)
  }

  public fun registerWithThirdParty(registerWithThirdParty: IResolvable) {
    cdkBuilder.registerWithThirdParty(registerWithThirdParty)
  }

  public fun targetAction(targetAction: String) {
    cdkBuilder.targetAction(targetAction)
  }

  public fun targetPipeline(targetPipeline: String) {
    cdkBuilder.targetPipeline(targetPipeline)
  }

  public fun targetPipelineVersion(targetPipelineVersion: Number) {
    cdkBuilder.targetPipelineVersion(targetPipelineVersion)
  }

  public fun build(): CfnWebhook {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
