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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.opsworks.CfnLayer

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * RecipesProperty recipesProperty = RecipesProperty.builder()
 * .configure(List.of("configure"))
 * .deploy(List.of("deploy"))
 * .setup(List.of("setup"))
 * .shutdown(List.of("shutdown"))
 * .undeploy(List.of("undeploy"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html)
 */
@CdkDslMarker
public class CfnLayerRecipesPropertyDsl {
    private val cdkBuilder: CfnLayer.RecipesProperty.Builder = CfnLayer.RecipesProperty.builder()

    private val _configure: MutableList<String> = mutableListOf()

    private val _deploy: MutableList<String> = mutableListOf()

    private val _setup: MutableList<String> = mutableListOf()

    private val _shutdown: MutableList<String> = mutableListOf()

    private val _undeploy: MutableList<String> = mutableListOf()

    /** @param configure An array of custom recipe names to be run following a `configure` event. */
    public fun configure(vararg configure: String) {
        _configure.addAll(listOf(*configure))
    }

    /** @param configure An array of custom recipe names to be run following a `configure` event. */
    public fun configure(configure: Collection<String>) {
        _configure.addAll(configure)
    }

    /** @param deploy An array of custom recipe names to be run following a `deploy` event. */
    public fun deploy(vararg deploy: String) {
        _deploy.addAll(listOf(*deploy))
    }

    /** @param deploy An array of custom recipe names to be run following a `deploy` event. */
    public fun deploy(deploy: Collection<String>) {
        _deploy.addAll(deploy)
    }

    /** @param setup An array of custom recipe names to be run following a `setup` event. */
    public fun setup(vararg setup: String) {
        _setup.addAll(listOf(*setup))
    }

    /** @param setup An array of custom recipe names to be run following a `setup` event. */
    public fun setup(setup: Collection<String>) {
        _setup.addAll(setup)
    }

    /** @param shutdown An array of custom recipe names to be run following a `shutdown` event. */
    public fun shutdown(vararg shutdown: String) {
        _shutdown.addAll(listOf(*shutdown))
    }

    /** @param shutdown An array of custom recipe names to be run following a `shutdown` event. */
    public fun shutdown(shutdown: Collection<String>) {
        _shutdown.addAll(shutdown)
    }

    /** @param undeploy An array of custom recipe names to be run following a `undeploy` event. */
    public fun undeploy(vararg undeploy: String) {
        _undeploy.addAll(listOf(*undeploy))
    }

    /** @param undeploy An array of custom recipe names to be run following a `undeploy` event. */
    public fun undeploy(undeploy: Collection<String>) {
        _undeploy.addAll(undeploy)
    }

    public fun build(): CfnLayer.RecipesProperty {
        if (_configure.isNotEmpty()) cdkBuilder.configure(_configure)
        if (_deploy.isNotEmpty()) cdkBuilder.deploy(_deploy)
        if (_setup.isNotEmpty()) cdkBuilder.setup(_setup)
        if (_shutdown.isNotEmpty()) cdkBuilder.shutdown(_shutdown)
        if (_undeploy.isNotEmpty()) cdkBuilder.undeploy(_undeploy)
        return cdkBuilder.build()
    }
}
