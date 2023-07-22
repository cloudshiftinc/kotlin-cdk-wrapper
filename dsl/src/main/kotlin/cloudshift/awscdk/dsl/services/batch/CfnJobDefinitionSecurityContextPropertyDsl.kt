@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * SecurityContextProperty securityContextProperty = SecurityContextProperty.builder()
 * .privileged(false)
 * .readOnlyRootFilesystem(false)
 * .runAsGroup(123)
 * .runAsNonRoot(false)
 * .runAsUser(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-securitycontext.html)
 */
@CdkDslMarker
public class CfnJobDefinitionSecurityContextPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.SecurityContextProperty.Builder =
      CfnJobDefinition.SecurityContextProperty.builder()

  /**
   * @param privileged the value to be set.
   */
  public fun privileged(privileged: Boolean) {
    cdkBuilder.privileged(privileged)
  }

  /**
   * @param privileged the value to be set.
   */
  public fun privileged(privileged: IResolvable) {
    cdkBuilder.privileged(privileged)
  }

  /**
   * @param readOnlyRootFilesystem the value to be set.
   */
  public fun readOnlyRootFilesystem(readOnlyRootFilesystem: Boolean) {
    cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem)
  }

  /**
   * @param readOnlyRootFilesystem the value to be set.
   */
  public fun readOnlyRootFilesystem(readOnlyRootFilesystem: IResolvable) {
    cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem)
  }

  /**
   * @param runAsGroup the value to be set.
   */
  public fun runAsGroup(runAsGroup: Number) {
    cdkBuilder.runAsGroup(runAsGroup)
  }

  /**
   * @param runAsNonRoot the value to be set.
   */
  public fun runAsNonRoot(runAsNonRoot: Boolean) {
    cdkBuilder.runAsNonRoot(runAsNonRoot)
  }

  /**
   * @param runAsNonRoot the value to be set.
   */
  public fun runAsNonRoot(runAsNonRoot: IResolvable) {
    cdkBuilder.runAsNonRoot(runAsNonRoot)
  }

  /**
   * @param runAsUser the value to be set.
   */
  public fun runAsUser(runAsUser: Number) {
    cdkBuilder.runAsUser(runAsUser)
  }

  public fun build(): CfnJobDefinition.SecurityContextProperty = cdkBuilder.build()
}
