@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps

@CdkDslMarker
public class CfnAccessPointPropsDsl {
  private val cdkBuilder: CfnAccessPointProps.Builder = CfnAccessPointProps.builder()

  /**
   * @param name The name of this access point.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
   * Point. 
   */
  public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
    cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
  }

  /**
   * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
   * Point. 
   */
  public
      fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty) {
    cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
  }

  public fun build(): CfnAccessPointProps = cdkBuilder.build()
}
