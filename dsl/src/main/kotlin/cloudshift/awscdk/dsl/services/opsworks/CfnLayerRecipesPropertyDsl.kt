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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opsworks.CfnLayer
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLayerRecipesPropertyDsl {
    private val cdkBuilder: CfnLayer.RecipesProperty.Builder = CfnLayer.RecipesProperty.builder()

    private val _configure: MutableList<String> = mutableListOf()

    private val _deploy: MutableList<String> = mutableListOf()

    private val _setup: MutableList<String> = mutableListOf()

    private val _shutdown: MutableList<String> = mutableListOf()

    private val _undeploy: MutableList<String> = mutableListOf()

    public fun configure(vararg configure: String) {
        _configure.addAll(listOf(*configure))
    }

    public fun configure(configure: Collection<String>) {
        _configure.addAll(configure)
    }

    public fun deploy(vararg deploy: String) {
        _deploy.addAll(listOf(*deploy))
    }

    public fun deploy(deploy: Collection<String>) {
        _deploy.addAll(deploy)
    }

    public fun setup(vararg setup: String) {
        _setup.addAll(listOf(*setup))
    }

    public fun setup(setup: Collection<String>) {
        _setup.addAll(setup)
    }

    public fun shutdown(vararg shutdown: String) {
        _shutdown.addAll(listOf(*shutdown))
    }

    public fun shutdown(shutdown: Collection<String>) {
        _shutdown.addAll(shutdown)
    }

    public fun undeploy(vararg undeploy: String) {
        _undeploy.addAll(listOf(*undeploy))
    }

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
