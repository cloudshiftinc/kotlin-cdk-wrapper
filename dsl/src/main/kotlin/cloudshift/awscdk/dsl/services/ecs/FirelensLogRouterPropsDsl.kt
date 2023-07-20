@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.EnvironmentFile
import software.amazon.awscdk.services.ecs.FirelensConfig
import software.amazon.awscdk.services.ecs.FirelensLogRouterProps
import software.amazon.awscdk.services.ecs.HealthCheck
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.PortMapping
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.SystemControl
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.Ulimit
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class FirelensLogRouterPropsDsl {
    private val cdkBuilder: FirelensLogRouterProps.Builder = FirelensLogRouterProps.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _dnsSearchDomains: MutableList<String> = mutableListOf()

    private val _dnsServers: MutableList<String> = mutableListOf()

    private val _dockerSecurityOptions: MutableList<String> = mutableListOf()

    private val _entryPoint: MutableList<String> = mutableListOf()

    private val _environmentFiles: MutableList<EnvironmentFile> = mutableListOf()

    private val _inferenceAcceleratorResources: MutableList<String> = mutableListOf()

    private val _portMappings: MutableList<PortMapping> = mutableListOf()

    private val _systemControls: MutableList<SystemControl> = mutableListOf()

    private val _ulimits: MutableList<Ulimit> = mutableListOf()

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    public fun disableNetworking(disableNetworking: Boolean) {
        cdkBuilder.disableNetworking(disableNetworking)
    }

    public fun dnsSearchDomains(vararg dnsSearchDomains: String) {
        _dnsSearchDomains.addAll(listOf(*dnsSearchDomains))
    }

    public fun dnsSearchDomains(dnsSearchDomains: Collection<String>) {
        _dnsSearchDomains.addAll(dnsSearchDomains)
    }

    public fun dnsServers(vararg dnsServers: String) {
        _dnsServers.addAll(listOf(*dnsServers))
    }

    public fun dnsServers(dnsServers: Collection<String>) {
        _dnsServers.addAll(dnsServers)
    }

    public fun dockerLabels(dockerLabels: Map<String, String>) {
        cdkBuilder.dockerLabels(dockerLabels)
    }

    public fun dockerSecurityOptions(vararg dockerSecurityOptions: String) {
        _dockerSecurityOptions.addAll(listOf(*dockerSecurityOptions))
    }

    public fun dockerSecurityOptions(dockerSecurityOptions: Collection<String>) {
        _dockerSecurityOptions.addAll(dockerSecurityOptions)
    }

    public fun entryPoint(vararg entryPoint: String) {
        _entryPoint.addAll(listOf(*entryPoint))
    }

    public fun entryPoint(entryPoint: Collection<String>) {
        _entryPoint.addAll(entryPoint)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun environmentFiles(vararg environmentFiles: EnvironmentFile) {
        _environmentFiles.addAll(listOf(*environmentFiles))
    }

    public fun environmentFiles(environmentFiles: Collection<EnvironmentFile>) {
        _environmentFiles.addAll(environmentFiles)
    }

    public fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
    }

    public fun extraHosts(extraHosts: Map<String, String>) {
        cdkBuilder.extraHosts(extraHosts)
    }

    public fun firelensConfig(block: FirelensConfigDsl.() -> Unit = {}) {
        val builder = FirelensConfigDsl()
        builder.apply(block)
        cdkBuilder.firelensConfig(builder.build())
    }

    public fun firelensConfig(firelensConfig: FirelensConfig) {
        cdkBuilder.firelensConfig(firelensConfig)
    }

    public fun gpuCount(gpuCount: Number) {
        cdkBuilder.gpuCount(gpuCount)
    }

    public fun healthCheck(block: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(block)
        cdkBuilder.healthCheck(builder.build())
    }

    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    public fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String) {
        _inferenceAcceleratorResources.addAll(listOf(*inferenceAcceleratorResources))
    }

    public fun inferenceAcceleratorResources(inferenceAcceleratorResources: Collection<String>) {
        _inferenceAcceleratorResources.addAll(inferenceAcceleratorResources)
    }

    public fun linuxParameters(linuxParameters: LinuxParameters) {
        cdkBuilder.linuxParameters(linuxParameters)
    }

    public fun logging(logging: LogDriver) {
        cdkBuilder.logging(logging)
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public fun portMappings(portMappings: PortMappingDsl.() -> Unit) {
        _portMappings.add(PortMappingDsl().apply(portMappings).build())
    }

    public fun portMappings(portMappings: Collection<PortMapping>) {
        _portMappings.addAll(portMappings)
    }

    public fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
    }

    public fun pseudoTerminal(pseudoTerminal: Boolean) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    public fun startTimeout(startTimeout: Duration) {
        cdkBuilder.startTimeout(startTimeout)
    }

    public fun stopTimeout(stopTimeout: Duration) {
        cdkBuilder.stopTimeout(stopTimeout)
    }

    public fun systemControls(systemControls: SystemControlDsl.() -> Unit) {
        _systemControls.add(SystemControlDsl().apply(systemControls).build())
    }

    public fun systemControls(systemControls: Collection<SystemControl>) {
        _systemControls.addAll(systemControls)
    }

    public fun taskDefinition(taskDefinition: TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun ulimits(ulimits: UlimitDsl.() -> Unit) {
        _ulimits.add(UlimitDsl().apply(ulimits).build())
    }

    public fun ulimits(ulimits: Collection<Ulimit>) {
        _ulimits.addAll(ulimits)
    }

    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): FirelensLogRouterProps {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_dnsSearchDomains.isNotEmpty()) cdkBuilder.dnsSearchDomains(_dnsSearchDomains)
        if (_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
        if (_dockerSecurityOptions.isNotEmpty()) cdkBuilder.dockerSecurityOptions(_dockerSecurityOptions)
        if (_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
        if (_environmentFiles.isNotEmpty()) cdkBuilder.environmentFiles(_environmentFiles)
        if (_inferenceAcceleratorResources.isNotEmpty()) {
            cdkBuilder.inferenceAcceleratorResources(_inferenceAcceleratorResources)
        }
        if (_portMappings.isNotEmpty()) cdkBuilder.portMappings(_portMappings)
        if (_systemControls.isNotEmpty()) cdkBuilder.systemControls(_systemControls)
        if (_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
        return cdkBuilder.build()
    }
}
