@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnApp
import software.constructs.Construct

@CdkDslMarker
public class CfnAppDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApp.Builder = CfnApp.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun appName(appName: String) {
    cdkBuilder.appName(appName)
  }

  public fun appType(appType: String) {
    cdkBuilder.appType(appType)
  }

  public fun domainId(domainId: String) {
    cdkBuilder.domainId(domainId)
  }

  public fun resourceSpec(resourceSpec: IResolvable) {
    cdkBuilder.resourceSpec(resourceSpec)
  }

  public fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty) {
    cdkBuilder.resourceSpec(resourceSpec)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun userProfileName(userProfileName: String) {
    cdkBuilder.userProfileName(userProfileName)
  }

  public fun build(): CfnApp {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
