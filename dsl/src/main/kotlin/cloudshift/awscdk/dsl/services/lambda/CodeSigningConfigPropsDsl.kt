@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CodeSigningConfigProps
import software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment
import software.amazon.awscdk.services.signer.ISigningProfile

@CdkDslMarker
public class CodeSigningConfigPropsDsl {
  private val cdkBuilder: CodeSigningConfigProps.Builder = CodeSigningConfigProps.builder()

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

  public fun build(): CodeSigningConfigProps {
    if(_signingProfiles.isNotEmpty()) cdkBuilder.signingProfiles(_signingProfiles)
    return cdkBuilder.build()
  }
}
