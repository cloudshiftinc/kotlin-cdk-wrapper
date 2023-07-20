@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties

@CdkDslMarker
public class AwsCloudFormationStackPropertiesDsl {
  private val cdkBuilder: AwsCloudFormationStackProperties.Builder =
      AwsCloudFormationStackProperties.builder()

  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  public fun templateFile(templateFile: String) {
    cdkBuilder.templateFile(templateFile)
  }

  public fun terminationProtection(terminationProtection: Boolean) {
    cdkBuilder.terminationProtection(terminationProtection)
  }

  public fun build(): AwsCloudFormationStackProperties = cdkBuilder.build()
}
