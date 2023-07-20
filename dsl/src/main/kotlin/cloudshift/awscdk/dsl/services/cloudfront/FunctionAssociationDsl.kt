@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.FunctionAssociation
import software.amazon.awscdk.services.cloudfront.FunctionEventType
import software.amazon.awscdk.services.cloudfront.IFunction

@CdkDslMarker
public class FunctionAssociationDsl {
  private val cdkBuilder: FunctionAssociation.Builder = FunctionAssociation.builder()

  public fun eventType(eventType: FunctionEventType) {
    cdkBuilder.eventType(eventType)
  }

  public fun function(function: IFunction) {
    cdkBuilder.function(function)
  }

  public fun build(): FunctionAssociation = cdkBuilder.build()
}
