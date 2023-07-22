@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.simspaceweaver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import software.constructs.Construct

/**
 * Use the `AWS::SimSpaceWeaver::Simulation` resource to specify a simulation that AWS
 * CloudFormation starts in the AWS Cloud , in your AWS account .
 *
 * In the resource properties section of your template, provide the name of an existing IAM role
 * configured with the proper permissions, and the name of an existing Amazon S3 bucket. Your account
 * must have permissions to read the Amazon S3 bucket. The Amazon S3 bucket must contain a valid
 * schema. The schema must refer to simulation assets that are already uploaded to the AWS Cloud . For
 * more information, see the [detailed
 * tutorial](https://docs.aws.amazon.com/simspaceweaver/latest/userguide/getting-started_detailed.html)
 * in the *AWS SimSpace Weaver User Guide* .
 *
 * Specify a `SnapshotS3Location` to start a simulation from a snapshot instead of from a schema.
 * When you start a simulation from a snapshot, SimSpace Weaver initializes the entity data in the
 * State Fabric with data saved in the snapshot, starts the spatial and service apps that were running
 * when the snapshot was created, and restores the clock to the appropriate tick. Your app zip files
 * must be in the same location in Amazon S3 as they were in for the original simulation. You must
 * start any custom apps separately. For more information about snapshots, see
 * [Snapshots](https://docs.aws.amazon.com/simspaceweaver/latest/userguide/working-with_snapshots.html)
 * in the *AWS SimSpace Weaver User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.simspaceweaver.*;
 * CfnSimulation cfnSimulation = CfnSimulation.Builder.create(this, "MyCfnSimulation")
 * .name("name")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .maximumDuration("maximumDuration")
 * .schemaS3Location(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build())
 * .snapshotS3Location(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html)
 */
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
