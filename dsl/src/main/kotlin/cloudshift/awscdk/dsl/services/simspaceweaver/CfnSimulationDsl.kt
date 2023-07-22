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

  /**
   * The maximum running time of the simulation, specified as a number of minutes (m or M), hours (h
   * or H), or days (d or D).
   *
   * The simulation stops when it reaches this limit. The maximum value is `14D` , or its equivalent
   * in the other units. The default value is `14D` . A value equivalent to `0` makes the simulation
   * immediately transition to `STOPPING` as soon as it reaches `STARTED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-maximumduration)
   * @param maximumDuration The maximum running time of the simulation, specified as a number of
   * minutes (m or M), hours (h or H), or days (d or D). 
   */
  public fun maximumDuration(maximumDuration: String) {
    cdkBuilder.maximumDuration(maximumDuration)
  }

  /**
   * The name of the simulation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-name)
   * @param name The name of the simulation. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role that the
   * simulation assumes to perform actions.
   *
   * For more information about ARNs, see [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
   * General Reference* . For more information about IAM roles, see [IAM
   * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *AWS Identity and
   * Access Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM )
   * role that the simulation assumes to perform actions. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
   *
   * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
   *
   * Provide a `SchemaS3Location` to start your simulation from a schema.
   *
   * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
   * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage Service
   * ( Amazon S3 ). 
   */
  public fun schemaS3Location(schemaS3Location: IResolvable) {
    cdkBuilder.schemaS3Location(schemaS3Location)
  }

  /**
   * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
   *
   * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
   *
   * Provide a `SchemaS3Location` to start your simulation from a schema.
   *
   * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
   * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage Service
   * ( Amazon S3 ). 
   */
  public fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty) {
    cdkBuilder.schemaS3Location(schemaS3Location)
  }

  /**
   * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
   *
   * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
   *
   * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
   *
   * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
   * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
   * Amazon S3 ). 
   */
  public fun snapshotS3Location(snapshotS3Location: IResolvable) {
    cdkBuilder.snapshotS3Location(snapshotS3Location)
  }

  /**
   * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
   *
   * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
   *
   * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
   *
   * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
   * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
   * Amazon S3 ). 
   */
  public fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty) {
    cdkBuilder.snapshotS3Location(snapshotS3Location)
  }

  public fun build(): CfnSimulation = cdkBuilder.build()
}
