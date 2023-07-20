@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps

@CdkDslMarker
public class CfnSecurityConfigPropsDsl {
  private val cdkBuilder: CfnSecurityConfigProps.Builder = CfnSecurityConfigProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun samlOptions(samlOptions: IResolvable) {
    cdkBuilder.samlOptions(samlOptions)
  }

  public fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty) {
    cdkBuilder.samlOptions(samlOptions)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSecurityConfigProps = cdkBuilder.build()
}
