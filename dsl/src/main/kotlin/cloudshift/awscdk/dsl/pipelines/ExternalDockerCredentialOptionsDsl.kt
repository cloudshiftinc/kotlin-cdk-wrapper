@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.DockerCredentialUsage
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ExternalDockerCredentialOptionsDsl {
  private val cdkBuilder: ExternalDockerCredentialOptions.Builder =
      ExternalDockerCredentialOptions.builder()

  private val _usages: MutableList<DockerCredentialUsage> = mutableListOf()

  public fun assumeRole(assumeRole: IRole) {
    cdkBuilder.assumeRole(assumeRole)
  }

  public fun secretPasswordField(secretPasswordField: String) {
    cdkBuilder.secretPasswordField(secretPasswordField)
  }

  public fun secretUsernameField(secretUsernameField: String) {
    cdkBuilder.secretUsernameField(secretUsernameField)
  }

  public fun usages(vararg usages: DockerCredentialUsage) {
    _usages.addAll(listOf(*usages))
  }

  public fun usages(usages: Collection<DockerCredentialUsage>) {
    _usages.addAll(usages)
  }

  public fun build(): ExternalDockerCredentialOptions {
    if(_usages.isNotEmpty()) cdkBuilder.usages(_usages)
    return cdkBuilder.build()
  }
}
