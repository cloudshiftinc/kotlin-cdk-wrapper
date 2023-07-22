@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * An object that represents the properties of the node range for a multi-node parallel job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object options;
 * NodeRangePropertyProperty nodeRangePropertyProperty = NodeRangePropertyProperty.builder()
 * .targetNodes("targetNodes")
 * // the properties below are optional
 * .container(ContainerPropertiesProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .command(List.of("command"))
 * .environment(List.of(EnvironmentProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .ephemeralStorage(EphemeralStorageProperty.builder()
 * .sizeInGiB(123)
 * .build())
 * .executionRoleArn("executionRoleArn")
 * .fargatePlatformConfiguration(FargatePlatformConfigurationProperty.builder()
 * .platformVersion("platformVersion")
 * .build())
 * .instanceType("instanceType")
 * .jobRoleArn("jobRoleArn")
 * .linuxParameters(LinuxParametersProperty.builder()
 * .devices(List.of(DeviceProperty.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * .permissions(List.of("permissions"))
 * .build()))
 * .initProcessEnabled(false)
 * .maxSwap(123)
 * .sharedMemorySize(123)
 * .swappiness(123)
 * .tmpfs(List.of(TmpfsProperty.builder()
 * .containerPath("containerPath")
 * .size(123)
 * // the properties below are optional
 * .mountOptions(List.of("mountOptions"))
 * .build()))
 * .build())
 * .logConfiguration(LogConfigurationProperty.builder()
 * .logDriver("logDriver")
 * // the properties below are optional
 * .options(options)
 * .secretOptions(List.of(SecretProperty.builder()
 * .name("name")
 * .valueFrom("valueFrom")
 * .build()))
 * .build())
 * .memory(123)
 * .mountPoints(List.of(MountPointsProperty.builder()
 * .containerPath("containerPath")
 * .readOnly(false)
 * .sourceVolume("sourceVolume")
 * .build()))
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .assignPublicIp("assignPublicIp")
 * .build())
 * .privileged(false)
 * .readonlyRootFilesystem(false)
 * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .secrets(List.of(SecretProperty.builder()
 * .name("name")
 * .valueFrom("valueFrom")
 * .build()))
 * .ulimits(List.of(UlimitProperty.builder()
 * .hardLimit(123)
 * .name("name")
 * .softLimit(123)
 * .build()))
 * .user("user")
 * .vcpus(123)
 * .volumes(List.of(VolumesProperty.builder()
 * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfigProperty.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build())
 * .rootDirectory("rootDirectory")
 * .transitEncryption("transitEncryption")
 * .transitEncryptionPort(123)
 * .build())
 * .host(VolumesHostProperty.builder()
 * .sourcePath("sourcePath")
 * .build())
 * .name("name")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-noderangeproperty.html)
 */
@CdkDslMarker
public class CfnJobDefinitionNodeRangePropertyPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.NodeRangePropertyProperty.Builder =
      CfnJobDefinition.NodeRangePropertyProperty.builder()

  /**
   * @param container The container details for the node range.
   */
  public fun container(container: IResolvable) {
    cdkBuilder.container(container)
  }

  /**
   * @param container The container details for the node range.
   */
  public fun container(container: CfnJobDefinition.ContainerPropertiesProperty) {
    cdkBuilder.container(container)
  }

  /**
   * @param targetNodes The range of nodes, using node index values. 
   * A range of `0:3` indicates nodes with index values of `0` through `3` . If the starting range
   * value is omitted ( `:n` ), then `0` is used to start the range. If the ending range value is
   * omitted ( `n:` ), then the highest possible node index is used to end the range. Your accumulative
   * node ranges must account for all nodes ( `0:n` ). You can nest node ranges (for example, `0:10`
   * and `4:5` ). In this case, the `4:5` range properties override the `0:10` properties.
   */
  public fun targetNodes(targetNodes: String) {
    cdkBuilder.targetNodes(targetNodes)
  }

  public fun build(): CfnJobDefinition.NodeRangePropertyProperty = cdkBuilder.build()
}
