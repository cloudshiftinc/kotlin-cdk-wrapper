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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobDefinitionEksContainerPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EksContainerProperty.Builder =
        CfnJobDefinition.EksContainerProperty.builder()

    private val _args: MutableList<String> = mutableListOf()

    private val _command: MutableList<String> = mutableListOf()

    private val _env: MutableList<Any> = mutableListOf()

    private val _volumeMounts: MutableList<Any> = mutableListOf()

    public fun args(vararg args: String) {
        _args.addAll(listOf(*args))
    }

    public fun args(args: Collection<String>) {
        _args.addAll(args)
    }

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun env(vararg env: Any) {
        _env.addAll(listOf(*env))
    }

    public fun env(env: Collection<Any>) {
        _env.addAll(env)
    }

    public fun env(env: IResolvable) {
        cdkBuilder.env(env)
    }

    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    public fun imagePullPolicy(imagePullPolicy: String) {
        cdkBuilder.imagePullPolicy(imagePullPolicy)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources)
    }

    public fun resources(resources: CfnJobDefinition.ResourcesProperty) {
        cdkBuilder.resources(resources)
    }

    public fun securityContext(securityContext: IResolvable) {
        cdkBuilder.securityContext(securityContext)
    }

    public fun securityContext(securityContext: CfnJobDefinition.SecurityContextProperty) {
        cdkBuilder.securityContext(securityContext)
    }

    public fun volumeMounts(vararg volumeMounts: Any) {
        _volumeMounts.addAll(listOf(*volumeMounts))
    }

    public fun volumeMounts(volumeMounts: Collection<Any>) {
        _volumeMounts.addAll(volumeMounts)
    }

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
