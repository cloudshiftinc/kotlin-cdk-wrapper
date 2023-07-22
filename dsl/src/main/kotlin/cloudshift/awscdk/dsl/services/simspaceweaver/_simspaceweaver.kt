@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.simspaceweaver

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps
import software.constructs.Construct

public object simspaceweaver {
  /**
   * Use the `AWS::SimSpaceWeaver::Simulation` resource to specify a simulation that AWS
   * CloudFormation starts in the AWS Cloud , in your AWS account .
   *
   * In the resource properties section of your template, provide the name of an existing IAM role
   * configured with the proper permissions, and the name of an existing Amazon S3 bucket. Your account
   * must have permissions to read the Amazon S3 bucket. The Amazon S3 bucket must contain a valid
   * schema. The schema must refer to simulation assets that are already uploaded to the AWS Cloud .
   * For more information, see the [detailed
   * tutorial](https://docs.aws.amazon.com/simspaceweaver/latest/userguide/getting-started_detailed.html)
   * in the *AWS SimSpace Weaver User Guide* .
   *
   * Specify a `SnapshotS3Location` to start a simulation from a snapshot instead of from a schema.
   * When you start a simulation from a snapshot, SimSpace Weaver initializes the entity data in the
   * State Fabric with data saved in the snapshot, starts the spatial and service apps that were
   * running when the snapshot was created, and restores the clock to the appropriate tick. Your app
   * zip files must be in the same location in Amazon S3 as they were in for the original simulation.
   * You must start any custom apps separately. For more information about snapshots, see
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
  public inline fun cfnSimulation(
    scope: Construct,
    id: String,
    block: CfnSimulationDsl.() -> Unit = {},
  ): CfnSimulation {
    val builder = CfnSimulationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSimulation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.simspaceweaver.*;
   * CfnSimulationProps cfnSimulationProps = CfnSimulationProps.builder()
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
  public inline fun cfnSimulationProps(block: CfnSimulationPropsDsl.() -> Unit = {}):
      CfnSimulationProps {
    val builder = CfnSimulationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A location in Amazon Simple Storage Service ( Amazon S3 ) where SimSpace Weaver stores
   * simulation data, such as your app .zip files and schema file. For more information about Amazon S3
   * , see the [*Amazon Simple Storage Service User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.simspaceweaver.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucketName("bucketName")
   * .objectKey("objectKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simspaceweaver-simulation-s3location.html)
   */
  public inline
      fun cfnSimulationS3LocationProperty(block: CfnSimulationS3LocationPropertyDsl.() -> Unit =
      {}): CfnSimulation.S3LocationProperty {
    val builder = CfnSimulationS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
