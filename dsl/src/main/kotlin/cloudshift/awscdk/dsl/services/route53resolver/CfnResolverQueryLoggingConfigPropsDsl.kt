@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps

@CdkDslMarker
public class CfnResolverQueryLoggingConfigPropsDsl {
  private val cdkBuilder: CfnResolverQueryLoggingConfigProps.Builder =
      CfnResolverQueryLoggingConfigProps.builder()

  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnResolverQueryLoggingConfigProps = cdkBuilder.build()
}
