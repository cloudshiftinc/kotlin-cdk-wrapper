@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnApp
import software.constructs.Construct

@CdkDslMarker
public class CfnAppDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApp.Builder = CfnApp.Builder.create(scope, id)

  private val _resourceMappings: MutableList<Any> = mutableListOf()

  public fun appAssessmentSchedule(appAssessmentSchedule: String) {
    cdkBuilder.appAssessmentSchedule(appAssessmentSchedule)
  }

  public fun appTemplateBody(appTemplateBody: String) {
    cdkBuilder.appTemplateBody(appTemplateBody)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resiliencyPolicyArn(resiliencyPolicyArn: String) {
    cdkBuilder.resiliencyPolicyArn(resiliencyPolicyArn)
  }

  public fun resourceMappings(vararg resourceMappings: Any) {
    _resourceMappings.addAll(listOf(*resourceMappings))
  }

  public fun resourceMappings(resourceMappings: Collection<Any>) {
    _resourceMappings.addAll(resourceMappings)
  }

  public fun resourceMappings(resourceMappings: IResolvable) {
    cdkBuilder.resourceMappings(resourceMappings)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnApp {
    if(_resourceMappings.isNotEmpty()) cdkBuilder.resourceMappings(_resourceMappings)
    return cdkBuilder.build()
  }
}
