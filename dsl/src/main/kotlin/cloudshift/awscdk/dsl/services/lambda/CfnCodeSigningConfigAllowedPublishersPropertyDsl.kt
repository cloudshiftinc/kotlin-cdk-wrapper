@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig

@CdkDslMarker
public class CfnCodeSigningConfigAllowedPublishersPropertyDsl {
  private val cdkBuilder: CfnCodeSigningConfig.AllowedPublishersProperty.Builder =
      CfnCodeSigningConfig.AllowedPublishersProperty.builder()

  private val _signingProfileVersionArns: MutableList<String> = mutableListOf()

  /**
   * @param signingProfileVersionArns The Amazon Resource Name (ARN) for each of the signing
   * profiles. 
   * A signing profile defines a trusted user who can sign a code package.
   */
  public fun signingProfileVersionArns(vararg signingProfileVersionArns: String) {
    _signingProfileVersionArns.addAll(listOf(*signingProfileVersionArns))
  }

  /**
   * @param signingProfileVersionArns The Amazon Resource Name (ARN) for each of the signing
   * profiles. 
   * A signing profile defines a trusted user who can sign a code package.
   */
  public fun signingProfileVersionArns(signingProfileVersionArns: Collection<String>) {
    _signingProfileVersionArns.addAll(signingProfileVersionArns)
  }

  public fun build(): CfnCodeSigningConfig.AllowedPublishersProperty {
    if(_signingProfileVersionArns.isNotEmpty())
        cdkBuilder.signingProfileVersionArns(_signingProfileVersionArns)
    return cdkBuilder.build()
  }
}
