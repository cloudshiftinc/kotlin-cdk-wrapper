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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * `Container` is a property of the
 * [ContainerServiceDeployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
 * property. It describes the settings of a container that will be launched, or that is launched, to
 * an Amazon Lightsail container service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * ContainerProperty containerProperty = ContainerProperty.builder()
 * .command(List.of("command"))
 * .containerName("containerName")
 * .environment(List.of(EnvironmentVariableProperty.builder()
 * .value("value")
 * .variable("variable")
 * .build()))
 * .image("image")
 * .ports(List.of(PortInfoProperty.builder()
 * .port("port")
 * .protocol("protocol")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-container.html)
 */
@CdkDslMarker
public class CfnContainerContainerPropertyDsl {
    private val cdkBuilder: CfnContainer.ContainerProperty.Builder =
        CfnContainer.ContainerProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _environment: MutableList<Any> = mutableListOf()

    private val _ports: MutableList<Any> = mutableListOf()

    /** @param command The launch command for the container. */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /** @param command The launch command for the container. */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /** @param containerName The name of the container. */
    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    /** @param environment The environment variables of the container. */
    public fun environment(vararg environment: Any) {
        _environment.addAll(listOf(*environment))
    }

    /** @param environment The environment variables of the container. */
    public fun environment(environment: Collection<Any>) {
        _environment.addAll(environment)
    }

    /** @param environment The environment variables of the container. */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param image The name of the image used for the container. Container images that are sourced
     *   from (registered and stored on) your container service start with a colon ( `:` ). For
     *   example, if your container service name is `container-service-1` , the container image
     *   label is `mystaticsite` , and you want to use the third version ( `3` ) of the registered
     *   container image, then you should specify `:container-service-1.mystaticsite.3` . To use the
     *   latest version of a container image, specify `latest` instead of a version number (for
     *   example, `:container-service-1.mystaticsite.latest` ). Your container service will
     *   automatically use the highest numbered version of the registered container image.
     *
     * Container images that are sourced from a public registry like Docker Hub don’t start with a
     * colon. For example, `nginx:latest` or `nginx` .
     */
    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    /**
     * @param ports An object that describes the open firewall ports and protocols of the container.
     */
    public fun ports(vararg ports: Any) {
        _ports.addAll(listOf(*ports))
    }

    /**
     * @param ports An object that describes the open firewall ports and protocols of the container.
     */
    public fun ports(ports: Collection<Any>) {
        _ports.addAll(ports)
    }

    /**
     * @param ports An object that describes the open firewall ports and protocols of the container.
     */
    public fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports)
    }

    public fun build(): CfnContainer.ContainerProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_environment.isNotEmpty()) cdkBuilder.environment(_environment)
        if (_ports.isNotEmpty()) cdkBuilder.ports(_ports)
        return cdkBuilder.build()
    }
}
