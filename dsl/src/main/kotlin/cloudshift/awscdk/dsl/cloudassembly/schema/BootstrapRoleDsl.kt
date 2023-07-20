@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole

@CdkDslMarker
public class BootstrapRoleDsl {
  private val cdkBuilder: BootstrapRole.Builder = BootstrapRole.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
    cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
  }

  public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
    cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
  }

  public fun build(): BootstrapRole = cdkBuilder.build()
}
