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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.Hooks

/**
 * Commands to run at predefined points during the integration test workflow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * Hooks hooks = Hooks.builder()
 * .postDeploy(List.of("postDeploy"))
 * .postDestroy(List.of("postDestroy"))
 * .preDeploy(List.of("preDeploy"))
 * .preDestroy(List.of("preDestroy"))
 * .build();
 * ```
 */
@CdkDslMarker
public class HooksDsl {
    private val cdkBuilder: Hooks.Builder = Hooks.builder()

    private val _postDeploy: MutableList<String> = mutableListOf()

    private val _postDestroy: MutableList<String> = mutableListOf()

    private val _preDeploy: MutableList<String> = mutableListOf()

    private val _preDestroy: MutableList<String> = mutableListOf()

    /**
     * @param postDeploy Commands to run prior after deploying the cdk stacks in the integration
     *   test.
     */
    public fun postDeploy(vararg postDeploy: String) {
        _postDeploy.addAll(listOf(*postDeploy))
    }

    /**
     * @param postDeploy Commands to run prior after deploying the cdk stacks in the integration
     *   test.
     */
    public fun postDeploy(postDeploy: Collection<String>) {
        _postDeploy.addAll(postDeploy)
    }

    /**
     * @param postDestroy Commands to run after destroying the cdk stacks in the integration test.
     */
    public fun postDestroy(vararg postDestroy: String) {
        _postDestroy.addAll(listOf(*postDestroy))
    }

    /**
     * @param postDestroy Commands to run after destroying the cdk stacks in the integration test.
     */
    public fun postDestroy(postDestroy: Collection<String>) {
        _postDestroy.addAll(postDestroy)
    }

    /**
     * @param preDeploy Commands to run prior to deploying the cdk stacks in the integration test.
     */
    public fun preDeploy(vararg preDeploy: String) {
        _preDeploy.addAll(listOf(*preDeploy))
    }

    /**
     * @param preDeploy Commands to run prior to deploying the cdk stacks in the integration test.
     */
    public fun preDeploy(preDeploy: Collection<String>) {
        _preDeploy.addAll(preDeploy)
    }

    /**
     * @param preDestroy Commands to run prior to destroying the cdk stacks in the integration test.
     */
    public fun preDestroy(vararg preDestroy: String) {
        _preDestroy.addAll(listOf(*preDestroy))
    }

    /**
     * @param preDestroy Commands to run prior to destroying the cdk stacks in the integration test.
     */
    public fun preDestroy(preDestroy: Collection<String>) {
        _preDestroy.addAll(preDestroy)
    }

    public fun build(): Hooks {
        if (_postDeploy.isNotEmpty()) cdkBuilder.postDeploy(_postDeploy)
        if (_postDestroy.isNotEmpty()) cdkBuilder.postDestroy(_postDestroy)
        if (_preDeploy.isNotEmpty()) cdkBuilder.preDeploy(_preDeploy)
        if (_preDestroy.isNotEmpty()) cdkBuilder.preDestroy(_preDestroy)
        return cdkBuilder.build()
    }
}
