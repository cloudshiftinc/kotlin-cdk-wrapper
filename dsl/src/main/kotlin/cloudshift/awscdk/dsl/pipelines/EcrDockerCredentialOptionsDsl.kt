@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.DockerCredentialUsage
import software.amazon.awscdk.pipelines.EcrDockerCredentialOptions
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class EcrDockerCredentialOptionsDsl {
  private val cdkBuilder: EcrDockerCredentialOptions.Builder = EcrDockerCredentialOptions.builder()

  private val _usages: MutableList<DockerCredentialUsage> = mutableListOf()

  public fun assumeRole(assumeRole: IRole) {
    cdkBuilder.assumeRole(assumeRole)
  }

  public fun usages(vararg usages: DockerCredentialUsage) {
    _usages.addAll(listOf(*usages))
  }

  public fun usages(usages: Collection<DockerCredentialUsage>) {
    _usages.addAll(usages)
  }

  public fun build(): EcrDockerCredentialOptions {
    if(_usages.isNotEmpty()) cdkBuilder.usages(_usages)
    return cdkBuilder.build()
  }
}
