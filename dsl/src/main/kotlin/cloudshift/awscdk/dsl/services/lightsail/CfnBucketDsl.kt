@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.constructs.Construct

@CdkDslMarker
public class CfnBucketDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBucket.Builder = CfnBucket.Builder.create(scope, id)

  private val _readOnlyAccessAccounts: MutableList<String> = mutableListOf()

  private val _resourcesReceivingAccess: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessRules(accessRules: IResolvable) {
    cdkBuilder.accessRules(accessRules)
  }

  public fun accessRules(accessRules: CfnBucket.AccessRulesProperty) {
    cdkBuilder.accessRules(accessRules)
  }

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun bundleId(bundleId: String) {
    cdkBuilder.bundleId(bundleId)
  }

  public fun objectVersioning(objectVersioning: Boolean) {
    cdkBuilder.objectVersioning(objectVersioning)
  }

  public fun objectVersioning(objectVersioning: IResolvable) {
    cdkBuilder.objectVersioning(objectVersioning)
  }

  public fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String) {
    _readOnlyAccessAccounts.addAll(listOf(*readOnlyAccessAccounts))
  }

  public fun readOnlyAccessAccounts(readOnlyAccessAccounts: Collection<String>) {
    _readOnlyAccessAccounts.addAll(readOnlyAccessAccounts)
  }

  public fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String) {
    _resourcesReceivingAccess.addAll(listOf(*resourcesReceivingAccess))
  }

  public fun resourcesReceivingAccess(resourcesReceivingAccess: Collection<String>) {
    _resourcesReceivingAccess.addAll(resourcesReceivingAccess)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnBucket {
    if(_readOnlyAccessAccounts.isNotEmpty())
        cdkBuilder.readOnlyAccessAccounts(_readOnlyAccessAccounts)
    if(_resourcesReceivingAccess.isNotEmpty())
        cdkBuilder.resourcesReceivingAccess(_resourcesReceivingAccess)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
