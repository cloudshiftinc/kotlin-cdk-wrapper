@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.UnknownPrincipal
import software.constructs.IConstruct

/**
 * A principal for use in resources that need to have a role but it's unknown.
 *
 * Some resources have roles associated with them which they assume, such as
 * Lambda Functions, CodeBuild projects, StepFunctions machines, etc.
 *
 * When those resources are imported, their actual roles are not always
 * imported with them. When that happens, we use an instance of this class
 * instead, which will add user warnings when statements are attempted to be
 * added to it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.constructs.*;
 * Construct construct;
 * UnknownPrincipal unknownPrincipal = UnknownPrincipal.Builder.create()
 * .resource(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class UnknownPrincipalDsl {
  private val cdkBuilder: UnknownPrincipal.Builder = UnknownPrincipal.Builder.create()

  /**
   * The resource the role proxy is for.
   *
   * @param resource The resource the role proxy is for. 
   */
  public fun resource(resource: IConstruct) {
    cdkBuilder.resource(resource)
  }

  public fun build(): UnknownPrincipal = cdkBuilder.build()
}
