@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.simspaceweaver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import software.constructs.Construct

@CdkDslMarker
public class CfnSimulationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSimulation.Builder = CfnSimulation.Builder.create(scope, id)

  public fun maximumDuration(maximumDuration: String) {
    cdkBuilder.maximumDuration(maximumDuration)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun schemaS3Location(schemaS3Location: IResolvable) {
    cdkBuilder.schemaS3Location(schemaS3Location)
  }

  public fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty) {
    cdkBuilder.schemaS3Location(schemaS3Location)
  }

  public fun snapshotS3Location(snapshotS3Location: IResolvable) {
    cdkBuilder.snapshotS3Location(snapshotS3Location)
  }

  public fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty) {
    cdkBuilder.snapshotS3Location(snapshotS3Location)
  }

  public fun build(): CfnSimulation = cdkBuilder.build()
}
