@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectEnvironmentPropertyDsl {
  private val cdkBuilder: CfnProject.EnvironmentProperty.Builder =
      CfnProject.EnvironmentProperty.builder()

  private val _environmentVariables: MutableList<Any> = mutableListOf()

  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  public fun computeType(computeType: String) {
    cdkBuilder.computeType(computeType)
  }

  public fun environmentVariables(vararg environmentVariables: Any) {
    _environmentVariables.addAll(listOf(*environmentVariables))
  }

  public fun environmentVariables(environmentVariables: Collection<Any>) {
    _environmentVariables.addAll(environmentVariables)
  }

  public fun environmentVariables(environmentVariables: IResolvable) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  public fun imagePullCredentialsType(imagePullCredentialsType: String) {
    cdkBuilder.imagePullCredentialsType(imagePullCredentialsType)
  }

  public fun privilegedMode(privilegedMode: Boolean) {
    cdkBuilder.privilegedMode(privilegedMode)
  }

  public fun privilegedMode(privilegedMode: IResolvable) {
    cdkBuilder.privilegedMode(privilegedMode)
  }

  public fun registryCredential(registryCredential: IResolvable) {
    cdkBuilder.registryCredential(registryCredential)
  }

  public fun registryCredential(registryCredential: CfnProject.RegistryCredentialProperty) {
    cdkBuilder.registryCredential(registryCredential)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnProject.EnvironmentProperty {
    if(_environmentVariables.isNotEmpty()) cdkBuilder.environmentVariables(_environmentVariables)
    return cdkBuilder.build()
  }
}
