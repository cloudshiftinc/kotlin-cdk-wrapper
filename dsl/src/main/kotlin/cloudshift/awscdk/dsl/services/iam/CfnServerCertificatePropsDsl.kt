@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iam.CfnServerCertificateProps

@CdkDslMarker
public class CfnServerCertificatePropsDsl {
  private val cdkBuilder: CfnServerCertificateProps.Builder = CfnServerCertificateProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun certificateBody(certificateBody: String) {
    cdkBuilder.certificateBody(certificateBody)
  }

  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun serverCertificateName(serverCertificateName: String) {
    cdkBuilder.serverCertificateName(serverCertificateName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnServerCertificateProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
