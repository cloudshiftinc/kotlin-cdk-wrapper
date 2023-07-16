@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.signer.CfnSigningProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnSigningProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSigningProfile.Builder = CfnSigningProfile.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun platformId(platformId: String) {
    cdkBuilder.platformId(platformId)
  }

  public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
    cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
  }

  public
      fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty) {
    cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSigningProfile {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
