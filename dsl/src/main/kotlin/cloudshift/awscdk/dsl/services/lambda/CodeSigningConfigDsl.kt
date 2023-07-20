@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CodeSigningConfig
import software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment
import software.amazon.awscdk.services.signer.ISigningProfile
import software.constructs.Construct

@CdkDslMarker
public class CodeSigningConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CodeSigningConfig.Builder = CodeSigningConfig.Builder.create(scope, id)

  private val _signingProfiles: MutableList<ISigningProfile> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun signingProfiles(vararg signingProfiles: ISigningProfile) {
    _signingProfiles.addAll(listOf(*signingProfiles))
  }

  public fun signingProfiles(signingProfiles: Collection<ISigningProfile>) {
    _signingProfiles.addAll(signingProfiles)
  }

  public
      fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment) {
    cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
  }

  public fun build(): CodeSigningConfig {
    if(_signingProfiles.isNotEmpty()) cdkBuilder.signingProfiles(_signingProfiles)
    return cdkBuilder.build()
  }
}
