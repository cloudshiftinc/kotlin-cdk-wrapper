@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.customerprofiles.CfnDomain
import software.constructs.Construct

@CdkDslMarker
public class CfnDomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
    cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
  }

  public fun defaultEncryptionKey(defaultEncryptionKey: String) {
    cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
  }

  public fun defaultExpirationDays(defaultExpirationDays: Number) {
    cdkBuilder.defaultExpirationDays(defaultExpirationDays)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDomain {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
