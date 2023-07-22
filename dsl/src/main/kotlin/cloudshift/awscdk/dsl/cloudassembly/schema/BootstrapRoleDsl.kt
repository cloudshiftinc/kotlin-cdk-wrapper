@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole

/**
 * Information needed to access an IAM role created as part of the bootstrap process.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * BootstrapRole bootstrapRole = BootstrapRole.builder()
 * .arn("arn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class BootstrapRoleDsl {
  private val cdkBuilder: BootstrapRole.Builder = BootstrapRole.builder()

  /**
   * @param arn The ARN of the IAM role created as part of bootrapping e.g. lookupRoleArn. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param assumeRoleExternalId External ID to use when assuming the bootstrap role.
   */
  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  /**
   * @param bootstrapStackVersionSsmParameter Name of SSM parameter with bootstrap stack version.
   */
  public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
    cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
  }

  /**
   * @param requiresBootstrapStackVersion Version of bootstrap stack required to use this role.
   */
  public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
    cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
  }

  public fun build(): BootstrapRole = cdkBuilder.build()
}
