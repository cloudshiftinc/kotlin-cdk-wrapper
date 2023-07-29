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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * EKS container properties are used in job definitions for Amazon EKS based job definitions to
 * describe the properties for a container node in the pod that's launched as part of a job.
 *
 * This can't be specified for Amazon ECS based job definitions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object limits;
 * Object requests;
 * EksContainerProperty eksContainerProperty = EksContainerProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainer.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEksContainerPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EksContainerProperty.Builder =
        CfnJobDefinition.EksContainerProperty.builder()

    private val _args: MutableList<String> = mutableListOf()

    private val _command: MutableList<String> = mutableListOf()

    private val _env: MutableList<Any> = mutableListOf()

    private val _volumeMounts: MutableList<Any> = mutableListOf()

    /**
     * @param args An array of arguments to the entrypoint. If this isn't specified, the `CMD` of
     *   the container image is used. This corresponds to the `args` member in the
     *   [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
     *   portion of the
     *   [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
     *   in Kubernetes. Environment variable references are expanded using the container's
     *   environment.
     *
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
     * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
     * `$` , and the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as
     * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. For more
     * information, see
     * [CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) in
     * the *Dockerfile reference* and
     * [Define a command and arguments for a pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
     * in the *Kubernetes documentation* .
     */
    public fun args(vararg args: String) {
        _args.addAll(listOf(*args))
    }

    /**
     * @param args An array of arguments to the entrypoint. If this isn't specified, the `CMD` of
     *   the container image is used. This corresponds to the `args` member in the
     *   [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
     *   portion of the
     *   [Pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/)
     *   in Kubernetes. Environment variable references are expanded using the container's
     *   environment.
     *
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
     * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
     * `$` , and the resulting string isn't expanded. For example, `$$(VAR_NAME)` is passed as
     * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. For more
     * information, see
     * [CMD](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd) in
     * the *Dockerfile reference* and
     * [Define a command and arguments for a pod](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
     * in the *Kubernetes documentation* .
     */
    public fun args(args: Collection<String>) {
        _args.addAll(args)
    }

    /**
     * @param command The entrypoint for the container. This isn't run within a shell. If this isn't
     *   specified, the `ENTRYPOINT` of the container image is used. Environment variable references
     *   are expanded using the container's environment.
     *
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
     * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
     * `$` and the resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as
     * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. The entrypoint can't
     * be updated. For more information, see
     * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
     * in the *Dockerfile reference* and
     * [Define a command and arguments for a container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
     * and
     * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
     * in the *Kubernetes documentation* .
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The entrypoint for the container. This isn't run within a shell. If this isn't
     *   specified, the `ENTRYPOINT` of the container image is used. Environment variable references
     *   are expanded using the container's environment.
     *
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed. For example, if the reference is to " `$(NAME1)` " and the `NAME1` environment
     * variable doesn't exist, the command string will remain " `$(NAME1)` ." `$$` is replaced with
     * `$` and the resulting string isn't expanded. For example, `$$(VAR_NAME)` will be passed as
     * `$(VAR_NAME)` whether or not the `VAR_NAME` environment variable exists. The entrypoint can't
     * be updated. For more information, see
     * [ENTRYPOINT](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
     * in the *Dockerfile reference* and
     * [Define a command and arguments for a container](https://docs.aws.amazon.com/https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
     * and
     * [Entrypoint](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
     * in the *Kubernetes documentation* .
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param env The environment variables to pass to a container.
     *
     * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     */
    public fun env(vararg env: Any) {
        _env.addAll(listOf(*env))
    }

    /**
     * @param env The environment variables to pass to a container.
     *
     * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     */
    public fun env(env: Collection<Any>) {
        _env.addAll(env)
    }

    /**
     * @param env The environment variables to pass to a container.
     *
     * Environment variables cannot start with " `AWS_BATCH` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     */
    public fun env(env: IResolvable) {
        cdkBuilder.env(env)
    }

    /** @param image The Docker image used to start the container. */
    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    /**
     * @param imagePullPolicy The image pull policy for the container. Supported values are `Always`
     *   , `IfNotPresent` , and `Never` . This parameter defaults to `IfNotPresent` . However, if
     *   the `:latest` tag is specified, it defaults to `Always` . For more information, see
     *   [Updating images](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/containers/images/#updating-images)
     *   in the *Kubernetes documentation* .
     */
    public fun imagePullPolicy(imagePullPolicy: String) {
        cdkBuilder.imagePullPolicy(imagePullPolicy)
    }

    /**
     * @param name The name of the container. If the name isn't specified, the default name "
     *   `Default` " is used. Each container in a pod must have a unique name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param resources The type and amount of resources to assign to a container. The supported
     *   resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more information, see
     *   [Resource management for pods and containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
     *   in the *Kubernetes documentation* .
     */
    public fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources)
    }

    /**
     * @param resources The type and amount of resources to assign to a container. The supported
     *   resources include `memory` , `cpu` , and `nvidia.com/gpu` . For more information, see
     *   [Resource management for pods and containers](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
     *   in the *Kubernetes documentation* .
     */
    public fun resources(resources: CfnJobDefinition.ResourcesProperty) {
        cdkBuilder.resources(resources)
    }

    /** @param securityContext the value to be set. */
    public fun securityContext(securityContext: IResolvable) {
        cdkBuilder.securityContext(securityContext)
    }

    /** @param securityContext the value to be set. */
    public fun securityContext(securityContext: CfnJobDefinition.SecurityContextProperty) {
        cdkBuilder.securityContext(securityContext)
    }

    /**
     * @param volumeMounts The volume mounts for the container. AWS Batch supports `emptyDir` ,
     *   `hostPath` , and `secret` volume types. For more information about volumes and volume
     *   mounts in Kubernetes, see
     *   [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/)
     *   in the *Kubernetes documentation* .
     */
    public fun volumeMounts(vararg volumeMounts: Any) {
        _volumeMounts.addAll(listOf(*volumeMounts))
    }

    /**
     * @param volumeMounts The volume mounts for the container. AWS Batch supports `emptyDir` ,
     *   `hostPath` , and `secret` volume types. For more information about volumes and volume
     *   mounts in Kubernetes, see
     *   [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/)
     *   in the *Kubernetes documentation* .
     */
    public fun volumeMounts(volumeMounts: Collection<Any>) {
        _volumeMounts.addAll(volumeMounts)
    }

    /**
     * @param volumeMounts The volume mounts for the container. AWS Batch supports `emptyDir` ,
     *   `hostPath` , and `secret` volume types. For more information about volumes and volume
     *   mounts in Kubernetes, see
     *   [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/)
     *   in the *Kubernetes documentation* .
     */
    public fun volumeMounts(volumeMounts: IResolvable) {
        cdkBuilder.volumeMounts(volumeMounts)
    }

    public fun build(): CfnJobDefinition.EksContainerProperty {
        if (_args.isNotEmpty()) cdkBuilder.args(_args)
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_volumeMounts.isNotEmpty()) cdkBuilder.volumeMounts(_volumeMounts)
        return cdkBuilder.build()
    }
}
