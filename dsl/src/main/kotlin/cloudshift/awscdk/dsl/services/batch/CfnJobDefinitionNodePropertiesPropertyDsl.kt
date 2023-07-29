@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * An object that represents the node properties of a multi-node parallel job.
 *
 * Node properties can't be specified for Amazon EKS based job definitions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object options;
 * NodePropertiesProperty nodePropertiesProperty = NodePropertiesProperty.builder()
 * .mainNode(123)
 * .nodeRangeProperties(List.of(NodeRangePropertyProperty.builder()
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
 * .build()))
 * .numNodes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html)
 */
@CdkDslMarker
public class CfnJobDefinitionNodePropertiesPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.NodePropertiesProperty.Builder =
        CfnJobDefinition.NodePropertiesProperty.builder()

    private val _nodeRangeProperties: MutableList<Any> = mutableListOf()

    /**
     * @param mainNode Specifies the node index for the main node of a multi-node parallel job. This
     *   node index value must be fewer than the number of nodes.
     */
    public fun mainNode(mainNode: Number) {
        cdkBuilder.mainNode(mainNode)
    }

    /**
     * @param nodeRangeProperties A list of node ranges and their properties that are associated
     *   with a multi-node parallel job.
     */
    public fun nodeRangeProperties(vararg nodeRangeProperties: Any) {
        _nodeRangeProperties.addAll(listOf(*nodeRangeProperties))
    }

    /**
     * @param nodeRangeProperties A list of node ranges and their properties that are associated
     *   with a multi-node parallel job.
     */
    public fun nodeRangeProperties(nodeRangeProperties: Collection<Any>) {
        _nodeRangeProperties.addAll(nodeRangeProperties)
    }

    /**
     * @param nodeRangeProperties A list of node ranges and their properties that are associated
     *   with a multi-node parallel job.
     */
    public fun nodeRangeProperties(nodeRangeProperties: IResolvable) {
        cdkBuilder.nodeRangeProperties(nodeRangeProperties)
    }

    /** @param numNodes The number of nodes that are associated with a multi-node parallel job. */
    public fun numNodes(numNodes: Number) {
        cdkBuilder.numNodes(numNodes)
    }

    public fun build(): CfnJobDefinition.NodePropertiesProperty {
        if (_nodeRangeProperties.isNotEmpty()) cdkBuilder.nodeRangeProperties(_nodeRangeProperties)
        return cdkBuilder.build()
    }
}
