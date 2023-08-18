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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Environment
import software.amazon.awscdk.IPolicyValidationPluginBeta1
import software.amazon.awscdk.PermissionsBoundary
import software.amazon.awscdk.StageProps

/**
 * Initialization props for a stage.
 *
 * Example:
 * ```
 * App app;
 * new Stage(app, "DevStage");
 * Stage.Builder.create(app, "BetaStage")
 * .permissionsBoundary(PermissionsBoundary.fromName("beta-permissions-boundary"))
 * .build();
 * Stage.Builder.create(app, "GammaStage")
 * .permissionsBoundary(PermissionsBoundary.fromName("prod-permissions-boundary"))
 * .build();
 * Stage.Builder.create(app, "ProdStage")
 * .permissionsBoundary(PermissionsBoundary.fromName("prod-permissions-boundary"))
 * .build();
 * ```
 */
@CdkDslMarker
public class StagePropsDsl {
    private val cdkBuilder: StageProps.Builder = StageProps.builder()

    private val _policyValidationBeta1: MutableList<IPolicyValidationPluginBeta1> = mutableListOf()

    /**
     * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`. Stacks
     *   defined inside this `Stage` with either `region` or `account` missing from its env will use
     *   the corresponding field given here.
     *
     * If either `region` or `account`is is not configured for `Stack` (either on the `Stack` itself
     * or on the containing `Stage`), the Stack will be *environment-agnostic*.
     *
     * Environment-agnostic stacks can be deployed to any environment, may not be able to take
     * advantage of all features of the CDK. For example, they will not be able to use environmental
     * context lookups, will not automatically translate Service Principals to the right format
     * based on the environment's AWS partition, and other such enhancements.
     */
    public fun env(env: EnvironmentDsl.() -> Unit = {}) {
        val builder = EnvironmentDsl()
        builder.apply(env)
        cdkBuilder.env(builder.build())
    }

    /**
     * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`. Stacks
     *   defined inside this `Stage` with either `region` or `account` missing from its env will use
     *   the corresponding field given here.
     *
     * If either `region` or `account`is is not configured for `Stack` (either on the `Stack` itself
     * or on the containing `Stage`), the Stack will be *environment-agnostic*.
     *
     * Environment-agnostic stacks can be deployed to any environment, may not be able to take
     * advantage of all features of the CDK. For example, they will not be able to use environmental
     * context lookups, will not automatically translate Service Principals to the right format
     * based on the environment's AWS partition, and other such enhancements.
     */
    public fun env(env: Environment) {
        cdkBuilder.env(env)
    }

    /**
     * @param outdir The output directory into which to emit synthesized artifacts. Can only be
     *   specified if this stage is the root stage (the app). If this is specified and this stage is
     *   nested within another stage, an error will be thrown.
     */
    public fun outdir(outdir: String) {
        cdkBuilder.outdir(outdir)
    }

    /**
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     *   Users created within this Stage.
     */
    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * @param policyValidationBeta1 Validation plugins to run during synthesis. If any plugin
     *   reports any violation, synthesis will be interrupted and the report displayed to the user.
     */
    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1) {
        _policyValidationBeta1.addAll(listOf(*policyValidationBeta1))
    }

    /**
     * @param policyValidationBeta1 Validation plugins to run during synthesis. If any plugin
     *   reports any violation, synthesis will be interrupted and the report displayed to the user.
     */
    public fun policyValidationBeta1(
        policyValidationBeta1: Collection<IPolicyValidationPluginBeta1>
    ) {
        _policyValidationBeta1.addAll(policyValidationBeta1)
    }

    /** @param stageName Name of this stage. */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): StageProps {
        if (_policyValidationBeta1.isNotEmpty())
            cdkBuilder.policyValidationBeta1(_policyValidationBeta1)
        return cdkBuilder.build()
    }
}
