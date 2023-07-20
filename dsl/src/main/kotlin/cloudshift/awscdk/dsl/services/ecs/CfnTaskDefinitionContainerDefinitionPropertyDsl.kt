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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskDefinitionContainerDefinitionPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.ContainerDefinitionProperty.Builder =
        CfnTaskDefinition.ContainerDefinitionProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _dependsOn: MutableList<Any> = mutableListOf()

    private val _dnsSearchDomains: MutableList<String> = mutableListOf()

    private val _dnsServers: MutableList<String> = mutableListOf()

    private val _dockerSecurityOptions: MutableList<String> = mutableListOf()

    private val _entryPoint: MutableList<String> = mutableListOf()

    private val _environment: MutableList<Any> = mutableListOf()

    private val _environmentFiles: MutableList<Any> = mutableListOf()

    private val _extraHosts: MutableList<Any> = mutableListOf()

    private val _links: MutableList<String> = mutableListOf()

    private val _mountPoints: MutableList<Any> = mutableListOf()

    private val _portMappings: MutableList<Any> = mutableListOf()

    private val _resourceRequirements: MutableList<Any> = mutableListOf()

    private val _secrets: MutableList<Any> = mutableListOf()

    private val _systemControls: MutableList<Any> = mutableListOf()

    private val _ulimits: MutableList<Any> = mutableListOf()

    private val _volumesFrom: MutableList<Any> = mutableListOf()

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    public fun dependsOn(vararg dependsOn: Any) {
        _dependsOn.addAll(listOf(*dependsOn))
    }

    public fun dependsOn(dependsOn: Collection<Any>) {
        _dependsOn.addAll(dependsOn)
    }

    public fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn)
    }

    public fun disableNetworking(disableNetworking: Boolean) {
        cdkBuilder.disableNetworking(disableNetworking)
    }

    public fun disableNetworking(disableNetworking: IResolvable) {
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

    public fun dockerLabels(dockerLabels: IResolvable) {
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

    public fun environment(vararg environment: Any) {
        _environment.addAll(listOf(*environment))
    }

    public fun environment(environment: Collection<Any>) {
        _environment.addAll(environment)
    }

    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    public fun environmentFiles(vararg environmentFiles: Any) {
        _environmentFiles.addAll(listOf(*environmentFiles))
    }

    public fun environmentFiles(environmentFiles: Collection<Any>) {
        _environmentFiles.addAll(environmentFiles)
    }

    public fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles)
    }

    public fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
    }

    public fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential)
    }

    public fun extraHosts(vararg extraHosts: Any) {
        _extraHosts.addAll(listOf(*extraHosts))
    }

    public fun extraHosts(extraHosts: Collection<Any>) {
        _extraHosts.addAll(extraHosts)
    }

    public fun extraHosts(extraHosts: IResolvable) {
        cdkBuilder.extraHosts(extraHosts)
    }

    public fun firelensConfiguration(firelensConfiguration: IResolvable) {
        cdkBuilder.firelensConfiguration(firelensConfiguration)
    }

    public fun firelensConfiguration(firelensConfiguration: CfnTaskDefinition.FirelensConfigurationProperty) {
        cdkBuilder.firelensConfiguration(firelensConfiguration)
    }

    public fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun healthCheck(healthCheck: CfnTaskDefinition.HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    public fun interactive(interactive: Boolean) {
        cdkBuilder.interactive(interactive)
    }

    public fun interactive(interactive: IResolvable) {
        cdkBuilder.interactive(interactive)
    }

    public fun links(vararg links: String) {
        _links.addAll(listOf(*links))
    }

    public fun links(links: Collection<String>) {
        _links.addAll(links)
    }

    public fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters)
    }

    public fun linuxParameters(linuxParameters: CfnTaskDefinition.LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters)
    }

    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    public fun logConfiguration(logConfiguration: CfnTaskDefinition.LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    public fun memory(memory: Number) {
        cdkBuilder.memory(memory)
    }

    public fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
    }

    public fun mountPoints(vararg mountPoints: Any) {
        _mountPoints.addAll(listOf(*mountPoints))
    }

    public fun mountPoints(mountPoints: Collection<Any>) {
        _mountPoints.addAll(mountPoints)
    }

    public fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun portMappings(vararg portMappings: Any) {
        _portMappings.addAll(listOf(*portMappings))
    }

    public fun portMappings(portMappings: Collection<Any>) {
        _portMappings.addAll(portMappings)
    }

    public fun portMappings(portMappings: IResolvable) {
        cdkBuilder.portMappings(portMappings)
    }

    public fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
    }

    public fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged)
    }

    public fun pseudoTerminal(pseudoTerminal: Boolean) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    public fun pseudoTerminal(pseudoTerminal: IResolvable) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    public fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials)
    }

    public fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty) {
        cdkBuilder.repositoryCredentials(repositoryCredentials)
    }

    public fun resourceRequirements(vararg resourceRequirements: Any) {
        _resourceRequirements.addAll(listOf(*resourceRequirements))
    }

    public fun resourceRequirements(resourceRequirements: Collection<Any>) {
        _resourceRequirements.addAll(resourceRequirements)
    }

    public fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements)
    }

    public fun secrets(vararg secrets: Any) {
        _secrets.addAll(listOf(*secrets))
    }

    public fun secrets(secrets: Collection<Any>) {
        _secrets.addAll(secrets)
    }

    public fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets)
    }

    public fun startTimeout(startTimeout: Number) {
        cdkBuilder.startTimeout(startTimeout)
    }

    public fun stopTimeout(stopTimeout: Number) {
        cdkBuilder.stopTimeout(stopTimeout)
    }

    public fun systemControls(vararg systemControls: Any) {
        _systemControls.addAll(listOf(*systemControls))
    }

    public fun systemControls(systemControls: Collection<Any>) {
        _systemControls.addAll(systemControls)
    }

    public fun systemControls(systemControls: IResolvable) {
        cdkBuilder.systemControls(systemControls)
    }

    public fun ulimits(vararg ulimits: Any) {
        _ulimits.addAll(listOf(*ulimits))
    }

    public fun ulimits(ulimits: Collection<Any>) {
        _ulimits.addAll(ulimits)
    }

    public fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits)
    }

    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun volumesFrom(vararg volumesFrom: Any) {
        _volumesFrom.addAll(listOf(*volumesFrom))
    }

    public fun volumesFrom(volumesFrom: Collection<Any>) {
        _volumesFrom.addAll(volumesFrom)
    }

    public fun volumesFrom(volumesFrom: IResolvable) {
        cdkBuilder.volumesFrom(volumesFrom)
    }

    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnTaskDefinition.ContainerDefinitionProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_dependsOn.isNotEmpty()) cdkBuilder.dependsOn(_dependsOn)
        if (_dnsSearchDomains.isNotEmpty()) cdkBuilder.dnsSearchDomains(_dnsSearchDomains)
        if (_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
        if (_dockerSecurityOptions.isNotEmpty()) cdkBuilder.dockerSecurityOptions(_dockerSecurityOptions)
        if (_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
        if (_environment.isNotEmpty()) cdkBuilder.environment(_environment)
        if (_environmentFiles.isNotEmpty()) cdkBuilder.environmentFiles(_environmentFiles)
        if (_extraHosts.isNotEmpty()) cdkBuilder.extraHosts(_extraHosts)
        if (_links.isNotEmpty()) cdkBuilder.links(_links)
        if (_mountPoints.isNotEmpty()) cdkBuilder.mountPoints(_mountPoints)
        if (_portMappings.isNotEmpty()) cdkBuilder.portMappings(_portMappings)
        if (_resourceRequirements.isNotEmpty()) cdkBuilder.resourceRequirements(_resourceRequirements)
        if (_secrets.isNotEmpty()) cdkBuilder.secrets(_secrets)
        if (_systemControls.isNotEmpty()) cdkBuilder.systemControls(_systemControls)
        if (_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
        if (_volumesFrom.isNotEmpty()) cdkBuilder.volumesFrom(_volumesFrom)
        return cdkBuilder.build()
    }
}
