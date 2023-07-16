@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.SamlMetadataDocument
import software.amazon.awscdk.services.iam.SamlProvider
import software.constructs.Construct

@CdkDslMarker
public class SamlProviderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SamlProvider.Builder = SamlProvider.Builder.create(scope, id)

  public fun metadataDocument(metadataDocument: SamlMetadataDocument) {
    cdkBuilder.metadataDocument(metadataDocument)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): SamlProvider = cdkBuilder.build()
}
