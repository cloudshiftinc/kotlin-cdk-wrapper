@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnCertificate
import software.constructs.Construct

@CdkDslMarker
public class CfnCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCertificate.Builder = CfnCertificate.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun activeDate(activeDate: String) {
    cdkBuilder.activeDate(activeDate)
  }

  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun inactiveDate(inactiveDate: String) {
    cdkBuilder.inactiveDate(inactiveDate)
  }

  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun usage(usage: String) {
    cdkBuilder.usage(usage)
  }

  public fun build(): CfnCertificate {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
