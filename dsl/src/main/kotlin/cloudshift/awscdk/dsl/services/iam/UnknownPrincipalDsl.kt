@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.UnknownPrincipal
import software.constructs.IConstruct

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
