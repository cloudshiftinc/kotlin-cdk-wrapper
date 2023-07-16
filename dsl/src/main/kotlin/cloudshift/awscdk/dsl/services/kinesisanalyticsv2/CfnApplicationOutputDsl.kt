@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationOutputDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationOutput.Builder = CfnApplicationOutput.Builder.create(scope,
      id)

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun output(output: IResolvable) {
    cdkBuilder.output(output)
  }

  public fun output(output: CfnApplicationOutput.OutputProperty) {
    cdkBuilder.output(output)
  }

  public fun build(): CfnApplicationOutput = cdkBuilder.build()
}
