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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps

/**
 * Properties for defining a `CfnJobDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object labels;
 * Object limits;
 * Object options;
 * Object parameters;
 * Object requests;
 * Object tags;
 * CfnJobDefinitionProps cfnJobDefinitionProps = CfnJobDefinitionProps.builder()
 * .type("type")
 * // the properties below are optional
 * .containerProperties(ContainerPropertiesProperty.builder()
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
 * .runtimePlatform(RuntimePlatformProperty.builder()
 * .cpuArchitecture("cpuArchitecture")
 * .operatingSystemFamily("operatingSystemFamily")
 * .build())
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
 * .eksProperties(EksPropertiesProperty.builder()
 * .podProperties(PodPropertiesProperty.builder()
 * .containers(List.of(EksContainerProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .args(List.of("args"))
 * .command(List.of("command"))
 * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .imagePullPolicy("imagePullPolicy")
 * .name("name")
 * .resources(ResourcesProperty.builder()
 * .limits(limits)
 * .requests(requests)
 * .build())
 * .securityContext(SecurityContextProperty.builder()
 * .privileged(false)
 * .readOnlyRootFilesystem(false)
 * .runAsGroup(123)
 * .runAsNonRoot(false)
 * .runAsUser(123)
 * .build())
 * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
 * .mountPath("mountPath")
 * .name("name")
 * .readOnly(false)
 * .build()))
 * .build()))
 * .dnsPolicy("dnsPolicy")
 * .hostNetwork(false)
 * .metadata(MetadataProperty.builder()
 * .labels(labels)
 * .build())
 * .serviceAccountName("serviceAccountName")
 * .volumes(List.of(EksVolumeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .emptyDir(EmptyDirProperty.builder()
 * .medium("medium")
 * .sizeLimit("sizeLimit")
 * .build())
 * .hostPath(HostPathProperty.builder()
 * .path("path")
 * .build())
 * .secret(EksSecretProperty.builder()
 * .secretName("secretName")
 * // the properties below are optional
 * .optional(false)
 * .build())
 * .build()))
 * .build())
 * .build())
 * .jobDefinitionName("jobDefinitionName")
 * .nodeProperties(NodePropertiesProperty.builder()
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
 * .runtimePlatform(RuntimePlatformProperty.builder()
 * .cpuArchitecture("cpuArchitecture")
 * .operatingSystemFamily("operatingSystemFamily")
 * .build())
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
 * .build())
 * .parameters(parameters)
 * .platformCapabilities(List.of("platformCapabilities"))
 * .propagateTags(false)
 * .retryStrategy(RetryStrategyProperty.builder()
 * .attempts(123)
 * .evaluateOnExit(List.of(EvaluateOnExitProperty.builder()
 * .action("action")
 * // the properties below are optional
 * .onExitCode("onExitCode")
 * .onReason("onReason")
 * .onStatusReason("onStatusReason")
 * .build()))
 * .build())
 * .schedulingPriority(123)
 * .tags(tags)
 * .timeout(TimeoutProperty.builder()
 * .attemptDurationSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
 */
@CdkDslMarker
public class CfnJobDefinitionPropsDsl {
    private val cdkBuilder: CfnJobDefinitionProps.Builder = CfnJobDefinitionProps.builder()

    private val _platformCapabilities: MutableList<String> = mutableListOf()

    /**
     * @param containerProperties An object with various properties specific to Amazon ECS based
     *   jobs. Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` .
     *   Only one can be specified.
     */
    public fun containerProperties(containerProperties: IResolvable) {
        cdkBuilder.containerProperties(containerProperties)
    }

    /**
     * @param containerProperties An object with various properties specific to Amazon ECS based
     *   jobs. Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` .
     *   Only one can be specified.
     */
    public fun containerProperties(
        containerProperties: CfnJobDefinition.ContainerPropertiesProperty
    ) {
        cdkBuilder.containerProperties(containerProperties)
    }

    /**
     * @param eksProperties An object with various properties that are specific to Amazon EKS based
     *   jobs. Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` .
     *   Only one can be specified.
     */
    public fun eksProperties(eksProperties: IResolvable) {
        cdkBuilder.eksProperties(eksProperties)
    }

    /**
     * @param eksProperties An object with various properties that are specific to Amazon EKS based
     *   jobs. Valid values are `containerProperties` , `eksProperties` , and `nodeProperties` .
     *   Only one can be specified.
     */
    public fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty) {
        cdkBuilder.eksProperties(eksProperties)
    }

    /** @param jobDefinitionName The name of the job definition. */
    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param nodeProperties An object with various properties that are specific to multi-node
     *   parallel jobs. Valid values are `containerProperties` , `eksProperties` , and
     *   `nodeProperties` . Only one can be specified.
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    public fun nodeProperties(nodeProperties: IResolvable) {
        cdkBuilder.nodeProperties(nodeProperties)
    }

    /**
     * @param nodeProperties An object with various properties that are specific to multi-node
     *   parallel jobs. Valid values are `containerProperties` , `eksProperties` , and
     *   `nodeProperties` . Only one can be specified.
     *
     * If the job runs on Fargate resources, don't specify `nodeProperties` . Use
     * `containerProperties` instead.
     */
    public fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty) {
        cdkBuilder.nodeProperties(nodeProperties)
    }

    /**
     * @param parameters Default parameters or parameter substitution placeholders that are set in
     *   the job definition. Parameters are specified as a key-value pair mapping. Parameters in a
     *   `SubmitJob` request override any corresponding parameter defaults from the job definition.
     *   For more information about specifying parameters, see
     *   [Job definition parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html)
     *   in the *AWS Batch User Guide* .
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters Default parameters or parameter substitution placeholders that are set in
     *   the job definition. Parameters are specified as a key-value pair mapping. Parameters in a
     *   `SubmitJob` request override any corresponding parameter defaults from the job definition.
     *   For more information about specifying parameters, see
     *   [Job definition parameters](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html)
     *   in the *AWS Batch User Guide* .
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param platformCapabilities The platform capabilities required by the job definition. If no
     *   value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify `FARGATE`
     *   .
     */
    public fun platformCapabilities(vararg platformCapabilities: String) {
        _platformCapabilities.addAll(listOf(*platformCapabilities))
    }

    /**
     * @param platformCapabilities The platform capabilities required by the job definition. If no
     *   value is specified, it defaults to `EC2` . Jobs run on Fargate resources specify `FARGATE`
     *   .
     */
    public fun platformCapabilities(platformCapabilities: Collection<String>) {
        _platformCapabilities.addAll(platformCapabilities)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     *   to the corresponding Amazon ECS task. If no value is specified, the tags aren't propagated.
     *   Tags can only be propagated to the tasks when the tasks are created. For tags with the same
     *   name, job tags are given priority over job definitions tags. If the total number of
     *   combined tags from the job and job definition is over 50, the job is moved to the `FAILED`
     *   state.
     */
    public fun propagateTags(propagateTags: Boolean) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the job or job definition
     *   to the corresponding Amazon ECS task. If no value is specified, the tags aren't propagated.
     *   Tags can only be propagated to the tasks when the tasks are created. For tags with the same
     *   name, job tags are given priority over job definitions tags. If the total number of
     *   combined tags from the job and job definition is over 50, the job is moved to the `FAILED`
     *   state.
     */
    public fun propagateTags(propagateTags: IResolvable) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     *   job definition.
     */
    public fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy)
    }

    /**
     * @param retryStrategy The retry strategy to use for failed jobs that are submitted with this
     *   job definition.
     */
    public fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy)
    }

    /**
     * @param schedulingPriority The scheduling priority of the job definition. This only affects
     *   jobs in job queues with a fair share policy. Jobs with a higher scheduling priority are
     *   scheduled before jobs with a lower scheduling priority.
     */
    public fun schedulingPriority(schedulingPriority: Number) {
        cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /** @param tags The tags that are applied to the job definition. */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /** @param tags The tags that are applied to the job definition. */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition. After
     *   the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     *   finished.
     */
    public fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition. After
     *   the amount of time you specify passes, AWS Batch terminates your jobs if they aren't
     *   finished.
     */
    public fun timeout(timeout: CfnJobDefinition.TimeoutProperty) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param type The type of job definition. For more information about multi-node parallel jobs,
     *   see
     *   [Creating a multi-node parallel job definition](https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html)
     *   in the *AWS Batch User Guide* .
     *
     * If the job is run on Fargate resources, then `multinode` isn't supported.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnJobDefinitionProps {
        if (_platformCapabilities.isNotEmpty())
            cdkBuilder.platformCapabilities(_platformCapabilities)
        return cdkBuilder.build()
    }
}
